package lb;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class e0 extends androidx.work.q0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f89766j = androidx.work.z.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1 f89767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f89768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.l f89769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<? extends androidx.work.u0> f89770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f89771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f89772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<e0> f89773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f89774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.work.d0 f89775i;

    public e0(e1 e1Var, List<? extends androidx.work.u0> list) {
        this(e1Var, null, androidx.work.l.KEEP, list, null);
    }

    public static /* synthetic */ jn0.h0 a(e0 e0Var) {
        e0Var.getClass();
        tb.k.b(e0Var);
        return jn0.h0.f84049a;
    }

    private static boolean j(e0 e0Var, Set<String> set) {
        set.addAll(e0Var.d());
        Set<String> setM = m(e0Var);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setM.contains(it.next())) {
                return true;
            }
        }
        List<e0> listF = e0Var.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator<e0> it2 = listF.iterator();
            while (it2.hasNext()) {
                if (j(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(e0Var.d());
        return false;
    }

    public static Set<String> m(e0 e0Var) {
        HashSet hashSet = new HashSet();
        List<e0> listF = e0Var.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator<e0> it = listF.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().d());
            }
        }
        return hashSet;
    }

    public androidx.work.d0 b() {
        if (this.f89774h) {
            androidx.work.z.e().k(f89766j, "Already enqueued work ids (" + TextUtils.join(", ", this.f89771e) + ")");
        } else {
            this.f89775i = androidx.work.h0.c(this.f89767a.q().getTracer(), "EnqueueRunnable_" + c().name(), this.f89767a.A().d(), new wn0.a() { // from class: lb.d0
                @Override // wn0.a
                public final Object invoke() {
                    return e0.a(this.f89764a);
                }
            });
        }
        return this.f89775i;
    }

    public androidx.work.l c() {
        return this.f89769c;
    }

    public List<String> d() {
        return this.f89771e;
    }

    public String e() {
        return this.f89768b;
    }

    public List<e0> f() {
        return this.f89773g;
    }

    public List<? extends androidx.work.u0> g() {
        return this.f89770d;
    }

    public e1 h() {
        return this.f89767a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f89774h;
    }

    public void l() {
        this.f89774h = true;
    }

    public e0(e1 e1Var, String str, androidx.work.l lVar, List<? extends androidx.work.u0> list) {
        this(e1Var, str, lVar, list, null);
    }

    public e0(e1 e1Var, String str, androidx.work.l lVar, List<? extends androidx.work.u0> list, List<e0> list2) {
        this.f89767a = e1Var;
        this.f89768b = str;
        this.f89769c = lVar;
        this.f89770d = list;
        this.f89773g = list2;
        this.f89771e = new ArrayList(list.size());
        this.f89772f = new ArrayList();
        if (list2 != null) {
            Iterator<e0> it = list2.iterator();
            while (it.hasNext()) {
                this.f89772f.addAll(it.next().f89772f);
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (lVar == androidx.work.l.REPLACE && list.get(i11).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strB = list.get(i11).b();
            this.f89771e.add(strB);
            this.f89772f.add(strB);
        }
    }
}
