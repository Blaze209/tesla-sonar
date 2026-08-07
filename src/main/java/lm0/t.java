package lm0;

/* JADX INFO: loaded from: classes9.dex */
public final class t<T> extends lm0.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.t f90435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f90436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f90437d;

    static final class a<T> extends gm0.b<T> implements io.reactivex.rxjava3.core.s<T>, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.rxjava3.core.t.c f90439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f90440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f90441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        fm0.h<T> f90442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        am0.b f90443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Throwable f90444g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f90445h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f90446i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f90447j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f90448k;

        a(io.reactivex.rxjava3.core.s<? super T> sVar, io.reactivex.rxjava3.core.t.c cVar, boolean z11, int i11) {
            this.f90438a = sVar;
            this.f90439b = cVar;
            this.f90440c = z11;
            this.f90441d = i11;
        }

        boolean a(boolean z11, boolean z12, io.reactivex.rxjava3.core.s<? super T> sVar) {
            if (this.f90446i) {
                this.f90442e.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f90444g;
            if (this.f90440c) {
                if (!z12) {
                    return false;
                }
                this.f90446i = true;
                if (th2 != null) {
                    sVar.onError(th2);
                } else {
                    sVar.onComplete();
                }
                this.f90439b.dispose();
                return true;
            }
            if (th2 != null) {
                this.f90446i = true;
                this.f90442e.clear();
                sVar.onError(th2);
                this.f90439b.dispose();
                return true;
            }
            if (!z12) {
                return false;
            }
            this.f90446i = true;
            sVar.onComplete();
            this.f90439b.dispose();
            return true;
        }

        void b() {
            int iAddAndGet = 1;
            while (!this.f90446i) {
                boolean z11 = this.f90445h;
                Throwable th2 = this.f90444g;
                if (!this.f90440c && z11 && th2 != null) {
                    this.f90446i = true;
                    this.f90438a.onError(this.f90444g);
                    this.f90439b.dispose();
                    return;
                }
                this.f90438a.onNext(null);
                if (z11) {
                    this.f90446i = true;
                    Throwable th3 = this.f90444g;
                    if (th3 != null) {
                        this.f90438a.onError(th3);
                    } else {
                        this.f90438a.onComplete();
                    }
                    this.f90439b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // fm0.h
        public void clear() {
            this.f90442e.clear();
        }

        @Override // am0.b
        public void dispose() {
            if (this.f90446i) {
                return;
            }
            this.f90446i = true;
            this.f90443f.dispose();
            this.f90439b.dispose();
            if (this.f90448k || getAndIncrement() != 0) {
                return;
            }
            this.f90442e.clear();
        }

        void e() {
            fm0.h<T> hVar = this.f90442e;
            io.reactivex.rxjava3.core.s<? super T> sVar = this.f90438a;
            int iAddAndGet = 1;
            while (!a(this.f90445h, hVar.isEmpty(), sVar)) {
                while (true) {
                    boolean z11 = this.f90445h;
                    try {
                        T tPoll = hVar.poll();
                        boolean z12 = tPoll == null;
                        if (a(z11, z12, sVar)) {
                            return;
                        }
                        if (z12) {
                            break;
                        } else {
                            sVar.onNext(tPoll);
                        }
                    } catch (Throwable th2) {
                        bm0.a.b(th2);
                        this.f90446i = true;
                        this.f90443f.dispose();
                        hVar.clear();
                        sVar.onError(th2);
                        this.f90439b.dispose();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void f() {
            if (getAndIncrement() == 0) {
                this.f90439b.schedule(this);
            }
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90446i;
        }

        @Override // fm0.h
        public boolean isEmpty() {
            return this.f90442e.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f90445h) {
                return;
            }
            this.f90445h = true;
            f();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90445h) {
                tm0.a.r(th2);
                return;
            }
            this.f90444g = th2;
            this.f90445h = true;
            f();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f90445h) {
                return;
            }
            if (this.f90447j != 2) {
                this.f90442e.offer(t11);
            }
            f();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90443f, bVar)) {
                this.f90443f = bVar;
                if (bVar instanceof fm0.c) {
                    fm0.c cVar = (fm0.c) bVar;
                    int iRequestFusion = cVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f90447j = iRequestFusion;
                        this.f90442e = cVar;
                        this.f90445h = true;
                        this.f90438a.onSubscribe(this);
                        f();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f90447j = iRequestFusion;
                        this.f90442e = cVar;
                        this.f90438a.onSubscribe(this);
                        return;
                    }
                }
                this.f90442e = new nm0.c(this.f90441d);
                this.f90438a.onSubscribe(this);
            }
        }

        @Override // fm0.h
        public T poll() {
            return this.f90442e.poll();
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            this.f90448k = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f90448k) {
                b();
            } else {
                e();
            }
        }
    }

    public t(io.reactivex.rxjava3.core.r<T> rVar, io.reactivex.rxjava3.core.t tVar, boolean z11, int i11) {
        super(rVar);
        this.f90435b = tVar;
        this.f90436c = z11;
        this.f90437d = i11;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        io.reactivex.rxjava3.core.t tVar = this.f90435b;
        if (tVar instanceof om0.q) {
            this.f90266a.a(sVar);
        } else {
            this.f90266a.a(new a(sVar, tVar.createWorker(), this.f90436c, this.f90437d));
        }
    }
}
