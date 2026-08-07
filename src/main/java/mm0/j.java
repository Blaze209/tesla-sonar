package mm0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class j<T, R> extends u<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<? extends T> f92375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.h<? super T, ? extends R> f92376b;

    static final class a<T, R> implements w<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super R> f92377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.h<? super T, ? extends R> f92378b;

        a(w<? super R> wVar, cm0.h<? super T, ? extends R> hVar) {
            this.f92377a = wVar;
            this.f92378b = hVar;
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            this.f92377a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(am0.b bVar) {
            this.f92377a.onSubscribe(bVar);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            try {
                R rApply = this.f92378b.apply(t11);
                Objects.requireNonNull(rApply, "The mapper function returned a null value.");
                this.f92377a.onSuccess(rApply);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                onError(th2);
            }
        }
    }

    public j(y<? extends T> yVar, cm0.h<? super T, ? extends R> hVar) {
        this.f92375a = yVar;
        this.f92376b = hVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super R> wVar) {
        this.f92375a.a(new a(wVar, this.f92376b));
    }
}
