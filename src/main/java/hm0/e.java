package hm0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends io.reactivex.rxjava3.core.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.f f73186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final t f73187b;

    static final class a extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.d, am0.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.d f73188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dm0.e f73189b = new dm0.e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f73190c;

        a(io.reactivex.rxjava3.core.d dVar, io.reactivex.rxjava3.core.f fVar) {
            this.f73188a = dVar;
            this.f73190c = fVar;
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
            this.f73189b.dispose();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.core.l
        public void onComplete() {
            this.f73188a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.d
        public void onError(Throwable th2) {
            this.f73188a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.d
        public void onSubscribe(am0.b bVar) {
            dm0.b.setOnce(this, bVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f73190c.b(this);
        }
    }

    public e(io.reactivex.rxjava3.core.f fVar, t tVar) {
        this.f73186a = fVar;
        this.f73187b = tVar;
    }

    @Override // io.reactivex.rxjava3.core.b
    protected void j(io.reactivex.rxjava3.core.d dVar) {
        a aVar = new a(dVar, this.f73186a);
        dVar.onSubscribe(aVar);
        aVar.f73189b.a(this.f73187b.scheduleDirect(aVar));
    }
}
