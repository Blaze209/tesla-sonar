package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001.Bû\u0001\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b4\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b7\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b.\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b8\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u00105\u001a\u0004\b:\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b=\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b2\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b?\u0010 R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b;\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b>\u0010ER\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u0010 R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bH\u00105\u001a\u0004\b<\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bK\u00105\u001a\u0004\bL\u0010 R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bM\u00105\u001a\u0004\bN\u0010 R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u00105\u001a\u0004\bP\u0010 R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\b@\u0010S¨\u0006U"}, d2 = {"Lcom/stripe/android/model/g;", "Lt30/f;", "", "", "expMonth", "expYear", "", "name", "addressLine1", "addressLine1Check", "addressLine2", "addressCity", "addressState", "addressZip", "addressZipCheck", "addressCountry", "last4", "Lcom/stripe/android/model/h;", "brand", "Lcom/stripe/android/model/i;", "funding", "fingerprint", PlaceTypes.COUNTRY, "currency", "customerId", "cvcCheck", "id", "Lcom/stripe/android/model/r1;", "tokenizationMethod", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/h;Lcom/stripe/android/model/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/r1;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "b", "j", "c", "Ljava/lang/String;", "getName", DateTokenConverter.CONVERTER_KEY, "e", "getAddressLine1Check", "f", "g", "h", "getAddressZipCheck", "k", "l", "m", "Lcom/stripe/android/model/h;", "()Lcom/stripe/android/model/h;", "n", "Lcom/stripe/android/model/i;", "()Lcom/stripe/android/model/i;", "o", "getFingerprint", "p", "q", "getCurrency", "r", "getCustomerId", "s", "getCvcCheck", "t", "getId", "u", "Lcom/stripe/android/model/r1;", "()Lcom/stripe/android/model/r1;", "v", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Card implements t30.f, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer expMonth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer expYear;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1Check;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine2;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressCity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressZip;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressZipCheck;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressCountry;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String last4;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final h brand;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final i funding;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fingerprint;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerId;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cvcCheck;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final r1 tokenizationMethod;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Card> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/g$a;", "", "<init>", "()V", "", "brandName", "Lcom/stripe/android/model/h;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/h;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final /* synthetic */ h a(String brandName) {
            if (brandName != null) {
                switch (brandName.hashCode()) {
                    case -993787207:
                        if (brandName.equals("Diners Club")) {
                            return h.DinersClub;
                        }
                        break;
                    case -298759312:
                        if (brandName.equals("American Express")) {
                            return h.AmericanExpress;
                        }
                        break;
                    case -231891079:
                        if (brandName.equals("UnionPay")) {
                            return h.UnionPay;
                        }
                        break;
                    case -46205774:
                        if (brandName.equals("MasterCard")) {
                            return h.MasterCard;
                        }
                        break;
                    case 73257:
                        if (brandName.equals("JCB")) {
                            return h.JCB;
                        }
                        break;
                    case 2666593:
                        if (brandName.equals("Visa")) {
                            return h.Visa;
                        }
                        break;
                    case 337828873:
                        if (brandName.equals("Discover")) {
                            return h.Discover;
                        }
                        break;
                }
            }
            return h.Unknown;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.g$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Card> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Card createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new Card(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? r1.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Card[] newArray(int i11) {
            return new Card[i11];
        }
    }

    public Card(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, h brand, i iVar, String str11, String str12, String str13, String str14, String str15, String str16, r1 r1Var) {
        p013kotlin.jvm.internal.s.k(brand, "brand");
        this.expMonth = num;
        this.expYear = num2;
        this.name = str;
        this.addressLine1 = str2;
        this.addressLine1Check = str3;
        this.addressLine2 = str4;
        this.addressCity = str5;
        this.addressState = str6;
        this.addressZip = str7;
        this.addressZipCheck = str8;
        this.addressCountry = str9;
        this.last4 = str10;
        this.brand = brand;
        this.funding = iVar;
        this.fingerprint = str11;
        this.country = str12;
        this.currency = str13;
        this.customerId = str14;
        this.cvcCheck = str15;
        this.id = str16;
        this.tokenizationMethod = r1Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddressCity() {
        return this.addressCity;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAddressCountry() {
        return this.addressCountry;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAddressState() {
        return this.addressState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return p013kotlin.jvm.internal.s.f(this.expMonth, card.expMonth) && p013kotlin.jvm.internal.s.f(this.expYear, card.expYear) && p013kotlin.jvm.internal.s.f(this.name, card.name) && p013kotlin.jvm.internal.s.f(this.addressLine1, card.addressLine1) && p013kotlin.jvm.internal.s.f(this.addressLine1Check, card.addressLine1Check) && p013kotlin.jvm.internal.s.f(this.addressLine2, card.addressLine2) && p013kotlin.jvm.internal.s.f(this.addressCity, card.addressCity) && p013kotlin.jvm.internal.s.f(this.addressState, card.addressState) && p013kotlin.jvm.internal.s.f(this.addressZip, card.addressZip) && p013kotlin.jvm.internal.s.f(this.addressZipCheck, card.addressZipCheck) && p013kotlin.jvm.internal.s.f(this.addressCountry, card.addressCountry) && p013kotlin.jvm.internal.s.f(this.last4, card.last4) && this.brand == card.brand && this.funding == card.funding && p013kotlin.jvm.internal.s.f(this.fingerprint, card.fingerprint) && p013kotlin.jvm.internal.s.f(this.country, card.country) && p013kotlin.jvm.internal.s.f(this.currency, card.currency) && p013kotlin.jvm.internal.s.f(this.customerId, card.customerId) && p013kotlin.jvm.internal.s.f(this.cvcCheck, card.cvcCheck) && p013kotlin.jvm.internal.s.f(this.id, card.id) && this.tokenizationMethod == card.tokenizationMethod;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getAddressZip() {
        return this.addressZip;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h getBrand() {
        return this.brand;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        Integer num = this.expMonth;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expYear;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine1;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine1Check;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine2;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressCity;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressState;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressZip;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressZipCheck;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressCountry;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.last4;
        int iHashCode12 = (((iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.brand.hashCode()) * 31;
        i iVar = this.funding;
        int iHashCode13 = (iHashCode12 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str11 = this.fingerprint;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.country;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.currency;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.customerId;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cvcCheck;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.id;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        r1 r1Var = this.tokenizationMethod;
        return iHashCode19 + (r1Var != null ? r1Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getExpMonth() {
        return this.expMonth;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getExpYear() {
        return this.expYear;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final i getFunding() {
        return this.funding;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final r1 getTokenizationMethod() {
        return this.tokenizationMethod;
    }

    public String toString() {
        return "Card(expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", name=" + this.name + ", addressLine1=" + this.addressLine1 + ", addressLine1Check=" + this.addressLine1Check + ", addressLine2=" + this.addressLine2 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressZip=" + this.addressZip + ", addressZipCheck=" + this.addressZipCheck + ", addressCountry=" + this.addressCountry + ", last4=" + this.last4 + ", brand=" + this.brand + ", funding=" + this.funding + ", fingerprint=" + this.fingerprint + ", country=" + this.country + ", currency=" + this.currency + ", customerId=" + this.customerId + ", cvcCheck=" + this.cvcCheck + ", id=" + this.id + ", tokenizationMethod=" + this.tokenizationMethod + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        Integer num = this.expMonth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.expYear;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.name);
        parcel.writeString(this.addressLine1);
        parcel.writeString(this.addressLine1Check);
        parcel.writeString(this.addressLine2);
        parcel.writeString(this.addressCity);
        parcel.writeString(this.addressState);
        parcel.writeString(this.addressZip);
        parcel.writeString(this.addressZipCheck);
        parcel.writeString(this.addressCountry);
        parcel.writeString(this.last4);
        parcel.writeString(this.brand.name());
        i iVar = this.funding;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iVar.name());
        }
        parcel.writeString(this.fingerprint);
        parcel.writeString(this.country);
        parcel.writeString(this.currency);
        parcel.writeString(this.customerId);
        parcel.writeString(this.cvcCheck);
        parcel.writeString(this.id);
        r1 r1Var = this.tokenizationMethod;
        if (r1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r1Var.name());
        }
    }
}
