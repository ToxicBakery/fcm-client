package com.toxicbakery.fcmclient.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Notification to send to android devices.
 * @see [AndroidNotification](https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#AndroidNotification)
 */
data class AndroidNotification(

        /**
         * The notification's title. If present, it will override
         * [google.firebase.fcm.v1.Notification.title](https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#Notification.FIELDS.title).
         */
        val title: String? = null,

        /**
         * The notification's body text. If present, it will override
         * [google.firebase.fcm.v1.Notification.body](https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#Notification.FIELDS.body).
         */
        val body: String? = null,

        /**
         * The notification's icon. Sets the notification icon to myicon for drawable resource myicon. If you don't send
         * this key in the request, FCM displays the launcher icon specified in your app manifest.
         */
        val icon: String? = null,

        /**
         * The notification's icon color, expressed in #rrggbb format.
         */
        val color: String? = null,

        /**
         * The sound to play when the device receives the notification. Supports "default" or the filename of a sound
         * resource bundled in the app. Sound files must reside in /res/raw/.
         */
        val sound: String? = null,

        /**
         * Identifier used to replace existing notifications in the notification drawer. If not specified, each request
         * creates a new notification. If specified and a notification with the same tag is already being shown, the new
         * notification replaces the existing one in the notification drawer.
         */
        val tag: String? = null,

        /**
         * The action associated with a user click on the notification. If specified, an activity with a matching intent
         * filter is launched when a user clicks on the notification.
         */
        @JsonProperty(value = "click_action")
        val clickAction: String? = null,

        /**
         * The key to the body string in the app's string resources to use to localize the body text to the user's
         * current localization. See [String Resources](https://goo.gl/NdFZGI) for more information.
         */
        @JsonProperty(value = "body_loc_key")
        val bodyLocKey: String? = null,

        /**
         * Variable string values to be used in place of the format specifiers in body_loc_key to use to localize the
         * body text to the user's current localization. See [Formatting and Styling](https://goo.gl/MalYE3) for more
         * information.
         */
        @JsonProperty(value = "body_loc_args")
        val bodyLocArgs: String? = null,

        /**
         * The key to the title string in the app's string resources to use to localize the title text to the user's
         * current localization. See [String Resources](https://goo.gl/NdFZGI) for more information.
         */
        @JsonProperty(value = "title_loc_key")
        val titleLocKey: String? = null,

        /**
         * Variable string values to be used in place of the format specifiers in title_loc_key to use to localize the
         * title text to the user's current localization. See [Formatting and Styling](https://goo.gl/MalYE3) for more
         * information.
         */
        @JsonProperty(value = "title_loc_args")
        val titleLocArgs: String? = null
)