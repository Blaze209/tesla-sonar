package dm0;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import rm0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements am0.b, am0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<am0.b> f60788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f60789b;

    @Override // am0.c
    public boolean a(am0.b bVar) {
        Objects.requireNonNull(bVar, "Disposable item is null");
        if (this.f60789b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f60789b) {
                    return false;
                }
                List<am0.b> list = this.f60788a;
                if (list != null && list.remove(bVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // am0.c
    public boolean b(am0.b bVar) {
        Objects.requireNonNull(bVar, "d is null");
        if (!this.f60789b) {
            synchronized (this) {
                try {
                    if (!this.f60789b) {
                        List linkedList = this.f60788a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f60788a = linkedList;
                        }
                        linkedList.add(bVar);
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
        if (this.f60789b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f60789b) {
                    return;
                }
                this.f60789b = true;
                List<am0.b> list = this.f60788a;
                this.f60788a = null;
                f(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // am0.c
    public boolean e(am0.b bVar) {
        if (!a(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    void f(List<am0.b> list) {
        if (list == null) {
            return;
        }
        Iterator<am0.b> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th2) {
                bm0.a.b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
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
        return this.f60789b;
    }
}
