package com.example.kmmcontacllistapp.di

import com.example.kmmcontacllistapp.contacts.domain.ContactDataSource

expect class AppModule {
    val contactDataSource: ContactDataSource
}