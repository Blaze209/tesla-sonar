package jf0;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ie0.b0;
import ie0.e0;
import io.reactivex.rxjava3.core.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.AbstractCoroutineContextElement;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import td0.m;
import v5.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#¨\u0006%"}, d2 = {"Ljf0/g;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)V", "h", "Ljava/lang/Runnable;", "bleCallback", "g", "(Landroid/content/Context;Ljava/lang/Runnable;)V", "Lkotlinx/coroutines/CoroutineScope;", "f", "()Lkotlinx/coroutines/CoroutineScope;", "Lwm0/e;", "", "b", "Lwm0/e;", "DISTINCT_UWB_CLIENT_AVAILABLE", "Lcom/tesla/logging/g;", "c", "Lcom/tesla/logging/g;", "logger", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "e", "Ljava/util/concurrent/ExecutorService;", "executor", "", "Z", "hadUpdateUwbAvailable", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f83680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final wm0.e<String> DISTINCT_UWB_CLIENT_AVAILABLE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ExecutorService executor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static boolean hadUpdateUwbAvailable;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "Ljn0/h0;", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            g.logger.j("Exception in Coroutine, " + exception);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f83686a;

        b(Context context) {
            this.f83686a = context;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Long it) {
            s.k(it, "it");
            g.logger.j("refresh subscriber");
            g.f83680a.h(this.f83686a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f83687a;

        c(Runnable runnable) {
            this.f83687a = runnable;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(String it) {
            s.k(it, "it");
            this.f83687a.run();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"jf0/g$d", "Lie0/b0;", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements b0 {
        d() {
        }

        @Override // ie0.b0
        public void a(String key, String value) {
            s.k(key, "key");
            s.k(value, "value");
            g.DISTINCT_UWB_CLIENT_AVAILABLE.onNext(value);
        }

        @Override // ie0.b0
        public void b(String str) {
            b0.a.a(this, str);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f83688a;

        e(Context context) {
            this.f83688a = context;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(h0 it) {
            s.k(it, "it");
            g.logger.j("airplane mode change, registerToClient again since uwbClient may hibernate before");
            g.f83680a.h(this.f83688a);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"jf0/g$f", "Lv5/g;", "", "isAvailable", "", AnalyticsAttribute.Reason, "Ljn0/h0;", "onUwbStateChanged", "(ZI)V", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements v5.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f83689a;

        f(Context context) {
            this.f83689a = context;
        }

        @Override // v5.g
        public void onUwbStateChanged(boolean isAvailable, int reason) {
            g.i(this.f83689a);
        }
    }

    /* JADX INFO: renamed from: jf0.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.uwb.capability.UwbProvider$updateUwbAvailable$1", f = "UwbProvider.kt", i = {1}, l = {41, 48}, m = "invokeSuspend", n = {"beforeTime"}, s = {"J$0"})
    static final class C1765g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f83690n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f83691o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f83692p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1765g(Context context, Continuation<? super C1765g> continuation) {
            super(2, continuation);
            this.f83692p = context;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C1765g(this.f83692p, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005f  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(4000, r6) == r0) goto L20;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f83691o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                long r0 = r6.f83690n
                jn0.t.b(r7)
                goto L60
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                jn0.t.b(r7)
                goto L3c
            L20:
                jn0.t.b(r7)
                android.content.Context r7 = r6.f83692p
                boolean r7 = jf0.f.a(r7)
                if (r7 != 0) goto L3f
                boolean r7 = jf0.g.b()
                if (r7 != 0) goto L3f
                r6.f83691o = r3
                r4 = 4000(0xfa0, double:1.9763E-320)
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r7 != r0) goto L3c
                goto L5e
            L3c:
                jf0.g.e(r3)
            L3f:
                long r3 = android.os.SystemClock.elapsedRealtime()
                com.tesla.logging.g r7 = jf0.g.c()
                java.lang.String r1 = "[Prepare] checkUWBClientAvailability"
                r7.j(r1)
                jf0.c$a r7 = jf0.c.INSTANCE
                android.content.Context r1 = r6.f83692p
                v5.l r7 = r7.a(r1)
                r6.f83690n = r3
                r6.f83691o = r2
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L5f
            L5e:
                return r0
            L5f:
                r0 = r3
            L60:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                td0.m r2 = td0.m.j()
                java.lang.String r3 = "UWB_CLIENT_AVAILABLE"
                java.lang.String r4 = java.lang.String.valueOf(r7)
                r2.u(r3, r4)
                long r2 = android.os.SystemClock.elapsedRealtime()
                com.tesla.logging.g r4 = jf0.g.c()
                long r2 = r2 - r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[Passed] checkUWBClientAvailability result: "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = ", time cost: "
                r0.append(r7)
                r0.append(r2)
                java.lang.String r7 = r0.toString()
                r4.j(r7)
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: jf0.g.C1765g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1765g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    static {
        g gVar = new g();
        f83680a = gVar;
        wm0.e eVarB0 = wm0.a.d0().b0();
        s.j(eVarB0, "toSerialized(...)");
        DISTINCT_UWB_CLIENT_AVAILABLE = eVarB0;
        logger = com.tesla.logging.g.INSTANCE.a("UwbProvider");
        coroutineScope = gVar.f();
        executor = Executors.newSingleThreadExecutor();
    }

    private g() {
    }

    private final CoroutineScope f() {
        return CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new a(CoroutineExceptionHandler.INSTANCE)));
    }

    @SuppressLint({"CheckResult"})
    public static final void g(Context context, Runnable bleCallback) {
        s.k(context, "context");
        s.k(bleCallback, "bleCallback");
        if (!e0.e(context)) {
            throw new RuntimeException("UwbProvider should initialize in BLE process");
        }
        f83680a.h(context);
        s.j(ie0.c.f77575a.d().N(new e(context)), "subscribe(...)");
        o.B(5L, TimeUnit.MINUTES).N(new b(context));
        DISTINCT_UWB_CLIENT_AVAILABLE.j().N(new c(bleCallback));
        m.j().q("UWB_CLIENT_AVAILABLE", new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Context context) {
        if (!jf0.f.a(context)) {
            i(context);
            return;
        }
        l lVarA = jf0.c.INSTANCE.a(context);
        lVarA.d();
        ExecutorService executor2 = executor;
        s.j(executor2, "executor");
        lVarA.a(executor2, new f(context));
    }

    public static final void i(Context context) {
        s.k(context, "context");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1765g(context, null), 3, null);
    }
}
