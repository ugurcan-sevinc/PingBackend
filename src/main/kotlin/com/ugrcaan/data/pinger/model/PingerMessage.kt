package com.ugrcaan.data.pinger.model

import java.util.*

data class PingerMessage(
    override val pingerId: Long,
    val pingerMessageId: Long,
    val pingerSender: String,
    val pingerReceiver: String,
    val pingerContent: String,
    val pingerTimestamp: Date
) : PingerEntity
