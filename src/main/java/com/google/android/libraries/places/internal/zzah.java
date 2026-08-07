package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzah extends zzaey implements zzagh {
    private static final zzah zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private zzafg zzk = zzaey.zzB();
    private zzafg zzl = zzaey.zzB();
    private zzafg zzm = zzaey.zzB();
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;

    static {
        zzah zzahVar = new zzah();
        zzb = zzahVar;
        zzaey.zzI(zzah.class, zzahVar);
    }

    private zzah() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0003\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007\u001a\b\u001b\t\u001b\nင\u0006\u000bဂ\u000b\fင\n\rင\u0007\u000eင\b\u000fင\t", new Object[]{"zzd", "zze", zzao.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzan.class, "zzm", zzan.class, "zzn", "zzs", "zzr", "zzo", "zzp", "zzq"});
        }
        if (i12 == 3) {
            return new zzah();
        }
        zzaf zzafVar = null;
        if (i12 == 4) {
            return new zzag(zzafVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
