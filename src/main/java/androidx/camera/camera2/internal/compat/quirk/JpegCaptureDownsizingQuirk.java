package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f3005a = new HashSet(Arrays.asList("redmi note 8 pro"));

    static boolean g(@NonNull z zVar) {
        return f3005a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
