package yu;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
class u<T> implements yv.b<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set<T> f125880b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set<yv.b<T>> f125879a = Collections.newSetFromMap(new ConcurrentHashMap());

    u(Collection<yv.b<T>> collection) {
        this.f125879a.addAll(collection);
    }

    static u<?> b(Collection<yv.b<?>> collection) {
        return new u<>((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator<yv.b<T>> it = this.f125879a.iterator();
            while (it.hasNext()) {
                this.f125880b.add(it.next().get());
            }
            this.f125879a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a(yv.b<T> bVar) {
        try {
            if (this.f125880b == null) {
                this.f125879a.add(bVar);
            } else {
                this.f125880b.add(bVar.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // yv.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f125880b == null) {
            synchronized (this) {
                try {
                    if (this.f125880b == null) {
                        this.f125880b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f125880b);
    }
}
