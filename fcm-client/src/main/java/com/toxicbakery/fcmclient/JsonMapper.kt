package com.toxicbakery.fcmclient

import java.io.InputStream
import java.io.OutputStream

interface JsonMapper {

    fun <T> readJson(inputStream: InputStream, clazz: Class<T>): T

    fun <T> writeJson(value: T, outputStream: OutputStream)

}