package k3;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a&\u0010\t\u001a\u00060\u0001j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n*\f\b\u0000\u0010\u000b\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lk3/q1;", "Landroid/graphics/ColorFilter;", "b", "(Lk3/q1;)Landroid/graphics/ColorFilter;", "Lk3/p1;", "color", "Lk3/b1;", "blendMode", "Landroidx/compose/ui/graphics/NativeColorFilter;", "a", "(JI)Landroid/graphics/ColorFilter;", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g0 {
    public static final ColorFilter a(long j11, int i11) {
        return Build.VERSION.SDK_INT >= 29 ? f1.f84779a.a(j11, i11) : new PorterDuffColorFilter(r1.k(j11), d0.c(i11));
    }

    public static final ColorFilter b(q1 q1Var) {
        return q1Var.getNativeColorFilter();
    }
}
