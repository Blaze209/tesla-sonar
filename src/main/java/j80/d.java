package j80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.PaymentMethod;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.StateFlow;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import s60.FormHeaderInformation;
import u60.PaymentMethodMetadata;
import u70.FormFieldValues;
import y70.FormArguments;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001!B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\u0016\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\"R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010=\u001a\b\u0012\u0004\u0012\u0002080\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lj80/d;", "Lj80/s;", "", "selectedPaymentMethodCode", "Ly70/a;", "formArguments", "", "Li90/d0;", "formElements", "Lkotlin/Function2;", "Lu70/c;", "Ljn0/h0;", "onFormFieldValuesChanged", "Lz70/d;", "usBankAccountArguments", "Lkotlin/Function1;", "reportFieldInteraction", "Ls60/a;", "headerInformation", "Lkotlin/Function0;", "", "canGoBackDelegate", "isLiveMode", "Lkotlinx/coroutines/flow/StateFlow;", "processing", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Ljava/lang/String;Ly70/a;Ljava/util/List;Lwn0/p;Lz70/d;Lwn0/l;Ls60/a;Lwn0/a;ZLkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/CoroutineScope;)V", "Lj80/s$b;", "viewAction", "b", "(Lj80/s$b;)V", "a", "()Z", "close", "()V", "Ljava/lang/String;", "Ly70/a;", "c", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "e", "Lz70/d;", "f", "Lwn0/l;", "g", "Ls60/a;", "h", "Lwn0/a;", IntegerTokenConverter.CONVERTER_KEY, "Z", "n", "j", "Lkotlinx/coroutines/CoroutineScope;", "Lj80/s$a;", "k", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "l", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements s {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f82898m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String selectedPaymentMethodCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FormArguments formArguments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<d0> formElements;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<FormFieldValues, String, h0> onFormFieldValuesChanged;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p027z70.d usBankAccountArguments;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, h0> reportFieldInteraction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final FormHeaderInformation headerInformation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Boolean> canGoBackDelegate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<s.State> state;

    /* JADX INFO: renamed from: j80.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj80/d$a;", "", "<init>", "()V", "", "selectedPaymentMethodCode", "Lk80/a;", "viewModel", "Lu60/e;", "paymentMethodMetadata", "Ln70/b;", "customerStateHolder", "Lj80/s;", "a", "(Ljava/lang/String;Lk80/a;Lu60/e;Ln70/b;)Lj80/s;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: j80.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class C1742a extends p013kotlin.jvm.internal.p implements wn0.p<FormFieldValues, String, h0> {
            C1742a(Object obj) {
                super(2, obj, n70.k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void a(FormFieldValues formFieldValues, String p11) {
                p013kotlin.jvm.internal.s.k(p11, "p1");
                ((n70.k) this.receiver).c(formFieldValues, p11);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(FormFieldValues formFieldValues, String str) {
                a(formFieldValues, str);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.d$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<String, h0> {
            b(Object obj) {
                super(1, obj, q70.a.class, "reportFieldInteraction", "reportFieldInteraction(Ljava/lang/String;)V", 0);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                o(str);
                return h0.f84049a;
            }

            public final void o(String p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                ((q70.a) this.receiver).f(p11);
            }
        }

        /* JADX INFO: renamed from: j80.d$a$c */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f82910c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(k80.a aVar) {
                super(0);
                this.f82910c = aVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(this.f82910c.getNavigationHandler().e());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(String selectedPaymentMethodCode, k80.a viewModel, PaymentMethodMetadata paymentMethodMetadata, n70.b customerStateHolder) {
            p013kotlin.jvm.internal.s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
            p013kotlin.jvm.internal.s.k(customerStateHolder, "customerStateHolder");
            boolean z11 = true;
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
            n70.k kVarA = n70.k.INSTANCE.a(viewModel, n70.m.INSTANCE.a(viewModel, CoroutineScope), paymentMethodMetadata);
            FormArguments formArgumentsA = kVarA.a(selectedPaymentMethodCode);
            List<d0> listB = kVarA.b(selectedPaymentMethodCode);
            C1742a c1742a = new C1742a(kVarA);
            p027z70.d dVarA = p027z70.d.INSTANCE.a(viewModel, paymentMethodMetadata, "payment_element", selectedPaymentMethodCode);
            List<PaymentMethod> value = customerStateHolder.c().getValue();
            if ((value instanceof Collection) && value.isEmpty()) {
                z11 = false;
            } else {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    PaymentMethod.p pVar = ((PaymentMethod) it.next()).type;
                    if (p013kotlin.jvm.internal.s.f(pVar != null ? pVar.code : null, selectedPaymentMethodCode)) {
                    }
                }
                z11 = false;
            }
            return new d(selectedPaymentMethodCode, formArgumentsA, listB, c1742a, dVarA, new b(viewModel.getAnalyticsListener()), paymentMethodMetadata.e(selectedPaymentMethodCode, z11), new c(viewModel), paymentMethodMetadata.getStripeIntent().getIsLiveMode(), viewModel.z(), CoroutineScope);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isProcessing", "Lj80/s$a;", "a", "(Z)Lj80/s$a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Boolean, s.State> {
        b() {
            super(1);
        }

        public final s.State a(boolean z11) {
            return new s.State(d.this.selectedPaymentMethodCode, z11, d.this.usBankAccountArguments, d.this.formArguments, d.this.formElements, d.this.headerInformation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ s.State invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(String selectedPaymentMethodCode, FormArguments formArguments, List<? extends d0> formElements, wn0.p<? super FormFieldValues, ? super String, h0> onFormFieldValuesChanged, p027z70.d usBankAccountArguments, wn0.l<? super String, h0> reportFieldInteraction, FormHeaderInformation formHeaderInformation, wn0.a<Boolean> canGoBackDelegate, boolean z11, StateFlow<Boolean> processing, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        p013kotlin.jvm.internal.s.k(formArguments, "formArguments");
        p013kotlin.jvm.internal.s.k(formElements, "formElements");
        p013kotlin.jvm.internal.s.k(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        p013kotlin.jvm.internal.s.k(usBankAccountArguments, "usBankAccountArguments");
        p013kotlin.jvm.internal.s.k(reportFieldInteraction, "reportFieldInteraction");
        p013kotlin.jvm.internal.s.k(canGoBackDelegate, "canGoBackDelegate");
        p013kotlin.jvm.internal.s.k(processing, "processing");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.selectedPaymentMethodCode = selectedPaymentMethodCode;
        this.formArguments = formArguments;
        this.formElements = formElements;
        this.onFormFieldValuesChanged = onFormFieldValuesChanged;
        this.usBankAccountArguments = usBankAccountArguments;
        this.reportFieldInteraction = reportFieldInteraction;
        this.headerInformation = formHeaderInformation;
        this.canGoBackDelegate = canGoBackDelegate;
        this.isLiveMode = z11;
        this.coroutineScope = coroutineScope;
        this.state = r90.g.m(processing, new b());
    }

    @Override // j80.s
    public boolean a() {
        return this.canGoBackDelegate.invoke().booleanValue();
    }

    @Override // j80.s
    public void b(s.b viewAction) {
        p013kotlin.jvm.internal.s.k(viewAction, "viewAction");
        if (p013kotlin.jvm.internal.s.f(viewAction, s.b.a.f83105a)) {
            this.reportFieldInteraction.invoke(this.selectedPaymentMethodCode);
        } else if (viewAction instanceof s.b.FormFieldValuesChanged) {
            this.onFormFieldValuesChanged.invoke(((s.b.FormFieldValuesChanged) viewAction).getFormValues(), this.selectedPaymentMethodCode);
        }
    }

    @Override // j80.s
    public void close() {
        CoroutineScopeKt.cancel$default(this.coroutineScope, null, 1, null);
    }

    @Override // j80.s
    public StateFlow<s.State> getState() {
        return this.state;
    }

    @Override // j80.s
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }
}
