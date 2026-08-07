package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class m<T> extends u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<? extends T> f92390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.h<? super Throwable, ? extends y<? extends T>> f92391b;

    static final class a<T> extends AtomicReference<am0.b> implements w<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super T> f92392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.h<? super Throwable, ? extends y<? extends T>> f92393b;

        a(w<? super T> wVar, cm0.h<? super Throwable, ? extends y<? extends T>> hVar) {
            this.f92392a = wVar;
            this.f92393b = hVar;
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
            try {
                y<? extends T> yVarApply = this.f92393b.apply(th2);
                Objects.requireNonNull(yVarApply, "The nextFunction returned a null SingleSource.");
                yVarApply.a(new gm0.l(this, this.f92392a));
            } catch (Throwable th3) {
                bm0.a.b(th3);
                this.f92392a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.setOnce(this, bVar)) {
                this.f92392a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            this.f92392a.onSuccess(t11);
        }
    }

    public m(y<? extends T> yVar, cm0.h<? super Throwable, ? extends y<? extends T>> hVar) {
        this.f92390a = yVar;
        this.f92391b = hVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super T> wVar) {
        this.f92390a.a(new a(wVar, this.f92391b));
    }
}
