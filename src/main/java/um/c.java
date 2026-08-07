package um;

/* JADX INFO: loaded from: classes3.dex */
public class c extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private hm.e f116445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f116446e;

    public c(hm.e eVar, boolean z11) {
        this.f116445d = eVar;
        this.f116446e = z11;
    }

    @Override // um.a, um.e
    public boolean J3() {
        return this.f116446e;
    }

    @Override // um.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                hm.e eVar = this.f116445d;
                if (eVar == null) {
                    return;
                }
                this.f116445d = null;
                eVar.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // um.e, um.m
    public synchronized int getHeight() {
        hm.e eVar;
        eVar = this.f116445d;
        return eVar == null ? 0 : eVar.d().getHeight();
    }

    @Override // um.e, um.m
    public synchronized int getWidth() {
        hm.e eVar;
        eVar = this.f116445d;
        return eVar == null ? 0 : eVar.d().getWidth();
    }

    @Override // um.e
    /* JADX INFO: renamed from: isClosed */
    public synchronized boolean getClosed() {
        return this.f116445d == null;
    }

    public synchronized hm.c n0() {
        hm.e eVar;
        eVar = this.f116445d;
        return eVar == null ? null : eVar.d();
    }

    public synchronized hm.e r0() {
        return this.f116445d;
    }

    @Override // um.e
    public synchronized int v() {
        hm.e eVar;
        eVar = this.f116445d;
        return eVar == null ? 0 : eVar.d().v();
    }
}
