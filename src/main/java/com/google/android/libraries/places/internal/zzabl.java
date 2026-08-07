package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzabl extends zzaey implements zzagh {
    private static final zzabl zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzabl zzablVar = new zzabl();
        zzb = zzablVar;
        zzaey.zzI(zzabl.class, zzablVar);
    }

    private zzabl() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", zzxe.zza, "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zzabl();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzabk(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
