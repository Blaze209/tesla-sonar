package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzaef extends zzaeh {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzaef(byte[] bArr, int i11, int i12, boolean z11, zzaee zzaeeVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i11) {
        int i12 = this.zze;
        this.zze = 0;
        int i13 = this.zzc + this.zzd;
        this.zzc = i13;
        if (i13 <= 0) {
            this.zzd = 0;
            return i12;
        }
        this.zzd = i13;
        this.zzc = 0;
        return i12;
    }
}
