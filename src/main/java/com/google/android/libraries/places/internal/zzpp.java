package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzpp extends zzaey implements zzagh {
    private static final zzpp zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzpp zzppVar = new zzpp();
        zzb = zzppVar;
        zzaey.zzI(zzpp.class, zzppVar);
    }

    private zzpp() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"zzf", "zze", "zzd", zzpt.class, zzpn.class, zzpr.class});
        }
        if (i12 == 3) {
            return new zzpp();
        }
        zzpl zzplVar = null;
        if (i12 == 4) {
            return new zzpo(zzplVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
