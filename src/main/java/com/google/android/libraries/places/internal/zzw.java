package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzw extends zzaey implements zzagh {
    private static final zzw zzb;
    private int zzd;
    private zzaa zze;

    static {
        zzw zzwVar = new zzw();
        zzb = zzwVar;
        zzaey.zzI(zzw.class, zzwVar);
    }

    private zzw() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i12 == 3) {
            return new zzw();
        }
        zza zzaVar = null;
        if (i12 == 4) {
            return new zzv(zzaVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
