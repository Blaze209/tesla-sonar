package mm0;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class k<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<T> f92379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final t f92380b;

    static final class a<T> extends AtomicReference<am0.b> implements w<T>, am0.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super T> f92381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t f92382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f92383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Throwable f92384d;

        a(w<? super T> wVar, t tVar) {
            this.f92381a = wVar;
            this.f92382b = tVar;
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            this.f92384d = th2;
            dm0.b.replace(this, this.f92382b.scheduleDirect(this));
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.setOnce(this, bVar)) {
                this.f92381a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            this.f92383c = t11;
            dm0.b.replace(this, this.f92382b.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f92384d;
            if (th2 != null) {
                this.f92381a.onError(th2);
            } else {
                this.f92381a.onSuccess(this.f92383c);
            }
        }
    }

    public k(y<T> yVar, t tVar) {
        this.f92379a = yVar;
        this.f92380b = tVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        this.f92379a.a(new a(wVar, this.f92380b));
    }
}
