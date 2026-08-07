package t0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.r1;
import androidx.camera.core.impl.x0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h implements o3<f>, r1, k0.l {
    static final x0.a<List<p3.b>> L = x0.a.a("camerax.core.streamSharing.captureTypes", List.class);
    private final i2 K;

    h(@NonNull i2 i2Var) {
        this.K = i2Var;
    }

    @NonNull
    public List<p3.b> Z() {
        return (List) a(L);
    }

    @Override // androidx.camera.core.impl.s2
    @NonNull
    public x0 getConfig() {
        return this.K;
    }
}
