package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\rR\u0011\u0010*\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010)¨\u0006+"}, d2 = {"Lcom/stripe/android/model/a;", "Lt30/f;", "Lcom/stripe/android/model/f;", "binRange", "", "panLength", "Lcom/stripe/android/model/a$a;", "brandInfo", "", PlaceTypes.COUNTRY, "<init>", "(Lcom/stripe/android/model/f;ILcom/stripe/android/model/a$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/f;", "()Lcom/stripe/android/model/f;", "b", "I", "c", "Lcom/stripe/android/model/a$a;", "getBrandInfo", "()Lcom/stripe/android/model/a$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getCountry", "Lcom/stripe/android/model/h;", "()Lcom/stripe/android/model/h;", "brand", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AccountRange implements t30.f {
    public static final Parcelable.Creator<AccountRange> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BinRange binRange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int panLength;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC0883a brandInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: com.stripe.android.model.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/a$a;", "", "", "brandName", "Lcom/stripe/android/model/h;", "brand", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/h;)V", "Ljava/lang/String;", "getBrandName", "()Ljava/lang/String;", "Lcom/stripe/android/model/h;", "getBrand", "()Lcom/stripe/android/model/h;", "Visa", "Mastercard", "AmericanExpress", "JCB", "DinersClub", "Discover", "UnionPay", "CartesBancaires", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum EnumC0883a {
        Visa("VISA", h.Visa),
        Mastercard("MASTERCARD", h.MasterCard),
        AmericanExpress("AMERICAN_EXPRESS", h.AmericanExpress),
        JCB("JCB", h.JCB),
        DinersClub("DINERS_CLUB", h.DinersClub),
        Discover("DISCOVER", h.Discover),
        UnionPay("UNIONPAY", h.UnionPay),
        CartesBancaires("CARTES_BANCAIRES", h.CartesBancaires);

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final h brand;
        private final String brandName;

        EnumC0883a(String str, h hVar) {
            this.brandName = str;
            this.brand = hVar;
        }

        public static EnumEntries<EnumC0883a> getEntries() {
            return $ENTRIES;
        }

        public final h getBrand() {
            return this.brand;
        }

        public final String getBrandName() {
            return this.brandName;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.a$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AccountRange> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountRange createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new AccountRange(BinRange.CREATOR.createFromParcel(parcel), parcel.readInt(), EnumC0883a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AccountRange[] newArray(int i11) {
            return new AccountRange[i11];
        }
    }

    public AccountRange(BinRange binRange, int i11, EnumC0883a brandInfo, String str) {
        p013kotlin.jvm.internal.s.k(binRange, "binRange");
        p013kotlin.jvm.internal.s.k(brandInfo, "brandInfo");
        this.binRange = binRange;
        this.panLength = i11;
        this.brandInfo = brandInfo;
        this.country = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BinRange getBinRange() {
        return this.binRange;
    }

    public final h b() {
        return this.brandInfo.getBrand();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPanLength() {
        return this.panLength;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountRange)) {
            return false;
        }
        AccountRange accountRange = (AccountRange) other;
        return p013kotlin.jvm.internal.s.f(this.binRange, accountRange.binRange) && this.panLength == accountRange.panLength && this.brandInfo == accountRange.brandInfo && p013kotlin.jvm.internal.s.f(this.country, accountRange.country);
    }

    public int hashCode() {
        int iHashCode = ((((this.binRange.hashCode() * 31) + Integer.hashCode(this.panLength)) * 31) + this.brandInfo.hashCode()) * 31;
        String str = this.country;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AccountRange(binRange=" + this.binRange + ", panLength=" + this.panLength + ", brandInfo=" + this.brandInfo + ", country=" + this.country + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        this.binRange.writeToParcel(parcel, flags);
        parcel.writeInt(this.panLength);
        parcel.writeString(this.brandInfo.name());
        parcel.writeString(this.country);
    }

    public /* synthetic */ AccountRange(BinRange binRange, int i11, EnumC0883a enumC0883a, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(binRange, i11, enumC0883a, (i12 & 8) != 0 ? null : str);
    }
}
