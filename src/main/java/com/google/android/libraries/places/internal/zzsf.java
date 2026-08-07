package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzsf extends zzaey implements zzagh {
    private static final zzsf zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private long zzh;

    static {
        zzsf zzsfVar = new zzsf();
        zzb = zzsfVar;
        zzaey.zzI(zzsf.class, zzsfVar);
    }

    private zzsf() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzsf();
        }
        zzqo zzqoVar = null;
        if (i12 == 4) {
            return new zzse(zzqoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
