package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes5.dex */
public final class zziz extends zzeh implements zzfn {
    private static final zziz zzb;
    private int zzd;
    private int zze;

    static {
        zziz zzizVar = new zziz();
        zzb = zzizVar;
        zzeh.zzV(zziz.class, zzizVar);
    }

    private zziz() {
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
            return new zziz();
        }
        zzhi zzhiVar = null;
        if (i12 == 4) {
            return new zziy(zzhiVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
