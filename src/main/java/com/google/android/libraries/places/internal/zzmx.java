package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzmx extends zzaey implements zzagh {
    private static final zzmx zzb;
    private int zzd;
    private zznf zze;
    private int zzf;

    static {
        zzmx zzmxVar = new zzmx();
        zzb = zzmxVar;
        zzaey.zzI(zzmx.class, zzmxVar);
    }

    private zzmx() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzmx();
        }
        zzmv zzmvVar = null;
        if (i12 == 4) {
            return new zzmw(zzmvVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
