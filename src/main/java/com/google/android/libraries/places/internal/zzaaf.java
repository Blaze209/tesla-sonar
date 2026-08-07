package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzaaf extends zzaey implements zzagh {
    private static final zzafe zzb = new zzaad();
    private static final zzaaf zzd;
    private zzafd zze = zzaey.zzz();

    static {
        zzaaf zzaafVar = new zzaaf();
        zzd = zzaafVar;
        zzaey.zzI(zzaaf.class, zzaafVar);
    }

    private zzaaf() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zze", zzacd.zza});
        }
        if (i12 == 3) {
            return new zzaaf();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzaae(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzd;
    }
}
