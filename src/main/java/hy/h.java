package hy;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends zzeh implements zzfn {
    private static final h zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        h hVar = new h();
        zzb = hVar;
        zzeh.zzV(h.class, hVar);
    }

    private h() {
    }

    public static g c() {
        return (g) zzb.zzG();
    }

    static /* synthetic */ void e(h hVar, int i11) {
        hVar.zzd |= 1;
        hVar.zze = i11;
    }

    static /* synthetic */ void f(h hVar, int i11) {
        hVar.zzd |= 2;
        hVar.zzf = i11;
    }

    public final int a() {
        return this.zze;
    }

    public final int b() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i12 == 3) {
            return new h();
        }
        b bVar = null;
        if (i12 == 4) {
            return new g(bVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
