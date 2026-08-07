package dm0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends AtomicReference<am0.b> implements am0.b {
    public e() {
    }

    public boolean a(am0.b bVar) {
        return b.replace(this, bVar);
    }

    @Override // am0.b
    public void dispose() {
        b.dispose(this);
    }

    @Override // am0.b
    public boolean isDisposed() {
        return b.isDisposed(get());
    }

    public e(am0.b bVar) {
        lazySet(bVar);
    }
}
