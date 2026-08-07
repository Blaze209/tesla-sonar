package tk;

import com.facebook.common.references.SharedReference;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class b<T> extends a<T> {
    private b(SharedReference<T> sharedReference, a.c cVar, Throwable th2) {
        super(sharedReference, cVar, th2);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f114647a) {
                    super.finalize();
                    return;
                }
                T tF = this.f114648b.f();
                qk.a.K("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f114648b)), tF == null ? null : tF.getClass().getName());
                a.c cVar = this.f114649c;
                if (cVar != null) {
                    cVar.b(this.f114648b, this.f114650d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // tk.a
    /* JADX INFO: renamed from: n */
    public a<T> clone() {
        k.i(J());
        return new b(this.f114648b, this.f114649c, this.f114650d != null ? new Throwable() : null);
    }

    b(T t11, h<T> hVar, a.c cVar, Throwable th2) {
        super(t11, hVar, cVar, th2, true);
    }
}
