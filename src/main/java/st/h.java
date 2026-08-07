package st;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.internal.d0;

/* JADX INFO: loaded from: classes5.dex */
public class h {
    @NonNull
    static d a(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? b() : new e();
        }
        return new j();
    }

    @NonNull
    static d b() {
        return new j();
    }

    @NonNull
    static f c() {
        return new f();
    }

    public static void d(@NonNull View view, float f11) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).a0(f11);
        }
    }

    public static void e(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(@NonNull View view, @NonNull g gVar) {
        if (gVar.S()) {
            gVar.f0(d0.k(view));
        }
    }
}
