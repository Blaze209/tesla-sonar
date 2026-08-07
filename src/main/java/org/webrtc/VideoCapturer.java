package org.webrtc;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i11, int i12, int i13);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i11, int i12, int i13);

    void stopCapture();
}
