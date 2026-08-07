package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final cm0.k<? extends Throwable> f92366a;

    public f(cm0.k<? extends Throwable> kVar) {
        this.f92366a = kVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        try {
            th = (Throwable) rm0.g.c(this.f92366a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th2) {
            th = th2;
            bm0.a.b(th);
        }
        dm0.c.error(th, wVar);
    }
}
