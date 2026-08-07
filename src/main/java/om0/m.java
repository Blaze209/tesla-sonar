package om0;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, am0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Object f98133b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f98134c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f98135d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Object f98136e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f98137a;

    public m(Runnable runnable, am0.c cVar) {
        super(3);
        this.f98137a = runnable;
        lazySet(0, cVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f98136e) {
                return;
            }
            if (obj == f98134c) {
                future.cancel(false);
                return;
            } else if (obj == f98135d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // am0.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f98136e || obj5 == (obj3 = f98134c) || obj5 == (obj4 = f98135d)) {
                break;
            }
            boolean z11 = get(2) != Thread.currentThread();
            if (z11) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 == null) {
                    break;
                }
                ((Future) obj5).cancel(z11);
                break;
            }
        }
        do {
            obj = get(0);
            if (obj == f98136e || obj == (obj2 = f98133b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((am0.c) obj).a(this);
    }

    @Override // am0.b
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f98133b || obj == f98136e;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f98137a.run();
            Object obj3 = get(0);
            if (obj3 != f98133b && compareAndSet(0, obj3, f98136e) && obj3 != null) {
                ((am0.c) obj3).a(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f98134c || obj2 == f98135d) {
                    break;
                }
            } while (!compareAndSet(1, obj2, f98136e));
            lazySet(2, null);
        } catch (Throwable th2) {
            try {
                tm0.a.r(th2);
                throw th2;
            } catch (Throwable th3) {
                Object obj4 = get(0);
                if (obj4 != f98133b && compareAndSet(0, obj4, f98136e) && obj4 != null) {
                    ((am0.c) obj4).a(this);
                }
                do {
                    obj = get(1);
                    if (obj == f98134c || obj == f98135d) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f98136e));
                lazySet(2, null);
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public String toString() {
        String str;
        Object obj = get(1);
        if (obj == f98136e) {
            str = "Finished";
        } else if (obj == f98134c) {
            str = "Disposed(Sync)";
        } else if (obj == f98135d) {
            str = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            if (obj2 == null) {
                str = "Waiting";
            } else {
                str = "Running on " + obj2;
            }
        }
        return m.class.getSimpleName() + "[" + str + "]";
    }
}
