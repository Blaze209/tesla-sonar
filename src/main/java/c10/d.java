package c10;

import android.content.res.Resources;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"", "", "a", "(F)D", "dp", "b", "px", "react-native-keyboard-controller_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    public static final double a(float f11) {
        return f11 / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final double b(float f11) {
        return f11 * Resources.getSystem().getDisplayMetrics().density;
    }
}
