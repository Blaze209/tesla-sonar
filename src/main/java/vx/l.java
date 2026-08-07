package vx;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends com.google.mlkit.common.sdkinternal.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final xx.d f120092j = xx.d.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static boolean f120093k = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sx.b f120094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f120095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zzwp f120096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zzwr f120097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final xx.a f120098h = new xx.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f120099i;

    public l(com.google.mlkit.common.sdkinternal.i iVar, sx.b bVar, m mVar, zzwp zzwpVar) {
        Preconditions.checkNotNull(iVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(bVar, "BarcodeScannerOptions can not be null");
        this.f120094d = bVar;
        this.f120095e = mVar;
        this.f120096f = zzwpVar;
        this.f120097g = zzwr.zza(iVar.b());
    }

    private final void m(final zzrb zzrbVar, long j11, @NonNull final wx.a aVar, List list) {
        final zzcp zzcpVar = new zzcp();
        final zzcp zzcpVar2 = new zzcp();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tx.a aVar2 = (tx.a) it.next();
                zzcpVar.zzd(b.a(aVar2.c()));
                zzcpVar2.zzd(b.b(aVar2.e()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j11;
        this.f120096f.zzf(new zzwo() { // from class: vx.j
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final zzwe zza() {
                return this.f120085a.j(jElapsedRealtime, zzrbVar, zzcpVar, zzcpVar2, aVar);
            }
        }, zzrc.ON_DEVICE_BARCODE_DETECT);
        zzfr zzfrVar = new zzfr();
        zzfrVar.zze(zzrbVar);
        zzfrVar.zzf(Boolean.valueOf(f120093k));
        zzfrVar.zzg(b.c(this.f120094d));
        zzfrVar.zzc(zzcpVar.zzf());
        zzfrVar.zzd(zzcpVar2.zzf());
        final zzft zzftVarZzh = zzfrVar.zzh();
        final k kVar = new k(this);
        final zzwp zzwpVar = this.f120096f;
        final zzrc zzrcVar = zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        com.google.mlkit.common.sdkinternal.g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwn
            @Override // java.lang.Runnable
            public final void run() {
                zzwpVar.zzh(zzrcVar, zzftVarZzh, jElapsedRealtime, kVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f120097g.zzc(true != this.f120099i ? 24301 : 24302, zzrbVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void b() {
        this.f120099i = this.f120095e.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void d() {
        try {
            this.f120095e.zzb();
            f120093k = true;
            zzrd zzrdVar = new zzrd();
            zzra zzraVar = this.f120099i ? zzra.TYPE_THICK : zzra.TYPE_THIN;
            zzwp zzwpVar = this.f120096f;
            zzrdVar.zze(zzraVar);
            zzrp zzrpVar = new zzrp();
            zzrpVar.zzi(b.c(this.f120094d));
            zzrdVar.zzg(zzrpVar.zzj());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrc.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final /* synthetic */ zzwe j(long j11, zzrb zzrbVar, zzcp zzcpVar, zzcp zzcpVar2, wx.a aVar) {
        zzqi zzqiVar;
        zzrp zzrpVar = new zzrp();
        zzqo zzqoVar = new zzqo();
        zzqoVar.zzc(Long.valueOf(j11));
        zzqoVar.zzd(zzrbVar);
        zzqoVar.zze(Boolean.valueOf(f120093k));
        Boolean bool = Boolean.TRUE;
        zzqoVar.zza(bool);
        zzqoVar.zzb(bool);
        zzrpVar.zzh(zzqoVar.zzf());
        zzrpVar.zzi(b.c(this.f120094d));
        zzrpVar.zze(zzcpVar.zzf());
        zzrpVar.zzf(zzcpVar2.zzf());
        int iH = aVar.h();
        int iD = f120092j.d(aVar);
        zzqh zzqhVar = new zzqh();
        if (iH == -1) {
            zzqiVar = zzqi.BITMAP;
        } else if (iH == 35) {
            zzqiVar = zzqi.YUV_420_888;
        } else if (iH == 842094169) {
            zzqiVar = zzqi.YV12;
        } else if (iH != 16) {
            zzqiVar = iH != 17 ? zzqi.UNKNOWN_FORMAT : zzqi.NV21;
        } else {
            zzqiVar = zzqi.NV16;
        }
        zzqhVar.zza(zzqiVar);
        zzqhVar.zzb(Integer.valueOf(iD));
        zzrpVar.zzg(zzqhVar.zzd());
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(this.f120099i ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrpVar.zzj());
        return zzws.zzf(zzrdVar);
    }

    final /* synthetic */ zzwe k(zzft zzftVar, int i11, zzqd zzqdVar) {
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(this.f120099i ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzfq zzfqVar = new zzfq();
        zzfqVar.zza(Integer.valueOf(i11));
        zzfqVar.zzc(zzftVar);
        zzfqVar.zzb(zzqdVar);
        zzrdVar.zzd(zzfqVar.zze());
        return zzws.zzf(zzrdVar);
    }

    @Override // com.google.mlkit.common.sdkinternal.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List i(@NonNull wx.a aVar) throws Throwable {
        l lVar;
        wx.a aVar2;
        try {
            try {
                xx.a aVar3 = this.f120098h;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                aVar3.a(aVar);
                try {
                    List listA = this.f120095e.a(aVar);
                    lVar = this;
                    aVar2 = aVar;
                    try {
                        lVar.m(zzrb.NO_ERROR, jElapsedRealtime, aVar2, listA);
                        f120093k = false;
                        return listA;
                    } catch (MlKitException e11) {
                        e = e11;
                        MlKitException mlKitException = e;
                        lVar.m(mlKitException.a() == 14 ? zzrb.MODEL_NOT_DOWNLOADED : zzrb.UNKNOWN_ERROR, jElapsedRealtime, aVar2, null);
                        throw mlKitException;
                    }
                } catch (MlKitException e12) {
                    e = e12;
                    lVar = this;
                    aVar2 = aVar;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
