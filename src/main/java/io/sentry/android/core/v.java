package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.f5;
import io.sentry.i7;
import io.sentry.n5;
import io.sentry.q3;
import io.sentry.q7;
import io.sentry.s3;
import io.sentry.x8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class v implements io.sentry.n0, io.sentry.transport.a0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ILogger f79766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f79767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f79768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.c1 f79769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z0 f79770e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.c0 f79772g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private io.sentry.z0 f79775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Future<?> f79776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private io.sentry.i f79777l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.sentry.protocol.x f79779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private io.sentry.protocol.x f79780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f79781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private n5 f79782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile boolean f79783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f79784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f79785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f79786u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final io.sentry.util.a f79787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final io.sentry.util.a f79788w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f79771f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k0 f79773h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f79774i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<q3.a> f79778m = new ArrayList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79789a;

        static {
            int[] iArr = new int[s3.values().length];
            f79789a = iArr;
            try {
                iArr[s3.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79789a[s3.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public v(z0 z0Var, io.sentry.android.core.internal.util.c0 c0Var, ILogger iLogger, String str, int i11, io.sentry.c1 c1Var) {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
        this.f79779n = xVar;
        this.f79780o = xVar;
        this.f79781p = new AtomicBoolean(false);
        this.f79782q = new i7();
        this.f79783r = true;
        this.f79784s = false;
        this.f79785t = false;
        this.f79786u = 0;
        this.f79787v = new io.sentry.util.a();
        this.f79788w = new io.sentry.util.a();
        this.f79766a = iLogger;
        this.f79772g = c0Var;
        this.f79770e = z0Var;
        this.f79767b = str;
        this.f79768c = i11;
        this.f79769d = c1Var;
    }

    public static /* synthetic */ void h(v vVar, q7 q7Var, io.sentry.z0 z0Var) {
        if (vVar.f79781p.get()) {
            return;
        }
        ArrayList arrayList = new ArrayList(vVar.f79778m.size());
        io.sentry.d1 d1VarA = vVar.f79788w.a();
        try {
            Iterator<q3.a> it = vVar.f79778m.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(q7Var));
            }
            vVar.f79778m.clear();
            if (d1VarA != null) {
                d1VarA.close();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                z0Var.C((q3) it2.next());
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

    private void i() {
        if (this.f79771f) {
            return;
        }
        this.f79771f = true;
        String str = this.f79767b;
        if (str == null) {
            this.f79766a.c(b7.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i11 = this.f79768c;
        if (i11 <= 0) {
            this.f79766a.c(b7.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i11));
        } else {
            this.f79773h = new k0(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f79768c, this.f79772g, null, this.f79766a);
        }
    }

    private void j() {
        io.sentry.z0 z0Var = this.f79775j;
        if ((z0Var == null || z0Var == io.sentry.t2.i()) && f5.r() != io.sentry.t2.i()) {
            this.f79775j = f5.r();
            this.f79777l = f5.r().getOptions().getCompositePerformanceCollector();
            io.sentry.transport.a0 a0VarQ = this.f79775j.q();
            if (a0VarQ != null) {
                a0VarQ.t(this);
            }
        }
    }

    private void k(final io.sentry.z0 z0Var, final q7 q7Var) {
        try {
            q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.u
                @Override // java.lang.Runnable
                public final void run() {
                    v.h(this.f79752a, q7Var, z0Var);
                }
            });
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.DEBUG, "Failed to send profile chunks.", th2);
        }
    }

    private void l() {
        j();
        if (this.f79770e.d() < 22) {
            return;
        }
        i();
        if (this.f79773h == null) {
            return;
        }
        io.sentry.z0 z0Var = this.f79775j;
        if (z0Var != null) {
            io.sentry.transport.a0 a0VarQ = z0Var.q();
            if (a0VarQ != null && (a0VarQ.I(io.sentry.k.All) || a0VarQ.I(io.sentry.k.ProfileChunkUi))) {
                this.f79766a.c(b7.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                m(false);
                return;
            } else {
                if (this.f79775j.getOptions().getConnectionStatusProvider().q0() == io.sentry.m0.a.DISCONNECTED) {
                    this.f79766a.c(b7.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    m(false);
                    return;
                }
                this.f79782q = this.f79775j.getOptions().getDateProvider().now();
            }
        } else {
            this.f79782q = new i7();
        }
        if (this.f79773h.j() == null) {
            return;
        }
        this.f79774i = true;
        io.sentry.protocol.x xVar = this.f79779n;
        io.sentry.protocol.x xVar2 = io.sentry.protocol.x.f81078b;
        if (xVar.equals(xVar2)) {
            this.f79779n = new io.sentry.protocol.x();
        }
        if (this.f79780o.equals(xVar2)) {
            this.f79780o = new io.sentry.protocol.x();
        }
        io.sentry.i iVar = this.f79777l;
        if (iVar != null) {
            iVar.f(this.f79780o.toString());
        }
        try {
            this.f79776k = this.f79769d.b(new Runnable() { // from class: io.sentry.android.core.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79740a.m(true);
                }
            }, 60000L);
        } catch (RejectedExecutionException e11) {
            this.f79766a.a(b7.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e11);
            this.f79784s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(boolean z11) {
        j();
        io.sentry.d1 d1VarA = this.f79787v.a();
        try {
            Future<?> future = this.f79776k;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f79773h != null && this.f79774i) {
                if (this.f79770e.d() < 22) {
                    if (d1VarA != null) {
                        d1VarA.close();
                        return;
                    }
                    return;
                }
                io.sentry.i iVar = this.f79777l;
                k0.b bVarG = this.f79773h.g(false, iVar != null ? iVar.e(this.f79780o.toString()) : null);
                if (bVarG == null) {
                    this.f79766a.c(b7.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.d1 d1VarA2 = this.f79788w.a();
                    try {
                        this.f79778m.add(new q3.a(this.f79779n, this.f79780o, bVarG.f79591d, bVarG.f79590c, this.f79782q, "android"));
                        if (d1VarA2 != null) {
                            d1VarA2.close();
                        }
                    } catch (Throwable th2) {
                        if (d1VarA2 == null) {
                            throw th2;
                        }
                        try {
                            d1VarA2.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                this.f79774i = false;
                io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
                this.f79780o = xVar;
                io.sentry.z0 z0Var = this.f79775j;
                if (z0Var != null) {
                    k(z0Var, z0Var.getOptions());
                }
                if (!z11 || this.f79784s) {
                    this.f79779n = xVar;
                    this.f79766a.c(b7.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    this.f79766a.c(b7.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    l();
                }
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
            }
            io.sentry.protocol.x xVar2 = io.sentry.protocol.x.f81078b;
            this.f79779n = xVar2;
            this.f79780o = xVar2;
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th4) {
            if (d1VarA == null) {
                throw th4;
            }
            try {
                d1VarA.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // io.sentry.transport.a0.b
    public void I(io.sentry.transport.a0 a0Var) {
        if (a0Var.I(io.sentry.k.All) || a0Var.I(io.sentry.k.ProfileChunkUi)) {
            this.f79766a.c(b7.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            m(false);
        }
    }

    @Override // io.sentry.n0
    public void a(boolean z11) {
        io.sentry.d1 d1VarA = this.f79787v.a();
        try {
            this.f79786u = 0;
            this.f79784s = true;
            if (z11) {
                m(false);
                this.f79781p.set(true);
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

    @Override // io.sentry.n0
    public void b(s3 s3Var, x8 x8Var) {
        io.sentry.d1 d1VarA = this.f79787v.a();
        try {
            if (this.f79783r) {
                this.f79785t = x8Var.c(io.sentry.util.d0.a().c());
                this.f79783r = false;
            }
            if (!this.f79785t) {
                this.f79766a.c(b7.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
            }
            int i11 = a.f79789a[s3Var.ordinal()];
            if (i11 == 1) {
                if (this.f79786u < 0) {
                    this.f79786u = 0;
                }
                this.f79786u++;
            } else if (i11 == 2 && isRunning()) {
                this.f79766a.c(b7.DEBUG, "Profiler is already running.", new Object[0]);
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
            }
            if (!isRunning()) {
                this.f79766a.c(b7.DEBUG, "Started Profiler.", new Object[0]);
                l();
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

    @Override // io.sentry.n0
    public void c() {
        this.f79783r = true;
    }

    @Override // io.sentry.n0
    public io.sentry.protocol.x d() {
        return this.f79780o;
    }

    @Override // io.sentry.n0
    public io.sentry.protocol.x e() {
        return this.f79779n;
    }

    @Override // io.sentry.n0
    public void f(s3 s3Var) {
        io.sentry.d1 d1VarA = this.f79787v.a();
        try {
            int i11 = a.f79789a[s3Var.ordinal()];
            if (i11 == 1) {
                int i12 = this.f79786u - 1;
                this.f79786u = i12;
                if (i12 > 0) {
                    if (d1VarA != null) {
                        d1VarA.close();
                        return;
                    }
                    return;
                } else {
                    if (i12 < 0) {
                        this.f79786u = 0;
                    }
                    this.f79784s = true;
                }
            } else if (i11 == 2) {
                this.f79784s = true;
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

    @Override // io.sentry.n0
    public boolean isRunning() {
        return this.f79774i;
    }
}
