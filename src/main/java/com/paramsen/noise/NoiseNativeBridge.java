package com.paramsen.noise;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0012\u0010\bJ\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u0013\u0010\u000bJ(\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/paramsen/noise/NoiseNativeBridge;", "", "<init>", "()V", "", "inputLength", "", "realConfig", "(I)J", "cfgPointer", "realConfigDispose", "(J)J", "", "in", "out", "Ljn0/h0;", "real", "([F[FJ)V", "imaginaryConfig", "imaginaryConfigDispose", "imaginary", "noise_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NoiseNativeBridge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NoiseNativeBridge f46179a = new NoiseNativeBridge();

    static {
        System.loadLibrary("noise");
    }

    private NoiseNativeBridge() {
    }

    public final native void imaginary(float[] in2, float[] out, long cfgPointer);

    public final native long imaginaryConfig(int inputLength);

    public final native long imaginaryConfigDispose(long cfgPointer);

    public final native void real(float[] in2, float[] out, long cfgPointer);

    public final native long realConfig(int inputLength);

    public final native long realConfigDispose(long cfgPointer);
}
