package lm0;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class k<T, U> extends lm0.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends U>> f90386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f90387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f90388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f90389e;

    static final class a<T, U> extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.s<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f90390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, U> f90391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f90392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile fm0.h<U> f90393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90394e;

        a(b<T, U> bVar, long j11) {
            this.f90390a = j11;
            this.f90391b = bVar;
        }

        public void a() {
            dm0.b.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f90392c = true;
            this.f90391b.f();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90391b.f90404h.c(th2)) {
                b<T, U> bVar = this.f90391b;
                if (!bVar.f90399c) {
                    bVar.e();
                }
                this.f90392c = true;
                this.f90391b.f();
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(U u11) {
            if (this.f90394e == 0) {
                this.f90391b.k(u11, this);
            } else {
                this.f90391b.f();
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.setOnce(this, bVar) && (bVar instanceof fm0.c)) {
                fm0.c cVar = (fm0.c) bVar;
                int iRequestFusion = cVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f90394e = iRequestFusion;
                    this.f90393d = cVar;
                    this.f90392c = true;
                    this.f90391b.f();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f90394e = iRequestFusion;
                    this.f90393d = cVar;
                }
            }
        }
    }

    static final class b<T, U> extends AtomicInteger implements am0.b, io.reactivex.rxjava3.core.s<T> {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final a<?, ?>[] f90395p = new a[0];

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final a<?, ?>[] f90396q = new a[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super U> f90397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends U>> f90398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f90399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f90400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f90401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile fm0.g<U> f90402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f90403g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final rm0.b f90404h = new rm0.b();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f90405i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicReference<a<?, ?>[]> f90406j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        am0.b f90407k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f90408l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f90409m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Queue<io.reactivex.rxjava3.core.r<? extends U>> f90410n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f90411o;

        b(io.reactivex.rxjava3.core.s<? super U> sVar, cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends U>> hVar, boolean z11, int i11, int i12) {
            this.f90397a = sVar;
            this.f90398b = hVar;
            this.f90399c = z11;
            this.f90400d = i11;
            this.f90401e = i12;
            if (i11 != Integer.MAX_VALUE) {
                this.f90410n = new ArrayDeque(i11);
            }
            this.f90406j = new AtomicReference<>(f90395p);
        }

        boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f90406j.get();
                if (aVarArr == f90396q) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!androidx.camera.view.i.a(this.f90406j, aVarArr, aVarArr2));
            return true;
        }

        boolean b() {
            if (this.f90405i) {
                return true;
            }
            Throwable th2 = this.f90404h.get();
            if (this.f90399c || th2 == null) {
                return false;
            }
            e();
            this.f90404h.e(this.f90397a);
            return true;
        }

        @Override // am0.b
        public void dispose() {
            this.f90405i = true;
            if (e()) {
                this.f90404h.d();
            }
        }

        boolean e() {
            this.f90407k.dispose();
            AtomicReference<a<?, ?>[]> atomicReference = this.f90406j;
            a<?, ?>[] aVarArr = f90396q;
            a<?, ?>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet == aVarArr) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.a();
            }
            return true;
        }

        void f() {
            if (getAndIncrement() == 0) {
                g();
            }
        }

        /* JADX WARN: Code duplicated, block: B:104:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[PHI: r4
          0x00c6: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00ac, B:66:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            int size;
            boolean z11;
            io.reactivex.rxjava3.core.s<? super U> sVar = this.f90397a;
            int iAddAndGet = 1;
            while (!b()) {
                fm0.g<U> gVar = this.f90402f;
                int i11 = 0;
                if (gVar != null) {
                    while (!b()) {
                        U uPoll = gVar.poll();
                        if (uPoll != null) {
                            sVar.onNext(uPoll);
                            i11++;
                        }
                    }
                    return;
                }
                if (i11 == 0) {
                    boolean z12 = this.f90403g;
                    fm0.g<U> gVar2 = this.f90402f;
                    a<?, ?>[] aVarArr = this.f90406j.get();
                    int length = aVarArr.length;
                    if (this.f90400d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.f90410n.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z12 && ((gVar2 == null || gVar2.isEmpty()) && length == 0 && size == 0)) {
                        this.f90404h.e(this.f90397a);
                        return;
                    }
                    if (length != 0) {
                        int iMin = Math.min(length - 1, this.f90409m);
                        for (int i12 = 0; i12 < length; i12++) {
                            if (b()) {
                                return;
                            }
                            a<T, U> aVar = aVarArr[iMin];
                            fm0.h<U> hVar = aVar.f90393d;
                            if (hVar != null) {
                                do {
                                    try {
                                        U uPoll2 = hVar.poll();
                                        if (uPoll2 == null) {
                                            z11 = aVar.f90392c;
                                            fm0.h<U> hVar2 = aVar.f90393d;
                                            if (z11 && (hVar2 == null || hVar2.isEmpty())) {
                                                h(aVar);
                                                i11++;
                                            }
                                            iMin++;
                                            if (iMin == length) {
                                                iMin = 0;
                                            }
                                        } else {
                                            sVar.onNext(uPoll2);
                                        }
                                    } catch (Throwable th2) {
                                        bm0.a.b(th2);
                                        aVar.a();
                                        this.f90404h.c(th2);
                                        if (b()) {
                                            return;
                                        }
                                        h(aVar);
                                        i11++;
                                        iMin++;
                                        if (iMin == length) {
                                        }
                                    }
                                } while (!b());
                                return;
                            }
                            z11 = aVar.f90392c;
                            fm0.h<U> hVar3 = aVar.f90393d;
                            if (z11) {
                                h(aVar);
                                i11++;
                            }
                            iMin++;
                            if (iMin == length) {
                                iMin = 0;
                            }
                        }
                        this.f90409m = iMin;
                    }
                    if (i11 == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.f90400d != Integer.MAX_VALUE) {
                        j(i11);
                    }
                } else if (this.f90400d != Integer.MAX_VALUE) {
                    j(i11);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void h(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f90406j.get();
                int length = aVarArr.length;
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
                    aVarArr2 = f90395p;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i11);
                    System.arraycopy(aVarArr, i11 + 1, aVarArr3, i11, (length - i11) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!androidx.camera.view.i.a(this.f90406j, aVarArr, aVarArr2));
        }

        void i(io.reactivex.rxjava3.core.r<? extends U> rVar) {
            boolean z11;
            while (rVar instanceof cm0.k) {
                if (!l((cm0.k) rVar) || this.f90400d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        rVar = this.f90410n.poll();
                        if (rVar == null) {
                            z11 = true;
                            this.f90411o--;
                        } else {
                            z11 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z11) {
                    f();
                    return;
                }
            }
            long j11 = this.f90408l;
            this.f90408l = 1 + j11;
            a<T, U> aVar = new a<>(this, j11);
            if (a(aVar)) {
                rVar.a(aVar);
            }
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90405i;
        }

        void j(int i11) {
            while (true) {
                int i12 = i11 - 1;
                if (i11 == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        io.reactivex.rxjava3.core.r<? extends U> rVarPoll = this.f90410n.poll();
                        if (rVarPoll == null) {
                            this.f90411o--;
                        } else {
                            i(rVarPoll);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                i11 = i12;
            }
        }

        void k(U u11, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f90397a.onNext(u11);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                fm0.h cVar = aVar.f90393d;
                if (cVar == null) {
                    cVar = new nm0.c(this.f90401e);
                    aVar.f90393d = cVar;
                }
                cVar.offer(u11);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            g();
        }

        boolean l(cm0.k<? extends U> kVar) {
            try {
                U u11 = kVar.get();
                if (u11 == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f90397a.onNext(u11);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    fm0.g<U> cVar = this.f90402f;
                    if (cVar == null) {
                        cVar = this.f90400d == Integer.MAX_VALUE ? new nm0.c<>(this.f90401e) : new nm0.b<>(this.f90400d);
                        this.f90402f = cVar;
                    }
                    cVar.offer(u11);
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                g();
                return true;
            } catch (Throwable th2) {
                bm0.a.b(th2);
                this.f90404h.c(th2);
                f();
                return true;
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f90403g) {
                return;
            }
            this.f90403g = true;
            f();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90403g) {
                tm0.a.r(th2);
            } else if (this.f90404h.c(th2)) {
                this.f90403g = true;
                f();
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90403g) {
                return;
            }
            try {
                io.reactivex.rxjava3.core.r<? extends U> rVarApply = this.f90398b.apply(t11);
                Objects.requireNonNull(rVarApply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.r<? extends U> rVar = rVarApply;
                if (this.f90400d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i11 = this.f90411o;
                            if (i11 == this.f90400d) {
                                this.f90410n.offer(rVar);
                                return;
                            }
                            this.f90411o = i11 + 1;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                i(rVar);
            } catch (Throwable th3) {
                bm0.a.b(th3);
                this.f90407k.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90407k, bVar)) {
                this.f90407k = bVar;
                this.f90397a.onSubscribe(this);
            }
        }
    }

    public k(io.reactivex.rxjava3.core.r<T> rVar, cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends U>> hVar, boolean z11, int i11, int i12) {
        super(rVar);
        this.f90386b = hVar;
        this.f90387c = z11;
        this.f90388d = i11;
        this.f90389e = i12;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super U> sVar) {
        if (v.b(this.f90266a, sVar, this.f90386b)) {
            return;
        }
        this.f90266a.a(new b(sVar, this.f90386b, this.f90387c, this.f90388d, this.f90389e));
    }
}
