package i0;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    @NonNull
    public static Executor a() {
        return b.a();
    }

    @NonNull
    public static Executor b() {
        return d.a();
    }

    @NonNull
    public static Executor c() {
        return f.a();
    }

    @NonNull
    public static Executor d() {
        return g.a();
    }

    @NonNull
    public static ScheduledExecutorService e() {
        return h.a();
    }

    @NonNull
    public static ScheduledExecutorService f(@NonNull Handler handler) {
        return new e(handler);
    }

    @NonNull
    public static Executor g(@NonNull Executor executor) {
        return new i(executor);
    }
}
