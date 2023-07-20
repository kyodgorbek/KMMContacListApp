package com.example.kmmcontacllistapp.core.data

actual class ImageStorage {
    actual suspend fun saveImage(bytes: ByteArray): String {
        return saveImage(bytes)
    }

    actual suspend fun getImage(fileName: String): ByteArray? {
        return getImage(fileName)
    }

    actual suspend fun deleteImage(fileName: String) {
    }
}