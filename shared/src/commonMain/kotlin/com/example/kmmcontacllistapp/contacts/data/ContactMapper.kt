package com.example.kmmcontacllistapp.contacts.data

import com.example.kmmcontacllistapp.contacts.domain.Contact
import com.example.kmmcontacllistapp.core.data.ImageStorage
import database.ContactEntity

suspend fun ContactEntity.toContact(imageStorage: ImageStorage): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = imagePath?.let { imageStorage.getImage(it) }
    )
}