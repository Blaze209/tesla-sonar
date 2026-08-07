package com.google.android.gms.internal.nearby;

/* JADX INFO: loaded from: classes5.dex */
public final class zzpm {
    public static int zza(int i11, int i12, String str) {
        String strZza;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 < 0) {
            strZza = zzpo.zza("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        } else {
            if (i12 < 0) {
                throw new IllegalArgumentException("negative size: " + i12);
            }
            strZza = zzpo.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(zzi(i11, i12, "index"));
        }
        return i11;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzf(boolean z11, String str, char c11) {
        if (!z11) {
            throw new IllegalArgumentException(zzpo.zza(str, Character.valueOf(c11)));
        }
    }

    public static void zzg(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(zzpo.zza(str, obj));
        }
    }

    public static void zzh(int i11, int i12, int i13) {
        String strZzi;
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            if (i11 < 0 || i11 > i13) {
                strZzi = zzi(i11, i13, "start index");
            } else {
                strZzi = (i12 < 0 || i12 > i13) ? zzi(i12, i13, "end index") : zzpo.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strZzi);
        }
    }

    private static String zzi(int i11, int i12, String str) {
        if (i11 < 0) {
            return zzpo.zza("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return zzpo.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }
}
