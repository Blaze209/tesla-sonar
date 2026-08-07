package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzaax extends zzaey implements zzagh {
    private static final zzaax zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        zzaax zzaaxVar = new zzaax();
        zzb = zzaaxVar;
        zzaey.zzI(zzaax.class, zzaaxVar);
    }

    private zzaax() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\bဌ\u0002", new Object[]{"zzd", "zze", zzaaw.zza, "zzf", "zzg", zzxd.zza});
        }
        if (i12 == 3) {
            return new zzaax();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzaav(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
