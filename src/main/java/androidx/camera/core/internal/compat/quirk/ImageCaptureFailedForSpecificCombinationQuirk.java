package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import c0.a2;
import c0.h1;
import c0.r0;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f3404a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    private static boolean g() {
        return "oneplus".equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return "google".equalsIgnoreCase(Build.BRAND) && f3404a.contains(Build.MODEL.toLowerCase());
    }

    private boolean i(@NonNull Collection<a2> collection) {
        if (collection.size() != 3) {
            return false;
        }
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (a2 a2Var : collection) {
            if (a2Var instanceof h1) {
                z11 = true;
            } else if (a2Var instanceof r0) {
                z13 = true;
            } else if (a2Var.k().e(o3.C)) {
                z12 = a2Var.k().U() == p3.b.VIDEO_CAPTURE;
            }
        }
        return z11 && z12 && z13;
    }

    static boolean j() {
        return g() || h();
    }

    private boolean l(@NonNull String str, @NonNull Collection<a2> collection) {
        return str.equals("1") && i(collection);
    }

    private boolean m(@NonNull String str, @NonNull Collection<a2> collection) {
        return str.equals("1") && i(collection);
    }

    public boolean k(@NonNull String str, @NonNull Collection<a2> collection) {
        if (g()) {
            return l(str, collection);
        }
        if (h()) {
            return m(str, collection);
        }
        return false;
    }
}
