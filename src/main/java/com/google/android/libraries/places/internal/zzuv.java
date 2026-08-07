package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzuv extends zzaey implements zzagh {
    private static final zzuv zzb;
    private int zzd;
    private int zze;
    private zzvc zzf;
    private zzup zzg;

    static {
        zzuv zzuvVar = new zzuv();
        zzb = zzuvVar;
        zzaey.zzI(zzuv.class, zzuvVar);
    }

    private zzuv() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzuu.zza, "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzuv();
        }
        zzun zzunVar = null;
        if (i12 == 4) {
            return new zzut(zzunVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
