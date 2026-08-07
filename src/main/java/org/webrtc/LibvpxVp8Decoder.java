package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    static native long nativeCreateDecoder(long j11);

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long j11) {
        return nativeCreateDecoder(j11);
    }
}
