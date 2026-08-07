package com.google.android.gms.internal.nearby;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class zzqa extends zzqe {
    final char[] zza;

    zzqa(String str, String str2) {
        zzpz zzpzVar = new zzpz("base16()", "0123456789ABCDEF".toCharArray());
        super(zzpzVar, null);
        this.zza = new char[512];
        zzpm.zzd(zzpzVar.zzf.length == 16);
        for (int i11 = 0; i11 < 256; i11++) {
            this.zza[i11] = zzpzVar.zza(i11 >>> 4);
            this.zza[i11 | 256] = zzpzVar.zza(i11 & 15);
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzqe, com.google.android.gms.internal.nearby.zzqf
    final int zza(byte[] bArr, CharSequence charSequence) throws zzqc {
        if (charSequence.length() % 2 == 1) {
            throw new zzqc("Invalid input length " + charSequence.length());
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            bArr[i12] = (byte) ((this.zzb.zzb(charSequence.charAt(i11)) << 4) | this.zzb.zzb(charSequence.charAt(i11 + 1)));
            i11 += 2;
            i12++;
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.nearby.zzqe, com.google.android.gms.internal.nearby.zzqf
    final void zzb(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
        zzpm.zzh(0, i12, bArr.length);
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = bArr[i13] & 255;
            appendable.append(this.zza[i14]);
            appendable.append(this.zza[i14 | 256]);
        }
    }
}
