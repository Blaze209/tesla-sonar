package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzabr extends zzaey implements zzagh {
    private static final zzabr zzb;
    private int zzd;
    private int zze;
    private zzafg zzf = zzaey.zzB();
    private zzafg zzg = zzaey.zzB();

    static {
        zzabr zzabrVar = new zzabr();
        zzb = zzabrVar;
        zzaey.zzI(zzabr.class, zzabrVar);
    }

    private zzabr() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzabt.class});
        }
        if (i12 == 3) {
            return new zzabr();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzabq(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
