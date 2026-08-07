package lm0;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class c<T, U> extends lm0.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends U>> f90309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f90310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final rm0.f f90311d;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super R> f90312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends R>> f90313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f90314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final rm0.b f90315d = new rm0.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final C1909a<R> f90316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f90317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        fm0.h<T> f90318g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        am0.b f90319h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f90320i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f90321j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f90322k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f90323l;

        /* JADX INFO: renamed from: lm0.c$a$a, reason: collision with other inner class name */
        static final class C1909a<R> extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.s<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.rxjava3.core.s<? super R> f90324a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final a<?, R> f90325b;

            C1909a(io.reactivex.rxjava3.core.s<? super R> sVar, a<?, R> aVar) {
                this.f90324a = sVar;
                this.f90325b = aVar;
            }

            void a() {
                dm0.b.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onComplete() {
                a<?, R> aVar = this.f90325b;
                aVar.f90320i = false;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onError(Throwable th2) {
                a<?, R> aVar = this.f90325b;
                if (aVar.f90315d.c(th2)) {
                    if (!aVar.f90317f) {
                        aVar.f90319h.dispose();
                    }
                    aVar.f90320i = false;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onNext(R r11) {
                this.f90324a.onNext(r11);
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onSubscribe(am0.b bVar) {
                dm0.b.replace(this, bVar);
            }
        }

        a(io.reactivex.rxjava3.core.s<? super R> sVar, cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends R>> hVar, int i11, boolean z11) {
            this.f90312a = sVar;
            this.f90313b = hVar;
            this.f90314c = i11;
            this.f90317f = z11;
            this.f90316e = new C1909a<>(sVar, this);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.s<? super R> sVar = this.f90312a;
            fm0.h<T> hVar = this.f90318g;
            rm0.b bVar = this.f90315d;
            while (true) {
                if (!this.f90320i) {
                    if (this.f90322k) {
                        hVar.clear();
                        return;
                    }
                    if (!this.f90317f && bVar.get() != null) {
                        hVar.clear();
                        this.f90322k = true;
                        bVar.e(sVar);
                        return;
                    }
                    boolean z11 = this.f90321j;
                    try {
                        T tPoll = hVar.poll();
                        boolean z12 = tPoll == null;
                        if (z11 && z12) {
                            this.f90322k = true;
                            bVar.e(sVar);
                            return;
                        }
                        if (!z12) {
                            try {
                                io.reactivex.rxjava3.core.r<? extends R> rVarApply = this.f90313b.apply(tPoll);
                                Objects.requireNonNull(rVarApply, "The mapper returned a null ObservableSource");
                                io.reactivex.rxjava3.core.r<? extends R> rVar = rVarApply;
                                if (rVar instanceof cm0.k) {
                                    try {
                                        a.a.b bVar2 = (Object) ((cm0.k) rVar).get();
                                        if (bVar2 != null && !this.f90322k) {
                                            sVar.onNext(bVar2);
                                        }
                                    } catch (Throwable th2) {
                                        bm0.a.b(th2);
                                        bVar.c(th2);
                                    }
                                } else {
                                    this.f90320i = true;
                                    rVar.a(this.f90316e);
                                }
                            } catch (Throwable th3) {
                                bm0.a.b(th3);
                                this.f90322k = true;
                                this.f90319h.dispose();
                                hVar.clear();
                                bVar.c(th3);
                                bVar.e(sVar);
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        bm0.a.b(th4);
                        this.f90322k = true;
                        this.f90319h.dispose();
                        bVar.c(th4);
                        bVar.e(sVar);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // am0.b
        public void dispose() {
            this.f90322k = true;
            this.f90319h.dispose();
            this.f90316e.a();
            this.f90315d.d();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90322k;
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            this.f90321j = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90315d.c(th2)) {
                this.f90321j = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90323l == 0) {
                this.f90318g.offer(t11);
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90319h, bVar)) {
                this.f90319h = bVar;
                if (bVar instanceof fm0.c) {
                    fm0.c cVar = (fm0.c) bVar;
                    int iRequestFusion = cVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f90323l = iRequestFusion;
                        this.f90318g = cVar;
                        this.f90321j = true;
                        this.f90312a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f90323l = iRequestFusion;
                        this.f90318g = cVar;
                        this.f90312a.onSubscribe(this);
                        return;
                    }
                }
                this.f90318g = new nm0.c(this.f90314c);
                this.f90312a.onSubscribe(this);
            }
        }
    }

    static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super U> f90326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends U>> f90327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<U> f90328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f90329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        fm0.h<T> f90330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        am0.b f90331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f90332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f90333h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f90334i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f90335j;

        static final class a<U> extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.s<U> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.rxjava3.core.s<? super U> f90336a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final b<?, ?> f90337b;

            a(io.reactivex.rxjava3.core.s<? super U> sVar, b<?, ?> bVar) {
                this.f90336a = sVar;
                this.f90337b = bVar;
            }

            void a() {
                dm0.b.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onComplete() {
                this.f90337b.b();
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onError(Throwable th2) {
                this.f90337b.dispose();
                this.f90336a.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onNext(U u11) {
                this.f90336a.onNext(u11);
            }

            @Override // io.reactivex.rxjava3.core.s
            public void onSubscribe(am0.b bVar) {
                dm0.b.replace(this, bVar);
            }
        }

        b(io.reactivex.rxjava3.core.s<? super U> sVar, cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends U>> hVar, int i11) {
            this.f90326a = sVar;
            this.f90327b = hVar;
            this.f90329d = i11;
            this.f90328c = new a<>(sVar, this);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f90333h) {
                if (!this.f90332g) {
                    boolean z11 = this.f90334i;
                    try {
                        T tPoll = this.f90330e.poll();
                        boolean z12 = tPoll == null;
                        if (z11 && z12) {
                            this.f90333h = true;
                            this.f90326a.onComplete();
                            return;
                        }
                        if (!z12) {
                            try {
                                io.reactivex.rxjava3.core.r<? extends U> rVarApply = this.f90327b.apply(tPoll);
                                Objects.requireNonNull(rVarApply, "The mapper returned a null ObservableSource");
                                io.reactivex.rxjava3.core.r<? extends U> rVar = rVarApply;
                                this.f90332g = true;
                                rVar.a(this.f90328c);
                            } catch (Throwable th2) {
                                bm0.a.b(th2);
                                dispose();
                                this.f90330e.clear();
                                this.f90326a.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        bm0.a.b(th3);
                        dispose();
                        this.f90330e.clear();
                        this.f90326a.onError(th3);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f90330e.clear();
        }

        void b() {
            this.f90332g = false;
            a();
        }

        @Override // am0.b
        public void dispose() {
            this.f90333h = true;
            this.f90328c.a();
            this.f90331f.dispose();
            if (getAndIncrement() == 0) {
                this.f90330e.clear();
            }
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90333h;
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f90334i) {
                return;
            }
            this.f90334i = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90334i) {
                tm0.a.r(th2);
                return;
            }
            this.f90334i = true;
            dispose();
            this.f90326a.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90334i) {
                return;
            }
            if (this.f90335j == 0) {
                this.f90330e.offer(t11);
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90331f, bVar)) {
                this.f90331f = bVar;
                if (bVar instanceof fm0.c) {
                    fm0.c cVar = (fm0.c) bVar;
                    int iRequestFusion = cVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f90335j = iRequestFusion;
                        this.f90330e = cVar;
                        this.f90334i = true;
                        this.f90326a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f90335j = iRequestFusion;
                        this.f90330e = cVar;
                        this.f90326a.onSubscribe(this);
                        return;
                    }
                }
                this.f90330e = new nm0.c(this.f90329d);
                this.f90326a.onSubscribe(this);
            }
        }
    }

    public c(io.reactivex.rxjava3.core.r<T> rVar, cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends U>> hVar, int i11, rm0.f fVar) {
        super(rVar);
        this.f90309b = hVar;
        this.f90311d = fVar;
        this.f90310c = Math.max(8, i11);
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super U> sVar) {
        if (v.b(this.f90266a, sVar, this.f90309b)) {
            return;
        }
        if (this.f90311d == rm0.f.IMMEDIATE) {
            this.f90266a.a(new b(new sm0.a(sVar), this.f90309b, this.f90310c));
        } else {
            this.f90266a.a(new a(sVar, this.f90309b, this.f90310c, this.f90311d == rm0.f.END));
        }
    }
}
