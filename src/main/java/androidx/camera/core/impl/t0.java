package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {
    @NonNull
    public static t0 a(@NonNull Executor executor, @NonNull Handler handler) {
        return new c(executor, handler);
    }

    @NonNull
    public abstract Executor b();

    @NonNull
    public abstract Handler c();
}
