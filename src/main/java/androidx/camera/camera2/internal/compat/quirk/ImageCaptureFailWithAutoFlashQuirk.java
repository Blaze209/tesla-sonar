package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f2995a = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean g(@NonNull z zVar) {
        return f2995a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
