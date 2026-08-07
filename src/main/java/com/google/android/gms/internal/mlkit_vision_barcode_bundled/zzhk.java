package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes5.dex */
public final class zzhk extends zzeh implements zzfn {
    private static final zzhk zzb;
    private int zzd;
    private int zze;
    private zzjp zzf;
    private zzjb zzg;
    private zzjd zzh;

    static {
        zzhk zzhkVar = new zzhk();
        zzb = zzhkVar;
        zzeh.zzV(zzhk.class, zzhkVar);
    }

    private zzhk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zzd", "zze", zzij.zza, "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzhk();
        }
        zzhi zzhiVar = null;
        if (i12 == 4) {
            return new zzhj(zzhiVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
