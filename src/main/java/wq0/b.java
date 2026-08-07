package wq0;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes10.dex */
final class b implements Runnable, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f122251a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f122252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f122253c;

    b(c cVar) {
        this.f122252b = cVar;
    }

    @Override // wq0.k
    public void a(p pVar, Object obj) {
        i iVarA = i.a(pVar, obj);
        synchronized (this) {
            try {
                this.f122251a.a(iVarA);
                if (!this.f122253c) {
                    this.f122253c = true;
                    this.f122252b.d().execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    i iVarC = this.f122251a.c(1000);
                    if (iVarC == null) {
                        synchronized (this) {
                            iVarC = this.f122251a.b();
                            if (iVarC == null) {
                                this.f122253c = false;
                                this.f122253c = false;
                                return;
                            }
                        }
                    }
                    this.f122252b.g(iVarC);
                } catch (InterruptedException e11) {
                    this.f122252b.e().b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e11);
                    this.f122253c = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f122253c = false;
                throw th2;
            }
        }
    }
}
