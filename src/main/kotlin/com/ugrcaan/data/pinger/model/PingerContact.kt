package com.ugrcaan.data.pinger.model

data class PingerContact(
    override val pingerId: Long,
    val pingerUsername: String,
    val pingerDisplayName: String,
    val pingerStatus: String?
) : PingerEntity
