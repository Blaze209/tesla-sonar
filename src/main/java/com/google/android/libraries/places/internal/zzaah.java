package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzaah extends zzaey implements zzagh {
    private static final zzaah zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private boolean zzk;
    private zzafg zzf = zzaey.zzB();
    private String zzj = "";

    static {
        zzaah zzaahVar = new zzaah();
        zzb = zzaahVar;
        zzaey.zzI(zzaah.class, zzaahVar);
    }

    private zzaah() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a\u0003င\u0001\u0004ဌ\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"zzd", "zze", zzya.zza, "zzf", "zzg", "zzh", zzaak.zza, "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new zzaah();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzaag(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
