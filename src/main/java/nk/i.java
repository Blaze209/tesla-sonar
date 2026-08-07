package nk;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class i extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static i f95084b;

    private i() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static i h() {
        if (f95084b == null) {
            f95084b = new i();
        }
        return f95084b;
    }

    @Override // nk.e, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
