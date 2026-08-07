package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f44551a;

    private g() {
        this.f44551a = null;
    }

    public static <T> g<T> a() {
        return new g<>();
    }

    public static <T> g<T> b(T t11) {
        return t11 == null ? a() : e(t11);
    }

    public static <T> g<T> e(T t11) {
        return new g<>(t11);
    }

    public T c() {
        T t11 = this.f44551a;
        if (t11 != null) {
            return t11;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f44551a != null;
    }

    private g(T t11) {
        if (t11 != null) {
            this.f44551a = t11;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
