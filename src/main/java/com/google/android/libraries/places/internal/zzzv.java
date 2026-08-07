package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzzv extends zzaey implements zzagh {
    private static final zzzv zzb;
    private int zzd;
    private zzafg zze = zzaey.zzB();
    private int zzf;
    private int zzg;
    private zzaau zzh;

    static {
        zzzv zzzvVar = new zzzv();
        zzb = zzzvVar;
        zzaey.zzI(zzzv.class, zzzvVar);
    }

    private zzzv() {
    }

    public static zzzu zza() {
        return (zzzu) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzzv zzzvVar, int i11) {
        zzzvVar.zzd |= 2;
        zzzvVar.zzg = 1;
    }

    static /* synthetic */ void zze(zzzv zzzvVar, zzaau zzaauVar) {
        zzaauVar.getClass();
        zzzvVar.zzh = zzaauVar;
        zzzvVar.zzd |= 4;
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzxr.zza, "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzzv();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzzu(zzxcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
