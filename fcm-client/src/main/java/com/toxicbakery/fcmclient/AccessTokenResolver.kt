package com.toxicbakery.fcmclient

interface AccessTokenResolver {

    fun getOrRefresh(): String

    fun getProjectId(): String

}