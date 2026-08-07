package w0;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f120235a;

    public a() {
        this.f120235a = androidx.camera.extensions.internal.compat.quirk.a.b(GetAvailableKeysNeedsOnInit.class) != null;
    }

    @NonNull
    public List<CaptureRequest.Key> a(@NonNull ImageCaptureExtenderImpl imageCaptureExtenderImpl, @NonNull String str, @NonNull CameraCharacteristics cameraCharacteristics, @NonNull Context context) {
        if (this.f120235a) {
            imageCaptureExtenderImpl.onInit(str, cameraCharacteristics, context);
        }
        try {
            return imageCaptureExtenderImpl.getAvailableCaptureRequestKeys();
        } finally {
            if (this.f120235a) {
                imageCaptureExtenderImpl.onDeInit();
            }
        }
    }
}
