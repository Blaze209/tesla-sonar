package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzar extends zzaey implements zzagh {
    private static final zzar zzb;
    private int zzd;
    private zzbe zze;
    private zzae zzf;

    static {
        zzar zzarVar = new zzar();
        zzb = zzarVar;
        zzaey.zzI(zzar.class, zzarVar);
    }

    private zzar() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0000", new Object[]{"zzd", "zzf", "zze"});
        }
        if (i12 == 3) {
            return new zzar();
        }
        zzap zzapVar = null;
        if (i12 == 4) {
            return new zzaq(zzapVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
