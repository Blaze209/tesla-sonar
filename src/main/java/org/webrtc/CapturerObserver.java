package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z11);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
