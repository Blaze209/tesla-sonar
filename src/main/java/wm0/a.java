package wm0;

import io.reactivex.rxjava3.core.s;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import rm0.g;
import rm0.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a<T> extends e<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final C2621a[] f122040h = new C2621a[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final C2621a[] f122041i = new C2621a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<Object> f122042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<C2621a<T>[]> f122043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ReadWriteLock f122044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Lock f122045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Lock f122046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicReference<Throwable> f122047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f122048g;

    /* JADX INFO: renamed from: wm0.a$a, reason: collision with other inner class name */
    static final class C2621a<T> implements am0.b, rm0.a.InterfaceC2312a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s<? super T> f122049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a<T> f122050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f122051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f122052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        rm0.a<Object> f122053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f122055g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f122056h;

        C2621a(s<? super T> sVar, a<T> aVar) {
            this.f122049a = sVar;
            this.f122050b = aVar;
        }

        void a() {
            if (this.f122055g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f122055g) {
                        return;
                    }
                    if (this.f122051c) {
                        return;
                    }
                    a<T> aVar = this.f122050b;
                    Lock lock = aVar.f122045d;
                    lock.lock();
                    this.f122056h = aVar.f122048g;
                    Object obj = aVar.f122042a.get();
                    lock.unlock();
                    this.f122052d = obj != null;
                    this.f122051c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b() {
            rm0.a<Object> aVar;
            while (!this.f122055g) {
                synchronized (this) {
                    try {
                        aVar = this.f122053e;
                        if (aVar == null) {
                            this.f122052d = false;
                            return;
                        }
                        this.f122053e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                aVar.d(this);
            }
        }

        @Override // am0.b
        public void dispose() {
            if (this.f122055g) {
                return;
            }
            this.f122055g = true;
            this.f122050b.e0(this);
        }

        void e(Object obj, long j11) {
            if (this.f122055g) {
                return;
            }
            if (!this.f122054f) {
                synchronized (this) {
                    try {
                        if (this.f122055g) {
                            return;
                        }
                        if (this.f122056h == j11) {
                            return;
                        }
                        if (this.f122052d) {
                            rm0.a<Object> aVar = this.f122053e;
                            if (aVar == null) {
                                aVar = new rm0.a<>(4);
                                this.f122053e = aVar;
                            }
                            aVar.c(obj);
                            return;
                        }
                        this.f122051c = true;
                        this.f122054f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f122055g;
        }

        @Override // rm0.a.InterfaceC2312a, cm0.j
        public boolean test(Object obj) {
            return this.f122055g || i.accept(obj, this.f122049a);
        }
    }

    a(T t11) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f122044c = reentrantReadWriteLock;
        this.f122045d = reentrantReadWriteLock.readLock();
        this.f122046e = reentrantReadWriteLock.writeLock();
        this.f122043b = new AtomicReference<>(f122040h);
        this.f122042a = new AtomicReference<>(t11);
        this.f122047f = new AtomicReference<>();
    }

    public static <T> a<T> d0() {
        return new a<>(null);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(s<? super T> sVar) {
        C2621a<T> c2621a = new C2621a<>(sVar, this);
        sVar.onSubscribe(c2621a);
        if (c0(c2621a)) {
            if (c2621a.f122055g) {
                e0(c2621a);
                return;
            } else {
                c2621a.a();
                return;
            }
        }
        Throwable th2 = this.f122047f.get();
        if (th2 == g.f108625a) {
            sVar.onComplete();
        } else {
            sVar.onError(th2);
        }
    }

    @Override // wm0.e
    public boolean Y() {
        return i.isComplete(this.f122042a.get());
    }

    @Override // wm0.e
    public boolean Z() {
        return this.f122043b.get().length != 0;
    }

    @Override // wm0.e
    public boolean a0() {
        return i.isError(this.f122042a.get());
    }

    boolean c0(C2621a<T> c2621a) {
        C2621a<T>[] c2621aArr;
        C2621a[] c2621aArr2;
        do {
            c2621aArr = this.f122043b.get();
            if (c2621aArr == f122041i) {
                return false;
            }
            int length = c2621aArr.length;
            c2621aArr2 = new C2621a[length + 1];
            System.arraycopy(c2621aArr, 0, c2621aArr2, 0, length);
            c2621aArr2[length] = c2621a;
        } while (!androidx.camera.view.i.a(this.f122043b, c2621aArr, c2621aArr2));
        return true;
    }

    void e0(C2621a<T> c2621a) {
        C2621a<T>[] c2621aArr;
        C2621a[] c2621aArr2;
        do {
            c2621aArr = this.f122043b.get();
            int length = c2621aArr.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (c2621aArr[i11] == c2621a) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                c2621aArr2 = f122040h;
            } else {
                C2621a[] c2621aArr3 = new C2621a[length - 1];
                System.arraycopy(c2621aArr, 0, c2621aArr3, 0, i11);
                System.arraycopy(c2621aArr, i11 + 1, c2621aArr3, i11, (length - i11) - 1);
                c2621aArr2 = c2621aArr3;
            }
        } while (!androidx.camera.view.i.a(this.f122043b, c2621aArr, c2621aArr2));
    }

    void f0(Object obj) {
        this.f122046e.lock();
        this.f122048g++;
        this.f122042a.lazySet(obj);
        this.f122046e.unlock();
    }

    C2621a<T>[] g0(Object obj) {
        f0(obj);
        return this.f122043b.getAndSet(f122041i);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onComplete() {
        if (androidx.camera.view.i.a(this.f122047f, null, g.f108625a)) {
            Object objComplete = i.complete();
            for (C2621a<T> c2621a : g0(objComplete)) {
                c2621a.e(objComplete, this.f122048g);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onError(Throwable th2) {
        g.c(th2, "onError called with a null Throwable.");
        if (!androidx.camera.view.i.a(this.f122047f, null, th2)) {
            tm0.a.r(th2);
            return;
        }
        Object objError = i.error(th2);
        for (C2621a<T> c2621a : g0(objError)) {
            c2621a.e(objError, this.f122048g);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onNext(T t11) {
        g.c(t11, "onNext called with a null value.");
        if (this.f122047f.get() != null) {
            return;
        }
        Object next = i.next(t11);
        f0(next);
        for (C2621a<T> c2621a : this.f122043b.get()) {
            c2621a.e(next, this.f122048g);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void onSubscribe(am0.b bVar) {
        if (this.f122047f.get() != null) {
            bVar.dispose();
        }
    }
}
