package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzacy extends zzaey implements zzagh {
    private static final zzacy zzb;
    private int zzd;
    private zzado zze;
    private zzado zzf;
    private zzado zzg;

    static {
        zzacy zzacyVar = new zzacy();
        zzb = zzacyVar;
        zzaey.zzI(zzacy.class, zzacyVar);
    }

    private zzacy() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzacy();
        }
        zzacw zzacwVar = null;
        if (i12 == 4) {
            return new zzacx(zzacwVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
