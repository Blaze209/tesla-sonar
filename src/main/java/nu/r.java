package nu;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends zzeh implements zzfn {
    private static final r zzb;
    private int zzd = 0;
    private Object zze;

    static {
        r rVar = new r();
        zzb = rVar;
        zzeh.zzV(r.class, rVar);
    }

    private r() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zze", "zzd", x.class, d0.class, a0.class});
        }
        if (i12 == 3) {
            return new r();
        }
        p pVar = null;
        if (i12 == 4) {
            return new q(pVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
