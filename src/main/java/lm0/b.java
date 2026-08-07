package lm0;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class b<T, R> extends io.reactivex.rxjava3.core.o<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.r<? extends T>[] f90272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.rxjava3.core.r<? extends T>> f90273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.h<? super Object[], ? extends R> f90274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f90275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f90276e;

    static final class a<T, R> extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C1908b<T, R> f90277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f90278b;

        a(C1908b<T, R> c1908b, int i11) {
            this.f90277a = c1908b;
            this.f90278b = i11;
        }

        public void a() {
            dm0.b.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f90277a.f(this.f90278b);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            this.f90277a.g(this.f90278b, th2);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            this.f90277a.h(this.f90278b, t11);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            dm0.b.setOnce(this, bVar);
        }
    }

    /* JADX INFO: renamed from: lm0.b$b, reason: collision with other inner class name */
    static final class C1908b<T, R> extends AtomicInteger implements am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super R> f90279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.h<? super Object[], ? extends R> f90280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<T, R>[] f90281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object[] f90282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final nm0.c<Object[]> f90283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f90284f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f90285g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f90286h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final rm0.b f90287i = new rm0.b();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f90288j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f90289k;

        C1908b(io.reactivex.rxjava3.core.s<? super R> sVar, cm0.h<? super Object[], ? extends R> hVar, int i11, int i12, boolean z11) {
            this.f90279a = sVar;
            this.f90280b = hVar;
            this.f90284f = z11;
            this.f90282d = new Object[i11];
            a<T, R>[] aVarArr = new a[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                aVarArr[i13] = new a<>(this, i13);
            }
            this.f90281c = aVarArr;
            this.f90283e = new nm0.c<>(i12);
        }

        void a() {
            for (a<T, R> aVar : this.f90281c) {
                aVar.a();
            }
        }

        void b(nm0.c<?> cVar) {
            synchronized (this) {
                this.f90282d = null;
            }
            cVar.clear();
        }

        @Override // am0.b
        public void dispose() {
            if (this.f90285g) {
                return;
            }
            this.f90285g = true;
            a();
            e();
        }

        void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            nm0.c<Object[]> cVar = this.f90283e;
            io.reactivex.rxjava3.core.s<? super R> sVar = this.f90279a;
            boolean z11 = this.f90284f;
            int iAddAndGet = 1;
            while (!this.f90285g) {
                if (!z11 && this.f90287i.get() != null) {
                    a();
                    b(cVar);
                    this.f90287i.e(sVar);
                    return;
                }
                boolean z12 = this.f90286h;
                Object[] objArrPoll = cVar.poll();
                boolean z13 = objArrPoll == null;
                if (z12 && z13) {
                    b(cVar);
                    this.f90287i.e(sVar);
                    return;
                }
                if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        R rApply = this.f90280b.apply(objArrPoll);
                        Objects.requireNonNull(rApply, "The combiner returned a null value");
                        sVar.onNext(rApply);
                    } catch (Throwable th2) {
                        bm0.a.b(th2);
                        this.f90287i.c(th2);
                        a();
                        b(cVar);
                        this.f90287i.e(sVar);
                        return;
                    }
                }
            }
            b(cVar);
            this.f90287i.d();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x001b A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0009, B:14:0x0013, B:17:0x001d, B:16:0x001b), top: B:24:0x0001 }] */
        void f(int i11) {
            synchronized (this) {
                try {
                    Object[] objArr = this.f90282d;
                    if (objArr == null) {
                        return;
                    }
                    boolean z11 = objArr[i11] == null;
                    if (z11) {
                        this.f90286h = true;
                    } else {
                        int i12 = this.f90289k + 1;
                        this.f90289k = i12;
                        if (i12 == objArr.length) {
                            this.f90286h = true;
                        }
                    }
                    if (z11) {
                        a();
                    }
                    e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0027 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:7:0x000e, B:9:0x0012, B:13:0x0016, B:18:0x001f, B:21:0x0029, B:20:0x0027), top: B:29:0x000e }] */
        void g(int i11, Throwable th2) {
            if (this.f90287i.c(th2)) {
                boolean z11 = true;
                if (this.f90284f) {
                    synchronized (this) {
                        try {
                            Object[] objArr = this.f90282d;
                            if (objArr == null) {
                                return;
                            }
                            boolean z12 = objArr[i11] == null;
                            if (z12) {
                                this.f90286h = true;
                            } else {
                                int i12 = this.f90289k + 1;
                                this.f90289k = i12;
                                if (i12 == objArr.length) {
                                    this.f90286h = true;
                                }
                            }
                            z11 = z12;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                if (z11) {
                    a();
                }
                e();
            }
        }

        void h(int i11, T t11) {
            boolean z11;
            synchronized (this) {
                try {
                    Object[] objArr = this.f90282d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i11];
                    int i12 = this.f90288j;
                    if (obj == null) {
                        i12++;
                        this.f90288j = i12;
                    }
                    objArr[i11] = t11;
                    if (i12 == objArr.length) {
                        this.f90283e.offer((Object[]) objArr.clone());
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void i(io.reactivex.rxjava3.core.r<? extends T>[] rVarArr) {
            a<T, R>[] aVarArr = this.f90281c;
            int length = aVarArr.length;
            this.f90279a.onSubscribe(this);
            for (int i11 = 0; i11 < length && !this.f90286h && !this.f90285g; i11++) {
                rVarArr[i11].a(aVarArr[i11]);
            }
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90285g;
        }
    }

    public b(io.reactivex.rxjava3.core.r<? extends T>[] rVarArr, Iterable<? extends io.reactivex.rxjava3.core.r<? extends T>> iterable, cm0.h<? super Object[], ? extends R> hVar, int i11, boolean z11) {
        this.f90272a = rVarArr;
        this.f90273b = iterable;
        this.f90274c = hVar;
        this.f90275d = i11;
        this.f90276e = z11;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super R> sVar) {
        int length;
        io.reactivex.rxjava3.core.r<? extends T>[] rVarArr = this.f90272a;
        if (rVarArr == null) {
            rVarArr = new io.reactivex.rxjava3.core.r[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.r<? extends T> rVar : this.f90273b) {
                    if (length == rVarArr.length) {
                        io.reactivex.rxjava3.core.r<? extends T>[] rVarArr2 = new io.reactivex.rxjava3.core.r[(length >> 2) + length];
                        System.arraycopy(rVarArr, 0, rVarArr2, 0, length);
                        rVarArr = rVarArr2;
                    }
                    int i11 = length + 1;
                    Objects.requireNonNull(rVar, "The Iterator returned a null ObservableSource");
                    rVarArr[length] = rVar;
                    length = i11;
                }
            } catch (Throwable th2) {
                bm0.a.b(th2);
                dm0.c.error(th2, sVar);
                return;
            }
        } else {
            length = rVarArr.length;
        }
        int i12 = length;
        if (i12 == 0) {
            dm0.c.complete(sVar);
        } else {
            new C1908b(sVar, this.f90274c, i12, this.f90275d, this.f90276e).i(rVarArr);
        }
    }
}
