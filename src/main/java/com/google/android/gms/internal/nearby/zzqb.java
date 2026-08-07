package com.google.android.gms.internal.nearby;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class zzqb extends zzqe {
    zzqb(String str, String str2, Character ch2) {
        zzpz zzpzVar = new zzpz(str, str2.toCharArray());
        super(zzpzVar, ch2);
        zzpm.zzd(zzpzVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.nearby.zzqe, com.google.android.gms.internal.nearby.zzqf
    final int zza(byte[] bArr, CharSequence charSequence) throws zzqc {
        CharSequence charSequenceZzf = zzf(charSequence);
        if (!this.zzb.zzc(charSequenceZzf.length())) {
            throw new zzqc("Invalid input length " + charSequenceZzf.length());
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceZzf.length()) {
            int i13 = i12 + 1;
            int iZzb = (this.zzb.zzb(charSequenceZzf.charAt(i11)) << 18) | (this.zzb.zzb(charSequenceZzf.charAt(i11 + 1)) << 12);
            bArr[i12] = (byte) (iZzb >>> 16);
            int i14 = i11 + 2;
            if (i14 < charSequenceZzf.length()) {
                int i15 = i11 + 3;
                int iZzb2 = iZzb | (this.zzb.zzb(charSequenceZzf.charAt(i14)) << 6);
                int i16 = i12 + 2;
                bArr[i13] = (byte) ((iZzb2 >>> 8) & 255);
                if (i15 < charSequenceZzf.length()) {
                    i11 += 4;
                    i12 += 3;
                    bArr[i16] = (byte) ((iZzb2 | this.zzb.zzb(charSequenceZzf.charAt(i15))) & 255);
                } else {
                    i12 = i16;
                    i11 = i15;
                }
            } else {
                i11 = i14;
                i12 = i13;
            }
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.nearby.zzqe, com.google.android.gms.internal.nearby.zzqf
    final void zzb(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        zzpm.zzh(0, i12, bArr.length);
        for (int i14 = i12; i14 >= 3; i14 -= 3) {
            int i15 = bArr[i13] & 255;
            int i16 = ((bArr[i13 + 1] & 255) << 8) | (i15 << 16) | (bArr[i13 + 2] & 255);
            appendable.append(this.zzb.zza(i16 >>> 18));
            appendable.append(this.zzb.zza((i16 >>> 12) & 63));
            appendable.append(this.zzb.zza((i16 >>> 6) & 63));
            appendable.append(this.zzb.zza(i16 & 63));
            i13 += 3;
        }
        if (i13 < i12) {
            zzg(appendable, bArr, i13, i12 - i13);
        }
    }
}
