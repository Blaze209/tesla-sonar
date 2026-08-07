package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzqz extends zzaey implements zzagh {
    private static final zzqz zzb;
    private int zzd;
    private zzmu zze;
    private long zzf;
    private long zzg;

    static {
        zzqz zzqzVar = new zzqz();
        zzb = zzqzVar;
        zzaey.zzI(zzqz.class, zzqzVar);
    }

    private zzqz() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzqz();
        }
        zzqo zzqoVar = null;
        if (i12 == 4) {
            return new zzqy(zzqoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
