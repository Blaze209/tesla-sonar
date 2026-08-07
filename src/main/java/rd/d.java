package rd;

import android.app.Activity;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.s0;
import ce.e;
import ce.q;
import ce.t;
import ce.u;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.m;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.AwaitAction;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ezvcard.property.Gender;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import jn0.s;
import ke.GenericComponentParams;
import ke.TimerData;
import kf.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import le.g;
import le.h;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.z;
import sd.AwaitOutputData;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u0002:\u0001WBA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J%\u0010*\u001a\u00020\u00132\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0017\u001a\u00020$H\u0002¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010(2\u0006\u0010\u0017\u001a\u00020$H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00132\u0006\u0010,\u001a\u00020(H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002042\u0006\u00109\u001a\u00020\"H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00132\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00132\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0013H\u0002¢\u0006\u0004\bB\u0010\u0015J\u0017\u0010E\u001a\u00020\u00132\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ3\u0010L\u001a\u00020\u00132\u0006\u0010H\u001a\u00020G2\u0006\u0010D\u001a\u00020C2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00130IH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010\u0015J\u001f\u0010O\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bO\u0010PJ\u001d\u0010S\u001a\u00020\u00132\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00130QH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010\u0015J\u000f\u0010V\u001a\u00020\u0013H\u0016¢\u0006\u0004\bV\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010cR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010dR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020/0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010l\u001a\b\u0012\u0004\u0012\u00020/0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010j\u001a\u0004\bf\u0010kR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u0002060m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010r\u001a\b\u0012\u0004\u0012\u0002060i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010j\u001a\u0004\bq\u0010kR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020<0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010oR \u0010u\u001a\b\u0012\u0004\u0012\u00020<0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010j\u001a\u0004\bn\u0010kR\"\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010v0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010j\u001a\u0004\b`\u0010kR \u0010|\u001a\b\u0012\u0004\u0012\u00020y0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010j\u001a\u0004\b{\u0010kR\u0018\u0010\u007f\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R5\u0010\u0017\u001a\u0004\u0018\u00010\u00162\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u0010!R\u0016\u0010D\u001a\u00020C8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008d\u0001"}, d2 = {"Lrd/d;", "Lrd/b;", "Lce/t;", "Lce/e;", "observerRepository", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lke/k;", "componentParams", "Ljf/b;", "redirectHandler", "Lhe/c;", "statusRepository", "Lce/q;", "paymentDataRepository", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "<init>", "(Lce/e;Landroidx/lifecycle/s0;Lke/k;Ljf/b;Lhe/c;Lce/q;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;)V", "Ljn0/h0;", Gender.NONE, "()V", "Lcom/adyen/checkout/components/core/action/AwaitAction;", "action", "Landroid/app/Activity;", "activity", "I", "(Lcom/adyen/checkout/components/core/action/AwaitAction;Landroid/app/Activity;)V", "", "P", "(Lcom/adyen/checkout/components/core/action/AwaitAction;)Z", "J", "H", "(Lcom/adyen/checkout/components/core/action/AwaitAction;)V", "", "paymentData", "Lcom/adyen/checkout/components/core/action/Action;", "Q", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/action/Action;)V", "Ljn0/s;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "result", "L", "(Ljava/lang/Object;Lcom/adyen/checkout/components/core/action/Action;)V", "statusResponse", "B", "(Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;Lcom/adyen/checkout/components/core/action/Action;)V", "Lsd/a;", "A", "()Lsd/a;", "K", "(Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;)V", "Lorg/json/JSONObject;", "details", "Lcom/adyen/checkout/components/core/ActionComponentData;", "y", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/ActionComponentData;", StatusResponse.PAYLOAD, "z", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "D", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "C", "(Lorg/json/JSONObject;)V", "x", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "g", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lce/b;", "callback", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", Gender.MALE, "v", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "f", "(Lwn0/a;)V", "w", "b", "a", "Lce/e;", "Landroidx/lifecycle/s0;", "k", "()Landroidx/lifecycle/s0;", "c", "Lke/k;", Gender.FEMALE, "()Lke/k;", DateTokenConverter.CONVERTER_KEY, "Ljf/b;", "Lhe/c;", "Lce/q;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "h", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_outputDataFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "outputDataFlow", "Lkotlinx/coroutines/channels/Channel;", "j", "Lkotlinx/coroutines/channels/Channel;", "detailsChannel", "l", "detailsFlow", "exceptionChannel", "m", "exceptionFlow", "Lkf/f;", "n", "viewFlow", "Lke/o;", "o", "getTimerFlow", "timerFlow", "p", "Lkotlinx/coroutines/CoroutineScope;", "_coroutineScope", "Lkotlinx/coroutines/Job;", "q", "Lkotlinx/coroutines/Job;", "statusPollingJob", "<set-?>", "r", "Lce/u;", "E", "()Lcom/adyen/checkout/components/core/action/AwaitAction;", Gender.OTHER, "G", "()Lkotlinx/coroutines/CoroutineScope;", "s", "await_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements rd.b, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e observerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final GenericComponentParams componentParams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jf.b redirectHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final he.c statusRepository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q paymentDataRepository;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsManager analyticsManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<AwaitOutputData> _outputDataFlow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Flow<AwaitOutputData> outputDataFlow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Channel<ActionComponentData> detailsChannel;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Flow<ActionComponentData> detailsFlow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Channel<CheckoutException> exceptionChannel;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Flow<CheckoutException> exceptionFlow;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Flow<f> viewFlow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Flow<TimerData> timerFlow;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private CoroutineScope _coroutineScope;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Job statusPollingJob;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final u action;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f107708t = {o0.f(new z(d.class, "action", "getAction()Lcom/adyen/checkout/components/core/action/AwaitAction;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f107709u = TimeUnit.MINUTES.toMillis(15);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<h0> {
        b() {
            super(0);
        }

        public final void b() {
            d.this.w();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljn0/s;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "it", "Ljn0/h0;", "<anonymous>", "(Ljn0/s;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.await.internal.ui.DefaultAwaitDelegate$startStatusPolling$1", f = "DefaultAwaitDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<s<? extends StatusResponse>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f107729n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f107730o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Action f107732q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Action action, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f107732q = action;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = d.this.new c(this.f107732q, continuation);
            cVar.f107730o = obj;
            return cVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(s<? extends StatusResponse> sVar, Continuation<? super h0> continuation) {
            return invoke(sVar.getValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f107729n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            d.this.L(((s) this.f107730o).getValue(), this.f107732q);
            return h0.f84049a;
        }

        public final Object invoke(Object obj, Continuation<? super h0> continuation) {
            return ((c) create(s.a(obj), continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public d(e observerRepository, s0 savedStateHandle, GenericComponentParams componentParams, jf.b redirectHandler, he.c statusRepository, q paymentDataRepository, AnalyticsManager analyticsManager) {
        p013kotlin.jvm.internal.s.k(observerRepository, "observerRepository");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(componentParams, "componentParams");
        p013kotlin.jvm.internal.s.k(redirectHandler, "redirectHandler");
        p013kotlin.jvm.internal.s.k(statusRepository, "statusRepository");
        p013kotlin.jvm.internal.s.k(paymentDataRepository, "paymentDataRepository");
        this.observerRepository = observerRepository;
        this.savedStateHandle = savedStateHandle;
        this.componentParams = componentParams;
        this.redirectHandler = redirectHandler;
        this.statusRepository = statusRepository;
        this.paymentDataRepository = paymentDataRepository;
        this.analyticsManager = analyticsManager;
        MutableStateFlow<AwaitOutputData> MutableStateFlow = StateFlowKt.MutableStateFlow(A());
        this._outputDataFlow = MutableStateFlow;
        this.outputDataFlow = MutableStateFlow;
        Channel<ActionComponentData> channelA = le.b.a();
        this.detailsChannel = channelA;
        this.detailsFlow = FlowKt.receiveAsFlow(channelA);
        Channel<CheckoutException> channelA2 = le.b.a();
        this.exceptionChannel = channelA2;
        this.exceptionFlow = FlowKt.receiveAsFlow(channelA2);
        this.viewFlow = StateFlowKt.MutableStateFlow(a.f107704a);
        this.timerFlow = FlowKt.flowOf((Object[]) new TimerData[0]);
        this.action = new u("ACTION_KEY");
    }

    private final AwaitOutputData A() {
        return new AwaitOutputData(false, null);
    }

    private final void B(StatusResponse statusResponse, Action action) {
        this._outputDataFlow.tryEmit(new AwaitOutputData(statusResponse != null && h.f89953a.a(statusResponse), action.getPaymentMethodType()));
    }

    private final void C(JSONObject details) {
        this.detailsChannel.mo85trySendJP2dKIU(y(details));
        x();
    }

    private final void D(CheckoutException e11) {
        this.exceptionChannel.mo85trySendJP2dKIU(e11);
        x();
    }

    private final AwaitAction E() {
        return (AwaitAction) this.action.getValue(this, f107708t[0]);
    }

    private final CoroutineScope G() {
        CoroutineScope coroutineScope = this._coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void H(AwaitAction action) {
        String paymentData = action.getPaymentData();
        if (paymentData != null) {
            B(null, action);
            if (P(action)) {
                return;
            }
            Q(paymentData, action);
            return;
        }
        me.a aVar = me.a.ERROR;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = d.class.getName();
            p013kotlin.jvm.internal.s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "Payment data is null", null);
        }
        D(new ComponentException("Payment data is null", null, 2, null));
    }

    private final void I(AwaitAction action, Activity activity) {
        if (P(action)) {
            J(action, activity);
        }
    }

    private final void J(AwaitAction action, Activity activity) {
        String url = action.getUrl();
        try {
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = d.class.getName();
                p013kotlin.jvm.internal.s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                me.b bVarA = companion.a();
                bVarA.b(aVar, "CO." + name, "makeRedirect - " + url, null);
            }
            this.redirectHandler.a(activity, url);
            String strA = this.paymentDataRepository.a();
            if (strA == null) {
                throw new CheckoutException("Payment data should not be null", null, 2, null);
            }
            Q(strA, action);
        } catch (CheckoutException e11) {
            D(e11);
        }
    }

    private final void K(StatusResponse statusResponse) {
        String payload = statusResponse.getPayload();
        if (h.f89953a.a(statusResponse) && payload != null && payload.length() != 0) {
            C(z(payload));
            return;
        }
        D(new ComponentException("Payment was not completed. - " + statusResponse.getResultCode(), null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Object result, Action action) {
        Throwable thE = s.e(result);
        if (thE != null) {
            me.a aVar = me.a.ERROR;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = d.class.getName();
                p013kotlin.jvm.internal.s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "Error while polling status", thE);
            }
            D(new ComponentException("Error while polling status", thE));
            return;
        }
        StatusResponse statusResponse = (StatusResponse) result;
        me.a aVar2 = me.a.VERBOSE;
        me.b.Companion companion2 = me.b.INSTANCE;
        if (companion2.a().a(aVar2)) {
            String name2 = d.class.getName();
            p013kotlin.jvm.internal.s.h(name2);
            String strU2 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU2.length() != 0) {
                name2 = p013kotlin.text.t.W0(strU2, "Kt");
            }
            me.b bVarA = companion2.a();
            bVarA.b(aVar2, "CO." + name2, "Status changed - " + statusResponse.getResultCode(), null);
        }
        B(statusResponse, action);
        if (h.f89953a.a(statusResponse)) {
            K(statusResponse);
        }
    }

    private final void N() {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = d.class.getName();
            p013kotlin.jvm.internal.s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "Restoring state", null);
        }
        AwaitAction awaitActionE = E();
        if (awaitActionE != null) {
            H(awaitActionE);
        }
    }

    private final void O(AwaitAction awaitAction) {
        this.action.setValue(this, f107708t[0], awaitAction);
    }

    private final boolean P(AwaitAction action) {
        String url = action.getUrl();
        return !(url == null || url.length() == 0);
    }

    private final void Q(String paymentData, Action action) {
        Job job = this.statusPollingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.statusPollingJob = FlowKt.launchIn(FlowKt.onEach(this.statusRepository.b(paymentData, f107709u), new c(action, null)), G());
    }

    private final void x() {
        O(null);
    }

    private final ActionComponentData y(JSONObject details) {
        return new ActionComponentData(this.paymentDataRepository.a(), details);
    }

    private final JSONObject z(String payload) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StatusResponse.PAYLOAD, payload);
            return jSONObject;
        } catch (JSONException e11) {
            D(new ComponentException("Failed to create details.", e11));
            return jSONObject;
        }
    }

    @Override // je.b
    /* JADX INFO: renamed from: F, reason: from getter and merged with bridge method [inline-methods] */
    public GenericComponentParams getComponentParams() {
        return this.componentParams;
    }

    public void M() {
        this.observerRepository.b();
    }

    @Override // je.b
    public void b() {
        M();
        Job job = this.statusPollingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.statusPollingJob = null;
        this._coroutineScope = null;
    }

    @Override // kf.r
    public Flow<f> d() {
        return this.viewFlow;
    }

    @Override // je.f
    public void f(wn0.a<h0> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.redirectHandler.f(listener);
    }

    @Override // je.b
    public void g(CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this._coroutineScope = coroutineScope;
        N();
    }

    @Override // je.h
    public Flow<AwaitOutputData> h() {
        return this.outputDataFlow;
    }

    @Override // je.a
    public void i(LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope, l<? super ce.b, h0> callback) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.observerRepository.a(l(), j(), null, lifecycleOwner, coroutineScope, callback);
        g.a(lifecycleOwner, new b());
    }

    @Override // je.a
    public Flow<CheckoutException> j() {
        return this.exceptionFlow;
    }

    @Override // ce.t
    /* JADX INFO: renamed from: k, reason: from getter */
    public s0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    @Override // je.c
    public Flow<ActionComponentData> l() {
        return this.detailsFlow;
    }

    @Override // je.a
    public void r(CheckoutException checkoutException) {
        rd.b.a.a(this, checkoutException);
    }

    @Override // je.a
    public void v(Action action, Activity activity) {
        p013kotlin.jvm.internal.s.k(action, "action");
        p013kotlin.jvm.internal.s.k(activity, "activity");
        if (!(action instanceof AwaitAction)) {
            D(new ComponentException("Unsupported action", null, 2, null));
            return;
        }
        AwaitAction awaitAction = (AwaitAction) action;
        O(awaitAction);
        this.paymentDataRepository.c(action.getPaymentData());
        de.h hVar = de.h.f60518a;
        String paymentMethodType = action.getPaymentMethodType();
        String str = paymentMethodType == null ? "" : paymentMethodType;
        String type = action.getType();
        de.a.Log logB = de.h.b(hVar, str, type == null ? "" : type, null, 4, null);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.d(logB);
        }
        I(awaitAction, activity);
        H(awaitAction);
    }

    @Override // je.g
    public void w() {
        String strA = this.paymentDataRepository.a();
        if (strA == null) {
            return;
        }
        this.statusRepository.a(strA);
    }
}
