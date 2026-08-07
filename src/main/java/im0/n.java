package im0;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public final class n<T> extends b<T, T> implements cm0.f<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.f<? super T> f78376c;

    static final class a<T> extends AtomicLong implements io.reactivex.rxjava3.core.i<T>, nr0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nr0.b<? super T> f78377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.f<? super T> f78378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        nr0.c f78379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f78380d;

        a(nr0.b<? super T> bVar, cm0.f<? super T> fVar) {
            this.f78377a = bVar;
            this.f78378b = fVar;
        }

        @Override // nr0.c
        public void cancel() {
            this.f78379c.cancel();
        }

        @Override // nr0.b
        public void onComplete() {
            if (this.f78380d) {
                return;
            }
            this.f78380d = true;
            this.f78377a.onComplete();
        }

        @Override // nr0.b
        public void onError(Throwable th2) {
            if (this.f78380d) {
                tm0.a.r(th2);
            } else {
                this.f78380d = true;
                this.f78377a.onError(th2);
            }
        }

        @Override // nr0.b
        public void onNext(T t11) {
            if (this.f78380d) {
                return;
            }
            if (get() != 0) {
                this.f78377a.onNext(t11);
                rm0.c.c(this, 1L);
                return;
            }
            try {
                this.f78378b.accept(t11);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.i, nr0.b
        public void onSubscribe(nr0.c cVar) {
            if (qm0.d.validate(this.f78379c, cVar)) {
                this.f78379c = cVar;
                this.f78377a.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // nr0.c
        public void request(long j11) {
            if (qm0.d.validate(j11)) {
                rm0.c.a(this, j11);
            }
        }
    }

    public n(io.reactivex.rxjava3.core.h<T> hVar) {
        super(hVar);
        this.f78376c = this;
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super T> bVar) {
        this.f78303b.x(new a(bVar, this.f78376c));
    }

    @Override // cm0.f
    public void accept(T t11) {
    }
}
