package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzrk extends zzaey implements zzagh {
    private static final zzrk zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private float zzi;
    private float zzj;

    static {
        zzrk zzrkVar = new zzrk();
        zzb = zzrkVar;
        zzaey.zzI(zzrk.class, zzrkVar);
    }

    private zzrk() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001စ\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new zzrk();
        }
        zzqo zzqoVar = null;
        if (i12 == 4) {
            return new zzrj(zzqoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
