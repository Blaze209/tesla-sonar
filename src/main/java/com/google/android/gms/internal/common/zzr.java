package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public final class zzr {
    public static void zza(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static int zzb(int i11, int i12, String str) {
        String strZza;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 < 0) {
            strZza = zzx.zza("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        } else {
            if (i12 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 15);
                sb2.append("negative size: ");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            }
            strZza = zzx.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzc(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(zze(i11, i12, "index"));
        }
        return i11;
    }

    public static void zzd(int i11, int i12, int i13) {
        String strZze;
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            if (i11 < 0 || i11 > i13) {
                strZze = zze(i11, i13, "start index");
            } else {
                strZze = (i12 < 0 || i12 > i13) ? zze(i12, i13, "end index") : zzx.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strZze);
        }
    }

    private static String zze(int i11, int i12, String str) {
        if (i11 < 0) {
            return zzx.zza("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return zzx.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }
}
