package a6;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a6.a$a, reason: collision with other inner class name */
    static class C0021a {
        static Interpolator a(float f11, float f12, float f13, float f14) {
            return new PathInterpolator(f11, f12, f13, f14);
        }

        static Interpolator b(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f11, float f12, float f13, float f14) {
        return C0021a.a(f11, f12, f13, f14);
    }

    public static Interpolator b(Path path) {
        return C0021a.b(path);
    }
}
