package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzft {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    zzft() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            if (zzb() == zzftVar.zzb() && zzc(zzftVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] bArrZze = zze();
        int i11 = bArrZze[0] & 255;
        for (int i12 = 1; i12 < bArrZze.length; i12++) {
            i11 |= (bArrZze[i12] & 255) << (i12 * 8);
        }
        return i11;
    }

    public final String toString() {
        byte[] bArrZze = zze();
        int length = bArrZze.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b11 : bArrZze) {
            char[] cArr = zza;
            sb2.append(cArr[(b11 >> 4) & 15]);
            sb2.append(cArr[b11 & 15]);
        }
        return sb2.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    abstract boolean zzc(zzft zzftVar);

    public abstract byte[] zzd();

    byte[] zze() {
        throw null;
    }
}
