package com.ugrcaan.data.pinger.repository

import com.ugrcaan.data.pinger.model.PingerNotification

interface PingerNotificationRepository {
    suspend fun addNotification(notification: PingerNotification)
    suspend fun getNotificationById(pingerId: Long): PingerNotification?
    suspend fun updateNotification(notification: PingerNotification)
    suspend fun deleteNotification(notification: PingerNotification)
}