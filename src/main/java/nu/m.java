package nu;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhk;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends zzeh implements zzfn {
    private static final m zzb;
    private int zzd;
    private j zzj;
    private zzhk zzl;
    private String zze = "";
    private zzdf zzf = zzdf.zzb;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = 320;
    private int zzn = 4;
    private int zzo = 2;

    static {
        m mVar = new m();
        zzb = mVar;
        zzeh.zzV(m.class, mVar);
    }

    private m() {
    }

    public static l a() {
        return (l) zzb.zzG();
    }

    static /* synthetic */ void c(m mVar, j jVar) {
        jVar.getClass();
        mVar.zzj = jVar;
        mVar.zzd |= 32;
    }

    static /* synthetic */ void d(m mVar, zzdf zzdfVar) {
        zzdfVar.getClass();
        mVar.zzd |= 2;
        mVar.zzf = zzdfVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i12 == 3) {
            return new m();
        }
        k kVar = null;
        if (i12 == 4) {
            return new l(kVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
