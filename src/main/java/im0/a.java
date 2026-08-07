package im0;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
abstract class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.i<T>, nr0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final nr0.b<? super R> f78296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    nr0.c f78297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f78298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Throwable f78299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f78300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicLong f78301f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AtomicReference<R> f78302g = new AtomicReference<>();

    a(nr0.b<? super R> bVar) {
        this.f78296a = bVar;
    }

    boolean b(boolean z11, boolean z12, nr0.b<?> bVar, AtomicReference<R> atomicReference) {
        if (this.f78300e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable th2 = this.f78299d;
        if (th2 != null) {
            atomicReference.lazySet(null);
            bVar.onError(th2);
            return true;
        }
        if (!z12) {
            return false;
        }
        bVar.onComplete();
        return true;
    }

    void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        nr0.b<? super R> bVar = this.f78296a;
        AtomicLong atomicLong = this.f78301f;
        AtomicReference<R> atomicReference = this.f78302g;
        int iAddAndGet = 1;
        do {
            long j11 = 0;
            while (true) {
                if (j11 == atomicLong.get()) {
                    break;
                }
                boolean z11 = this.f78298c;
                R andSet = atomicReference.getAndSet(null);
                boolean z12 = andSet == null;
                if (b(z11, z12, bVar, atomicReference)) {
                    return;
                }
                if (z12) {
                    break;
                }
                bVar.onNext(andSet);
                j11++;
            }
            if (j11 == atomicLong.get()) {
                if (b(this.f78298c, atomicReference.get() == null, bVar, atomicReference)) {
                    return;
                }
            }
            if (j11 != 0) {
                rm0.c.c(atomicLong, j11);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // nr0.c
    public void cancel() {
        if (this.f78300e) {
            return;
        }
        this.f78300e = true;
        this.f78297b.cancel();
        if (getAndIncrement() == 0) {
            this.f78302g.lazySet(null);
        }
    }

    @Override // nr0.b
    public void onComplete() {
        this.f78298c = true;
        c();
    }

    @Override // nr0.b
    public void onError(Throwable th2) {
        this.f78299d = th2;
        this.f78298c = true;
        c();
    }

    @Override // io.reactivex.rxjava3.core.i, nr0.b
    public void onSubscribe(nr0.c cVar) {
        if (qm0.d.validate(this.f78297b, cVar)) {
            this.f78297b = cVar;
            this.f78296a.onSubscribe(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // nr0.c
    public void request(long j11) {
        if (qm0.d.validate(j11)) {
            rm0.c.a(this.f78301f, j11);
            c();
        }
    }
}
