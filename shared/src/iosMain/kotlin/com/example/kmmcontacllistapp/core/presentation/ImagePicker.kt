package com.example.kmmcontacllistapp.core.presentation

import androidx.compose.runtime.Composable

actual class ImagePicker(
    //private val rootController:UIViewController
) {
//    private val imagePicker:ImagePickerController = UIImagePickerController.apply{
//        sourceType = UIImagePickerControllerSourceType.
//                UIImagePickerControllerSourceTypePhotoLibrary
//    }

    private var onImagePicked: (ByteArray) -> Unit = {}
//    private val delegate = object : NSObject(), UIImagePickerControllerDelegateProtocol,
    // UINavigationControllerDelegateProtocol{
    // override fun imagePickerProtocol(
    // picker: UIImagePickerController,
    // didFinishPickingImage:UIImage,
    //editingInfo:Map<Any?,  *>?
    // ){
    // val imageNsData = UIImageJPEGRepresentation(didFinishPickingImage, 1.0) ?: return
    // val bytes = ByteArray(imageNsData?.length.toInt())
    // memcpy(bytes.refTo(0), imageNSData.bytes, imageNsData.length()
    // onImagePicked(bytes)
    // picker.dismissViewControllerAnimated(true, null)
    //
    // override fun imagePickerControllerDidCancel(picker:UIImagePickerController){
    // picker.dismissViewControllerAnimated(true, null)
    // }
    //
    //
    // }


    @Composable
    actual fun registerPicker(onImagePicked: (ByteArray) -> Unit) {
        this.onImagePicked = onImagePicked
    }

    actual fun pickImage() {
        // rootController.presentViewController(imagePickerController, true){
        // imagePickerController.delegate = delegate
        // }
    }
}