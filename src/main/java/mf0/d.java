package mf0;

import android.content.Context;
import android.os.SystemClock;
import androidx.core.uwb.exceptions.UwbServiceNotAvailableException;
import androidx.core.uwb.exceptions.UwbSystemCallbackException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.uwb.UwbStatusCodes;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jf0.RangingCapabilities;
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
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import lf0.FiraSessionResult;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.AbstractCoroutineContextElement;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import vc0.n0;
import vc0.q0;
import vc0.u0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0012J\u001f\u0010&\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010*\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020/H\u0016¢\u0006\u0004\b*\u00100J\u000f\u00101\u001a\u00020\u0010H\u0016¢\u0006\u0004\b1\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00104R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00106R$\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0010\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00109R\u0014\u0010<\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010;R8\u0010A\u001a&\u0012\f\u0012\n ?*\u0004\u0018\u00010>0> ?*\u0012\u0012\f\u0012\n ?*\u0004\u0018\u00010>0>\u0018\u00010\n0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lmf0/d;", "Lmf0/i;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "vin", "Lmf0/k;", "callback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lmf0/k;)V", "", "", "sessionIds", "", "t", "(Ljava/util/List;Ljava/lang/String;Landroid/content/Context;)Z", "Ljn0/h0;", "x", "()V", "Lkotlinx/coroutines/CoroutineScope;", "u", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "Llf0/b;", "f", "()Lkotlinx/coroutines/flow/Flow;", "Lvc0/q0;", "request", "b", "(Lvc0/q0;)V", "Lmf0/j;", AnalyticsAttribute.Reason, DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Lmf0/j;)V", "h", "Lvc0/u0;", "firaSessionRequest", "resetRangingStart", "g", "(Lvc0/u0;Z)V", "sessionId", "Lkf0/a;", "e", "a", "(ILkf0/a;)V", "c", "(Ljava/util/List;)V", "", "(ILjava/lang/Throwable;)V", "clear", "Landroid/content/Context;", "Ljava/lang/String;", "Lmf0/k;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Lkotlin/Function1;", "Lwn0/l;", "dispatchEvent", "Lkotlinx/coroutines/CoroutineScope;", "outOfBandCoroutineScope", "", "Lkotlinx/coroutines/Job;", "kotlin.jvm.PlatformType", "Ljava/util/List;", "disposableJobList", "Lkf0/b;", "Lkf0/b;", "errorTelemetryThrottler", "Lmf0/g;", IntegerTokenConverter.CONVERTER_KEY, "Lmf0/g;", "firaMessagePreHandler", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String vin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k callback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private l<? super lf0.b, h0> dispatchEvent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope outOfBandCoroutineScope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Job> disposableJobList;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final kf0.b errorTelemetryThrottler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final g firaMessagePreHandler;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.uwb.fira.oob.BLEOutOfBandConnector$dispatchStartFiraSessionEvent$2", f = "BLEOutOfBandConnector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f92060n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<Integer> f92062p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ q0 f92063q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<Integer> list, q0 q0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f92062p = list;
            this.f92063q = q0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new a(this.f92062p, this.f92063q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f92060n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.logger.j("coroutine launched, attempt to start fira sessions");
            l lVar = d.this.dispatchEvent;
            if (lVar != null) {
                d dVar = d.this;
                lVar.invoke(new lf0.b.FiraSessionStart(dVar.vin, this.f92062p, this.f92063q));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.uwb.fira.oob.BLEOutOfBandConnector$dispatchStopFiraSessionEvent$2", f = "BLEOutOfBandConnector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f92064n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j f92065o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d f92066p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ List<Integer> f92067q;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f92068a;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.STOP_REASON_VEHICLE_FIRA_STOP_EVENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.STOP_REASON_RANGING_SESSION_DISCONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j.STOP_REASON_BLE_DISCONNECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f92068a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar, d dVar, List<Integer> list, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f92065o = jVar;
            this.f92066p = dVar;
            this.f92067q = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f92065o, this.f92066p, this.f92067q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f92064n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            int i11 = a.f92068a[this.f92065o.ordinal()];
            if (i11 == 1 || i11 == 2) {
                l lVar = this.f92066p.dispatchEvent;
                if (lVar != null) {
                    d dVar = this.f92066p;
                    lVar.invoke(new lf0.b.FiraSessionStopped(dVar.vin, this.f92067q));
                }
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                l lVar2 = this.f92066p.dispatchEvent;
                if (lVar2 != null) {
                    d dVar2 = this.f92066p;
                    lVar2.invoke(new lf0.b.FiraSessionStop(dVar2.vin, this.f92067q, this.f92065o));
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "Ljn0/h0;", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f92069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Companion companion, d dVar) {
            super(companion);
            this.f92069b = dVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            com.tesla.logging.g gVar = this.f92069b.logger;
            String strValueOf = String.valueOf(exception.getMessage());
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
        }
    }

    /* JADX INFO: renamed from: mf0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.uwb.fira.oob.BLEOutOfBandConnector$notifyCapability$1", f = "BLEOutOfBandConnector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1964d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f92070n;

        /* JADX INFO: renamed from: mf0.d$d$a */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mf0/d$d$a", "Ljf0/e;", "Ljf0/a;", "_capabilities", "Ljn0/h0;", "a", "(Ljf0/a;)V", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements jf0.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f92072a;

            a(d dVar) {
                this.f92072a = dVar;
            }

            @Override // jf0.e
            public void a(RangingCapabilities _capabilities) {
                n0 n0VarA;
                if (_capabilities == null || (n0VarA = jf0.b.a(_capabilities)) == null) {
                    return;
                }
                this.f92072a.callback.c(n0VarA);
            }
        }

        C1964d(Continuation<? super C1964d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new C1964d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UwbServiceNotAvailableException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f92070n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            jf0.f.b(d.this.context, new a(d.this));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1964d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Llf0/b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.uwb.fira.oob.BLEOutOfBandConnector$prepareOutOfBandEventFlow$1", f = "BLEOutOfBandConnector.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<ProducerScope<? super lf0.b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f92073n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f92074o;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 c(d dVar, ProducerScope producerScope, lf0.b bVar) {
            lf0.b bVarA = dVar.firaMessagePreHandler.a(bVar);
            if (bVarA != null) {
                dVar.logger.j("dispatching Oob Event [" + bVarA.hashCode() + "]: " + bVarA);
                Object objMo85trySendJP2dKIU = producerScope.mo85trySendJP2dKIU(bVarA);
                boolean z11 = objMo85trySendJP2dKIU instanceof ChannelResult.Failed;
                if (!z11) {
                    dVar.logger.a("[Oob Channel][" + bVarA.hashCode() + "] message succeed");
                }
                if (objMo85trySendJP2dKIU instanceof ChannelResult.Closed) {
                    ChannelResult.m534exceptionOrNullimpl(objMo85trySendJP2dKIU);
                    dVar.logger.a("[Oob Channel][" + bVarA.hashCode() + "] channel closed");
                }
                if (z11) {
                    ChannelResult.m534exceptionOrNullimpl(objMo85trySendJP2dKIU);
                    dVar.logger.a("[Oob Channel][" + bVarA.hashCode() + "] message failure");
                }
            } else {
                dVar.logger.n("[Oob Channel][Throttled][" + bVar.hashCode() + "] event filtered out by pre-handler: " + bVar.getClass().getCanonicalName());
            }
            return h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 e(d dVar) {
            dVar.logger.j("[Oob Channel] closing BLEOutOfBandConnector channel flow");
            dVar.dispatchEvent = null;
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = d.this.new e(continuation);
            eVar.f92074o = obj;
            return eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f92073n;
            if (i11 == 0) {
                t.b(obj);
                final ProducerScope producerScope = (ProducerScope) this.f92074o;
                d.this.logger.j("creating Flow for oob events");
                final d dVar = d.this;
                dVar.dispatchEvent = new l() { // from class: mf0.e
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return d.e.c(dVar, producerScope, (lf0.b) obj2);
                    }
                };
                final d dVar2 = d.this;
                wn0.a aVar = new wn0.a() { // from class: mf0.f
                    @Override // wn0.a
                    public final Object invoke() {
                        return d.e.e(dVar2);
                    }
                };
                this.f92073n = 1;
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
        public final Object invoke(ProducerScope<? super lf0.b> producerScope, Continuation<? super h0> continuation) {
            return ((e) create(producerScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public d(Context context, String vin, k callback) {
        s.k(context, "context");
        s.k(vin, "vin");
        s.k(callback, "callback");
        this.context = context;
        this.vin = vin;
        this.callback = callback;
        com.tesla.logging.g gVarP = com.tesla.logging.g.INSTANCE.a("Uwb").p("BLEOutOfBandConnector");
        String strF = ie0.q0.f(vin);
        s.j(strF, "obfuscateVIN(...)");
        this.logger = gVarP.o(strF);
        this.dispatchEvent = new l() { // from class: mf0.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d.s((lf0.b) obj);
            }
        };
        this.outOfBandCoroutineScope = u();
        this.disposableJobList = Collections.synchronizedList(new ArrayList());
        this.errorTelemetryThrottler = new kf0.b(0L, 1, null);
        this.firaMessagePreHandler = new g(this, vin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 s(lf0.b it) {
        s.k(it, "it");
        return h0.f84049a;
    }

    private final boolean t(List<Integer> sessionIds, String vin, Context context) {
        if (!jf0.d.e(context)) {
            this.logger.n("device hardware not available");
            Iterator<T> it = sessionIds.iterator();
            while (it.hasNext()) {
                this.callback.b(FiraSessionResult.INSTANCE.a(vin, ((Number) it.next()).intValue(), new kf0.a.C1836a(kf0.c.ERROR_UWB_HARDWARE_NOT_AVAILABLE)));
            }
            return true;
        }
        if (!jf0.d.k(vin, false, 2, null)) {
            this.logger.n("vehicle not supported");
            Iterator<T> it2 = sessionIds.iterator();
            while (it2.hasNext()) {
                this.callback.b(FiraSessionResult.INSTANCE.a(vin, ((Number) it2.next()).intValue(), new kf0.a.C1836a(kf0.c.ERROR_VEHICLE_NOT_SUPPORTED)));
            }
            return true;
        }
        if (s.f(jf0.d.c(), Boolean.TRUE)) {
            return false;
        }
        this.logger.n("uwb not enabled");
        Iterator<T> it3 = sessionIds.iterator();
        while (it3.hasNext()) {
            this.callback.b(FiraSessionResult.INSTANCE.a(vin, ((Number) it3.next()).intValue(), new kf0.a.b(UwbStatusCodes.SERVICE_NOT_AVAILABLE)));
        }
        return true;
    }

    private final CoroutineScope u() {
        return CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new c(CoroutineExceptionHandler.INSTANCE, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 v(d dVar, int i11, kf0.a error) {
        s.k(error, "error");
        dVar.a(i11, error);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 w(d dVar, Throwable error, Integer num) {
        s.k(error, "error");
        String name = error.getClass().getName();
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        kf0.b.ThrottleResult throttleResultA = dVar.errorTelemetryThrottler.a(name + ":" + message + ":" + (num != null ? num.intValue() : 0));
        if (throttleResultA.getShouldLog()) {
            Pair pairA = x.a("type", "mobile-app-uwb-error-telemetry");
            Pair pairA2 = x.a("v", 2);
            String message2 = error.getMessage();
            ud0.a.b(v0.o(pairA, pairA2, x.a(AnalyticsAttribute.Error, message2 != null ? message2 : ""), x.a("status_code", Integer.valueOf(num != null ? num.intValue() : 0)), x.a("skipped_count", Integer.valueOf(throttleResultA.getSkippedCount()))), true, null, 4, null);
        }
        return h0.f84049a;
    }

    private final void x() {
        BuildersKt__Builders_commonKt.launch$default(this.outOfBandCoroutineScope, null, null, new C1964d(null), 3, null);
    }

    @Override // mf0.i
    public void a(int sessionId, kf0.a e11) {
        s.k(e11, "e");
        this.logger.j(e11.a());
        this.firaMessagePreHandler.b(sessionId);
        this.callback.b(FiraSessionResult.INSTANCE.a(this.vin, sessionId, e11));
    }

    @Override // mf0.i
    public void b(q0 request) {
        s.k(request, "request");
        List<u0> listB = request.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((u0) it.next()).getSessionId()));
        }
        List<Integer> listM1 = v.m1(arrayList);
        if (listM1.isEmpty()) {
            this.logger.j("no fira sessions in request");
            return;
        }
        if (!t(listM1, this.vin, this.context)) {
            this.logger.j("start new fira sessions request start event");
            this.disposableJobList.add(BuildersKt__Builders_commonKt.launch$default(this.outOfBandCoroutineScope, null, null, new a(listM1, request, null), 3, null));
        } else {
            Iterator<T> it2 = listM1.iterator();
            while (it2.hasNext()) {
                this.firaMessagePreHandler.b(((Number) it2.next()).intValue());
            }
        }
    }

    @Override // mf0.i
    public void c(List<Integer> sessionIds) {
        s.k(sessionIds, "sessionIds");
        this.callback.a(sessionIds);
    }

    @Override // mf0.i
    public void clear() {
        this.logger.j("clear all ranging session job of OutOfBandConnector");
        for (Job job : this.disposableJobList) {
            if (job.isActive()) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                this.logger.j("job: " + job + " cancelled");
            }
        }
        this.disposableJobList.clear();
    }

    @Override // mf0.i
    public void d(List<Integer> sessionIds, j reason) {
        s.k(sessionIds, "sessionIds");
        s.k(reason, "reason");
        Iterator<T> it = sessionIds.iterator();
        while (it.hasNext()) {
            this.firaMessagePreHandler.b(((Number) it.next()).intValue());
        }
        BuildersKt__Builders_commonKt.launch$default(this.outOfBandCoroutineScope, null, null, new b(reason, this, sessionIds, null), 3, null);
    }

    @Override // mf0.i
    public void e(final int sessionId, Throwable e11) {
        s.k(e11, "e");
        l lVar = new l() { // from class: mf0.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d.v(this.f92048a, sessionId, (kf0.a) obj);
            }
        };
        p pVar = new p() { // from class: mf0.c
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return d.w(this.f92050a, (Throwable) obj, (Integer) obj2);
            }
        };
        if (e11 instanceof UwbServiceNotAvailableException) {
            lVar.invoke(new kf0.a.b(UwbStatusCodes.SERVICE_NOT_AVAILABLE));
            return;
        }
        if (e11 instanceof IllegalArgumentException) {
            lVar.invoke(new kf0.a.C1836a(kf0.c.ERROR_ILLEGAL_ARGUMENT));
            return;
        }
        if (e11 instanceof IllegalStateException) {
            if (jf0.f.a(this.context)) {
                lVar.invoke(new kf0.a.C1836a(kf0.c.ERROR_ILLEGAL_STATE));
                return;
            } else {
                lVar.invoke(new kf0.a.b(UwbStatusCodes.SERVICE_NOT_AVAILABLE));
                return;
            }
        }
        if (e11 instanceof UwbSystemCallbackException) {
            lVar.invoke(new kf0.a.b(UwbStatusCodes.UWB_SYSTEM_CALLBACK_FAILURE));
            return;
        }
        if (!(e11 instanceof ApiException)) {
            pVar.invoke(e11, null);
            lVar.invoke(new kf0.a.C1836a(kf0.c.ERROR_UNKNOWN));
            return;
        }
        ApiException apiException = (ApiException) e11;
        if (s.f(apiException.getStatus(), Status.RESULT_DEAD_CLIENT)) {
            lVar.invoke(new kf0.a.C1836a(kf0.c.ERROR_RANGING_DEAD_CLIENT));
            return;
        }
        int statusCode = apiException.getStatusCode();
        if (statusCode != 10 && statusCode != 42005) {
            switch (statusCode) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (statusCode) {
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                            break;
                        default:
                            switch (statusCode) {
                                case UwbStatusCodes.SERVICE_NOT_AVAILABLE /* 42000 */:
                                case UwbStatusCodes.NULL_RANGING_DEVICE /* 42001 */:
                                case UwbStatusCodes.INVALID_API_CALL /* 42002 */:
                                case UwbStatusCodes.RANGING_ALREADY_STARTED /* 42003 */:
                                    break;
                                default:
                                    lVar.invoke(new kf0.a.C1836a(kf0.c.ERROR_UNKNOWN));
                                    pVar.invoke(e11, Integer.valueOf(apiException.getStatusCode()));
                                    break;
                            }
                            return;
                    }
                    break;
            }
        }
        lVar.invoke(new kf0.a.b(apiException.getStatusCode()));
    }

    @Override // mf0.i
    public Flow<lf0.b> f() {
        return FlowKt.callbackFlow(new e(null));
    }

    @Override // mf0.i
    public void g(u0 firaSessionRequest, boolean resetRangingStart) {
        s.k(firaSessionRequest, "firaSessionRequest");
        this.logger.j("callback fira session result");
        if (resetRangingStart) {
            this.firaMessagePreHandler.c(firaSessionRequest, SystemClock.elapsedRealtime());
        }
        this.callback.b(FiraSessionResult.INSTANCE.b(this.vin, firaSessionRequest.getSessionId()));
    }

    @Override // mf0.i
    public void h() {
        x();
    }
}
