package gm0;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class d<T> extends AtomicReference<am0.b> implements w<T>, am0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final cm0.b<? super T, ? super Throwable> f69230a;

    public d(cm0.b<? super T, ? super Throwable> bVar) {
        this.f69230a = bVar;
    }

    @Override // am0.b
    public void dispose() {
        dm0.b.dispose(this);
    }

    @Override // am0.b
    public boolean isDisposed() {
        return get() == dm0.b.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.w
    public void onError(Throwable th2) {
        try {
            lazySet(dm0.b.DISPOSED);
            this.f69230a.accept(null, th2);
        } catch (Throwable th3) {
            bm0.a.b(th3);
            tm0.a.r(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public void onSubscribe(am0.b bVar) {
        dm0.b.setOnce(this, bVar);
    }

    @Override // io.reactivex.rxjava3.core.w
    public void onSuccess(T t11) {
        try {
            lazySet(dm0.b.DISPOSED);
            this.f69230a.accept(t11, null);
        } catch (Throwable th2) {
            bm0.a.b(th2);
            tm0.a.r(th2);
        }
    }
}
