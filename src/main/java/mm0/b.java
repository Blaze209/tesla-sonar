package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class b<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<T> f92350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.f f92351b;

    static final class a<T> extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.d, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super T> f92352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final y<T> f92353b;

        a(w<? super T> wVar, y<T> yVar) {
            this.f92352a = wVar;
            this.f92353b = yVar;
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.core.l
        public void onComplete() {
            this.f92353b.a(new gm0.l(this, this.f92352a));
        }

        @Override // io.reactivex.rxjava3.core.d
        public void onError(Throwable th2) {
            this.f92352a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.d
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.setOnce(this, bVar)) {
                this.f92352a.onSubscribe(this);
            }
        }
    }

    public b(y<T> yVar, io.reactivex.rxjava3.core.f fVar) {
        this.f92350a = yVar;
        this.f92351b = fVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        this.f92351b.b(new a(wVar, this.f92350a));
    }
}
