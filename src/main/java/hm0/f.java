package hm0;

import io.reactivex.rxjava3.core.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends io.reactivex.rxjava3.core.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f73191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TimeUnit f73192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final t f73193c;

    static final class a extends AtomicReference<am0.b> implements am0.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.d f73194a;

        a(io.reactivex.rxjava3.core.d dVar) {
            this.f73194a = dVar;
        }

        void a(am0.b bVar) {
            dm0.b.replace(this, bVar);
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return dm0.b.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f73194a.onComplete();
        }
    }

    public f(long j11, TimeUnit timeUnit, t tVar) {
        this.f73191a = j11;
        this.f73192b = timeUnit;
        this.f73193c = tVar;
    }

    @Override // io.reactivex.rxjava3.core.b
    protected void j(io.reactivex.rxjava3.core.d dVar) {
        a aVar = new a(dVar);
        dVar.onSubscribe(aVar);
        aVar.a(this.f73193c.scheduleDirect(aVar, this.f73191a, this.f73192b));
    }
}
