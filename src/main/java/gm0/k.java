package gm0;

import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class k<T> extends AtomicReference<am0.b> implements s<T>, am0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final cm0.f<? super T> f69245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.f<? super Throwable> f69246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.a f69247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final cm0.f<? super am0.b> f69248d;

    public k(cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2, cm0.a aVar, cm0.f<? super am0.b> fVar3) {
        this.f69245a = fVar;
        this.f69246b = fVar2;
        this.f69247c = aVar;
        this.f69248d = fVar3;
    }

    @Override // am0.b
    public void dispose() {
        dm0.b.dispose(this);
    }

    @Override // am0.b
    public boolean isDisposed() {
        return get() == dm0.b.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(dm0.b.DISPOSED);
        try {
            this.f69247c.run();
        } catch (Throwable th2) {
            bm0.a.b(th2);
            tm0.a.r(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onError(Throwable th2) {
        if (isDisposed()) {
            tm0.a.r(th2);
            return;
        }
        lazySet(dm0.b.DISPOSED);
        try {
            this.f69246b.accept(th2);
        } catch (Throwable th3) {
            bm0.a.b(th3);
            tm0.a.r(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onNext(T t11) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f69245a.accept(t11);
        } catch (Throwable th2) {
            bm0.a.b(th2);
            get().dispose();
            onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onSubscribe(am0.b bVar) {
        if (dm0.b.setOnce(this, bVar)) {
            try {
                this.f69248d.accept(this);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                bVar.dispose();
                onError(th2);
            }
        }
    }
}
