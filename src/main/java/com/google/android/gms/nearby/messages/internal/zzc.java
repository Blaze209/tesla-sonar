package com.google.android.gms.nearby.messages.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class zzc {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    private final byte[] zzb;

    protected zzc(byte[] bArr) {
        this.zzb = bArr;
    }

    public static String zzb(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b11 : bArr) {
            char[] cArr = zza;
            sb2.append(cArr[(b11 >> 4) & 15]);
            sb2.append(cArr[b11 & 15]);
        }
        return sb2.toString();
    }

    public static byte[] zzd(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 + i11;
            bArr[i11] = (byte) ((Character.digit(str.charAt(i12), 16) << 4) + Character.digit(str.charAt(i12 + 1), 16));
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass().isAssignableFrom(getClass())) {
            return Arrays.equals(this.zzb, ((zzc) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzb);
    }

    public String toString() {
        return zzb(this.zzb);
    }

    public final String zza() {
        return zzb(this.zzb);
    }

    public final byte[] zzc() {
        return this.zzb;
    }
}
