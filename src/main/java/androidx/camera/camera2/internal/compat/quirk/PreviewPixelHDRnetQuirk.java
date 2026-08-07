package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f3008a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    static boolean g() {
        return "Google".equals(Build.MANUFACTURER) && f3008a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
