package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzmz extends zzaey implements zzagh {
    private static final zzmz zzb;
    private int zzd;
    private zznd zze;
    private zznb zzf;

    static {
        zzmz zzmzVar = new zzmz();
        zzb = zzmzVar;
        zzaey.zzI(zzmz.class, zzmzVar);
    }

    private zzmz() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzmz();
        }
        zzmv zzmvVar = null;
        if (i12 == 4) {
            return new zzmy(zzmvVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
