package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzwz extends zzaey implements zzagh {
    private static final zzwz zzb;
    private int zzd;
    private int zze;
    private zzww zzf;
    private zzww zzg;
    private int zzh;
    private zzxb zzi;
    private zzvt zzj;

    static {
        zzwz zzwzVar = new zzwz();
        zzb = zzwzVar;
        zzaey.zzI(zzwz.class, zzwzVar);
    }

    private zzwz() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzd", "zze", zzwx.zza, "zzf", "zzg", "zzh", zzwy.zza, "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new zzwz();
        }
        zzun zzunVar = null;
        if (i12 == 4) {
            return new zzwt(zzunVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
