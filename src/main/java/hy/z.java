package hy;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends zzeh implements zzfn {
    private static final z zzb;
    private int zzd;
    private String zze = "";
    private zzeo zzf = zzeh.zzP();

    static {
        z zVar = new z();
        zzb = zVar;
        zzeh.zzV(z.class, zVar);
    }

    private z() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", n0.class});
        }
        if (i12 == 3) {
            return new z();
        }
        b bVar = null;
        if (i12 == 4) {
            return new y(bVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
