package oy;

import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f100078a;

    public l() {
    }

    public T a() {
        return this.f100078a;
    }

    public void b(Dynamic dynamic) {
        this.f100078a = c(dynamic);
    }

    abstract T c(Dynamic dynamic);

    public l(T t11) {
        this.f100078a = t11;
    }
}
