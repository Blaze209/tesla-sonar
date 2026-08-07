package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes3.dex */
class j {

    static class a {
        static <T, V> ObjectAnimator a(T t11, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t11, property, (TypeConverter) null, path);
        }
    }

    static <T> ObjectAnimator a(T t11, Property<T, PointF> property, Path path) {
        return a.a(t11, property, path);
    }
}
