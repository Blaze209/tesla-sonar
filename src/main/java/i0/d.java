package i0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class d implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile d f74005a;

    d() {
    }

    static Executor a() {
        if (f74005a != null) {
            return f74005a;
        }
        synchronized (d.class) {
            try {
                if (f74005a == null) {
                    f74005a = new d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f74005a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
