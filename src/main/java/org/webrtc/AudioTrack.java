package org.webrtc;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class AudioTrack extends MediaStreamTrack {
    private final IdentityHashMap<AudioTrackSink, Long> sinks;

    public AudioTrack(long j11) {
        super(j11);
        this.sinks = new IdentityHashMap<>();
    }

    private static native void nativeAddSink(long j11, long j12);

    private static native void nativeFreeSink(long j11);

    private static native void nativeRemoveSink(long j11, long j12);

    private static native void nativeSetVolume(long j11, double d11);

    private static native long nativeWrapSink(AudioTrackSink audioTrackSink);

    public void addSink(AudioTrackSink audioTrackSink) {
        if (audioTrackSink == null) {
            throw new IllegalArgumentException("The AudioTrackSink is not allowed to be null");
        }
        if (this.sinks.containsKey(audioTrackSink)) {
            return;
        }
        long jNativeWrapSink = nativeWrapSink(audioTrackSink);
        this.sinks.put(audioTrackSink, Long.valueOf(jNativeWrapSink));
        nativeAddSink(getNativeMediaStreamTrack(), jNativeWrapSink);
    }

    @Override // org.webrtc.MediaStreamTrack
    public void dispose() {
        Iterator<Long> it = this.sinks.values().iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            nativeRemoveSink(getNativeMediaStreamTrack(), jLongValue);
            nativeFreeSink(jLongValue);
        }
        this.sinks.clear();
        super.dispose();
    }

    long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(AudioTrackSink audioTrackSink) {
        Long lRemove = this.sinks.remove(audioTrackSink);
        if (lRemove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), lRemove.longValue());
            nativeFreeSink(lRemove.longValue());
        }
    }

    public void setVolume(double d11) {
        nativeSetVolume(getNativeAudioTrack(), d11);
    }
}
