package gm0;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.d, am0.b {
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
        lazySet(dm0.b.DISPOSED);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void onError(Throwable th2) {
        lazySet(dm0.b.DISPOSED);
        tm0.a.r(new OnErrorNotImplementedException(th2));
    }

    @Override // io.reactivex.rxjava3.core.d
    public void onSubscribe(am0.b bVar) {
        dm0.b.setOnce(this, bVar);
    }
}
