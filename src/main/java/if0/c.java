package if0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import ie0.q0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import mf0.i;
import mf0.j;
import nf0.f;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.AbstractCoroutineContextElement;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010.\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010-¨\u0006/"}, d2 = {"Lif0/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "vin", "Ljava/lang/Runnable;", "makeSureForeground", "Lmf0/i;", "connector", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Runnable;Lmf0/i;)V", "Lnf0/b;", "g", "(Landroid/content/Context;Ljava/lang/String;Lmf0/i;)Lnf0/b;", "Lkotlinx/coroutines/CoroutineScope;", "e", "()Lkotlinx/coroutines/CoroutineScope;", "", "", "f", "()Ljava/util/List;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "()V", "j", "", "h", "()Z", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Ljava/lang/Runnable;", DateTokenConverter.CONVERTER_KEY, "Lmf0/i;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Lnf0/b;", "uwbSessionScopeManager", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "rangingJob", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String vin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Runnable makeSureForeground;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i connector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private nf0.b uwbSessionScopeManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Job rangingJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "Ljn0/h0;", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f77649b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Companion companion, c cVar) {
            super(companion);
            this.f77649b = cVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            g gVar = this.f77649b.logger;
            String string = exception.toString();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(string);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.uwb.UwbRangingController$start$1", f = "UwbRangingController.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f77650n;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lof0/a;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.teslamotors.plugins.uwb.UwbRangingController$start$1$1", f = "UwbRangingController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements q<FlowCollector<? super of0.a>, Throwable, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f77652n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f77653o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c f77654p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f77654p = cVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f77652n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                Throwable th2 = (Throwable) this.f77653o;
                g gVar = this.f77654p.logger;
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
            public final Object invoke(FlowCollector<? super of0.a> flowCollector, Throwable th2, Continuation<? super h0> continuation) {
                a aVar = new a(this.f77654p, continuation);
                aVar.f77653o = th2;
                return aVar.invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: if0.c$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C1636b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f77655a;

            C1636b(c cVar) {
                this.f77655a = cVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(of0.a aVar, Continuation<? super h0> continuation) {
                if (aVar instanceof of0.a.UwbDisconnected) {
                    of0.a.UwbDisconnected uwbDisconnected = (of0.a.UwbDisconnected) aVar;
                    if (s.f(uwbDisconnected.getVin(), this.f77655a.vin)) {
                        this.f77655a.connector.d(v.s(Boxing.boxInt(uwbDisconnected.getSessionId())), j.STOP_REASON_RANGING_SESSION_DISCONNECTED);
                    }
                    this.f77655a.logger.j("[Ranging] uwb disconnected of session " + uwbDisconnected.getSessionId());
                } else if (aVar instanceof of0.a.PositionUpdated) {
                    of0.a.PositionUpdated positionUpdated = (of0.a.PositionUpdated) aVar;
                    this.f77655a.logger.j("[Ranging] uwb position updated of session " + positionUpdated.getSessionId());
                    g gVar = this.f77655a.logger;
                    v5.b azimuth = positionUpdated.getPosition().getAzimuth();
                    Float fBoxFloat = azimuth != null ? Boxing.boxFloat(azimuth.getValue()) : null;
                    v5.b distance = positionUpdated.getPosition().getDistance();
                    Float fBoxFloat2 = distance != null ? Boxing.boxFloat(distance.getValue()) : null;
                    v5.b elevation = positionUpdated.getPosition().getElevation();
                    Float fBoxFloat3 = elevation != null ? Boxing.boxFloat(elevation.getValue()) : null;
                    gVar.j("azimuth: " + fBoxFloat + ", distance: " + fBoxFloat2 + ", elevation: " + fBoxFloat3 + ", elapsed time: " + positionUpdated.getPosition().getElapsedRealtimeNanos());
                } else if (aVar instanceof of0.a.UwbEndpointFound) {
                    this.f77655a.logger.j("[Ranging] uwb endpoint found of session " + ((of0.a.UwbEndpointFound) aVar).getSessionId());
                }
                return h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Flow<of0.a> flowB;
            Flow flowM548catch;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f77650n;
            if (i11 == 0) {
                t.b(obj);
                nf0.b bVar = c.this.uwbSessionScopeManager;
                if (bVar != null && (flowB = bVar.b()) != null && (flowM548catch = FlowKt.m548catch(flowB, new a(c.this, null))) != null) {
                    C1636b c1636b = new C1636b(c.this);
                    this.f77650n = 1;
                    if (flowM548catch.collect(c1636b, this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(Context context, String vin, Runnable makeSureForeground, i connector) {
        s.k(context, "context");
        s.k(vin, "vin");
        s.k(makeSureForeground, "makeSureForeground");
        s.k(connector, "connector");
        this.context = context;
        this.vin = vin;
        this.makeSureForeground = makeSureForeground;
        this.connector = connector;
        g gVarP = g.INSTANCE.a("Uwb").p("RangingController");
        String strF = q0.f(vin);
        s.j(strF, "obfuscateVIN(...)");
        this.logger = gVarP.o(strF);
        this.coroutineScope = e();
        this.uwbSessionScopeManager = g(context, vin, connector);
    }

    private final CoroutineScope e() {
        return CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new a(CoroutineExceptionHandler.INSTANCE, this)));
    }

    private final nf0.b g(Context context, String vin, i connector) {
        return new f(context, vin, this.makeSureForeground, connector);
    }

    public final List<Integer> f() {
        ConcurrentHashMap<Integer, Job> concurrentHashMapA;
        Set<Integer> setKeySet;
        nf0.b bVar = this.uwbSessionScopeManager;
        if (bVar == null || (concurrentHashMapA = bVar.a()) == null || (setKeySet = concurrentHashMapA.keySet()) == null) {
            return null;
        }
        return v.m1(setKeySet);
    }

    public boolean h() {
        return this.rangingJob == null;
    }

    public void i() {
        this.logger.j("starting ranging controller");
        if (this.rangingJob != null) {
            return;
        }
        this.rangingJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new b(null), 3, null);
    }

    public void j() {
        this.logger.j("stopping ranging controller");
        this.connector.clear();
        Job job = this.rangingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.rangingJob = null;
    }
}
