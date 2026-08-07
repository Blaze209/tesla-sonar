package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n2 f3262b = n2.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o2 f3263c = new o2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e2<n2> f3264a = e2.l(f3262b);

    private static class a<T> implements g2.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Consumer<T> f3265a;

        a(@NonNull Consumer<T> consumer) {
            this.f3265a = consumer;
        }

        @Override // androidx.camera.core.impl.g2.a
        public void a(T t11) {
            this.f3265a.accept(t11);
        }

        @Override // androidx.camera.core.impl.g2.a
        public void onError(@NonNull Throwable th2) {
            c0.y0.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th2);
        }
    }

    @NonNull
    public static o2 b() {
        return f3263c;
    }

    @NonNull
    public n2 a() {
        try {
            return this.f3264a.b().get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e11);
        }
    }

    public void c(@NonNull Executor executor, @NonNull Consumer<n2> consumer) {
        this.f3264a.c(executor, new a(consumer));
    }

    public void d(@NonNull n2 n2Var) {
        this.f3264a.k(n2Var);
    }
}
