package hm0;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends io.reactivex.rxjava3.core.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<?> f73183a;

    public c(Callable<?> callable) {
        this.f73183a = callable;
    }

    @Override // io.reactivex.rxjava3.core.b
    protected void j(io.reactivex.rxjava3.core.d dVar) {
        am0.b bVarEmpty = am0.b.empty();
        dVar.onSubscribe(bVarEmpty);
        try {
            this.f73183a.call();
            if (bVarEmpty.isDisposed()) {
                return;
            }
            dVar.onComplete();
        } catch (Throwable th2) {
            bm0.a.b(th2);
            if (bVarEmpty.isDisposed()) {
                tm0.a.r(th2);
            } else {
                dVar.onError(th2);
            }
        }
    }
}
