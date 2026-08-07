package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzzi extends zzaey implements zzagh {
    private static final zzzi zzb;
    private int zzd;
    private int zze;

    static {
        zzzi zzziVar = new zzzi();
        zzb = zzziVar;
        zzaey.zzI(zzzi.class, zzziVar);
    }

    private zzzi() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzxe.zza});
        }
        if (i12 == 3) {
            return new zzzi();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzzh(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
