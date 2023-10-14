package com.example

import de.sfuhrm.openssl4j.OpenSSL4JProvider
import java.security.MessageDigest

fun main() {
    val input = byteArrayOf(-128, -128, -128, -128)
    val messageDigest = MessageDigest.getInstance("SHA3-256", OpenSSL4JProvider())
    messageDigest.update(input)
    val digest = messageDigest.digest()
    println(digest)
}