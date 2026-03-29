package com.danielquick.okra

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform