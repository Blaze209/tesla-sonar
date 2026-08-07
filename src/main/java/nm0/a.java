package nm0;

import fm0.g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class a<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<C2030a<T>> f95210a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<C2030a<T>> f95211b = new AtomicReference<>();

    /* JADX INFO: renamed from: nm0.a$a, reason: collision with other inner class name */
    static final class C2030a<E> extends AtomicReference<C2030a<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private E f95212a;

        C2030a() {
        }

        public E a() {
            E eB = b();
            e(null);
            return eB;
        }

        public E b() {
            return this.f95212a;
        }

        public C2030a<E> c() {
            return get();
        }

        public void d(C2030a<E> c2030a) {
            lazySet(c2030a);
        }

        public void e(E e11) {
            this.f95212a = e11;
        }

        C2030a(E e11) {
            e(e11);
        }
    }

    public a() {
        C2030a<T> c2030a = new C2030a<>();
        d(c2030a);
        e(c2030a);
    }

    C2030a<T> a() {
        return this.f95211b.get();
    }

    C2030a<T> b() {
        return this.f95211b.get();
    }

    C2030a<T> c() {
        return this.f95210a.get();
    }

    @Override // fm0.h
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    void d(C2030a<T> c2030a) {
        this.f95211b.lazySet(c2030a);
    }

    C2030a<T> e(C2030a<T> c2030a) {
        return this.f95210a.getAndSet(c2030a);
    }

    @Override // fm0.h
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // fm0.h
    public boolean offer(T t11) {
        if (t11 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C2030a<T> c2030a = new C2030a<>(t11);
        e(c2030a).d(c2030a);
        return true;
    }

    @Override // fm0.g, fm0.h
    public T poll() {
        C2030a<T> c2030aC;
        C2030a<T> c2030aA = a();
        C2030a<T> c2030aC2 = c2030aA.c();
        if (c2030aC2 != null) {
            T tA = c2030aC2.a();
            d(c2030aC2);
            return tA;
        }
        if (c2030aA == c()) {
            return null;
        }
        do {
            c2030aC = c2030aA.c();
        } while (c2030aC == null);
        T tA2 = c2030aC.a();
        d(c2030aC);
        return tA2;
    }
}
