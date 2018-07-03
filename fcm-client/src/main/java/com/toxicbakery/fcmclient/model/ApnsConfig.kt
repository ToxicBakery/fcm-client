package com.toxicbakery.fcmclient.model

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ApnsConfig(

        /**
         * HTTP request headers defined in Apple Push Notification Service. Refer to
         * [APNs request headers](https://goo.gl/C6Yhia) for supported headers, e.g. "apns-priority": "10".
         */
        val headers: Map<String, String>? = null,

        /**
         * APNs payload as a JSON object, including both aps dictionary and custom payload. See
         * [Payload Key Reference](https://goo.gl/32Pl5W). If present, it overrides
         * [google.firebase.fcm.v1.Notification.title](https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#Notification.FIELDS.title)
         * and [google.firebase.fcm.v1.Notification.body](https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#Notification.FIELDS.body).
         */
        val payload: Any? = null
)