package com.ugrcaan.data.pinger.service

import com.ugrcaan.data.pinger.model.PingerNotification
import com.ugrcaan.data.pinger.repository.PingerNotificationRepository

class PingerNotificationService(private val notificationRepository: PingerNotificationRepository) {

    suspend fun addNotification(notification: PingerNotification) {
        notificationRepository.addNotification(notification)
    }

    suspend fun getNotificationById(pingerId: Long): PingerNotification? {
        return notificationRepository.getNotificationById(pingerId)
    }

    suspend fun updateNotification(notification: PingerNotification) {
        notificationRepository.updateNotification(notification)
    }

    suspend fun deleteNotification(notification: PingerNotification) {
        notificationRepository.deleteNotification(notification)
    }
}
