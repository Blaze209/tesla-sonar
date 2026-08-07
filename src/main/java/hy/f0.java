package hy;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends zzeh implements zzfn {
    private static final f0 zzb;
    private int zzd;
    private zzck zze;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";
    private zzeo zzh = zzeh.zzP();
    private zzeo zzi = zzeh.zzP();
    private zzeo zzj = zzeh.zzP();
    private zzeo zzk = zzeh.zzP();
    private String zzl = "";

    static {
        f0 f0Var = new f0();
        zzb = f0Var;
        zzeh.zzV(f0.class, f0Var);
    }

    private f0() {
    }

    public static f0 b() {
        return zzb;
    }

    public final List c() {
        return this.zzk;
    }

    public final List d() {
        return this.zzi;
    }

    public final List e() {
        return this.zzh;
    }

    public final List f() {
        return this.zzj;
    }

    public final zzck zza() {
        zzck zzckVar = this.zze;
        return zzckVar == null ? zzck.zzb() : zzckVar;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzco.class, "zzi", l0.class, "zzj", "zzk", zzci.class, "zzl"});
        }
        if (i12 == 3) {
            return new f0();
        }
        b bVar = null;
        if (i12 == 4) {
            return new e0(bVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
