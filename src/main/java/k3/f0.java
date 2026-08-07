package k3;

import android.graphics.Canvas;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\"\u0019\u0010\u000e\u001a\u00060\u0005j\u0002`\u000b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\r*\n\u0010\u000f\"\u00020\u00052\u00020\u0005¨\u0006\u0010"}, d2 = {"Lk3/i3;", "image", "Lk3/j1;", "a", "(Lk3/i3;)Lk3/j1;", "Landroid/graphics/Canvas;", "c", "b", "(Landroid/graphics/Canvas;)Lk3/j1;", "Landroid/graphics/Canvas;", "EmptyCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", DateTokenConverter.CONVERTER_KEY, "(Lk3/j1;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Canvas f84778a = new Canvas();

    public static final j1 a(i3 i3Var) {
        e0 e0Var = new e0();
        e0Var.z(new Canvas(n0.b(i3Var)));
        return e0Var;
    }

    public static final j1 b(Canvas canvas) {
        e0 e0Var = new e0();
        e0Var.z(canvas);
        return e0Var;
    }

    public static final Canvas d(j1 j1Var) {
        p013kotlin.jvm.internal.s.i(j1Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((e0) j1Var).b();
    }
}
