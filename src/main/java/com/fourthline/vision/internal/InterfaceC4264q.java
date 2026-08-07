package com.fourthline.vision.internal;

import androidx.camera.view.PreviewView;
import androidx.p003lifecycle.LifecycleOwner;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4264q {
    void bindToPreview(PreviewView previewView, LifecycleOwner lifecycleOwner, androidx.camera.core.f.a aVar);

    r getCoordinates();

    int getVideoRecordingBitrate();

    Z5 recordVideo();

    void setVideoRecordingBitrate(int i11);

    Object takePicture(Continuation<? super C4236m> continuation);
}
