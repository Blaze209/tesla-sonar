package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f80776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q7 f80777g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.a f80771a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Timer f80772b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, c> f80773c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f80778h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f80779i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<v0> f80774d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<u0> f80775e = new ArrayList();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = n.this.f80774d.iterator();
            while (it.hasNext()) {
                ((v0) it.next()).c();
            }
        }
    }

    class b extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f80781a;

        b(List list) {
            this.f80781a = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - n.this.f80779i <= 10) {
                return;
            }
            this.f80781a.clear();
            n.this.f80779i = jCurrentTimeMillis;
            o3 o3Var = new o3(n.this.f80777g.getDateProvider().now().f());
            Iterator it = n.this.f80774d.iterator();
            while (it.hasNext()) {
                ((v0) it.next()).d(o3Var);
            }
            for (c cVar : n.this.f80773c.values()) {
                if (cVar.c(o3Var) && cVar.f80784b != null) {
                    this.f80781a.add(cVar.f80784b);
                }
            }
            Iterator it2 = this.f80781a.iterator();
            while (it2.hasNext()) {
                n.this.c((i1) it2.next());
            }
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<o3> f80783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i1 f80784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f80785c;

        /* synthetic */ c(n nVar, i1 i1Var, a aVar) {
            this(i1Var);
        }

        boolean c(o3 o3Var) {
            this.f80783a.add(o3Var);
            return this.f80784b != null && n.this.f80777g.getDateProvider().now().f() > this.f80785c + TimeUnit.MILLISECONDS.toNanos(30000L);
        }

        private c(i1 i1Var) {
            this.f80783a = new ArrayList();
            this.f80784b = i1Var;
            this.f80785c = n.this.f80777g.getDateProvider().now().f();
        }
    }

    public n(q7 q7Var) {
        boolean z11 = false;
        this.f80777g = (q7) io.sentry.util.y.c(q7Var, "The options object is required.");
        for (t0 t0Var : q7Var.getPerformanceCollectors()) {
            if (t0Var instanceof v0) {
                this.f80774d.add((v0) t0Var);
            }
            if (t0Var instanceof u0) {
                this.f80775e.add((u0) t0Var);
            }
        }
        if (this.f80774d.isEmpty() && this.f80775e.isEmpty()) {
            z11 = true;
        }
        this.f80776f = z11;
    }

    @Override // io.sentry.i
    public void a(g1 g1Var) {
        Iterator<u0> it = this.f80775e.iterator();
        while (it.hasNext()) {
            it.next().a(g1Var);
        }
    }

    @Override // io.sentry.i
    public void b(g1 g1Var) {
        Iterator<u0> it = this.f80775e.iterator();
        while (it.hasNext()) {
            it.next().b(g1Var);
        }
    }

    @Override // io.sentry.i
    public List<o3> c(i1 i1Var) {
        this.f80777g.getLogger().c(b7.DEBUG, "stop collecting performance info for transactions %s (%s)", i1Var.getName(), i1Var.e().p().toString());
        Iterator<u0> it = this.f80775e.iterator();
        while (it.hasNext()) {
            it.next().a(i1Var);
        }
        return e(i1Var.i().toString());
    }

    @Override // io.sentry.i
    public void close() {
        this.f80777g.getLogger().c(b7.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f80773c.clear();
        Iterator<u0> it = this.f80775e.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        if (this.f80778h.getAndSet(false)) {
            d1 d1VarA = this.f80771a.a();
            try {
                if (this.f80772b != null) {
                    this.f80772b.cancel();
                    this.f80772b = null;
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

    @Override // io.sentry.i
    public void d(i1 i1Var) {
        if (this.f80776f) {
            this.f80777g.getLogger().c(b7.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator<u0> it = this.f80775e.iterator();
        while (it.hasNext()) {
            it.next().b(i1Var);
        }
        String string = i1Var.i().toString();
        if (!this.f80773c.containsKey(string)) {
            this.f80773c.put(string, new c(this, i1Var, null));
        }
        f(string);
    }

    @Override // io.sentry.i
    public List<o3> e(String str) {
        c cVarRemove = this.f80773c.remove(str);
        this.f80777g.getLogger().c(b7.DEBUG, "stop collecting performance info for " + str, new Object[0]);
        if (this.f80773c.isEmpty()) {
            close();
        }
        if (cVarRemove != null) {
            return cVarRemove.f80783a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.i
    public void f(String str) {
        if (this.f80776f) {
            this.f80777g.getLogger().c(b7.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f80773c.containsKey(str)) {
            this.f80773c.put(str, new c(this, null, 0 == true ? 1 : 0));
        }
        if (this.f80778h.getAndSet(true)) {
            return;
        }
        d1 d1VarA = this.f80771a.a();
        try {
            if (this.f80772b == null) {
                this.f80772b = new Timer(true);
            }
            this.f80772b.schedule(new a(), 0L);
            this.f80772b.scheduleAtFixedRate(new b(new ArrayList()), 100L, 100L);
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA == null) {
                throw th2;
            }
            try {
                d1VarA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
