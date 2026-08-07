package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class b3<T> implements g2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<Object> f3132b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3131a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3133c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3134d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<g2.a<? super T>, b<T>> f3135e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<b<T>> f3136f = new CopyOnWriteArraySet<>();

    static abstract class a {
        a() {
        }

        @NonNull
        static a b(@NonNull Throwable th2) {
            return new l(th2);
        }

        @NonNull
        public abstract Throwable a();
    }

    private static final class b<T> implements Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Object f3137h = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f3138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g2.a<? super T> f3139b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicReference<Object> f3141d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f3140c = new AtomicBoolean(true);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f3142e = f3137h;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f3143f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f3144g = false;

        b(@NonNull AtomicReference<Object> atomicReference, @NonNull Executor executor, @NonNull g2.a<? super T> aVar) {
            this.f3141d = atomicReference;
            this.f3138a = executor;
            this.f3139b = aVar;
        }

        void a(int i11) {
            synchronized (this) {
                try {
                    if (this.f3140c.get()) {
                        if (i11 <= this.f3143f) {
                            return;
                        }
                        this.f3143f = i11;
                        if (this.f3144g) {
                            return;
                        }
                        this.f3144g = true;
                        try {
                            this.f3138a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f3144g = false;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void close() {
            this.f3140c.set(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f3140c.get()) {
                        this.f3144g = false;
                        return;
                    }
                    Object obj = this.f3141d.get();
                    int i11 = this.f3143f;
                    while (true) {
                        if (!Objects.equals(this.f3142e, obj)) {
                            this.f3142e = obj;
                            if (obj instanceof a) {
                                this.f3139b.onError(((a) obj).a());
                            } else {
                                this.f3139b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i11 == this.f3143f || !this.f3140c.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.f3141d.get();
                                    i11 = this.f3143f;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    this.f3144g = false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    b3(Object obj, boolean z11) {
        if (!z11) {
            this.f3132b = new AtomicReference<>(obj);
        } else {
            u5.h.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f3132b = new AtomicReference<>(a.b((Throwable) obj));
        }
    }

    private void a(@NonNull g2.a<? super T> aVar) {
        b<T> bVarRemove = this.f3135e.remove(aVar);
        if (bVarRemove != null) {
            bVarRemove.close();
            this.f3136f.remove(bVarRemove);
        }
    }

    private void i(Object obj) {
        Iterator<b<T>> it;
        int i11;
        synchronized (this.f3131a) {
            try {
                if (Objects.equals(this.f3132b.getAndSet(obj), obj)) {
                    return;
                }
                int i12 = this.f3133c + 1;
                this.f3133c = i12;
                if (this.f3134d) {
                    return;
                }
                this.f3134d = true;
                Iterator<b<T>> it2 = this.f3136f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().a(i12);
                    } else {
                        synchronized (this.f3131a) {
                            try {
                                if (this.f3133c == i12) {
                                    this.f3134d = false;
                                    return;
                                } else {
                                    it = this.f3136f.iterator();
                                    i11 = this.f3133c;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        it2 = it;
                        i12 = i11;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.g2
    @NonNull
    public com.google.common.util.concurrent.s<T> b() {
        Object obj = this.f3132b.get();
        return obj instanceof a ? j0.n.n(((a) obj).a()) : j0.n.p(obj);
    }

    @Override // androidx.camera.core.impl.g2
    public void c(@NonNull Executor executor, @NonNull g2.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f3131a) {
            a(aVar);
            bVar = new b<>(this.f3132b, executor, aVar);
            this.f3135e.put(aVar, bVar);
            this.f3136f.add(bVar);
        }
        bVar.a(0);
    }

    @Override // androidx.camera.core.impl.g2
    public void d(@NonNull g2.a<? super T> aVar) {
        synchronized (this.f3131a) {
            a(aVar);
        }
    }

    public void f() {
        synchronized (this.f3131a) {
            try {
                Iterator it = new HashSet(this.f3135e.keySet()).iterator();
                while (it.hasNext()) {
                    a((g2.a) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void g(T t11) {
        i(t11);
    }

    void h(@NonNull Throwable th2) {
        i(a.b(th2));
    }
}
