package ub;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: loaded from: classes3.dex */
public interface b {
    default CoroutineDispatcher a() {
        return ExecutorsKt.from(d());
    }

    default void b(Runnable runnable) {
        d().execute(runnable);
    }

    Executor c();

    a d();
}
