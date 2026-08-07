package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzxx extends zzaey implements zzagh {
    private static final zzxx zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzxx zzxxVar = new zzxx();
        zzb = zzxxVar;
        zzaey.zzI(zzxx.class, zzxxVar);
    }

    private zzxx() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzxx();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzxw(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
