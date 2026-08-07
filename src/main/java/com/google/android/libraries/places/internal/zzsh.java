package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzsh extends zzaey implements zzagh {
    private static final zzsh zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzsh zzshVar = new zzsh();
        zzb = zzshVar;
        zzaey.zzI(zzsh.class, zzshVar);
    }

    private zzsh() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzsh();
        }
        zzqo zzqoVar = null;
        if (i12 == 4) {
            return new zzsg(zzqoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
