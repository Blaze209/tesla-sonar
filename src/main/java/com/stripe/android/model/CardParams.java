package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.k, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001NB\u008d\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bi\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001aR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b4\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010-\u0012\u0004\b5\u00100\u001a\u0004\b1\u0010\u0018R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010-\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u00109R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010:\u001a\u0004\b+\u0010;\"\u0004\b<\u0010=R$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010-\u001a\u0004\b?\u0010\u0018\"\u0004\b@\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0011\u0010K\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b6\u0010\u0018R \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010H¨\u0006O"}, d2 = {"Lcom/stripe/android/model/k;", "Lcom/stripe/android/model/q1;", "Lcom/stripe/android/model/h;", "brand", "", "", "loggingTokens", InquiryField.FloatField.TYPE2, "", "expMonth", "expYear", "cvc", "name", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "currency", "Lcom/stripe/android/model/t0;", "networks", "", OrcaKeys.METADATA, "<init>", "(Lcom/stripe/android/model/h;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/b;Ljava/lang/String;Lcom/stripe/android/model/t0;Ljava/util/Map;)V", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/b;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lcom/stripe/android/model/h;", "e", "()Lcom/stripe/android/model/h;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "Ljava/lang/String;", "j", "getNumber$annotations", "()V", "f", "I", "g", "h", "getCvc$annotations", IntegerTokenConverter.CONVERTER_KEY, "getName", "setName", "(Ljava/lang/String;)V", "Lcom/stripe/android/model/b;", "()Lcom/stripe/android/model/b;", "setAddress", "(Lcom/stripe/android/model/b;)V", "k", "getCurrency", "setCurrency", "l", "Lcom/stripe/android/model/t0;", "getNetworks", "()Lcom/stripe/android/model/t0;", "m", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "last4", "typeDataParams", "n", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardParams extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final h brand;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> loggingTokens;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int expMonth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int expYear;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cvc;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private Address address;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private String currency;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Networks networks;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private Map<String, String> metadata;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a f51292n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f51293o = 8;
    public static final Parcelable.Creator<CardParams> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.k$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/k$a;", "", "<init>", "()V", "", "PARAM_ADDRESS_CITY", "Ljava/lang/String;", "PARAM_ADDRESS_COUNTRY", "PARAM_ADDRESS_LINE1", "PARAM_ADDRESS_LINE2", "PARAM_ADDRESS_STATE", "PARAM_ADDRESS_ZIP", "PARAM_CURRENCY", "PARAM_CVC", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_METADATA", "PARAM_NAME", "PARAM_NUMBER", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.k$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CardParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            h hVarValueOf = h.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashSet.add(parcel.readString());
            }
            String string = parcel.readString();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Address addressCreateFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            Networks networksCreateFromParcel = parcel.readInt() == 0 ? null : Networks.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i15 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new CardParams(hVarValueOf, linkedHashSet, string, i13, i14, string2, string3, addressCreateFromParcel, string4, networksCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CardParams[] newArray(int i11) {
            return new CardParams[i11];
        }
    }

    public /* synthetic */ CardParams(h hVar, Set set, String str, int i11, int i12, String str2, String str3, Address address, String str4, Networks networks, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i13 & 2) != 0 ? p013kotlin.collections.d1.d() : set, str, i11, i12, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : address, (i13 & 256) != 0 ? null : str4, (i13 & 512) != 0 ? null : networks, (i13 & 1024) != 0 ? null : map);
    }

    @Override // com.stripe.android.model.q1
    public Map<String, Object> c() {
        Pair pairA = jn0.x.a(InquiryField.FloatField.TYPE2, this.number);
        Pair pairA2 = jn0.x.a("exp_month", Integer.valueOf(this.expMonth));
        Pair pairA3 = jn0.x.a("exp_year", Integer.valueOf(this.expYear));
        Pair pairA4 = jn0.x.a("cvc", this.cvc);
        Pair pairA5 = jn0.x.a("name", this.name);
        Pair pairA6 = jn0.x.a("currency", this.currency);
        Address address = this.address;
        Pair pairA7 = jn0.x.a("address_line1", address != null ? address.getLine1() : null);
        Address address2 = this.address;
        Pair pairA8 = jn0.x.a("address_line2", address2 != null ? address2.getLine2() : null);
        Address address3 = this.address;
        Pair pairA9 = jn0.x.a("address_city", address3 != null ? address3.getCity() : null);
        Address address4 = this.address;
        Pair pairA10 = jn0.x.a("address_state", address4 != null ? address4.getState() : null);
        Address address5 = this.address;
        Pair pairA11 = jn0.x.a("address_zip", address5 != null ? address5.getPostalCode() : null);
        Address address6 = this.address;
        List<Pair> listP = p013kotlin.collections.v.p(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, jn0.x.a("address_country", address6 != null ? address6.getCountry() : null), jn0.x.a(OrcaKeys.METADATA, this.metadata));
        Map<String, Object> mapI = p013kotlin.collections.v0.i();
        for (Pair pair : listP) {
            String str = (String) pair.a();
            Object objB = pair.b();
            Map mapF = objB != null ? p013kotlin.collections.v0.f(jn0.x.a(str, objB)) : null;
            if (mapF == null) {
                mapF = p013kotlin.collections.v0.i();
            }
            mapI = p013kotlin.collections.v0.r(mapI, mapF);
        }
        return mapI;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getBrand() {
        return this.brand;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardParams)) {
            return false;
        }
        CardParams cardParams = (CardParams) other;
        return this.brand == cardParams.brand && p013kotlin.jvm.internal.s.f(this.loggingTokens, cardParams.loggingTokens) && p013kotlin.jvm.internal.s.f(this.number, cardParams.number) && this.expMonth == cardParams.expMonth && this.expYear == cardParams.expYear && p013kotlin.jvm.internal.s.f(this.cvc, cardParams.cvc) && p013kotlin.jvm.internal.s.f(this.name, cardParams.name) && p013kotlin.jvm.internal.s.f(this.address, cardParams.address) && p013kotlin.jvm.internal.s.f(this.currency, cardParams.currency) && p013kotlin.jvm.internal.s.f(this.networks, cardParams.networks) && p013kotlin.jvm.internal.s.f(this.metadata, cardParams.metadata);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCvc() {
        return this.cvc;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getExpMonth() {
        return this.expMonth;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getExpYear() {
        return this.expYear;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.brand.hashCode() * 31) + this.loggingTokens.hashCode()) * 31) + this.number.hashCode()) * 31) + Integer.hashCode(this.expMonth)) * 31) + Integer.hashCode(this.expYear)) * 31;
        String str = this.cvc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.address;
        int iHashCode4 = (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Networks networks = this.networks;
        int iHashCode6 = (iHashCode5 + (networks == null ? 0 : networks.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final String i() {
        return p013kotlin.text.t.U1(this.number, 4);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public String toString() {
        return "CardParams(brand=" + this.brand + ", loggingTokens=" + this.loggingTokens + ", number=" + this.number + ", expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", cvc=" + this.cvc + ", name=" + this.name + ", address=" + this.address + ", currency=" + this.currency + ", networks=" + this.networks + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.brand.name());
        Set<String> set = this.loggingTokens;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        parcel.writeString(this.number);
        parcel.writeInt(this.expMonth);
        parcel.writeInt(this.expYear);
        parcel.writeString(this.cvc);
        parcel.writeString(this.name);
        Address address = this.address;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.currency);
        Networks networks = this.networks;
        if (networks == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            networks.writeToParcel(parcel, flags);
        }
        Map<String, String> map = this.metadata;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardParams(h brand, Set<String> loggingTokens, String number, int i11, int i12, String str, String str2, Address address, String str3, Networks networks, Map<String, String> map) {
        super(Token.c.Card, loggingTokens);
        p013kotlin.jvm.internal.s.k(brand, "brand");
        p013kotlin.jvm.internal.s.k(loggingTokens, "loggingTokens");
        p013kotlin.jvm.internal.s.k(number, "number");
        this.brand = brand;
        this.loggingTokens = loggingTokens;
        this.number = number;
        this.expMonth = i11;
        this.expYear = i12;
        this.cvc = str;
        this.name = str2;
        this.address = address;
        this.currency = str3;
        this.networks = networks;
        this.metadata = map;
    }

    public /* synthetic */ CardParams(String str, int i11, int i12, String str2, String str3, Address address, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : address, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i11, int i12, String str, String str2, Address address, String str3, Map<String, String> map) {
        this(f30.b.a(number), p013kotlin.collections.d1.d(), number, i11, i12, str, str2, address, str3, null, map, 512, null);
        p013kotlin.jvm.internal.s.k(number, "number");
    }
}
