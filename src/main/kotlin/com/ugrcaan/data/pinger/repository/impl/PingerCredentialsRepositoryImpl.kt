package com.ugrcaan.data.pinger.repository.impl

import com.ugrcaan.data.pinger.model.PingerCredentials
import com.ugrcaan.data.pinger.model.PingerInformation
import com.ugrcaan.data.pinger.repository.PingerCredentialsRepository

class PingerCredentialsRepositoryImpl : PingerCredentialsRepository {
    private val pingers = mutableMapOf<Long, PingerCredentials>()

    override suspend fun addCredentials(credentials: PingerCredentials) {
        // implementation for adding credentials to database
    }

    override suspend fun getCredentialsById(pingerId: Long): PingerCredentials? {
        // implementation for retrieving credentials from database by id
        return pingers[pingerId]
    }

    override suspend fun updateCredentials(credentials: PingerCredentials) {
        // implementation for updating credentials in database
    }

    override suspend fun deleteCredentials(credentials: PingerCredentials) {
        // implementation for deleting credentials from database

    }
}