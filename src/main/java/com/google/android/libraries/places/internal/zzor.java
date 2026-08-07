package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzor extends zzaey implements zzagh {
    private static final zzor zzb;
    private int zzd;
    private int zze;
    private zzmu zzf;

    static {
        zzor zzorVar = new zzor();
        zzb = zzorVar;
        zzaey.zzI(zzor.class, zzorVar);
    }

    private zzor() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzor();
        }
        zzom zzomVar = null;
        if (i12 == 4) {
            return new zzoq(zzomVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
