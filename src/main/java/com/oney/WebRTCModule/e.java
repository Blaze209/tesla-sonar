package com.oney.WebRTCModule;

import android.util.Log;
import org.webrtc.CameraVideoCapturer;

/* JADX INFO: loaded from: classes6.dex */
class e implements CameraVideoCapturer.CameraEventsHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45908a = WebRTCModule.TAG;

    e() {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraClosed() {
        Log.d(f45908a, "CameraEventsHandler.onCameraClosed");
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraDisconnected() {
        Log.d(f45908a, "CameraEventsHandler.onCameraDisconnected");
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraError(String str) {
        Log.d(f45908a, "CameraEventsHandler.onCameraError: errorDescription=" + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraFreezed(String str) {
        Log.d(f45908a, "CameraEventsHandler.onCameraFreezed: errorDescription=" + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String str) {
        Log.d(f45908a, "CameraEventsHandler.onCameraOpening: cameraName=" + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onFirstFrameAvailable() {
        Log.d(f45908a, "CameraEventsHandler.onFirstFrameAvailable");
    }
}
