package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzxj extends zzaey implements zzagh {
    private static final zzxj zzb;
    private int zzd;
    private int zze;

    static {
        zzxj zzxjVar = new zzxj();
        zzb = zzxjVar;
        zzaey.zzI(zzxj.class, zzxjVar);
    }

    private zzxj() {
    }

    public static zzxi zza() {
        return (zzxi) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzxj zzxjVar, int i11) {
        zzxjVar.zzd |= 1;
        zzxjVar.zze = i11;
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
            return new zzxj();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzxi(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
