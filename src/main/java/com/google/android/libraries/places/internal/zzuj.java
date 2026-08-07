package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzuj extends zzaey implements zzagh {
    private static final zzuj zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private long zzg;

    static {
        zzuj zzujVar = new zzuj();
        zzb = zzujVar;
        zzaey.zzI(zzuj.class, zzujVar);
    }

    private zzuj() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", zzui.zza, "zzg"});
        }
        if (i12 == 3) {
            return new zzuj();
        }
        zzug zzugVar = null;
        if (i12 == 4) {
            return new zzuh(zzugVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
