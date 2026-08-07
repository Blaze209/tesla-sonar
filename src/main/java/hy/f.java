package hy;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends zzeh implements zzfn {
    private static final f zzb;
    private zzeo zzd = zzeh.zzP();

    static {
        f fVar = new f();
        zzb = fVar;
        zzeh.zzV(f.class, fVar);
    }

    private f() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", e.class});
        }
        if (i12 == 3) {
            return new f();
        }
        b bVar = null;
        if (i12 == 4) {
            return new c(bVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
