package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k0 f14081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property<View, Float> f14082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property<View, Rect> f14083c;

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(j0.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f11) {
            j0.e(view, f11.floatValue());
        }
    }

    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f14081a = new o0();
        } else {
            f14081a = new n0();
        }
        f14082b = new a(Float.class, "translationAlpha");
        f14083c = new b(Rect.class, "clipBounds");
    }

    static void a(@NonNull View view) {
        f14081a.a(view);
    }

    static float b(@NonNull View view) {
        return f14081a.b(view);
    }

    static void c(@NonNull View view) {
        f14081a.c(view);
    }

    static void d(@NonNull View view, int i11, int i12, int i13, int i14) {
        f14081a.d(view, i11, i12, i13, i14);
    }

    static void e(@NonNull View view, float f11) {
        f14081a.e(view, f11);
    }

    static void f(@NonNull View view, int i11) {
        f14081a.f(view, i11);
    }

    static void g(@NonNull View view, @NonNull Matrix matrix) {
        f14081a.g(view, matrix);
    }

    static void h(@NonNull View view, @NonNull Matrix matrix) {
        f14081a.h(view, matrix);
    }
}
