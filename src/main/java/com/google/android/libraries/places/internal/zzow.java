package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzow extends zzaey implements zzagh {
    private static final zzow zzb;
    private int zzd;
    private boolean zze;
    private long zzf;
    private zzmu zzg;
    private int zzh;

    static {
        zzow zzowVar = new zzow();
        zzb = zzowVar;
        zzaey.zzI(zzow.class, zzowVar);
    }

    private zzow() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzow();
        }
        zzou zzouVar = null;
        if (i12 == 4) {
            return new zzov(zzouVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
