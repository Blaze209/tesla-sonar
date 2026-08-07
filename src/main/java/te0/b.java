package te0;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.c0;
import androidx.work.j0;
import androidx.work.k;
import androidx.work.l;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.tesla.utils.DummyWorker;
import com.tesla.widget.worker.UpdateWidgetWorker;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import me0.a0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJI\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lte0/b;", "", "<init>", "()V", "", "appwidgetId", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/String;", "Lme0/a0;", "type", "", "withCache", "Lme0/b;", "commandExecution", "Landroidx/work/g;", "e", "(ILme0/a0;ZLme0/b;)Landroidx/work/g;", "Ljava/lang/Class;", "Landroidx/work/CoroutineWorker;", "worker", "", "delay", "Landroidx/work/c0;", "f", "(Ljava/lang/Class;ILme0/a0;Ljava/lang/Long;ZLme0/b;)Landroidx/work/c0;", "Landroidx/work/j0;", "g", "(Ljava/lang/Class;ILme0/a0;Lme0/b;)Landroidx/work/j0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "j", "(ILandroid/content/Context;Lme0/a0;Lme0/b;Ljava/lang/Long;Z)V", "l", "(ILandroid/content/Context;Lme0/a0;Lme0/b;)V", "h", "(ILandroid/content/Context;)V", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f113254a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("UpdateWidgetScheduler");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.widget.worker.UpdateWidgetScheduler$cancelPeriodicWidgetUpdate$1", f = "UpdateWidgetScheduler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113256n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f113257o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f113258p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f113257o = i11;
            this.f113258p = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(String str) {
            b.logger.a("cancel UniquePeriodicWorkerId:" + str);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f113257o, this.f113258p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f113256n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            final String strI = b.f113254a.i(this.f113257o);
            try {
                wb.f.h(this.f113258p).c(strI).b(new Runnable() { // from class: te0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a.b(strI);
                    }
                }, Executors.newSingleThreadExecutor());
            } catch (Exception e11) {
                b.logger.a("cancelP UniquePeriodicWorkerId:" + strI + " with error: " + e11.getMessage());
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: te0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.widget.worker.UpdateWidgetScheduler$scheduleOneTimeWidgetUpdate$1", f = "UpdateWidgetScheduler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C2418b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113259n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Context f113260o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f113261p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a0 f113262q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Long f113263r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f113264s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ me0.b f113265t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2418b(Context context, int i11, a0 a0Var, Long l11, boolean z11, me0.b bVar, Continuation<? super C2418b> continuation) {
            super(2, continuation);
            this.f113260o = context;
            this.f113261p = i11;
            this.f113262q = a0Var;
            this.f113263r = l11;
            this.f113264s = z11;
            this.f113265t = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C2418b(this.f113260o, this.f113261p, this.f113262q, this.f113263r, this.f113264s, this.f113265t, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f113259n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                DummyWorker.INSTANCE.c(this.f113260o);
                c0 c0VarF = b.f113254a.f(UpdateWidgetWorker.class, this.f113261p, this.f113262q, this.f113263r, this.f113264s, this.f113265t);
                int i11 = this.f113261p;
                Long l11 = this.f113263r;
                wb.f.h(this.f113260o).f("com.teslamotors.tesla.key-unique-widget-id-" + i11 + "-" + ((l11 == null || l11.longValue() <= 0) ? "immediate" : "delayed"), l.REPLACE, c0VarF);
            } catch (Exception e11) {
                b.logger.d("Failed to schedule widget update worker", e11);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C2418b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.widget.worker.UpdateWidgetScheduler$schedulePeriodicWidgetUpdate$1", f = "UpdateWidgetScheduler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113266n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Context f113267o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f113268p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a0 f113269q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ me0.b f113270r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i11, a0 a0Var, me0.b bVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f113267o = context;
            this.f113268p = i11;
            this.f113269q = a0Var;
            this.f113270r = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f113267o, this.f113268p, this.f113269q, this.f113270r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f113266n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                DummyWorker.INSTANCE.c(this.f113267o);
                b bVar = b.f113254a;
                j0 j0VarG = bVar.g(UpdateWidgetWorker.class, this.f113268p, this.f113269q, this.f113270r);
                b.logger.j("enqueue unique-periodic request with REPLACE policy for " + this.f113269q.name() + " widget-" + this.f113268p);
                wb.f.h(this.f113267o).e(bVar.i(this.f113268p), k.REPLACE, j0VarG);
            } catch (Exception e11) {
                b.logger.d("Failed to schedule widget update worker", e11);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private b() {
    }

    private final androidx.work.g e(int appwidgetId, a0 type, boolean withCache, me0.b commandExecution) {
        androidx.work.g.a aVarE = new androidx.work.g.a().i("app_widget_id", appwidgetId).k("app_widget_type", type.name()).e("with_vehicle_cache", withCache);
        if (commandExecution != null) {
            aVarE.k("execution", commandExecution.name());
        }
        return aVarE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c0 f(Class<? extends CoroutineWorker> worker, int appwidgetId, a0 type, Long delay, boolean withCache, me0.b commandExecution) {
        c0.a aVarN = new c0.a(worker).i(androidx.work.a.EXPONENTIAL, 30L, TimeUnit.SECONDS).n(e(appwidgetId, type, withCache, commandExecution));
        if (delay != null) {
            aVarN.m(delay.longValue(), TimeUnit.MILLISECONDS);
        }
        c0 c0VarB = aVarN.b();
        logger.a("Scheduling " + type + " widget-" + appwidgetId + " update worker: " + c0VarB.getId() + " with delay " + delay);
        return c0VarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0 g(Class<? extends CoroutineWorker> worker, int appwidgetId, a0 type, me0.b commandExecution) {
        j0 j0VarB = new j0.a(worker, 15L, TimeUnit.MINUTES).n(e(appwidgetId, type, false, commandExecution)).a("com.teslamotors.tesla.widget-periodic").b();
        logger.a("Scheduling Periodic " + type + " widget-" + appwidgetId + " update worker: " + j0VarB.getId());
        return j0VarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(int appwidgetId) {
        return "com.teslamotors.tesla.key-unique-periodic-widget-id-" + appwidgetId;
    }

    public static /* synthetic */ void k(b bVar, int i11, Context context, a0 a0Var, me0.b bVar2, Long l11, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            bVar2 = null;
        }
        if ((i12 & 16) != 0) {
            l11 = null;
        }
        if ((i12 & 32) != 0) {
            z11 = false;
        }
        bVar.j(i11, context, a0Var, bVar2, l11, z11);
    }

    public static /* synthetic */ void m(b bVar, int i11, Context context, a0 a0Var, me0.b bVar2, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            bVar2 = null;
        }
        bVar.l(i11, context, a0Var, bVar2);
    }

    public final void h(int appwidgetId, Context context) {
        s.k(context, "context");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(appwidgetId, context, null), 3, null);
    }

    public final void j(int appwidgetId, Context context, a0 type, me0.b commandExecution, Long delay, boolean withCache) {
        s.k(context, "context");
        s.k(type, "type");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C2418b(context, appwidgetId, type, delay, withCache, commandExecution, null), 3, null);
    }

    public final void l(int appwidgetId, Context context, a0 type, me0.b commandExecution) {
        s.k(context, "context");
        s.k(type, "type");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new c(context, appwidgetId, type, commandExecution, null), 3, null);
    }
}
