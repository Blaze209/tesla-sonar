package b8;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f16833a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f16833a.post(runnable);
    }
}
