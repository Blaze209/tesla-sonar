package wu;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class d implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ d f122370a = new d();

    private /* synthetic */ d() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
