package com.toxicbakery.fcmclient

import com.toxicbakery.fcmclient.model.Message

interface FcmClient {

    fun send(message: Message)

}