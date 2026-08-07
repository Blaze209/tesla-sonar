package rm0;

import io.reactivex.rxjava3.core.s;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends AtomicReference<Throwable> {
    public Throwable a() {
        return g.e(this);
    }

    public boolean b(Throwable th2) {
        return g.a(this, th2);
    }

    public boolean c(Throwable th2) {
        if (b(th2)) {
            return true;
        }
        tm0.a.r(th2);
        return false;
    }

    public void d() {
        Throwable thA = a();
        if (thA == null || thA == g.f108625a) {
            return;
        }
        tm0.a.r(thA);
    }

    public void e(s<?> sVar) {
        Throwable thA = a();
        if (thA == null) {
            sVar.onComplete();
        } else if (thA != g.f108625a) {
            sVar.onError(thA);
        }
    }

    public void f(nr0.b<?> bVar) {
        Throwable thA = a();
        if (thA == null) {
            bVar.onComplete();
        } else if (thA != g.f108625a) {
            bVar.onError(thA);
        }
    }
}
