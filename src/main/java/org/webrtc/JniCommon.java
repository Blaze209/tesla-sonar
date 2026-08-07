package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class JniCommon {
    public static native void nativeAddRef(long j11);

    public static native ByteBuffer nativeAllocateByteBuffer(int i11);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j11);
}
