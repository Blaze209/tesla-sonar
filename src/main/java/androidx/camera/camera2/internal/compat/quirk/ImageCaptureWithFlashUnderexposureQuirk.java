package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureWithFlashUnderexposureQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f3001a = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    static boolean g(@NonNull z zVar) {
        return f3001a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
