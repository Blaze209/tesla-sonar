package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzaan extends zzaey implements zzagh {
    private static final zzaan zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private zzafg zze = zzaey.zzB();
    private String zzg = "";

    static {
        zzaan zzaanVar = new zzaan();
        zzb = zzaanVar;
        zzaey.zzI(zzaan.class, zzaanVar);
    }

    private zzaan() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"zzd", "zze", "zzf", zzaak.zza, "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzaan();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzaam(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
