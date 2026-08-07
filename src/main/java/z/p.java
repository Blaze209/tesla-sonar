package z;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.core.impl.x2;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rational f126047a = new Rational(16, 9);

    private static boolean a(@NonNull Size size, @NonNull Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(@NonNull Size size, @NonNull x2.b bVar) {
        if (((PreviewPixelHDRnetQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(PreviewPixelHDRnetQuirk.class)) == null || a(size, f126047a)) {
            return;
        }
        u.a.C2464a c2464a = new u.a.C2464a();
        c2464a.f(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c2464a.a());
    }
}
