package vv;

import yu.z;

/* JADX INFO: loaded from: classes5.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f119863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f119864b;

    public a(Class<T> cls, T t11) {
        this.f119863a = (Class) z.b(cls);
        this.f119864b = (T) z.b(t11);
    }

    public T a() {
        return this.f119864b;
    }

    public Class<T> b() {
        return this.f119863a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f119863a, this.f119864b);
    }
}
