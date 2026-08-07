package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class zzmh extends zzmi {
    zzmh(String str, String str2, Character ch2) {
        zzmf zzmfVar = new zzmf(str, str2.toCharArray());
        super(zzmfVar, ch2);
        zzig.zzd(zzmfVar.zzf.length == 64);
    }

    @Override // com.google.android.libraries.places.internal.zzmi, com.google.android.libraries.places.internal.zzmj
    final void zza(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        zzig.zzg(0, i12, bArr.length);
        int i14 = i12;
        while (i14 >= 3) {
            int i15 = i13 + 3;
            int i16 = ((bArr[i13] & 255) << 16) | ((bArr[i13 + 1] & 255) << 8) | (bArr[i13 + 2] & 255);
            appendable.append(this.zzb.zza(i16 >>> 18));
            appendable.append(this.zzb.zza((i16 >>> 12) & 63));
            appendable.append(this.zzb.zza((i16 >>> 6) & 63));
            appendable.append(this.zzb.zza(i16 & 63));
            i14 -= 3;
            i13 = i15;
        }
        if (i13 < i12) {
            zzc(appendable, bArr, i13, i12 - i13);
        }
    }
}
