package ez;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/camera/core/f$c;", "Landroid/util/Range;", "", "frameRate", "Ljn0/h0;", "a", "(Landroidx/camera/core/f$c;Landroid/util/Range;)V", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f {
    public static final void a(androidx.camera.core.f.c cVar, Range<Integer> frameRate) {
        s.k(cVar, "<this>");
        s.k(frameRate, "frameRate");
        new b0.i(cVar).a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, frameRate);
    }
}
