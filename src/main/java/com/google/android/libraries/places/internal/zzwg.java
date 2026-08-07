package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzwg extends zzaey implements zzagh {
    private static final zzwg zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzwg zzwgVar = new zzwg();
        zzb = zzwgVar;
        zzaey.zzI(zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzwg();
        }
        zzun zzunVar = null;
        if (i12 == 4) {
            return new zzwf(zzunVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
