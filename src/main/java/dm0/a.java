package dm0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends AtomicReference<cm0.e> implements am0.b {
    public a(cm0.e eVar) {
        super(eVar);
    }

    @Override // am0.b
    public void dispose() {
        cm0.e andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Throwable th2) {
            bm0.a.b(th2);
            tm0.a.r(th2);
        }
    }

    @Override // am0.b
    public boolean isDisposed() {
        return get() == null;
    }
}
