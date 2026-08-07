package j80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.f0;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import u60.PaymentMethodMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0013BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lj80/a;", "Lj80/f;", "Lcom/stripe/android/model/v0;", "paymentMethod", "Lu60/e;", "paymentMethodMetadata", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lx30/c;", "providePaymentMethodName", "Ljn0/h0;", "onDeletePaymentMethod", "Lkotlin/Function0;", "navigateBack", "<init>", "(Lcom/stripe/android/model/v0;Lu60/e;Lwn0/l;Lwn0/l;Lwn0/a;)V", "Lj80/f$b;", "viewAction", "a", "(Lj80/f$b;)V", "Lwn0/l;", "b", "Lwn0/a;", "Lj80/f$a;", "c", "Lj80/f$a;", "getState", "()Lj80/f$a;", "state", DateTokenConverter.CONVERTER_KEY, "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f82805e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<PaymentMethod, h0> onDeletePaymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> navigateBack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f.State state;

    /* JADX INFO: renamed from: j80.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj80/a$a;", "", "<init>", "()V", "Lk80/a;", "viewModel", "Lu60/e;", "paymentMethodMetadata", "Ln70/b;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/f0;", "savedPaymentMethodMutator", "Lj80/f;", "a", "(Lk80/a;Lu60/e;Ln70/b;Lcom/stripe/android/paymentsheet/f0;)Lj80/f;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: j80.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class C1733a extends p013kotlin.jvm.internal.p implements wn0.l<PaymentMethod, h0> {
            C1733a(Object obj) {
                super(1, obj, f0.class, "removePaymentMethod", "removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void a(PaymentMethod p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                ((f0) this.receiver).u(p11);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(PaymentMethod paymentMethod) {
                a(paymentMethod);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: j80.a$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
            b(Object obj) {
                super(0, obj, k80.a.class, "handleBackPressed", "handleBackPressed()V", 0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                o();
                return h0.f84049a;
            }

            public final void o() {
                ((k80.a) this.receiver).G();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(k80.a viewModel, PaymentMethodMetadata paymentMethodMetadata, n70.b customerStateHolder, f0 savedPaymentMethodMutator) {
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
            p013kotlin.jvm.internal.s.k(customerStateHolder, "customerStateHolder");
            p013kotlin.jvm.internal.s.k(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            return new a((PaymentMethod) v.o0(customerStateHolder.c().getValue()), paymentMethodMetadata, savedPaymentMethodMutator.q(), new C1733a(savedPaymentMethodMutator), new b(viewModel));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(PaymentMethod paymentMethod, PaymentMethodMetadata paymentMethodMetadata, wn0.l<? super String, ? extends x30.c> providePaymentMethodName, wn0.l<? super PaymentMethod, h0> onDeletePaymentMethod, wn0.a<h0> navigateBack) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
        p013kotlin.jvm.internal.s.k(providePaymentMethodName, "providePaymentMethodName");
        p013kotlin.jvm.internal.s.k(onDeletePaymentMethod, "onDeletePaymentMethod");
        p013kotlin.jvm.internal.s.k(navigateBack, "navigateBack");
        this.onDeletePaymentMethod = onDeletePaymentMethod;
        this.navigateBack = navigateBack;
        this.state = new f.State(q.a(paymentMethod, providePaymentMethodName, paymentMethodMetadata), paymentMethodMetadata.getStripeIntent().getIsLiveMode());
    }

    @Override // j80.f
    public void a(f.b viewAction) {
        p013kotlin.jvm.internal.s.k(viewAction, "viewAction");
        if (viewAction instanceof f.b.a) {
            this.onDeletePaymentMethod.invoke(getState().getPaymentMethod().getPaymentMethod());
            this.navigateBack.invoke();
        }
    }

    @Override // j80.f
    public f.State getState() {
        return this.state;
    }
}
