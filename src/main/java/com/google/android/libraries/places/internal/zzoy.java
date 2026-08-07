package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzoy extends zzaey implements zzagh {
    private static final zzoy zzb;
    private int zzd;
    private zzafd zze = zzaey.zzz();
    private zzafd zzf = zzaey.zzz();
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;

    static {
        zzoy zzoyVar = new zzoy();
        zzb = zzoyVar;
        zzaey.zzI(zzoy.class, zzoyVar);
    }

    private zzoy() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0016\u0002\u0016\u0003င\u0000\u0004င\u0001\u0005ဂ\u0002\u0006င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new zzoy();
        }
        zzou zzouVar = null;
        if (i12 == 4) {
            return new zzox(zzouVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
