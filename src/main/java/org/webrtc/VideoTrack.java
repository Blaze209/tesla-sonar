package org.webrtc;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap<VideoSink, Long> sinks;

    public VideoTrack(long j11) {
        super(j11);
        this.sinks = new IdentityHashMap<>();
    }

    private static native void nativeAddSink(long j11, long j12);

    private static native void nativeFreeSink(long j11);

    private static native boolean nativeGetShouldReceive(long j11);

    private static native void nativeRemoveSink(long j11, long j12);

    private static native void nativeSetShouldReceive(long j11, boolean z11);

    private static native long nativeWrapSink(VideoSink videoSink);

    public void addSink(VideoSink videoSink) {
        if (videoSink == null) {
            throw new IllegalArgumentException("The VideoSink is not allowed to be null");
        }
        if (this.sinks.containsKey(videoSink)) {
            return;
        }
        long jNativeWrapSink = nativeWrapSink(videoSink);
        this.sinks.put(videoSink, Long.valueOf(jNativeWrapSink));
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

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(VideoSink videoSink) {
        Long lRemove = this.sinks.remove(videoSink);
        if (lRemove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), lRemove.longValue());
            nativeFreeSink(lRemove.longValue());
        }
    }

    public void setShouldReceive(boolean z11) {
        nativeSetShouldReceive(getNativeMediaStreamTrack(), z11);
    }

    public boolean shouldReceive() {
        return nativeGetShouldReceive(getNativeMediaStreamTrack());
    }
}
