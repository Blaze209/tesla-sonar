package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzxt extends zzaey implements zzagh {
    private static final zzxt zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzxt zzxtVar = new zzxt();
        zzb = zzxtVar;
        zzaey.zzI(zzxt.class, zzxtVar);
    }

    private zzxt() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzxt();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzxs(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
