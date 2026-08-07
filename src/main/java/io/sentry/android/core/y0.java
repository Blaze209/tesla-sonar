package io.sentry.android.core;

import androidx.annotation.NonNull;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ProcessLifecycleOwner;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class y0 implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static y0 f79815e = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f79817b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.a f79816a = new io.sentry.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c2 f79818c = new c2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Boolean f79819d = null;

    public interface a {
        void c();

        void o();
    }

    public final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<a> f79820a = new a();

        class a extends CopyOnWriteArrayList<a> {
            a() {
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean add(a aVar) {
                boolean zAdd = super.add(aVar);
                if (Boolean.FALSE.equals(y0.this.f79819d)) {
                    aVar.c();
                    return zAdd;
                }
                if (Boolean.TRUE.equals(y0.this.f79819d)) {
                    aVar.o();
                }
                return zAdd;
            }
        }

        public b() {
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
            y0.this.b0(false);
            Iterator<a> it = this.f79820a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
            y0.this.b0(true);
            Iterator<a> it = this.f79820a.iterator();
            while (it.hasNext()) {
                it.next().o();
            }
        }
    }

    private y0() {
    }

    private void B(final ILogger iLogger) {
        if (this.f79817b != null) {
            return;
        }
        try {
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
            this.f79817b = new b();
            if (io.sentry.android.core.internal.util.j.e().a()) {
                t(iLogger);
            } else {
                this.f79818c.b(new Runnable() { // from class: io.sentry.android.core.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f79804a.t(iLogger);
                    }
                });
            }
        } catch (ClassNotFoundException unused) {
            iLogger.c(b7.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "AppState could not register lifecycle observer", th2);
        }
    }

    public static y0 C() {
        return f79815e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(b bVar) {
        if (bVar != null) {
            ProcessLifecycleOwner.l().getLifecycle().d(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(ILogger iLogger) {
        b bVar = this.f79817b;
        if (bVar != null) {
            try {
                ProcessLifecycleOwner.l().getLifecycle().a(bVar);
            } catch (Throwable th2) {
                this.f79817b = null;
                iLogger.a(b7.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th2);
            }
        }
    }

    public Boolean H() {
        return this.f79819d;
    }

    public void I(q7 q7Var) {
        if (this.f79817b != null) {
            return;
        }
        io.sentry.d1 d1VarA = this.f79816a.a();
        try {
            B(q7Var != null ? q7Var.getLogger() : io.sentry.m2.e());
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void J(a aVar) {
        io.sentry.d1 d1VarA = this.f79816a.a();
        try {
            if (this.f79817b != null) {
                this.f79817b.f79820a.remove(aVar);
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    void b0(boolean z11) {
        this.f79819d = Boolean.valueOf(z11);
    }

    public void c0() {
        if (this.f79817b == null) {
            return;
        }
        io.sentry.d1 d1VarA = this.f79816a.a();
        try {
            final b bVar = this.f79817b;
            this.f79817b.f79820a.clear();
            this.f79817b = null;
            if (d1VarA != null) {
                d1VarA.close();
            }
            if (io.sentry.android.core.internal.util.j.e().a()) {
                T(bVar);
            } else {
                this.f79818c.b(new Runnable() { // from class: io.sentry.android.core.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f79811a.T(bVar);
                    }
                });
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c0();
    }

    public void p(a aVar) {
        io.sentry.d1 d1VarA = this.f79816a.a();
        try {
            B(io.sentry.m2.e());
            if (this.f79817b != null) {
                this.f79817b.f79820a.add(aVar);
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
