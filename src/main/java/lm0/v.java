package lm0;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class v {

    public static final class a<T> extends AtomicInteger implements fm0.c<T>, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super T> f90453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f90454b;

        public a(io.reactivex.rxjava3.core.s<? super T> sVar, T t11) {
            this.f90453a = sVar;
            this.f90454b = t11;
        }

        @Override // fm0.h
        public void clear() {
            lazySet(3);
        }

        @Override // am0.b
        public void dispose() {
            set(3);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // fm0.h
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // fm0.h
        public boolean offer(T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // fm0.h
        public T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f90454b;
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            if ((i11 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f90453a.onNext(this.f90454b);
                if (get() == 2) {
                    lazySet(3);
                    this.f90453a.onComplete();
                }
            }
        }
    }

    static final class b<T, R> extends io.reactivex.rxjava3.core.o<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f90455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends R>> f90456b;

        b(T t11, cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends R>> hVar) {
            this.f90455a = t11;
            this.f90456b = hVar;
        }

        @Override // io.reactivex.rxjava3.core.o
        public void Q(io.reactivex.rxjava3.core.s<? super R> sVar) {
            try {
                io.reactivex.rxjava3.core.r<? extends R> rVarApply = this.f90456b.apply(this.f90455a);
                Objects.requireNonNull(rVarApply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.r<? extends R> rVar = rVarApply;
                if (!(rVar instanceof cm0.k)) {
                    rVar.a(sVar);
                    return;
                }
                try {
                    Object obj = ((cm0.k) rVar).get();
                    if (obj == null) {
                        dm0.c.complete(sVar);
                        return;
                    }
                    a aVar = new a(sVar, obj);
                    sVar.onSubscribe(aVar);
                    aVar.run();
                } catch (Throwable th2) {
                    bm0.a.b(th2);
                    dm0.c.error(th2, sVar);
                }
            } catch (Throwable th3) {
                bm0.a.b(th3);
                dm0.c.error(th3, sVar);
            }
        }
    }

    public static <T, U> io.reactivex.rxjava3.core.o<U> a(T t11, cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends U>> hVar) {
        return tm0.a.n(new b(t11, hVar));
    }

    public static <T, R> boolean b(io.reactivex.rxjava3.core.r<T> rVar, io.reactivex.rxjava3.core.s<? super R> sVar, cm0.h<? super T, ? extends io.reactivex.rxjava3.core.r<? extends R>> hVar) {
        if (!(rVar instanceof cm0.k)) {
            return false;
        }
        try {
            a.a.b bVar = (Object) ((cm0.k) rVar).get();
            if (bVar == null) {
                dm0.c.complete(sVar);
                return true;
            }
            try {
                io.reactivex.rxjava3.core.r<? extends R> rVarApply = hVar.apply(bVar);
                Objects.requireNonNull(rVarApply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.r<? extends R> rVar2 = rVarApply;
                if (rVar2 instanceof cm0.k) {
                    try {
                        Object obj = ((cm0.k) rVar2).get();
                        if (obj == null) {
                            dm0.c.complete(sVar);
                            return true;
                        }
                        a aVar = new a(sVar, obj);
                        sVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th2) {
                        bm0.a.b(th2);
                        dm0.c.error(th2, sVar);
                        return true;
                    }
                } else {
                    rVar2.a(sVar);
                }
                return true;
            } catch (Throwable th3) {
                bm0.a.b(th3);
                dm0.c.error(th3, sVar);
                return true;
            }
        } catch (Throwable th4) {
            bm0.a.b(th4);
            dm0.c.error(th4, sVar);
            return true;
        }
    }
}
