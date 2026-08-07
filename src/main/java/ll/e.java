package ll;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lll/e;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "to", "from", "Ljn0/h0;", "a", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "drawable", "Lll/d;", "properties", "e", "(Landroid/graphics/drawable/Drawable;Lll/d;)V", "Landroid/graphics/drawable/Drawable$Callback;", "callback", "Lll/g0;", "transformCallback", DateTokenConverter.CONVERTER_KEY, "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable$Callback;Lll/g0;)V", "", "color", "alpha", "c", "(II)I", "b", "(I)I", "drawee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f90107a = new e();

    private e() {
    }

    public static final void a(Drawable to2, Drawable from) {
        if (from == null || to2 == null || to2 == from) {
            return;
        }
        to2.setBounds(from.getBounds());
        to2.setChangingConfigurations(from.getChangingConfigurations());
        to2.setLevel(from.getLevel());
        to2.setVisible(from.isVisible(), false);
        to2.setState(from.getState());
    }

    public static final int b(int color) {
        int i11 = color >>> 24;
        if (i11 != 0) {
            return i11 != 255 ? -3 : -1;
        }
        return -2;
    }

    public static final int c(int color, int alpha) {
        if (alpha == 255) {
            return color;
        }
        if (alpha == 0) {
            return color & 16777215;
        }
        return (color & 16777215) | ((((color >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Drawable drawable, Drawable.Callback callback, g0 transformCallback) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        f0 f0Var = drawable instanceof f0 ? (f0) drawable : null;
        if (f0Var != null) {
            f0Var.i(transformCallback);
        }
    }

    public static final void e(Drawable drawable, d properties) {
        if (drawable == null || properties == null) {
            return;
        }
        properties.a(drawable);
    }
}
