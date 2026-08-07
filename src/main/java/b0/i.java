package b0;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.x0;
import c0.d0;

/* JADX INFO: loaded from: classes.dex */
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d0<T> f15244a;

    public i(@NonNull d0<T> d0Var) {
        this.f15244a = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public <ValueT> i<T> a(@NonNull CaptureRequest.Key<ValueT> key, @NonNull ValueT valuet) {
        this.f15244a.b().m(u.a.Z(key), x0.c.ALWAYS_OVERRIDE, valuet);
        return this;
    }
}
