package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f3 {
    f3() {
    }

    @NonNull
    public static f3 a(@NonNull Size size, @NonNull Map<Integer, Size> map, @NonNull Size size2, @NonNull Map<Integer, Size> map2, @NonNull Size size3, @NonNull Map<Integer, Size> map3, @NonNull Map<Integer, Size> map4) {
        return new o(size, map, size2, map2, size3, map3, map4);
    }

    @NonNull
    public abstract Size b();

    @NonNull
    public Size c(int i11) {
        return d().get(Integer.valueOf(i11));
    }

    @NonNull
    public abstract Map<Integer, Size> d();

    @NonNull
    public abstract Size e();

    @NonNull
    public abstract Size f();

    @NonNull
    public Size g(int i11) {
        return h().get(Integer.valueOf(i11));
    }

    @NonNull
    public abstract Map<Integer, Size> h();

    @NonNull
    public Size i(int i11) {
        return j().get(Integer.valueOf(i11));
    }

    @NonNull
    public abstract Map<Integer, Size> j();

    public Size k(int i11) {
        return l().get(Integer.valueOf(i11));
    }

    @NonNull
    public abstract Map<Integer, Size> l();
}
