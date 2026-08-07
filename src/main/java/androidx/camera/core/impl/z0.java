package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z0<T> implements g2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z0<Object> f3373b = new z0<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<T> f3374a;

    private z0(T t11) {
        this.f3374a = j0.n.p(t11);
    }

    public static /* synthetic */ void a(z0 z0Var, g2.a aVar) {
        z0Var.getClass();
        try {
            aVar.a(z0Var.f3374a.get());
        } catch (InterruptedException | ExecutionException e11) {
            aVar.onError(e11);
        }
    }

    @NonNull
    public static <U> g2<U> f(U u11) {
        return u11 == null ? f3373b : new z0(u11);
    }

    @Override // androidx.camera.core.impl.g2
    @NonNull
    public com.google.common.util.concurrent.s<T> b() {
        return this.f3374a;
    }

    @Override // androidx.camera.core.impl.g2
    public void c(@NonNull Executor executor, @NonNull final g2.a<? super T> aVar) {
        this.f3374a.b(new Runnable() { // from class: androidx.camera.core.impl.y0
            @Override // java.lang.Runnable
            public final void run() {
                z0.a(this.f3368a, aVar);
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.g2
    public void d(@NonNull g2.a<? super T> aVar) {
    }
}
