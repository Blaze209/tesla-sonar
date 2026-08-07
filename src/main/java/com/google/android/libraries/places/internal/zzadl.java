package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzadl extends zzaey implements zzagh {
    private static final zzadl zzb;
    private int zzd;
    private int zze;
    private zzacp zzf;
    private zzacp zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzacp zzn;
    private zzacs zzo;
    private zzacy zzp;
    private int zzq;
    private int zzr;
    private zzacv zzs;
    private byte zzt = 2;
    private zzafg zzh = zzaey.zzB();

    static {
        zzadl zzadlVar = new zzadl();
        zzb = zzadlVar;
        zzaey.zzI(zzadl.class, zzadlVar);
    }

    private zzadl() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u000f\u0000\u0001\u0002\u0010\u000f\u0000\u0001\u0001\u0002ᔄ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006င\u0003\u0007င\u0004\bင\u0005\tင\u0006\nင\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eင\u000b\u000fင\f\u0010ဉ\r", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzadi.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i12 == 3) {
            return new zzadl();
        }
        zzadj zzadjVar = null;
        if (i12 == 4) {
            return new zzadk(zzadjVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzt = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
