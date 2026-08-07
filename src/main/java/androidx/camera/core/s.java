package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class s extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f3449d;

    s(n nVar) {
        super(nVar);
        this.f3449d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        if (this.f3449d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
