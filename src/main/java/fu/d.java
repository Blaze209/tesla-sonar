package fu;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes5.dex */
final class d implements ThreadFactory {
    d() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
