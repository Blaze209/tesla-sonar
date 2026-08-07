package hy;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends zzeh<a, x> implements zzfn {
    private static final a zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private zzeo zze = zzeh.zzP();
    private String zzg = "";
    private zzdf zzh = zzdf.zzb;

    static {
        a aVar = new a();
        zzb = aVar;
        zzeh.zzV(a.class, aVar);
    }

    private a() {
    }

    public static a b(byte[] bArr, zzds zzdsVar) {
        return (a) zzeh.zzL(zzb, bArr, zzdsVar);
    }

    @NonNull
    public final List c() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    @NonNull
    protected final Object zzg(int i11, @NonNull Object obj, @NonNull Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", s.class, "zzf", k.f73715a, "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new a();
        }
        b bVar = null;
        if (i12 == 4) {
            return new x(bVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
