package pq;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
class n implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f103619a;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f103620a;

        a(Runnable runnable) {
            this.f103620a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f103620a.run();
            } catch (Exception e11) {
                tq.a.d("Executor", "Background execution failure.", e11);
            }
        }
    }

    n(Executor executor) {
        this.f103619a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f103619a.execute(new a(runnable));
    }
}
