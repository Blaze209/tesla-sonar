package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzabe extends zzaey implements zzagh {
    private static final zzabe zzb;
    private zzafg zzd = zzaey.zzB();

    static {
        zzabe zzabeVar = new zzabe();
        zzb = zzabeVar;
        zzaey.zzI(zzabe.class, zzabeVar);
    }

    private zzabe() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i12 == 3) {
            return new zzabe();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzabd(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
