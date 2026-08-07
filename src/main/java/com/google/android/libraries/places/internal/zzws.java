package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzws extends zzaey implements zzagh {
    private static final zzws zzb;
    private int zzd;
    private int zze;

    static {
        zzws zzwsVar = new zzws();
        zzb = zzwsVar;
        zzaey.zzI(zzws.class, zzwsVar);
    }

    private zzws() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzwr.zza});
        }
        if (i12 == 3) {
            return new zzws();
        }
        zzun zzunVar = null;
        if (i12 == 4) {
            return new zzwq(zzunVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
