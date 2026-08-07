package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class g<T, R> extends u<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<? extends T> f92367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.h<? super T, ? extends y<? extends R>> f92368b;

    static final class a<T, R> extends AtomicReference<am0.b> implements w<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super R> f92369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.h<? super T, ? extends y<? extends R>> f92370b;

        /* JADX INFO: renamed from: mm0.g$a$a, reason: collision with other inner class name */
        static final class C1974a<R> implements w<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final AtomicReference<am0.b> f92371a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final w<? super R> f92372b;

            C1974a(AtomicReference<am0.b> atomicReference, w<? super R> wVar) {
                this.f92371a = atomicReference;
                this.f92372b = wVar;
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onError(Throwable th2) {
                this.f92372b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onSubscribe(am0.b bVar) {
                dm0.b.replace(this.f92371a, bVar);
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onSuccess(R r11) {
                this.f92372b.onSuccess(r11);
            }
        }

        a(w<? super R> wVar, cm0.h<? super T, ? extends y<? extends R>> hVar) {
            this.f92369a = wVar;
            this.f92370b = hVar;
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
            this.f92369a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.setOnce(this, bVar)) {
                this.f92369a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            try {
                y<? extends R> yVarApply = this.f92370b.apply(t11);
                Objects.requireNonNull(yVarApply, "The single returned by the mapper is null");
                y<? extends R> yVar = yVarApply;
                if (isDisposed()) {
                    return;
                }
                yVar.a(new C1974a(this, this.f92369a));
            } catch (Throwable th2) {
                bm0.a.b(th2);
                this.f92369a.onError(th2);
            }
        }
    }

    public g(y<? extends T> yVar, cm0.h<? super T, ? extends y<? extends R>> hVar) {
        this.f92368b = hVar;
        this.f92367a = yVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super R> wVar) {
        this.f92367a.a(new a(wVar, this.f92368b));
    }
}
