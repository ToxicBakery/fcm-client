package com.toxicbakery.fcmclient.model

data class Message(

        /**
         * Output Only. The identifier of the message sent.
         */
        val name: String? = null,

        /**
         * Input only. Arbitrary key/value payload.
         */
        val data: Map<String, String>? = null,

        /**
         * Input only. Basic notification template to use across all platforms.
         */
        val notification: Notification? = null,

        /**
         * Input only. Android specific options for messages sent through
         * [FCM connection server](https://goo.gl/4GLdUl).
         */
        val android: AndroidConfig? = null,

        /**
         * Input only. [Webpush protocol](https://tools.ietf.org/html/rfc8030) options.
         */
        val webPush: WebPushConfig? = null,

        /**
         * Input only. [Apple Push Notification Service](https://goo.gl/MXRTPa) specific options.
         */
        val apns: ApnsConfig? = null,

        /**
         * Registration token to send a message to.
         */
        val token: String? = null,

        /**
         * Topic name to send a message to, e.g. "weather". Note: "/topics/" prefix should not be provided.
         */
        val topic: String? = null,

        /**
         * Condition to send a message to, e.g. "'foo' in topics && 'bar' in topics".
         */
        val condition: String? = null
)