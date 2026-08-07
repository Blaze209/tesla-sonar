package androidx.work.impl;

import android.content.Context;
import androidx.work.c;
import androidx.work.l0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import lb.c1;
import lb.e1;
import lb.s;
import lb.u;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.p;
import qb.n;
import wn0.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2<\b\u0002\u0010\u0010\u001a6\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fj\u0002`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019*j\u0010\u001a\"2\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f22\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¨\u0006\u001b"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/c;", "configuration", "Lub/b;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lqb/n;", "trackers", "Llb/s;", "processor", "Lkotlin/Function6;", "", "Llb/u;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Llb/e1;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Landroidx/work/c;Lub/b;Landroidx/work/impl/WorkDatabase;Lqb/n;Llb/s;Lwn0/t;)Llb/e1;", "b", "(Landroid/content/Context;Landroidx/work/c;Lub/b;Landroidx/work/impl/WorkDatabase;Lqb/n;Llb/s;)Ljava/util/List;", "taskExecutor", "Lkotlinx/coroutines/CoroutineScope;", "f", "(Lub/b;)Lkotlinx/coroutines/CoroutineScope;", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends p implements t<Context, c, ub.b, WorkDatabase, n, s, List<? extends u>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14558a = new a();

        a() {
            super(6, b.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // wn0.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<u> i(Context p11, c p12, ub.b p13, WorkDatabase p14, n p15, s p16) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            p013kotlin.jvm.internal.s.k(p13, "p2");
            p013kotlin.jvm.internal.s.k(p14, "p3");
            p013kotlin.jvm.internal.s.k(p15, "p4");
            p013kotlin.jvm.internal.s.k(p16, "p5");
            return b.b(p11, p12, p13, p14, p15, p16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<u> b(Context context, c cVar, ub.b bVar, WorkDatabase workDatabase, n nVar, s sVar) {
        u uVarC = androidx.work.impl.a.c(context, workDatabase, cVar);
        p013kotlin.jvm.internal.s.j(uVarC, "createBestAvailableBackgroundScheduler(...)");
        return v.p(uVarC, new mb.b(context, cVar, nVar, sVar, new c1(sVar, bVar), bVar));
    }

    public static final e1 c(Context context, c configuration) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        return e(context, configuration, null, null, null, null, null, 124, null);
    }

    public static final e1 d(Context context, c configuration, ub.b workTaskExecutor, WorkDatabase workDatabase, n trackers, s processor, t<? super Context, ? super c, ? super ub.b, ? super WorkDatabase, ? super n, ? super s, ? extends List<? extends u>> schedulersCreator) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(workTaskExecutor, "workTaskExecutor");
        p013kotlin.jvm.internal.s.k(workDatabase, "workDatabase");
        p013kotlin.jvm.internal.s.k(trackers, "trackers");
        p013kotlin.jvm.internal.s.k(processor, "processor");
        p013kotlin.jvm.internal.s.k(schedulersCreator, "schedulersCreator");
        return new e1(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, schedulersCreator.i(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static /* synthetic */ e1 e(Context context, c cVar, ub.b bVar, WorkDatabase workDatabase, n nVar, s sVar, t tVar, int i11, Object obj) {
        n nVar2;
        if ((i11 & 4) != 0) {
            bVar = new ub.c(cVar.getTaskExecutor());
        }
        ub.b bVar2 = bVar;
        if ((i11 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            ub.a aVarD = bVar2.d();
            p013kotlin.jvm.internal.s.j(aVarD, "getSerialTaskExecutor(...)");
            workDatabase = companion.b(applicationContext, aVarD, cVar.getClock(), context.getResources().getBoolean(l0.f14647a));
        }
        if ((i11 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext2, "getApplicationContext(...)");
            nVar2 = new n(applicationContext2, bVar2, null, null, null, null, 60, null);
        } else {
            nVar2 = nVar;
        }
        return d(context, cVar, bVar2, workDatabase, nVar2, (i11 & 32) != 0 ? new s(context.getApplicationContext(), cVar, bVar2, workDatabase) : sVar, (i11 & 64) != 0 ? a.f14558a : tVar);
    }

    public static final CoroutineScope f(ub.b taskExecutor) {
        p013kotlin.jvm.internal.s.k(taskExecutor, "taskExecutor");
        CoroutineDispatcher coroutineDispatcherA = taskExecutor.a();
        p013kotlin.jvm.internal.s.j(coroutineDispatcherA, "getTaskCoroutineDispatcher(...)");
        return CoroutineScopeKt.CoroutineScope(coroutineDispatcherA);
    }
}
