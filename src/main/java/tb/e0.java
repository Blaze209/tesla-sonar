package tb;

import androidx.work.impl.WorkDatabase;
import androidx.work.r0;
import androidx.work.t0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lub/b;", "executor", "", "tag", "Lcom/google/common/util/concurrent/s;", "", "Landroidx/work/r0;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/work/impl/WorkDatabase;Lub/b;Ljava/lang/String;)Lcom/google/common/util/concurrent/s;", "Landroidx/work/t0;", "querySpec", "f", "(Landroidx/work/impl/WorkDatabase;Lub/b;Landroidx/work/t0;)Lcom/google/common/util/concurrent/s;", "T", "Lkotlin/Function1;", "block", "h", "(Landroidx/work/impl/WorkDatabase;Lub/b;Lwn0/l;)Lcom/google/common/util/concurrent/s;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {
    public static final com.google.common.util.concurrent.s<List<r0>> d(WorkDatabase workDatabase, ub.b executor, final String tag) {
        p013kotlin.jvm.internal.s.k(workDatabase, "<this>");
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(tag, "tag");
        return h(workDatabase, executor, new wn0.l() { // from class: tb.b0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return e0.e(tag, (WorkDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(String str, WorkDatabase db2) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        List<r0> listApply = sb.m0.B.apply(db2.j().C(str));
        p013kotlin.jvm.internal.s.j(listApply, "apply(...)");
        return listApply;
    }

    public static final com.google.common.util.concurrent.s<List<r0>> f(WorkDatabase workDatabase, ub.b executor, final t0 querySpec) {
        p013kotlin.jvm.internal.s.k(workDatabase, "<this>");
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(querySpec, "querySpec");
        return h(workDatabase, executor, new wn0.l() { // from class: tb.c0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return e0.g(querySpec, (WorkDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(t0 t0Var, WorkDatabase db2) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        List<r0> listApply = sb.m0.B.apply(db2.f().a(z.b(t0Var)));
        p013kotlin.jvm.internal.s.j(listApply, "apply(...)");
        return listApply;
    }

    private static final <T> com.google.common.util.concurrent.s<T> h(final WorkDatabase workDatabase, ub.b bVar, final wn0.l<? super WorkDatabase, ? extends T> lVar) {
        ub.a aVarD = bVar.d();
        p013kotlin.jvm.internal.s.j(aVarD, "getSerialTaskExecutor(...)");
        return androidx.work.w.f(aVarD, "loadStatusFuture", new wn0.a() { // from class: tb.d0
            @Override // wn0.a
            public final Object invoke() {
                return e0.i(lVar, workDatabase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(wn0.l lVar, WorkDatabase workDatabase) {
        return lVar.invoke(workDatabase);
    }
}
