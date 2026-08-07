package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class StillCaptureFlashStopRepeatingQuirk implements m2 {
    static boolean g() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
