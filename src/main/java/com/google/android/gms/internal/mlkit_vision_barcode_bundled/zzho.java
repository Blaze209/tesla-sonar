package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes5.dex */
public final class zzho extends zzeh implements zzfn {
    private static final zzho zzb;
    private int zzd;
    private int zze = -1;

    static {
        zzho zzhoVar = new zzho();
        zzb = zzhoVar;
        zzeh.zzV(zzho.class, zzhoVar);
    }

    private zzho() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i12 == 3) {
            return new zzho();
        }
        zzhi zzhiVar = null;
        if (i12 == 4) {
            return new zzhn(zzhiVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
