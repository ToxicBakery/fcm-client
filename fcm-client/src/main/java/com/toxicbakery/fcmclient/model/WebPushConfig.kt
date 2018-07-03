package com.toxicbakery.fcmclient.model

data class WebPushConfig(
        val headers: Map<String, String>? = null,
        val data: Map<String, String>? = null,
        val notification: Any? = null
)