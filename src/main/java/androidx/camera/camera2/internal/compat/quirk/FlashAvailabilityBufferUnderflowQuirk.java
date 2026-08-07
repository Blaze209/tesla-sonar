package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<Pair<String, String>> f2993a = new HashSet();

    static {
        g("sprd", "lemp");
        g("sprd", "DM20C");
    }

    private static void g(@NonNull String str, @NonNull String str2) {
        Set<Pair<String, String>> set = f2993a;
        Locale locale = Locale.US;
        set.add(new Pair<>(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    static boolean h() {
        Set<Pair<String, String>> set = f2993a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
