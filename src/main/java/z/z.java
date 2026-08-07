package z;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.r2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f126063b;

    public z(@NonNull r2 r2Var) {
        this.f126062a = CaptureIntentPreviewQuirk.e(r2Var);
        this.f126063b = r2Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @NonNull
    public Map<CaptureRequest.Key<?>, Object> a(int i11) {
        if (i11 == 3 && this.f126062a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(map);
        }
        if (i11 != 4 || !this.f126063b) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap();
        map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(map2);
    }
}
