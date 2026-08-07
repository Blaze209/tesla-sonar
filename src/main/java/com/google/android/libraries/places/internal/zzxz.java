package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzxz extends zzaey implements zzagh {
    private static final zzxz zzb;
    private int zzd;
    private zzafd zze = zzaey.zzz();
    private zzafg zzf = zzaey.zzB();
    private String zzg = "";
    private boolean zzh;
    private int zzi;

    static {
        zzxz zzxzVar = new zzxz();
        zzb = zzxzVar;
        zzaey.zzI(zzxz.class, zzxzVar);
    }

    private zzxz() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0016\u0002\u001a\u0003ဈ\u0000\u0004ဇ\u0001\u0005ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zzxz();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzxy(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
