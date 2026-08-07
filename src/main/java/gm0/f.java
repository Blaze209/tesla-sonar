package gm0;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.d, am0.b, cm0.f<Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final cm0.f<? super Throwable> f69235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.a f69236b;

    public f(cm0.a aVar) {
        this.f69235a = this;
        this.f69236b = aVar;
    }

    @Override // cm0.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        tm0.a.r(new OnErrorNotImplementedException(th2));
    }

    @Override // am0.b
    public void dispose() {
        dm0.b.dispose(this);
    }

    @Override // am0.b
    public boolean isDisposed() {
        return get() == dm0.b.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.core.l
    public void onComplete() {
        try {
            this.f69236b.run();
        } catch (Throwable th2) {
            bm0.a.b(th2);
            tm0.a.r(th2);
        }
        lazySet(dm0.b.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void onError(Throwable th2) {
        try {
            this.f69235a.accept(th2);
        } catch (Throwable th3) {
            bm0.a.b(th3);
            tm0.a.r(th3);
        }
        lazySet(dm0.b.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void onSubscribe(am0.b bVar) {
        dm0.b.setOnce(this, bVar);
    }

    public f(cm0.f<? super Throwable> fVar, cm0.a aVar) {
        this.f69235a = fVar;
        this.f69236b = aVar;
    }
}
