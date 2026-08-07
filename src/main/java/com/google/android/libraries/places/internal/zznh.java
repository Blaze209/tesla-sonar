package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zznh extends zzaey implements zzagh {
    private static final zznh zzb;
    private int zzd;
    private zznf zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zznh zznhVar = new zznh();
        zzb = zznhVar;
        zzaey.zzI(zznh.class, zznhVar);
    }

    private zznh() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zznh();
        }
        zzmv zzmvVar = null;
        if (i12 == 4) {
            return new zzng(zzmvVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
