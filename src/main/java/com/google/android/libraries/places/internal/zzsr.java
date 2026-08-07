package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzsr extends zzaey implements zzagh {
    private static final zzsr zzb;
    private int zzd;
    private int zze;
    private float zzf;

    static {
        zzsr zzsrVar = new zzsr();
        zzb = zzsrVar;
        zzaey.zzI(zzsr.class, zzsrVar);
    }

    private zzsr() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0010\u0011\u0002\u0000\u0000\u0000\u0010ဌ\u0000\u0011ခ\u0001", new Object[]{"zzd", "zze", zzol.zza, "zzf"});
        }
        if (i12 == 3) {
            return new zzsr();
        }
        zzqo zzqoVar = null;
        if (i12 == 4) {
            return new zzsq(zzqoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
