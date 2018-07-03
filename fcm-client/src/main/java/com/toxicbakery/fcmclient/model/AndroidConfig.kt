package com.toxicbakery.fcmclient.model

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Android specific options for messages sent through
 * [FCM connection server](https://firebase.google.com/docs/cloud-messaging/server).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class AndroidConfig(

        /**
         * An identifier of a group of messages that can be collapsed, so that only the last message gets sent when
         * delivery can be resumed. A maximum of 4 different collapse keys is allowed at any given time.
         */
        @JsonProperty(value = "collapse_key")
        val collapseKey: String? = null,

        /**
         * Message priority. Can take "normal" and "high" values. For more information, see
         * [Setting the priority of a message](https://goo.gl/GjONJv).
         */
        val priority: AndroidMessagePriority? = null,

        /**
         * How long (in seconds) the message should be kept in FCM storage if the device is offline. The maximum time to
         * live supported is 4 weeks, and the default value is 4 weeks if not set. Set it to 0 if want to send the
         * message immediately. In JSON format, the Duration type is encoded as a string rather than an object, where
         * the string ends in the suffix "s" (indicating seconds) and is preceded by the number of seconds, with
         * nanoseconds expressed as fractional seconds. For example, 3 seconds with 0 nanoseconds should be encoded in
         * JSON format as "3s", while 3 seconds and 1 nanosecond should be expressed in JSON format as "3.000000001s".
         * The ttl will be rounded down to the nearest second.
         *
         * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
         */
        val ttl: String? = null,

        /**
         * Package name of the application where the registration tokens must match in order to receive the message.
         */
        @JsonProperty(value = "restricted_package_name")
        val restrictedPackageName: String? = null,

        /**
         * Arbitrary key/value payload. If present, it will override
         * [google.firebase.fcm.v1.Message.data](https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#Message.FIELDS.data).
         */
        val data: Map<String, String>? = null,

        /**
         * Notification to send to android devices.
         */
        val notification: AndroidNotification? = null
)