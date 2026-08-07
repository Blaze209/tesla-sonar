package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzadd extends zzaey implements zzagh {
    private static final zzadd zzb;
    private int zzd;
    private int zze = 1;
    private int zzf = 1;
    private int zzg;

    static {
        zzadd zzaddVar = new zzadd();
        zzb = zzaddVar;
        zzaey.zzI(zzadd.class, zzaddVar);
    }

    private zzadd() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", zzadc.zza, "zzf", zzadb.zza, "zzg"});
        }
        if (i12 == 3) {
            return new zzadd();
        }
        zzacz zzaczVar = null;
        if (i12 == 4) {
            return new zzada(zzaczVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
