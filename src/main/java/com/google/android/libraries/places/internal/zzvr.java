package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzvr extends zzaey implements zzagh {
    private static final zzvr zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzwp zzi;
    private zzvz zzj;
    private zzwn zzk;
    private int zzl;
    private int zzm;

    static {
        zzvr zzvrVar = new zzvr();
        zzb = zzvrVar;
        zzaey.zzI(zzvr.class, zzvrVar);
    }

    private zzvr() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဌ\u0007\tဌ\b", new Object[]{"zzd", "zze", zzvo.zza, "zzf", zzvq.zza, "zzg", "zzh", zzvn.zza, "zzi", "zzj", "zzk", "zzl", zzvl.zza, "zzm", zzvp.zza});
        }
        if (i12 == 3) {
            return new zzvr();
        }
        zzun zzunVar = null;
        if (i12 == 4) {
            return new zzvm(zzunVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
