package com.toxicbakery.fcmclient.model

import java.util.*

/**
 * Priority of a message to send to Android devices.
 *
 * @see [AndroidMessagePriority](https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#AndroidMessagePriority)
 */
enum class AndroidMessagePriority {

    /**
     * Default priority for notification messages. FCM attempts to deliver high priority messages immediately, allowing
     * the FCM service to wake a sleeping device when possible and open a network connection to your app server. Apps
     * with instant messaging, chat, or voice call alerts, for example, generally need to open a network connection and
     * make sure FCM delivers the message to the device without delay. Set high priority if the message is time-critical
     * and requires the user's immediate interaction, but beware that setting your messages to high priority contributes
     * more to battery drain compared with normal priority messages.
     */
    HIGH,

    /**
     * Default priority for data messages. Normal priority messages won't open network connections on a sleeping device,
     * and their delivery may be delayed to conserve the battery. For less time-sensitive messages, such as
     * notifications of new email or other data to sync, choose normal delivery priority.
     */
    NORMAL;

    override fun toString(): String {
        return name.toLowerCase(Locale.ENGLISH)
    }
}
