package lb;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import sb.x1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Llb/s;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/c;", "configuration", "", "Llb/u;", "schedulers", "Lsb/m0;", "newWorkSpec", "", "", "tags", "Landroidx/work/s0$b;", "h", "(Llb/s;Landroidx/work/impl/WorkDatabase;Landroidx/work/c;Ljava/util/List;Lsb/m0;Ljava/util/Set;)Landroidx/work/s0$b;", "Llb/e1;", "name", "Landroidx/work/u0;", "workRequest", "Landroidx/work/d0;", "e", "(Llb/e1;Ljava/lang/String;Landroidx/work/u0;)Landroidx/work/d0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l1 {
    public static final androidx.work.d0 e(final e1 e1Var, final String name, final androidx.work.u0 workRequest) {
        p013kotlin.jvm.internal.s.k(e1Var, "<this>");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(workRequest, "workRequest");
        androidx.work.o0 o0VarO = e1Var.q().getTracer();
        String str = "enqueueUniquePeriodic_" + name;
        ub.a aVarD = e1Var.A().d();
        p013kotlin.jvm.internal.s.j(aVarD, "getSerialTaskExecutor(...)");
        return androidx.work.h0.c(o0VarO, str, aVarD, new wn0.a() { // from class: lb.h1
            @Override // wn0.a
            public final Object invoke() {
                return l1.f(e1Var, name, workRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f(final e1 e1Var, final String str, final androidx.work.u0 u0Var) {
        wn0.a aVar = new wn0.a() { // from class: lb.i1
            @Override // wn0.a
            public final Object invoke() {
                return l1.g(u0Var, e1Var, str);
            }
        };
        sb.n0 n0VarJ = e1Var.y().j();
        List<sb.m0.IdAndState> listX = n0VarJ.x(str);
        if (listX.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        sb.m0.IdAndState idAndState = (sb.m0.IdAndState) p013kotlin.collections.v.q0(listX);
        if (idAndState == null) {
            aVar.invoke();
            return jn0.h0.f84049a;
        }
        sb.m0 m0VarT = n0VarJ.t(idAndState.id);
        if (m0VarT == null) {
            throw new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + str + "\", wasn't found");
        }
        if (!m0VarT.o()) {
            throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        }
        if (idAndState.state == androidx.work.r0.c.CANCELLED) {
            n0VarJ.b(idAndState.id);
            aVar.invoke();
            return jn0.h0.f84049a;
        }
        sb.m0 m0VarE = sb.m0.e(u0Var.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554430, null);
        s sVarU = e1Var.u();
        p013kotlin.jvm.internal.s.j(sVarU, "getProcessor(...)");
        WorkDatabase workDatabaseY = e1Var.y();
        p013kotlin.jvm.internal.s.j(workDatabaseY, "getWorkDatabase(...)");
        androidx.work.c cVarQ = e1Var.q();
        p013kotlin.jvm.internal.s.j(cVarQ, "<get-configuration>(...)");
        List<u> listW = e1Var.w();
        p013kotlin.jvm.internal.s.j(listW, "getSchedulers(...)");
        h(sVarU, workDatabaseY, cVarQ, listW, m0VarE, u0Var.c());
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g(androidx.work.u0 u0Var, e1 e1Var, String str) {
        tb.k.b(new e0(e1Var, str, androidx.work.l.KEEP, p013kotlin.collections.v.e(u0Var)));
        return jn0.h0.f84049a;
    }

    private static final androidx.work.s0.b h(s sVar, final WorkDatabase workDatabase, androidx.work.c cVar, final List<? extends u> list, final sb.m0 m0Var, final Set<String> set) {
        final String str = m0Var.id;
        final sb.m0 m0VarT = workDatabase.j().t(str);
        if (m0VarT == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (m0VarT.state.isFinished()) {
            return androidx.work.s0.b.NOT_APPLIED;
        }
        if (m0VarT.o() ^ m0Var.o()) {
            wn0.l lVar = new wn0.l() { // from class: lb.j1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return l1.i((sb.m0) obj);
                }
            };
            throw new UnsupportedOperationException("Can't update " + ((String) lVar.invoke(m0VarT)) + " Worker to " + ((String) lVar.invoke(m0Var)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zK = sVar.k(str);
        if (!zK) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((u) it.next()).e(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: lb.k1
            @Override // java.lang.Runnable
            public final void run() {
                l1.j(workDatabase, m0VarT, m0Var, list, str, set, zK);
            }
        });
        if (!zK) {
            androidx.work.impl.a.f(cVar, workDatabase, list);
        }
        return zK ? androidx.work.s0.b.APPLIED_FOR_NEXT_RUN : androidx.work.s0.b.APPLIED_IMMEDIATELY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(sb.m0 spec) {
        p013kotlin.jvm.internal.s.k(spec, "spec");
        return spec.o() ? "Periodic" : "OneTime";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WorkDatabase workDatabase, sb.m0 m0Var, sb.m0 m0Var2, List list, String str, Set set, boolean z11) {
        sb.n0 n0VarJ = workDatabase.j();
        x1 x1VarK = workDatabase.k();
        sb.m0 m0VarE = sb.m0.e(m0Var2, null, m0Var.state, null, null, null, null, 0L, 0L, 0L, null, m0Var.runAttemptCount, null, 0L, m0Var.lastEnqueueTime, 0L, 0L, false, null, m0Var.getPeriodCount(), m0Var.getGeneration() + 1, m0Var.getNextScheduleTimeOverride(), m0Var.getNextScheduleTimeOverrideGeneration(), 0, null, null, 29613053, null);
        if (m0Var2.getNextScheduleTimeOverrideGeneration() == 1) {
            m0VarE.q(m0Var2.getNextScheduleTimeOverride());
            m0VarE.r(m0VarE.getNextScheduleTimeOverrideGeneration() + 1);
        }
        n0VarJ.v(tb.l.d(list, m0VarE));
        x1VarK.a(str);
        x1VarK.b(str, set);
        if (z11) {
            return;
        }
        n0VarJ.w(str, -1L);
        workDatabase.i().b(str);
    }
}
