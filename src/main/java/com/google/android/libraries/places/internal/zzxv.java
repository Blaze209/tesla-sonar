package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzxv extends zzaey implements zzagh {
    private static final zzxv zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzxv zzxvVar = new zzxv();
        zzb = zzxvVar;
        zzaey.zzI(zzxv.class, zzxvVar);
    }

    private zzxv() {
    }

    public static zzxu zza() {
        return (zzxu) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzxv zzxvVar, int i11) {
        zzxvVar.zzd |= 1;
        zzxvVar.zze = 1;
    }

    static /* synthetic */ void zze(zzxv zzxvVar, int i11) {
        zzxvVar.zzd |= 2;
        zzxvVar.zzf = i11;
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
            return new zzxv();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzxu(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
