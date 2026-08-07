package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzvc extends zzaey implements zzagh {
    private static final zzvc zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzvc zzvcVar = new zzvc();
        zzb = zzvcVar;
        zzaey.zzI(zzvc.class, zzvcVar);
    }

    private zzvc() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဏ\u0001\u0003ဏ\u0002\u0004င\u0003\u0005ဏ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zzvc();
        }
        zzun zzunVar = null;
        if (i12 == 4) {
            return new zzvb(zzunVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
