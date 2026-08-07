package com.google.common.util.concurrent;

import com.adyen.checkout.components.core.Address;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<V> extends com.google.common.util.concurrent.b<V> {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    private static final class C0688a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final C0688a f43781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final C0688a f43782d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f43783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f43784b;

        static {
            if (com.google.common.util.concurrent.b.f43795f) {
                f43782d = null;
                f43781c = null;
            } else {
                f43782d = new C0688a(false, null);
                f43781c = new C0688a(true, null);
            }
        }

        C0688a(boolean z11, Throwable th2) {
            this.f43783a = z11;
            this.f43784b = th2;
        }
    }

    private static final class b<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f43785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final s<? extends V> f43786b;

        b(a<V> aVar, s<? extends V> sVar) {
            this.f43785a = aVar;
            this.f43786b = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f43785a.t() != this) {
                return;
            }
            if (com.google.common.util.concurrent.b.j(this.f43785a, this, a.G(this.f43786b))) {
                a.D(this.f43785a, false);
            }
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final c f43787b = new c(new C0689a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f43788a;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a$c$a, reason: collision with other inner class name */
        class C0689a extends Throwable {
            C0689a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public Throwable fillInStackTrace() {
                return this;
            }
        }

        c(Throwable th2) {
            this.f43788a = (Throwable) ou.p.m(th2);
        }
    }

    interface e<V> extends s<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abstract class f<V> extends a<V> implements e<V> {
        f() {
        }

        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.s
        public void b(Runnable runnable, Executor executor) {
            super.b(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            return super.cancel(z11);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public V get() {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get(long j11, TimeUnit timeUnit) {
            return (V) super.get(j11, timeUnit);
        }
    }

    protected a() {
    }

    private void A(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Throwable th2) {
            z.e(th2);
            sb2.append("Exception thrown from implementation: ");
            sb2.append(th2.getClass());
        }
    }

    private static CancellationException B(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private d C(d dVar) {
        d dVar2 = dVar;
        d dVarL = l(d.f43789d);
        while (dVarL != null) {
            d dVar3 = dVarL.f43792c;
            dVarL.f43792c = dVar2;
            dVar2 = dVarL;
            dVarL = dVar3;
        }
        return dVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(a<?> aVar, boolean z11) {
        d dVar = null;
        while (true) {
            aVar.r();
            if (z11) {
                aVar.I();
                z11 = false;
            }
            aVar.y();
            d dVarC = aVar.C(dVar);
            while (dVarC != null) {
                dVar = dVarC.f43792c;
                Runnable runnable = dVarC.f43790a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof b) {
                    b bVar = (b) runnable2;
                    aVar = bVar.f43785a;
                    if (aVar.t() != bVar || !com.google.common.util.concurrent.b.j(aVar, bVar, G(bVar.f43786b))) {
                    }
                } else {
                    Executor executor = dVarC.f43791b;
                    Objects.requireNonNull(executor);
                    E(runnable2, executor);
                }
                dVarC = dVar;
            }
            return;
        }
    }

    private static void E(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e11) {
            com.google.common.util.concurrent.b.f43794e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <V> V F(Object obj) throws ExecutionException {
        if (obj instanceof C0688a) {
            throw B("Task was cancelled.", ((C0688a) obj).f43784b);
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f43788a);
        }
        return obj == com.google.common.util.concurrent.b.f43793d ? (V) x.b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object G(s<?> sVar) {
        Throwable thA;
        if (sVar instanceof e) {
            Object objT = ((a) sVar).t();
            if (objT instanceof C0688a) {
                C0688a c0688a = (C0688a) objT;
                if (c0688a.f43783a) {
                    objT = c0688a.f43784b != null ? new C0688a(false, c0688a.f43784b) : C0688a.f43782d;
                }
            }
            Objects.requireNonNull(objT);
            return objT;
        }
        if ((sVar instanceof su.a) && (thA = su.b.a((su.a) sVar)) != null) {
            return new c(thA);
        }
        boolean zIsCancelled = sVar.isCancelled();
        if ((!com.google.common.util.concurrent.b.f43795f) && zIsCancelled) {
            C0688a c0688a2 = C0688a.f43782d;
            Objects.requireNonNull(c0688a2);
            return c0688a2;
        }
        try {
            Object objH = H(sVar);
            if (!zIsCancelled) {
                return objH == null ? com.google.common.util.concurrent.b.f43793d : objH;
            }
            return new C0688a(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + sVar));
        } catch (Error | Exception e11) {
            return new c(e11);
        } catch (CancellationException e12) {
            if (zIsCancelled) {
                return new C0688a(false, e12);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + sVar, e12));
        } catch (ExecutionException e13) {
            if (!zIsCancelled) {
                return new c(e13.getCause());
            }
            return new C0688a(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + sVar, e13));
        }
    }

    private static <V> V H(Future<V> future) {
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
                    z.c();
                }
                throw th2;
            }
        }
        if (z11) {
            z.c();
        }
        return v11;
    }

    static boolean K(Object obj) {
        return !(obj instanceof b);
    }

    private void w(StringBuilder sb2) {
        try {
            Object objH = H(this);
            sb2.append("SUCCESS, result=[");
            z(sb2, objH);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        } catch (Exception e12) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e12.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private void x(StringBuilder sb2) {
        String strA;
        int length = sb2.length();
        sb2.append("PENDING");
        Object objT = t();
        if (objT instanceof b) {
            sb2.append(", setFuture=[");
            A(sb2, ((b) objT).f43786b);
            sb2.append("]");
        } else {
            try {
                strA = ou.w.a(L());
            } catch (Throwable th2) {
                z.e(th2);
                strA = "Exception thrown from implementation: " + th2.getClass();
            }
            if (strA != null) {
                sb2.append(", info=[");
                sb2.append(strA);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            w(sb2);
        }
    }

    private void z(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    protected void I() {
    }

    final void J(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(P());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String L() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean M(V v11) {
        if (v11 == null) {
            v11 = (V) com.google.common.util.concurrent.b.f43793d;
        }
        if (!com.google.common.util.concurrent.b.j(this, null, v11)) {
            return false;
        }
        D(this, false);
        return true;
    }

    protected boolean N(Throwable th2) {
        if (!com.google.common.util.concurrent.b.j(this, null, new c((Throwable) ou.p.m(th2)))) {
            return false;
        }
        D(this, false);
        return true;
    }

    protected boolean O(s<? extends V> sVar) {
        c cVar;
        ou.p.m(sVar);
        Object objT = t();
        if (objT == null) {
            if (sVar.isDone()) {
                if (!com.google.common.util.concurrent.b.j(this, null, G(sVar))) {
                    return false;
                }
                D(this, false);
                return true;
            }
            b bVar = new b(this, sVar);
            if (com.google.common.util.concurrent.b.j(this, null, bVar)) {
                try {
                    sVar.b(bVar, g.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        cVar = new c(th2);
                    } catch (Error | Exception unused) {
                        cVar = c.f43787b;
                    }
                    com.google.common.util.concurrent.b.j(this, bVar, cVar);
                }
                return true;
            }
            objT = t();
        }
        if (objT instanceof C0688a) {
            sVar.cancel(((C0688a) objT).f43783a);
        }
        return false;
    }

    protected final boolean P() {
        Object objT = t();
        return (objT instanceof C0688a) && ((C0688a) objT).f43783a;
    }

    @Override // com.google.common.util.concurrent.s
    public void b(Runnable runnable, Executor executor) {
        d dVarN;
        ou.p.n(runnable, "Runnable was null.");
        ou.p.n(executor, "Executor was null.");
        if (!isDone() && (dVarN = n()) != d.f43789d) {
            d dVar = new d(runnable, executor);
            do {
                dVar.f43792c = dVarN;
                if (i(dVarN, dVar)) {
                    return;
                } else {
                    dVarN = n();
                }
            } while (dVarN != d.f43789d);
        }
        E(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        C0688a c0688a;
        Object objT = t();
        if (!(objT == null) && !(objT instanceof b)) {
            return false;
        }
        if (com.google.common.util.concurrent.b.f43795f) {
            c0688a = new C0688a(z11, new CancellationException("Future.cancel() was called."));
        } else {
            c0688a = z11 ? C0688a.f43781c : C0688a.f43782d;
            Objects.requireNonNull(c0688a);
        }
        a<V> aVar = this;
        boolean z12 = false;
        while (true) {
            if (com.google.common.util.concurrent.b.j(aVar, objT, c0688a)) {
                D(aVar, z11);
                if (objT instanceof b) {
                    s<? extends V> sVar = ((b) objT).f43786b;
                    if (sVar instanceof e) {
                        aVar = (a) sVar;
                        objT = aVar.t();
                        if ((objT == null) | (objT instanceof b)) {
                            z12 = true;
                        }
                    } else {
                        sVar.cancel(z11);
                    }
                }
                return true;
            }
            objT = aVar.t();
            if (K(objT)) {
                return z12;
            }
        }
    }

    @Override // su.a
    protected final Throwable d() {
        if (!(this instanceof e)) {
            return null;
        }
        Object objT = t();
        if (objT instanceof c) {
            return ((c) objT).f43788a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, TimeUnit timeUnit) {
        return (V) z.b(this, j11, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return t() instanceof C0688a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object objT = t();
        return K(objT) & (objT != null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            w(sb2);
        } else {
            x(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void y() {
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return (V) z.a(this);
    }

    static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final d f43789d = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f43790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f43791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        d f43792c;

        d(Runnable runnable, Executor executor) {
            this.f43790a = runnable;
            this.f43791b = executor;
        }

        d() {
            this.f43790a = null;
            this.f43791b = null;
        }
    }
}
