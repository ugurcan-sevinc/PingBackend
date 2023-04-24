package com.ugrcaan.data.pinger.model

data class PingerCredentials(
    override val pingerId: Long,
    val pingerMail: String,
    val pingerUsername: String,
    val pingerPass: String,
    val pingerPhone: String,
) : PingerEntity










