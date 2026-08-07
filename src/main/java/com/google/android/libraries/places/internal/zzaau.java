package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzaau extends zzaey implements zzagh {
    private static final zzaau zzb;
    private zzafg zzd = zzaey.zzB();

    static {
        zzaau zzaauVar = new zzaau();
        zzb = zzaauVar;
        zzaey.zzI(zzaau.class, zzaauVar);
    }

    private zzaau() {
    }

    public static zzaat zza() {
        return (zzaat) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzaau zzaauVar, Iterable iterable) {
        zzafg zzafgVar = zzaauVar.zzd;
        if (!zzafgVar.zzc()) {
            zzaauVar.zzd = zzaey.zzC(zzafgVar);
        }
        zzadq.zzM(iterable, zzaauVar.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i12 == 3) {
            return new zzaau();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzaat(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
