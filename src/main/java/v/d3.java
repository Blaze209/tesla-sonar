package v;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
interface d3 {
    @NonNull
    com.google.common.util.concurrent.s<Void> a(boolean z11);

    androidx.camera.core.impl.x2 b();

    @NonNull
    com.google.common.util.concurrent.s<Void> c(@NonNull androidx.camera.core.impl.x2 x2Var, @NonNull CameraDevice cameraDevice, @NonNull v4.a aVar);

    void close();

    void d(androidx.camera.core.impl.x2 x2Var);

    void e(@NonNull List<androidx.camera.core.impl.v0> list);

    boolean f();

    void g();

    @NonNull
    List<androidx.camera.core.impl.v0> h();

    void i(@NonNull Map<DeferrableSurface, Long> map);
}
