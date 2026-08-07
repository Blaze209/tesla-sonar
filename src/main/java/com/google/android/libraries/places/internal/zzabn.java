package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzabn extends zzaey implements zzagh {
    private static final zzabn zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzabn zzabnVar = new zzabn();
        zzb = zzabnVar;
        zzaey.zzI(zzabn.class, zzabnVar);
    }

    private zzabn() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzabn();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzabm(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
