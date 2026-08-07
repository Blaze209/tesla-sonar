package im0;

/* JADX INFO: loaded from: classes9.dex */
public final class p<T> extends b<T, T> {

    static final class a<T> extends im0.a<T, T> {
        a(nr0.b<? super T> bVar) {
            super(bVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // nr0.b
        public void onNext(T t11) {
            this.f78302g.lazySet((R) t11);
            c();
        }
    }

    public p(io.reactivex.rxjava3.core.h<T> hVar) {
        super(hVar);
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super T> bVar) {
        this.f78303b.x(new a(bVar));
    }
}
