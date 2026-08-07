package gw;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gw.a f69998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile gw.a f69999b;

    /* JADX INFO: renamed from: gw.b$b, reason: collision with other inner class name */
    private static class C1442b implements gw.a {
        private C1442b() {
        }

        @Override // gw.a
        @NonNull
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService b(int i11, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i11, i11, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C1442b c1442b = new C1442b();
        f69998a = c1442b;
        f69999b = c1442b;
    }

    public static gw.a a() {
        return f69999b;
    }
}
