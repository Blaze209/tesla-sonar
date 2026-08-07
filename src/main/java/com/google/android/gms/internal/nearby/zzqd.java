package com.google.android.gms.internal.nearby;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
final class zzqd extends zzqf {
    private final zzqf zza;
    private final String zzb = ":";

    zzqd(zzqf zzqfVar, String str, int i11) {
        this.zza = zzqfVar;
    }

    public final String toString() {
        return this.zza.toString() + ".withSeparator(\"" + this.zzb + "\", 2)";
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    final int zza(byte[] bArr, CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char cCharAt = charSequence.charAt(i11);
            if (this.zzb.indexOf(cCharAt) < 0) {
                sb2.append(cCharAt);
            }
        }
        return this.zza.zza(bArr, sb2);
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    final void zzb(Appendable appendable, byte[] bArr, int i11, int i12) {
        this.zza.zzb(new zzpy(2, appendable, this.zzb), bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    final int zzc(int i11) {
        return this.zza.zzc(i11);
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    final int zzd(int i11) {
        int iZzd = this.zza.zzd(i11);
        return iZzd + (this.zzb.length() * zzqh.zza(Math.max(0, iZzd - 1), 2, RoundingMode.FLOOR));
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    public final zzqf zze(String str, int i11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    final CharSequence zzf(CharSequence charSequence) {
        return this.zza.zzf(charSequence);
    }
}
