package com.toxicbakery.fcmclient

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import java.io.InputStream

class GoogleServiceAccountResolver(
        serviceAccountStream: InputStream
) : AccessTokenResolver {

    private val googleCredential = GoogleCredential
            .fromStream(serviceAccountStream)
            .createScoped(listOf("https://www.googleapis.com/auth/firebase.messaging"))

    override fun getOrRefresh(): String {
        if (googleCredential.expiresInSeconds < 60) {
            googleCredential.refreshToken
        }
        return googleCredential.accessToken
    }

}