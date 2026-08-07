package hy;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends zzeh implements zzfn {
    private static final q zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        q qVar = new q();
        zzb = qVar;
        zzeh.zzV(q.class, qVar);
    }

    private q() {
    }

    public static q b() {
        return zzb;
    }

    public final int c() {
        int iA = p.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", o.f73716a, "zzg", "zzh"});
        }
        if (i12 == 3) {
            return new q();
        }
        b bVar = null;
        if (i12 == 4) {
            return new n(bVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
