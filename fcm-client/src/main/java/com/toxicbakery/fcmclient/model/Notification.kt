package com.toxicbakery.fcmclient.model

/**
 * Basic notification template to use across all platforms.
 */
data class Notification(

        /**
         * The notification's title.
         */
        val title: String,

        /**
         * The notification's body text.
         */
        val body: String
)