package nu;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends zzeh implements zzfn {
    private static final x zzb;

    static {
        x xVar = new x();
        zzb = xVar;
        zzeh.zzV(x.class, xVar);
    }

    private x() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        v vVar = null;
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0000", null);
        }
        if (i12 == 3) {
            return new x();
        }
        if (i12 == 4) {
            return new w(vVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
