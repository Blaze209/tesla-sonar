package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes5.dex */
public final class zzjv extends zzed implements zzfn {
    private static final zzjv zzd;
    private byte zze = 2;

    static {
        zzjv zzjvVar = new zzjv();
        zzd = zzjvVar;
        zzeh.zzV(zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    public static zzjv zzf() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zze);
        }
        zzjt zzjtVar = null;
        if (i12 == 2) {
            return zzeh.zzS(zzd, "\u0003\u0000", null);
        }
        if (i12 == 3) {
            return new zzjv();
        }
        if (i12 == 4) {
            return new zzju(zzjtVar);
        }
        if (i12 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
