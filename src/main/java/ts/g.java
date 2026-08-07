package ts;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f114996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f114997b;

    public g() {
        this(d.f114979a);
    }

    public synchronized void a() {
        while (!this.f114997b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z11 = false;
        while (!this.f114997b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z11;
        z11 = this.f114997b;
        this.f114997b = false;
        return z11;
    }

    public synchronized boolean d() {
        return this.f114997b;
    }

    public synchronized boolean e() {
        if (this.f114997b) {
            return false;
        }
        this.f114997b = true;
        notifyAll();
        return true;
    }

    public g(d dVar) {
        this.f114996a = dVar;
    }
}
