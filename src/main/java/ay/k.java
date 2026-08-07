package ay;

import com.google.android.gms.internal.mlkit_vision_face.zzjx;
import com.google.android.gms.internal.mlkit_vision_face.zzjy;
import com.google.android.gms.internal.mlkit_vision_face.zzjz;
import com.google.android.gms.internal.mlkit_vision_face.zzka;
import com.google.android.gms.internal.mlkit_vision_face.zzkb;
import com.google.android.gms.internal.mlkit_vision_face.zzkd;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlm;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AtomicReference f15177a = new AtomicReference();

    public static zzkd a(zx.e eVar) {
        zzka zzkaVar;
        zzjy zzjyVar;
        zzkb zzkbVar;
        zzjz zzjzVar;
        zzjx zzjxVar = new zzjx();
        int iD = eVar.d();
        if (iD != 1) {
            zzkaVar = iD != 2 ? zzka.UNKNOWN_LANDMARKS : zzka.ALL_LANDMARKS;
        } else {
            zzkaVar = zzka.NO_LANDMARKS;
        }
        zzjxVar.zzd(zzkaVar);
        int iB = eVar.b();
        if (iB != 1) {
            zzjyVar = iB != 2 ? zzjy.UNKNOWN_CLASSIFICATIONS : zzjy.ALL_CLASSIFICATIONS;
        } else {
            zzjyVar = zzjy.NO_CLASSIFICATIONS;
        }
        zzjxVar.zza(zzjyVar);
        int iE = eVar.e();
        if (iE != 1) {
            zzkbVar = iE != 2 ? zzkb.UNKNOWN_PERFORMANCE : zzkb.ACCURATE;
        } else {
            zzkbVar = zzkb.FAST;
        }
        zzjxVar.zzf(zzkbVar);
        int iC = eVar.c();
        if (iC != 1) {
            zzjzVar = iC != 2 ? zzjz.UNKNOWN_CONTOURS : zzjz.ALL_CONTOURS;
        } else {
            zzjzVar = zzjz.NO_CONTOURS;
        }
        zzjxVar.zzb(zzjzVar);
        zzjxVar.zzc(Boolean.valueOf(eVar.g()));
        zzjxVar.zze(Float.valueOf(eVar.a()));
        return zzjxVar.zzk();
    }

    public static String b() {
        return true != d() ? "play-services-mlkit-face-detection" : "face-detection";
    }

    public static void c(zzoc zzocVar, final boolean z11, final zzks zzksVar) {
        zzocVar.zzf(new zzoa() { // from class: ay.j
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                boolean z12 = z11;
                zzks zzksVar2 = zzksVar;
                zzku zzkuVar = new zzku();
                zzkuVar.zze(z12 ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
                zzlm zzlmVar = new zzlm();
                zzlmVar.zzb(zzksVar2);
                zzkuVar.zzh(zzlmVar.zzc());
                return zzof.zzf(zzkuVar);
            }
        }, zzkt.ON_DEVICE_FACE_LOAD);
    }

    static boolean d() {
        AtomicReference atomicReference = f15177a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zB = b.b(com.google.mlkit.common.sdkinternal.i.c().b());
        atomicReference.set(Boolean.valueOf(zB));
        return zB;
    }
}
