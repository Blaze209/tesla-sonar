package am0;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Objects;
import rm0.g;
import rm0.j;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    j<b> f1760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f1761b;

    @Override // am0.c
    public boolean a(b bVar) {
        Objects.requireNonNull(bVar, "disposable is null");
        if (this.f1761b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f1761b) {
                    return false;
                }
                j<b> jVar = this.f1760a;
                if (jVar != null && jVar.e(bVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // am0.c
    public boolean b(b bVar) {
        Objects.requireNonNull(bVar, "disposable is null");
        if (!this.f1761b) {
            synchronized (this) {
                try {
                    if (!this.f1761b) {
                        j<b> jVar = this.f1760a;
                        if (jVar == null) {
                            jVar = new j<>();
                            this.f1760a = jVar;
                        }
                        jVar.a(bVar);
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // am0.b
    public void dispose() {
        if (this.f1761b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f1761b) {
                    return;
                }
                this.f1761b = true;
                j<b> jVar = this.f1760a;
                this.f1760a = null;
                g(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // am0.c
    public boolean e(b bVar) {
        if (!a(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    public void f() {
        if (this.f1761b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f1761b) {
                    return;
                }
                j<b> jVar = this.f1760a;
                this.f1760a = null;
                g(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void g(j<b> jVar) {
        if (jVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : jVar.b()) {
            if (obj instanceof b) {
                try {
                    ((b) obj).dispose();
                } catch (Throwable th2) {
                    bm0.a.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw g.h((Throwable) arrayList.get(0));
        }
    }

    @Override // am0.b
    public boolean isDisposed() {
        return this.f1761b;
    }
}
