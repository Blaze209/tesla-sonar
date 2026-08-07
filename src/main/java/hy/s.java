package hy;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends zzeh implements zzfn {
    private static final s zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private zzdf zzf;
    private String zzg;
    private f zzh;
    private int zzi;
    private f0 zzj;
    private l0 zzk;
    private zzco zzl;
    private j zzm;
    private q zzn;
    private m zzo;
    private p0 zzp;
    private d0 zzq;
    private h0 zzr;
    private z zzs;
    private zzeo zzt;
    private zzen zzu;
    private String zzv;
    private zzeo zzw;
    private boolean zzx;
    private double zzy;
    private zzdf zzz;

    static {
        s sVar = new s();
        zzb = sVar;
        zzeh.zzV(s.class, sVar);
    }

    private s() {
        zzdf zzdfVar = zzdf.zzb;
        this.zzf = zzdfVar;
        this.zzg = "";
        this.zzt = zzeh.zzP();
        this.zzu = zzeh.zzO();
        this.zzv = "";
        this.zzw = zzeh.zzP();
        this.zzx = true;
        this.zzz = zzdfVar;
    }

    static /* synthetic */ void o(s sVar, int i11, h hVar) {
        hVar.getClass();
        zzeo zzeoVar = sVar.zzt;
        if (!zzeoVar.zzc()) {
            sVar.zzt = zzeh.zzQ(zzeoVar);
        }
        sVar.zzt.set(i11, hVar);
    }

    public final int a() {
        int iA = w.a(this.zzi);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int b() {
        return this.zzt.size();
    }

    public final d0 d() {
        d0 d0Var = this.zzq;
        return d0Var == null ? d0.d() : d0Var;
    }

    public final f0 e() {
        f0 f0Var = this.zzj;
        return f0Var == null ? f0.b() : f0Var;
    }

    public final h0 f() {
        h0 h0Var = this.zzr;
        return h0Var == null ? h0.b() : h0Var;
    }

    public final l0 g() {
        l0 l0Var = this.zzk;
        return l0Var == null ? l0.b() : l0Var;
    }

    public final p0 h() {
        p0 p0Var = this.zzp;
        return p0Var == null ? p0.d() : p0Var;
    }

    public final j i() {
        j jVar = this.zzm;
        return jVar == null ? j.b() : jVar;
    }

    public final m j() {
        m mVar = this.zzo;
        return mVar == null ? m.b() : mVar;
    }

    public final q k() {
        q qVar = this.zzn;
        return qVar == null ? q.b() : qVar;
    }

    public final zzdf l() {
        return this.zzf;
    }

    public final String m() {
        return this.zzg;
    }

    public final List n() {
        return this.zzt;
    }

    public final boolean p() {
        return (this.zzd & 4096) != 0;
    }

    public final boolean q() {
        return (this.zzd & 32) != 0;
    }

    public final boolean r() {
        return (this.zzd & PKIFailureInfo.certRevoked) != 0;
    }

    public final boolean s() {
        return (this.zzd & 64) != 0;
    }

    public final boolean t() {
        return (this.zzd & 2048) != 0;
    }

    public final boolean u() {
        return (this.zzd & 128) != 0;
    }

    public final boolean v() {
        return (this.zzd & 256) != 0;
    }

    public final boolean w() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean x() {
        return (this.zzd & 512) != 0;
    }

    public final int y() {
        int iA = u.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final zzco zzb() {
        zzco zzcoVar = this.zzl;
        return zzcoVar == null ? zzco.zzb() : zzcoVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", t.f73717a, "zzf", "zzg", "zzi", v.f73718a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", h.class, "zzv", "zzw", h.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i12 == 3) {
            return new s();
        }
        b bVar = null;
        if (i12 == 4) {
            return new r(bVar);
        }
        if (i12 == 5) {
            return zzb;
        }
        this.zzA = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
