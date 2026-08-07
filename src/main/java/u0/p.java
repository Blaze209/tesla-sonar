package u0;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.z2;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface p {
    @NonNull
    default Map<Integer, List<Size>> a(@NonNull Size size) {
        return Collections.EMPTY_MAP;
    }

    @NonNull
    default List<Pair<Integer, Size[]>> b() {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    default List<CaptureResult.Key> c() {
        return Collections.EMPTY_LIST;
    }

    default boolean d() {
        return false;
    }

    default boolean e(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map) {
        return false;
    }

    default boolean f() {
        return false;
    }

    @NonNull
    default Size[] g() {
        return new Size[0];
    }

    default boolean h() {
        return false;
    }

    @NonNull
    default List<Pair<Integer, Size[]>> i() {
        return Collections.EMPTY_LIST;
    }

    default z2 j(@NonNull Context context) {
        return null;
    }

    default boolean k() {
        q qVar = q.f115243c;
        if (g.c(qVar) || h.f(qVar)) {
            return false;
        }
        return !c().isEmpty();
    }

    default boolean m() {
        return false;
    }

    default void l(@NonNull c0.n nVar) {
    }
}
