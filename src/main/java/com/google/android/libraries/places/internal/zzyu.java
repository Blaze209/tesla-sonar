package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzyu extends zzaey implements zzagh {
    private static final zzyu zzb;
    private int zzd;
    private int zze;

    static {
        zzyu zzyuVar = new zzyu();
        zzb = zzyuVar;
        zzaey.zzI(zzyu.class, zzyuVar);
    }

    private zzyu() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzyt.zza});
        }
        if (i12 == 3) {
            return new zzyu();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzys(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
