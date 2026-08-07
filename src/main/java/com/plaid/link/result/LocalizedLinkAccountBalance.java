package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import ax.c;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "Landroid/os/Parcelable;", "", "available", "current", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAvailable", "getCurrent", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LocalizedLinkAccountBalance implements Parcelable {
    public static final Parcelable.Creator<LocalizedLinkAccountBalance> CREATOR = new Creator();

    @c("available")
    private final String available;

    @c("current")
    private final String current;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalizedLinkAccountBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizedLinkAccountBalance createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LocalizedLinkAccountBalance(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizedLinkAccountBalance[] newArray(int i11) {
            return new LocalizedLinkAccountBalance[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalizedLinkAccountBalance() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LocalizedLinkAccountBalance copy$default(LocalizedLinkAccountBalance localizedLinkAccountBalance, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = localizedLinkAccountBalance.available;
        }
        if ((i11 & 2) != 0) {
            str2 = localizedLinkAccountBalance.current;
        }
        return localizedLinkAccountBalance.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrent() {
        return this.current;
    }

    public final LocalizedLinkAccountBalance copy(String available, String current) {
        return new LocalizedLinkAccountBalance(available, current);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalizedLinkAccountBalance)) {
            return false;
        }
        LocalizedLinkAccountBalance localizedLinkAccountBalance = (LocalizedLinkAccountBalance) other;
        return s.f(this.available, localizedLinkAccountBalance.available) && s.f(this.current, localizedLinkAccountBalance.current);
    }

    public final String getAvailable() {
        return this.available;
    }

    public final String getCurrent() {
        return this.current;
    }

    public int hashCode() {
        String str = this.available;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.current;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LocalizedLinkAccountBalance(available=" + this.available + ", current=" + this.current + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.available);
        parcel.writeString(this.current);
    }

    public LocalizedLinkAccountBalance(String str, String str2) {
        this.available = str;
        this.current = str2;
    }

    public /* synthetic */ LocalizedLinkAccountBalance(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
