package com.google.android.gms.internal.nearby;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzqf {
    private static final zzqf zza = new zzqb("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzqf zzb = new zzqb("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzqf zzc = new zzqe("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzqf zzd = new zzqe("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzqf zze = new zzqa("base16()", "0123456789ABCDEF");

    zzqf() {
    }

    public static zzqf zzh() {
        return zze;
    }

    abstract int zza(byte[] bArr, CharSequence charSequence);

    abstract void zzb(Appendable appendable, byte[] bArr, int i11, int i12);

    abstract int zzc(int i11);

    abstract int zzd(int i11);

    public abstract zzqf zze(String str, int i11);

    CharSequence zzf(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i11, int i12) {
        zzpm.zzh(0, i12, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i12));
        try {
            zzb(sb2, bArr, 0, i12);
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzf = zzf(charSequence);
            int iZzc = zzc(charSequenceZzf.length());
            byte[] bArr = new byte[iZzc];
            int iZza = zza(bArr, charSequenceZzf);
            if (iZza == iZzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzqc e11) {
            throw new IllegalArgumentException(e11);
        }
    }
}
