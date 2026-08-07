package tk;

/* JADX INFO: loaded from: classes3.dex */
public class c<T> extends a<T> {
    c(T t11, h<T> hVar, a.c cVar, Throwable th2) {
        super(t11, hVar, cVar, th2, true);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f114647a) {
                    super.finalize();
                    return;
                }
                T tF = this.f114648b.f();
                qk.a.K("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f114648b)), tF == null ? null : tF.getClass().getName());
                this.f114648b.d();
                super.finalize();
            }
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // tk.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // tk.a
    /* JADX INFO: renamed from: n */
    public a<T> clone() {
        return this;
    }
}
