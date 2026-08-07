package tb;

import androidx.work.impl.WorkDatabase;
import androidx.work.r0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import lb.e1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Llb/e1;", "workManagerImpl", "", "workSpecId", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Llb/e1;Ljava/lang/String;)V", "x", "(Llb/e1;)V", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "w", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "Landroidx/work/d0;", "m", "(Ljava/util/UUID;Llb/e1;)Landroidx/work/d0;", "tag", "t", "(Ljava/lang/String;Llb/e1;)Landroidx/work/d0;", "name", "p", "r", "(Ljava/lang/String;Llb/e1;)V", "j", "(Llb/e1;)Landroidx/work/d0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    private static final void i(e1 e1Var, String str) {
        WorkDatabase workDatabaseY = e1Var.y();
        p013kotlin.jvm.internal.s.j(workDatabaseY, "getWorkDatabase(...)");
        w(workDatabaseY, str);
        lb.s sVarU = e1Var.u();
        p013kotlin.jvm.internal.s.j(sVarU, "getProcessor(...)");
        sVarU.p(str, 1);
        Iterator<lb.u> it = e1Var.w().iterator();
        while (it.hasNext()) {
            it.next().e(str);
        }
    }

    public static final androidx.work.d0 j(final e1 workManagerImpl) {
        p013kotlin.jvm.internal.s.k(workManagerImpl, "workManagerImpl");
        androidx.work.o0 tracer = workManagerImpl.q().getTracer();
        ub.a aVarD = workManagerImpl.A().d();
        p013kotlin.jvm.internal.s.j(aVarD, "getSerialTaskExecutor(...)");
        return androidx.work.h0.c(tracer, "CancelAllWork", aVarD, new wn0.a() { // from class: tb.d
            @Override // wn0.a
            public final Object invoke() {
                return j.k(workManagerImpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k(final e1 e1Var) {
        final WorkDatabase workDatabaseY = e1Var.y();
        p013kotlin.jvm.internal.s.j(workDatabaseY, "getWorkDatabase(...)");
        workDatabaseY.runInTransaction(new Runnable() { // from class: tb.i
            @Override // java.lang.Runnable
            public final void run() {
                j.l(workDatabaseY, e1Var);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(WorkDatabase workDatabase, e1 e1Var) {
        Iterator<String> it = workDatabase.j().l().iterator();
        while (it.hasNext()) {
            i(e1Var, it.next());
        }
        new x(workDatabase).d(e1Var.q().getClock().currentTimeMillis());
    }

    public static final androidx.work.d0 m(final UUID id2, final e1 workManagerImpl) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(workManagerImpl, "workManagerImpl");
        androidx.work.o0 tracer = workManagerImpl.q().getTracer();
        ub.a aVarD = workManagerImpl.A().d();
        p013kotlin.jvm.internal.s.j(aVarD, "getSerialTaskExecutor(...)");
        return androidx.work.h0.c(tracer, "CancelWorkById", aVarD, new wn0.a() { // from class: tb.e
            @Override // wn0.a
            public final Object invoke() {
                return j.n(workManagerImpl, id2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n(final e1 e1Var, final UUID uuid) {
        WorkDatabase workDatabaseY = e1Var.y();
        p013kotlin.jvm.internal.s.j(workDatabaseY, "getWorkDatabase(...)");
        workDatabaseY.runInTransaction(new Runnable() { // from class: tb.h
            @Override // java.lang.Runnable
            public final void run() {
                j.o(e1Var, uuid);
            }
        });
        x(e1Var);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(e1 e1Var, UUID uuid) {
        String string = uuid.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        i(e1Var, string);
    }

    public static final androidx.work.d0 p(final String name, final e1 workManagerImpl) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(workManagerImpl, "workManagerImpl");
        androidx.work.o0 tracer = workManagerImpl.q().getTracer();
        String str = "CancelWorkByName_" + name;
        ub.a aVarD = workManagerImpl.A().d();
        p013kotlin.jvm.internal.s.j(aVarD, "getSerialTaskExecutor(...)");
        return androidx.work.h0.c(tracer, str, aVarD, new wn0.a() { // from class: tb.c
            @Override // wn0.a
            public final Object invoke() {
                return j.q(name, workManagerImpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 q(String str, e1 e1Var) {
        r(str, e1Var);
        x(e1Var);
        return jn0.h0.f84049a;
    }

    public static final void r(final String name, final e1 workManagerImpl) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(workManagerImpl, "workManagerImpl");
        final WorkDatabase workDatabaseY = workManagerImpl.y();
        p013kotlin.jvm.internal.s.j(workDatabaseY, "getWorkDatabase(...)");
        workDatabaseY.runInTransaction(new Runnable() { // from class: tb.f
            @Override // java.lang.Runnable
            public final void run() {
                j.s(workDatabaseY, name, workManagerImpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(WorkDatabase workDatabase, String str, e1 e1Var) {
        Iterator<String> it = workDatabase.j().d(str).iterator();
        while (it.hasNext()) {
            i(e1Var, it.next());
        }
    }

    public static final androidx.work.d0 t(final String tag, final e1 workManagerImpl) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        p013kotlin.jvm.internal.s.k(workManagerImpl, "workManagerImpl");
        androidx.work.o0 tracer = workManagerImpl.q().getTracer();
        String str = "CancelWorkByTag_" + tag;
        ub.a aVarD = workManagerImpl.A().d();
        p013kotlin.jvm.internal.s.j(aVarD, "getSerialTaskExecutor(...)");
        return androidx.work.h0.c(tracer, str, aVarD, new wn0.a() { // from class: tb.b
            @Override // wn0.a
            public final Object invoke() {
                return j.u(workManagerImpl, tag);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 u(final e1 e1Var, final String str) {
        final WorkDatabase workDatabaseY = e1Var.y();
        p013kotlin.jvm.internal.s.j(workDatabaseY, "getWorkDatabase(...)");
        workDatabaseY.runInTransaction(new Runnable() { // from class: tb.g
            @Override // java.lang.Runnable
            public final void run() {
                j.v(workDatabaseY, str, e1Var);
            }
        });
        x(e1Var);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(WorkDatabase workDatabase, String str, e1 e1Var) {
        Iterator<String> it = workDatabase.j().f(str).iterator();
        while (it.hasNext()) {
            i(e1Var, it.next());
        }
    }

    private static final void w(WorkDatabase workDatabase, String str) {
        sb.n0 n0VarJ = workDatabase.j();
        sb.b bVarD = workDatabase.d();
        List listS = p013kotlin.collections.v.s(str);
        while (!listS.isEmpty()) {
            String str2 = (String) p013kotlin.collections.v.O(listS);
            r0.c cVarA = n0VarJ.a(str2);
            if (cVarA != r0.c.SUCCEEDED && cVarA != r0.c.FAILED) {
                n0VarJ.e(str2);
            }
            listS.addAll(bVarD.a(str2));
        }
    }

    private static final void x(e1 e1Var) {
        androidx.work.impl.a.f(e1Var.q(), e1Var.y(), e1Var.w());
    }
}
