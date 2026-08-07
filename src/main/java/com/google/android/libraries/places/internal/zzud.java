package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzud extends zzaey implements zzagh {
    private static final zzud zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        zzud zzudVar = new zzud();
        zzb = zzudVar;
        zzaey.zzI(zzud.class, zzudVar);
    }

    private zzud() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", zzuc.zza, "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzud();
        }
        zzsu zzsuVar = null;
        if (i12 == 4) {
            return new zzub(zzsuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
