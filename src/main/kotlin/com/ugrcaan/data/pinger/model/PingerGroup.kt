package com.ugrcaan.data.pinger.model

data class PingerGroup(
    override val pingerId: Long,
    val pingerGroupId: Long,
    val pingerGroupName: String,
    val pingerDescription: String,
    val pingerMembers: List<String>
) : PingerEntity