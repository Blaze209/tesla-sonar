package s7;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f110438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f110439b;

    public m() {
        this(j.f110429a);
    }

    public synchronized void a() {
        while (!this.f110439b) {
            this.f110438a.b();
            wait();
        }
    }

    public synchronized void b() {
        boolean z11 = false;
        while (!this.f110439b) {
            try {
                this.f110438a.b();
                wait();
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c(long j11) {
        try {
            if (j11 <= 0) {
                return this.f110439b;
            }
            long jElapsedRealtime = this.f110438a.elapsedRealtime();
            long j12 = j11 + jElapsedRealtime;
            if (j12 < jElapsedRealtime) {
                b();
            } else {
                boolean z11 = false;
                while (!this.f110439b && jElapsedRealtime < j12) {
                    try {
                        this.f110438a.b();
                        wait(j12 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                    jElapsedRealtime = this.f110438a.elapsedRealtime();
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f110439b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean d() {
        boolean z11;
        z11 = this.f110439b;
        this.f110439b = false;
        return z11;
    }

    public synchronized boolean e() {
        return this.f110439b;
    }

    public synchronized boolean f() {
        if (this.f110439b) {
            return false;
        }
        this.f110439b = true;
        notifyAll();
        return true;
    }

    public m(j jVar) {
        this.f110438a = jVar;
    }
}
