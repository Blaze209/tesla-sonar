package nu;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends zzeh<a, o> implements zzfn {
    private static final a zzb;
    private int zzd;
    private m zze;
    private e zzf;
    private u zzg;

    static {
        a aVar = new a();
        zzb = aVar;
        zzeh.zzV(a.class, aVar);
    }

    private a() {
    }

    public static o a() {
        return (o) zzb.zzG();
    }

    static /* synthetic */ void c(a aVar, m mVar) {
        mVar.getClass();
        aVar.zze = mVar;
        aVar.zzd |= 1;
    }

    static /* synthetic */ void d(a aVar, e eVar) {
        eVar.getClass();
        aVar.zzf = eVar;
        aVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    @NonNull
    protected final Object zzg(int i11, @NonNull Object obj, @NonNull Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new a();
        }
        n nVar = null;
        if (i12 == 4) {
            return new o(nVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
