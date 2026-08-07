package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzwb extends zzaey implements zzagh {
    private static final zzwb zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzwb zzwbVar = new zzwb();
        zzb = zzwbVar;
        zzaey.zzI(zzwb.class, zzwbVar);
    }

    private zzwb() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new zzwb();
        }
        zzun zzunVar = null;
        if (i12 == 4) {
            return new zzwa(zzunVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
