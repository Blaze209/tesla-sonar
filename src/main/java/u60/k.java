package u60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.x0;
import com.stripe.android.paymentsheet.y;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import m60.InlineSignupViewState;
import p010i90.IdentifierSpec;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p017o70.AddressDetails;
import s60.FormHeaderInformation;
import t60.SupportedPaymentMethod;
import wn0.l;
import z80.SharedDataSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u000bJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, d2 = {"Lu60/k;", "", "Lu60/c;", "definition", "", "Lz80/g2;", "sharedDataSpecs", "", "h", "(Lu60/c;Ljava/util/List;)Z", "Lt60/g;", DateTokenConverter.CONVERTER_KEY, "(Lu60/c;Ljava/util/List;)Lt60/g;", "Lu60/e;", OrcaKeys.METADATA, "customerHasSavedPaymentMethods", "Ls60/a;", "j", "(Lu60/c;Lu60/e;Ljava/util/List;Z)Ls60/a;", "Lu60/k$a;", "arguments", "Li90/d0;", "g", "(Lu60/c;Lu60/e;Ljava/util/List;Lu60/k$a;)Ljava/util/List;", "a", "c", "Lu60/k$c;", "Lu60/k$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface k {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        /* JADX WARN: Code duplicated, block: B:15:0x003b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x003c A[RETURN] */
        public static boolean a(k kVar, u60.c definition, List<SharedDataSpec> sharedDataSpecs) {
            s.k(definition, "definition");
            s.k(sharedDataSpecs, "sharedDataSpecs");
            if (kVar instanceof d) {
                return true;
            }
            if (!(kVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            for (Object obj : sharedDataSpecs) {
                if (s.f(((SharedDataSpec) obj).getType(), definition.getType().code)) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            obj = null;
            if (obj != null) {
                return true;
            }
            return false;
        }

        public static List<d0> b(k kVar, u60.c definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, a arguments) {
            Object next;
            s.k(definition, "definition");
            s.k(metadata, "metadata");
            s.k(sharedDataSpecs, "sharedDataSpecs");
            s.k(arguments, "arguments");
            if (kVar instanceof d) {
                return ((d) kVar).i(metadata, arguments);
            }
            if (!(kVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = sharedDataSpecs.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.f(((SharedDataSpec) next).getType(), definition.getType().code));
            SharedDataSpec sharedDataSpec = (SharedDataSpec) next;
            if (sharedDataSpec != null) {
                return ((c) kVar).f(metadata, sharedDataSpec, new t60.h(arguments));
            }
            return null;
        }

        public static FormHeaderInformation c(k kVar, u60.c definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, boolean z11) {
            Object next;
            s.k(definition, "definition");
            s.k(metadata, "metadata");
            s.k(sharedDataSpecs, "sharedDataSpecs");
            if (kVar instanceof d) {
                return ((d) kVar).a(z11);
            }
            if (!(kVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = sharedDataSpecs.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.f(((SharedDataSpec) next).getType(), definition.getType().code));
            SharedDataSpec sharedDataSpec = (SharedDataSpec) next;
            if (sharedDataSpec != null) {
                return ((c) kVar).e(sharedDataSpec);
            }
            return null;
        }

        public static SupportedPaymentMethod d(k kVar, u60.c definition, List<SharedDataSpec> sharedDataSpecs) {
            Object next;
            s.k(definition, "definition");
            s.k(sharedDataSpecs, "sharedDataSpecs");
            if (kVar instanceof d) {
                return ((d) kVar).b();
            }
            if (!(kVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = sharedDataSpecs.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.f(((SharedDataSpec) next).getType(), definition.getType().code));
            SharedDataSpec sharedDataSpec = (SharedDataSpec) next;
            if (sharedDataSpec != null) {
                return ((c) kVar).c(sharedDataSpec);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lu60/k$c;", "Lu60/k;", "Lz80/g2;", "sharedDataSpec", "Lt60/g;", "c", "(Lz80/g2;)Lt60/g;", "Ls60/a;", "e", "(Lz80/g2;)Ls60/a;", "Lu60/e;", OrcaKeys.METADATA, "Lt60/h;", "transformSpecToElements", "", "Li90/d0;", "f", "(Lu60/e;Lz80/g2;Lt60/h;)Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends k {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public static boolean a(c cVar, u60.c definition, List<SharedDataSpec> sharedDataSpecs) {
                s.k(definition, "definition");
                s.k(sharedDataSpecs, "sharedDataSpecs");
                return b.a(cVar, definition, sharedDataSpecs);
            }

            public static List<d0> b(c cVar, PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, t60.h transformSpecToElements) {
                s.k(metadata, "metadata");
                s.k(sharedDataSpec, "sharedDataSpec");
                s.k(transformSpecToElements, "transformSpecToElements");
                return t60.h.b(transformSpecToElements, sharedDataSpec.b(), null, 2, null);
            }

            public static FormHeaderInformation c(c cVar, SharedDataSpec sharedDataSpec) {
                s.k(sharedDataSpec, "sharedDataSpec");
                return cVar.c(sharedDataSpec).c();
            }

            public static List<d0> d(c cVar, u60.c definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, a arguments) {
                s.k(definition, "definition");
                s.k(metadata, "metadata");
                s.k(sharedDataSpecs, "sharedDataSpecs");
                s.k(arguments, "arguments");
                return b.b(cVar, definition, metadata, sharedDataSpecs, arguments);
            }

            public static FormHeaderInformation e(c cVar, u60.c definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, boolean z11) {
                s.k(definition, "definition");
                s.k(metadata, "metadata");
                s.k(sharedDataSpecs, "sharedDataSpecs");
                return b.c(cVar, definition, metadata, sharedDataSpecs, z11);
            }

            public static SupportedPaymentMethod f(c cVar, u60.c definition, List<SharedDataSpec> sharedDataSpecs) {
                s.k(definition, "definition");
                s.k(sharedDataSpecs, "sharedDataSpecs");
                return b.d(cVar, definition, sharedDataSpecs);
            }
        }

        SupportedPaymentMethod c(SharedDataSpec sharedDataSpec);

        FormHeaderInformation e(SharedDataSpec sharedDataSpec);

        List<d0> f(PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, t60.h transformSpecToElements);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lu60/k$d;", "Lu60/k;", "Lt60/g;", "b", "()Lt60/g;", "", "customerHasSavedPaymentMethods", "Ls60/a;", "a", "(Z)Ls60/a;", "Lu60/e;", OrcaKeys.METADATA, "Lu60/k$a;", "arguments", "", "Li90/d0;", IntegerTokenConverter.CONVERTER_KEY, "(Lu60/e;Lu60/k$a;)Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends k {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public static boolean a(d dVar, u60.c definition, List<SharedDataSpec> sharedDataSpecs) {
                s.k(definition, "definition");
                s.k(sharedDataSpecs, "sharedDataSpecs");
                return b.a(dVar, definition, sharedDataSpecs);
            }

            public static FormHeaderInformation b(d dVar, boolean z11) {
                return dVar.b().c();
            }

            public static List<d0> c(d dVar, u60.c definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, a arguments) {
                s.k(definition, "definition");
                s.k(metadata, "metadata");
                s.k(sharedDataSpecs, "sharedDataSpecs");
                s.k(arguments, "arguments");
                return b.b(dVar, definition, metadata, sharedDataSpecs, arguments);
            }

            public static FormHeaderInformation d(d dVar, u60.c definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, boolean z11) {
                s.k(definition, "definition");
                s.k(metadata, "metadata");
                s.k(sharedDataSpecs, "sharedDataSpecs");
                return b.c(dVar, definition, metadata, sharedDataSpecs, z11);
            }

            public static SupportedPaymentMethod e(d dVar, u60.c definition, List<SharedDataSpec> sharedDataSpecs) {
                s.k(definition, "definition");
                s.k(sharedDataSpecs, "sharedDataSpecs");
                return b.d(dVar, definition, sharedDataSpecs);
            }
        }

        FormHeaderInformation a(boolean customerHasSavedPaymentMethods);

        SupportedPaymentMethod b();

        List<d0> i(PaymentMethodMetadata metadata, a arguments);
    }

    SupportedPaymentMethod d(u60.c definition, List<SharedDataSpec> sharedDataSpecs);

    List<d0> g(u60.c definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, a arguments);

    boolean h(u60.c definition, List<SharedDataSpec> sharedDataSpecs);

    FormHeaderInformation j(u60.c definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, boolean customerHasSavedPaymentMethods);

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b \u0010-R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0019\u00100R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b.\u0010'R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b+\u00102¨\u00063"}, d2 = {"Lu60/k$a;", "", "Lh30/b$a;", "cardAccountRangeRepositoryFactory", "Lc60/d;", "linkConfigurationCoordinator", "", "Li90/g0;", "", "initialValues", "shippingValues", "", "saveForFutureUseInitialValue", "merchantName", "Lx80/a;", "cbcEligibility", "Lcom/stripe/android/paymentsheet/y$d;", "billingDetailsCollectionConfiguration", "requiresMandate", "Lkotlin/Function1;", "Lm60/e;", "Ljn0/h0;", "onLinkInlineSignupStateChanged", "<init>", "(Lh30/b$a;Lc60/d;Ljava/util/Map;Ljava/util/Map;ZLjava/lang/String;Lx80/a;Lcom/stripe/android/paymentsheet/y$d;ZLwn0/l;)V", "a", "Lh30/b$a;", "b", "()Lh30/b$a;", "Lc60/d;", "e", "()Lc60/d;", "c", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "j", "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "g", "Lx80/a;", "()Lx80/a;", "h", "Lcom/stripe/android/paymentsheet/y$d;", "()Lcom/stripe/android/paymentsheet/y$d;", "Lwn0/l;", "()Lwn0/l;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h30.b.a cardAccountRangeRepositoryFactory;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final c60.d linkConfigurationCoordinator;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<IdentifierSpec, String> initialValues;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Map<IdentifierSpec, String> shippingValues;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean saveForFutureUseInitialValue;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String merchantName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final x80.a cbcEligibility;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final boolean requiresMandate;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final l<InlineSignupViewState, h0> onLinkInlineSignupStateChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public a(h30.b.a cardAccountRangeRepositoryFactory, c60.d dVar, Map<IdentifierSpec, String> initialValues, Map<IdentifierSpec, String> map, boolean z11, String merchantName, x80.a cbcEligibility, y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean z12, l<? super InlineSignupViewState, h0> onLinkInlineSignupStateChanged) {
            s.k(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
            s.k(initialValues, "initialValues");
            s.k(merchantName, "merchantName");
            s.k(cbcEligibility, "cbcEligibility");
            s.k(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            s.k(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
            this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
            this.linkConfigurationCoordinator = dVar;
            this.initialValues = initialValues;
            this.shippingValues = map;
            this.saveForFutureUseInitialValue = z11;
            this.merchantName = merchantName;
            this.cbcEligibility = cbcEligibility;
            this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
            this.requiresMandate = z12;
            this.onLinkInlineSignupStateChanged = onLinkInlineSignupStateChanged;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final y.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h30.b.a getCardAccountRangeRepositoryFactory() {
            return this.cardAccountRangeRepositoryFactory;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final x80.a getCbcEligibility() {
            return this.cbcEligibility;
        }

        public final Map<IdentifierSpec, String> d() {
            return this.initialValues;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final c60.d getLinkConfigurationCoordinator() {
            return this.linkConfigurationCoordinator;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        public final l<InlineSignupViewState, h0> g() {
            return this.onLinkInlineSignupStateChanged;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getRequiresMandate() {
            return this.requiresMandate;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getSaveForFutureUseInitialValue() {
            return this.saveForFutureUseInitialValue;
        }

        public final Map<IdentifierSpec, String> j() {
            return this.shippingValues;
        }

        /* JADX INFO: renamed from: u60.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu60/k$a$a;", "", "Lu60/e;", OrcaKeys.METADATA, "", "requiresMandate", "Lu60/k$a;", "a", "(Lu60/e;Z)Lu60/k$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface InterfaceC2488a {
            a a(PaymentMethodMetadata metadata, boolean requiresMandate);

            /* JADX INFO: renamed from: u60.k$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lu60/k$a$a$a;", "Lu60/k$a$a;", "Lh30/b$a;", "cardAccountRangeRepositoryFactory", "Lc60/d;", "linkConfigurationCoordinator", "Lkotlin/Function1;", "Lm60/e;", "Ljn0/h0;", "onLinkInlineSignupStateChanged", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lcom/stripe/android/model/x0;", "paymentMethodExtraParams", "<init>", "(Lh30/b$a;Lc60/d;Lwn0/l;Lcom/stripe/android/model/w0;Lcom/stripe/android/model/x0;)V", "Lu60/e;", OrcaKeys.METADATA, "", "requiresMandate", "Lu60/k$a;", "a", "(Lu60/e;Z)Lu60/k$a;", "Lh30/b$a;", "b", "Lc60/d;", "c", "Lwn0/l;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/w0;", "e", "Lcom/stripe/android/model/x0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class C2489a implements InterfaceC2488a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final h30.b.a cardAccountRangeRepositoryFactory;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final c60.d linkConfigurationCoordinator;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                private final l<InlineSignupViewState, h0> onLinkInlineSignupStateChanged;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                private final PaymentMethodCreateParams paymentMethodCreateParams;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                private final x0 paymentMethodExtraParams;

                /* JADX WARN: Multi-variable type inference failed */
                public C2489a(h30.b.a cardAccountRangeRepositoryFactory, c60.d dVar, l<? super InlineSignupViewState, h0> onLinkInlineSignupStateChanged, PaymentMethodCreateParams paymentMethodCreateParams, x0 x0Var) {
                    s.k(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
                    s.k(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
                    this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
                    this.linkConfigurationCoordinator = dVar;
                    this.onLinkInlineSignupStateChanged = onLinkInlineSignupStateChanged;
                    this.paymentMethodCreateParams = paymentMethodCreateParams;
                    this.paymentMethodExtraParams = x0Var;
                }

                @Override // u60.k.a.InterfaceC2488a
                public a a(PaymentMethodMetadata metadata, boolean requiresMandate) {
                    s.k(metadata, "metadata");
                    h30.b.a aVar = this.cardAccountRangeRepositoryFactory;
                    c60.d dVar = this.linkConfigurationCoordinator;
                    String merchantName = metadata.getMerchantName();
                    x80.a cbcEligibility = metadata.getCbcEligibility();
                    Map<IdentifierSpec, String> mapA = t60.c.f112679a.a(metadata.getDefaultBillingDetails(), this.paymentMethodCreateParams, this.paymentMethodExtraParams);
                    AddressDetails shippingDetails = metadata.getShippingDetails();
                    return new a(aVar, dVar, mapA, shippingDetails != null ? p017o70.b.b(shippingDetails, metadata.getDefaultBillingDetails()) : null, false, merchantName, cbcEligibility, metadata.getBillingDetailsCollectionConfiguration(), requiresMandate, this.onLinkInlineSignupStateChanged);
                }

                public /* synthetic */ C2489a(h30.b.a aVar, c60.d dVar, l lVar, PaymentMethodCreateParams paymentMethodCreateParams, x0 x0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(aVar, dVar, lVar, (i11 & 8) != 0 ? null : paymentMethodCreateParams, (i11 & 16) != 0 ? null : x0Var);
                }
            }
        }
    }
}
