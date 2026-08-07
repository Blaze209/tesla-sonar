package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzqg extends zzaey implements zzagh {
    private static final zzqg zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzqg zzqgVar = new zzqg();
        zzb = zzqgVar;
        zzaey.zzI(zzqg.class, zzqgVar);
    }

    private zzqg() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzqg();
        }
        zzpz zzpzVar = null;
        if (i12 == 4) {
            return new zzqf(zzpzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
