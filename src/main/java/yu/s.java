package yu;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
class s implements vv.d, vv.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<vv.b<Object>, Executor>> f125873a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<vv.a<?>> f125874b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f125875c;

    s(Executor executor) {
        this.f125875c = executor;
    }

    private synchronized Set<Map.Entry<vv.b<Object>, Executor>> f(vv.a<?> aVar) {
        ConcurrentHashMap<vv.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f125873a.get(aVar.b());
        } catch (Throwable th2) {
            throw th2;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    @Override // vv.c
    public void a(final vv.a<?> aVar) {
        z.b(aVar);
        synchronized (this) {
            try {
                Queue<vv.a<?>> queue = this.f125874b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<vv.b<Object>, Executor> entry : f(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: yu.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((vv.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vv.d
    public synchronized <T> void b(Class<T> cls, Executor executor, vv.b<? super T> bVar) {
        try {
            z.b(cls);
            z.b(bVar);
            z.b(executor);
            if (!this.f125873a.containsKey(cls)) {
                this.f125873a.put(cls, new ConcurrentHashMap<>());
            }
            this.f125873a.get(cls).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // vv.d
    public <T> void c(Class<T> cls, vv.b<? super T> bVar) {
        b(cls, this.f125875c, bVar);
    }

    void e() {
        Queue<vv.a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f125874b;
                if (queue != null) {
                    this.f125874b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator<vv.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }
}
