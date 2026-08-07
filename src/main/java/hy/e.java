package hy;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends zzeh implements zzfn {
    private static final e zzb;
    private int zzd;
    private int zze;
    private zzdf zzf = zzdf.zzb;

    static {
        e eVar = new e();
        zzb = eVar;
        zzeh.zzV(e.class, eVar);
    }

    private e() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new e();
        }
        b bVar = null;
        if (i12 == 4) {
            return new d(bVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
