package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzc extends zzaey implements zzagh {
    private static final zzc zzb;
    private int zzd;
    private zzbe zze;
    private zzae zzf;
    private zzj zzg;
    private zzl zzh;
    private zzg zzi;
    private zzs zzj;
    private zze zzk;
    private zzp zzl;
    private zzw zzm;
    private zzu zzn;

    static {
        zzc zzcVar = new zzc();
        zzb = zzcVar;
        zzaey.zzI(zzc.class, zzcVar);
    }

    private zzc() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\tဉ\t\nဉ\u0000", new Object[]{"zzd", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zze"});
        }
        if (i12 == 3) {
            return new zzc();
        }
        zza zzaVar = null;
        if (i12 == 4) {
            return new zzb(zzaVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
