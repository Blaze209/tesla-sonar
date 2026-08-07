package s7;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Executor f110394a;

    public static synchronized Executor a() {
        try {
            if (f110394a == null) {
                f110394a = q0.c1("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f110394a;
    }
}
