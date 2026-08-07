package tb;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements ub.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f113038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f113039c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f113037a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f113040d = new Object();

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a0 f113041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f113042b;

        a(a0 a0Var, Runnable runnable) {
            this.f113041a = a0Var;
            this.f113042b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f113042b.run();
                synchronized (this.f113041a.f113040d) {
                    this.f113041a.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f113041a.f113040d) {
                    this.f113041a.a();
                    throw th2;
                }
            }
        }
    }

    public a0(Executor executor) {
        this.f113038b = executor;
    }

    void a() {
        a aVarPoll = this.f113037a.poll();
        this.f113039c = aVarPoll;
        if (aVarPoll != null) {
            this.f113038b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f113040d) {
            try {
                this.f113037a.add(new a(this, runnable));
                if (this.f113039c == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
