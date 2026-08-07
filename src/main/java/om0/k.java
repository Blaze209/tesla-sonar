package om0;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends a implements Runnable {
    public k(Runnable runnable, boolean z11) {
        super(runnable, z11);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98062c = Thread.currentThread();
        try {
            this.f98060a.run();
            this.f98062c = null;
        } catch (Throwable th2) {
            dispose();
            this.f98062c = null;
            tm0.a.r(th2);
            throw th2;
        }
    }

    @Override // om0.a, java.util.concurrent.atomic.AtomicReference
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
