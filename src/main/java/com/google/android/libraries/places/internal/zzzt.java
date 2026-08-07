package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzzt extends zzaey implements zzagh {
    private static final zzafe zzb = new zzzr();
    private static final zzzt zzd;
    private zzafd zze = zzaey.zzz();

    static {
        zzzt zzztVar = new zzzt();
        zzd = zzztVar;
        zzaey.zzI(zzzt.class, zzztVar);
    }

    private zzzt() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zze", zzxe.zza});
        }
        if (i12 == 3) {
            return new zzzt();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzzs(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzd;
    }
}
