package xd;

import androidx.p003lifecycle.LifecycleOwner;
import ce.p;
import ce.r;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.paymentmethod.BacsDirectDebitPaymentMethod;
import de.h;
import ezvcard.property.Gender;
import jn0.h0;
import ke.ButtonComponentParams;
import kf.f;
import kf.i;
import kf.j;
import kf.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import ud.BacsDirectDebitComponentState;
import wn0.l;
import yd.BacsDirectDebitInputData;
import yd.BacsDirectDebitOutputData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0016J9\u0010)\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0'\u0012\u0004\u0012\u00020\u00140&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010\u0018J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u00020\u00142\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00140&H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0014H\u0016¢\u0006\u0004\b3\u0010\u0018J\u0017\u00104\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001dH\u0001¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020,H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020,H\u0016¢\u0006\u0004\b8\u00107J\u0017\u0010:\u001a\u00020\u00142\u0006\u00109\u001a\u00020,H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0014H\u0016¢\u0006\u0004\b<\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010FR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001d0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010R\u001a\b\u0012\u0004\u0012\u00020\u001d0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010P\u001a\u0004\bL\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000e0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010MR \u0010W\u001a\b\u0012\u0004\u0012\u00020\u000e0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010P\u001a\u0004\bV\u0010QR \u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000e0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010P\u001a\u0004\bX\u0010QR \u0010[\u001a\b\u0012\u0004\u0012\u00020Z0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010P\u001a\u0004\bU\u0010QR \u0010^\u001a\b\u0012\u0004\u0012\u00020\\0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010P\u001a\u0004\bG\u0010QR\u001c\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010_0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010MR\"\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010_0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010P\u001a\u0004\bD\u0010QR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u001f¨\u0006c"}, d2 = {"Lxd/e;", "Lxd/b;", "Lce/r;", "observerRepository", "Lke/d;", "componentParams", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lkf/o;", "Lud/b;", "submitHandler", "<init>", "(Lce/r;Lke/d;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lkf/o;)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ljn0/h0;", "B", "(Lkotlinx/coroutines/CoroutineScope;)V", "C", "()V", "Lud/e;", "mode", Gender.FEMALE, "(Lud/e;)V", "Lyd/b;", "y", "()Lyd/b;", "outputData", "w", "(Lyd/b;)Lud/b;", "g", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lce/p;", "callback", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", "D", "", "s", "(Lud/e;)Z", "Lyd/a;", "update", "t", "(Lwn0/l;)V", "l", "E", "(Lyd/b;)V", "p", "()Z", "u", "isInteractionBlocked", "m", "(Z)V", "b", "a", "Lce/r;", "Lke/d;", "e", "()Lke/d;", "c", "Lcom/adyen/checkout/components/core/PaymentMethod;", DateTokenConverter.CONVERTER_KEY, "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "f", "Lkf/o;", "Lyd/a;", "inputData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "h", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_outputDataFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "outputDataFlow", "j", "_componentStateFlow", "k", "z", "componentStateFlow", "A", "submitFlow", "Lkf/j;", "uiStateFlow", "Lkf/i;", "n", "uiEventFlow", "Lkf/f;", "o", "_viewFlow", "viewFlow", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements xd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r observerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ButtonComponentParams componentParams;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PaymentMethod paymentMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final OrderRequest order;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsManager analyticsManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o<BacsDirectDebitComponentState> submitHandler;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final BacsDirectDebitInputData inputData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<BacsDirectDebitOutputData> _outputDataFlow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Flow<BacsDirectDebitOutputData> outputDataFlow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<BacsDirectDebitComponentState> _componentStateFlow;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Flow<BacsDirectDebitComponentState> componentStateFlow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Flow<BacsDirectDebitComponentState> submitFlow;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Flow<j> uiStateFlow;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Flow<i> uiEventFlow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<f> _viewFlow;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Flow<f> viewFlow;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f123287a;

        static {
            int[] iArr = new int[ud.e.values().length];
            try {
                iArr[ud.e.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ud.e.CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f123287a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyd/a;", "Ljn0/h0;", "a", "(Lyd/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<BacsDirectDebitInputData, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ud.e f123288c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ud.e eVar) {
            super(1);
            this.f123288c = eVar;
        }

        public final void a(BacsDirectDebitInputData updateInputData) {
            s.k(updateInputData, "$this$updateInputData");
            updateInputData.l(this.f123288c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(BacsDirectDebitInputData bacsDirectDebitInputData) {
            a(bacsDirectDebitInputData);
            return h0.f84049a;
        }
    }

    public e(r observerRepository, ButtonComponentParams componentParams, PaymentMethod paymentMethod, OrderRequest orderRequest, AnalyticsManager analyticsManager, o<BacsDirectDebitComponentState> submitHandler) {
        s.k(observerRepository, "observerRepository");
        s.k(componentParams, "componentParams");
        s.k(paymentMethod, "paymentMethod");
        s.k(analyticsManager, "analyticsManager");
        s.k(submitHandler, "submitHandler");
        this.observerRepository = observerRepository;
        this.componentParams = componentParams;
        this.paymentMethod = paymentMethod;
        this.order = orderRequest;
        this.analyticsManager = analyticsManager;
        this.submitHandler = submitHandler;
        this.inputData = new BacsDirectDebitInputData(null, null, null, null, false, false, null, 127, null);
        MutableStateFlow<BacsDirectDebitOutputData> MutableStateFlow = StateFlowKt.MutableStateFlow(y());
        this._outputDataFlow = MutableStateFlow;
        this.outputDataFlow = MutableStateFlow;
        MutableStateFlow<BacsDirectDebitComponentState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(x(this, null, 1, null));
        this._componentStateFlow = MutableStateFlow2;
        this.componentStateFlow = MutableStateFlow2;
        this.submitFlow = submitHandler.d();
        this.uiStateFlow = submitHandler.f();
        this.uiEventFlow = submitHandler.e();
        MutableStateFlow<f> MutableStateFlow3 = StateFlowKt.MutableStateFlow(xd.a.INPUT);
        this._viewFlow = MutableStateFlow3;
        this.viewFlow = MutableStateFlow3;
    }

    private final void B(CoroutineScope coroutineScope) {
        me.a aVar = me.a.VERBOSE;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = e.class.getName();
            s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "initializeAnalytics", null);
        }
        this.analyticsManager.b(this, coroutineScope);
        h hVar = h.f60518a;
        String type = this.paymentMethod.getType();
        if (type == null) {
            type = "";
        }
        this.analyticsManager.d(h.e(hVar, type, null, null, null, 14, null));
    }

    private final void C() {
        F(this.inputData.getMode());
        BacsDirectDebitOutputData bacsDirectDebitOutputDataY = y();
        this._outputDataFlow.tryEmit(bacsDirectDebitOutputDataY);
        E(bacsDirectDebitOutputDataY);
    }

    private final void F(ud.e mode) {
        xd.a aVar;
        int i11 = a.f123287a[mode.ordinal()];
        if (i11 == 1) {
            aVar = xd.a.INPUT;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = xd.a.CONFIRMATION;
        }
        if (this._viewFlow.getValue() != aVar) {
            me.a aVar2 = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar2)) {
                String name = e.class.getName();
                s.h(name);
                String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = t.W0(strU1, "Kt");
                }
                me.b bVarA = companion.a();
                bVarA.b(aVar2, "CO." + name, "Updating view flow to " + aVar, null);
            }
            this._viewFlow.tryEmit(aVar);
        }
    }

    private final BacsDirectDebitComponentState w(BacsDirectDebitOutputData outputData) {
        return new BacsDirectDebitComponentState(new PaymentComponentData(new BacsDirectDebitPaymentMethod(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE, this.analyticsManager.c(), outputData.b().b(), outputData.a().b(), outputData.e().b()), this.order, getComponentParams().getAmount(), null, null, null, null, null, null, outputData.d().b(), null, null, null, null, 15864, null), outputData.h(), true, outputData.getMode());
    }

    static /* synthetic */ BacsDirectDebitComponentState x(e eVar, BacsDirectDebitOutputData bacsDirectDebitOutputData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bacsDirectDebitOutputData = eVar.c();
        }
        return eVar.w(bacsDirectDebitOutputData);
    }

    private final BacsDirectDebitOutputData y() {
        c cVar = c.f123269a;
        return new BacsDirectDebitOutputData(cVar.b(this.inputData.getHolderName()), cVar.a(this.inputData.getBankAccountNumber()), cVar.d(this.inputData.getSortCode()), cVar.c(this.inputData.getShopperEmail()), this.inputData.getIsAmountConsentChecked(), this.inputData.getIsAccountConsentChecked(), this.inputData.getMode());
    }

    public Flow<BacsDirectDebitComponentState> A() {
        return this.submitFlow;
    }

    public void D() {
        this.observerRepository.b();
    }

    public final void E(BacsDirectDebitOutputData outputData) {
        s.k(outputData, "outputData");
        this._componentStateFlow.tryEmit(w(outputData));
    }

    @Override // je.b
    public void b() {
        D();
        this.analyticsManager.a(this);
    }

    @Override // xd.b
    public BacsDirectDebitOutputData c() {
        return this._outputDataFlow.getValue();
    }

    @Override // kf.r
    public Flow<f> d() {
        return this.viewFlow;
    }

    @Override // kf.p
    public Flow<i> f() {
        return this.uiEventFlow;
    }

    @Override // je.b
    public void g(CoroutineScope coroutineScope) {
        s.k(coroutineScope, "coroutineScope");
        this.submitHandler.g(coroutineScope, z());
        B(coroutineScope);
    }

    @Override // xd.b
    public Flow<BacsDirectDebitOutputData> h() {
        return this.outputDataFlow;
    }

    @Override // je.d
    public void i(LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope, l<? super p<BacsDirectDebitComponentState>, h0> callback) {
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(coroutineScope, "coroutineScope");
        s.k(callback, "callback");
        this.observerRepository.a(z(), null, A(), lifecycleOwner, coroutineScope, callback);
    }

    @Override // kf.p
    public Flow<j> k() {
        return this.uiStateFlow;
    }

    @Override // kf.c
    public void l() {
        BacsDirectDebitComponentState value = this._componentStateFlow.getValue();
        int i11 = a.f123287a[this.inputData.getMode().ordinal()];
        if (i11 == 1) {
            if (c().h()) {
                s(ud.e.CONFIRMATION);
                return;
            } else {
                this.submitHandler.i(value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        h hVar = h.f60518a;
        String type = this.paymentMethod.getType();
        if (type == null) {
            type = "";
        }
        this.analyticsManager.d(hVar.f(type));
        this.submitHandler.i(value);
    }

    @Override // xd.b
    public void m(boolean isInteractionBlocked) {
        this.submitHandler.m(isInteractionBlocked);
    }

    @Override // kf.c
    public boolean p() {
        return this._viewFlow.getValue() instanceof kf.b;
    }

    @Override // xd.b
    public boolean s(ud.e mode) {
        s.k(mode, "mode");
        if (mode == this.inputData.getMode()) {
            me.a aVar = me.a.ERROR;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = e.class.getName();
                s.h(name);
                String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = t.W0(strU1, "Kt");
                }
                me.b bVarA = companion.a();
                bVarA.b(aVar, "CO." + name, "Current mode is already " + mode, null);
            }
            return false;
        }
        if (mode == ud.e.CONFIRMATION && !c().h()) {
            me.a aVar2 = me.a.ERROR;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (companion2.a().a(aVar2)) {
                String name2 = e.class.getName();
                s.h(name2);
                String strU2 = t.u1(t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU2.length() != 0) {
                    name2 = t.W0(strU2, "Kt");
                }
                companion2.a().b(aVar2, "CO." + name2, "Cannot set confirmation view when input is not valid", null);
            }
            return false;
        }
        me.a aVar3 = me.a.DEBUG;
        me.b.Companion companion3 = me.b.INSTANCE;
        if (companion3.a().a(aVar3)) {
            String name3 = e.class.getName();
            s.h(name3);
            String strU3 = t.u1(t.y1(name3, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU3.length() != 0) {
                name3 = t.W0(strU3, "Kt");
            }
            me.b bVarA2 = companion3.a();
            bVarA2.b(aVar3, "CO." + name3, "Setting mode to " + mode, null);
        }
        t(new b(mode));
        return true;
    }

    @Override // xd.b
    public void t(l<? super BacsDirectDebitInputData, h0> update) {
        s.k(update, "update");
        update.invoke(this.inputData);
        C();
    }

    @Override // kf.c
    public boolean u() {
        return p() && getComponentParams().getIsSubmitButtonVisible();
    }

    public Flow<BacsDirectDebitComponentState> z() {
        return this.componentStateFlow;
    }

    @Override // je.b
    /* JADX INFO: renamed from: e, reason: from getter */
    public ButtonComponentParams getComponentParams() {
        return this.componentParams;
    }
}
