package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zztk extends zzaey implements zzagh {
    private static final zztk zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zztk zztkVar = new zztk();
        zzb = zztkVar;
        zzaey.zzI(zztk.class, zztkVar);
    }

    private zztk() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zztk();
        }
        zzsu zzsuVar = null;
        if (i12 == 4) {
            return new zztj(zzsuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
