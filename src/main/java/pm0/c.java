package pm0;

import cm0.f;
import io.reactivex.rxjava3.core.i;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class c<T> extends AtomicReference<nr0.c> implements i<T>, nr0.c, am0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final f<? super T> f103463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final f<? super Throwable> f103464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.a f103465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final f<? super nr0.c> f103466d;

    public c(f<? super T> fVar, f<? super Throwable> fVar2, cm0.a aVar, f<? super nr0.c> fVar3) {
        this.f103463a = fVar;
        this.f103464b = fVar2;
        this.f103465c = aVar;
        this.f103466d = fVar3;
    }

    @Override // nr0.c
    public void cancel() {
        qm0.d.cancel(this);
    }

    @Override // am0.b
    public void dispose() {
        cancel();
    }

    @Override // am0.b
    public boolean isDisposed() {
        return get() == qm0.d.CANCELLED;
    }

    @Override // nr0.b
    public void onComplete() {
        nr0.c cVar = get();
        qm0.d dVar = qm0.d.CANCELLED;
        if (cVar != dVar) {
            lazySet(dVar);
            try {
                this.f103465c.run();
            } catch (Throwable th2) {
                bm0.a.b(th2);
                tm0.a.r(th2);
            }
        }
    }

    @Override // nr0.b
    public void onError(Throwable th2) {
        nr0.c cVar = get();
        qm0.d dVar = qm0.d.CANCELLED;
        if (cVar == dVar) {
            tm0.a.r(th2);
            return;
        }
        lazySet(dVar);
        try {
            this.f103464b.accept(th2);
        } catch (Throwable th3) {
            bm0.a.b(th3);
            tm0.a.r(new CompositeException(th2, th3));
        }
    }

    @Override // nr0.b
    public void onNext(T t11) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f103463a.accept(t11);
        } catch (Throwable th2) {
            bm0.a.b(th2);
            get().cancel();
            onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.i, nr0.b
    public void onSubscribe(nr0.c cVar) {
        if (qm0.d.setOnce(this, cVar)) {
            try {
                this.f103466d.accept(this);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                cVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // nr0.c
    public void request(long j11) {
        get().request(j11);
    }
}
