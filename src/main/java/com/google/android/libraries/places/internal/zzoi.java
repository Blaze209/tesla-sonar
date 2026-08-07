package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzoi extends zzaey implements zzagh {
    private static final zzoi zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzoi zzoiVar = new zzoi();
        zzb = zzoiVar;
        zzaey.zzI(zzoi.class, zzoiVar);
    }

    private zzoi() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"zzd", "zze", zzoh.zza, "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzoi();
        }
        zzod zzodVar = null;
        if (i12 == 4) {
            return new zzog(zzodVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
