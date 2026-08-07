package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f107865a = new Handler(Looper.getMainLooper());

    a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f107865a.post(runnable);
    }
}
