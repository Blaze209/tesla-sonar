package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzaal extends zzaey implements zzagh {
    private static final zzaal zzb;
    private int zzd;
    private zzxz zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzaal zzaalVar = new zzaal();
        zzb = zzaalVar;
        zzaey.zzI(zzaal.class, zzaalVar);
    }

    private zzaal() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဌ\u0005\u0007င\u0006\bဌ\u0007", new Object[]{"zzd", "zze", "zzf", zzya.zza, "zzg", zzaak.zza, "zzh", "zzi", "zzj", zzaaj.zza, "zzk", "zzl", zzxd.zza});
        }
        if (i12 == 3) {
            return new zzaal();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzaai(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
