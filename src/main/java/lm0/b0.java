package lm0;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class b0<T, R> extends lm0.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends R>> f90290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f90291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f90292d;

    static final class a<T, R> extends AtomicReference<am0.b> implements io.reactivex.rxjava3.core.s<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T, R> f90293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f90294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f90295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile fm0.h<R> f90296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f90297e;

        a(b<T, R> bVar, long j11, int i11) {
            this.f90293a = bVar;
            this.f90294b = j11;
            this.f90295c = i11;
        }

        public void a() {
            dm0.b.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f90294b == this.f90293a.f90308j) {
                this.f90297e = true;
                this.f90293a.b();
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            this.f90293a.e(this, th2);
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(R r11) {
            if (this.f90294b == this.f90293a.f90308j) {
                if (r11 != null) {
                    this.f90296d.offer(r11);
                }
                this.f90293a.b();
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.setOnce(this, bVar)) {
                if (bVar instanceof fm0.c) {
                    fm0.c cVar = (fm0.c) bVar;
                    int iRequestFusion = cVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f90296d = cVar;
                        this.f90297e = true;
                        this.f90293a.b();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.f90296d = cVar;
                        return;
                    }
                }
                this.f90296d = new nm0.c(this.f90295c);
            }
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.s<T>, am0.b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final a<Object, Object> f90298k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super R> f90299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends R>> f90300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f90301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f90302d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f90304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f90305g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        am0.b f90306h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile long f90308j;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicReference<a<T, R>> f90307i = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final rm0.b f90303e = new rm0.b();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f90298k = aVar;
            aVar.a();
        }

        b(io.reactivex.rxjava3.core.s<? super R> sVar, cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends R>> hVar, int i11, boolean z11) {
            this.f90299a = sVar;
            this.f90300b = hVar;
            this.f90301c = i11;
            this.f90302d = z11;
        }

        void a() {
            a<T, R> andSet = this.f90307i.getAndSet((a<T, R>) f90298k);
            if (andSet != null) {
                andSet.a();
            }
        }

        /* JADX WARN: Code duplicated, block: B:76:0x00bc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x0010 A[SYNTHETIC] */
        void b() {
            fm0.h<R> hVar;
            a.a.Companion companionPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.s<? super R> sVar = this.f90299a;
            AtomicReference<a<T, R>> atomicReference = this.f90307i;
            boolean z11 = this.f90302d;
            int iAddAndGet = 1;
            while (!this.f90305g) {
                if (this.f90304f) {
                    boolean z12 = atomicReference.get() == null;
                    if (z11) {
                        if (z12) {
                            Throwable th2 = this.f90303e.get();
                            if (th2 != null) {
                                sVar.onError(th2);
                                return;
                            } else {
                                sVar.onComplete();
                                return;
                            }
                        }
                    } else if (this.f90303e.get() != null) {
                        this.f90303e.e(sVar);
                        return;
                    } else if (z12) {
                        sVar.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = atomicReference.get();
                if (aVar != null && (hVar = aVar.f90296d) != null) {
                    boolean z13 = false;
                    while (!this.f90305g) {
                        if (aVar == atomicReference.get()) {
                            if (!z11 && this.f90303e.get() != null) {
                                this.f90303e.e(sVar);
                                return;
                            }
                            boolean z14 = aVar.f90297e;
                            try {
                                companionPoll = hVar.poll();
                            } catch (Throwable th3) {
                                bm0.a.b(th3);
                                this.f90303e.c(th3);
                                androidx.camera.view.i.a(atomicReference, aVar, null);
                                if (z11) {
                                    aVar.a();
                                } else {
                                    a();
                                    this.f90306h.dispose();
                                    this.f90304f = true;
                                }
                                z13 = true;
                                companionPoll = null;
                            }
                            boolean z15 = companionPoll == null;
                            if (z14 && z15) {
                                androidx.camera.view.i.a(atomicReference, aVar, null);
                            } else if (!z15) {
                                sVar.onNext(companionPoll);
                            }
                            if (z13) {
                                continue;
                            }
                        }
                        z13 = true;
                        if (z13) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // am0.b
        public void dispose() {
            if (this.f90305g) {
                return;
            }
            this.f90305g = true;
            this.f90306h.dispose();
            a();
            this.f90303e.d();
        }

        void e(a<T, R> aVar, Throwable th2) {
            if (aVar.f90294b != this.f90308j || !this.f90303e.b(th2)) {
                tm0.a.r(th2);
                return;
            }
            if (!this.f90302d) {
                this.f90306h.dispose();
                this.f90304f = true;
            }
            aVar.f90297e = true;
            b();
        }

        @Override // am0.b
        public boolean isDisposed() {
            return this.f90305g;
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onComplete() {
            if (this.f90304f) {
                return;
            }
            this.f90304f = true;
            b();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onError(Throwable th2) {
            if (this.f90304f || !this.f90303e.b(th2)) {
                tm0.a.r(th2);
                return;
            }
            if (!this.f90302d) {
                a();
            }
            this.f90304f = true;
            b();
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            a<T, R> aVar;
            long j11 = this.f90308j + 1;
            this.f90308j = j11;
            a<T, R> aVar2 = this.f90307i.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                io.reactivex.rxjava3.core.r<? extends R> rVarApply = this.f90300b.apply(t11);
                Objects.requireNonNull(rVarApply, "The ObservableSource returned is null");
                io.reactivex.rxjava3.core.r<? extends R> rVar = rVarApply;
                a aVar3 = new a(this, j11, this.f90301c);
                do {
                    aVar = this.f90307i.get();
                    if (aVar == f90298k) {
                        return;
                    }
                } while (!androidx.camera.view.i.a(this.f90307i, aVar, aVar3));
                rVar.a(aVar3);
            } catch (Throwable th2) {
                bm0.a.b(th2);
                this.f90306h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public void onSubscribe(am0.b bVar) {
            if (dm0.b.validate(this.f90306h, bVar)) {
                this.f90306h = bVar;
                this.f90299a.onSubscribe(this);
            }
        }
    }

    public b0(io.reactivex.rxjava3.core.r<T> rVar, cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends R>> hVar, int i11, boolean z11) {
        super(rVar);
        this.f90290b = hVar;
        this.f90291c = i11;
        this.f90292d = z11;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super R> sVar) {
        if (v.b(this.f90266a, sVar, this.f90290b)) {
            return;
        }
        this.f90266a.a(new b(sVar, this.f90290b, this.f90291c, this.f90292d));
    }
}
