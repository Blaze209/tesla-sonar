package com.tesla.command;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.r;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c0;
import androidx.work.y;
import bc0.a;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.command.ExecuteCommandWorker;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import ic0.e;
import ic0.h;
import java.util.Map;
import jn0.h0;
import jn0.m;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nd0.k;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wb.f;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/tesla/command/ExecuteCommandWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/core/app/r;", "c", "Lkotlin/Lazy;", "e", "()Landroidx/core/app/r;", "notificationManager", DateTokenConverter.CONVERTER_KEY, "a", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExecuteCommandWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f55743e = g.INSTANCE.a("ExecuteCommandWorker");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy notificationManager;

    /* JADX INFO: renamed from: com.tesla.command.ExecuteCommandWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/tesla/command/ExecuteCommandWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lic0/e;", "request", "Ljn0/h0;", "a", "(Landroid/content/Context;Lic0/e;)V", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "KEY_COMMAND_REQUEST", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, e request) {
            s.k(context, "context");
            s.k(request, "request");
            try {
                f fVarH = f.h(context);
                c0.a aVar = new c0.a(ExecuteCommandWorker.class);
                Pair[] pairArr = {x.a("Key:CommandRequest", ce0.c.a(request))};
                androidx.work.g.a aVar2 = new androidx.work.g.a();
                Pair pair = pairArr[0];
                aVar2.b((String) pair.e(), pair.f());
                fVarH.d(aVar.n(aVar2.a()).b());
            } catch (Exception e11) {
                ExecuteCommandWorker.f55743e.d("Failed to schedule execute command worker", e11);
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.command.ExecuteCommandWorker", f = "ExecuteCommandWorker.kt", i = {0, 1, 1}, l = {42, 60}, m = "doWork", n = {"this", "this", "request"}, s = {"L$0", "L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f55745n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f55746o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f55747p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f55749r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f55747p = obj;
            this.f55749r |= Integer.MIN_VALUE;
            return ExecuteCommandWorker.this.doWork(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements ce0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<y.a> f55750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecuteCommandWorker f55751b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Continuation<? super y.a> continuation, ExecuteCommandWorker executeCommandWorker) {
            this.f55750a = continuation;
            this.f55751b = executeCommandWorker;
        }

        @Override // ce0.d
        public final void a(ic0.g response) {
            s.k(response, "response");
            if (response.getResult() == h.RESULT_SUCCESS) {
                Continuation<y.a> continuation = this.f55750a;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                continuation.resumeWith(jn0.s.b(y.a.e()));
                return;
            }
            Context applicationContext = this.f55751b.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            Notification notificationC = k.INSTANCE.b(this.f55751b.getApplicationContext()).m(this.f55751b.getApplicationContext().getString(a.I0)).l(this.f55751b.getApplicationContext().getString(a.H0)).k(PendingIntent.getActivity(this.f55751b.getApplicationContext(), 0, ie0.a.a(applicationContext), 201326592)).c();
            s.j(notificationC, "build(...)");
            this.f55751b.e().g(zn0.c.INSTANCE.c(), notificationC);
            Continuation<y.a> continuation2 = this.f55750a;
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            continuation2.resumeWith(jn0.s.b(y.a.a()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lic0/e;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lic0/e;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.command.ExecuteCommandWorker$doWork$request$1", f = "ExecuteCommandWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super e>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55752n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return ExecuteCommandWorker.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f55752n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            String strI = ExecuteCommandWorker.this.getInputData().i("Key:CommandRequest");
            if (strI != null) {
                return ce0.b.f19104a.a(strI);
            }
            return null;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super e> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteCommandWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        s.k(context, "context");
        s.k(parameters, "parameters");
        this.notificationManager = m.b(new wn0.a() { // from class: bb0.c
            @Override // wn0.a
            public final Object invoke() {
                return ExecuteCommandWorker.f(this.f16949a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r e() {
        return (r) this.notificationManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r f(ExecuteCommandWorker executeCommandWorker) {
        return r.e(executeCommandWorker.getApplicationContext());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super y.a> continuation) throws Throwable {
        b bVar;
        ExecuteCommandWorker executeCommandWorker;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f55749r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f55749r = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithContext = bVar.f55747p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f55749r;
        try {
            if (i12 == 0) {
                t.b(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                d dVar = new d(null);
                bVar.f55745n = this;
                bVar.f55749r = 1;
                objWithContext = BuildersKt.withContext(io2, dVar, bVar);
                if (objWithContext != coroutine_suspended) {
                    executeCommandWorker = this;
                }
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(objWithContext);
                return objWithContext;
            }
            executeCommandWorker = (ExecuteCommandWorker) bVar.f55745n;
            t.b(objWithContext);
            e eVar = (e) objWithContext;
            if (eVar != null) {
                bVar.f55745n = executeCommandWorker;
                bVar.f55746o = eVar;
                bVar.f55749r = 2;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(bVar));
                eb0.f.Companion companion = eb0.f.INSTANCE;
                Context applicationContext = executeCommandWorker.getApplicationContext();
                s.j(applicationContext, "getApplicationContext(...)");
                companion.a(applicationContext).a(eVar, new c(safeContinuation, executeCommandWorker));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(bVar);
                }
                return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
            }
            g gVar = f55743e;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Input request was null");
            zb0.a aVar = zb0.a.f128044a;
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
        } catch (Exception e11) {
            f55743e.d("Exception decoding command request!", e11);
            y.a aVarA2 = y.a.a();
            s.j(aVarA2, "failure(...)");
            return aVarA2;
        }
    }
}
