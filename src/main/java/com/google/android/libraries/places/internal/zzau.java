package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzau extends zzaey implements zzagh {
    private static final zzau zzb;
    private int zzd;
    private zzbe zze;
    private zzae zzf;
    private zzay zzg;

    static {
        zzau zzauVar = new zzau();
        zzb = zzauVar;
        zzaey.zzI(zzau.class, zzauVar);
    }

    private zzau() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000", new Object[]{"zzd", "zzf", "zzg", "zze"});
        }
        if (i12 == 3) {
            return new zzau();
        }
        zzas zzasVar = null;
        if (i12 == 4) {
            return new zzat(zzasVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
