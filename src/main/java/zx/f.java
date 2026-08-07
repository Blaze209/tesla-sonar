package zx;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f129184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f129185b;

    f(int i11, @NonNull PointF pointF) {
        this.f129184a = i11;
        this.f129185b = pointF;
    }

    @NonNull
    public PointF a() {
        return this.f129185b;
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceLandmark");
        zzvVarZza.zzb("type", this.f129184a);
        zzvVarZza.zzc("position", this.f129185b);
        return zzvVarZza.toString();
    }
}
