package i1;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    @NonNull
    public static Pair<Double, Double> a(double d11, double d12) {
        if (androidx.camera.video.internal.compat.quirk.a.b(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d11 = b(d11);
            d12 = b(d12);
        }
        return Pair.create(Double.valueOf(d11), Double.valueOf(d12));
    }

    private static double b(double d11) {
        return d11 >= 0.0d ? d11 : ((d11 * 10000.0d) - 1.0d) / 10000.0d;
    }
}
