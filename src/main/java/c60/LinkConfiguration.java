package c60;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.stripe.android.model.StripeIntent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: c60.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\")Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b)\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\"\u00105¨\u00066"}, d2 = {"Lc60/c;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "", "merchantName", "merchantCountryCode", "Lc60/c$c;", "customerInfo", "", "Li90/g0;", "shippingValues", "", "passthroughModeEnabled", "flags", "Lc60/c$a;", "cardBrandChoice", "<init>", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lc60/c$c;Ljava/util/Map;ZLjava/util/Map;Lc60/c$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/StripeIntent;", "g", "()Lcom/stripe/android/model/StripeIntent;", "b", "Ljava/lang/String;", "e", "c", DateTokenConverter.CONVERTER_KEY, "Lc60/c$c;", "()Lc60/c$c;", "Ljava/util/Map;", "getShippingValues", "()Ljava/util/Map;", "f", "Z", "()Z", "h", "Lc60/c$a;", "()Lc60/c$a;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkConfiguration implements Parcelable {
    public static final Parcelable.Creator<LinkConfiguration> CREATOR = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18792i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeIntent stripeIntent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String merchantName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String merchantCountryCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerInfo customerInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<IdentifierSpec, String> shippingValues;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean passthroughModeEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Boolean> flags;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardBrandChoice cardBrandChoice;

    /* JADX INFO: renamed from: c60.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lc60/c$a;", "Landroid/os/Parcelable;", "", "eligible", "", "", "preferredNetworks", "<init>", "(ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CardBrandChoice implements Parcelable {
        public static final Parcelable.Creator<CardBrandChoice> CREATOR = new C0378a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean eligible;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> preferredNetworks;

        /* JADX INFO: renamed from: c60.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0378a implements Parcelable.Creator<CardBrandChoice> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CardBrandChoice createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new CardBrandChoice(parcel.readInt() != 0, parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CardBrandChoice[] newArray(int i11) {
                return new CardBrandChoice[i11];
            }
        }

        public CardBrandChoice(boolean z11, List<String> preferredNetworks) {
            s.k(preferredNetworks, "preferredNetworks");
            this.eligible = z11;
            this.preferredNetworks = preferredNetworks;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEligible() {
            return this.eligible;
        }

        public final List<String> b() {
            return this.preferredNetworks;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardBrandChoice)) {
                return false;
            }
            CardBrandChoice cardBrandChoice = (CardBrandChoice) other;
            return this.eligible == cardBrandChoice.eligible && s.f(this.preferredNetworks, cardBrandChoice.preferredNetworks);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.eligible) * 31) + this.preferredNetworks.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.eligible + ", preferredNetworks=" + this.preferredNetworks + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(this.eligible ? 1 : 0);
            parcel.writeStringList(this.preferredNetworks);
        }
    }

    /* JADX INFO: renamed from: c60.c$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<LinkConfiguration> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkConfiguration createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i11;
            boolean z11;
            s.k(parcel, "parcel");
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(LinkConfiguration.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            CustomerInfo customerInfoCreateFromParcel = CustomerInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap.put(parcel.readParcelable(LinkConfiguration.class.getClassLoader()), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                i11 = 0;
                z11 = true;
            } else {
                i11 = 0;
                z11 = false;
            }
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
            for (int i15 = i11; i15 != i14; i15++) {
                linkedHashMap2.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0 ? 1 : i11));
            }
            return new LinkConfiguration(stripeIntent, string, string2, customerInfoCreateFromParcel, linkedHashMap, z11, linkedHashMap2, parcel.readInt() != 0 ? CardBrandChoice.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinkConfiguration[] newArray(int i11) {
            return new LinkConfiguration[i11];
        }
    }

    /* JADX INFO: renamed from: c60.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001a\u0010\n¨\u0006 "}, d2 = {"Lc60/c$c;", "Landroid/os/Parcelable;", "", "name", Scopes.EMAIL, "phone", "billingCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getName", "b", "c", DateTokenConverter.CONVERTER_KEY, "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CustomerInfo implements Parcelable {
        public static final Parcelable.Creator<CustomerInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phone;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String billingCountryCode;

        /* JADX INFO: renamed from: c60.c$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CustomerInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CustomerInfo createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new CustomerInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CustomerInfo[] newArray(int i11) {
                return new CustomerInfo[i11];
            }
        }

        public CustomerInfo(String str, String str2, String str3, String str4) {
            this.name = str;
            this.email = str2;
            this.phone = str3;
            this.billingCountryCode = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBillingCountryCode() {
            return this.billingCountryCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerInfo)) {
                return false;
            }
            CustomerInfo customerInfo = (CustomerInfo) other;
            return s.f(this.name, customerInfo.name) && s.f(this.email, customerInfo.email) && s.f(this.phone, customerInfo.phone) && s.f(this.billingCountryCode, customerInfo.billingCountryCode);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.email;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.billingCountryCode;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "CustomerInfo(name=" + this.name + ", email=" + this.email + ", phone=" + this.phone + ", billingCountryCode=" + this.billingCountryCode + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeString(this.email);
            parcel.writeString(this.phone);
            parcel.writeString(this.billingCountryCode);
        }
    }

    public LinkConfiguration(StripeIntent stripeIntent, String merchantName, String str, CustomerInfo customerInfo, Map<IdentifierSpec, String> map, boolean z11, Map<String, Boolean> flags, CardBrandChoice cardBrandChoice) {
        s.k(stripeIntent, "stripeIntent");
        s.k(merchantName, "merchantName");
        s.k(customerInfo, "customerInfo");
        s.k(flags, "flags");
        this.stripeIntent = stripeIntent;
        this.merchantName = merchantName;
        this.merchantCountryCode = str;
        this.customerInfo = customerInfo;
        this.shippingValues = map;
        this.passthroughModeEnabled = z11;
        this.flags = flags;
        this.cardBrandChoice = cardBrandChoice;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardBrandChoice getCardBrandChoice() {
        return this.cardBrandChoice;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final Map<String, Boolean> c() {
        return this.flags;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMerchantCountryCode() {
        return this.merchantCountryCode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkConfiguration)) {
            return false;
        }
        LinkConfiguration linkConfiguration = (LinkConfiguration) other;
        return s.f(this.stripeIntent, linkConfiguration.stripeIntent) && s.f(this.merchantName, linkConfiguration.merchantName) && s.f(this.merchantCountryCode, linkConfiguration.merchantCountryCode) && s.f(this.customerInfo, linkConfiguration.customerInfo) && s.f(this.shippingValues, linkConfiguration.shippingValues) && this.passthroughModeEnabled == linkConfiguration.passthroughModeEnabled && s.f(this.flags, linkConfiguration.flags) && s.f(this.cardBrandChoice, linkConfiguration.cardBrandChoice);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getPassthroughModeEnabled() {
        return this.passthroughModeEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    public int hashCode() {
        int iHashCode = ((this.stripeIntent.hashCode() * 31) + this.merchantName.hashCode()) * 31;
        String str = this.merchantCountryCode;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.customerInfo.hashCode()) * 31;
        Map<IdentifierSpec, String> map = this.shippingValues;
        int iHashCode3 = (((((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.passthroughModeEnabled)) * 31) + this.flags.hashCode()) * 31;
        CardBrandChoice cardBrandChoice = this.cardBrandChoice;
        return iHashCode3 + (cardBrandChoice != null ? cardBrandChoice.hashCode() : 0);
    }

    public String toString() {
        return "LinkConfiguration(stripeIntent=" + this.stripeIntent + ", merchantName=" + this.merchantName + ", merchantCountryCode=" + this.merchantCountryCode + ", customerInfo=" + this.customerInfo + ", shippingValues=" + this.shippingValues + ", passthroughModeEnabled=" + this.passthroughModeEnabled + ", flags=" + this.flags + ", cardBrandChoice=" + this.cardBrandChoice + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeParcelable(this.stripeIntent, flags);
        parcel.writeString(this.merchantName);
        parcel.writeString(this.merchantCountryCode);
        this.customerInfo.writeToParcel(parcel, flags);
        Map<IdentifierSpec, String> map = this.shippingValues;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<IdentifierSpec, String> entry : map.entrySet()) {
                parcel.writeParcelable(entry.getKey(), flags);
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeInt(this.passthroughModeEnabled ? 1 : 0);
        Map<String, Boolean> map2 = this.flags;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Boolean> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeInt(entry2.getValue().booleanValue() ? 1 : 0);
        }
        CardBrandChoice cardBrandChoice = this.cardBrandChoice;
        if (cardBrandChoice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardBrandChoice.writeToParcel(parcel, flags);
        }
    }
}
