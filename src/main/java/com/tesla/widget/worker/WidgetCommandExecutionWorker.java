package com.tesla.widget.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c0;
import androidx.work.y;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.widget.worker.WidgetCommandExecutionWorker;
import java.util.HashSet;
import java.util.Map;
import jn0.h0;
import jn0.m;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.WidgetBuilderConfig;
import me0.a0;
import oe0.e;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wb.f;
import wn0.a;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/tesla/widget/worker/WidgetCommandExecutionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme0/s;", "c", "Lkotlin/Lazy;", "l", "()Lme0/s;", "widgetBuilder", "Loe0/e;", DateTokenConverter.CONVERTER_KEY, "k", "()Loe0/e;", "vehicleRepository", "Lne0/b;", "e", "j", "()Lne0/b;", "vehicleCommandMarker", "Ljava/util/HashSet;", "Lne0/c;", "Lkotlin/collections/HashSet;", "f", "Ljava/util/HashSet;", "disabledCommandsByLocationRestriction", "g", "a", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetCommandExecutionWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final g f56605h = g.INSTANCE.a("WidgetCommandExecutionWorker");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Lazy<g> f56606i = m.b(new a() { // from class: te0.g
        @Override // wn0.a
        public final Object invoke() {
            return WidgetCommandExecutionWorker.p();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy widgetBuilder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy vehicleRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy vehicleCommandMarker;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final HashSet<ne0.c> disabledCommandsByLocationRestriction;

    /* JADX INFO: renamed from: com.tesla.widget.worker.WidgetCommandExecutionWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/tesla/widget/worker/WidgetCommandExecutionWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "appwidgetId", "", "vin", "Lne0/c;", "command", "Ljn0/h0;", "b", "(Landroid/content/Context;ILjava/lang/String;Lne0/c;)V", "Lcom/tesla/logging/g;", "workerLog$delegate", "Lkotlin/Lazy;", "c", "()Lcom/tesla/logging/g;", "workerLog", "TAG", "Ljava/lang/String;", "logger", "Lcom/tesla/logging/g;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final g c() {
            return (g) WidgetCommandExecutionWorker.f56606i.getValue();
        }

        public final void b(Context context, int appwidgetId, String vin, ne0.c command) {
            s.k(context, "context");
            s.k(vin, "vin");
            s.k(command, "command");
            try {
                f.h(context).d(new c0.a(WidgetCommandExecutionWorker.class).n(new androidx.work.g.a().i("app_widget_id", appwidgetId).k("vin", vin).k("command", command.toString()).a()).b());
            } catch (Exception e11) {
                WidgetCommandExecutionWorker.f56605h.d("Failed to schedule widget command worker", e11);
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.widget.worker.WidgetCommandExecutionWorker", f = "WidgetCommandExecutionWorker.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {58, 68, 82}, m = "doWork", n = {"this", "command", "vin", "appWidgetId", "this", "command", "vin", "appWidgetId", "this", "command", "vin", "commandRequest", "appWidgetId"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f56611n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f56612o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f56613p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f56614q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f56615r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f56616s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f56618u;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f56616s = obj;
            this.f56618u |= Integer.MIN_VALUE;
            return WidgetCommandExecutionWorker.this.doWork(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements ce0.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f56620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ne0.c f56621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Continuation<ic0.g> f56622d;

        /* JADX WARN: Multi-variable type inference failed */
        c(String str, ne0.c cVar, Continuation<? super ic0.g> continuation) {
            this.f56620b = str;
            this.f56621c = cVar;
            this.f56622d = continuation;
        }

        @Override // ce0.d
        public final void a(ic0.g response) {
            s.k(response, "response");
            WidgetCommandExecutionWorker.this.j().c(this.f56620b, this.f56621c);
            this.f56622d.resumeWith(jn0.s.b(response));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lxc0/a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lxc0/a;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.widget.worker.WidgetCommandExecutionWorker$doWork$vehicle$1", f = "WidgetCommandExecutionWorker.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super xc0.a>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56623n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f56625p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f56625p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return WidgetCommandExecutionWorker.this.new d(this.f56625p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56623n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            e eVarK = WidgetCommandExecutionWorker.this.k();
            String str = this.f56625p;
            this.f56623n = 1;
            Object objH = eVarK.h(str, false, this);
            return objH == coroutine_suspended ? coroutine_suspended : objH;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super xc0.a> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WidgetCommandExecutionWorker(Context context, WorkerParameters workerParams) {
        s.k(context, "context");
        s.k(workerParams, "workerParams");
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        super(applicationContext, workerParams);
        this.widgetBuilder = m.b(new a() { // from class: te0.d
            @Override // wn0.a
            public final Object invoke() {
                return WidgetCommandExecutionWorker.o();
            }
        });
        this.vehicleRepository = m.b(new a() { // from class: te0.e
            @Override // wn0.a
            public final Object invoke() {
                return WidgetCommandExecutionWorker.n();
            }
        });
        this.vehicleCommandMarker = m.b(new a() { // from class: te0.f
            @Override // wn0.a
            public final Object invoke() {
                return WidgetCommandExecutionWorker.m();
            }
        });
        this.disabledCommandsByLocationRestriction = d1.e(ne0.c.SUMMON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ne0.b j() {
        return (ne0.b) this.vehicleCommandMarker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e k() {
        return (e) this.vehicleRepository.getValue();
    }

    private final me0.s l() {
        return (me0.s) this.widgetBuilder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ne0.b m() {
        return qe0.c.f105355a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e n() {
        return qe0.c.f105355a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final me0.s o() {
        return qe0.c.f105355a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g p() {
        return me0.c.a().p("WidgetCommandWorker");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0165  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x0201  */
    /* JADX WARN: Code duplicated, block: B:61:0x0204  */
    /* JADX WARN: Code duplicated, block: B:63:0x0229  */
    /* JADX WARN: Code duplicated, block: B:66:0x0264 A[LOOP:0: B:64:0x025e->B:66:0x0264, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x0165, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0229, please report this as an issue */
    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super y.a> continuation) throws Throwable {
        b bVar;
        int iF;
        ne0.c cVarE;
        String str;
        WidgetCommandExecutionWorker widgetCommandExecutionWorker;
        xc0.a aVar;
        ic0.e eVarB;
        int i11;
        ne0.c cVar;
        WidgetCommandExecutionWorker widgetCommandExecutionWorker2;
        ic0.g gVar;
        me0.b bVar2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f56618u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f56618u = i12 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithContext = bVar.f56616s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bVar.f56618u;
        try {
            if (i13 == 0) {
                t.b(objWithContext);
                iF = getInputData().f("app_widget_id", 0);
                String strI = getInputData().i("command");
                cVarE = strI != null ? ne0.d.e(strI) : null;
                String strI2 = getInputData().i("vin");
                if (iF != 0 && cVarE != null && strI2 != null) {
                    INSTANCE.c().j(" Start executing command: " + cVarE + "  for vehicle " + strI2);
                    if (j().b(strI2, cVarE)) {
                        y.a aVarE = y.a.e();
                        s.j(aVarE, "success(...)");
                        return aVarE;
                    }
                    ne0.b bVarJ = j();
                    bVar.f56611n = this;
                    bVar.f56612o = cVarE;
                    bVar.f56613p = strI2;
                    bVar.f56615r = iF;
                    bVar.f56618u = 1;
                    if (bVarJ.a(strI2, cVarE, bVar) != coroutine_suspended) {
                        str = strI2;
                        widgetCommandExecutionWorker = this;
                    }
                    return coroutine_suspended;
                }
                g gVarC = INSTANCE.c();
                String str2 = "appWidget-id: " + iF + " or command: " + cVarE + " is null or vin : " + strI2 + " is null";
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVarC.getTag();
                String strG = gVarC.g(str2);
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF = v0.f(x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                y.a aVarA = y.a.a();
                s.j(aVarA, "failure(...)");
                return aVarA;
            }
            if (i13 == 1) {
                iF = bVar.f56615r;
                str = (String) bVar.f56613p;
                cVarE = (ne0.c) bVar.f56612o;
                widgetCommandExecutionWorker = (WidgetCommandExecutionWorker) bVar.f56611n;
                t.b(objWithContext);
            } else {
                if (i13 == 2) {
                    iF = bVar.f56615r;
                    str = (String) bVar.f56613p;
                    cVarE = (ne0.c) bVar.f56612o;
                    widgetCommandExecutionWorker = (WidgetCommandExecutionWorker) bVar.f56611n;
                    t.b(objWithContext);
                    aVar = (xc0.a) objWithContext;
                    if (!aVar.getHide_private() && widgetCommandExecutionWorker.disabledCommandsByLocationRestriction.contains(cVarE)) {
                        INSTANCE.c().j("unable to execute summon caused by location restricted");
                        y.a aVarA2 = y.a.a();
                        s.j(aVarA2, "failure(...)");
                        return aVarA2;
                    }
                    eVarB = ne0.d.b(cVarE, aVar);
                    if (eVarB != null) {
                        INSTANCE.c().j("Executing  command: " + cVarE + " natively");
                        bVar.f56611n = widgetCommandExecutionWorker;
                        bVar.f56612o = cVarE;
                        bVar.f56613p = str;
                        bVar.f56614q = eVarB;
                        bVar.f56615r = iF;
                        bVar.f56618u = 3;
                        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(bVar));
                        eb0.f.Companion companion = eb0.f.INSTANCE;
                        Context applicationContext = widgetCommandExecutionWorker.getApplicationContext();
                        s.j(applicationContext, "getApplicationContext(...)");
                        companion.a(applicationContext).a(eVarB, widgetCommandExecutionWorker.new c(str, cVarE, safeContinuation));
                        objWithContext = safeContinuation.getOrThrow();
                        if (objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(bVar);
                        }
                        if (objWithContext != coroutine_suspended) {
                            ne0.c cVar2 = cVarE;
                            i11 = iF;
                            cVar = cVar2;
                            widgetCommandExecutionWorker2 = widgetCommandExecutionWorker;
                        }
                        return coroutine_suspended;
                    }
                    g gVarA = me0.c.a();
                    TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                    String tag2 = gVarA.getTag();
                    String strG2 = gVarA.g("Fail to generate native command for command :" + cVarE);
                    zb0.a aVar3 = zb0.a.f128044a;
                    Map mapF2 = v0.f(x.a(tag2, strG2));
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry2 : mapF2.entrySet()) {
                        zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    firebaseCrashlytics2.recordException(new Exception(strG2));
                    TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                    vr0.a.INSTANCE.a(strG2, new Object[0]);
                    y.a aVarE2 = y.a.e();
                    s.j(aVarE2, "success(...)");
                    return aVarE2;
                }
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = bVar.f56615r;
                cVar = (ne0.c) bVar.f56612o;
                widgetCommandExecutionWorker2 = (WidgetCommandExecutionWorker) bVar.f56611n;
                t.b(objWithContext);
                i11 = i14;
            }
            gVar = (ic0.g) objWithContext;
            INSTANCE.c().j("Command: " + cVar + " execution result:" + gVar + "!");
            me0.s sVarL = widgetCommandExecutionWorker2.l();
            Context applicationContext2 = widgetCommandExecutionWorker2.getApplicationContext();
            s.j(applicationContext2, "getApplicationContext(...)");
            a0 a0Var = a0.NORMAL;
            if (nb0.b.c(gVar)) {
                bVar2 = me0.b.SUCCESS;
            } else {
                bVar2 = me0.b.FAIL;
            }
            sVarL.q(applicationContext2, new WidgetBuilderConfig(i11, a0Var, true, bVar2));
            te0.b bVar3 = te0.b.f113254a;
            Context applicationContext3 = widgetCommandExecutionWorker2.getApplicationContext();
            s.j(applicationContext3, "getApplicationContext(...)");
            te0.b.k(bVar3, i11, applicationContext3, a0Var, null, Boxing.boxLong(3000L), false, 40, null);
            y.a aVarE3 = y.a.e();
            s.j(aVarE3, "success(...)");
            return aVarE3;
            me0.s sVarL2 = widgetCommandExecutionWorker.l();
            Context applicationContext4 = widgetCommandExecutionWorker.getApplicationContext();
            s.j(applicationContext4, "getApplicationContext(...)");
            sVarL2.q(applicationContext4, new WidgetBuilderConfig(iF, a0.NORMAL, true, me0.b.EXECUTING));
            INSTANCE.c().j("Updating current widget");
            CoroutineDispatcher io2 = Dispatchers.getIO();
            d dVar = widgetCommandExecutionWorker.new d(str, null);
            bVar.f56611n = widgetCommandExecutionWorker;
            bVar.f56612o = cVarE;
            bVar.f56613p = str;
            bVar.f56615r = iF;
            bVar.f56618u = 2;
            objWithContext = BuildersKt.withContext(io2, dVar, bVar);
            if (objWithContext != coroutine_suspended) {
                aVar = (xc0.a) objWithContext;
                if (!aVar.getHide_private()) {
                }
                eVarB = ne0.d.b(cVarE, aVar);
                if (eVarB != null) {
                    INSTANCE.c().j("Executing  command: " + cVarE + " natively");
                    bVar.f56611n = widgetCommandExecutionWorker;
                    bVar.f56612o = cVarE;
                    bVar.f56613p = str;
                    bVar.f56614q = eVarB;
                    bVar.f56615r = iF;
                    bVar.f56618u = 3;
                    SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(bVar));
                    eb0.f.Companion companion2 = eb0.f.INSTANCE;
                    Context applicationContext5 = widgetCommandExecutionWorker.getApplicationContext();
                    s.j(applicationContext5, "getApplicationContext(...)");
                    companion2.a(applicationContext5).a(eVarB, widgetCommandExecutionWorker.new c(str, cVarE, safeContinuation2));
                    objWithContext = safeContinuation2.getOrThrow();
                    if (objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(bVar);
                    }
                    if (objWithContext != coroutine_suspended) {
                        ne0.c cVar3 = cVarE;
                        i11 = iF;
                        cVar = cVar3;
                        widgetCommandExecutionWorker2 = widgetCommandExecutionWorker;
                        gVar = (ic0.g) objWithContext;
                        INSTANCE.c().j("Command: " + cVar + " execution result:" + gVar + "!");
                        me0.s sVarL3 = widgetCommandExecutionWorker2.l();
                        Context applicationContext6 = widgetCommandExecutionWorker2.getApplicationContext();
                        s.j(applicationContext6, "getApplicationContext(...)");
                        a0 a0Var2 = a0.NORMAL;
                        if (nb0.b.c(gVar)) {
                            bVar2 = me0.b.SUCCESS;
                        } else {
                            bVar2 = me0.b.FAIL;
                        }
                        sVarL3.q(applicationContext6, new WidgetBuilderConfig(i11, a0Var2, true, bVar2));
                        te0.b bVar4 = te0.b.f113254a;
                        Context applicationContext7 = widgetCommandExecutionWorker2.getApplicationContext();
                        s.j(applicationContext7, "getApplicationContext(...)");
                        te0.b.k(bVar4, i11, applicationContext7, a0Var2, null, Boxing.boxLong(3000L), false, 40, null);
                    }
                } else {
                    g gVarA2 = me0.c.a();
                    TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                    String tag3 = gVarA2.getTag();
                    String strG3 = gVarA2.g("Fail to generate native command for command :" + cVarE);
                    zb0.a aVar4 = zb0.a.f128044a;
                    Map mapF3 = v0.f(x.a(tag3, strG3));
                    FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                    while (r2.hasNext()) {
                        zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    firebaseCrashlytics3.recordException(new Exception(strG3));
                    TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                    vr0.a.INSTANCE.a(strG3, new Object[0]);
                }
                y.a aVarE4 = y.a.e();
                s.j(aVarE4, "success(...)");
                return aVarE4;
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            INSTANCE.c().d("unable to get vehicle from repository, couldn't do the command", e11);
            y.a aVarA3 = y.a.a();
            s.j(aVarA3, "failure(...)");
            return aVarA3;
        }
    }
}
