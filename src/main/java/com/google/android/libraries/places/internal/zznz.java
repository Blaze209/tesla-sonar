package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zznz extends zzaey implements zzagh {
    private static final zznz zzb;
    private int zzd;
    private long zze;

    static {
        zznz zznzVar = new zznz();
        zzb = zznzVar;
        zzaey.zzI(zznz.class, zznzVar);
    }

    private zznz() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i12 == 3) {
            return new zznz();
        }
        zznk zznkVar = null;
        if (i12 == 4) {
            return new zzny(zznkVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
