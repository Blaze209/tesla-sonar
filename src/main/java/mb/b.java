package mb;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.m0;
import androidx.work.r0;
import androidx.work.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import lb.a1;
import lb.e;
import lb.s;
import lb.u;
import lb.x;
import lb.y;
import ob.i;
import ob.m;
import qb.n;
import sb.WorkGenerationalId;
import sb.v1;

/* JADX INFO: loaded from: classes3.dex */
public class b implements u, i, e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f91710o = z.i("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f91711a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mb.a f91713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f91714d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s f91717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a1 f91718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.work.c f91719i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Boolean f91721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m f91722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ub.b f91723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f91724n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<WorkGenerationalId, Job> f91712b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f91715e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f91716f = y.create();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<WorkGenerationalId, C1958b> f91720j = new HashMap();

    /* JADX INFO: renamed from: mb.b$b, reason: collision with other inner class name */
    private static class C1958b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f91725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f91726b;

        private C1958b(int i11, long j11) {
            this.f91725a = i11;
            this.f91726b = j11;
        }
    }

    public b(Context context, androidx.work.c cVar, n nVar, s sVar, a1 a1Var, ub.b bVar) {
        this.f91711a = context;
        m0 runnableScheduler = cVar.getRunnableScheduler();
        this.f91713c = new mb.a(this, runnableScheduler, cVar.getClock());
        this.f91724n = new d(runnableScheduler, a1Var);
        this.f91723m = bVar;
        this.f91722l = new m(nVar);
        this.f91719i = cVar;
        this.f91717g = sVar;
        this.f91718h = a1Var;
    }

    private void f() {
        this.f91721k = Boolean.valueOf(tb.y.b(this.f91711a, this.f91719i));
    }

    private void g() {
        if (this.f91714d) {
            return;
        }
        this.f91717g.e(this);
        this.f91714d = true;
    }

    private void h(WorkGenerationalId workGenerationalId) {
        Job jobRemove;
        synchronized (this.f91715e) {
            jobRemove = this.f91712b.remove(workGenerationalId);
        }
        if (jobRemove != null) {
            z.e().a(f91710o, "Stopping tracking for " + workGenerationalId);
            jobRemove.cancel((CancellationException) null);
        }
    }

    private long i(sb.m0 m0Var) {
        long jMax;
        synchronized (this.f91715e) {
            try {
                WorkGenerationalId workGenerationalIdA = v1.a(m0Var);
                C1958b c1958b = this.f91720j.get(workGenerationalIdA);
                if (c1958b == null) {
                    c1958b = new C1958b(m0Var.runAttemptCount, this.f91719i.getClock().currentTimeMillis());
                    this.f91720j.put(workGenerationalIdA, c1958b);
                }
                jMax = c1958b.f91726b + (((long) Math.max((m0Var.runAttemptCount - c1958b.f91725a) - 5, 0)) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }

    @Override // ob.i
    public void a(sb.m0 m0Var, ob.b bVar) {
        WorkGenerationalId workGenerationalIdA = v1.a(m0Var);
        if (bVar instanceof ob.b.a) {
            if (this.f91716f.e(workGenerationalIdA)) {
                return;
            }
            z.e().a(f91710o, "Constraints met: Scheduling work ID " + workGenerationalIdA);
            x xVarB = this.f91716f.b(workGenerationalIdA);
            this.f91724n.c(xVarB);
            this.f91718h.b(xVarB);
            return;
        }
        z.e().a(f91710o, "Constraints not met: Cancelling work ID " + workGenerationalIdA);
        x xVarA = this.f91716f.a(workGenerationalIdA);
        if (xVarA != null) {
            this.f91724n.b(xVarA);
            this.f91718h.a(xVarA, ((ob.b.ConstraintsNotMet) bVar).getReason());
        }
    }

    @Override // lb.u
    public boolean b() {
        return false;
    }

    @Override // lb.u
    public void c(sb.m0... m0VarArr) {
        if (this.f91721k == null) {
            f();
        }
        if (!this.f91721k.booleanValue()) {
            z.e().f(f91710o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<sb.m0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (sb.m0 m0Var : m0VarArr) {
            if (!this.f91716f.e(v1.a(m0Var))) {
                long jMax = Math.max(m0Var.c(), i(m0Var));
                long jCurrentTimeMillis = this.f91719i.getClock().currentTimeMillis();
                if (m0Var.state == r0.c.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax) {
                        mb.a aVar = this.f91713c;
                        if (aVar != null) {
                            aVar.a(m0Var, jMax);
                        }
                    } else if (m0Var.m()) {
                        androidx.work.e eVar = m0Var.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String;
                        if (eVar.getRequiresDeviceIdle()) {
                            z.e().a(f91710o, "Ignoring " + m0Var + ". Requires device idle.");
                        } else if (eVar.g()) {
                            z.e().a(f91710o, "Ignoring " + m0Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(m0Var);
                            hashSet2.add(m0Var.id);
                        }
                    } else if (!this.f91716f.e(v1.a(m0Var))) {
                        z.e().a(f91710o, "Starting work for " + m0Var.id);
                        x xVarC = this.f91716f.c(m0Var);
                        this.f91724n.c(xVarC);
                        this.f91718h.b(xVarC);
                    }
                }
            }
        }
        synchronized (this.f91715e) {
            try {
                if (!hashSet.isEmpty()) {
                    z.e().a(f91710o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (sb.m0 m0Var2 : hashSet) {
                        WorkGenerationalId workGenerationalIdA = v1.a(m0Var2);
                        if (!this.f91712b.containsKey(workGenerationalIdA)) {
                            this.f91712b.put(workGenerationalIdA, ob.n.c(this.f91722l, m0Var2, this.f91723m.a(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lb.e
    public void d(WorkGenerationalId workGenerationalId, boolean z11) {
        x xVarA = this.f91716f.a(workGenerationalId);
        if (xVarA != null) {
            this.f91724n.b(xVarA);
        }
        h(workGenerationalId);
        if (z11) {
            return;
        }
        synchronized (this.f91715e) {
            this.f91720j.remove(workGenerationalId);
        }
    }

    @Override // lb.u
    public void e(String str) {
        if (this.f91721k == null) {
            f();
        }
        if (!this.f91721k.booleanValue()) {
            z.e().f(f91710o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        z.e().a(f91710o, "Cancelling work ID " + str);
        mb.a aVar = this.f91713c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (x xVar : this.f91716f.remove(str)) {
            this.f91724n.b(xVar);
            this.f91718h.e(xVar);
        }
    }
}
