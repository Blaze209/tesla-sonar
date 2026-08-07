package f30;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.ShippingInfoWidget;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f30.r, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0004.249BÇ\u0001\b\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\b\b\u0003\u0010\r\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b2\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b7\u00108R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\"R\u0017\u0010\r\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b>\u0010\"R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b?\u00101R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u00108R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b.\u0010DR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bJ\u00108R\u001a\u0010\u0017\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u00108R\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b9\u0010OR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b;\u0010RR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lf30/r;", "Landroid/os/Parcelable;", "", "Lcom/stripe/android/view/ShippingInfoWidget$a;", "hiddenShippingInfoFields", "optionalShippingInfoFields", "Lcom/stripe/android/model/f1;", "prepopulatedShippingInfo", "", "isShippingInfoRequired", "isShippingMethodRequired", "", "paymentMethodsFooterLayoutId", "addPaymentMethodFooterLayoutId", "Lcom/stripe/android/model/v0$p;", "paymentMethodTypes", "shouldShowGooglePay", "", "", "allowedShippingCountryCodes", "Lcom/stripe/android/view/t;", "billingAddressFields", "canDeletePaymentMethods", "shouldPrefetchCustomer", "Lf30/r$d;", "shippingInformationValidator", "Lf30/r$e;", "shippingMethodsFactory", "windowFlags", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/f1;ZZIILjava/util/List;ZLjava/util/Set;Lcom/stripe/android/view/t;ZZLf30/r$d;Lf30/r$e;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "Lcom/stripe/android/model/f1;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/model/f1;", "Z", "g", "()Z", "e", "h", "f", "I", "getPaymentMethodsFooterLayoutId", "getAddPaymentMethodFooterLayoutId", "getPaymentMethodTypes", IntegerTokenConverter.CONVERTER_KEY, "getShouldShowGooglePay", "j", "Ljava/util/Set;", "()Ljava/util/Set;", "k", "Lcom/stripe/android/view/t;", "getBillingAddressFields", "()Lcom/stripe/android/view/t;", "l", "getCanDeletePaymentMethods", "m", "getShouldPrefetchCustomer$payments_core_release", "n", "Lf30/r$d;", "()Lf30/r$d;", "o", "Lf30/r$e;", "()Lf30/r$e;", "p", "Ljava/lang/Integer;", "getWindowFlags$payments_core_release", "()Ljava/lang/Integer;", "q", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentSessionConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ShippingInfoWidget.a> hiddenShippingInfoFields;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ShippingInfoWidget.a> optionalShippingInfoFields;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShippingInformation prepopulatedShippingInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShippingInfoRequired;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShippingMethodRequired;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int paymentMethodsFooterLayoutId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int addPaymentMethodFooterLayoutId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PaymentMethod.p> paymentMethodTypes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowGooglePay;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> allowedShippingCountryCodes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.view.t billingAddressFields;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canDeletePaymentMethods;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldPrefetchCustomer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final d shippingInformationValidator;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final e shippingMethodsFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer windowFlags;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f64168q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f64169r = 8;
    public static final Parcelable.Creator<PaymentSessionConfig> CREATOR = new b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final com.stripe.android.view.t f64170s = com.stripe.android.view.t.PostalCode;

    /* JADX INFO: renamed from: f30.r$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf30/r$a;", "", "<init>", "()V", "Lcom/stripe/android/view/t;", "DEFAULT_BILLING_ADDRESS_FIELDS", "Lcom/stripe/android/view/t;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: f30.r$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PaymentSessionConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentSessionConfig createFromParcel(Parcel parcel) {
            String string;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(ShippingInfoWidget.a.valueOf(parcel.readString()));
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList2.add(ShippingInfoWidget.a.valueOf(parcel.readString()));
            }
            ShippingInformation shippingInformationCreateFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            boolean z11 = true;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList3.add(PaymentMethod.p.CREATOR.createFromParcel(parcel));
            }
            boolean z13 = parcel.readInt() != 0;
            int i19 = parcel.readInt();
            boolean z14 = true;
            LinkedHashSet linkedHashSet = new LinkedHashSet(i19);
            int i21 = 0;
            while (true) {
                string = parcel.readString();
                if (i21 == i19) {
                    break;
                }
                linkedHashSet.add(string);
                i21++;
            }
            com.stripe.android.view.t tVarValueOf = com.stripe.android.view.t.valueOf(string);
            if (parcel.readInt() == 0) {
                z14 = false;
            }
            return new PaymentSessionConfig(arrayList, arrayList2, shippingInformationCreateFromParcel, z12, z11, i15, i16, arrayList3, z13, linkedHashSet, tVarValueOf, z14, parcel.readInt() != 0, (d) parcel.readSerializable(), (e) parcel.readSerializable(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentSessionConfig[] newArray(int i11) {
            return new PaymentSessionConfig[i11];
        }
    }

    /* JADX INFO: renamed from: f30.r$c */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf30/r$c;", "Lf30/r$d;", "<init>", "()V", "Lcom/stripe/android/model/f1;", "shippingInformation", "", "C3", "(Lcom/stripe/android/model/f1;)Z", "", "K1", "(Lcom/stripe/android/model/f1;)Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c implements d {
        @Override // f30.PaymentSessionConfig.d
        public boolean C3(ShippingInformation shippingInformation) {
            p013kotlin.jvm.internal.s.k(shippingInformation, "shippingInformation");
            return true;
        }

        @Override // f30.PaymentSessionConfig.d
        public String K1(ShippingInformation shippingInformation) {
            p013kotlin.jvm.internal.s.k(shippingInformation, "shippingInformation");
            return "";
        }
    }

    /* JADX INFO: renamed from: f30.r$d */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf30/r$d;", "Ljava/io/Serializable;", "Lcom/stripe/android/model/f1;", "shippingInformation", "", "C3", "(Lcom/stripe/android/model/f1;)Z", "", "K1", "(Lcom/stripe/android/model/f1;)Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends Serializable {
        boolean C3(ShippingInformation shippingInformation);

        String K1(ShippingInformation shippingInformation);
    }

    /* JADX INFO: renamed from: f30.r$e */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf30/r$e;", "Ljava/io/Serializable;", "Lcom/stripe/android/model/f1;", "shippingInformation", "", "Lcom/stripe/android/model/g1;", "T0", "(Lcom/stripe/android/model/f1;)Ljava/util/List;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e extends Serializable {
        List<ShippingMethod> T0(ShippingInformation shippingInformation);
    }

    public PaymentSessionConfig() {
        this(null, null, null, false, false, 0, 0, null, false, null, null, false, false, null, null, null, 65535, null);
    }

    public final Set<String> a() {
        return this.allowedShippingCountryCodes;
    }

    public final List<ShippingInfoWidget.a> b() {
        return this.hiddenShippingInfoFields;
    }

    public final List<ShippingInfoWidget.a> c() {
        return this.optionalShippingInfoFields;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ShippingInformation getPrepopulatedShippingInfo() {
        return this.prepopulatedShippingInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getShippingInformationValidator() {
        return this.shippingInformationValidator;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSessionConfig)) {
            return false;
        }
        PaymentSessionConfig paymentSessionConfig = (PaymentSessionConfig) other;
        return p013kotlin.jvm.internal.s.f(this.hiddenShippingInfoFields, paymentSessionConfig.hiddenShippingInfoFields) && p013kotlin.jvm.internal.s.f(this.optionalShippingInfoFields, paymentSessionConfig.optionalShippingInfoFields) && p013kotlin.jvm.internal.s.f(this.prepopulatedShippingInfo, paymentSessionConfig.prepopulatedShippingInfo) && this.isShippingInfoRequired == paymentSessionConfig.isShippingInfoRequired && this.isShippingMethodRequired == paymentSessionConfig.isShippingMethodRequired && this.paymentMethodsFooterLayoutId == paymentSessionConfig.paymentMethodsFooterLayoutId && this.addPaymentMethodFooterLayoutId == paymentSessionConfig.addPaymentMethodFooterLayoutId && p013kotlin.jvm.internal.s.f(this.paymentMethodTypes, paymentSessionConfig.paymentMethodTypes) && this.shouldShowGooglePay == paymentSessionConfig.shouldShowGooglePay && p013kotlin.jvm.internal.s.f(this.allowedShippingCountryCodes, paymentSessionConfig.allowedShippingCountryCodes) && this.billingAddressFields == paymentSessionConfig.billingAddressFields && this.canDeletePaymentMethods == paymentSessionConfig.canDeletePaymentMethods && this.shouldPrefetchCustomer == paymentSessionConfig.shouldPrefetchCustomer && p013kotlin.jvm.internal.s.f(this.shippingInformationValidator, paymentSessionConfig.shippingInformationValidator) && p013kotlin.jvm.internal.s.f(this.shippingMethodsFactory, paymentSessionConfig.shippingMethodsFactory) && p013kotlin.jvm.internal.s.f(this.windowFlags, paymentSessionConfig.windowFlags);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getShippingMethodsFactory() {
        return this.shippingMethodsFactory;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsShippingInfoRequired() {
        return this.isShippingInfoRequired;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsShippingMethodRequired() {
        return this.isShippingMethodRequired;
    }

    public int hashCode() {
        int iHashCode = ((this.hiddenShippingInfoFields.hashCode() * 31) + this.optionalShippingInfoFields.hashCode()) * 31;
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        int iHashCode2 = (((((((((((((((((((((((iHashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31) + Boolean.hashCode(this.isShippingInfoRequired)) * 31) + Boolean.hashCode(this.isShippingMethodRequired)) * 31) + Integer.hashCode(this.paymentMethodsFooterLayoutId)) * 31) + Integer.hashCode(this.addPaymentMethodFooterLayoutId)) * 31) + this.paymentMethodTypes.hashCode()) * 31) + Boolean.hashCode(this.shouldShowGooglePay)) * 31) + this.allowedShippingCountryCodes.hashCode()) * 31) + this.billingAddressFields.hashCode()) * 31) + Boolean.hashCode(this.canDeletePaymentMethods)) * 31) + Boolean.hashCode(this.shouldPrefetchCustomer)) * 31) + this.shippingInformationValidator.hashCode()) * 31;
        e eVar = this.shippingMethodsFactory;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Integer num = this.windowFlags;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PaymentSessionConfig(hiddenShippingInfoFields=" + this.hiddenShippingInfoFields + ", optionalShippingInfoFields=" + this.optionalShippingInfoFields + ", prepopulatedShippingInfo=" + this.prepopulatedShippingInfo + ", isShippingInfoRequired=" + this.isShippingInfoRequired + ", isShippingMethodRequired=" + this.isShippingMethodRequired + ", paymentMethodsFooterLayoutId=" + this.paymentMethodsFooterLayoutId + ", addPaymentMethodFooterLayoutId=" + this.addPaymentMethodFooterLayoutId + ", paymentMethodTypes=" + this.paymentMethodTypes + ", shouldShowGooglePay=" + this.shouldShowGooglePay + ", allowedShippingCountryCodes=" + this.allowedShippingCountryCodes + ", billingAddressFields=" + this.billingAddressFields + ", canDeletePaymentMethods=" + this.canDeletePaymentMethods + ", shouldPrefetchCustomer=" + this.shouldPrefetchCustomer + ", shippingInformationValidator=" + this.shippingInformationValidator + ", shippingMethodsFactory=" + this.shippingMethodsFactory + ", windowFlags=" + this.windowFlags + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        List<ShippingInfoWidget.a> list = this.hiddenShippingInfoFields;
        parcel.writeInt(list.size());
        Iterator<ShippingInfoWidget.a> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        List<ShippingInfoWidget.a> list2 = this.optionalShippingInfoFields;
        parcel.writeInt(list2.size());
        Iterator<ShippingInfoWidget.a> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next().name());
        }
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        if (shippingInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingInformation.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isShippingInfoRequired ? 1 : 0);
        parcel.writeInt(this.isShippingMethodRequired ? 1 : 0);
        parcel.writeInt(this.paymentMethodsFooterLayoutId);
        parcel.writeInt(this.addPaymentMethodFooterLayoutId);
        List<PaymentMethod.p> list3 = this.paymentMethodTypes;
        parcel.writeInt(list3.size());
        Iterator<PaymentMethod.p> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.shouldShowGooglePay ? 1 : 0);
        Set<String> set = this.allowedShippingCountryCodes;
        parcel.writeInt(set.size());
        Iterator<String> it4 = set.iterator();
        while (it4.hasNext()) {
            parcel.writeString(it4.next());
        }
        parcel.writeString(this.billingAddressFields.name());
        parcel.writeInt(this.canDeletePaymentMethods ? 1 : 0);
        parcel.writeInt(this.shouldPrefetchCustomer ? 1 : 0);
        parcel.writeSerializable(this.shippingInformationValidator);
        parcel.writeSerializable(this.shippingMethodsFactory);
        Integer num = this.windowFlags;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSessionConfig(List<? extends ShippingInfoWidget.a> hiddenShippingInfoFields, List<? extends ShippingInfoWidget.a> optionalShippingInfoFields, ShippingInformation shippingInformation, boolean z11, boolean z12, int i11, int i12, List<? extends PaymentMethod.p> paymentMethodTypes, boolean z13, Set<String> allowedShippingCountryCodes, com.stripe.android.view.t billingAddressFields, boolean z14, boolean z15, d shippingInformationValidator, e eVar, Integer num) {
        p013kotlin.jvm.internal.s.k(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        p013kotlin.jvm.internal.s.k(optionalShippingInfoFields, "optionalShippingInfoFields");
        p013kotlin.jvm.internal.s.k(paymentMethodTypes, "paymentMethodTypes");
        p013kotlin.jvm.internal.s.k(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        p013kotlin.jvm.internal.s.k(billingAddressFields, "billingAddressFields");
        p013kotlin.jvm.internal.s.k(shippingInformationValidator, "shippingInformationValidator");
        this.hiddenShippingInfoFields = hiddenShippingInfoFields;
        this.optionalShippingInfoFields = optionalShippingInfoFields;
        this.prepopulatedShippingInfo = shippingInformation;
        this.isShippingInfoRequired = z11;
        this.isShippingMethodRequired = z12;
        this.paymentMethodsFooterLayoutId = i11;
        this.addPaymentMethodFooterLayoutId = i12;
        this.paymentMethodTypes = paymentMethodTypes;
        this.shouldShowGooglePay = z13;
        this.allowedShippingCountryCodes = allowedShippingCountryCodes;
        this.billingAddressFields = billingAddressFields;
        this.canDeletePaymentMethods = z14;
        this.shouldPrefetchCustomer = z15;
        this.shippingInformationValidator = shippingInformationValidator;
        this.shippingMethodsFactory = eVar;
        this.windowFlags = num;
        String[] iSOCountries = Locale.getISOCountries();
        for (String str : allowedShippingCountryCodes) {
            p013kotlin.jvm.internal.s.h(iSOCountries);
            int length = iSOCountries.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
                }
                if (p013kotlin.text.t.M(str, iSOCountries[i13], true)) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (this.isShippingMethodRequired && this.shippingMethodsFactory == null) {
            throw new IllegalArgumentException("If isShippingMethodRequired is true a ShippingMethodsFactory must also be provided.");
        }
    }

    public /* synthetic */ PaymentSessionConfig(List list, List list2, ShippingInformation shippingInformation, boolean z11, boolean z12, int i11, int i12, List list3, boolean z13, Set set, com.stripe.android.view.t tVar, boolean z14, boolean z15, d dVar, e eVar, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? p013kotlin.collections.v.m() : list, (i13 & 2) != 0 ? p013kotlin.collections.v.m() : list2, (i13 & 4) != 0 ? null : shippingInformation, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? 0 : i11, (i13 & 64) != 0 ? 0 : i12, (i13 & 128) != 0 ? p013kotlin.collections.v.e(PaymentMethod.p.Card) : list3, (i13 & 256) == 0 ? z13 : false, (i13 & 512) != 0 ? d1.d() : set, (i13 & 1024) != 0 ? f64170s : tVar, (i13 & 2048) != 0 ? true : z14, (i13 & 4096) == 0 ? z15 : true, (i13 & PKIFailureInfo.certRevoked) != 0 ? new c() : dVar, (i13 & 16384) != 0 ? null : eVar, (i13 & 32768) != 0 ? null : num);
    }
}
