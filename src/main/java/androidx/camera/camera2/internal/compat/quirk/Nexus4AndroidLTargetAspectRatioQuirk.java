package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f3007a = Arrays.asList("NEXUS 4");

    static boolean h() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int g() {
        return 2;
    }
}
