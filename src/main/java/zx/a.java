package zx;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f129158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f129159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f129160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f129161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f129162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f129163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f129164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f129165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray f129166i = new SparseArray();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseArray f129167j = new SparseArray();

    public a(@NonNull zzf zzfVar, Matrix matrix) {
        float f11 = zzfVar.zzc;
        float f12 = zzfVar.zze / 2.0f;
        float f13 = zzfVar.zzd;
        float f14 = zzfVar.zzf / 2.0f;
        Rect rect = new Rect((int) (f11 - f12), (int) (f13 - f14), (int) (f11 + f12), (int) (f13 + f14));
        this.f129158a = rect;
        if (matrix != null) {
            xx.b.e(rect, matrix);
        }
        this.f129159b = zzfVar.zzb;
        for (zzn zznVar : zzfVar.zzj) {
            if (l(zznVar.zzd)) {
                PointF pointF = new PointF(zznVar.zzb, zznVar.zzc);
                if (matrix != null) {
                    xx.b.c(pointF, matrix);
                }
                SparseArray sparseArray = this.f129166i;
                int i11 = zznVar.zzd;
                sparseArray.put(i11, new f(i11, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i12 = zzdVar.zzb;
            if (k(i12)) {
                PointF[] pointFArr = zzdVar.zza;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j11 = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j11 > 2147483647L ? Integer.MAX_VALUE : (int) j11);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    xx.b.d(arrayList, matrix);
                }
                this.f129167j.put(i12, new b(i12, arrayList));
            }
        }
        this.f129163f = zzfVar.zzi;
        this.f129164g = zzfVar.zzg;
        this.f129165h = zzfVar.zzh;
        this.f129162e = zzfVar.zzm;
        this.f129161d = zzfVar.zzk;
        this.f129160c = zzfVar.zzl;
    }

    private static boolean k(int i11) {
        return i11 <= 15 && i11 > 0;
    }

    private static boolean l(int i11) {
        return i11 == 0 || i11 == 1 || i11 == 7 || i11 == 3 || i11 == 9 || i11 == 4 || i11 == 10 || i11 == 5 || i11 == 11 || i11 == 6;
    }

    @NonNull
    public Rect a() {
        return this.f129158a;
    }

    public b b(int i11) {
        return (b) this.f129167j.get(i11);
    }

    public float c() {
        return this.f129163f;
    }

    public float d() {
        return this.f129164g;
    }

    public f e(int i11) {
        return (f) this.f129166i.get(i11);
    }

    public Float f() {
        float f11 = this.f129162e;
        if (f11 < BitmapDescriptorFactory.HUE_RED || f11 > 1.0f) {
            return null;
        }
        return Float.valueOf(this.f129161d);
    }

    public Float g() {
        float f11 = this.f129160c;
        if (f11 < BitmapDescriptorFactory.HUE_RED || f11 > 1.0f) {
            return null;
        }
        return Float.valueOf(f11);
    }

    @NonNull
    public final SparseArray h() {
        return this.f129167j;
    }

    public final void i(@NonNull SparseArray sparseArray) {
        this.f129167j.clear();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            this.f129167j.put(sparseArray.keyAt(i11), (b) sparseArray.valueAt(i11));
        }
    }

    public final void j(int i11) {
        this.f129159b = -1;
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("Face");
        zzvVarZza.zzc("boundingBox", this.f129158a);
        zzvVarZza.zzb("trackingId", this.f129159b);
        zzvVarZza.zza("rightEyeOpenProbability", this.f129160c);
        zzvVarZza.zza("leftEyeOpenProbability", this.f129161d);
        zzvVarZza.zza("smileProbability", this.f129162e);
        zzvVarZza.zza("eulerX", this.f129163f);
        zzvVarZza.zza("eulerY", this.f129164g);
        zzvVarZza.zza("eulerZ", this.f129165h);
        zzv zzvVarZza2 = zzw.zza("Landmarks");
        for (int i11 = 0; i11 <= 11; i11++) {
            if (l(i11)) {
                zzvVarZza2.zzc("landmark_" + i11, e(i11));
            }
        }
        zzvVarZza.zzc("landmarks", zzvVarZza2.toString());
        zzv zzvVarZza3 = zzw.zza("Contours");
        for (int i12 = 1; i12 <= 15; i12++) {
            zzvVarZza3.zzc("Contour_" + i12, b(i12));
        }
        zzvVarZza.zzc("contours", zzvVarZza3.toString());
        return zzvVarZza.toString();
    }

    public a(@NonNull zzow zzowVar, Matrix matrix) {
        Rect rectZzh = zzowVar.zzh();
        this.f129158a = rectZzh;
        if (matrix != null) {
            xx.b.e(rectZzh, matrix);
        }
        this.f129159b = zzowVar.zzg();
        for (zzpc zzpcVar : zzowVar.zzj()) {
            if (l(zzpcVar.zza())) {
                PointF pointFZzb = zzpcVar.zzb();
                if (matrix != null) {
                    xx.b.c(pointFZzb, matrix);
                }
                this.f129166i.put(zzpcVar.zza(), new f(zzpcVar.zza(), pointFZzb));
            }
        }
        for (zzos zzosVar : zzowVar.zzi()) {
            int iZza = zzosVar.zza();
            if (k(iZza)) {
                List listZzb = zzosVar.zzb();
                listZzb.getClass();
                ArrayList arrayList = new ArrayList(listZzb);
                if (matrix != null) {
                    xx.b.d(arrayList, matrix);
                }
                this.f129167j.put(iZza, new b(iZza, arrayList));
            }
        }
        this.f129163f = zzowVar.zzf();
        this.f129164g = zzowVar.zzb();
        this.f129165h = -zzowVar.zzd();
        this.f129162e = zzowVar.zze();
        this.f129161d = zzowVar.zza();
        this.f129160c = zzowVar.zzc();
    }
}
