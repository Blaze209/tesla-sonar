package lb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.CoroutineScope;
import sb.WorkGenerationalId;

/* JADX INFO: loaded from: classes3.dex */
public class e1 extends androidx.work.s0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f89776n = androidx.work.z.i("WorkManagerImpl");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static e1 f89777o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static e1 f89778p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f89779q = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f89780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.c f89781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WorkDatabase f89782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ub.b f89783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<u> f89784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f89785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private tb.x f89786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f89787i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f89788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile wb.f f89789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final qb.n f89790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CoroutineScope f89791m;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public e1(Context context, androidx.work.c cVar, ub.b bVar, WorkDatabase workDatabase, List<u> list, s sVar, qb.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        androidx.work.z.h(new androidx.work.z.a(cVar.getMinimumLoggingLevel()));
        this.f89780b = applicationContext;
        this.f89783e = bVar;
        this.f89782d = workDatabase;
        this.f89785g = sVar;
        this.f89790l = nVar;
        this.f89781c = cVar;
        this.f89784f = list;
        CoroutineScope coroutineScopeF = androidx.work.impl.b.f(bVar);
        this.f89791m = coroutineScopeF;
        this.f89786h = new tb.x(this.f89782d);
        androidx.work.impl.a.e(list, this.f89785g, bVar.d(), this.f89782d, cVar);
        this.f89783e.b(new ForceStopRunnable(applicationContext, this));
        c0.c(coroutineScopeF, this.f89780b, cVar, workDatabase);
    }

    private void F() {
        try {
            r.a<byte[], Void> aVar = RemoteWorkManagerClient.f14665k;
            this.f89789k = (wb.f) RemoteWorkManagerClient.class.getConstructor(Context.class, e1.class).newInstance(this.f89780b, this);
        } catch (Throwable th2) {
            androidx.work.z.e().b(f89776n, "Unable to initialize multi-process support", th2);
        }
    }

    public static void g(Context context, androidx.work.c cVar) {
        synchronized (f89779q) {
            try {
                e1 e1Var = f89777o;
                if (e1Var != null && f89778p != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (e1Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f89778p == null) {
                        f89778p = androidx.work.impl.b.c(applicationContext, cVar);
                    }
                    f89777o = f89778p;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean h() {
        return r() != null;
    }

    public static /* synthetic */ jn0.h0 i(e1 e1Var) {
        nb.f.a(e1Var.p());
        e1Var.y().j().u();
        androidx.work.impl.a.f(e1Var.q(), e1Var.y(), e1Var.w());
        return jn0.h0.f84049a;
    }

    @Deprecated
    public static e1 r() {
        synchronized (f89779q) {
            try {
                e1 e1Var = f89777o;
                if (e1Var != null) {
                    return e1Var;
                }
                return f89778p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e1 s(Context context) {
        e1 e1VarR;
        synchronized (f89779q) {
            try {
                e1VarR = r();
                if (e1VarR == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof androidx.work.c.InterfaceC0245c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    g(applicationContext, ((androidx.work.c.InterfaceC0245c) applicationContext).g());
                    e1VarR = s(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e1VarR;
    }

    public ub.b A() {
        return this.f89783e;
    }

    public void B() {
        synchronized (f89779q) {
            try {
                this.f89787i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f89788j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f89788j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C() {
        androidx.work.p0.a(q().getTracer(), "ReschedulingWork", new wn0.a() { // from class: lb.d1
            @Override // wn0.a
            public final Object invoke() {
                return e1.i(this.f89765a);
            }
        });
    }

    public void D(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f89779q) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f89788j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f89788j = pendingResult;
                if (this.f89787i) {
                    pendingResult.finish();
                    this.f89788j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(WorkGenerationalId workGenerationalId, int i11) {
        this.f89783e.b(new tb.f0(this.f89785g, new x(workGenerationalId), true, i11));
    }

    @Override // androidx.work.s0
    public androidx.work.d0 b(List<? extends androidx.work.u0> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new e0(this, list).b();
    }

    @Override // androidx.work.s0
    public androidx.work.d0 d(String str, androidx.work.l lVar, List<androidx.work.c0> list) {
        return new e0(this, str, lVar, list).b();
    }

    @Override // androidx.work.s0
    public com.google.common.util.concurrent.s<List<androidx.work.r0>> f(String str) {
        return tb.e0.d(this.f89782d, this.f89783e, str);
    }

    public androidx.work.q0 j(String str, androidx.work.l lVar, List<androidx.work.c0> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new e0(this, str, lVar, list);
    }

    public androidx.work.d0 k() {
        return tb.j.j(this);
    }

    public androidx.work.d0 l(String str) {
        return tb.j.t(str, this);
    }

    public androidx.work.d0 m(String str) {
        return tb.j.p(str, this);
    }

    public androidx.work.d0 n(UUID uuid) {
        return tb.j.m(uuid, this);
    }

    public e0 o(String str, androidx.work.k kVar, androidx.work.j0 j0Var) {
        return new e0(this, str, kVar == androidx.work.k.KEEP ? androidx.work.l.KEEP : androidx.work.l.REPLACE, Collections.singletonList(j0Var));
    }

    public Context p() {
        return this.f89780b;
    }

    public androidx.work.c q() {
        return this.f89781c;
    }

    public tb.x t() {
        return this.f89786h;
    }

    public s u() {
        return this.f89785g;
    }

    public wb.f v() {
        if (this.f89789k == null) {
            synchronized (f89779q) {
                try {
                    if (this.f89789k == null) {
                        F();
                        if (this.f89789k == null && !TextUtils.isEmpty(this.f89781c.getDefaultProcessName())) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f89789k;
    }

    public List<u> w() {
        return this.f89784f;
    }

    public qb.n x() {
        return this.f89790l;
    }

    public WorkDatabase y() {
        return this.f89782d;
    }

    public com.google.common.util.concurrent.s<List<androidx.work.r0>> z(androidx.work.t0 t0Var) {
        return tb.e0.f(this.f89782d, this.f89783e, t0Var);
    }
}
