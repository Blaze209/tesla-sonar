package lm0;

/* JADX INFO: loaded from: classes9.dex */
public final class r<T> extends io.reactivex.rxjava3.core.o<T> implements fm0.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f90432a;

    public r(T t11) {
        this.f90432a = t11;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        v.a aVar = new v.a(sVar, this.f90432a);
        sVar.onSubscribe(aVar);
        aVar.run();
    }

    @Override // fm0.f, cm0.k
    public T get() {
        return this.f90432a;
    }
}
