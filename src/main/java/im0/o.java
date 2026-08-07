package im0;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public final class o<T> extends b<T, T> {

    static final class a<T> extends AtomicLong implements io.reactivex.rxjava3.core.i<T>, nr0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nr0.b<? super T> f78381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        nr0.c f78382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f78383c;

        a(nr0.b<? super T> bVar) {
            this.f78381a = bVar;
        }

        @Override // nr0.c
        public void cancel() {
            this.f78382b.cancel();
        }

        @Override // nr0.b
        public void onComplete() {
            if (this.f78383c) {
                return;
            }
            this.f78383c = true;
            this.f78381a.onComplete();
        }

        @Override // nr0.b
        public void onError(Throwable th2) {
            if (this.f78383c) {
                tm0.a.r(th2);
            } else {
                this.f78383c = true;
                this.f78381a.onError(th2);
            }
        }

        @Override // nr0.b
        public void onNext(T t11) {
            if (this.f78383c) {
                return;
            }
            if (get() != 0) {
                this.f78381a.onNext(t11);
                rm0.c.c(this, 1L);
            } else {
                this.f78382b.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        @Override // io.reactivex.rxjava3.core.i, nr0.b
        public void onSubscribe(nr0.c cVar) {
            if (qm0.d.validate(this.f78382b, cVar)) {
                this.f78382b = cVar;
                this.f78381a.onSubscribe(this);
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

    public o(io.reactivex.rxjava3.core.h<T> hVar) {
        super(hVar);
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super T> bVar) {
        this.f78303b.x(new a(bVar));
    }
}
