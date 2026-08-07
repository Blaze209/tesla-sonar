package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.plaid.internal.D1;
import com.plaid.internal.F1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00014BE\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JT\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00065"}, d2 = {"Lcom/plaid/link/result/LinkAccount;", "Landroid/os/Parcelable;", "", "id", "name", "mask", "Lcom/plaid/link/result/LinkAccountSubtype;", "subtype", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "verificationStatus", "Lcom/plaid/link/result/LinkAccountBalance;", "balance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/plaid/link/result/LinkAccountSubtype;Lcom/plaid/link/result/LinkAccountVerificationStatus;Lcom/plaid/link/result/LinkAccountBalance;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/plaid/link/result/LinkAccountSubtype;", "component5", "()Lcom/plaid/link/result/LinkAccountVerificationStatus;", "component6", "()Lcom/plaid/link/result/LinkAccountBalance;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/plaid/link/result/LinkAccountSubtype;Lcom/plaid/link/result/LinkAccountVerificationStatus;Lcom/plaid/link/result/LinkAccountBalance;)Lcom/plaid/link/result/LinkAccount;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "getMask", "Lcom/plaid/link/result/LinkAccountSubtype;", "getSubtype", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "getVerificationStatus", "Lcom/plaid/link/result/LinkAccountBalance;", "getBalance", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkAccount implements Parcelable {
    public static final String NO_VALUE = "no_value";
    private final LinkAccountBalance balance;
    private final String id;
    private final String mask;
    private final String name;
    private final LinkAccountSubtype subtype;
    private final LinkAccountVerificationStatus verificationStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkAccount> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccount$Companion;", "", "<init>", "()V", "Lcom/plaid/internal/D1;", "account", "Lcom/plaid/link/result/LinkAccount;", "fromResponse$link_sdk_release", "(Lcom/plaid/internal/D1;)Lcom/plaid/link/result/LinkAccount;", "fromResponse", "", "NO_VALUE", "Ljava/lang/String;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkAccount fromResponse$link_sdk_release(D1 account) {
            s.k(account, "account");
            String strF = account.f();
            F1 f1B = account.b();
            String strA = f1B != null ? f1B.a() : null;
            F1 f1B2 = account.b();
            return new LinkAccount(strF, strA, f1B2 != null ? f1B2.b() : null, LinkAccountSubtype.INSTANCE.convert(account.c(), account.d()), LinkAccountVerificationStatus.INSTANCE.convert(account.e()), LinkAccountBalance.INSTANCE.convert$link_sdk_release(account.a()));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccount createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkAccount(parcel.readString(), parcel.readString(), parcel.readString(), (LinkAccountSubtype) parcel.readParcelable(LinkAccount.class.getClassLoader()), (LinkAccountVerificationStatus) parcel.readParcelable(LinkAccount.class.getClassLoader()), parcel.readInt() == 0 ? null : LinkAccountBalance.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccount[] newArray(int i11) {
            return new LinkAccount[i11];
        }
    }

    public LinkAccount(String id2, String str, String str2, LinkAccountSubtype subtype, LinkAccountVerificationStatus linkAccountVerificationStatus, LinkAccountBalance linkAccountBalance) {
        s.k(id2, "id");
        s.k(subtype, "subtype");
        this.id = id2;
        this.name = str;
        this.mask = str2;
        this.subtype = subtype;
        this.verificationStatus = linkAccountVerificationStatus;
        this.balance = linkAccountBalance;
    }

    public static /* synthetic */ LinkAccount copy$default(LinkAccount linkAccount, String str, String str2, String str3, LinkAccountSubtype linkAccountSubtype, LinkAccountVerificationStatus linkAccountVerificationStatus, LinkAccountBalance linkAccountBalance, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = linkAccount.id;
        }
        if ((i11 & 2) != 0) {
            str2 = linkAccount.name;
        }
        if ((i11 & 4) != 0) {
            str3 = linkAccount.mask;
        }
        if ((i11 & 8) != 0) {
            linkAccountSubtype = linkAccount.subtype;
        }
        if ((i11 & 16) != 0) {
            linkAccountVerificationStatus = linkAccount.verificationStatus;
        }
        if ((i11 & 32) != 0) {
            linkAccountBalance = linkAccount.balance;
        }
        LinkAccountVerificationStatus linkAccountVerificationStatus2 = linkAccountVerificationStatus;
        LinkAccountBalance linkAccountBalance2 = linkAccountBalance;
        return linkAccount.copy(str, str2, str3, linkAccountSubtype, linkAccountVerificationStatus2, linkAccountBalance2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMask() {
        return this.mask;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LinkAccountSubtype getSubtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LinkAccountVerificationStatus getVerificationStatus() {
        return this.verificationStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LinkAccountBalance getBalance() {
        return this.balance;
    }

    public final LinkAccount copy(String id2, String name, String mask, LinkAccountSubtype subtype, LinkAccountVerificationStatus verificationStatus, LinkAccountBalance balance) {
        s.k(id2, "id");
        s.k(subtype, "subtype");
        return new LinkAccount(id2, name, mask, subtype, verificationStatus, balance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAccount)) {
            return false;
        }
        LinkAccount linkAccount = (LinkAccount) other;
        return s.f(this.id, linkAccount.id) && s.f(this.name, linkAccount.name) && s.f(this.mask, linkAccount.mask) && s.f(this.subtype, linkAccount.subtype) && s.f(this.verificationStatus, linkAccount.verificationStatus) && s.f(this.balance, linkAccount.balance);
    }

    public final LinkAccountBalance getBalance() {
        return this.balance;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMask() {
        return this.mask;
    }

    public final String getName() {
        return this.name;
    }

    public final LinkAccountSubtype getSubtype() {
        return this.subtype;
    }

    public final LinkAccountVerificationStatus getVerificationStatus() {
        return this.verificationStatus;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mask;
        int iHashCode3 = (this.subtype.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        LinkAccountVerificationStatus linkAccountVerificationStatus = this.verificationStatus;
        int iHashCode4 = (iHashCode3 + (linkAccountVerificationStatus == null ? 0 : linkAccountVerificationStatus.hashCode())) * 31;
        LinkAccountBalance linkAccountBalance = this.balance;
        return iHashCode4 + (linkAccountBalance != null ? linkAccountBalance.hashCode() : 0);
    }

    public String toString() {
        return "LinkAccount(id=" + this.id + ", name=" + this.name + ", mask=" + this.mask + ", subtype=" + this.subtype + ", verificationStatus=" + this.verificationStatus + ", balance=" + this.balance + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.mask);
        parcel.writeParcelable(this.subtype, flags);
        parcel.writeParcelable(this.verificationStatus, flags);
        LinkAccountBalance linkAccountBalance = this.balance;
        if (linkAccountBalance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkAccountBalance.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ LinkAccount(String str, String str2, String str3, LinkAccountSubtype linkAccountSubtype, LinkAccountVerificationStatus linkAccountVerificationStatus, LinkAccountBalance linkAccountBalance, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? new LinkAccountSubtype.UNKNOWN("", new LinkAccountType.UNKNOWN("")) : linkAccountSubtype, linkAccountVerificationStatus, (i11 & 32) != 0 ? null : linkAccountBalance);
    }
}
