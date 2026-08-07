package mm0;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class n<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<? extends T> f92394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final t f92395b;

    static final class a<T> extends AtomicReference<am0.b> implements w<T>, am0.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super T> f92396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dm0.e f92397b = new dm0.e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final y<? extends T> f92398c;

        a(w<? super T> wVar, y<? extends T> yVar) {
            this.f92396a = wVar;
            this.f92398c = yVar;
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
            this.f92397b.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            this.f92396a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            dm0.b.setOnce(this, bVar);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            this.f92396a.onSuccess(t11);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f92398c.a(this);
        }
    }

    public n(y<? extends T> yVar, t tVar) {
        this.f92394a = yVar;
        this.f92395b = tVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        a aVar = new a(wVar, this.f92394a);
        wVar.onSubscribe(aVar);
        aVar.f92397b.a(this.f92395b.scheduleDirect(aVar));
    }
}
