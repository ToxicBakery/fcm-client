package com.toxicbakery.fcmclient

import com.toxicbakery.fcmclient.model.Message
import java.net.HttpURLConnection
import java.net.URL


class HttpUrlFcmClient(
        private val accessTokenResolver: AccessTokenResolver,
        private val jsonMapper: JsonMapper = JacksonJsonMapper()
) : FcmClient {

    private val accessToken: String
        get() = accessTokenResolver.getOrRefresh()

    private val projectId: String
        get() = accessTokenResolver.getProjectId()

    override fun send(message: Message) {
        getSendConnection(accessToken, projectId)
                .apply { doOutput = true }
                .let { connection ->
                    connection.outputStream.use { stream ->
                        jsonMapper.writeJson(message, stream)
                    }

                    when (connection.responseCode) {
                        200 -> Unit
                        else -> connection.errorStream
                                .bufferedReader()
                                .readText()
                                .let { error -> throw Exception(error) }
                    }

                }
    }

    private fun getSendConnection(accessToken: String, projectId: String): HttpURLConnection {
        return (URL(getFcmSendEndpoint(projectId)).openConnection() as HttpURLConnection)
                .apply {
                    setRequestProperty("Authorization", "Bearer $accessToken")
                    setRequestProperty("Content-Type", "application/json; UTF-8")
                }
    }

    companion object {
        const val FCM_BASE_URL = "https://fcm.googleapis.com"

        fun getFcmSendEndpoint(projectId: String): String =
                "$FCM_BASE_URL/v1/projects/$projectId/messages:send"
    }

}