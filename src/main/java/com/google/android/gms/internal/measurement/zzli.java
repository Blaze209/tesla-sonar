package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes5.dex */
final class zzli extends zzlj {
    private int zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzli(byte[] bArr, int i11, int i12, boolean z11, byte[] bArr2) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i11) {
        int i12 = this.zzd;
        this.zzd = 0;
        int i13 = this.zzb + this.zzc;
        this.zzb = i13;
        if (i13 <= 0) {
            this.zzc = 0;
            return i12;
        }
        this.zzc = i13;
        this.zzb = 0;
        return i12;
    }
}
