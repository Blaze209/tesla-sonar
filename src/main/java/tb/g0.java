package tb;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class g0 implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
