package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zznd extends zzaey implements zzagh {
    private static final zznd zzb;
    private int zzd;
    private zzmx zze;
    private zznh zzf;
    private zznj zzg;
    private zzqe zzh;
    private int zzi;

    static {
        zznd zzndVar = new zznd();
        zzb = zzndVar;
        zzaey.zzI(zznd.class, zzndVar);
    }

    private zznd() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဋ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zznd();
        }
        zzmv zzmvVar = null;
        if (i12 == 4) {
            return new zznc(zzmvVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
