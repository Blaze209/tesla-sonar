package j0;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.s;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d<V> implements s<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final s<V> f82290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.concurrent.futures.c.a<V> f82291b;

    class a implements androidx.concurrent.futures.c.InterfaceC0146c<V> {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0146c
        public Object a(@NonNull androidx.concurrent.futures.c.a<V> aVar) {
            u5.h.j(d.this.f82291b == null, "The result can only set once!");
            d.this.f82291b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    d(@NonNull s<V> sVar) {
        this.f82290a = (s) u5.h.g(sVar);
    }

    @NonNull
    public static <V> d<V> a(@NonNull s<V> sVar) {
        return sVar instanceof d ? (d) sVar : new d<>(sVar);
    }

    @Override // com.google.common.util.concurrent.s
    public void b(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f82290a.b(runnable, executor);
    }

    boolean c(V v11) {
        androidx.concurrent.futures.c.a<V> aVar = this.f82291b;
        if (aVar != null) {
            return aVar.c(v11);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f82290a.cancel(z11);
    }

    boolean d(@NonNull Throwable th2) {
        androidx.concurrent.futures.c.a<V> aVar = this.f82291b;
        if (aVar != null) {
            return aVar.f(th2);
        }
        return false;
    }

    @NonNull
    public final <T> d<T> e(@NonNull r.a<? super V, T> aVar, @NonNull Executor executor) {
        return (d) n.x(this, aVar, executor);
    }

    @NonNull
    public final <T> d<T> f(@NonNull j0.a<? super V, T> aVar, @NonNull Executor executor) {
        return (d) n.y(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f82290a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f82290a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f82290a.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, @NonNull TimeUnit timeUnit) {
        return this.f82290a.get(j11, timeUnit);
    }

    d() {
        this.f82290a = androidx.concurrent.futures.c.a(new a());
    }
}
