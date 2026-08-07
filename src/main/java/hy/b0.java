package hy;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends zzeh implements zzfn {
    private static final b0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        b0 b0Var = new b0();
        zzb = b0Var;
        zzeh.zzV(b0.class, b0Var);
    }

    private b0() {
    }

    public static b0 f() {
        return zzb;
    }

    public final int a() {
        return this.zzg;
    }

    public final int b() {
        return this.zzh;
    }

    public final int c() {
        return this.zzj;
    }

    public final int d() {
        return this.zze;
    }

    public final boolean g() {
        return this.zzk;
    }

    public final int zzc() {
        return this.zzi;
    }

    public final int zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new b0();
        }
        b bVar = null;
        if (i12 == 4) {
            return new a0(bVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
