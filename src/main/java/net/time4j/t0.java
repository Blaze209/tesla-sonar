package net.time4j;

/* JADX INFO: loaded from: classes9.dex */
final class t0<T> implements net.time4j.engine.u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.u<T> f94745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f94746b;

    private t0(net.time4j.engine.u<T> uVar, Object obj) {
        this.f94745a = uVar;
        this.f94746b = obj;
    }

    static <T> t0 a(net.time4j.engine.u<T> uVar, Object obj) {
        return new t0(uVar, obj);
    }

    @Override // net.time4j.engine.u
    public T apply(T t11) {
        return this.f94745a.apply(t11);
    }
}
