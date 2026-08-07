package p027z70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n0;
import com.stripe.android.payments.bankaccount.navigation.e;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.c0;
import com.stripe.android.paymentsheet.m;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.y;
import jn0.h0;
import k80.a;
import kotlinx.coroutines.flow.MutableStateFlow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p017o70.AddressDetails;
import t60.f;
import u60.PaymentMethodMetadata;
import w70.j;
import wn0.l;
import wn0.p;
import x30.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001\"Bÿ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u001a\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u0016\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016\u0012\"\u0010\u001c\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0016\u0012\u0004\u0012\u00020\u00140\u0016\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u0016\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b.\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b/\u0010%R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b0\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b\"\u0010-R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b*\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b&\u0010;R+\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b5\u0010>R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u00168\u0006¢\u0006\f\n\u0004\b7\u0010?\u001a\u0004\b3\u0010@R%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b.\u0010?\u001a\u0004\b1\u0010@R3\u0010\u001c\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0016\u0012\u0004\u0012\u00020\u00140\u00168\u0006¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\b<\u0010@R#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u00168\u0006¢\u0006\f\n\u0004\b/\u0010?\u001a\u0004\b9\u0010@R%\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u00168\u0006¢\u0006\f\n\u0004\b0\u0010?\u001a\u0004\b4\u0010@¨\u0006B"}, d2 = {"Lz70/d;", "", "", "instantDebits", "Lcom/stripe/android/model/n0;", "linkMode", "", "onBehalfOf", "showCheckbox", "isCompleteFlow", "isPaymentFlow", "stripeIntentId", "clientSecret", "hostedSurface", "Lo70/a;", "shippingDetails", "Lw70/j;", "draftPaymentSelection", "Lkotlin/Function2;", "Lx30/c;", "Ljn0/h0;", "onMandateTextChanged", "Lkotlin/Function1;", "Lw70/j$e$d;", "onConfirmUSBankAccount", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "onCollectBankAccountResult", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "onUpdatePrimaryButtonUIState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;", "onUpdatePrimaryButtonState", "onError", "<init>", "(ZLcom/stripe/android/model/n0;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo70/a;Lw70/j;Lwn0/p;Lwn0/l;Lwn0/l;Lwn0/l;Lwn0/l;Lwn0/l;)V", "a", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "Lcom/stripe/android/model/n0;", "e", "()Lcom/stripe/android/model/n0;", "c", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "n", "p", "q", "g", "o", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Lo70/a;", "m", "()Lo70/a;", "k", "Lw70/j;", "()Lw70/j;", "l", "Lwn0/p;", "()Lwn0/p;", "Lwn0/l;", "()Lwn0/l;", "r", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f127153s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean instantDebits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n0 linkMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String onBehalfOf;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean showCheckbox;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isCompleteFlow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isPaymentFlow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String stripeIntentId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String clientSecret;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String hostedSurface;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AddressDetails shippingDetails;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final j draftPaymentSelection;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p<c, Boolean, h0> onMandateTextChanged;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final l<j.e.USBankAccount, h0> onConfirmUSBankAccount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final l<e, h0> onCollectBankAccountResult;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final l<l<? super PrimaryButton.UIState, PrimaryButton.UIState>, h0> onUpdatePrimaryButtonUIState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final l<PrimaryButton.a, h0> onUpdatePrimaryButtonState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final l<c, h0> onError;

    /* JADX INFO: renamed from: z70.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lz70/d$a;", "", "<init>", "()V", "Lk80/a;", "viewModel", "Lu60/e;", "paymentMethodMetadata", "", "hostedSurface", "selectedPaymentMethodCode", "Lz70/d;", "a", "(Lk80/a;Lu60/e;Ljava/lang/String;Ljava/lang/String;)Lz70/d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: z70.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class C2758a extends p013kotlin.jvm.internal.p implements p<x30.c, Boolean, h0> {
            C2758a(Object obj) {
                super(2, obj, com.stripe.android.paymentsheet.l.class, "updateMandateText", "updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V", 0);
            }

            public final void a(x30.c cVar, boolean z11) {
                ((com.stripe.android.paymentsheet.l) this.receiver).e(cVar, z11);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(x30.c cVar, Boolean bool) {
                a(cVar, bool.booleanValue());
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: z70.d$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements l<j.e.USBankAccount, h0> {
            b(Object obj) {
                super(1, obj, a.class, "handleConfirmUSBankAccount", "handleConfirmUSBankAccount(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V", 0);
            }

            public final void a(j.e.USBankAccount p11) {
                s.k(p11, "p0");
                ((a) this.receiver).H(p11);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(j.e.USBankAccount uSBankAccount) {
                a(uSBankAccount);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: z70.d$a$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class c extends p013kotlin.jvm.internal.p implements l<PrimaryButton.a, h0> {
            c(Object obj) {
                super(1, obj, a.class, "updatePrimaryButtonState", "updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V", 0);
            }

            public final void a(PrimaryButton.a p11) {
                s.k(p11, "p0");
                ((a) this.receiver).P(p11);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(PrimaryButton.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: z70.d$a$d, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class C2759d extends p013kotlin.jvm.internal.p implements l<x30.c, h0> {
            C2759d(Object obj) {
                super(1, obj, a.class, "onError", "onError(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
            }

            public final void a(x30.c cVar) {
                ((a) this.receiver).K(cVar);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(x30.c cVar) {
                a(cVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: z70.d$a$e, reason: from Kotlin metadata */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "it", "Ljn0/h0;", "a", "(Lwn0/l;)V"}, k = 3, mv = {1, 9, 0})
        static final class Function1 extends u implements l<l<? super PrimaryButton.UIState, ? extends PrimaryButton.UIState>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f127171c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            Function1(a aVar) {
                super(1);
                this.f127171c = aVar;
            }

            public final void a(l<? super PrimaryButton.UIState, PrimaryButton.UIState> it) {
                PrimaryButton.UIState value;
                s.k(it, "it");
                MutableStateFlow<PrimaryButton.UIState> mutableStateFlowK = this.f127171c.k();
                do {
                    value = mutableStateFlowK.getValue();
                } while (!mutableStateFlowK.compareAndSet(value, it.invoke(value)));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(l<? super PrimaryButton.UIState, ? extends PrimaryButton.UIState> lVar) {
                a(lVar);
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(a viewModel, PaymentMethodMetadata paymentMethodMetadata, String hostedSurface, String selectedPaymentMethodCode) {
            y.n intentConfiguration;
            PaymentSheetContractV2.Args args;
            s.k(viewModel, "viewModel");
            s.k(paymentMethodMetadata, "paymentMethodMetadata");
            s.k(hostedSurface, "hostedSurface");
            s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            boolean zA = f.a(selectedPaymentMethodCode, paymentMethodMetadata.getPaymentMethodSaveConsentBehavior(), paymentMethodMetadata.getStripeIntent(), paymentMethodMetadata.getHasCustomerConfiguration());
            boolean zF = s.f(selectedPaymentMethodCode, PaymentMethod.p.Link.code);
            c0 c0Var = viewModel instanceof c0 ? (c0) viewModel : null;
            y.m initializationMode = (c0Var == null || (args = c0Var.getArgs()) == null) ? null : args.getInitializationMode();
            y.m.DeferredIntent deferredIntent = initializationMode instanceof y.m.DeferredIntent ? (y.m.DeferredIntent) initializationMode : null;
            String onBehalfOf = (deferredIntent == null || (intentConfiguration = deferredIntent.getIntentConfiguration()) == null) ? null : intentConfiguration.getOnBehalfOf();
            StripeIntent stripeIntent = paymentMethodMetadata.getStripeIntent();
            boolean z11 = zA && !zF;
            n0 linkMode = paymentMethodMetadata.getLinkMode();
            boolean isCompleteFlow = viewModel.getIsCompleteFlow();
            boolean z12 = stripeIntent instanceof PaymentIntent;
            String id2 = stripeIntent.getId();
            String clientSecret = stripeIntent.getClientSecret();
            AddressDetails shippingDetails = viewModel.getConfig().getShippingDetails();
            m newPaymentSelection = viewModel.getNewPaymentSelection();
            return new d(zF, linkMode, onBehalfOf, z11, isCompleteFlow, z12, id2, clientSecret, hostedSurface, shippingDetails, newPaymentSelection != null ? newPaymentSelection.b() : null, new C2758a(viewModel.getMandateHandler()), new b(viewModel), null, new Function1(viewModel), new c(viewModel), new C2759d(viewModel));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(boolean z11, n0 n0Var, String str, boolean z12, boolean z13, boolean z14, String str2, String str3, String hostedSurface, AddressDetails addressDetails, j jVar, p<? super c, ? super Boolean, h0> onMandateTextChanged, l<? super j.e.USBankAccount, h0> onConfirmUSBankAccount, l<? super e, h0> lVar, l<? super l<? super PrimaryButton.UIState, PrimaryButton.UIState>, h0> onUpdatePrimaryButtonUIState, l<? super PrimaryButton.a, h0> onUpdatePrimaryButtonState, l<? super c, h0> onError) {
        s.k(hostedSurface, "hostedSurface");
        s.k(onMandateTextChanged, "onMandateTextChanged");
        s.k(onConfirmUSBankAccount, "onConfirmUSBankAccount");
        s.k(onUpdatePrimaryButtonUIState, "onUpdatePrimaryButtonUIState");
        s.k(onUpdatePrimaryButtonState, "onUpdatePrimaryButtonState");
        s.k(onError, "onError");
        this.instantDebits = z11;
        this.linkMode = n0Var;
        this.onBehalfOf = str;
        this.showCheckbox = z12;
        this.isCompleteFlow = z13;
        this.isPaymentFlow = z14;
        this.stripeIntentId = str2;
        this.clientSecret = str3;
        this.hostedSurface = hostedSurface;
        this.shippingDetails = addressDetails;
        this.draftPaymentSelection = jVar;
        this.onMandateTextChanged = onMandateTextChanged;
        this.onConfirmUSBankAccount = onConfirmUSBankAccount;
        this.onCollectBankAccountResult = lVar;
        this.onUpdatePrimaryButtonUIState = onUpdatePrimaryButtonUIState;
        this.onUpdatePrimaryButtonState = onUpdatePrimaryButtonState;
        this.onError = onError;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final j getDraftPaymentSelection() {
        return this.draftPaymentSelection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHostedSurface() {
        return this.hostedSurface;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getInstantDebits() {
        return this.instantDebits;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n0 getLinkMode() {
        return this.linkMode;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final l<e, h0> g() {
        return this.onCollectBankAccountResult;
    }

    public final l<j.e.USBankAccount, h0> h() {
        return this.onConfirmUSBankAccount;
    }

    public final l<c, h0> i() {
        return this.onError;
    }

    public final p<c, Boolean, h0> j() {
        return this.onMandateTextChanged;
    }

    public final l<PrimaryButton.a, h0> k() {
        return this.onUpdatePrimaryButtonState;
    }

    public final l<l<? super PrimaryButton.UIState, PrimaryButton.UIState>, h0> l() {
        return this.onUpdatePrimaryButtonUIState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final AddressDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getShowCheckbox() {
        return this.showCheckbox;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getStripeIntentId() {
        return this.stripeIntentId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsCompleteFlow() {
        return this.isCompleteFlow;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsPaymentFlow() {
        return this.isPaymentFlow;
    }
}
