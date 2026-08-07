package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbe extends zzaey implements zzagh {
    private static final zzbe zzb;
    private int zzd;
    private double zze = 1.0d;
    private double zzf = 1.0d;

    static {
        zzbe zzbeVar = new zzbe();
        zzb = zzbeVar;
        zzaey.zzI(zzbe.class, zzbeVar);
    }

    private zzbe() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzbe();
        }
        zzbc zzbcVar = null;
        if (i12 == 4) {
            return new zzbd(zzbcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
