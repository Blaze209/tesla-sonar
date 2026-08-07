package im0;

import io.reactivex.rxjava3.core.r;
import io.reactivex.rxjava3.core.s;

/* JADX INFO: loaded from: classes9.dex */
public final class g<T> extends io.reactivex.rxjava3.core.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r<T> f78338b;

    public g(r<T> rVar) {
        this.f78338b = rVar;
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super T> bVar) {
        this.f78338b.a(new a(bVar));
    }

    static final class a<T> implements s<T>, nr0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nr0.b<? super T> f78339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        am0.b f78340b;

        a(nr0.b<? super T> bVar) {
            this.f78339a = bVar;
        }

        @Override // nr0.c
        public void cancel() {
            this.f78340b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f78339a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            this.f78339a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            this.f78339a.onNext(t11);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            this.f78340b = bVar;
            this.f78339a.onSubscribe(this);
        }

        @Override // nr0.c
        public void request(long j11) {
        }
    }
}
