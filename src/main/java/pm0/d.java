package pm0;

import io.reactivex.rxjava3.core.i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rm0.h;

/* JADX INFO: loaded from: classes9.dex */
public class d<T> extends AtomicInteger implements i<T>, nr0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final nr0.b<? super T> f103467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final rm0.b f103468b = new rm0.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicLong f103469c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<nr0.c> f103470d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f103471e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f103472f;

    public d(nr0.b<? super T> bVar) {
        this.f103467a = bVar;
    }

    @Override // nr0.c
    public void cancel() {
        if (this.f103472f) {
            return;
        }
        qm0.d.cancel(this.f103470d);
    }

    @Override // nr0.b
    public void onComplete() {
        this.f103472f = true;
        h.a(this.f103467a, this, this.f103468b);
    }

    @Override // nr0.b
    public void onError(Throwable th2) {
        this.f103472f = true;
        h.b(this.f103467a, th2, this, this.f103468b);
    }

    @Override // nr0.b
    public void onNext(T t11) {
        h.c(this.f103467a, t11, this, this.f103468b);
    }

    @Override // io.reactivex.rxjava3.core.i, nr0.b
    public void onSubscribe(nr0.c cVar) {
        if (this.f103471e.compareAndSet(false, true)) {
            this.f103467a.onSubscribe(this);
            qm0.d.deferredSetOnce(this.f103470d, this.f103469c, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // nr0.c
    public void request(long j11) {
        if (j11 > 0) {
            qm0.d.deferredRequest(this.f103470d, this.f103469c, j11);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j11));
    }
}
