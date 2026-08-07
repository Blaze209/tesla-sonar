package am0;

import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public interface b {
    static b c() {
        return dm0.c.INSTANCE;
    }

    static b d(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new e(runnable);
    }

    static b empty() {
        return d(em0.a.f63090b);
    }

    void dispose();

    boolean isDisposed();
}
