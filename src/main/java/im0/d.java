package im0;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes9.dex */
public final class d<T> extends im0.b<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.f<? super T> f78319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final cm0.f<? super Throwable> f78320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final cm0.a f78321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final cm0.a f78322f;

    static final class a<T> extends pm0.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final cm0.f<? super T> f78323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final cm0.f<? super Throwable> f78324g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final cm0.a f78325h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final cm0.a f78326i;

        a(fm0.a<? super T> aVar, cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2, cm0.a aVar2, cm0.a aVar3) {
            super(aVar);
            this.f78323f = fVar;
            this.f78324g = fVar2;
            this.f78325h = aVar2;
            this.f78326i = aVar3;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // fm0.a
        public boolean a(T t11) {
            if (this.f103456d) {
                return false;
            }
            try {
                this.f78323f.accept(t11);
                return this.f103453a.a((Object) t11);
            } catch (Throwable th2) {
                d(th2);
                return false;
            }
        }

        @Override // pm0.a, nr0.b
        public void onComplete() {
            if (this.f103456d) {
                return;
            }
            try {
                this.f78325h.run();
                this.f103456d = true;
                this.f103453a.onComplete();
                try {
                    this.f78326i.run();
                } catch (Throwable th2) {
                    bm0.a.b(th2);
                    tm0.a.r(th2);
                }
            } catch (Throwable th3) {
                d(th3);
            }
        }

        @Override // pm0.a, nr0.b
        public void onError(Throwable th2) {
            if (this.f103456d) {
                tm0.a.r(th2);
                return;
            }
            this.f103456d = true;
            try {
                this.f78324g.accept(th2);
                this.f103453a.onError(th2);
            } catch (Throwable th3) {
                bm0.a.b(th3);
                this.f103453a.onError(new CompositeException(th2, th3));
            }
            try {
                this.f78326i.run();
            } catch (Throwable th4) {
                bm0.a.b(th4);
                tm0.a.r(th4);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // nr0.b
        public void onNext(T t11) {
            if (this.f103456d) {
                return;
            }
            if (this.f103457e != 0) {
                this.f103453a.onNext(null);
                return;
            }
            try {
                this.f78323f.accept(t11);
                this.f103453a.onNext((Object) t11);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // fm0.h
        public T poll() throws Exception {
            try {
                T tPoll = this.f103455c.poll();
                if (tPoll == null) {
                    if (this.f103457e == 1) {
                        this.f78325h.run();
                        this.f78326i.run();
                    }
                    return tPoll;
                }
                try {
                    this.f78323f.accept(tPoll);
                    this.f78326i.run();
                    return tPoll;
                } catch (Throwable th2) {
                    try {
                        bm0.a.b(th2);
                        try {
                            this.f78324g.accept(th2);
                            throw rm0.g.f(th2);
                        } catch (Throwable th3) {
                            bm0.a.b(th3);
                            throw new CompositeException(th2, th3);
                        }
                    } catch (Throwable th4) {
                        this.f78326i.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                bm0.a.b(th5);
                try {
                    this.f78324g.accept(th5);
                    throw rm0.g.f(th5);
                } catch (Throwable th6) {
                    bm0.a.b(th6);
                    throw new CompositeException(th5, th6);
                }
            }
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            return e(i11);
        }
    }

    static final class b<T> extends pm0.b<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final cm0.f<? super T> f78327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final cm0.f<? super Throwable> f78328g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final cm0.a f78329h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final cm0.a f78330i;

        b(nr0.b<? super T> bVar, cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2, cm0.a aVar, cm0.a aVar2) {
            super(bVar);
            this.f78327f = fVar;
            this.f78328g = fVar2;
            this.f78329h = aVar;
            this.f78330i = aVar2;
        }

        @Override // pm0.b, nr0.b
        public void onComplete() {
            if (this.f103461d) {
                return;
            }
            try {
                this.f78329h.run();
                this.f103461d = true;
                this.f103458a.onComplete();
                try {
                    this.f78330i.run();
                } catch (Throwable th2) {
                    bm0.a.b(th2);
                    tm0.a.r(th2);
                }
            } catch (Throwable th3) {
                d(th3);
            }
        }

        @Override // pm0.b, nr0.b
        public void onError(Throwable th2) {
            if (this.f103461d) {
                tm0.a.r(th2);
                return;
            }
            this.f103461d = true;
            try {
                this.f78328g.accept(th2);
                this.f103458a.onError(th2);
            } catch (Throwable th3) {
                bm0.a.b(th3);
                this.f103458a.onError(new CompositeException(th2, th3));
            }
            try {
                this.f78330i.run();
            } catch (Throwable th4) {
                bm0.a.b(th4);
                tm0.a.r(th4);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // nr0.b
        public void onNext(T t11) {
            if (this.f103461d) {
                return;
            }
            if (this.f103462e != 0) {
                this.f103458a.onNext(null);
                return;
            }
            try {
                this.f78327f.accept(t11);
                this.f103458a.onNext((Object) t11);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // fm0.h
        public T poll() throws Exception {
            try {
                T tPoll = this.f103460c.poll();
                if (tPoll == null) {
                    if (this.f103462e == 1) {
                        this.f78329h.run();
                        this.f78330i.run();
                    }
                    return tPoll;
                }
                try {
                    this.f78327f.accept(tPoll);
                    this.f78330i.run();
                    return tPoll;
                } catch (Throwable th2) {
                    try {
                        bm0.a.b(th2);
                        try {
                            this.f78328g.accept(th2);
                            throw rm0.g.f(th2);
                        } catch (Throwable th3) {
                            bm0.a.b(th3);
                            throw new CompositeException(th2, th3);
                        }
                    } catch (Throwable th4) {
                        this.f78330i.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                bm0.a.b(th5);
                try {
                    this.f78328g.accept(th5);
                    throw rm0.g.f(th5);
                } catch (Throwable th6) {
                    bm0.a.b(th6);
                    throw new CompositeException(th5, th6);
                }
            }
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            return e(i11);
        }
    }

    public d(io.reactivex.rxjava3.core.h<T> hVar, cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2, cm0.a aVar, cm0.a aVar2) {
        super(hVar);
        this.f78319c = fVar;
        this.f78320d = fVar2;
        this.f78321e = aVar;
        this.f78322f = aVar2;
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super T> bVar) {
        if (bVar instanceof fm0.a) {
            this.f78303b.x(new a((fm0.a) bVar, this.f78319c, this.f78320d, this.f78321e, this.f78322f));
        } else {
            this.f78303b.x(new b(bVar, this.f78319c, this.f78320d, this.f78321e, this.f78322f));
        }
    }
}
