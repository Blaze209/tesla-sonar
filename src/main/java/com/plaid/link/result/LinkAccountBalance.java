package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import ax.c;
import com.plaid.internal.E1;
import com.plaid.internal.U3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006,"}, d2 = {"Lcom/plaid/link/result/LinkAccountBalance;", "Landroid/os/Parcelable;", "", "available", "current", "", "currency", "Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "localized", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/plaid/link/result/LocalizedLinkAccountBalance;)V", "component1", "()Ljava/lang/Double;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/plaid/link/result/LocalizedLinkAccountBalance;)Lcom/plaid/link/result/LinkAccountBalance;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Double;", "getAvailable", "getCurrent", "Ljava/lang/String;", "getCurrency", "Lcom/plaid/link/result/LocalizedLinkAccountBalance;", "getLocalized", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkAccountBalance implements Parcelable {

    @c("available")
    private final Double available;

    @c("currency")
    private final String currency;

    @c("current")
    private final Double current;

    @c("localized")
    private final LocalizedLinkAccountBalance localized;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkAccountBalance> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountBalance$Companion;", "", "<init>", "()V", "Lcom/plaid/internal/E1;", "balance", "Lcom/plaid/link/result/LinkAccountBalance;", "convert$link_sdk_release", "(Lcom/plaid/internal/E1;)Lcom/plaid/link/result/LinkAccountBalance;", "convert", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkAccountBalance convert$link_sdk_release(E1 balance) {
            if (balance == null) {
                return null;
            }
            Double dA = balance.a();
            Double dC = balance.c();
            String strB = balance.b();
            U3 u3D = balance.d();
            String strA = u3D != null ? u3D.a() : null;
            U3 u3D2 = balance.d();
            return new LinkAccountBalance(dA, dC, strB, new LocalizedLinkAccountBalance(strA, u3D2 != null ? u3D2.b() : null));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkAccountBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccountBalance createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkAccountBalance(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0 ? LocalizedLinkAccountBalance.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccountBalance[] newArray(int i11) {
            return new LinkAccountBalance[i11];
        }
    }

    public LinkAccountBalance() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ LinkAccountBalance copy$default(LinkAccountBalance linkAccountBalance, Double d11, Double d12, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = linkAccountBalance.available;
        }
        if ((i11 & 2) != 0) {
            d12 = linkAccountBalance.current;
        }
        if ((i11 & 4) != 0) {
            str = linkAccountBalance.currency;
        }
        if ((i11 & 8) != 0) {
            localizedLinkAccountBalance = linkAccountBalance.localized;
        }
        return linkAccountBalance.copy(d11, d12, str, localizedLinkAccountBalance);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LocalizedLinkAccountBalance getLocalized() {
        return this.localized;
    }

    public final LinkAccountBalance copy(Double available, Double current, String currency, LocalizedLinkAccountBalance localized) {
        return new LinkAccountBalance(available, current, currency, localized);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAccountBalance)) {
            return false;
        }
        LinkAccountBalance linkAccountBalance = (LinkAccountBalance) other;
        return s.f(this.available, linkAccountBalance.available) && s.f(this.current, linkAccountBalance.current) && s.f(this.currency, linkAccountBalance.currency) && s.f(this.localized, linkAccountBalance.localized);
    }

    public final Double getAvailable() {
        return this.available;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getCurrent() {
        return this.current;
    }

    public final LocalizedLinkAccountBalance getLocalized() {
        return this.localized;
    }

    public int hashCode() {
        Double d11 = this.available;
        int iHashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.current;
        int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str = this.currency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LocalizedLinkAccountBalance localizedLinkAccountBalance = this.localized;
        return iHashCode3 + (localizedLinkAccountBalance != null ? localizedLinkAccountBalance.hashCode() : 0);
    }

    public String toString() {
        return "LinkAccountBalance(available=" + this.available + ", current=" + this.current + ", currency=" + this.currency + ", localized=" + this.localized + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        Double d11 = this.available;
        if (d11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d11.doubleValue());
        }
        Double d12 = this.current;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d12.doubleValue());
        }
        parcel.writeString(this.currency);
        LocalizedLinkAccountBalance localizedLinkAccountBalance = this.localized;
        if (localizedLinkAccountBalance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localizedLinkAccountBalance.writeToParcel(parcel, flags);
        }
    }

    public LinkAccountBalance(Double d11, Double d12, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance) {
        this.available = d11;
        this.current = d12;
        this.currency = str;
        this.localized = localizedLinkAccountBalance;
    }

    public /* synthetic */ LinkAccountBalance(Double d11, Double d12, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : d12, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : localizedLinkAccountBalance);
    }
}
