package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzacs extends zzaey implements zzagh {
    private static final zzacs zzb;
    private zzafg zzd = zzaey.zzB();

    static {
        zzacs zzacsVar = new zzacs();
        zzb = zzacsVar;
        zzaey.zzI(zzacs.class, zzacsVar);
    }

    private zzacs() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzadd.class});
        }
        if (i12 == 3) {
            return new zzacs();
        }
        zzacq zzacqVar = null;
        if (i12 == 4) {
            return new zzacr(zzacqVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
