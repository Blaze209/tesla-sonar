package n70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import m60.InlineSignupViewState;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import u70.FormFieldValues;
import y70.FormArguments;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001\u001fBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u001e2\n\u0010\u001d\u001a\u00060\u0013j\u0002`\u001c¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\"\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010-R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,¨\u00060"}, d2 = {"Ln70/k;", "", "Lh30/b$a;", "cardAccountRangeRepositoryFactory", "Lu60/e;", "paymentMethodMetadata", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/m;", "newPaymentSelectionProvider", "Lkotlin/Function1;", "Lw70/j;", "Ljn0/h0;", "selectionUpdater", "Lc60/d;", "linkConfigurationCoordinator", "Lm60/e;", "onLinkInlineSignupStateChanged", "<init>", "(Lh30/b$a;Lu60/e;Lwn0/a;Lwn0/l;Lc60/d;Lwn0/l;)V", "", "code", "Lt60/g;", "e", "(Ljava/lang/String;)Lt60/g;", "", "Li90/d0;", "b", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodCode", "Ly70/a;", "a", "(Ljava/lang/String;)Ly70/a;", "Lu70/c;", "formValues", "selectedPaymentMethodCode", "c", "(Lu70/c;Ljava/lang/String;)V", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Z", "Lh30/b$a;", "Lu60/e;", "Lwn0/a;", "Lwn0/l;", "Lc60/d;", "f", "g", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f93421h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h30.b.a cardAccountRangeRepositoryFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PaymentMethodMetadata paymentMethodMetadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<com.stripe.android.paymentsheet.m> newPaymentSelectionProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<w70.j, h0> selectionUpdater;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c60.d linkConfigurationCoordinator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<InlineSignupViewState, h0> onLinkInlineSignupStateChanged;

    /* JADX INFO: renamed from: n70.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ln70/k$a;", "", "<init>", "()V", "Lk80/a;", "viewModel", "Ln70/m;", "linkInlineHandler", "Lu60/e;", "paymentMethodMetadata", "Ln70/k;", "a", "(Lk80/a;Ln70/m;Lu60/e;)Ln70/k;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n70.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class C1995a extends p013kotlin.jvm.internal.p implements wn0.l<InlineSignupViewState, h0> {
            C1995a(Object obj) {
                super(1, obj, m.class, "onStateUpdated", "onStateUpdated(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V", 0);
            }

            public final void a(InlineSignupViewState p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                ((m) this.receiver).h(p11);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(InlineSignupViewState inlineSignupViewState) {
                a(inlineSignupViewState);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: n70.k$a$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/m;", "b", "()Lcom/stripe/android/paymentsheet/m;"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.a<com.stripe.android.paymentsheet.m> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f93428c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k80.a aVar) {
                super(0);
                this.f93428c = aVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.paymentsheet.m invoke() {
                return this.f93428c.getNewPaymentSelection();
            }
        }

        /* JADX INFO: renamed from: n70.k$a$c */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw70/j;", "it", "Ljn0/h0;", "a", "(Lw70/j;)V"}, k = 3, mv = {1, 9, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.l<w70.j, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f93429c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(k80.a aVar) {
                super(1);
                this.f93429c = aVar;
            }

            public final void a(w70.j jVar) {
                this.f93429c.Q(jVar);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w70.j jVar) {
                a(jVar);
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(k80.a viewModel, m linkInlineHandler, PaymentMethodMetadata paymentMethodMetadata) {
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            p013kotlin.jvm.internal.s.k(linkInlineHandler, "linkInlineHandler");
            p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
            return new k(viewModel.getCardAccountRangeRepositoryFactory(), paymentMethodMetadata, new b(viewModel), new c(viewModel), viewModel.getLinkHandler().getLinkConfigurationCoordinator(), new C1995a(linkInlineHandler));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(h30.b.a cardAccountRangeRepositoryFactory, PaymentMethodMetadata paymentMethodMetadata, wn0.a<? extends com.stripe.android.paymentsheet.m> newPaymentSelectionProvider, wn0.l<? super w70.j, h0> selectionUpdater, c60.d linkConfigurationCoordinator, wn0.l<? super InlineSignupViewState, h0> onLinkInlineSignupStateChanged) {
        p013kotlin.jvm.internal.s.k(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
        p013kotlin.jvm.internal.s.k(newPaymentSelectionProvider, "newPaymentSelectionProvider");
        p013kotlin.jvm.internal.s.k(selectionUpdater, "selectionUpdater");
        p013kotlin.jvm.internal.s.k(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        p013kotlin.jvm.internal.s.k(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
        this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.newPaymentSelectionProvider = newPaymentSelectionProvider;
        this.selectionUpdater = selectionUpdater;
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
        this.onLinkInlineSignupStateChanged = onLinkInlineSignupStateChanged;
    }

    private final SupportedPaymentMethod e(String code) {
        SupportedPaymentMethod supportedPaymentMethodG = this.paymentMethodMetadata.G(code);
        if (supportedPaymentMethodG != null) {
            return supportedPaymentMethodG;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final FormArguments a(String paymentMethodCode) {
        p013kotlin.jvm.internal.s.k(paymentMethodCode, "paymentMethodCode");
        return u70.b.f115807a.a(paymentMethodCode, this.paymentMethodMetadata);
    }

    public final List<d0> b(String code) {
        p013kotlin.jvm.internal.s.k(code, "code");
        com.stripe.android.paymentsheet.m mVarInvoke = this.newPaymentSelectionProvider.invoke();
        if (mVarInvoke == null || !p013kotlin.jvm.internal.s.f(mVarInvoke.getType(), code)) {
            mVarInvoke = null;
        }
        List<d0> listD = this.paymentMethodMetadata.d(code, new u60.k.a.InterfaceC2488a.C2489a(this.cardAccountRangeRepositoryFactory, this.linkConfigurationCoordinator, this.onLinkInlineSignupStateChanged, mVarInvoke != null ? mVarInvoke.c() : null, mVarInvoke != null ? mVarInvoke.a() : null));
        return listD == null ? p013kotlin.collections.v.m() : listD;
    }

    public final void c(FormFieldValues formValues, String selectedPaymentMethodCode) {
        p013kotlin.jvm.internal.s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        this.selectionUpdater.invoke(formValues != null ? p008h80.c.g(formValues, e(selectedPaymentMethodCode), this.paymentMethodMetadata) : null);
    }

    public final boolean d(String selectedPaymentMethodCode) {
        p013kotlin.jvm.internal.s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        List<d0> listB = b(selectedPaymentMethodCode);
        if (!(listB instanceof Collection) || !listB.isEmpty()) {
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                if (((d0) it.next()).getAllowsUserInteraction()) {
                    return true;
                }
            }
        }
        return p013kotlin.jvm.internal.s.f(selectedPaymentMethodCode, PaymentMethod.p.USBankAccount.code) || p013kotlin.jvm.internal.s.f(selectedPaymentMethodCode, PaymentMethod.p.Link.code);
    }
}
