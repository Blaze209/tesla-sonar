package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzvj extends zzaey implements zzagh {
    private static final zzvj zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzvj zzvjVar = new zzvj();
        zzb = zzvjVar;
        zzaey.zzI(zzvj.class, zzvjVar);
    }

    private zzvj() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", zzvh.zza, "zzf", zzvi.zza, "zzg", zzvk.zza, "zzh"});
        }
        if (i12 == 3) {
            return new zzvj();
        }
        zzun zzunVar = null;
        if (i12 == 4) {
            return new zzvg(zzunVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
