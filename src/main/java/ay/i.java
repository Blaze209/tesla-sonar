package ay;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import ay.h;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.zzdk;
import com.google.android.gms.internal.mlkit_vision_face.zzdl;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzjv;
import com.google.android.gms.internal.mlkit_vision_face.zzke;
import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkj;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends com.google.mlkit.common.sdkinternal.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final AtomicBoolean f15167j = new AtomicBoolean(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final xx.d f15168k = xx.d.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zx.e f15169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zzoc f15170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zzoe f15171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f15172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f15173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final xx.a f15174i = new xx.a();

    public i(@NonNull zzoc zzocVar, @NonNull zx.e eVar, @NonNull c cVar) {
        Preconditions.checkNotNull(eVar, "FaceDetectorOptions can not be null");
        this.f15169d = eVar;
        this.f15170e = zzocVar;
        this.f15172g = cVar;
        this.f15171f = zzoe.zza(com.google.mlkit.common.sdkinternal.i.c().b());
    }

    static void m(@NonNull List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zx.a) it.next()).j(-1);
        }
    }

    private final synchronized void n(final zzks zzksVar, long j11, final wx.a aVar, final int i11, final int i12) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j11;
        this.f15170e.zzf(new zzoa() { // from class: ay.g
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                return this.f15160a.j(jElapsedRealtime, zzksVar, i11, i12, aVar);
            }
        }, zzkt.ON_DEVICE_FACE_DETECT);
        zzdl zzdlVar = new zzdl();
        zzdlVar.zzc(zzksVar);
        zzdlVar.zzd(Boolean.valueOf(f15167j.get()));
        zzdlVar.zza(Integer.valueOf(i11));
        zzdlVar.zze(Integer.valueOf(i12));
        zzdlVar.zzb(k.a(this.f15169d));
        final zzdn zzdnVarZzf = zzdlVar.zzf();
        final h hVar = new h(this);
        final zzoc zzocVar = this.f15170e;
        final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        final byte[] bArr = null;
        com.google.mlkit.common.sdkinternal.g.d().execute(new Runnable(zzktVar, zzdnVarZzf, jElapsedRealtime, hVar, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_face.zzny
            public final /* synthetic */ zzkt zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ h zze;

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f15171f.zzc(true != this.f15173h ? 24303 : 24304, zzksVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void b() {
        this.f15173h = this.f15172g.zzd();
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void d() {
        try {
            this.f15172g.zzb();
            f15167j.set(true);
            zzoc zzocVar = this.f15170e;
            zzku zzkuVar = new zzku();
            zzkuVar.zze(this.f15173h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
            zzocVar.zzd(zzof.zzf(zzkuVar), zzkt.ON_DEVICE_FACE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final /* synthetic */ zznr j(long j11, zzks zzksVar, int i11, int i12, wx.a aVar) {
        zzkf zzkfVar;
        zzlj zzljVar = new zzlj();
        zzkj zzkjVar = new zzkj();
        zzkjVar.zzc(Long.valueOf(j11));
        zzkjVar.zzd(zzksVar);
        zzkjVar.zze(Boolean.valueOf(f15167j.get()));
        Boolean bool = Boolean.TRUE;
        zzkjVar.zza(bool);
        zzkjVar.zzb(bool);
        zzljVar.zzg(zzkjVar.zzf());
        zzljVar.zze(k.a(this.f15169d));
        zzljVar.zzd(Integer.valueOf(i11));
        zzljVar.zzh(Integer.valueOf(i12));
        xx.d dVar = f15168k;
        int iC = dVar.c(aVar);
        int iD = dVar.d(aVar);
        zzke zzkeVar = new zzke();
        if (iC == -1) {
            zzkfVar = zzkf.BITMAP;
        } else if (iC == 35) {
            zzkfVar = zzkf.YUV_420_888;
        } else if (iC == 842094169) {
            zzkfVar = zzkf.YV12;
        } else if (iC != 16) {
            zzkfVar = iC != 17 ? zzkf.UNKNOWN_FORMAT : zzkf.NV21;
        } else {
            zzkfVar = zzkf.NV16;
        }
        zzkeVar.zza(zzkfVar);
        zzkeVar.zzb(Integer.valueOf(iD));
        zzljVar.zzf(zzkeVar.zzd());
        zzll zzllVarZzi = zzljVar.zzi();
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.f15173h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzkuVar.zzg(zzllVarZzi);
        return zzof.zzf(zzkuVar);
    }

    final /* synthetic */ zznr k(zzdn zzdnVar, int i11, zzjv zzjvVar) {
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.f15173h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzdk zzdkVar = new zzdk();
        zzdkVar.zza(Integer.valueOf(i11));
        zzdkVar.zzc(zzdnVar);
        zzdkVar.zzb(zzjvVar);
        zzkuVar.zzd(zzdkVar.zze());
        return zzof.zzf(zzkuVar);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108 A[Catch: all -> 0x002b, MlKitException -> 0x002e, TryCatch #0 {MlKitException -> 0x002e, blocks: (B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:42:0x0102, B:50:0x0118, B:49:0x0112, B:45:0x0108, B:19:0x0041, B:20:0x0048, B:21:0x0051, B:23:0x0057, B:24:0x0062, B:26:0x0068, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:34:0x00d9, B:36:0x00e4, B:39:0x00f1, B:41:0x00fa), top: B:62:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112 A[Catch: all -> 0x002b, MlKitException -> 0x002e, TryCatch #0 {MlKitException -> 0x002e, blocks: (B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:42:0x0102, B:50:0x0118, B:49:0x0112, B:45:0x0108, B:19:0x0041, B:20:0x0048, B:21:0x0051, B:23:0x0057, B:24:0x0062, B:26:0x0068, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:34:0x00d9, B:36:0x00e4, B:39:0x00f1, B:41:0x00fa), top: B:62:0x000e, outer: #1 }] */
    @Override // com.google.mlkit.common.sdkinternal.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List i(@NonNull wx.a aVar) {
        List list;
        List arrayList;
        List list2;
        List list3;
        int size;
        int size2;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f15174i.a(aVar);
            try {
                Pair pairA = this.f15172g.a(aVar);
                List<zx.a> list4 = (List) pairA.first;
                List<zx.a> list5 = (List) pairA.second;
                if (list4 == null && list5 == null) {
                    throw new MlKitException("No detector is enabled", 13);
                }
                if (list4 == null) {
                    list3 = (List) Preconditions.checkNotNull(list5);
                } else {
                    if (list5 == null) {
                        list3 = (List) Preconditions.checkNotNull(list4);
                    } else {
                        HashSet hashSet = new HashSet();
                        for (zx.a aVar2 : list5) {
                            boolean z11 = false;
                            for (zx.a aVar3 : list4) {
                                if (aVar2.a() == null || aVar3.a() == null) {
                                    list2 = list5;
                                } else {
                                    Rect rectA = aVar2.a();
                                    Rect rectA2 = aVar3.a();
                                    if (rectA.intersect(rectA2)) {
                                        list2 = list5;
                                        double dMin = (Math.min(rectA.right, rectA2.right) - Math.max(rectA.left, rectA2.left)) * (Math.min(rectA.bottom, rectA2.bottom) - Math.max(rectA.top, rectA2.top));
                                        if (dMin / ((((double) ((rectA.right - rectA.left) * (rectA.bottom - rectA.top))) + ((double) ((rectA2.right - rectA2.left) * (rectA2.bottom - rectA2.top)))) - dMin) > 0.6d) {
                                            aVar3.i(aVar2.h());
                                            z11 = true;
                                        }
                                    } else {
                                        list2 = list5;
                                    }
                                }
                                hashSet.add(aVar3);
                                list5 = list2;
                            }
                            List list6 = list5;
                            if (!z11) {
                                hashSet.add(aVar2);
                            }
                            list5 = list6;
                        }
                        list = list5;
                        arrayList = new ArrayList(hashSet);
                    }
                    zzks zzksVar = zzks.NO_ERROR;
                    if (list == null) {
                        size = 0;
                    } else {
                        size = list.size();
                    }
                    if (list4 == 0) {
                        size2 = 0;
                    } else {
                        size2 = list4.size();
                    }
                    n(zzksVar, jElapsedRealtime, aVar, size, size2);
                    f15167j.set(false);
                }
                list = list5;
                arrayList = list3;
                zzks zzksVar2 = zzks.NO_ERROR;
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                }
                if (list4 == 0) {
                    size2 = 0;
                } else {
                    size2 = list4.size();
                }
                n(zzksVar2, jElapsedRealtime, aVar, size, size2);
                f15167j.set(false);
            } catch (MlKitException e11) {
                n(e11.a() == 14 ? zzks.MODEL_NOT_DOWNLOADED : zzks.UNKNOWN_ERROR, jElapsedRealtime, aVar, 0, 0);
                throw e11;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }
}
