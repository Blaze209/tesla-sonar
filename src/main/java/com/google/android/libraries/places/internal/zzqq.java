package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzqq extends zzaey implements zzagh {
    private static final zzqq zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        zzqq zzqqVar = new zzqq();
        zzb = zzqqVar;
        zzaey.zzI(zzqq.class, zzqqVar);
    }

    private zzqq() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzqq();
        }
        zzqo zzqoVar = null;
        if (i12 == 4) {
            return new zzqp(zzqoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
