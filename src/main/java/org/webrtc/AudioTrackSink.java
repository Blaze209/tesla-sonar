package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public interface AudioTrackSink {
    @CalledByNative
    void onData(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, long j11);
}
