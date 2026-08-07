package z;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.impl.r2;
import c0.b1;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r2 f126041a;

    public m(@NonNull r2 r2Var) {
        this.f126041a = r2Var;
    }

    @NonNull
    public PointF a(@NonNull b1 b1Var, int i11) {
        return (i11 == 1 && this.f126041a.a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - b1Var.c(), b1Var.d()) : new PointF(b1Var.c(), b1Var.d());
    }
}
