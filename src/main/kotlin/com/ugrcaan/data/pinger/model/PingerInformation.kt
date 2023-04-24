package com.ugrcaan.data.pinger.model

import java.util.*

data class PingerInformation(
    override val pingerId: Long,
    val pingerName: String,
    val pingerSurname: String,
    val pingerBirthdate: Date,
    val pingerProfilePicture: String?,
    val pingerStatus: String?,
    val pingerContacts: List<PingerContact>,
    val pingerMessages: List<PingerMessage>,
    val pingerGroups: List<PingerGroup>,
    val pingerNotifications: PingerNotification,
    val pingerCredentials: PingerCredentials
) : PingerEntity