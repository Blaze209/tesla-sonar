package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzzz extends zzaey implements zzagh {
    private static final zzzz zzb;

    static {
        zzzz zzzzVar = new zzzz();
        zzb = zzzzVar;
        zzaey.zzI(zzzz.class, zzzzVar);
    }

    private zzzz() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        zzxc zzxcVar = null;
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0000", null);
        }
        if (i12 == 3) {
            return new zzzz();
        }
        if (i12 == 4) {
            return new zzzy(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
