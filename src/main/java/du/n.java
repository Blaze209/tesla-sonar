package du;

/* JADX INFO: loaded from: classes5.dex */
final class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f61029b;

    n(t tVar) {
        this.f61029b = tVar;
    }

    @Override // du.j
    public final void a() {
        synchronized (this.f61029b.f61040f) {
            try {
                if (this.f61029b.f61045k.get() > 0 && this.f61029b.f61045k.decrementAndGet() > 0) {
                    this.f61029b.f61036b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                t tVar = this.f61029b;
                if (tVar.f61047m != null) {
                    tVar.f61036b.c("Unbind from service.", new Object[0]);
                    t tVar2 = this.f61029b;
                    tVar2.f61035a.unbindService(tVar2.f61046l);
                    this.f61029b.f61041g = false;
                    this.f61029b.f61047m = null;
                    this.f61029b.f61046l = null;
                }
                this.f61029b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
