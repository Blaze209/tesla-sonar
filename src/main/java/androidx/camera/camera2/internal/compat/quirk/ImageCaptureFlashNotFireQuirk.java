package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f2997a = Arrays.asList("itel w6004");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f2998b = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean g(@NonNull z zVar) {
        List<String> list = f2998b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f2997a.contains(str.toLowerCase(locale));
    }
}
