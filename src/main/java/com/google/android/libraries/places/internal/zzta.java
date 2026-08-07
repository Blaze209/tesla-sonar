package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzta extends zzaey implements zzagh {
    private static final zzta zzb;
    private int zzd;
    private int zzf;
    private String zze = "";
    private zzafg zzg = zzaey.zzB();

    static {
        zzta zztaVar = new zzta();
        zzb = zztaVar;
        zzaey.zzI(zzta.class, zztaVar);
    }

    private zzta() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzsz.class});
        }
        if (i12 == 3) {
            return new zzta();
        }
        zzsu zzsuVar = null;
        if (i12 == 4) {
            return new zzsx(zzsuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
