package com.toxicbakery.fcmclient.model

import com.fasterxml.jackson.annotation.JsonInclude

/**
 * Basic notification template to use across all platforms.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class Notification(

        /**
         * The notification's title.
         */
        val title: String?,

        /**
         * The notification's body text.
         */
        val body: String?
)