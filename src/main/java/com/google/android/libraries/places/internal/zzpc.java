package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzpc extends zzaey implements zzagh {
    private static final zzpc zzb;
    private int zzd;
    private zzoy zze;
    private zzafg zzf = zzaey.zzB();
    private int zzg;
    private int zzh;

    static {
        zzpc zzpcVar = new zzpc();
        zzb = zzpcVar;
        zzaey.zzI(zzpc.class, zzpcVar);
    }

    private zzpc() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzd", "zze", "zzf", zzow.class, "zzg", zzpb.zza, "zzh", zzpa.zza});
        }
        if (i12 == 3) {
            return new zzpc();
        }
        zzou zzouVar = null;
        if (i12 == 4) {
            return new zzoz(zzouVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
