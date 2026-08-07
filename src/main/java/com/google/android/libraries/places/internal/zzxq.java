package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzxq extends zzaey implements zzagh {
    private static final zzxq zzb;
    private int zzd;
    private int zze;

    static {
        zzxq zzxqVar = new zzxq();
        zzb = zzxqVar;
        zzaey.zzI(zzxq.class, zzxqVar);
    }

    private zzxq() {
    }

    public static zzxp zza() {
        return (zzxp) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzxq zzxqVar, int i11) {
        zzxqVar.zzd |= 1;
        zzxqVar.zze = i11;
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i12 == 3) {
            return new zzxq();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzxp(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
