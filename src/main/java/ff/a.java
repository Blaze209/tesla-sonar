package ff;

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
import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import de.h;
import jn0.h0;
import ke.GenericComponentParams;
import kf.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.z;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0001:BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b$\u0010\u0015J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J3\u0010.\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020%2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00130+H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u0010\u0015J\u001f\u00102\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b4\u0010#J\u001d\u00107\u001a\u00020\u00132\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001305H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0013H\u0016¢\u0006\u0004\b9\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010FR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010Q\u001a\b\u0012\u0004\u0012\u00020I0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020 0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010KR \u0010T\u001a\b\u0012\u0004\u0012\u00020 0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010N\u001a\u0004\bR\u0010PR\"\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010N\u001a\u0004\bC\u0010PR\u0018\u0010Y\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010Z\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010\u0019¨\u0006a"}, d2 = {"Lff/a;", "Lff/c;", "Lce/t;", "Lce/e;", "observerRepository", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lke/k;", "componentParams", "Ljf/b;", "redirectHandler", "Lce/q;", "paymentDataRepository", "Ldf/a;", "nativeRedirectService", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "<init>", "(Lce/e;Landroidx/lifecycle/s0;Lke/k;Ljf/b;Lce/q;Ldf/a;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;)V", "Ljn0/h0;", "B", "()V", "Lcom/adyen/checkout/components/core/action/RedirectAction;", "action", "y", "(Lcom/adyen/checkout/components/core/action/RedirectAction;)V", "Landroid/app/Activity;", "activity", "", ImagesContract.URL, "z", "(Landroid/app/Activity;Ljava/lang/String;)V", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "u", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "p", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "g", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lce/b;", "callback", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", "A", "Lcom/adyen/checkout/components/core/action/Action;", "v", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "r", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "f", "(Lwn0/a;)V", "b", "a", "Lce/e;", "Landroidx/lifecycle/s0;", "k", "()Landroidx/lifecycle/s0;", "c", "Lke/k;", "x", "()Lke/k;", DateTokenConverter.CONVERTER_KEY, "Ljf/b;", "Lce/q;", "Ldf/a;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/adyen/checkout/components/core/ActionComponentData;", "h", "Lkotlinx/coroutines/channels/Channel;", "detailsChannel", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/Flow;", "l", "()Lkotlinx/coroutines/flow/Flow;", "detailsFlow", "j", "exceptionChannel", "exceptionFlow", "Lkf/f;", "viewFlow", "m", "Lkotlinx/coroutines/CoroutineScope;", "_coroutineScope", "<set-?>", "n", "Lce/u;", "w", "()Lcom/adyen/checkout/components/core/action/RedirectAction;", "C", "o", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements c, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e observerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final GenericComponentParams componentParams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jf.b redirectHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q paymentDataRepository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final df.a nativeRedirectService;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsManager analyticsManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Channel<ActionComponentData> detailsChannel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Flow<ActionComponentData> detailsFlow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Channel<CheckoutException> exceptionChannel;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Flow<CheckoutException> exceptionFlow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Flow<f> viewFlow;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private CoroutineScope _coroutineScope;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final u action;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f65807p = {o0.f(new z(a.class, "action", "getAction()Lcom/adyen/checkout/components/core/action/RedirectAction;", 0))};

    public a(e observerRepository, s0 savedStateHandle, GenericComponentParams componentParams, jf.b redirectHandler, q paymentDataRepository, df.a nativeRedirectService, AnalyticsManager analyticsManager) {
        s.k(observerRepository, "observerRepository");
        s.k(savedStateHandle, "savedStateHandle");
        s.k(componentParams, "componentParams");
        s.k(redirectHandler, "redirectHandler");
        s.k(paymentDataRepository, "paymentDataRepository");
        s.k(nativeRedirectService, "nativeRedirectService");
        this.observerRepository = observerRepository;
        this.savedStateHandle = savedStateHandle;
        this.componentParams = componentParams;
        this.redirectHandler = redirectHandler;
        this.paymentDataRepository = paymentDataRepository;
        this.nativeRedirectService = nativeRedirectService;
        this.analyticsManager = analyticsManager;
        Channel<ActionComponentData> channelA = le.b.a();
        this.detailsChannel = channelA;
        this.detailsFlow = FlowKt.receiveAsFlow(channelA);
        Channel<CheckoutException> channelA2 = le.b.a();
        this.exceptionChannel = channelA2;
        this.exceptionFlow = FlowKt.receiveAsFlow(channelA2);
        this.viewFlow = StateFlowKt.MutableStateFlow(b.f65822a);
        this.action = new u("ACTION_KEY");
    }

    private final void B() {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = a.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "Restoring state", null);
        }
        RedirectAction redirectActionW = w();
        if (redirectActionW != null) {
            y(redirectActionW);
        }
    }

    private final void C(RedirectAction redirectAction) {
        this.action.setValue(this, f65807p[0], redirectAction);
    }

    private final void p() {
        C(null);
    }

    private final void u(CheckoutException e11) {
        this.exceptionChannel.mo85trySendJP2dKIU(e11);
        p();
    }

    private final RedirectAction w() {
        return (RedirectAction) this.action.getValue(this, f65807p[0]);
    }

    private final void y(RedirectAction action) {
        if (s.f(action.getType(), "nativeRedirect")) {
            this.paymentDataRepository.b(action.getNativeRedirectData());
        } else {
            this.paymentDataRepository.c(action.getPaymentData());
        }
    }

    private final void z(Activity activity, String url) {
        try {
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = a.class.getName();
                s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                me.b bVarA = companion.a();
                bVarA.b(aVar, "CO." + name, "makeRedirect - " + url, null);
            }
            this.redirectHandler.a(activity, url);
        } catch (CheckoutException e11) {
            u(e11);
        }
    }

    public void A() {
        this.observerRepository.b();
    }

    @Override // je.b
    public void b() {
        A();
        this.redirectHandler.b();
        this._coroutineScope = null;
    }

    @Override // kf.r
    public Flow<f> d() {
        return this.viewFlow;
    }

    @Override // je.f
    public void f(wn0.a<h0> listener) {
        s.k(listener, "listener");
        this.redirectHandler.f(listener);
    }

    @Override // je.b
    public void g(CoroutineScope coroutineScope) {
        s.k(coroutineScope, "coroutineScope");
        this._coroutineScope = coroutineScope;
        B();
    }

    @Override // je.a
    public void i(LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope, l<? super ce.b, h0> callback) {
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(coroutineScope, "coroutineScope");
        s.k(callback, "callback");
        this.observerRepository.a(l(), j(), null, lifecycleOwner, coroutineScope, callback);
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
    public void r(CheckoutException e11) {
        s.k(e11, "e");
        u(e11);
    }

    @Override // je.a
    public void v(Action action, Activity activity) {
        s.k(action, "action");
        s.k(activity, "activity");
        if (!(action instanceof RedirectAction)) {
            u(new ComponentException("Unsupported action", null, 2, null));
            return;
        }
        RedirectAction redirectAction = (RedirectAction) action;
        C(redirectAction);
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
        y(redirectAction);
        z(activity, redirectAction.getUrl());
    }

    @Override // je.b
    /* JADX INFO: renamed from: x, reason: from getter and merged with bridge method [inline-methods] */
    public GenericComponentParams getComponentParams() {
        return this.componentParams;
    }
}
