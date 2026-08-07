package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zznf extends zzaey implements zzagh {
    private static final zznf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zznf zznfVar = new zznf();
        zzb = zznfVar;
        zzaey.zzI(zznf.class, zznfVar);
    }

    private zznf() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new zznf();
        }
        zzmv zzmvVar = null;
        if (i12 == 4) {
            return new zzne(zzmvVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
