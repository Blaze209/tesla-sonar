package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzop extends zzaey implements zzagh {
    private static final zzop zzb;
    private int zzd;
    private zzor zzf;
    private zzot zzg;
    private zzadl zzh;
    private byte zzi = 2;
    private int zze = 1;

    static {
        zzop zzopVar = new zzop();
        zzb = zzopVar;
        zzaey.zzI(zzop.class, zzopVar);
    }

    private zzop() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"zzd", "zze", zzoo.zza, "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzop();
        }
        zzom zzomVar = null;
        if (i12 == 4) {
            return new zzon(zzomVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
