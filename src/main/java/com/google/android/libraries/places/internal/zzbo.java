package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbo extends zzaey implements zzagh {
    private static final zzbo zzb;
    private int zzd;
    private int zze;
    private zzafg zzf = zzaey.zzB();
    private zzafg zzg = zzaey.zzB();

    static {
        zzbo zzboVar = new zzbo();
        zzb = zzboVar;
        zzaey.zzI(zzbo.class, zzboVar);
    }

    private zzbo() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001✐\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b✐ဌ\u0000", new Object[]{"zzd", "zzf", zzbt.class, "zzg", zzbw.class, "zze", zzbn.zza});
        }
        if (i12 == 3) {
            return new zzbo();
        }
        zzbl zzblVar = null;
        if (i12 == 4) {
            return new zzbm(zzblVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
