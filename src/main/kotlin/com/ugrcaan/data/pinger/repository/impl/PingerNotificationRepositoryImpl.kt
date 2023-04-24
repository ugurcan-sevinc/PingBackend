package com.ugrcaan.data.pinger.repository.impl

import com.ugrcaan.data.pinger.model.PingerCredentials
import com.ugrcaan.data.pinger.model.PingerNotification
import com.ugrcaan.data.pinger.repository.PingerNotificationRepository

class PingerNotificationRepositoryImpl : PingerNotificationRepository {

    private val pingers = mutableMapOf<Long, PingerNotification>()

    override suspend fun addNotification(notification: PingerNotification) {
        // implementation for adding notification to database
    }

    override suspend fun getNotificationById(pingerId: Long): PingerNotification? {
        // implementation for retrieving notification from database by id
        return pingers[pingerId]
    }

    override suspend fun updateNotification(notification: PingerNotification) {
        // implementation for updating notification in database
    }

    override suspend fun deleteNotification(notification: PingerNotification) {
        // implementation for deleting notification from database
    }
}
