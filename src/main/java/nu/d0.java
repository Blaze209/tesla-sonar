package nu;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 extends zzeh implements zzfn {
    private static final d0 zzb;

    static {
        d0 d0Var = new d0();
        zzb = d0Var;
        zzeh.zzV(d0.class, d0Var);
    }

    private d0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        b0 b0Var = null;
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0000", null);
        }
        if (i12 == 3) {
            return new d0();
        }
        if (i12 == 4) {
            return new c0(b0Var);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
