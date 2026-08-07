package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: com.stripe.android.model.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lcom/stripe/android/model/f;", "Lt30/f;", "", "low", "high", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lh30/f$b;", "cardNumber", "", "a", "(Lh30/f$b;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLow", "b", "getHigh", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BinRange implements t30.f {
    public static final Parcelable.Creator<BinRange> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String low;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String high;

    /* JADX INFO: renamed from: com.stripe.android.model.f$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BinRange> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BinRange createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new BinRange(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BinRange[] newArray(int i11) {
            return new BinRange[i11];
        }
    }

    public BinRange(String low, String high) {
        p013kotlin.jvm.internal.s.k(low, "low");
        p013kotlin.jvm.internal.s.k(high, "high");
        this.low = low;
        this.high = high;
    }

    public final boolean a(h30.f.Unvalidated cardNumber) {
        p013kotlin.jvm.internal.s.k(cardNumber, "cardNumber");
        String strG = cardNumber.getNormalized();
        BigDecimal bigDecimalT = p013kotlin.text.t.t(strG);
        if (bigDecimalT == null) {
            return false;
        }
        return (strG.length() >= this.low.length() ? new BigDecimal(p013kotlin.text.t.T1(strG, this.low.length())).compareTo(new BigDecimal(this.low)) >= 0 : bigDecimalT.compareTo(new BigDecimal(p013kotlin.text.t.T1(this.low, strG.length()))) >= 0) && (strG.length() >= this.high.length() ? new BigDecimal(p013kotlin.text.t.T1(strG, this.high.length())).compareTo(new BigDecimal(this.high)) <= 0 : bigDecimalT.compareTo(new BigDecimal(p013kotlin.text.t.T1(this.high, strG.length()))) <= 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinRange)) {
            return false;
        }
        BinRange binRange = (BinRange) other;
        return p013kotlin.jvm.internal.s.f(this.low, binRange.low) && p013kotlin.jvm.internal.s.f(this.high, binRange.high);
    }

    public int hashCode() {
        return (this.low.hashCode() * 31) + this.high.hashCode();
    }

    public String toString() {
        return "BinRange(low=" + this.low + ", high=" + this.high + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.low);
        parcel.writeString(this.high);
    }
}
