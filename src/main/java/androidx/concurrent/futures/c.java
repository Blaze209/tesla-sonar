package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.s;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d<T> f6451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f<Void> f6452c = f.t();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6453d;

        a() {
        }

        private void e() {
            this.f6450a = null;
            this.f6451b = null;
            this.f6452c = null;
        }

        public void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            f<Void> fVar = this.f6452c;
            if (fVar != null) {
                fVar.b(runnable, executor);
            }
        }

        void b() {
            this.f6450a = null;
            this.f6451b = null;
            this.f6452c.p(null);
        }

        public boolean c(T t11) {
            this.f6453d = true;
            d<T> dVar = this.f6451b;
            boolean z11 = dVar != null && dVar.c(t11);
            if (z11) {
                e();
            }
            return z11;
        }

        public boolean d() {
            this.f6453d = true;
            d<T> dVar = this.f6451b;
            boolean z11 = dVar != null && dVar.a(true);
            if (z11) {
                e();
            }
            return z11;
        }

        public boolean f(@NonNull Throwable th2) {
            this.f6453d = true;
            d<T> dVar = this.f6451b;
            boolean z11 = dVar != null && dVar.d(th2);
            if (z11) {
                e();
            }
            return z11;
        }

        protected void finalize() {
            f<Void> fVar;
            d<T> dVar = this.f6451b;
            if (dVar != null && !dVar.isDone()) {
                dVar.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f6450a));
            }
            if (this.f6453d || (fVar = this.f6452c) == null) {
                return;
            }
            fVar.p(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0146c<T> {
        Object a(@NonNull a<T> aVar);
    }

    private static final class d<T> implements s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference<a<T>> f6454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f6455b = new a();

        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String m() {
                a<T> aVar = d.this.f6454a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f6450a + "]";
            }
        }

        d(a<T> aVar) {
            this.f6454a = new WeakReference<>(aVar);
        }

        boolean a(boolean z11) {
            return this.f6455b.cancel(z11);
        }

        @Override // com.google.common.util.concurrent.s
        public void b(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.f6455b.b(runnable, executor);
        }

        boolean c(T t11) {
            return this.f6455b.p(t11);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            a<T> aVar = this.f6454a.get();
            boolean zCancel = this.f6455b.cancel(z11);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        boolean d(Throwable th2) {
            return this.f6455b.q(th2);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f6455b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f6455b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f6455b.isDone();
        }

        public String toString() {
            return this.f6455b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j11, @NonNull TimeUnit timeUnit) {
            return this.f6455b.get(j11, timeUnit);
        }
    }

    @NonNull
    public static <T> s<T> a(@NonNull InterfaceC0146c<T> interfaceC0146c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f6451b = dVar;
        aVar.f6450a = interfaceC0146c.getClass();
        try {
            Object objA = interfaceC0146c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f6450a = objA;
            return dVar;
        } catch (Exception e11) {
            dVar.d(e11);
            return dVar;
        }
    }
}
