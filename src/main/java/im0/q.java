package im0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class q<T, R> extends u<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final nr0.a<T> f78384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final R f78385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.c<R, ? super T, R> f78386c;

    static final class a<T, R> implements io.reactivex.rxjava3.core.i<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w<? super R> f78387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.c<R, ? super T, R> f78388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        R f78389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        nr0.c f78390d;

        a(w<? super R> wVar, cm0.c<R, ? super T, R> cVar, R r11) {
            this.f78387a = wVar;
            this.f78389c = r11;
            this.f78388b = cVar;
        }

        @Override // am0.b
        public void dispose() {
            this.f78390d.cancel();
            this.f78390d = qm0.d.CANCELLED;
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f78390d == qm0.d.CANCELLED;
        }

        @Override // nr0.b
        public void onComplete() {
            R r11 = this.f78389c;
            if (r11 != null) {
                this.f78389c = null;
                this.f78390d = qm0.d.CANCELLED;
                this.f78387a.onSuccess(r11);
            }
        }

        @Override // nr0.b
        public void onError(Throwable th2) {
            if (this.f78389c == null) {
                tm0.a.r(th2);
                return;
            }
            this.f78389c = null;
            this.f78390d = qm0.d.CANCELLED;
            this.f78387a.onError(th2);
        }

        @Override // nr0.b
        public void onNext(T t11) {
            R r11 = this.f78389c;
            if (r11 != null) {
                try {
                    R rApply = this.f78388b.apply(r11, t11);
                    Objects.requireNonNull(rApply, "The reducer returned a null value");
                    this.f78389c = rApply;
                } catch (Throwable th2) {
                    bm0.a.b(th2);
                    this.f78390d.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.i, nr0.b
        public void onSubscribe(nr0.c cVar) {
            if (qm0.d.validate(this.f78390d, cVar)) {
                this.f78390d = cVar;
                this.f78387a.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }
    }

    public q(nr0.a<T> aVar, R r11, cm0.c<R, ? super T, R> cVar) {
        this.f78384a = aVar;
        this.f78385b = r11;
        this.f78386c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.u
    protected void u(w<? super R> wVar) {
        this.f78384a.subscribe(new a(wVar, this.f78386c, this.f78385b));
    }
}
