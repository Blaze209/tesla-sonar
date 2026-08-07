package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final class h<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f92373a;

    public h(Callable<? extends T> callable) {
        this.f92373a = callable;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        am0.b bVarEmpty = am0.b.empty();
        wVar.onSubscribe(bVarEmpty);
        if (bVarEmpty.isDisposed()) {
            return;
        }
        try {
            T tCall = this.f92373a.call();
            Objects.requireNonNull(tCall, "The callable returned a null value");
            if (bVarEmpty.isDisposed()) {
                return;
            }
            wVar.onSuccess(tCall);
        } catch (Throwable th2) {
            bm0.a.b(th2);
            if (bVarEmpty.isDisposed()) {
                tm0.a.r(th2);
            } else {
                wVar.onError(th2);
            }
        }
    }
}
