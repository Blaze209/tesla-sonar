package uy;

import androidx.camera.view.i;
import io.reactivex.rxjava3.core.s;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes6.dex */
public final class b<T> extends c<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object[] f116768f = new Object[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a[] f116769g = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<T> f116770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f116771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Lock f116772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Lock f116773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f116774e;

    static final class a<T> implements am0.b, uy.a.InterfaceC2518a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s<? super T> f116775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T> f116776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f116777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f116778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        uy.a<T> f116779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f116780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f116781g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f116782h;

        a(s<? super T> sVar, b<T> bVar) {
            this.f116775a = sVar;
            this.f116776b = bVar;
        }

        void a() {
            if (this.f116781g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f116781g) {
                        return;
                    }
                    if (this.f116777c) {
                        return;
                    }
                    b<T> bVar = this.f116776b;
                    Lock lock = bVar.f116772c;
                    lock.lock();
                    this.f116782h = bVar.f116774e;
                    T t11 = bVar.f116770a.get();
                    lock.unlock();
                    this.f116778d = t11 != null;
                    this.f116777c = true;
                    if (t11 != null) {
                        test(t11);
                        b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b() {
            uy.a<T> aVar;
            while (!this.f116781g) {
                synchronized (this) {
                    try {
                        aVar = this.f116779e;
                        if (aVar == null) {
                            this.f116778d = false;
                            return;
                        }
                        this.f116779e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                aVar.b(this);
            }
        }

        @Override // am0.b
        public void dispose() {
            if (this.f116781g) {
                return;
            }
            this.f116781g = true;
            this.f116776b.a0(this);
        }

        void e(T t11, long j11) {
            if (this.f116781g) {
                return;
            }
            if (!this.f116780f) {
                synchronized (this) {
                    try {
                        if (this.f116781g) {
                            return;
                        }
                        if (this.f116782h == j11) {
                            return;
                        }
                        if (this.f116778d) {
                            uy.a<T> aVar = this.f116779e;
                            if (aVar == null) {
                                aVar = new uy.a<>(4);
                                this.f116779e = aVar;
                            }
                            aVar.a(t11);
                            return;
                        }
                        this.f116777c = true;
                        this.f116780f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(t11);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f116781g;
        }

        @Override // uy.a.InterfaceC2518a, cm0.j
        public boolean test(T t11) {
            if (this.f116781g) {
                return false;
            }
            this.f116775a.onNext(t11);
            return false;
        }
    }

    b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f116772c = reentrantReadWriteLock.readLock();
        this.f116773d = reentrantReadWriteLock.writeLock();
        this.f116771b = new AtomicReference<>(f116769g);
        this.f116770a = new AtomicReference<>();
    }

    public static <T> b<T> Z() {
        return new b<>();
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(s<? super T> sVar) {
        a<T> aVar = new a<>(sVar, this);
        sVar.onSubscribe(aVar);
        Y(aVar);
        if (aVar.f116781g) {
            a0(aVar);
        } else {
            aVar.a();
        }
    }

    void Y(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f116771b.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!i.a(this.f116771b, aVarArr, aVarArr2));
    }

    void a0(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f116771b.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (aVarArr[i11] == aVar) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = f116769g;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i11);
                System.arraycopy(aVarArr, i11 + 1, aVarArr3, i11, (length - i11) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!i.a(this.f116771b, aVarArr, aVarArr2));
    }

    @Override // cm0.f
    public void accept(T t11) {
        if (t11 == null) {
            throw new NullPointerException("value == null");
        }
        b0(t11);
        for (a<T> aVar : this.f116771b.get()) {
            aVar.e(t11, this.f116774e);
        }
    }

    void b0(T t11) {
        this.f116773d.lock();
        this.f116774e++;
        this.f116770a.lazySet(t11);
        this.f116773d.unlock();
    }
}
