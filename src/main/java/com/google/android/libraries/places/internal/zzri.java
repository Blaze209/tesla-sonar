package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzri extends zzaey implements zzagh {
    private static final zzri zzb;
    private int zzd;
    private long zze;
    private zzqs zzf;
    private long zzg;
    private int zzh;
    private boolean zzi;

    static {
        zzri zzriVar = new zzri();
        zzb = zzriVar;
        zzaey.zzI(zzri.class, zzriVar);
    }

    private zzri() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zzri();
        }
        zzqo zzqoVar = null;
        if (i12 == 4) {
            return new zzrh(zzqoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
