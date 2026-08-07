package k0;

import androidx.camera.core.impl.s2;
import androidx.camera.core.impl.x0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface l extends s2 {
    public static final x0.a<Executor> J = x0.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor G(Executor executor) {
        return (Executor) d(J, executor);
    }
}
