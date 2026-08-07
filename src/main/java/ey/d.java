package ey;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzep;
import com.google.android.gms.internal.mlkit_vision_text_common.zzeq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.android.gms.internal.mlkit_vision_text_common.zznw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zztr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzue;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class d extends com.google.mlkit.common.sdkinternal.f<dy.a, wx.a> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static boolean f63435i = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final q f63437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zzuc f63438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zzue f63439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dy.d f63440g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final xx.d f63436j = xx.d.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @KeepForSdk
    private static final com.google.mlkit.common.sdkinternal.o f63434h = new com.google.mlkit.common.sdkinternal.o();

    d(@NonNull zzuc zzucVar, @NonNull q qVar, @NonNull dy.d dVar) {
        super((dVar.h() == 8 || dVar.h() == 7) ? new com.google.mlkit.common.sdkinternal.o() : f63434h);
        this.f63438e = zzucVar;
        this.f63437d = qVar;
        this.f63439f = zzue.zza(com.google.mlkit.common.sdkinternal.i.c().b());
        this.f63440g = dVar;
    }

    private final void m(final zzou zzouVar, long j11, final wx.a aVar) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j11;
        this.f63438e.zzf(new zzub() { // from class: ey.u
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
            public final zztr zza() {
                return this.f63461a.j(jElapsedRealtime, zzouVar, aVar);
            }
        }, zzov.ON_DEVICE_TEXT_DETECT);
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzouVar);
        zzeqVar.zzb(Boolean.valueOf(f63435i));
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(a.a(this.f63440g.h()));
        zzeqVar.zzc(zzsaVar.zzc());
        final zzes zzesVarZzd = zzeqVar.zzd();
        final v vVar = new v(this);
        final zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        Executor executorD = com.google.mlkit.common.sdkinternal.g.d();
        final zzuc zzucVar = this.f63438e;
        executorD.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzua
            @Override // java.lang.Runnable
            public final void run() {
                zzucVar.zzh(zzovVar, zzesVarZzd, jElapsedRealtime, vVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f63439f.zzc(this.f63440g.j(), zzouVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void b() {
        this.f63437d.zzb();
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void d() {
        f63435i = true;
        this.f63437d.zzc();
    }

    final /* synthetic */ zztr j(long j11, zzou zzouVar, wx.a aVar) {
        zzob zzobVar;
        zzrx zzrxVar = new zzrx();
        zzoh zzohVar = new zzoh();
        zzohVar.zzc(Long.valueOf(j11));
        zzohVar.zzd(zzouVar);
        zzohVar.zze(Boolean.valueOf(f63435i));
        Boolean bool = Boolean.TRUE;
        zzohVar.zza(bool);
        zzohVar.zzb(bool);
        zzrxVar.zzd(zzohVar.zzf());
        xx.d dVar = f63436j;
        int iC = dVar.c(aVar);
        int iD = dVar.d(aVar);
        zzoa zzoaVar = new zzoa();
        if (iC == -1) {
            zzobVar = zzob.BITMAP;
        } else if (iC == 35) {
            zzobVar = zzob.YUV_420_888;
        } else if (iC == 842094169) {
            zzobVar = zzob.YV12;
        } else if (iC != 16) {
            zzobVar = iC != 17 ? zzob.UNKNOWN_FORMAT : zzob.NV21;
        } else {
            zzobVar = zzob.NV16;
        }
        zzoaVar.zza(zzobVar);
        zzoaVar.zzb(Integer.valueOf(iD));
        zzrxVar.zzc(zzoaVar.zzd());
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(a.a(this.f63440g.h()));
        zzrxVar.zze(zzsaVar.zzc());
        zzrz zzrzVarZzf = zzrxVar.zzf();
        zzow zzowVar = new zzow();
        zzowVar.zze(this.f63440g.f() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzowVar.zzh(zzrzVarZzf);
        return zzuf.zzf(zzowVar);
    }

    final /* synthetic */ zztr k(zzes zzesVar, int i11, zznw zznwVar) {
        zzow zzowVar = new zzow();
        zzowVar.zze(this.f63440g.f() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzep zzepVar = new zzep();
        zzepVar.zza(Integer.valueOf(i11));
        zzepVar.zzc(zzesVar);
        zzepVar.zzb(zznwVar);
        zzowVar.zzd(zzepVar.zze());
        return zzuf.zzf(zzowVar);
    }

    @Override // com.google.mlkit.common.sdkinternal.f
    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized dy.a i(@NonNull wx.a aVar) {
        dy.a aVarA;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            aVarA = this.f63437d.a(aVar);
            m(zzou.NO_ERROR, jElapsedRealtime, aVar);
            f63435i = false;
        } catch (MlKitException e11) {
            m(e11.a() == 14 ? zzou.MODEL_NOT_DOWNLOADED : zzou.UNKNOWN_ERROR, jElapsedRealtime, aVar);
            throw e11;
        }
        return aVarA;
    }
}
