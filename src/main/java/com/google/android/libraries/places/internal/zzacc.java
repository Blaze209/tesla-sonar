package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzacc extends zzaey implements zzagh {
    private static final zzacc zzb;
    private int zzd;
    private int zze;
    private zzabn zzf;

    static {
        zzacc zzaccVar = new zzacc();
        zzb = zzaccVar;
        zzaey.zzI(zzacc.class, zzaccVar);
    }

    private zzacc() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzacb.zza, "zzf"});
        }
        if (i12 == 3) {
            return new zzacc();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzaca(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
