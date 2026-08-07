package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzsk extends zzaey implements zzagh {
    private static final zzsk zzb;
    private int zzd;
    private int zze;
    private zzafg zzf = zzaey.zzB();

    static {
        zzsk zzskVar = new zzsk();
        zzb = zzskVar;
        zzaey.zzI(zzsk.class, zzskVar);
    }

    private zzsk() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", zzsj.zza, "zzf", zzsh.class});
        }
        if (i12 == 3) {
            return new zzsk();
        }
        zzqo zzqoVar = null;
        if (i12 == 4) {
            return new zzsi(zzqoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
