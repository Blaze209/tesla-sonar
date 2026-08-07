package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzado extends zzaey implements zzagh {
    private static final zzado zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzado zzadoVar = new zzado();
        zzb = zzadoVar;
        zzaey.zzI(zzado.class, zzadoVar);
    }

    private zzado() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzado();
        }
        zzadm zzadmVar = null;
        if (i12 == 4) {
            return new zzadn(zzadmVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
