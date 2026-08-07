package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzyw extends zzaey implements zzagh {
    private static final zzyw zzb;
    private int zzd;
    private zzpw zzf;
    private byte zzk = 2;
    private String zze = "";
    private String zzg = "";
    private zzafg zzh = zzaey.zzB();
    private String zzi = "";
    private String zzj = "";

    static {
        zzyw zzywVar = new zzyw();
        zzb = zzywVar;
        zzaey.zzI(zzyw.class, zzywVar);
    }

    private zzyw() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new zzyw();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzyv(zzxcVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
