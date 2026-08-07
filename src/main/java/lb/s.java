package lb;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import sb.WorkGenerationalId;

/* JADX INFO: loaded from: classes3.dex */
public class s implements rb.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f89882l = androidx.work.z.i("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f89884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.c f89885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ub.b f89886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WorkDatabase f89887e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, p1> f89889g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, p1> f89888f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<String> f89891i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<e> f89892j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f89883a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f89893k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Set<x>> f89890h = new HashMap();

    public s(Context context, androidx.work.c cVar, ub.b bVar, WorkDatabase workDatabase) {
        this.f89884b = context;
        this.f89885c = cVar;
        this.f89886d = bVar;
        this.f89887e = workDatabase;
    }

    public static /* synthetic */ sb.m0 b(s sVar, ArrayList arrayList, String str) {
        arrayList.addAll(sVar.f89887e.k().c(str));
        return sVar.f89887e.j().t(str);
    }

    public static /* synthetic */ void c(s sVar, WorkGenerationalId workGenerationalId, boolean z11) {
        synchronized (sVar.f89893k) {
            try {
                Iterator<e> it = sVar.f89892j.iterator();
                while (it.hasNext()) {
                    it.next().d(workGenerationalId, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(s sVar, com.google.common.util.concurrent.s sVar2, p1 p1Var) {
        boolean zBooleanValue;
        sVar.getClass();
        try {
            zBooleanValue = ((Boolean) sVar2.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        sVar.l(p1Var, zBooleanValue);
    }

    private p1 f(String str) {
        p1 p1VarRemove = this.f89888f.remove(str);
        boolean z11 = p1VarRemove != null;
        if (!z11) {
            p1VarRemove = this.f89889g.remove(str);
        }
        this.f89890h.remove(str);
        if (z11) {
            q();
        }
        return p1VarRemove;
    }

    private p1 h(String str) {
        p1 p1Var = this.f89888f.get(str);
        return p1Var == null ? this.f89889g.get(str) : p1Var;
    }

    private static boolean i(String str, p1 p1Var, int i11) {
        if (p1Var == null) {
            androidx.work.z.e().a(f89882l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        p1Var.o(i11);
        androidx.work.z.e().a(f89882l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private void l(p1 p1Var, boolean z11) {
        synchronized (this.f89893k) {
            try {
                WorkGenerationalId workGenerationalIdL = p1Var.l();
                String workSpecId = workGenerationalIdL.getWorkSpecId();
                if (h(workSpecId) == p1Var) {
                    f(workSpecId);
                }
                androidx.work.z.e().a(f89882l, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z11);
                Iterator<e> it = this.f89892j.iterator();
                while (it.hasNext()) {
                    it.next().d(workGenerationalIdL, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n(final WorkGenerationalId workGenerationalId, final boolean z11) {
        this.f89886d.c().execute(new Runnable() { // from class: lb.r
            @Override // java.lang.Runnable
            public final void run() {
                s.c(this.f89876a, workGenerationalId, z11);
            }
        });
    }

    private void q() {
        synchronized (this.f89893k) {
            try {
                if (this.f89888f.isEmpty()) {
                    try {
                        this.f89884b.startService(androidx.work.impl.foreground.a.g(this.f89884b));
                    } catch (Throwable th2) {
                        androidx.work.z.e().d(f89882l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f89883a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f89883a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // rb.a
    public void a(String str, androidx.work.m mVar) {
        synchronized (this.f89893k) {
            try {
                androidx.work.z.e().f(f89882l, "Moving WorkSpec (" + str + ") to the foreground");
                p1 p1VarRemove = this.f89889g.remove(str);
                if (p1VarRemove != null) {
                    if (this.f89883a == null) {
                        PowerManager.WakeLock wakeLockA = tb.h0.a(this.f89884b, "ProcessorForegroundLck");
                        this.f89883a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f89888f.put(str, p1VarRemove);
                    androidx.core.content.b.startForegroundService(this.f89884b, androidx.work.impl.foreground.a.f(this.f89884b, p1VarRemove.l(), mVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(e eVar) {
        synchronized (this.f89893k) {
            this.f89892j.add(eVar);
        }
    }

    public sb.m0 g(String str) {
        synchronized (this.f89893k) {
            try {
                p1 p1VarH = h(str);
                if (p1VarH == null) {
                    return null;
                }
                return p1VarH.getWorkSpec();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f89893k) {
            zContains = this.f89891i.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z11;
        synchronized (this.f89893k) {
            z11 = h(str) != null;
        }
        return z11;
    }

    public void m(e eVar) {
        synchronized (this.f89893k) {
            this.f89892j.remove(eVar);
        }
    }

    public boolean o(x xVar, WorkerParameters.a aVar) throws Throwable {
        Throwable th2;
        WorkGenerationalId id2 = xVar.getId();
        final String workSpecId = id2.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        sb.m0 m0Var = (sb.m0) this.f89887e.runInTransaction(new Callable() { // from class: lb.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.b(this.f89829a, arrayList, workSpecId);
            }
        });
        if (m0Var == null) {
            androidx.work.z.e().k(f89882l, "Didn't find WorkSpec for id " + id2);
            n(id2, false);
            return false;
        }
        synchronized (this.f89893k) {
            try {
                try {
                    try {
                        if (k(workSpecId)) {
                            Set<x> set = this.f89890h.get(workSpecId);
                            if (set.iterator().next().getId().getGeneration() == id2.getGeneration()) {
                                set.add(xVar);
                                androidx.work.z.e().a(f89882l, "Work " + id2 + " is already enqueued for processing");
                            } else {
                                n(id2, false);
                            }
                            return false;
                        }
                        if (m0Var.getGeneration() != id2.getGeneration()) {
                            n(id2, false);
                            return false;
                        }
                        final p1 p1VarA = new p1.a(this.f89884b, this.f89885c, this.f89886d, this, this.f89887e, m0Var, arrayList).k(aVar).a();
                        final com.google.common.util.concurrent.s<Boolean> sVarQ = p1VarA.q();
                        sVarQ.b(new Runnable() { // from class: lb.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                s.d(this.f89871a, sVarQ, p1VarA);
                            }
                        }, this.f89886d.c());
                        this.f89889g.put(workSpecId, p1VarA);
                        HashSet hashSet = new HashSet();
                        hashSet.add(xVar);
                        this.f89890h.put(workSpecId, hashSet);
                        androidx.work.z.e().a(f89882l, getClass().getSimpleName() + ": processing " + id2);
                        return true;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
            }
            throw th2;
        }
    }

    public boolean p(String str, int i11) {
        p1 p1VarF;
        synchronized (this.f89893k) {
            androidx.work.z.e().a(f89882l, "Processor cancelling " + str);
            this.f89891i.add(str);
            p1VarF = f(str);
        }
        return i(str, p1VarF, i11);
    }

    public boolean r(x xVar, int i11) {
        p1 p1VarF;
        String workSpecId = xVar.getId().getWorkSpecId();
        synchronized (this.f89893k) {
            p1VarF = f(workSpecId);
        }
        return i(workSpecId, p1VarF, i11);
    }

    public boolean s(x xVar, int i11) {
        String workSpecId = xVar.getId().getWorkSpecId();
        synchronized (this.f89893k) {
            try {
                if (this.f89888f.get(workSpecId) == null) {
                    Set<x> set = this.f89890h.get(workSpecId);
                    if (set != null && set.contains(xVar)) {
                        return i(workSpecId, f(workSpecId), i11);
                    }
                    return false;
                }
                androidx.work.z.e().a(f89882l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
