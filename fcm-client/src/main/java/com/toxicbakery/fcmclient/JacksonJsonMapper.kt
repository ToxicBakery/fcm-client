package com.toxicbakery.fcmclient

import com.fasterxml.jackson.databind.ObjectMapper
import java.io.InputStream
import java.io.OutputStream

class JacksonJsonMapper : JsonMapper {

    private val objectMapper: ObjectMapper = ObjectMapper()

    override fun <T> readJson(inputStream: InputStream, clazz: Class<T>): T =
            objectMapper.readValue(inputStream, clazz)

    override fun <T> writeJson(value: T, outputStream: OutputStream) =
            objectMapper.writeValue(outputStream, value)

}