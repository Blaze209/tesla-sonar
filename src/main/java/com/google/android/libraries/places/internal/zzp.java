package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzp extends zzaey implements zzagh {
    private static final zzp zzb;
    private int zzd;
    private zzaa zze;
    private int zzf;

    static {
        zzp zzpVar = new zzp();
        zzb = zzpVar;
        zzaey.zzI(zzp.class, zzpVar);
    }

    private zzp() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf", zzo.zza});
        }
        if (i12 == 3) {
            return new zzp();
        }
        zza zzaVar = null;
        if (i12 == 4) {
            return new zzn(zzaVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
