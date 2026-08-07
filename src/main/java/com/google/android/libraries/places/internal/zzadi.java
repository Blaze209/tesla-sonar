package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzadi extends zzaey implements zzagh {
    private static final zzadi zzb;
    private int zzd;
    private int zze;
    private int zzf = 1;
    private int zzg;
    private int zzh;

    static {
        zzadi zzadiVar = new zzadi();
        zzb = zzadiVar;
        zzaey.zzI(zzadi.class, zzadiVar);
    }

    private zzadi() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", zzadg.zza, "zzf", zzadh.zza, "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzadi();
        }
        zzade zzadeVar = null;
        if (i12 == 4) {
            return new zzadf(zzadeVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
