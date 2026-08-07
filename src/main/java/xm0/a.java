package xm0;

import io.reactivex.rxjava3.core.i;
import java.util.concurrent.atomic.AtomicReference;
import nr0.c;
import qm0.d;
import rm0.e;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a<T> implements i<T>, am0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<c> f123795a = new AtomicReference<>();

    protected void b() {
        this.f123795a.get().request(Long.MAX_VALUE);
    }

    @Override // am0.b
    public final void dispose() {
        d.cancel(this.f123795a);
    }

    @Override // am0.b
    public final boolean isDisposed() {
        return this.f123795a.get() == d.CANCELLED;
    }

    @Override // io.reactivex.rxjava3.core.i, nr0.b
    public final void onSubscribe(c cVar) {
        if (e.c(this.f123795a, cVar, getClass())) {
            b();
        }
    }
}
