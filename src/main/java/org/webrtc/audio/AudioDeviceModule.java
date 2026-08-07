package org.webrtc.audio;

/* JADX INFO: loaded from: classes10.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z11);

    default boolean setNoiseSuppressorEnabled(boolean z11) {
        return false;
    }

    default boolean setPreferredMicrophoneFieldDimension(float f11) {
        return false;
    }

    void setSpeakerMute(boolean z11);
}
