package com.ugrcaan.data.pinger.repository

import com.ugrcaan.data.pinger.model.PingerCredentials

interface PingerCredentialsRepository {
    suspend fun addCredentials(credentials: PingerCredentials)
    suspend fun getCredentialsById(pingerId: Long): PingerCredentials?
    suspend fun updateCredentials(credentials: PingerCredentials)
    suspend fun deleteCredentials(credentials: PingerCredentials)
}