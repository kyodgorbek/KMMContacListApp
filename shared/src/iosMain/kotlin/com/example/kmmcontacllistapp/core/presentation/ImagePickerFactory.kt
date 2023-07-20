package com.example.kmmcontacllistapp.core.presentation

import androidx.compose.runtime.Composable

actual class ImagePickerFactory(
    //private val rootController:UIViewController
) {

    @Composable
    actual fun createPicker(): ImagePicker {
        return ImagePicker()
    }
}
