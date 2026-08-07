package lm0;

/* JADX INFO: loaded from: classes9.dex */
public final class h<T> extends a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cm0.f<? super am0.b> f90381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cm0.a f90382c;

    public h(io.reactivex.rxjava3.core.o<T> oVar, cm0.f<? super am0.b> fVar, cm0.a aVar) {
        super(oVar);
        this.f90381b = fVar;
        this.f90382c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        this.f90266a.a(new gm0.i(sVar, this.f90381b, this.f90382c));
    }
}
