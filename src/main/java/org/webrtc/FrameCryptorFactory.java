package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
public class FrameCryptorFactory {
    public static FrameCryptor createFrameCryptorForRtpReceiver(PeerConnectionFactory peerConnectionFactory, RtpReceiver rtpReceiver, String str, FrameCryptorAlgorithm frameCryptorAlgorithm, FrameCryptorKeyProvider frameCryptorKeyProvider) {
        return nativeCreateFrameCryptorForRtpReceiver(peerConnectionFactory.getNativeOwnedFactoryAndThreads(), rtpReceiver.getNativeRtpReceiver(), str, frameCryptorAlgorithm.ordinal(), frameCryptorKeyProvider.getNativeKeyProvider());
    }

    public static FrameCryptor createFrameCryptorForRtpSender(PeerConnectionFactory peerConnectionFactory, RtpSender rtpSender, String str, FrameCryptorAlgorithm frameCryptorAlgorithm, FrameCryptorKeyProvider frameCryptorKeyProvider) {
        return nativeCreateFrameCryptorForRtpSender(peerConnectionFactory.getNativeOwnedFactoryAndThreads(), rtpSender.getNativeRtpSender(), str, frameCryptorAlgorithm.ordinal(), frameCryptorKeyProvider.getNativeKeyProvider());
    }

    public static FrameCryptorKeyProvider createFrameCryptorKeyProvider(boolean z11, byte[] bArr, int i11, byte[] bArr2, int i12, int i13, boolean z12) {
        return nativeCreateFrameCryptorKeyProvider(z11, bArr, i11, bArr2, i12, i13, z12);
    }

    private static native FrameCryptor nativeCreateFrameCryptorForRtpReceiver(long j11, long j12, String str, int i11, long j13);

    private static native FrameCryptor nativeCreateFrameCryptorForRtpSender(long j11, long j12, String str, int i11, long j13);

    private static native FrameCryptorKeyProvider nativeCreateFrameCryptorKeyProvider(boolean z11, byte[] bArr, int i11, byte[] bArr2, int i12, int i13, boolean z12);
}
