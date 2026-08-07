package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzyk extends zzaey implements zzagh {
    private static final zzyk zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        zzyk zzykVar = new zzyk();
        zzb = zzykVar;
        zzaey.zzI(zzyk.class, zzykVar);
    }

    private zzyk() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzyj.zza});
        }
        if (i12 == 3) {
            return new zzyk();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzyi(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
