package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zznr extends zzaey implements zzagh {
    private static final zznr zzb;
    private int zzd;
    private zzafg zze = zzaey.zzB();
    private int zzf;

    static {
        zznr zznrVar = new zznr();
        zzb = zznrVar;
        zzaey.zzI(zznr.class, zznrVar);
    }

    private zznr() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zzd", "zze", zznm.class, "zzf"});
        }
        if (i12 == 3) {
            return new zznr();
        }
        zznk zznkVar = null;
        if (i12 == 4) {
            return new zznq(zznkVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
