package im0;

/* JADX INFO: loaded from: classes9.dex */
public final class h<T> extends io.reactivex.rxjava3.core.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final nr0.a<? extends T> f78341b;

    public h(nr0.a<? extends T> aVar) {
        this.f78341b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super T> bVar) {
        this.f78341b.subscribe(bVar);
    }
}
