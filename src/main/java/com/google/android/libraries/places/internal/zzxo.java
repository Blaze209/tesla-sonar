package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzxo extends zzaey implements zzagh {
    private static final zzafe zzb = new zzxl();
    private static final zzxo zzd;
    private int zze;
    private zzafd zzf = zzaey.zzz();
    private int zzg;

    static {
        zzxo zzxoVar = new zzxo();
        zzd = zzxoVar;
        zzaey.zzI(zzxo.class, zzxoVar);
    }

    private zzxo() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002င\u0000", new Object[]{"zze", "zzf", zzxm.zza, "zzg"});
        }
        if (i12 == 3) {
            return new zzxo();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzxn(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzd;
    }
}
