package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zztp extends zzaey implements zzagh {
    private static final zztp zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zztp zztpVar = new zztp();
        zzb = zztpVar;
        zzaey.zzI(zztp.class, zztpVar);
    }

    private zztp() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zztt.zza, "zzf"});
        }
        if (i12 == 3) {
            return new zztp();
        }
        zzsu zzsuVar = null;
        if (i12 == 4) {
            return new zzto(zzsuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
