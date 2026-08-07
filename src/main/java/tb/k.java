package tb;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.r0;
import androidx.work.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lb.e1;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f113077a = androidx.work.z.i("EnqueueRunnable");

    public static boolean a(lb.e0 e0Var) {
        e1 e1VarH = e0Var.h();
        WorkDatabase workDatabaseY = e1VarH.y();
        workDatabaseY.beginTransaction();
        try {
            l.a(workDatabaseY, e1VarH.q(), e0Var);
            boolean zE = e(e0Var);
            workDatabaseY.setTransactionSuccessful();
            return zE;
        } finally {
            workDatabaseY.endTransaction();
        }
    }

    public static void b(lb.e0 e0Var) {
        if (!e0Var.i()) {
            if (a(e0Var)) {
                f(e0Var);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + e0Var + ")");
        }
    }

    private static boolean c(lb.e0 e0Var) {
        boolean zD = d(e0Var.h(), e0Var.g(), (String[]) lb.e0.m(e0Var).toArray(new String[0]), e0Var.e(), e0Var.c());
        e0Var.l();
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    private static boolean d(e1 e1Var, List<? extends u0> list, String[] strArr, String str, androidx.work.l lVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        e1 e1Var2;
        WorkDatabase workDatabase;
        boolean z14;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = e1Var.q().getClock().currentTimeMillis();
        WorkDatabase workDatabaseY = e1Var.y();
        boolean z15 = strArr2 != null && strArr2.length > 0;
        if (z15) {
            z11 = false;
            z12 = false;
            z13 = true;
            for (String str2 : strArr2) {
                sb.m0 m0VarT = workDatabaseY.j().t(str2);
                if (m0VarT == null) {
                    androidx.work.z.e().c(f113077a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                r0.c cVar = m0VarT.state;
                z13 &= cVar == r0.c.SUCCEEDED;
                if (cVar == r0.c.FAILED) {
                    z12 = true;
                } else if (cVar == r0.c.CANCELLED) {
                    z11 = true;
                }
            }
        } else {
            z11 = false;
            z12 = false;
            z13 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z15) {
            e1Var2 = e1Var;
            workDatabase = workDatabaseY;
            z14 = false;
        } else {
            List<sb.m0.IdAndState> listX = workDatabaseY.j().x(str);
            if (listX.isEmpty()) {
                e1Var2 = e1Var;
                workDatabase = workDatabaseY;
            } else if (lVar == androidx.work.l.APPEND || lVar == androidx.work.l.APPEND_OR_REPLACE) {
                e1Var2 = e1Var;
                sb.b bVarD = workDatabaseY.d();
                List arrayList = new ArrayList();
                for (sb.m0.IdAndState idAndState : listX) {
                    if (!bVarD.c(idAndState.id)) {
                        r0.c cVar2 = idAndState.state;
                        boolean z16 = (cVar2 == r0.c.SUCCEEDED) & z13;
                        if (cVar2 == r0.c.FAILED) {
                            z12 = true;
                        } else if (cVar2 == r0.c.CANCELLED) {
                            z11 = true;
                        }
                        arrayList.add(idAndState.id);
                        z13 = z16;
                    }
                    workDatabaseY = workDatabaseY;
                }
                workDatabase = workDatabaseY;
                if (lVar == androidx.work.l.APPEND_OR_REPLACE && (z11 || z12)) {
                    sb.n0 n0VarJ = workDatabase.j();
                    Iterator<sb.m0.IdAndState> it = n0VarJ.x(str).iterator();
                    while (it.hasNext()) {
                        n0VarJ.b(it.next().id);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z11 = false;
                    z12 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z15 = strArr2.length > 0;
            } else {
                if (lVar == androidx.work.l.KEEP) {
                    Iterator<sb.m0.IdAndState> it2 = listX.iterator();
                    while (it2.hasNext()) {
                        r0.c cVar3 = it2.next().state;
                        if (cVar3 == r0.c.ENQUEUED || cVar3 == r0.c.RUNNING) {
                            return false;
                        }
                    }
                }
                e1Var2 = e1Var;
                j.r(str, e1Var2);
                sb.n0 n0VarJ2 = workDatabaseY.j();
                Iterator<sb.m0.IdAndState> it3 = listX.iterator();
                while (it3.hasNext()) {
                    n0VarJ2.b(it3.next().id);
                }
                workDatabase = workDatabaseY;
                z14 = true;
            }
            z14 = false;
        }
        Iterator<? extends u0> it4 = list.iterator();
        while (it4.hasNext()) {
            u0 next = it4.next();
            sb.m0 workSpec = next.getWorkSpec();
            if (!z15 || z13) {
                workSpec.lastEnqueueTime = jCurrentTimeMillis;
            } else if (z12) {
                workSpec.state = r0.c.FAILED;
            } else if (z11) {
                workSpec.state = r0.c.CANCELLED;
            } else {
                workSpec.state = r0.c.BLOCKED;
            }
            if (workSpec.state == r0.c.ENQUEUED) {
                z14 = true;
            }
            workDatabase.j().i(l.d(e1Var2.w(), workSpec));
            if (z15) {
                int length = strArr2.length;
                int i11 = 0;
                while (i11 < length) {
                    workDatabase.d().d(new sb.a(next.b(), strArr2[i11]));
                    i11++;
                    it4 = it4;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            Iterator<? extends u0> it5 = it4;
            workDatabase.k().b(next.b(), next.c());
            if (!zIsEmpty) {
                workDatabase.h().b(new sb.a0(str, next.b()));
            }
            it4 = it5;
            strArr2 = strArr3;
        }
        return z14;
    }

    private static boolean e(lb.e0 e0Var) {
        List<lb.e0> listF = e0Var.f();
        boolean zE = false;
        if (listF != null) {
            for (lb.e0 e0Var2 : listF) {
                if (e0Var2.k()) {
                    androidx.work.z.e().k(f113077a, "Already enqueued work ids (" + TextUtils.join(", ", e0Var2.d()) + ")");
                } else {
                    zE |= e(e0Var2);
                }
            }
        }
        return c(e0Var) | zE;
    }

    public static void f(lb.e0 e0Var) {
        e1 e1VarH = e0Var.h();
        androidx.work.impl.a.f(e1VarH.q(), e1VarH.y(), e1VarH.w());
    }
}
