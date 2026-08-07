package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes5.dex */
public final class zzhw extends zzeh implements zzfn {
    private static final zzhw zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        zzhw zzhwVar = new zzhw();
        zzb = zzhwVar;
        zzeh.zzV(zzhw.class, zzhwVar);
    }

    private zzhw() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", zzhv.zza, "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new zzhw();
        }
        zzhi zzhiVar = null;
        if (i12 == 4) {
            return new zzhu(zzhiVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
