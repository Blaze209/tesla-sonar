package f30;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u0001:\u0005\u001a' %+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nB3\b\u0011\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010 \u001a\u00020\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b \u0010!JQ\u0010%\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\"\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010*¨\u0006,"}, d2 = {"Lf30/i;", "", "Lf30/h;", "googlePayConfig", "", "isJcbEnabled", "<init>", "(Lf30/h;Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Z)V", "Lkotlin/Function0;", "", "publishableKeyProvider", "stripeAccountIdProvider", "Lcom/stripe/android/googlepaylauncher/h$e;", "(Lwn0/a;Lwn0/a;Lcom/stripe/android/googlepaylauncher/h$e;)V", "Lf30/i$e;", "transactionInfo", "Lorg/json/JSONObject;", "g", "(Lf30/i$e;)Lorg/json/JSONObject;", "Lf30/i$d;", "shippingAddressParameters", "f", "(Lf30/i$d;)Lorg/json/JSONObject;", "a", "()Lorg/json/JSONObject;", "Lf30/i$a;", "billingAddressParameters", "existingPaymentMethodRequired", "allowCreditCards", "c", "(Lf30/i$a;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "isEmailRequired", "Lf30/i$c;", "merchantInfo", DateTokenConverter.CONVERTER_KEY, "(Lf30/i$e;Lf30/i$a;Lf30/i$d;ZLf30/i$c;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "b", "(Lf30/i$a;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "Lf30/h;", "Z", "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f64103c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f64104d = p013kotlin.collections.v.p("PAN_ONLY", "CRYPTOGRAM_3DS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<String> f64105e = p013kotlin.collections.v.p("AMEX", "DISCOVER", "MASTERCARD", "VISA");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h googlePayConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isJcbEnabled;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lf30/i$b;", "", "<init>", "()V", "", "", "ALLOWED_AUTH_METHODS", "Ljava/util/List;", "ALLOWED_PAYMENT_METHODS", "Ljava/lang/String;", "", "API_VERSION", "I", "API_VERSION_MINOR", "CARD_PAYMENT_METHOD", "DEFAULT_CARD_NETWORKS", "JCB_CARD_NETWORK", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: f30.i$c, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0019"}, d2 = {"Lf30/i$c;", "Landroid/os/Parcelable;", "", "merchantName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MerchantInfo implements Parcelable {
        public static final Parcelable.Creator<MerchantInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String merchantName;

        /* JADX INFO: renamed from: f30.i$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MerchantInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MerchantInfo createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new MerchantInfo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MerchantInfo[] newArray(int i11) {
                return new MerchantInfo[i11];
            }
        }

        public MerchantInfo(String str) {
            this.merchantName = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MerchantInfo) && p013kotlin.jvm.internal.s.f(this.merchantName, ((MerchantInfo) other).merchantName);
        }

        public int hashCode() {
            String str = this.merchantName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "MerchantInfo(merchantName=" + this.merchantName + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.merchantName);
        }
    }

    /* JADX INFO: renamed from: f30.i$d, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"Lf30/i$d;", "Landroid/os/Parcelable;", "", "isRequired", "", "", "allowedCountryCodes", "phoneNumberRequired", "<init>", "(ZLjava/util/Set;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "c", "()Z", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "normalizedAllowedCountryCodes", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShippingAddressParameters implements Parcelable {
        public static final Parcelable.Creator<ShippingAddressParameters> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequired;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> allowedCountryCodes;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean phoneNumberRequired;

        /* JADX INFO: renamed from: f30.i$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShippingAddressParameters> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShippingAddressParameters createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                boolean z11 = parcel.readInt() != 0;
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new ShippingAddressParameters(z11, linkedHashSet, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShippingAddressParameters[] newArray(int i11) {
                return new ShippingAddressParameters[i11];
            }
        }

        public ShippingAddressParameters(boolean z11, Set<String> allowedCountryCodes, boolean z12) {
            p013kotlin.jvm.internal.s.k(allowedCountryCodes, "allowedCountryCodes");
            this.isRequired = z11;
            this.allowedCountryCodes = allowedCountryCodes;
            this.phoneNumberRequired = z12;
            String[] iSOCountries = Locale.getISOCountries();
            for (String str : a()) {
                p013kotlin.jvm.internal.s.h(iSOCountries);
                int length = iSOCountries.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
                    }
                    if (p013kotlin.jvm.internal.s.f(str, iSOCountries[i11])) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }

        public final Set<String> a() {
            Set<String> set = this.allowedCountryCodes;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
                p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
                arrayList.add(upperCase);
            }
            return p013kotlin.collections.v.r1(arrayList);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getPhoneNumberRequired() {
            return this.phoneNumberRequired;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShippingAddressParameters)) {
                return false;
            }
            ShippingAddressParameters shippingAddressParameters = (ShippingAddressParameters) other;
            return this.isRequired == shippingAddressParameters.isRequired && p013kotlin.jvm.internal.s.f(this.allowedCountryCodes, shippingAddressParameters.allowedCountryCodes) && this.phoneNumberRequired == shippingAddressParameters.phoneNumberRequired;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isRequired) * 31) + this.allowedCountryCodes.hashCode()) * 31) + Boolean.hashCode(this.phoneNumberRequired);
        }

        public String toString() {
            return "ShippingAddressParameters(isRequired=" + this.isRequired + ", allowedCountryCodes=" + this.allowedCountryCodes + ", phoneNumberRequired=" + this.phoneNumberRequired + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(this.isRequired ? 1 : 0);
            Set<String> set = this.allowedCountryCodes;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
            parcel.writeInt(this.phoneNumberRequired ? 1 : 0);
        }
    }

    public i(h googlePayConfig, boolean z11) {
        p013kotlin.jvm.internal.s.k(googlePayConfig, "googlePayConfig");
        this.googlePayConfig = googlePayConfig;
        this.isJcbEnabled = z11;
    }

    private final JSONObject a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("allowedAuthMethods", new JSONArray((Collection) f64104d));
        List<String> list = f64105e;
        List listE = p013kotlin.collections.v.e("JCB");
        if (!this.isJcbEnabled) {
            listE = null;
        }
        if (listE == null) {
            listE = p013kotlin.collections.v.m();
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("allowedCardNetworks", new JSONArray((Collection) p013kotlin.collections.v.P0(list, listE)));
        p013kotlin.jvm.internal.s.j(jSONObjectPut2, "put(...)");
        return jSONObjectPut2;
    }

    public static /* synthetic */ JSONObject e(i iVar, TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z11, MerchantInfo merchantInfo, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            billingAddressParameters = null;
        }
        if ((i11 & 4) != 0) {
            shippingAddressParameters = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        if ((i11 & 16) != 0) {
            merchantInfo = null;
        }
        if ((i11 & 32) != 0) {
            bool = null;
        }
        return iVar.d(transactionInfo, billingAddressParameters, shippingAddressParameters, z11, merchantInfo, bool);
    }

    private final JSONObject f(ShippingAddressParameters shippingAddressParameters) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("allowedCountryCodes", new JSONArray((Collection) shippingAddressParameters.a())).put("phoneNumberRequired", shippingAddressParameters.getPhoneNumberRequired());
        p013kotlin.jvm.internal.s.j(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    private final JSONObject g(TransactionInfo transactionInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String currencyCode = transactionInfo.getCurrencyCode();
        Locale locale = Locale.ROOT;
        String upperCase = currencyCode.toUpperCase(locale);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        JSONObject jSONObjectPut = jSONObject.put("currencyCode", upperCase).put("totalPriceStatus", transactionInfo.getTotalPriceStatus().getCode());
        String countryCode = transactionInfo.getCountryCode();
        if (countryCode != null) {
            String upperCase2 = countryCode.toUpperCase(locale);
            p013kotlin.jvm.internal.s.j(upperCase2, "toUpperCase(...)");
            jSONObjectPut.put("countryCode", upperCase2);
        }
        String transactionId = transactionInfo.getTransactionId();
        if (transactionId != null) {
            jSONObjectPut.put("transactionId", transactionId);
        }
        Long totalPrice = transactionInfo.getTotalPrice();
        if (totalPrice != null) {
            long jLongValue = totalPrice.longValue();
            String upperCase3 = transactionInfo.getCurrencyCode().toUpperCase(locale);
            p013kotlin.jvm.internal.s.j(upperCase3, "toUpperCase(...)");
            Currency currency = Currency.getInstance(upperCase3);
            p013kotlin.jvm.internal.s.j(currency, "getInstance(...)");
            jSONObjectPut.put("totalPrice", k.a(jLongValue, currency));
        }
        String totalPriceLabel = transactionInfo.getTotalPriceLabel();
        if (totalPriceLabel != null) {
            jSONObjectPut.put("totalPriceLabel", totalPriceLabel);
        }
        TransactionInfo.a checkoutOption = transactionInfo.getCheckoutOption();
        if (checkoutOption != null) {
            jSONObjectPut.put("checkoutOption", checkoutOption.getCode());
        }
        p013kotlin.jvm.internal.s.j(jSONObjectPut, "apply(...)");
        return jSONObjectPut;
    }

    public final JSONObject b(BillingAddressParameters billingAddressParameters, Boolean allowCreditCards) throws JSONException {
        JSONObject jSONObjectA = a();
        if (billingAddressParameters != null && billingAddressParameters.getIsRequired()) {
            jSONObjectA.put("billingAddressRequired", true);
            jSONObjectA.put("billingAddressParameters", new JSONObject().put("phoneNumberRequired", billingAddressParameters.getIsPhoneNumberRequired()).put("format", billingAddressParameters.getFormat().getCode()));
        }
        if (allowCreditCards != null) {
            jSONObjectA.put("allowCreditCards", allowCreditCards.booleanValue());
        }
        JSONObject jSONObjectPut = new JSONObject().put("type", "CARD").put("parameters", jSONObjectA).put("tokenizationSpecification", this.googlePayConfig.b());
        p013kotlin.jvm.internal.s.j(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public final JSONObject c(BillingAddressParameters billingAddressParameters, Boolean existingPaymentMethodRequired, Boolean allowCreditCards) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(b(billingAddressParameters, allowCreditCards)));
        if (existingPaymentMethodRequired != null) {
            jSONObjectPut.put("existingPaymentMethodRequired", existingPaymentMethodRequired.booleanValue());
        }
        p013kotlin.jvm.internal.s.j(jSONObjectPut, "apply(...)");
        return jSONObjectPut;
    }

    public final JSONObject d(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean isEmailRequired, MerchantInfo merchantInfo, Boolean allowCreditCards) throws JSONException {
        String merchantName;
        p013kotlin.jvm.internal.s.k(transactionInfo, "transactionInfo");
        JSONObject jSONObjectPut = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(b(billingAddressParameters, allowCreditCards))).put("transactionInfo", g(transactionInfo)).put("emailRequired", isEmailRequired);
        if (shippingAddressParameters != null && shippingAddressParameters.getIsRequired()) {
            jSONObjectPut.put("shippingAddressRequired", true);
            jSONObjectPut.put("shippingAddressParameters", f(shippingAddressParameters));
        }
        if (merchantInfo != null && (merchantName = merchantInfo.getMerchantName()) != null && merchantName.length() != 0) {
            jSONObjectPut.put("merchantInfo", new JSONObject().put("merchantName", merchantInfo.getMerchantName()));
        }
        p013kotlin.jvm.internal.s.j(jSONObjectPut, "apply(...)");
        return jSONObjectPut;
    }

    /* JADX INFO: renamed from: f30.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lf30/i$a;", "Landroid/os/Parcelable;", "", "isRequired", "Lf30/i$a$b;", "format", "isPhoneNumberRequired", "<init>", "(ZLf30/i$a$b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "c", "()Z", "b", "Lf30/i$a$b;", "()Lf30/i$a$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BillingAddressParameters implements Parcelable {
        public static final Parcelable.Creator<BillingAddressParameters> CREATOR = new C1313a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f64108d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequired;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b format;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPhoneNumberRequired;

        /* JADX INFO: renamed from: f30.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1313a implements Parcelable.Creator<BillingAddressParameters> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BillingAddressParameters createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new BillingAddressParameters(parcel.readInt() != 0, b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BillingAddressParameters[] newArray(int i11) {
                return new BillingAddressParameters[i11];
            }
        }

        /* JADX INFO: renamed from: f30.i$a$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lf30/i$a$b;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "Min", "Full", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum b {
            Min("MIN"),
            Full("FULL");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String code;

            b(String str) {
                this.code = str;
            }

            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }

            /* JADX INFO: renamed from: getCode$payments_core_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }
        }

        public BillingAddressParameters(boolean z11, b format, boolean z12) {
            p013kotlin.jvm.internal.s.k(format, "format");
            this.isRequired = z11;
            this.format = format;
            this.isPhoneNumberRequired = z12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getFormat() {
            return this.format;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsPhoneNumberRequired() {
            return this.isPhoneNumberRequired;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingAddressParameters)) {
                return false;
            }
            BillingAddressParameters billingAddressParameters = (BillingAddressParameters) other;
            return this.isRequired == billingAddressParameters.isRequired && this.format == billingAddressParameters.format && this.isPhoneNumberRequired == billingAddressParameters.isPhoneNumberRequired;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isRequired) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.isPhoneNumberRequired);
        }

        public String toString() {
            return "BillingAddressParameters(isRequired=" + this.isRequired + ", format=" + this.format + ", isPhoneNumberRequired=" + this.isPhoneNumberRequired + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(this.isRequired ? 1 : 0);
            parcel.writeString(this.format.name());
            parcel.writeInt(this.isPhoneNumberRequired ? 1 : 0);
        }

        public /* synthetic */ BillingAddressParameters(boolean z11, b bVar, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? b.Min : bVar, (i11 & 4) != 0 ? false : z12);
        }
    }

    public /* synthetic */ i(Context context, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context, boolean z11) {
        this(new h(context), z11);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(wn0.a<String> publishableKeyProvider, wn0.a<String> stripeAccountIdProvider, com.stripe.android.googlepaylauncher.h.Config googlePayConfig) {
        this(new h(publishableKeyProvider.invoke(), stripeAccountIdProvider.invoke()), googlePayConfig.h());
        p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
        p013kotlin.jvm.internal.s.k(stripeAccountIdProvider, "stripeAccountIdProvider");
        p013kotlin.jvm.internal.s.k(googlePayConfig, "googlePayConfig");
    }

    /* JADX INFO: renamed from: f30.i$e, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!#BK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b*\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b!\u0010.¨\u0006/"}, d2 = {"Lf30/i$e;", "Landroid/os/Parcelable;", "", "currencyCode", "Lf30/i$e$c;", "totalPriceStatus", "countryCode", "transactionId", "", "totalPrice", "totalPriceLabel", "Lf30/i$e$a;", "checkoutOption", "<init>", "(Ljava/lang/String;Lf30/i$e$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lf30/i$e$a;)V", "", "(Ljava/lang/String;Lf30/i$e$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lf30/i$e$a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "c", "b", "Lf30/i$e$c;", "f", "()Lf30/i$e$c;", DateTokenConverter.CONVERTER_KEY, "g", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lf30/i$e$a;", "()Lf30/i$e$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TransactionInfo implements Parcelable {
        public static final Parcelable.Creator<TransactionInfo> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currencyCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c totalPriceStatus;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transactionId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long totalPrice;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String totalPriceLabel;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final a checkoutOption;

        /* JADX INFO: renamed from: f30.i$e$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lf30/i$e$a;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "Default", "CompleteImmediatePurchase", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            Default("DEFAULT"),
            CompleteImmediatePurchase("COMPLETE_IMMEDIATE_PURCHASE");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String code;

            a(String str) {
                this.code = str;
            }

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }

            /* JADX INFO: renamed from: getCode$payments_core_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }
        }

        /* JADX INFO: renamed from: f30.i$e$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<TransactionInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TransactionInfo createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new TransactionInfo(parcel.readString(), c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? a.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TransactionInfo[] newArray(int i11) {
                return new TransactionInfo[i11];
            }
        }

        /* JADX INFO: renamed from: f30.i$e$c */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lf30/i$e$c;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "NotCurrentlyKnown", "Estimated", "Final", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum c {
            NotCurrentlyKnown("NOT_CURRENTLY_KNOWN"),
            Estimated("ESTIMATED"),
            Final("FINAL");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String code;

            c(String str) {
                this.code = str;
            }

            public static EnumEntries<c> getEntries() {
                return $ENTRIES;
            }

            /* JADX INFO: renamed from: getCode$payments_core_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }
        }

        public TransactionInfo(String currencyCode, c totalPriceStatus, String str, String str2, Long l11, String str3, a aVar) {
            p013kotlin.jvm.internal.s.k(currencyCode, "currencyCode");
            p013kotlin.jvm.internal.s.k(totalPriceStatus, "totalPriceStatus");
            this.currencyCode = currencyCode;
            this.totalPriceStatus = totalPriceStatus;
            this.countryCode = str;
            this.transactionId = str2;
            this.totalPrice = l11;
            this.totalPriceLabel = str3;
            this.checkoutOption = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getCheckoutOption() {
            return this.checkoutOption;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getTotalPrice() {
            return this.totalPrice;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTotalPriceLabel() {
            return this.totalPriceLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionInfo)) {
                return false;
            }
            TransactionInfo transactionInfo = (TransactionInfo) other;
            return p013kotlin.jvm.internal.s.f(this.currencyCode, transactionInfo.currencyCode) && this.totalPriceStatus == transactionInfo.totalPriceStatus && p013kotlin.jvm.internal.s.f(this.countryCode, transactionInfo.countryCode) && p013kotlin.jvm.internal.s.f(this.transactionId, transactionInfo.transactionId) && p013kotlin.jvm.internal.s.f(this.totalPrice, transactionInfo.totalPrice) && p013kotlin.jvm.internal.s.f(this.totalPriceLabel, transactionInfo.totalPriceLabel) && this.checkoutOption == transactionInfo.checkoutOption;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final c getTotalPriceStatus() {
            return this.totalPriceStatus;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        public int hashCode() {
            int iHashCode = ((this.currencyCode.hashCode() * 31) + this.totalPriceStatus.hashCode()) * 31;
            String str = this.countryCode;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transactionId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l11 = this.totalPrice;
            int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str3 = this.totalPriceLabel;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            a aVar = this.checkoutOption;
            return iHashCode5 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "TransactionInfo(currencyCode=" + this.currencyCode + ", totalPriceStatus=" + this.totalPriceStatus + ", countryCode=" + this.countryCode + ", transactionId=" + this.transactionId + ", totalPrice=" + this.totalPrice + ", totalPriceLabel=" + this.totalPriceLabel + ", checkoutOption=" + this.checkoutOption + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.currencyCode);
            parcel.writeString(this.totalPriceStatus.name());
            parcel.writeString(this.countryCode);
            parcel.writeString(this.transactionId);
            Long l11 = this.totalPrice;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            parcel.writeString(this.totalPriceLabel);
            a aVar = this.checkoutOption;
            if (aVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(aVar.name());
            }
        }

        public /* synthetic */ TransactionInfo(String str, c cVar, String str2, String str3, Integer num, String str4, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, cVar, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : aVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TransactionInfo(String currencyCode, c totalPriceStatus, String str, String str2, Integer num, String str3, a aVar) {
            this(currencyCode, totalPriceStatus, str, str2, num != null ? Long.valueOf(num.intValue()) : null, str3, aVar);
            p013kotlin.jvm.internal.s.k(currencyCode, "currencyCode");
            p013kotlin.jvm.internal.s.k(totalPriceStatus, "totalPriceStatus");
        }
    }
}
