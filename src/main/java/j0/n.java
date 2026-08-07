package j0;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r.a<?, ?> f82313a = new b();

    /* JADX INFO: Add missing generic type declarations: [I, O] */
    class a<I, O> implements j0.a<I, O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r.a f82314a;

        a(r.a aVar) {
            this.f82314a = aVar;
        }

        @Override // j0.a
        @NonNull
        public s<O> apply(I i11) {
            return n.p(this.f82314a.apply(i11));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class c<I> implements j0.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f82315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r.a f82316b;

        c(androidx.concurrent.futures.c.a aVar, r.a aVar2) {
            this.f82315a = aVar;
            this.f82316b = aVar2;
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            this.f82315a.f(th2);
        }

        @Override // j0.c
        public void onSuccess(I i11) {
            try {
                this.f82315a.c(this.f82316b.apply(i11));
            } catch (Throwable th2) {
                this.f82315a.f(th2);
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f82317a;

        d(s sVar) {
            this.f82317a = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f82317a.cancel(true);
        }
    }

    private static final class e<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future<V> f82318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j0.c<? super V> f82319b;

        e(Future<V> future, j0.c<? super V> cVar) {
            this.f82318a = future;
            this.f82319b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f82319b.onSuccess(n.l(this.f82318a));
            } catch (Error e11) {
                e = e11;
                this.f82319b.onFailure(e);
            } catch (RuntimeException e12) {
                e = e12;
                this.f82319b.onFailure(e);
            } catch (ExecutionException e13) {
                Throwable cause = e13.getCause();
                if (cause == null) {
                    this.f82319b.onFailure(e13);
                } else {
                    this.f82319b.onFailure(cause);
                }
            }
        }

        @NonNull
        public String toString() {
            return e.class.getSimpleName() + "," + this.f82319b;
        }
    }

    public static /* synthetic */ Object a(final s sVar, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z11, long j11, final androidx.concurrent.futures.c.a aVar) {
        t(sVar, aVar);
        if (!sVar.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: j0.h
                @Override // java.lang.Runnable
                public final void run() {
                    n.h(aVar, obj, z11, sVar);
                }
            }, j11, TimeUnit.MILLISECONDS);
            sVar.b(new Runnable() { // from class: j0.i
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, i0.c.b());
        }
        return "TimeoutFuture[" + sVar + "]";
    }

    public static /* synthetic */ Object c(s sVar, androidx.concurrent.futures.c.a aVar) {
        v(false, sVar, f82313a, aVar, i0.c.b());
        return "nonCancellationPropagating[" + sVar + "]";
    }

    public static /* synthetic */ Object d(final s sVar, ScheduledExecutorService scheduledExecutorService, final long j11, final androidx.concurrent.futures.c.a aVar) {
        t(sVar, aVar);
        if (!sVar.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: j0.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(aVar.f(new TimeoutException("Future[" + sVar + "] is not done within " + j11 + " ms.")));
                }
            }, j11, TimeUnit.MILLISECONDS);
            sVar.b(new Runnable() { // from class: j0.m
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, i0.c.b());
        }
        return "TimeoutFuture[" + sVar + "]";
    }

    public static /* synthetic */ Object f(s sVar, final androidx.concurrent.futures.c.a aVar) {
        sVar.b(new Runnable() { // from class: j0.g
            @Override // java.lang.Runnable
            public final void run() {
                aVar.c(null);
            }
        }, i0.c.b());
        return "transformVoidFuture [" + sVar + "]";
    }

    public static /* synthetic */ void h(androidx.concurrent.futures.c.a aVar, Object obj, boolean z11, s sVar) {
        aVar.c(obj);
        if (z11) {
            sVar.cancel(true);
        }
    }

    public static <V> void j(@NonNull s<V> sVar, @NonNull j0.c<? super V> cVar, @NonNull Executor executor) {
        u5.h.g(cVar);
        sVar.b(new e(sVar, cVar), executor);
    }

    @NonNull
    public static <V> s<List<V>> k(@NonNull Collection<? extends s<? extends V>> collection) {
        return new p(new ArrayList(collection), true, i0.c.b());
    }

    public static <V> V l(@NonNull Future<V> future) {
        u5.h.j(future.isDone(), "Future was expected to be done, " + future);
        return (V) m(future);
    }

    public static <V> V m(@NonNull Future<V> future) {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return v11;
    }

    @NonNull
    public static <V> s<V> n(@NonNull Throwable th2) {
        return new o.a(th2);
    }

    @NonNull
    public static <V> ScheduledFuture<V> o(@NonNull Throwable th2) {
        return new o.b(th2);
    }

    @NonNull
    public static <V> s<V> p(V v11) {
        return v11 == null ? o.a() : new o.c(v11);
    }

    @NonNull
    public static <V> s<V> q(final long j11, @NonNull final ScheduledExecutorService scheduledExecutorService, @NonNull final s<V> sVar) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: j0.k
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return n.d(sVar, scheduledExecutorService, j11, aVar);
            }
        });
    }

    @NonNull
    public static <V> s<V> r(final long j11, @NonNull final ScheduledExecutorService scheduledExecutorService, final V v11, final boolean z11, @NonNull final s<V> sVar) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: j0.f
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return n.a(sVar, scheduledExecutorService, v11, z11, j11, aVar);
            }
        });
    }

    @NonNull
    public static <V> s<V> s(@NonNull final s<V> sVar) {
        u5.h.g(sVar);
        return sVar.isDone() ? sVar : androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: j0.j
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return n.c(sVar, aVar);
            }
        });
    }

    public static <V> void t(@NonNull s<V> sVar, @NonNull androidx.concurrent.futures.c.a<V> aVar) {
        u(sVar, f82313a, aVar, i0.c.b());
    }

    public static <I, O> void u(@NonNull s<I> sVar, @NonNull r.a<? super I, ? extends O> aVar, @NonNull androidx.concurrent.futures.c.a<O> aVar2, @NonNull Executor executor) {
        v(true, sVar, aVar, aVar2, executor);
    }

    private static <I, O> void v(boolean z11, @NonNull s<I> sVar, @NonNull r.a<? super I, ? extends O> aVar, @NonNull androidx.concurrent.futures.c.a<O> aVar2, @NonNull Executor executor) {
        u5.h.g(sVar);
        u5.h.g(aVar);
        u5.h.g(aVar2);
        u5.h.g(executor);
        j(sVar, new c(aVar2, aVar), executor);
        if (z11) {
            aVar2.a(new d(sVar), i0.c.b());
        }
    }

    @NonNull
    public static <V> s<List<V>> w(@NonNull Collection<? extends s<? extends V>> collection) {
        return new p(new ArrayList(collection), false, i0.c.b());
    }

    @NonNull
    public static <I, O> s<O> x(@NonNull s<I> sVar, @NonNull r.a<? super I, ? extends O> aVar, @NonNull Executor executor) {
        u5.h.g(aVar);
        return y(sVar, new a(aVar), executor);
    }

    @NonNull
    public static <I, O> s<O> y(@NonNull s<I> sVar, @NonNull j0.a<? super I, ? extends O> aVar, @NonNull Executor executor) {
        j0.b bVar = new j0.b(aVar, sVar);
        sVar.b(bVar, executor);
        return bVar;
    }

    @NonNull
    public static <V> s<Void> z(@NonNull final s<V> sVar) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: j0.e
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return n.f(sVar, aVar);
            }
        });
    }

    class b implements r.a<Object, Object> {
        b() {
        }

        @Override // r.a
        public Object apply(Object obj) {
            return obj;
        }
    }
}
