package nf0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.plaid.internal.EnumC4419g;
import com.tesla.logging.TeslaLog;
import ie0.c0;
import ie0.q0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import mf0.h;
import mf0.i;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import v5.UwbComplexChannel;
import v5.j;
import v5.k;
import vc0.p2;
import vc0.s0;
import vc0.t0;
import vc0.u0;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J*\u0010#\u001a\u00020\f*\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\"0!2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R0\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b(\u00108\"\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010E\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150A\u0012\u0006\u0012\u0004\u0018\u00010B0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lnf0/f;", "Lnf0/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "vin", "Ljava/lang/Runnable;", "makeSureForeground", "Lmf0/i;", "connector", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Runnable;Lmf0/i;)V", "Ljn0/h0;", "r", "()V", "Lkotlinx/coroutines/channels/ProducerScope;", "Lof0/a;", "", "sessionId", "Lvc0/u0;", "request", "Lv5/j;", "sessionScope", "Lnf0/e;", "o", "(Lkotlinx/coroutines/channels/ProducerScope;ILvc0/u0;Lv5/j;)Lnf0/e;", "Lv5/e;", "result", "q", "(Lkotlinx/coroutines/channels/ProducerScope;ILv5/e;)V", "", "s", "(Lvc0/u0;)Z", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/Job;", "p", "(Ljava/util/concurrent/ConcurrentHashMap;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "b", "()Lkotlinx/coroutines/flow/Flow;", "a", "Landroid/content/Context;", "Ljava/lang/String;", "c", "Ljava/lang/Runnable;", DateTokenConverter.CONVERTER_KEY, "Lmf0/i;", "Lcom/tesla/logging/g;", "e", "Lcom/tesla/logging/g;", "logger", "f", "Lkotlinx/coroutines/Job;", "bleConnectionJob", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "()Ljava/util/concurrent/ConcurrentHashMap;", "setSessionJobMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "sessionJobMap", "Lkotlinx/coroutines/sync/Mutex;", "h", "Lkotlinx/coroutines/sync/Mutex;", "sessionMutex", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", IntegerTokenConverter.CONVERTER_KEY, "Lwn0/l;", "sessionScopeCreator", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements nf0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String vin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Runnable makeSureForeground;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private i connector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Job bleConnectionJob;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ConcurrentHashMap<Integer, Job> sessionJobMap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Mutex sessionMutex;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final l<Continuation<? super j>, Object> sessionScopeCreator;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94938a;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.PROVISIONED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.PROVISIONED_INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94938a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.teslamotors.plugins.uwb.ranging.UwbSessionScopeManager", f = "UwbSessionScopeManager.kt", i = {0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE}, m = "cancelSessionAndRemoveIfNeeded", n = {"this", "$this$cancelSessionAndRemoveIfNeeded", "sessionId"}, s = {"L$0", "L$1", "I$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f94939n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f94940o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f94941p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f94942q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f94943r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f94945t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94943r = obj;
            this.f94945t |= Integer.MIN_VALUE;
            return f.this.p(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lof0/a;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.uwb.ranging.UwbSessionScopeManager$prepare$1", f = "UwbSessionScopeManager.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<ProducerScope<? super of0.a>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f94946n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f94947o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.teslamotors.plugins.uwb.ranging.UwbSessionScopeManager$prepare$1$1", f = "UwbSessionScopeManager.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f94949n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f94950o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ f f94951p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ ProducerScope<of0.a> f94952q;

            /* JADX INFO: renamed from: nf0.f$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Llf0/b;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "com.teslamotors.plugins.uwb.ranging.UwbSessionScopeManager$prepare$1$1$1", f = "UwbSessionScopeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C2018a extends SuspendLambda implements q<FlowCollector<? super lf0.b>, Throwable, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f94953n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f94954o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ f f94955p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2018a(f fVar, Continuation<? super C2018a> continuation) {
                    super(3, continuation);
                    this.f94955p = fVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f94953n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    Throwable th2 = (Throwable) this.f94954o;
                    com.tesla.logging.g gVar = this.f94955p.logger;
                    String strValueOf = String.valueOf(th2.getMessage());
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g(strValueOf);
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = v0.f(x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                    return h0.f84049a;
                }

                @Override // wn0.q
                public final Object invoke(FlowCollector<? super lf0.b> flowCollector, Throwable th2, Continuation<? super h0> continuation) {
                    C2018a c2018a = new C2018a(this.f94955p, continuation);
                    c2018a.f94954o = th2;
                    return c2018a.invokeSuspend(h0.f84049a);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class b<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f f94956a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ CoroutineScope f94957b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ProducerScope<of0.a> f94958c;

                /* JADX INFO: renamed from: nf0.f$c$a$b$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
                @DebugMetadata(c = "com.teslamotors.plugins.uwb.ranging.UwbSessionScopeManager$prepare$1$1$2$1$1$4$1", f = "UwbSessionScopeManager.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
                static final class C2019a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f94959n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    final /* synthetic */ UwbSessionResult f94960o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    final /* synthetic */ f f94961p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ int f94962q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ ProducerScope<of0.a> f94963r;

                    /* JADX INFO: renamed from: nf0.f$c$a$b$a$a, reason: collision with other inner class name */
                    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lv5/e;", "", "throwable", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
                    @DebugMetadata(c = "com.teslamotors.plugins.uwb.ranging.UwbSessionScopeManager$prepare$1$1$2$1$1$4$1$1$1", f = "UwbSessionScopeManager.kt", i = {0, 0, 1, 1}, l = {343, 98}, m = "invokeSuspend", n = {"throwable", "$this$withLock_u24default$iv", "throwable", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
                    static final class C2020a extends SuspendLambda implements q<FlowCollector<? super v5.e>, Throwable, Continuation<? super h0>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        Object f94964n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        Object f94965o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        int f94966p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        int f94967q;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        /* synthetic */ Object f94968r;

                        /* JADX INFO: renamed from: s, reason: collision with root package name */
                        final /* synthetic */ f f94969s;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ int f94970t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C2020a(f fVar, int i11, Continuation<? super C2020a> continuation) {
                            super(3, continuation);
                            this.f94969s = fVar;
                            this.f94970t = i11;
                        }

                        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Throwable th2;
                            Mutex mutex;
                            int i11;
                            f fVar;
                            Mutex mutex2;
                            Throwable th3;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = this.f94967q;
                            try {
                                if (i12 == 0) {
                                    t.b(obj);
                                    th2 = (Throwable) this.f94968r;
                                    com.tesla.logging.g gVar = this.f94969s.logger;
                                    String str = "sessionId " + this.f94970t + ", ranging session error: " + th2.getMessage();
                                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                                    String tag = gVar.getTag();
                                    String strG = gVar.g(str);
                                    zb0.a aVar = zb0.a.f128044a;
                                    Map mapF = v0.f(x.a(tag, strG));
                                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                    for (Map.Entry entry : mapF.entrySet()) {
                                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    firebaseCrashlytics.recordException(new Exception(strG));
                                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                                    vr0.a.INSTANCE.a(strG, new Object[0]);
                                    mutex = this.f94969s.sessionMutex;
                                    f fVar2 = this.f94969s;
                                    i11 = this.f94970t;
                                    this.f94968r = th2;
                                    this.f94964n = mutex;
                                    this.f94965o = fVar2;
                                    this.f94966p = i11;
                                    this.f94967q = 1;
                                    if (mutex.lock(null, this) != coroutine_suspended) {
                                        fVar = fVar2;
                                    }
                                    return coroutine_suspended;
                                }
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    mutex2 = (Mutex) this.f94964n;
                                    th3 = (Throwable) this.f94968r;
                                    try {
                                        t.b(obj);
                                        h0 h0Var = h0.f84049a;
                                        mutex2.unlock(null);
                                        this.f94969s.connector.e(this.f94970t, th3);
                                        return h0.f84049a;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mutex2.unlock(null);
                                        throw th;
                                    }
                                }
                                int i13 = this.f94966p;
                                fVar = (f) this.f94965o;
                                Mutex mutex3 = (Mutex) this.f94964n;
                                Throwable th5 = (Throwable) this.f94968r;
                                t.b(obj);
                                th2 = th5;
                                i11 = i13;
                                mutex = mutex3;
                                ConcurrentHashMap<Integer, Job> concurrentHashMapA = fVar.a();
                                this.f94968r = th2;
                                this.f94964n = mutex;
                                this.f94965o = null;
                                this.f94967q = 2;
                                if (fVar.p(concurrentHashMapA, i11, this) != coroutine_suspended) {
                                    mutex2 = mutex;
                                    th3 = th2;
                                    h0 h0Var2 = h0.f84049a;
                                    mutex2.unlock(null);
                                    this.f94969s.connector.e(this.f94970t, th3);
                                    return h0.f84049a;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th6) {
                                th = th6;
                                mutex2 = mutex;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }

                        @Override // wn0.q
                        public final Object invoke(FlowCollector<? super v5.e> flowCollector, Throwable th2, Continuation<? super h0> continuation) {
                            C2020a c2020a = new C2020a(this.f94969s, this.f94970t, continuation);
                            c2020a.f94968r = th2;
                            return c2020a.invokeSuspend(h0.f84049a);
                        }
                    }

                    /* JADX INFO: renamed from: nf0.f$c$a$b$a$b, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    static final class C2021b<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        final /* synthetic */ f f94971a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        final /* synthetic */ ProducerScope<of0.a> f94972b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ int f94973c;

                        /* JADX WARN: Multi-variable type inference failed */
                        C2021b(f fVar, ProducerScope<? super of0.a> producerScope, int i11) {
                            this.f94971a = fVar;
                            this.f94972b = producerScope;
                            this.f94973c = i11;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object emit(v5.e eVar, Continuation<? super h0> continuation) {
                            this.f94971a.q(this.f94972b, this.f94973c, eVar);
                            return h0.f84049a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2019a(UwbSessionResult uwbSessionResult, f fVar, int i11, ProducerScope<? super of0.a> producerScope, Continuation<? super C2019a> continuation) {
                        super(2, continuation);
                        this.f94960o = uwbSessionResult;
                        this.f94961p = fVar;
                        this.f94962q = i11;
                        this.f94963r = producerScope;
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                        return new C2019a(this.f94960o, this.f94961p, this.f94962q, this.f94963r, continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i11 = this.f94959n;
                        if (i11 == 0) {
                            t.b(obj);
                            Flow<v5.e> flowB = this.f94960o.b();
                            if (flowB != null) {
                                f fVar = this.f94961p;
                                int i12 = this.f94962q;
                                ProducerScope<of0.a> producerScope = this.f94963r;
                                Flow flowM548catch = FlowKt.m548catch(flowB, new C2020a(fVar, i12, null));
                                C2021b c2021b = new C2021b(fVar, producerScope, i12);
                                this.f94959n = 1;
                                if (flowM548catch.collect(c2021b, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t.b(obj);
                        }
                        return h0.f84049a;
                    }

                    @Override // wn0.p
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                        return ((C2019a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                    }
                }

                /* JADX INFO: renamed from: nf0.f$c$a$b$b, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.teslamotors.plugins.uwb.ranging.UwbSessionScopeManager$prepare$1$1$2", f = "UwbSessionScopeManager.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5, 6, 6, 6}, l = {330, 73, 76, 343, 111, 356, 117}, m = "emit", n = {"event", "$this$withLock_u24default$iv", "index$iv", "sessionId", "index", "event", "$this$withLock_u24default$iv", "index$iv", "sessionId", "index", "event", "$this$withLock_u24default$iv", "index$iv", "sessionId", "index", "$this$withLock_u24default$iv", "id", "$this$withLock_u24default$iv", "this", "event", "$this$withLock_u24default$iv", "id", "this", "event", "$this$withLock_u24default$iv"}, s = {"L$0", "L$5", "I$0", "I$1", "I$2", "L$0", "L$5", "I$0", "I$1", "I$2", "L$0", "L$5", "I$0", "I$1", "I$2", "L$2", "I$0", "L$2", "L$0", "L$1", "L$4", "I$0", "L$0", "L$1", "L$4"})
                static final class C2022b extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f94974n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    Object f94975o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    Object f94976p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    Object f94977q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    Object f94978r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    Object f94979s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f94980t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    int f94981u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    int f94982v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    /* synthetic */ Object f94983w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    final /* synthetic */ b<T> f94984x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    int f94985y;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2022b(b<? super T> bVar, Continuation<? super C2022b> continuation) {
                        super(continuation);
                        this.f94984x = bVar;
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f94983w = obj;
                        this.f94985y |= Integer.MIN_VALUE;
                        return this.f94984x.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                b(f fVar, CoroutineScope coroutineScope, ProducerScope<? super of0.a> producerScope) {
                    this.f94956a = fVar;
                    this.f94957b = coroutineScope;
                    this.f94958c = producerScope;
                }

                /* JADX WARN: Code duplicated, block: B:31:0x00e8 A[PHI: r0 r5 r8 r9 r10 r11 r12 r13 r14
                  0x00e8: PHI (r0v14 int) = (r0v6 int), (r0v18 int) binds: [B:30:0x00e5, B:48:0x01cf] A[DONT_GENERATE, DONT_INLINE]
                  0x00e8: PHI (r5v13 int) = (r5v8 int), (r5v15 int) binds: [B:30:0x00e5, B:48:0x01cf] A[DONT_GENERATE, DONT_INLINE]
                  0x00e8: PHI (r8v9 int) = (r8v7 int), (r8v11 int) binds: [B:30:0x00e5, B:48:0x01cf] A[DONT_GENERATE, DONT_INLINE]
                  0x00e8: PHI (r9v10 kotlinx.coroutines.sync.Mutex) = (r9v5 kotlinx.coroutines.sync.Mutex), (r9v12 kotlinx.coroutines.sync.Mutex) binds: [B:30:0x00e5, B:48:0x01cf] A[DONT_GENERATE, DONT_INLINE]
                  0x00e8: PHI (r10v7 java.util.Iterator<T>) = (r10v5 java.util.Iterator<T>), (r10v9 java.util.Iterator<T>) binds: [B:30:0x00e5, B:48:0x01cf] A[DONT_GENERATE, DONT_INLINE]
                  0x00e8: PHI (r11v6 kotlinx.coroutines.channels.ProducerScope<of0.a>) = (r11v4 kotlinx.coroutines.channels.ProducerScope<of0.a>), (r11v8 kotlinx.coroutines.channels.ProducerScope<of0.a>) binds: [B:30:0x00e5, B:48:0x01cf] A[DONT_GENERATE, DONT_INLINE]
                  0x00e8: PHI (r12v6 kotlinx.coroutines.CoroutineScope) = (r12v4 kotlinx.coroutines.CoroutineScope), (r12v8 kotlinx.coroutines.CoroutineScope) binds: [B:30:0x00e5, B:48:0x01cf] A[DONT_GENERATE, DONT_INLINE]
                  0x00e8: PHI (r13v6 nf0.f) = (r13v4 nf0.f), (r13v8 nf0.f) binds: [B:30:0x00e5, B:48:0x01cf] A[DONT_GENERATE, DONT_INLINE]
                  0x00e8: PHI (r14v5 lf0.b) = (r14v3 lf0.b), (r14v7 lf0.b) binds: [B:30:0x00e5, B:48:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:40:0x017e  */
                /* JADX WARN: Code duplicated, block: B:42:0x0186  */
                /* JADX WARN: Code duplicated, block: B:46:0x01af  */
                /* JADX WARN: Code duplicated, block: B:52:0x01fb  */
                /* JADX WARN: Code duplicated, block: B:53:0x01fd A[Catch: all -> 0x00c4, PHI: r2 r5 r8 r9 r10 r11 r12 r13 r14 r15
                  0x01fd: PHI (r2v26 java.lang.Object) = (r2v20 java.lang.Object), (r2v1 java.lang.Object) binds: [B:51:0x01f9, B:25:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                  0x01fd: PHI (r5v28 int) = (r5v14 int), (r5v29 int) binds: [B:51:0x01f9, B:25:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                  0x01fd: PHI (r8v17 int) = (r8v10 int), (r8v18 int) binds: [B:51:0x01f9, B:25:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                  0x01fd: PHI (r9v20 int) = (r9v11 int), (r9v21 int) binds: [B:51:0x01f9, B:25:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                  0x01fd: PHI (r10v15 kotlinx.coroutines.sync.Mutex) = (r10v8 kotlinx.coroutines.sync.Mutex), (r10v17 kotlinx.coroutines.sync.Mutex) binds: [B:51:0x01f9, B:25:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                  0x01fd: PHI (r11v13 java.util.Iterator<T>) = (r11v7 java.util.Iterator<T>), (r11v15 java.util.Iterator<T>) binds: [B:51:0x01f9, B:25:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                  0x01fd: PHI (r12v12 kotlinx.coroutines.channels.ProducerScope<of0.a>) = (r12v7 kotlinx.coroutines.channels.ProducerScope<of0.a>), (r12v14 kotlinx.coroutines.channels.ProducerScope<of0.a>) binds: [B:51:0x01f9, B:25:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                  0x01fd: PHI (r13v14 kotlinx.coroutines.CoroutineScope) = (r13v7 kotlinx.coroutines.CoroutineScope), (r13v16 kotlinx.coroutines.CoroutineScope) binds: [B:51:0x01f9, B:25:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                  0x01fd: PHI (r14v12 nf0.f) = (r14v6 nf0.f), (r14v14 nf0.f) binds: [B:51:0x01f9, B:25:0x00bf] A[DONT_GENERATE, DONT_INLINE]
                  0x01fd: PHI (r15v4 lf0.b) = (r15v1 lf0.b), (r15v6 lf0.b) binds: [B:51:0x01f9, B:25:0x00bf] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x00c4, blocks: (B:25:0x00bf, B:53:0x01fd, B:50:0x01d3), top: B:132:0x00bf }] */
                /* JADX WARN: Code duplicated, block: B:59:0x021e A[Catch: all -> 0x0242, TryCatch #1 {all -> 0x0242, blocks: (B:57:0x0218, B:59:0x021e, B:63:0x0247, B:66:0x024e, B:68:0x0252, B:70:0x028d, B:72:0x0293, B:74:0x02a0, B:75:0x02f0), top: B:126:0x0218 }] */
                /* JADX WARN: Code duplicated, block: B:65:0x024d  */
                /* JADX WARN: Code duplicated, block: B:68:0x0252 A[Catch: all -> 0x0242, TryCatch #1 {all -> 0x0242, blocks: (B:57:0x0218, B:59:0x021e, B:63:0x0247, B:66:0x024e, B:68:0x0252, B:70:0x028d, B:72:0x0293, B:74:0x02a0, B:75:0x02f0), top: B:126:0x0218 }] */
                /* JADX WARN: Code duplicated, block: B:70:0x028d A[Catch: all -> 0x0242, TryCatch #1 {all -> 0x0242, blocks: (B:57:0x0218, B:59:0x021e, B:63:0x0247, B:66:0x024e, B:68:0x0252, B:70:0x028d, B:72:0x0293, B:74:0x02a0, B:75:0x02f0), top: B:126:0x0218 }] */
                /* JADX WARN: Code duplicated, block: B:72:0x0293 A[Catch: all -> 0x0242, TryCatch #1 {all -> 0x0242, blocks: (B:57:0x0218, B:59:0x021e, B:63:0x0247, B:66:0x024e, B:68:0x0252, B:70:0x028d, B:72:0x0293, B:74:0x02a0, B:75:0x02f0), top: B:126:0x0218 }] */
                /* JADX WARN: Code duplicated, block: B:73:0x029e  */
                /* JADX WARN: Code duplicated, block: B:74:0x02a0 A[Catch: all -> 0x0242, TryCatch #1 {all -> 0x0242, blocks: (B:57:0x0218, B:59:0x021e, B:63:0x0247, B:66:0x024e, B:68:0x0252, B:70:0x028d, B:72:0x0293, B:74:0x02a0, B:75:0x02f0), top: B:126:0x0218 }] */
                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x03cb -> B:136:0x03cc). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01f9 -> B:53:0x01fd). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0360 -> B:138:0x0361). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(lf0.b r25, p013kotlin.coroutines.Continuation<? super jn0.h0> r26) {
                    /*
                        Method dump skipped, instruction units count: 1026
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: nf0.f.c.a.b.emit(lf0.b, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f fVar, ProducerScope<? super of0.a> producerScope, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f94951p = fVar;
                this.f94952q = producerScope;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f94951p, this.f94952q, continuation);
                aVar.f94950o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f94949n;
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f94950o;
                    Flow flowM548catch = FlowKt.m548catch(this.f94951p.connector.f(), new C2018a(this.f94951p, null));
                    b bVar = new b(this.f94951p, coroutineScope, this.f94952q);
                    this.f94949n = 1;
                    if (flowM548catch.collect(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 b(f fVar) {
            fVar.r();
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = f.this.new c(continuation);
            cVar.f94947o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f94946n;
            if (i11 == 0) {
                t.b(obj);
                ProducerScope producerScope = (ProducerScope) this.f94947o;
                f.this.logger.j("preparing session events channel flow");
                f fVar = f.this;
                fVar.bleConnectionJob = BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new a(fVar, producerScope, null), 3, null);
                final f fVar2 = f.this;
                wn0.a aVar = new wn0.a() { // from class: nf0.g
                    @Override // wn0.a
                    public final Object invoke() {
                        return f.c.b(fVar2);
                    }
                };
                this.f94946n = 1;
                if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(ProducerScope<? super of0.a> producerScope, Continuation<? super h0> continuation) {
            return ((c) create(producerScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv5/j;", "<anonymous>", "()Lv5/j;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.uwb.ranging.UwbSessionScopeManager$sessionScopeCreator$1", f = "UwbSessionScopeManager.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements l<Continuation<? super j>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f94986n;

        d(Continuation<? super d> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return f.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f94986n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            v5.l lVarA = jf0.c.INSTANCE.a(f.this.context);
            this.f94986n = 1;
            Object objB = lVarA.b(this);
            return objB == coroutine_suspended ? coroutine_suspended : objB;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super j> continuation) {
            return ((d) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public f(Context context, String vin, Runnable makeSureForeground, i connector) {
        s.k(context, "context");
        s.k(vin, "vin");
        s.k(makeSureForeground, "makeSureForeground");
        s.k(connector, "connector");
        this.context = context;
        this.vin = vin;
        this.makeSureForeground = makeSureForeground;
        this.connector = connector;
        com.tesla.logging.g gVarP = com.tesla.logging.g.INSTANCE.a("Uwb").p("SessionScopeManager");
        String strF = q0.f(vin);
        s.j(strF, "obfuscateVIN(...)");
        this.logger = gVarP.o(strF);
        this.sessionJobMap = new ConcurrentHashMap<>();
        this.sessionMutex = MutexKt.Mutex$default(false, 1, null);
        this.sessionScopeCreator = new d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[LOOP:0: B:40:0x00d3->B:42:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0124  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01cb  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00d6, please report this as an issue */
    public final UwbSessionResult o(ProducerScope<? super of0.a> producerScope, int i11, u0 u0Var, j jVar) {
        int i12;
        int i13;
        boolean z11;
        byte[] bArrJ;
        int length;
        ArrayList arrayList;
        int i14;
        p2 rangingUpdateRate;
        UwbComplexChannel complexChannel;
        Integer numValueOf;
        UwbComplexChannel complexChannel2;
        Integer numValueOf2;
        if (!s(u0Var)) {
            return UwbSessionResult.INSTANCE.a(new kf0.a.C1836a(kf0.c.ERROR_ILLEGAL_ARGUMENT));
        }
        if (!c0.d(this.context)) {
            return UwbSessionResult.INSTANCE.a(new kf0.a.C1836a(kf0.c.ERROR_MISSING_PERMISSION_UWB_RANGING));
        }
        Set<Integer> setA = jVar.getRangingCapabilities().a();
        int i15 = a.f94938a[u0Var.getStsMode().ordinal()];
        if (i15 == 1) {
            i12 = setA.contains(2) ? 2 : 1;
        } else {
            if (i15 != 2) {
                if (i15 != 3) {
                    i13 = -1;
                } else {
                    i12 = 7;
                    if (!setA.contains(7)) {
                        i12 = -1;
                    }
                }
                if (i13 == -1) {
                    return UwbSessionResult.INSTANCE.a(new kf0.a.C1836a(kf0.c.ERROR_ILLEGAL_ARGUMENT));
                }
                if (u0Var.getSts().J().length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    this.logger.j("(old car fw <-> new app) Car generated sts but app rejected.");
                    return UwbSessionResult.INSTANCE.a(new kf0.a.C1836a(kf0.c.ERROR_ILLEGAL_ARGUMENT));
                }
                this.logger.j("(new car fw <-> new app) Car sends request without sts, app returns sts");
                byte[] bArrD = h.INSTANCE.d(u0Var.getStsMode());
                bArrJ = u0Var.getAddresses().J();
                length = bArrJ.length / 2;
                arrayList = new ArrayList();
                for (i14 = 0; i14 < length; i14++) {
                    int i16 = i14 * 2;
                    byte[] bArrI1 = n.i1(bArrJ, bo0.n.w(i16, i16 + 2));
                    this.logger.j("uwb address [" + i14 + "] : " + ie0.n.e(bArrI1, 0, 1, null));
                    arrayList.add(k.INSTANCE.a(bArrI1));
                }
                h.Companion companion = h.INSTANCE;
                int iB = companion.b();
                if (u0Var.getRangingUpdateRate() != p2.RANGING_UPDATE_RATE_UNKNOWN) {
                    rangingUpdateRate = u0Var.getRangingUpdateRate();
                } else {
                    rangingUpdateRate = p2.RANGING_UPDATE_RATE_FREQUENT;
                }
                UwbComplexChannel uwbComplexChannel = jVar.getUwbComplexChannel();
                int value = rangingUpdateRate.getValue();
                nf0.d.Companion companion2 = nf0.d.INSTANCE;
                v5.c cVar = new v5.c(i13, iB, 0, bArrD, null, uwbComplexChannel, arrayList, value, companion2.b(nf0.c.DISABLE), 2L, companion2.a(nf0.a.DISABLE));
                this.logger.j("config type: " + i13);
                this.logger.j("session id: " + i11);
                this.logger.j("firaSession id: " + iB);
                this.logger.j("sessionKeyInfo: " + ie0.n.e(bArrD, 0, 1, null));
                com.tesla.logging.g gVar = this.logger;
                complexChannel = cVar.getComplexChannel();
                if (complexChannel != null) {
                    numValueOf = Integer.valueOf(complexChannel.getChannel());
                } else {
                    numValueOf = null;
                }
                complexChannel2 = cVar.getComplexChannel();
                if (complexChannel2 != null) {
                    numValueOf2 = Integer.valueOf(complexChannel2.getPreambleIndex());
                } else {
                    numValueOf2 = null;
                }
                gVar.j("complexChannel: " + numValueOf + ", " + numValueOf2);
                this.logger.j("updateRateType: " + rangingUpdateRate.name());
                this.logger.j("intervalSkipCount: " + u0Var.getIntervalSkipCount());
                v5.f localAddress = jVar.getLocalAddress();
                int channel = jVar.getUwbComplexChannel().getChannel();
                int preambleIndex = jVar.getUwbComplexChannel().getPreambleIndex();
                this.logger.j("local uwb address: " + ie0.n.e(localAddress.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String(), 0, 1, null));
                String str = this.vin;
                okio.k.Companion companion3 = okio.k.INSTANCE;
                companion.a(str, i11, new t0(okio.k.Companion.i(companion3, localAddress.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String(), 0, 0, 3, null), preambleIndex, channel, iB, okio.k.Companion.i(companion3, bArrD, 0, 0, 3, null), null, 32, null));
                this.logger.j("attempt to prepare ranging session");
                producerScope.mo85trySendJP2dKIU(new of0.a.UwbEndpointFound(this.vin, i11));
                try {
                    Flow<v5.e> flowA = jVar.a(cVar);
                    this.logger.j("finish preparing ranging session");
                    return UwbSessionResult.INSTANCE.b(flowA);
                } catch (Exception e11) {
                    com.tesla.logging.g gVar2 = this.logger;
                    String str2 = "failed to prepare ranging session: " + e11.getMessage();
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar2.getTag();
                    String strG = gVar2.g(str2);
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = v0.f(x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                    return e11 instanceof ApiException ? UwbSessionResult.INSTANCE.a(new kf0.a.b(((ApiException) e11).getStatusCode())) : UwbSessionResult.INSTANCE.a(new kf0.a.C1836a(kf0.c.ERROR_UNKNOWN));
                }
            }
            i12 = 5;
            if (!setA.contains(5)) {
                i12 = 4;
            }
        }
        i13 = i12;
        if (i13 == -1) {
            return UwbSessionResult.INSTANCE.a(new kf0.a.C1836a(kf0.c.ERROR_ILLEGAL_ARGUMENT));
        }
        if (u0Var.getSts().J().length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.logger.j("(old car fw <-> new app) Car generated sts but app rejected.");
            return UwbSessionResult.INSTANCE.a(new kf0.a.C1836a(kf0.c.ERROR_ILLEGAL_ARGUMENT));
        }
        this.logger.j("(new car fw <-> new app) Car sends request without sts, app returns sts");
        byte[] bArrD2 = h.INSTANCE.d(u0Var.getStsMode());
        bArrJ = u0Var.getAddresses().J();
        length = bArrJ.length / 2;
        arrayList = new ArrayList();
        while (i14 < length) {
            int i17 = i14 * 2;
            byte[] bArrI2 = n.i1(bArrJ, bo0.n.w(i17, i17 + 2));
            this.logger.j("uwb address [" + i14 + "] : " + ie0.n.e(bArrI2, 0, 1, null));
            arrayList.add(k.INSTANCE.a(bArrI2));
        }
        h.Companion companion4 = h.INSTANCE;
        int iB2 = companion4.b();
        if (u0Var.getRangingUpdateRate() != p2.RANGING_UPDATE_RATE_UNKNOWN) {
            rangingUpdateRate = u0Var.getRangingUpdateRate();
        } else {
            rangingUpdateRate = p2.RANGING_UPDATE_RATE_FREQUENT;
        }
        UwbComplexChannel uwbComplexChannel2 = jVar.getUwbComplexChannel();
        int value2 = rangingUpdateRate.getValue();
        nf0.d.Companion companion5 = nf0.d.INSTANCE;
        v5.c cVar2 = new v5.c(i13, iB2, 0, bArrD2, null, uwbComplexChannel2, arrayList, value2, companion5.b(nf0.c.DISABLE), 2L, companion5.a(nf0.a.DISABLE));
        this.logger.j("config type: " + i13);
        this.logger.j("session id: " + i11);
        this.logger.j("firaSession id: " + iB2);
        this.logger.j("sessionKeyInfo: " + ie0.n.e(bArrD2, 0, 1, null));
        com.tesla.logging.g gVar3 = this.logger;
        complexChannel = cVar2.getComplexChannel();
        if (complexChannel != null) {
            numValueOf = Integer.valueOf(complexChannel.getChannel());
        } else {
            numValueOf = null;
        }
        complexChannel2 = cVar2.getComplexChannel();
        if (complexChannel2 != null) {
            numValueOf2 = Integer.valueOf(complexChannel2.getPreambleIndex());
        } else {
            numValueOf2 = null;
        }
        gVar3.j("complexChannel: " + numValueOf + ", " + numValueOf2);
        this.logger.j("updateRateType: " + rangingUpdateRate.name());
        this.logger.j("intervalSkipCount: " + u0Var.getIntervalSkipCount());
        v5.f localAddress2 = jVar.getLocalAddress();
        int channel2 = jVar.getUwbComplexChannel().getChannel();
        int preambleIndex2 = jVar.getUwbComplexChannel().getPreambleIndex();
        this.logger.j("local uwb address: " + ie0.n.e(localAddress2.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String(), 0, 1, null));
        String str3 = this.vin;
        okio.k.Companion companion6 = okio.k.INSTANCE;
        companion4.a(str3, i11, new t0(okio.k.Companion.i(companion6, localAddress2.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String(), 0, 0, 3, null), preambleIndex2, channel2, iB2, okio.k.Companion.i(companion6, bArrD2, 0, 0, 3, null), null, 32, null));
        this.logger.j("attempt to prepare ranging session");
        producerScope.mo85trySendJP2dKIU(new of0.a.UwbEndpointFound(this.vin, i11));
        Flow<v5.e> flowA2 = jVar.a(cVar2);
        this.logger.j("finish preparing ranging session");
        return UwbSessionResult.INSTANCE.b(flowA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(ConcurrentHashMap<Integer, Job> concurrentHashMap, int i11, Continuation<? super h0> continuation) {
        b bVar;
        f fVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f94945t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f94945t = i12 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f94943r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bVar.f94945t;
        if (i13 == 0) {
            t.b(obj);
            Job job = concurrentHashMap.get(Boxing.boxInt(i11));
            if (job != null) {
                if (job.isCompleted()) {
                    job = null;
                }
                if (job != null) {
                    bVar.f94939n = this;
                    bVar.f94940o = concurrentHashMap;
                    bVar.f94941p = job;
                    bVar.f94942q = i11;
                    bVar.f94945t = 1;
                    if (JobKt.cancelAndJoin(job, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fVar = this;
                }
            }
            concurrentHashMap.remove(Boxing.boxInt(i11));
            return h0.f84049a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = bVar.f94942q;
        concurrentHashMap = (ConcurrentHashMap) bVar.f94940o;
        fVar = (f) bVar.f94939n;
        t.b(obj);
        fVar.logger.j("cancelled a ranging session job");
        concurrentHashMap.remove(Boxing.boxInt(i11));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(ProducerScope<? super of0.a> producerScope, int i11, v5.e eVar) {
        if (eVar instanceof v5.e.c) {
            this.logger.a("[Ranging] ranging event: position updated");
            producerScope.mo85trySendJP2dKIU(new of0.a.PositionUpdated(this.vin, i11, ((v5.e.c) eVar).getPosition()));
        } else if (eVar instanceof v5.e.b) {
            this.logger.a("[Ranging] ranging event: disconnected");
            producerScope.mo85trySendJP2dKIU(new of0.a.UwbDisconnected(this.vin, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.logger.j("shutting down UwbSessionScope channel flow");
        Job job = this.bleConnectionJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.bleConnectionJob = null;
        for (Map.Entry<Integer, Job> entry : a().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Job value = entry.getValue();
            this.logger.j("stopping ranging session " + iIntValue);
            if (value != null) {
                Job.DefaultImpls.cancel$default(value, (CancellationException) null, 1, (Object) null);
            }
        }
        a().clear();
    }

    private final boolean s(u0 request) {
        byte[] bArrJ = request.getAddresses().J();
        this.logger.j("request : " + request);
        this.logger.j("address: " + ie0.n.e(bArrJ, 0, 1, null));
        this.logger.j("sts mode: " + request.getStsMode());
        boolean z11 = p013kotlin.text.t.y0(this.vin) || bArrJ.length == 0 || bArrJ.length % 2 != 0 || request.getStsMode() == s0.STS_UNKNOWN;
        this.logger.j("invalid: " + z11);
        return !z11;
    }

    @Override // nf0.b
    public ConcurrentHashMap<Integer, Job> a() {
        return this.sessionJobMap;
    }

    @Override // nf0.b
    public Flow<of0.a> b() {
        return FlowKt.buffer(FlowKt.channelFlow(new c(null)), 12, BufferOverflow.SUSPEND);
    }
}
