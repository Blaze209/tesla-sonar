package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
interface i {
    default int b() {
        return 0;
    }

    @NonNull
    Map<CaptureRequest.Key<?>, Object> c();

    int d();

    @NonNull
    List<g> e();
}
