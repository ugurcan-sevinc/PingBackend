package com.ugrcaan.data.pinger.model

data class PingerNotification(
    override val pingerId: Long,
    val pingerSoundPreference: Boolean,
    val pingerVibrationPreference: Boolean
) : PingerEntity
