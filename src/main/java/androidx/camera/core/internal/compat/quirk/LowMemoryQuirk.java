package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class LowMemoryQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f3408a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    static boolean g() {
        return f3408a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
