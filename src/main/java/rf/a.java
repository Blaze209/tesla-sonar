package rf;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.s0;
import ce.PermissionRequestData;
import ce.e;
import ce.t;
import ce.u;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.m;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.VoucherAction;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.ui.core.internal.exception.PermissionRequestException;
import de.h;
import ezvcard.property.Gender;
import java.util.Arrays;
import java.util.Calendar;
import jn0.h0;
import jn0.s;
import ke.GenericComponentParams;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nf.f;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.t0;
import p013kotlin.jvm.internal.z;
import sf.VoucherOutputData;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 w2\u00020\u00012\u00020\u0002:\u0001CB9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0013J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J3\u0010-\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00110*H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u0010\u0013J\u001f\u00103\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u0002002\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u00112\u0006\u00106\u001a\u0002052\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J'\u0010@\u001a\u00020\u00112\u0006\u00106\u001a\u0002052\u0006\u0010>\u001a\u00020=2\u0006\u0010,\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0011H\u0016¢\u0006\u0004\bB\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010NR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001c0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010RR \u0010X\u001a\b\u0012\u0004\u0012\u00020\u001c0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bU\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001f0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010ZR \u0010]\u001a\b\u0012\u0004\u0012\u00020\u001f0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010V\u001a\u0004\b\\\u0010WR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ZR \u0010b\u001a\b\u0012\u0004\u0012\u00020^0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010V\u001a\u0004\ba\u0010WR\u001c\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010c0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010RR\"\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010c0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010V\u001a\u0004\bL\u0010WR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020g0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010ZR \u0010j\u001a\b\u0012\u0004\u0012\u00020g0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010V\u001a\u0004\bC\u0010WR\u0018\u0010l\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010kR/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010m\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010\u0017R\u0014\u0010%\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u001e¨\u0006x"}, d2 = {"Lrf/a;", "Lrf/c;", "Lce/t;", "Lce/e;", "observerRepository", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lke/k;", "componentParams", "Lnf/f;", "pdfOpener", "Lnf/c;", "imageSaver", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "<init>", "(Lce/e;Landroidx/lifecycle/s0;Lke/k;Lnf/f;Lnf/c;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;)V", "Ljn0/h0;", "G", "()V", "Lcom/adyen/checkout/components/core/action/VoucherAction;", "action", "E", "(Lcom/adyen/checkout/components/core/action/VoucherAction;)V", "Lsf/c;", "config", "y", "(Lcom/adyen/checkout/components/core/action/VoucherAction;Lsf/c;)V", "Lsf/b;", "w", "()Lsf/b;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "z", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "u", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "g", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lce/b;", "callback", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", Gender.FEMALE, "Lcom/adyen/checkout/components/core/action/Action;", "Landroid/app/Activity;", "activity", "v", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "n", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "q", "(Landroid/content/Context;Landroid/view/View;)V", "", "requiredPermission", "Lme/d;", "x", "(Landroid/content/Context;Ljava/lang/String;Lme/d;)V", "b", "a", "Lce/e;", "Landroidx/lifecycle/s0;", "k", "()Landroidx/lifecycle/s0;", "c", "Lke/k;", "B", "()Lke/k;", DateTokenConverter.CONVERTER_KEY, "Lnf/f;", "Lnf/c;", "f", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_outputDataFlow", "Lkotlinx/coroutines/flow/Flow;", "h", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "outputDataFlow", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/Channel;", "exceptionChannel", "j", "exceptionFlow", "Lce/s;", "permissionChannel", "l", "p", "permissionFlow", "Lkf/f;", "m", "_viewFlow", "viewFlow", "Lsf/f;", "o", "eventChannel", "eventFlow", "Lkotlinx/coroutines/CoroutineScope;", "_coroutineScope", "<set-?>", "r", "Lce/u;", "A", "()Lcom/adyen/checkout/components/core/action/VoucherAction;", "H", "C", "()Lkotlinx/coroutines/CoroutineScope;", "D", "outputData", "s", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements c, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e observerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final GenericComponentParams componentParams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f pdfOpener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final nf.c imageSaver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsManager analyticsManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<VoucherOutputData> _outputDataFlow;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Flow<VoucherOutputData> outputDataFlow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Channel<CheckoutException> exceptionChannel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Flow<CheckoutException> exceptionFlow;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Channel<PermissionRequestData> permissionChannel;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Flow<PermissionRequestData> permissionFlow;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<kf.f> _viewFlow;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Flow<kf.f> viewFlow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Channel<sf.f> eventChannel;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Flow<sf.f> eventFlow;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private CoroutineScope _coroutineScope;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final u action;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f108069t = {o0.f(new z(a.class, "action", "getAction()Lcom/adyen/checkout/components/core/action/VoucherAction;", 0))};

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.voucher.internal.ui.DefaultVoucherDelegate$saveVoucherAsImage$1", f = "DefaultVoucherDelegate.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f108088n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f108090p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f108091q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f108092r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, View view, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f108090p = context;
            this.f108091q = view;
            this.f108092r = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f108090p, this.f108091q, this.f108092r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Object objM;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f108088n;
            if (i11 == 0) {
                jn0.t.b(obj);
                nf.c cVar = a.this.imageSaver;
                Context context = this.f108090p;
                a aVar = a.this;
                View view = this.f108091q;
                String str = this.f108092r;
                this.f108088n = 1;
                bVar = this;
                objM = nf.c.m(cVar, context, aVar, view, null, str, null, bVar, 40, null);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objM = ((s) obj).getValue();
                bVar = this;
            }
            a aVar2 = a.this;
            Throwable thE = s.e(objM);
            if (thE == null) {
                aVar2.eventChannel.mo85trySendJP2dKIU(sf.f.c.f111137a);
            } else if (thE instanceof PermissionRequestException) {
                aVar2.eventChannel.mo85trySendJP2dKIU(sf.f.b.f111136a);
            } else {
                aVar2.eventChannel.mo85trySendJP2dKIU(new sf.f.Failure(thE));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(e observerRepository, s0 savedStateHandle, GenericComponentParams componentParams, f pdfOpener, nf.c imageSaver, AnalyticsManager analyticsManager) {
        p013kotlin.jvm.internal.s.k(observerRepository, "observerRepository");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(componentParams, "componentParams");
        p013kotlin.jvm.internal.s.k(pdfOpener, "pdfOpener");
        p013kotlin.jvm.internal.s.k(imageSaver, "imageSaver");
        this.observerRepository = observerRepository;
        this.savedStateHandle = savedStateHandle;
        this.componentParams = componentParams;
        this.pdfOpener = pdfOpener;
        this.imageSaver = imageSaver;
        this.analyticsManager = analyticsManager;
        MutableStateFlow<VoucherOutputData> MutableStateFlow = StateFlowKt.MutableStateFlow(w());
        this._outputDataFlow = MutableStateFlow;
        this.outputDataFlow = MutableStateFlow;
        Channel<CheckoutException> channelA = le.b.a();
        this.exceptionChannel = channelA;
        this.exceptionFlow = FlowKt.receiveAsFlow(channelA);
        Channel<PermissionRequestData> channelA2 = le.b.a();
        this.permissionChannel = channelA2;
        this.permissionFlow = FlowKt.receiveAsFlow(channelA2);
        MutableStateFlow<kf.f> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._viewFlow = MutableStateFlow2;
        this.viewFlow = MutableStateFlow2;
        Channel<sf.f> channelA3 = le.b.a();
        this.eventChannel = channelA3;
        this.eventFlow = FlowKt.receiveAsFlow(channelA3);
        this.action = new u("ACTION_KEY");
    }

    private final VoucherAction A() {
        return (VoucherAction) this.action.getValue(this, f108069t[0]);
    }

    private final CoroutineScope C() {
        CoroutineScope coroutineScope = this._coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void E(VoucherAction action) {
        sf.c cVarA = sf.c.INSTANCE.a(action.getPaymentMethodType());
        if (cVarA != null) {
            this._viewFlow.tryEmit(cVarA.getViewType());
            y(action, cVarA);
            return;
        }
        z(new ComponentException("Payment method " + action.getPaymentMethodType() + " not supported for this action", null, 2, null));
    }

    private final void G() {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = a.class.getName();
            p013kotlin.jvm.internal.s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "Restoring state", null);
        }
        VoucherAction voucherActionA = A();
        if (voucherActionA != null) {
            E(voucherActionA);
        }
    }

    private final void H(VoucherAction voucherAction) {
        this.action.setValue(this, f108069t[0], voucherAction);
    }

    private final void u() {
        H(null);
    }

    private final VoucherOutputData w() {
        return new VoucherOutputData(false, null, null, null, null, null, null, null);
    }

    private final void y(VoucherAction action, sf.c config) {
        String downloadUrl = action.getDownloadUrl();
        if (downloadUrl == null) {
            downloadUrl = action.getUrl();
        }
        this._outputDataFlow.tryEmit(new VoucherOutputData(true, action.getPaymentMethodType(), config.getIntroductionTextResource(), action.getReference(), action.getTotalAmount(), downloadUrl != null ? new sf.e.DownloadPdf(downloadUrl) : sf.e.b.f111134a, action.getInstructionsUrl(), sf.d.f(config, action, e().getShopperLocale())));
    }

    private final void z(CheckoutException e11) {
        this.exceptionChannel.mo85trySendJP2dKIU(e11);
        u();
    }

    @Override // je.b
    /* JADX INFO: renamed from: B, reason: from getter and merged with bridge method [inline-methods] */
    public GenericComponentParams getComponentParams() {
        return this.componentParams;
    }

    @Override // je.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public VoucherOutputData c() {
        return this._outputDataFlow.getValue();
    }

    public void F() {
        this.observerRepository.b();
    }

    @Override // rf.c
    public Flow<sf.f> a() {
        return this.eventFlow;
    }

    @Override // je.b
    public void b() {
        F();
        this._coroutineScope = null;
    }

    @Override // kf.r
    public Flow<kf.f> d() {
        return this.viewFlow;
    }

    @Override // je.b
    public void g(CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this._coroutineScope = coroutineScope;
        G();
    }

    @Override // je.h
    public Flow<VoucherOutputData> h() {
        return this.outputDataFlow;
    }

    @Override // je.a
    public void i(LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope, l<? super ce.b, h0> callback) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.observerRepository.a(null, j(), p(), lifecycleOwner, coroutineScope, callback);
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

    @Override // rf.c
    public void n(Context context) {
        String downloadUrl;
        p013kotlin.jvm.internal.s.k(context, "context");
        sf.e storeAction = c().getStoreAction();
        sf.e.DownloadPdf downloadPdf = storeAction instanceof sf.e.DownloadPdf ? (sf.e.DownloadPdf) storeAction : null;
        if (downloadPdf == null || (downloadUrl = downloadPdf.getDownloadUrl()) == null) {
            downloadUrl = "";
        }
        try {
            this.pdfOpener.a(context, downloadUrl);
        } catch (IllegalStateException e11) {
            String message = e11.getMessage();
            z(new ComponentException(message != null ? message : "", e11.getCause()));
        }
    }

    @Override // je.e
    public Flow<PermissionRequestData> p() {
        return this.permissionFlow;
    }

    @Override // rf.c
    public void q(Context context, View view) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(view, "view");
        String paymentMethodType = c().getPaymentMethodType();
        if (paymentMethodType == null) {
            paymentMethodType = "";
        }
        le.e eVar = le.e.f89948a;
        Calendar calendar = Calendar.getInstance();
        p013kotlin.jvm.internal.s.j(calendar, "getInstance(...)");
        String strB = le.e.b(eVar, calendar, null, 2, null);
        t0 t0Var = t0.f86535a;
        String str = String.format("%s-%s.png", Arrays.copyOf(new Object[]{paymentMethodType, strB}, 2));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        BuildersKt__Builders_commonKt.launch$default(C(), null, null, new b(context, view, str, null), 3, null);
    }

    @Override // je.a
    public void r(CheckoutException checkoutException) {
        c.a.a(this, checkoutException);
    }

    @Override // je.a
    public void v(Action action, Activity activity) {
        p013kotlin.jvm.internal.s.k(action, "action");
        p013kotlin.jvm.internal.s.k(activity, "activity");
        if (!(action instanceof VoucherAction)) {
            z(new ComponentException("Unsupported action", null, 2, null));
            return;
        }
        VoucherAction voucherAction = (VoucherAction) action;
        H(voucherAction);
        h hVar = h.f60518a;
        String paymentMethodType = action.getPaymentMethodType();
        if (paymentMethodType == null) {
            paymentMethodType = "";
        }
        String type = action.getType();
        de.a.Log logB = h.b(hVar, paymentMethodType, type != null ? type : "", null, 4, null);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.d(logB);
        }
        E(voucherAction);
    }

    @Override // pe.d
    public void x(Context context, String requiredPermission, me.d callback) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(requiredPermission, "requiredPermission");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.permissionChannel.mo85trySendJP2dKIU(new PermissionRequestData(requiredPermission, callback));
    }
}
