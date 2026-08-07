package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class zzmg extends zzmi {
    final char[] zza;

    zzmg(String str, String str2) {
        zzmf zzmfVar = new zzmf("base16()", "0123456789ABCDEF".toCharArray());
        super(zzmfVar, null);
        this.zza = new char[512];
        zzig.zzd(zzmfVar.zzf.length == 16);
        for (int i11 = 0; i11 < 256; i11++) {
            this.zza[i11] = zzmfVar.zza(i11 >>> 4);
            this.zza[i11 | 256] = zzmfVar.zza(i11 & 15);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzmi, com.google.android.libraries.places.internal.zzmj
    final void zza(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
        zzig.zzg(0, i12, bArr.length);
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = bArr[i13] & 255;
            appendable.append(this.zza[i14]);
            appendable.append(this.zza[i14 | 256]);
        }
    }
}
