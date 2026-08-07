package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzxb extends zzaey implements zzagh {
    private static final zzxb zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzxb zzxbVar = new zzxb();
        zzb = zzxbVar;
        zzaey.zzI(zzxb.class, zzxbVar);
    }

    private zzxb() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzxb();
        }
        zzun zzunVar = null;
        if (i12 == 4) {
            return new zzxa(zzunVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
