package hy;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 extends zzeh implements zzfn {
    private static final l0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        l0 l0Var = new l0();
        zzb = l0Var;
        zzeh.zzV(l0.class, l0Var);
    }

    private l0() {
    }

    public static l0 b() {
        return zzb;
    }

    public final int c() {
        int iA = k0.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", j0.f73714a, "zzf", "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new l0();
        }
        b bVar = null;
        if (i12 == 4) {
            return new i0(bVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
