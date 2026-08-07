package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzagq implements zzagd {
    private final zzagg zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzagq(zzagg zzaggVar, String str, Object[] objArr) {
        this.zza = zzaggVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.zzd = i11 | (cCharAt2 << i12);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i13 = i14;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzagd
    public final zzagg zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzagd
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.libraries.places.internal.zzagd
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
