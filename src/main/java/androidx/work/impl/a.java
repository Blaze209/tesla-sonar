package androidx.work.impl;

import android.content.Context;
import androidx.work.c;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import lb.e;
import lb.s;
import lb.u;
import nb.f;
import sb.WorkGenerationalId;
import sb.m0;
import sb.n0;
import tb.w;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14557a = z.i("Schedulers");

    public static /* synthetic */ void b(List list, WorkGenerationalId workGenerationalId, c cVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((u) it.next()).e(workGenerationalId.getWorkSpecId());
        }
        f(cVar, workDatabase, list);
    }

    static u c(Context context, WorkDatabase workDatabase, c cVar) {
        f fVar = new f(context, workDatabase, cVar);
        w.c(context, SystemJobService.class, true);
        z.e().a(f14557a, "Created SystemJobScheduler and enabled SystemJobService");
        return fVar;
    }

    private static void d(n0 n0Var, androidx.work.b bVar, List<m0> list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = bVar.currentTimeMillis();
            Iterator<m0> it = list.iterator();
            while (it.hasNext()) {
                n0Var.w(it.next().id, jCurrentTimeMillis);
            }
        }
    }

    public static void e(final List<u> list, s sVar, final Executor executor, final WorkDatabase workDatabase, final c cVar) {
        sVar.e(new e() { // from class: lb.v
            @Override // lb.e
            public final void d(WorkGenerationalId workGenerationalId, boolean z11) {
                executor.execute(new Runnable() { // from class: lb.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.work.impl.a.b(list, workGenerationalId, cVar, workDatabase);
                    }
                });
            }
        });
    }

    public static void f(c cVar, WorkDatabase workDatabase, List<u> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        n0 n0VarJ = workDatabase.j();
        workDatabase.beginTransaction();
        try {
            List<m0> listM = n0VarJ.m();
            d(n0VarJ, cVar.getClock(), listM);
            List<m0> listZ = n0VarJ.z(cVar.getMaxSchedulerLimit());
            d(n0VarJ, cVar.getClock(), listZ);
            if (listM != null) {
                listZ.addAll(listM);
            }
            List<m0> listH = n0VarJ.h(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (listZ.size() > 0) {
                m0[] m0VarArr = (m0[]) listZ.toArray(new m0[listZ.size()]);
                for (u uVar : list) {
                    if (uVar.b()) {
                        uVar.c(m0VarArr);
                    }
                }
            }
            if (listH.size() > 0) {
                m0[] m0VarArr2 = (m0[]) listH.toArray(new m0[listH.size()]);
                for (u uVar2 : list) {
                    if (!uVar2.b()) {
                        uVar2.c(m0VarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }
}
