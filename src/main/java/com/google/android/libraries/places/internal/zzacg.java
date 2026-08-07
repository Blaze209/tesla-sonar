package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzacg extends zzaey implements zzagh {
    private static final zzacg zzb;
    private int zzd;
    private long zze;
    private int zzf;

    static {
        zzacg zzacgVar = new zzacg();
        zzb = zzacgVar;
        zzaey.zzI(zzacg.class, zzacgVar);
    }

    private zzacg() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဏ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzacg();
        }
        zzace zzaceVar = null;
        if (i12 == 4) {
            return new zzacf(zzaceVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
