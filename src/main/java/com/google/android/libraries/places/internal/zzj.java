package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzj extends zzaey implements zzagh {
    private static final zzj zzb;
    private int zzd;
    private zzaa zze;
    private int zzf;

    static {
        zzj zzjVar = new zzj();
        zzb = zzjVar;
        zzaey.zzI(zzj.class, zzjVar);
    }

    private zzj() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf", zzi.zza});
        }
        if (i12 == 3) {
            return new zzj();
        }
        zza zzaVar = null;
        if (i12 == 4) {
            return new zzh(zzaVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
