package ay;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f15157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.d f15158b;

    d(f fVar, com.google.mlkit.common.sdkinternal.d dVar) {
        this.f15157a = fVar;
        this.f15158b = dVar;
    }

    @NonNull
    public final a a(@NonNull zx.e eVar) {
        Preconditions.checkNotNull(eVar, "You must provide a valid FaceDetectorOptions.");
        return new a((i) this.f15157a.get(eVar), this.f15158b, eVar, null);
    }
}
