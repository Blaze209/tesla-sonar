package u60;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n0;
import com.stripe.android.paymentsheet.y;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p017o70.AddressDetails;
import s60.FormHeaderInformation;
import t60.SupportedPaymentMethod;
import v60.d0;
import v60.s0;
import w60.LinkInlineConfiguration;
import w80.Amount;
import z80.ExternalPaymentMethodSpec;
import z80.SharedDataSpec;

/* JADX INFO: renamed from: u60.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0081\b\u0018\u0000 k2\u00020\u0001:\u0001KB«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020%0$*\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b(\u0010#J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\tH\u0002¢\u0006\u0004\b.\u0010#J\r\u0010/\u001a\u00020\u0006¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\n¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b4\u0010#J\u0013\u00106\u001a\b\u0012\u0004\u0012\u0002050\t¢\u0006\u0004\b6\u0010#J\u0017\u00108\u001a\u0004\u0018\u0001072\u0006\u0010)\u001a\u00020\n¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\b\u0012\u0004\u0012\u0002070\t¢\u0006\u0004\b:\u0010#J\u0015\u0010;\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\n¢\u0006\u0004\b;\u00103J\u000f\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010)\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u0006¢\u0006\u0004\bA\u0010BJ%\u0010F\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010\t2\u0006\u0010)\u001a\u00020\n2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bF\u0010GJ\u0015\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020%HÖ\u0001¢\u0006\u0004\bO\u0010PJ\u001a\u0010S\u001a\u00020\u00062\b\u0010R\u001a\u0004\u0018\u00010QHÖ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020%HÖ\u0001¢\u0006\u0004\bU\u0010PJ \u0010Z\u001a\u00020Y2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020%HÖ\u0001¢\u0006\u0004\bZ\u0010[R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010b\u001a\u0004\bc\u00100R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bF\u0010b\u001a\u0004\bd\u00100R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\bA\u0010e\u001a\u0004\bf\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bc\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bd\u0010j\u001a\u0004\bk\u0010NR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b`\u0010l\u001a\u0004\bm\u0010nR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bh\u0010o\u001a\u0004\bp\u0010qR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t8\u0006¢\u0006\f\n\u0004\bm\u0010e\u001a\u0004\br\u0010#R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0006¢\u0006\f\n\u0004\bs\u0010e\u001a\u0004\bt\u0010#R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bu\u0010b\u001a\u0004\bu\u00100R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bv\u0010b\u001a\u0004\bw\u00100R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bv\u0010zR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\b\u0081\u0001\u0010b\u001a\u0004\bs\u00100¨\u0006\u0083\u0001"}, d2 = {"Lu60/e;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lcom/stripe/android/paymentsheet/y$d;", "billingDetailsCollectionConfiguration", "", "allowsDelayedPaymentMethods", "allowsPaymentMethodsRequiringShippingAddress", "", "", "paymentMethodOrder", "Lx80/a;", "cbcEligibility", "merchantName", "Lcom/stripe/android/paymentsheet/y$c;", "defaultBillingDetails", "Lo70/a;", "shippingDetails", "Lz80/g2;", "sharedDataSpecs", "Lz80/a1;", "externalPaymentMethodSpecs", "hasCustomerConfiguration", "isGooglePayReady", "Lw60/b;", "linkInlineConfiguration", "Lu60/h;", "paymentMethodSaveConsentBehavior", "Lcom/stripe/android/model/n0;", "linkMode", "financialConnectionsAvailable", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/y$d;ZZLjava/util/List;Lx80/a;Ljava/lang/String;Lcom/stripe/android/paymentsheet/y$c;Lo70/a;Ljava/util/List;Ljava/util/List;ZZLw60/b;Lu60/h;Lcom/stripe/android/model/n0;Z)V", "A", "()Ljava/util/List;", "", "", "z", "(Ljava/util/List;)Ljava/util/Map;", "c", "code", "Lu60/k$d;", "v", "(Ljava/lang/String;)Lu60/k$d;", "Lu60/c;", Gender.FEMALE, "w", "()Z", "paymentMethodCode", "D", "(Ljava/lang/String;)Z", "K", "Lcom/stripe/android/model/v0$p;", "L", "Lt60/g;", "G", "(Ljava/lang/String;)Lt60/g;", "E", "x", "Lw80/b;", "b", "()Lw80/b;", "customerHasSavedPaymentMethods", "Ls60/a;", "e", "(Ljava/lang/String;Z)Ls60/a;", "Lu60/k$a$a;", "uiDefinitionFactoryArgumentsFactory", "Li90/d0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lu60/k$a$a;)Ljava/util/List;", "Lw70/j$a;", "customerRequestedSave", "Lcom/stripe/android/model/v0$b;", "a", "(Lw70/j$a;)Lcom/stripe/android/model/v0$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/StripeIntent;", "u", "()Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/paymentsheet/y$d;", "h", "()Lcom/stripe/android/paymentsheet/y$d;", "Z", "f", "g", "Ljava/util/List;", "getPaymentMethodOrder", "Lx80/a;", IntegerTokenConverter.CONVERTER_KEY, "()Lx80/a;", "Ljava/lang/String;", "r", "Lcom/stripe/android/paymentsheet/y$c;", "j", "()Lcom/stripe/android/paymentsheet/y$c;", "Lo70/a;", "e0", "()Lo70/a;", "getSharedDataSpecs", "k", "getExternalPaymentMethodSpecs", "l", "m", "y", "n", "Lw60/b;", "()Lw60/b;", "o", "Lu60/h;", "s", "()Lu60/h;", "p", "Lcom/stripe/android/model/n0;", "q", "()Lcom/stripe/android/model/n0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentMethodMetadata implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeIntent stripeIntent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowsDelayedPaymentMethods;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowsPaymentMethodsRequiringShippingAddress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> paymentMethodOrder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final x80.a cbcEligibility;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String merchantName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final y.BillingDetails defaultBillingDetails;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDetails shippingDetails;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SharedDataSpec> sharedDataSpecs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ExternalPaymentMethodSpec> externalPaymentMethodSpecs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasCustomerConfiguration;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGooglePayReady;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final LinkInlineConfiguration linkInlineConfiguration;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final h paymentMethodSaveConsentBehavior;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final n0 linkMode;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean financialConnectionsAvailable;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f115754s = 8;
    public static final Parcelable.Creator<PaymentMethodMetadata> CREATOR = new b();

    /* JADX INFO: renamed from: u60.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lu60/e$a;", "", "<init>", "()V", "Lcom/stripe/android/model/h0;", "elementsSession", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "", "Lz80/g2;", "sharedDataSpecs", "Lz80/a1;", "externalPaymentMethodSpecs", "", "isGooglePayReady", "Lw60/b;", "linkInlineConfiguration", "Lu60/e;", "b", "(Lcom/stripe/android/model/h0;Lcom/stripe/android/paymentsheet/y$h;Ljava/util/List;Ljava/util/List;ZLw60/b;)Lu60/e;", "Lcom/stripe/android/customersheet/d$c;", "Lu60/h;", "paymentMethodSaveConsentBehavior", "Ll70/d;", "isFinancialConnectionsAvailable", "a", "(Lcom/stripe/android/model/h0;Lcom/stripe/android/customersheet/d$c;Lu60/h;Ljava/util/List;ZLl70/d;)Lu60/e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentMethodMetadata a(ElementsSession elementsSession, com.stripe.android.customersheet.d.Configuration configuration, h paymentMethodSaveConsentBehavior, List<SharedDataSpec> sharedDataSpecs, boolean isGooglePayReady, l70.d isFinancialConnectionsAvailable) {
            s.k(elementsSession, "elementsSession");
            s.k(configuration, "configuration");
            s.k(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
            s.k(sharedDataSpecs, "sharedDataSpecs");
            s.k(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            StripeIntent stripeIntent = elementsSession.getStripeIntent();
            y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfigurationC = configuration.getBillingDetailsCollectionConfiguration();
            List<String> listI = configuration.i();
            x80.a.Companion c2663a = x80.a.INSTANCE;
            ElementsSession.CardBrandChoice cardBrandChoice = elementsSession.getCardBrandChoice();
            x80.a aVarA = c2663a.a(cardBrandChoice != null ? cardBrandChoice.getEligible() : false, configuration.j());
            String strH = configuration.getMerchantDisplayName();
            y.BillingDetails billingDetailsE = configuration.getDefaultBillingDetails();
            boolean zInvoke = isFinancialConnectionsAvailable.invoke();
            ElementsSession.LinkSettings linkSettings = elementsSession.getLinkSettings();
            return new PaymentMethodMetadata(stripeIntent, billingDetailsCollectionConfigurationC, true, false, listI, aVarA, strH, billingDetailsE, null, sharedDataSpecs, v.m(), true, isGooglePayReady, null, paymentMethodSaveConsentBehavior, linkSettings != null ? linkSettings.getLinkMode() : null, zInvoke);
        }

        public final PaymentMethodMetadata b(ElementsSession elementsSession, y.Configuration configuration, List<SharedDataSpec> sharedDataSpecs, List<ExternalPaymentMethodSpec> externalPaymentMethodSpecs, boolean isGooglePayReady, LinkInlineConfiguration linkInlineConfiguration) {
            s.k(elementsSession, "elementsSession");
            s.k(configuration, "configuration");
            s.k(sharedDataSpecs, "sharedDataSpecs");
            s.k(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
            StripeIntent stripeIntent = elementsSession.getStripeIntent();
            y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = configuration.getBillingDetailsCollectionConfiguration();
            boolean allowsDelayedPaymentMethods = configuration.getAllowsDelayedPaymentMethods();
            boolean allowsPaymentMethodsRequiringShippingAddress = configuration.getAllowsPaymentMethodsRequiringShippingAddress();
            List<String> listM = configuration.m();
            x80.a.Companion c2663a = x80.a.INSTANCE;
            ElementsSession.CardBrandChoice cardBrandChoice = elementsSession.getCardBrandChoice();
            x80.a aVarA = c2663a.a(cardBrandChoice != null ? cardBrandChoice.getEligible() : false, configuration.q());
            boolean z11 = false;
            String merchantDisplayName = configuration.getMerchantDisplayName();
            y.BillingDetails defaultBillingDetails = configuration.getDefaultBillingDetails();
            AddressDetails shippingDetails = configuration.getShippingDetails();
            if (configuration.getCustomer() != null) {
                z11 = true;
            }
            boolean z12 = z11;
            h hVarA = f.a(elementsSession);
            ElementsSession.LinkSettings linkSettings = elementsSession.getLinkSettings();
            return new PaymentMethodMetadata(stripeIntent, billingDetailsCollectionConfiguration, allowsDelayedPaymentMethods, allowsPaymentMethodsRequiringShippingAddress, listM, aVarA, merchantDisplayName, defaultBillingDetails, shippingDetails, sharedDataSpecs, externalPaymentMethodSpecs, z12, isGooglePayReady, linkInlineConfiguration, hVarA, linkSettings != null ? linkSettings.getLinkMode() : null, false, 65536, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: u60.e$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PaymentMethodMetadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodMetadata createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(PaymentMethodMetadata.class.getClassLoader());
            y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfigurationCreateFromParcel = y.BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel);
            boolean z11 = true;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            boolean z12 = parcel.readInt() != 0;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            x80.a aVar = (x80.a) parcel.readParcelable(PaymentMethodMetadata.class.getClassLoader());
            String string = parcel.readString();
            y.BillingDetails billingDetailsCreateFromParcel = parcel.readInt() == 0 ? null : y.BillingDetails.CREATOR.createFromParcel(parcel);
            AddressDetails addressDetailsCreateFromParcel = parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(PaymentMethodMetadata.class.getClassLoader()));
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList2.add(parcel.readParcelable(PaymentMethodMetadata.class.getClassLoader()));
            }
            return new PaymentMethodMetadata(stripeIntent, billingDetailsCollectionConfigurationCreateFromParcel, z11, z12, arrayListCreateStringArrayList, aVar, string, billingDetailsCreateFromParcel, addressDetailsCreateFromParcel, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : LinkInlineConfiguration.CREATOR.createFromParcel(parcel), (h) parcel.readParcelable(PaymentMethodMetadata.class.getClassLoader()), parcel.readInt() == 0 ? null : n0.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodMetadata[] newArray(int i11) {
            return new PaymentMethodMetadata[i11];
        }
    }

    /* JADX INFO: renamed from: u60.e$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f115772a;

        public c(Map map) {
            this.f115772a = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d((Integer) this.f115772a.get((String) t11), (Integer) this.f115772a.get((String) t12));
        }
    }

    public PaymentMethodMetadata(StripeIntent stripeIntent, y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean z11, boolean z12, List<String> paymentMethodOrder, x80.a cbcEligibility, String merchantName, y.BillingDetails billingDetails, AddressDetails addressDetails, List<SharedDataSpec> sharedDataSpecs, List<ExternalPaymentMethodSpec> externalPaymentMethodSpecs, boolean z13, boolean z14, LinkInlineConfiguration linkInlineConfiguration, h paymentMethodSaveConsentBehavior, n0 n0Var, boolean z15) {
        s.k(stripeIntent, "stripeIntent");
        s.k(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        s.k(paymentMethodOrder, "paymentMethodOrder");
        s.k(cbcEligibility, "cbcEligibility");
        s.k(merchantName, "merchantName");
        s.k(sharedDataSpecs, "sharedDataSpecs");
        s.k(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
        s.k(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        this.stripeIntent = stripeIntent;
        this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
        this.allowsDelayedPaymentMethods = z11;
        this.allowsPaymentMethodsRequiringShippingAddress = z12;
        this.paymentMethodOrder = paymentMethodOrder;
        this.cbcEligibility = cbcEligibility;
        this.merchantName = merchantName;
        this.defaultBillingDetails = billingDetails;
        this.shippingDetails = addressDetails;
        this.sharedDataSpecs = sharedDataSpecs;
        this.externalPaymentMethodSpecs = externalPaymentMethodSpecs;
        this.hasCustomerConfiguration = z13;
        this.isGooglePayReady = z14;
        this.linkInlineConfiguration = linkInlineConfiguration;
        this.paymentMethodSaveConsentBehavior = paymentMethodSaveConsentBehavior;
        this.linkMode = n0Var;
        this.financialConnectionsAvailable = z15;
    }

    private final List<String> A() {
        List listP1 = v.p1(v.P0(this.stripeIntent.t(), c()));
        ArrayList arrayList = new ArrayList();
        for (String str : this.paymentMethodOrder) {
            if (listP1.contains(str)) {
                arrayList.add(str);
                listP1.remove(str);
            }
        }
        arrayList.addAll(listP1);
        return arrayList;
    }

    private final List<u60.c> F() {
        List<String> listT = this.stripeIntent.t();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listT.iterator();
        while (it.hasNext()) {
            u60.c cVar = g.f115773a.b().get((String) it.next());
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (d.a((u60.c) obj, this)) {
                arrayList2.add(obj);
            }
        }
        List listE = v.e(s0.f118038a);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listE) {
            if (d.a((s0) obj2, this)) {
                arrayList3.add(obj2);
            }
        }
        List listP0 = v.P0(arrayList2, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listP0) {
            u60.c cVar2 = (u60.c) obj3;
            if (!this.stripeIntent.getIsLiveMode() || !this.stripeIntent.m3().contains(cVar2.getType().code)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList4) {
            u60.c cVar3 = (u60.c) obj4;
            if (cVar3.c().h(cVar3, this.sharedDataSpecs)) {
                arrayList5.add(obj4);
            }
        }
        return arrayList5;
    }

    private final List<String> c() {
        List<ExternalPaymentMethodSpec> list = this.externalPaymentMethodSpecs;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExternalPaymentMethodSpec) it.next()).getType());
        }
        return arrayList;
    }

    private final k.d v(String code) {
        Object next;
        Iterator<T> it = this.externalPaymentMethodSpecs.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((ExternalPaymentMethodSpec) next).getType(), code));
        ExternalPaymentMethodSpec a1Var = (ExternalPaymentMethodSpec) next;
        if (a1Var == null) {
            return null;
        }
        return new d0(a1Var);
    }

    private final Map<String, Integer> z(List<String> list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            arrayList.add(x.a((String) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        return v0.y(arrayList);
    }

    public final boolean D(String paymentMethodCode) {
        s.k(paymentMethodCode, "paymentMethodCode");
        u60.c cVar = g.f115773a.b().get(paymentMethodCode);
        if (cVar != null) {
            return cVar.d(this);
        }
        return false;
    }

    public final List<SupportedPaymentMethod> E() {
        List<String> listK = K();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            SupportedPaymentMethod gVarG = G((String) it.next());
            if (gVarG != null) {
                arrayList.add(gVarG);
            }
        }
        return arrayList;
    }

    public final SupportedPaymentMethod G(String code) {
        Object next;
        s.k(code, "code");
        if (x(code)) {
            k.d dVarV = v(code);
            if (dVarV != null) {
                return dVarV.b();
            }
            return null;
        }
        Iterator<T> it = F().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((u60.c) next).getType().code, code));
        u60.c cVar = (u60.c) next;
        if (cVar == null) {
            return null;
        }
        return cVar.c().d(cVar, this.sharedDataSpecs);
    }

    public final List<String> K() {
        List<u60.c> listF = F();
        ArrayList arrayList = new ArrayList(v.y(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(((u60.c) it.next()).getType().code);
        }
        List<String> listP0 = v.P0(arrayList, c());
        return this.paymentMethodOrder.isEmpty() ? listP0 : v.a1(listP0, new c(z(A())));
    }

    public final List<PaymentMethod.p> L() {
        List<u60.c> listF = F();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((u60.c) obj).a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((u60.c) it.next()).getType());
        }
        return arrayList2;
    }

    public final PaymentMethod.b a(w70.j.a customerRequestedSave) {
        s.k(customerRequestedSave, "customerRequestedSave");
        return this.paymentMethodSaveConsentBehavior.r1(w(), customerRequestedSave);
    }

    public final Amount b() {
        if (!(this.stripeIntent instanceof PaymentIntent)) {
            return null;
        }
        Long amount = ((PaymentIntent) this.stripeIntent).getAmount();
        if (amount == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jLongValue = amount.longValue();
        String currency = ((PaymentIntent) this.stripeIntent).getCurrency();
        if (currency != null) {
            return new Amount(jLongValue, currency);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List<p010i90.d0> d(String code, k.a.InterfaceC2488a uiDefinitionFactoryArgumentsFactory) {
        Object next;
        s.k(code, "code");
        s.k(uiDefinitionFactoryArgumentsFactory, "uiDefinitionFactoryArgumentsFactory");
        if (x(code)) {
            k.d dVarV = v(code);
            if (dVarV != null) {
                return dVarV.i(this, uiDefinitionFactoryArgumentsFactory.a(this, false));
            }
            return null;
        }
        Iterator<T> it = F().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((u60.c) next).getType().code, code));
        u60.c cVar = (u60.c) next;
        if (cVar == null) {
            return null;
        }
        return cVar.c().g(cVar, this, this.sharedDataSpecs, uiDefinitionFactoryArgumentsFactory.a(this, cVar.d(this)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final FormHeaderInformation e(String code, boolean customerHasSavedPaymentMethods) {
        Object next;
        s.k(code, "code");
        if (x(code)) {
            k.d dVarV = v(code);
            if (dVarV != null) {
                return dVarV.a(customerHasSavedPaymentMethods);
            }
            return null;
        }
        Iterator<T> it = F().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((u60.c) next).getType().code, code));
        u60.c cVar = (u60.c) next;
        if (cVar == null) {
            return null;
        }
        return cVar.c().j(cVar, this, this.sharedDataSpecs, customerHasSavedPaymentMethods);
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final AddressDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodMetadata)) {
            return false;
        }
        PaymentMethodMetadata paymentMethodMetadata = (PaymentMethodMetadata) other;
        return s.f(this.stripeIntent, paymentMethodMetadata.stripeIntent) && s.f(this.billingDetailsCollectionConfiguration, paymentMethodMetadata.billingDetailsCollectionConfiguration) && this.allowsDelayedPaymentMethods == paymentMethodMetadata.allowsDelayedPaymentMethods && this.allowsPaymentMethodsRequiringShippingAddress == paymentMethodMetadata.allowsPaymentMethodsRequiringShippingAddress && s.f(this.paymentMethodOrder, paymentMethodMetadata.paymentMethodOrder) && s.f(this.cbcEligibility, paymentMethodMetadata.cbcEligibility) && s.f(this.merchantName, paymentMethodMetadata.merchantName) && s.f(this.defaultBillingDetails, paymentMethodMetadata.defaultBillingDetails) && s.f(this.shippingDetails, paymentMethodMetadata.shippingDetails) && s.f(this.sharedDataSpecs, paymentMethodMetadata.sharedDataSpecs) && s.f(this.externalPaymentMethodSpecs, paymentMethodMetadata.externalPaymentMethodSpecs) && this.hasCustomerConfiguration == paymentMethodMetadata.hasCustomerConfiguration && this.isGooglePayReady == paymentMethodMetadata.isGooglePayReady && s.f(this.linkInlineConfiguration, paymentMethodMetadata.linkInlineConfiguration) && s.f(this.paymentMethodSaveConsentBehavior, paymentMethodMetadata.paymentMethodSaveConsentBehavior) && this.linkMode == paymentMethodMetadata.linkMode && this.financialConnectionsAvailable == paymentMethodMetadata.financialConnectionsAvailable;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getAllowsDelayedPaymentMethods() {
        return this.allowsDelayedPaymentMethods;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getAllowsPaymentMethodsRequiringShippingAddress() {
        return this.allowsPaymentMethodsRequiringShippingAddress;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final y.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
        return this.billingDetailsCollectionConfiguration;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.stripeIntent.hashCode() * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + Boolean.hashCode(this.allowsDelayedPaymentMethods)) * 31) + Boolean.hashCode(this.allowsPaymentMethodsRequiringShippingAddress)) * 31) + this.paymentMethodOrder.hashCode()) * 31) + this.cbcEligibility.hashCode()) * 31) + this.merchantName.hashCode()) * 31;
        y.BillingDetails billingDetails = this.defaultBillingDetails;
        int iHashCode2 = (iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        AddressDetails addressDetails = this.shippingDetails;
        int iHashCode3 = (((((((((iHashCode2 + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + this.sharedDataSpecs.hashCode()) * 31) + this.externalPaymentMethodSpecs.hashCode()) * 31) + Boolean.hashCode(this.hasCustomerConfiguration)) * 31) + Boolean.hashCode(this.isGooglePayReady)) * 31;
        LinkInlineConfiguration linkInlineConfiguration = this.linkInlineConfiguration;
        int iHashCode4 = (((iHashCode3 + (linkInlineConfiguration == null ? 0 : linkInlineConfiguration.hashCode())) * 31) + this.paymentMethodSaveConsentBehavior.hashCode()) * 31;
        n0 n0Var = this.linkMode;
        return ((iHashCode4 + (n0Var != null ? n0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.financialConnectionsAvailable);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final x80.a getCbcEligibility() {
        return this.cbcEligibility;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final y.BillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getFinancialConnectionsAvailable() {
        return this.financialConnectionsAvailable;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getHasCustomerConfiguration() {
        return this.hasCustomerConfiguration;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final LinkInlineConfiguration getLinkInlineConfiguration() {
        return this.linkInlineConfiguration;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final n0 getLinkMode() {
        return this.linkMode;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final h getPaymentMethodSaveConsentBehavior() {
        return this.paymentMethodSaveConsentBehavior;
    }

    public String toString() {
        return "PaymentMethodMetadata(stripeIntent=" + this.stripeIntent + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", allowsDelayedPaymentMethods=" + this.allowsDelayedPaymentMethods + ", allowsPaymentMethodsRequiringShippingAddress=" + this.allowsPaymentMethodsRequiringShippingAddress + ", paymentMethodOrder=" + this.paymentMethodOrder + ", cbcEligibility=" + this.cbcEligibility + ", merchantName=" + this.merchantName + ", defaultBillingDetails=" + this.defaultBillingDetails + ", shippingDetails=" + this.shippingDetails + ", sharedDataSpecs=" + this.sharedDataSpecs + ", externalPaymentMethodSpecs=" + this.externalPaymentMethodSpecs + ", hasCustomerConfiguration=" + this.hasCustomerConfiguration + ", isGooglePayReady=" + this.isGooglePayReady + ", linkInlineConfiguration=" + this.linkInlineConfiguration + ", paymentMethodSaveConsentBehavior=" + this.paymentMethodSaveConsentBehavior + ", linkMode=" + this.linkMode + ", financialConnectionsAvailable=" + this.financialConnectionsAvailable + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    public final boolean w() {
        StripeIntent stripeIntent = this.stripeIntent;
        if (stripeIntent instanceof PaymentIntent) {
            return ((PaymentIntent) stripeIntent).getSetupFutureUsage() != null;
        }
        if (stripeIntent instanceof SetupIntent) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeParcelable(this.stripeIntent, flags);
        this.billingDetailsCollectionConfiguration.writeToParcel(parcel, flags);
        parcel.writeInt(this.allowsDelayedPaymentMethods ? 1 : 0);
        parcel.writeInt(this.allowsPaymentMethodsRequiringShippingAddress ? 1 : 0);
        parcel.writeStringList(this.paymentMethodOrder);
        parcel.writeParcelable(this.cbcEligibility, flags);
        parcel.writeString(this.merchantName);
        y.BillingDetails billingDetails = this.defaultBillingDetails;
        if (billingDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingDetails.writeToParcel(parcel, flags);
        }
        AddressDetails addressDetails = this.shippingDetails;
        if (addressDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressDetails.writeToParcel(parcel, flags);
        }
        List<SharedDataSpec> list = this.sharedDataSpecs;
        parcel.writeInt(list.size());
        Iterator<SharedDataSpec> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
        List<ExternalPaymentMethodSpec> list2 = this.externalPaymentMethodSpecs;
        parcel.writeInt(list2.size());
        Iterator<ExternalPaymentMethodSpec> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), flags);
        }
        parcel.writeInt(this.hasCustomerConfiguration ? 1 : 0);
        parcel.writeInt(this.isGooglePayReady ? 1 : 0);
        LinkInlineConfiguration linkInlineConfiguration = this.linkInlineConfiguration;
        if (linkInlineConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkInlineConfiguration.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.paymentMethodSaveConsentBehavior, flags);
        n0 n0Var = this.linkMode;
        if (n0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(n0Var.name());
        }
        parcel.writeInt(this.financialConnectionsAvailable ? 1 : 0);
    }

    public final boolean x(String code) {
        s.k(code, "code");
        return c().contains(code);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getIsGooglePayReady() {
        return this.isGooglePayReady;
    }

    public /* synthetic */ PaymentMethodMetadata(StripeIntent stripeIntent, y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean z11, boolean z12, List list, x80.a aVar, String str, y.BillingDetails billingDetails, AddressDetails addressDetails, List list2, List list3, boolean z13, boolean z14, LinkInlineConfiguration linkInlineConfiguration, h hVar, n0 n0Var, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeIntent, billingDetailsCollectionConfiguration, z11, z12, list, aVar, str, billingDetails, addressDetails, list2, list3, z13, z14, linkInlineConfiguration, hVar, n0Var, (i11 & 65536) != 0 ? l70.a.f89677a.invoke() : z15);
    }
}
