package zx;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f129168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f129169b;

    public b(int i11, @NonNull List list) {
        this.f129168a = i11;
        this.f129169b = list;
    }

    @NonNull
    public List<PointF> a() {
        return this.f129169b;
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceContour");
        zzvVarZza.zzb("type", this.f129168a);
        zzvVarZza.zzc("points", this.f129169b.toArray());
        return zzvVarZza.toString();
    }
}
