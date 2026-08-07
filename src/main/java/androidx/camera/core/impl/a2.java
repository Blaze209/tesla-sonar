package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a2<T> implements g2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.p003lifecycle.i0<b<T>> f3106a = new androidx.p003lifecycle.i0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<g2.a<? super T>, a<T>> f3107b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<T> implements androidx.p003lifecycle.j0<b<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicBoolean f3108a = new AtomicBoolean(true);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g2.a<? super T> f3109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f3110c;

        a(@NonNull Executor executor, @NonNull g2.a<? super T> aVar) {
            this.f3110c = executor;
            this.f3109b = aVar;
        }

        public static /* synthetic */ void a(a aVar, b bVar) {
            if (aVar.f3108a.get()) {
                if (bVar.a()) {
                    aVar.f3109b.a((Object) bVar.d());
                } else {
                    u5.h.g(bVar.c());
                    aVar.f3109b.onError(bVar.c());
                }
            }
        }

        void b() {
            this.f3108a.set(false);
        }

        @Override // androidx.p003lifecycle.j0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onChanged(@NonNull final b<T> bVar) {
            this.f3110c.execute(new Runnable() { // from class: androidx.camera.core.impl.z1
                @Override // java.lang.Runnable
                public final void run() {
                    a2.a.a(this.f3375a, bVar);
                }
            });
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f3111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f3112b;

        private b(T t11, Throwable th2) {
            this.f3111a = t11;
            this.f3112b = th2;
        }

        static <T> b<T> b(T t11) {
            return new b<>(t11, null);
        }

        public boolean a() {
            return this.f3112b == null;
        }

        public Throwable c() {
            return this.f3112b;
        }

        public T d() {
            if (a()) {
                return this.f3111a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        @NonNull
        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f3111a;
            } else {
                str = "Error: " + this.f3112b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    public static /* synthetic */ Object a(final a2 a2Var, final androidx.concurrent.futures.c.a aVar) {
        a2Var.getClass();
        i0.c.e().execute(new Runnable() { // from class: androidx.camera.core.impl.y1
            @Override // java.lang.Runnable
            public final void run() {
                a2.g(this.f3370a, aVar);
            }
        });
        return a2Var + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public static /* synthetic */ void g(a2 a2Var, androidx.concurrent.futures.c.a aVar) {
        b<T> value = a2Var.f3106a.getValue();
        if (value == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (value.a()) {
            aVar.c(value.d());
        } else {
            u5.h.g(value.c());
            aVar.f(value.c());
        }
    }

    public static /* synthetic */ void h(a2 a2Var, a aVar, a aVar2) {
        if (aVar != null) {
            a2Var.f3106a.removeObserver(aVar);
        }
        a2Var.f3106a.observeForever(aVar2);
    }

    @Override // androidx.camera.core.impl.g2
    @NonNull
    public com.google.common.util.concurrent.s<T> b() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.camera.core.impl.w1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return a2.a(this.f3340a, aVar);
            }
        });
    }

    @Override // androidx.camera.core.impl.g2
    public void c(@NonNull Executor executor, @NonNull g2.a<? super T> aVar) {
        synchronized (this.f3107b) {
            try {
                final a<T> aVar2 = this.f3107b.get(aVar);
                if (aVar2 != null) {
                    aVar2.b();
                }
                final a<T> aVar3 = new a<>(executor, aVar);
                this.f3107b.put(aVar, aVar3);
                i0.c.e().execute(new Runnable() { // from class: androidx.camera.core.impl.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a2.h(this.f3330a, aVar2, aVar3);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.g2
    public void d(@NonNull g2.a<? super T> aVar) {
        synchronized (this.f3107b) {
            try {
                final a<T> aVarRemove = this.f3107b.remove(aVar);
                if (aVarRemove != null) {
                    aVarRemove.b();
                    i0.c.e().execute(new Runnable() { // from class: androidx.camera.core.impl.x1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3341a.f3106a.removeObserver(aVarRemove);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(T t11) {
        this.f3106a.postValue(b.b(t11));
    }
}
