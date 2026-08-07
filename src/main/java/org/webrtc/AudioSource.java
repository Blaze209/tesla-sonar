package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j11) {
        super(j11);
    }

    long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
