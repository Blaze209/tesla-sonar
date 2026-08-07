package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzzx extends zzaey implements zzagh {
    private static final zzzx zzb;
    private int zzd;
    private zzpw zze;
    private byte zzf = 2;

    static {
        zzzx zzzxVar = new zzzx();
        zzb = zzzxVar;
        zzaey.zzI(zzzx.class, zzzxVar);
    }

    private zzzx() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i12 == 3) {
            return new zzzx();
        }
        zzxc zzxcVar = null;
        if (i12 == 4) {
            return new zzzw(zzxcVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
