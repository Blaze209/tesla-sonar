package k3;

import android.graphics.Shader;
import android.os.Build;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0004"}, d2 = {"Lk3/l4;", "Landroid/graphics/Shader$TileMode;", "a", "(I)Landroid/graphics/Shader$TileMode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class y0 {
    public static final Shader.TileMode a(int i11) {
        l4.Companion companion = l4.INSTANCE;
        if (l4.f(i11, companion.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (l4.f(i11, companion.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (l4.f(i11, companion.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (l4.f(i11, companion.b())) {
            return Build.VERSION.SDK_INT >= 31 ? n4.f84837a.b() : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
