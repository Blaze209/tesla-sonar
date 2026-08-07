package w;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class x implements z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final CameraCharacteristics f120230a;

    x(@NonNull CameraCharacteristics cameraCharacteristics) {
        this.f120230a = cameraCharacteristics;
    }

    @Override // w.z.a
    @NonNull
    public CameraCharacteristics a() {
        return this.f120230a;
    }

    @Override // w.z.a
    public <T> T b(@NonNull CameraCharacteristics.Key<T> key) {
        return (T) this.f120230a.get(key);
    }

    @Override // w.z.a
    @NonNull
    public Set<String> c() {
        return Collections.EMPTY_SET;
    }
}
