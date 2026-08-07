package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes5.dex */
public class zzlj {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    /* synthetic */ zzlj(byte[] bArr) {
    }

    public static int zzb(int i11) {
        return (i11 >>> 1) ^ (-(i11 & 1));
    }

    public static long zzc(long j11) {
        return (j11 >>> 1) ^ (-(1 & j11));
    }
}
