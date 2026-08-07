package nu;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends zzeh implements zzfn {
    private static final j zzb;
    private zzeo zzd = zzeh.zzP();

    static {
        j jVar = new j();
        zzb = jVar;
        zzeh.zzV(j.class, jVar);
    }

    private j() {
    }

    public static i a() {
        return (i) zzb.zzG();
    }

    static /* synthetic */ void c(j jVar, g gVar) {
        gVar.getClass();
        zzeo zzeoVar = jVar.zzd;
        if (!zzeoVar.zzc()) {
            jVar.zzd = zzeh.zzQ(zzeoVar);
        }
        jVar.zzd.add(gVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", g.class});
        }
        if (i12 == 3) {
            return new j();
        }
        h hVar = null;
        if (i12 == 4) {
            return new i(hVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
