package ou;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m<T> implements Serializable {
    m() {
    }

    public static <T> m<T> a() {
        return a.f();
    }

    public static <T> m<T> d(T t11) {
        return new s(p.m(t11));
    }

    public abstract T b();

    public abstract boolean c();

    public abstract T e(T t11);
}
