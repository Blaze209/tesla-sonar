package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Kind;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)\u001dBE\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010&¨\u0006*"}, d2 = {"Lcom/stripe/android/model/d;", "Lcom/stripe/android/model/q1;", "", PlaceTypes.COUNTRY, "currency", "accountNumber", "Lcom/stripe/android/model/d$c;", "accountHolderType", "accountHolderName", "routingNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/d$c;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lcom/stripe/android/model/d$c;", "g", "h", "", "()Ljava/util/Map;", "typeDataParams", IntegerTokenConverter.CONVERTER_KEY, "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BankAccountTokenParams extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final c accountHolderType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountHolderName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String routingNumber;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f51092i = new a(null);
    public static final Parcelable.Creator<BankAccountTokenParams> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.d$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/d$a;", "", "<init>", "()V", "", "PARAM_ACCOUNT_HOLDER_NAME", "Ljava/lang/String;", "PARAM_ACCOUNT_HOLDER_TYPE", "PARAM_ACCOUNT_NUMBER", "PARAM_COUNTRY", "PARAM_CURRENCY", "PARAM_ROUTING_NUMBER", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.d$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BankAccountTokenParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BankAccountTokenParams createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new BankAccountTokenParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BankAccountTokenParams[] newArray(int i11) {
            return new BankAccountTokenParams[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.d$c */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/d$c;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "Companion", "a", "Individual", "Company", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum c {
        Individual(Kind.INDIVIDUAL),
        Company("company");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccountTokenParams(String country, String currency, String accountNumber, c cVar, String str, String str2) {
        super(Token.c.BankAccount, null, 2, null);
        p013kotlin.jvm.internal.s.k(country, "country");
        p013kotlin.jvm.internal.s.k(currency, "currency");
        p013kotlin.jvm.internal.s.k(accountNumber, "accountNumber");
        this.country = country;
        this.currency = currency;
        this.accountNumber = accountNumber;
        this.accountHolderType = cVar;
        this.accountHolderName = str;
        this.routingNumber = str2;
    }

    @Override // com.stripe.android.model.q1
    public Map<String, Object> c() {
        Pair pairA = jn0.x.a(PlaceTypes.COUNTRY, this.country);
        Pair pairA2 = jn0.x.a("currency", this.currency);
        Pair pairA3 = jn0.x.a("account_holder_name", this.accountHolderName);
        c cVar = this.accountHolderType;
        List<Pair> listP = p013kotlin.collections.v.p(pairA, pairA2, pairA3, jn0.x.a("account_holder_type", cVar != null ? cVar.getCode() : null), jn0.x.a("routing_number", this.routingNumber), jn0.x.a("account_number", this.accountNumber));
        Map<String, Object> mapI = p013kotlin.collections.v0.i();
        for (Pair pair : listP) {
            String str = (String) pair.a();
            String str2 = (String) pair.b();
            Map mapF = str2 != null ? p013kotlin.collections.v0.f(jn0.x.a(str, str2)) : null;
            if (mapF == null) {
                mapF = p013kotlin.collections.v0.i();
            }
            mapI = p013kotlin.collections.v0.r(mapI, mapF);
        }
        return mapI;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankAccountTokenParams)) {
            return false;
        }
        BankAccountTokenParams bankAccountTokenParams = (BankAccountTokenParams) other;
        return p013kotlin.jvm.internal.s.f(this.country, bankAccountTokenParams.country) && p013kotlin.jvm.internal.s.f(this.currency, bankAccountTokenParams.currency) && p013kotlin.jvm.internal.s.f(this.accountNumber, bankAccountTokenParams.accountNumber) && this.accountHolderType == bankAccountTokenParams.accountHolderType && p013kotlin.jvm.internal.s.f(this.accountHolderName, bankAccountTokenParams.accountHolderName) && p013kotlin.jvm.internal.s.f(this.routingNumber, bankAccountTokenParams.routingNumber);
    }

    public int hashCode() {
        int iHashCode = ((((this.country.hashCode() * 31) + this.currency.hashCode()) * 31) + this.accountNumber.hashCode()) * 31;
        c cVar = this.accountHolderType;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.accountHolderName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.routingNumber;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BankAccountTokenParams(country=" + this.country + ", currency=" + this.currency + ", accountNumber=" + this.accountNumber + ", accountHolderType=" + this.accountHolderType + ", accountHolderName=" + this.accountHolderName + ", routingNumber=" + this.routingNumber + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.country);
        parcel.writeString(this.currency);
        parcel.writeString(this.accountNumber);
        c cVar = this.accountHolderType;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
        parcel.writeString(this.accountHolderName);
        parcel.writeString(this.routingNumber);
    }
}
