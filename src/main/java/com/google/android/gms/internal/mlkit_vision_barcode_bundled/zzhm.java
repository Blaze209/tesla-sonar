package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes5.dex */
public final class zzhm extends zzeh implements zzfn {
    private static final zzhm zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzhm zzhmVar = new zzhm();
        zzb = zzhmVar;
        zzeh.zzV(zzhm.class, zzhmVar);
    }

    private zzhm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new zzhm();
        }
        zzhi zzhiVar = null;
        if (i12 == 4) {
            return new zzhl(zzhiVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
