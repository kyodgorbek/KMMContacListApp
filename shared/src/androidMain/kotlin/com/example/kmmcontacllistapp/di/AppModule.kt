package com.example.kmmcontacllistapp.di

import android.content.Context
import com.example.kmmcontacllistapp.contacts.data.SqlDelightContactDataSource
import com.example.kmmcontacllistapp.contacts.domain.ContactDataSource
import com.example.kmmcontacllistapp.core.data.DatabaseDriverFactory
import com.example.kmmcontacllistapp.core.data.ImageStorage
import com.example.kmmcontacllistapp.database.ContactDatabase

actual class AppModule(
    private val context: Context,
) {

    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory(context).create(),
            ),
            imageStorage = ImageStorage(context)
        )
    }
}