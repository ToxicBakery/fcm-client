package com.toxicbakery.fcmclient.model

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class WebPushConfig(
        val headers: Map<String, String>? = null,
        val data: Map<String, String>? = null,
        val notification: Any? = null
)