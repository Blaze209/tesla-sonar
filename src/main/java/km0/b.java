package km0;

import io.reactivex.rxjava3.core.h;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.y;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nr0.c;
import rm0.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b<T, R> extends h<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h<T> f86305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.h<? super T, ? extends y<? extends R>> f86306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final f f86307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f86308e;

    static final class a<T, R> extends km0.a<T> implements c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final nr0.b<? super R> f86309i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final cm0.h<? super T, ? extends y<? extends R>> f86310j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicLong f86311k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final C1848a<R> f86312l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f86313m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f86314n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        R f86315o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        volatile int f86316p;

        /* JADX INFO: renamed from: km0.b$a$a, reason: collision with other inner class name */
        static final class C1848a<R> extends AtomicReference<am0.b> implements w<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, R> f86317a;

            C1848a(a<?, R> aVar) {
                this.f86317a = aVar;
            }

            void a() {
                dm0.b.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onError(Throwable th2) {
                this.f86317a.g(th2);
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onSubscribe(am0.b bVar) {
                dm0.b.replace(this, bVar);
            }

            @Override // io.reactivex.rxjava3.core.w
            public void onSuccess(R r11) {
                this.f86317a.h(r11);
            }
        }

        a(nr0.b<? super R> bVar, cm0.h<? super T, ? extends y<? extends R>> hVar, int i11, f fVar) {
            super(i11, fVar);
            this.f86309i = bVar;
            this.f86310j = hVar;
            this.f86311k = new AtomicLong();
            this.f86312l = new C1848a<>(this);
        }

        @Override // km0.a
        void b() {
            this.f86315o = null;
        }

        @Override // km0.a
        void c() {
            this.f86312l.a();
        }

        @Override // nr0.c
        public void cancel() {
            f();
        }

        @Override // km0.a
        void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            nr0.b<? super R> bVar = this.f86309i;
            f fVar = this.f86299c;
            fm0.h<T> hVar = this.f86300d;
            rm0.b bVar2 = this.f86297a;
            AtomicLong atomicLong = this.f86311k;
            int i11 = this.f86298b;
            int i12 = i11 - (i11 >> 1);
            boolean z11 = this.f86304h;
            int iAddAndGet = 1;
            while (true) {
                if (!this.f86303g) {
                    int i13 = this.f86316p;
                    if (bVar2.get() != null && (fVar == f.IMMEDIATE || (fVar == f.BOUNDARY && i13 == 0))) {
                        break;
                    }
                    if (i13 == 0) {
                        boolean z12 = this.f86302f;
                        try {
                            T tPoll = hVar.poll();
                            boolean z13 = tPoll == null;
                            if (z12 && z13) {
                                bVar2.f(bVar);
                                return;
                            }
                            if (!z13) {
                                if (!z11) {
                                    int i14 = this.f86314n + 1;
                                    if (i14 == i12) {
                                        this.f86314n = 0;
                                        this.f86301e.request(i12);
                                    } else {
                                        this.f86314n = i14;
                                    }
                                }
                                try {
                                    y<? extends R> yVarApply = this.f86310j.apply(tPoll);
                                    Objects.requireNonNull(yVarApply, "The mapper returned a null SingleSource");
                                    y<? extends R> yVar = yVarApply;
                                    this.f86316p = 1;
                                    yVar.a(this.f86312l);
                                } catch (Throwable th2) {
                                    bm0.a.b(th2);
                                    this.f86301e.cancel();
                                    hVar.clear();
                                    bVar2.c(th2);
                                    bVar2.f(bVar);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            bm0.a.b(th3);
                            this.f86301e.cancel();
                            bVar2.c(th3);
                            bVar2.f(bVar);
                            return;
                        }
                    } else if (i13 == 2) {
                        long j11 = this.f86313m;
                        if (j11 != atomicLong.get()) {
                            R r11 = this.f86315o;
                            this.f86315o = null;
                            bVar.onNext(r11);
                            this.f86313m = j11 + 1;
                            this.f86316p = 0;
                        }
                    }
                } else {
                    hVar.clear();
                    this.f86315o = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            hVar.clear();
            this.f86315o = null;
            bVar2.f(bVar);
        }

        @Override // km0.a
        void e() {
            this.f86309i.onSubscribe(this);
        }

        void g(Throwable th2) {
            if (this.f86297a.c(th2)) {
                if (this.f86299c != f.END) {
                    this.f86301e.cancel();
                }
                this.f86316p = 0;
                d();
            }
        }

        void h(R r11) {
            this.f86315o = r11;
            this.f86316p = 2;
            d();
        }

        @Override // nr0.c
        public void request(long j11) {
            rm0.c.a(this.f86311k, j11);
            d();
        }
    }

    public b(h<T> hVar, cm0.h<? super T, ? extends y<? extends R>> hVar2, f fVar, int i11) {
        this.f86305b = hVar;
        this.f86306c = hVar2;
        this.f86307d = fVar;
        this.f86308e = i11;
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super R> bVar) {
        this.f86305b.x(new a(bVar, this.f86306c, this.f86308e, this.f86307d));
    }
}
