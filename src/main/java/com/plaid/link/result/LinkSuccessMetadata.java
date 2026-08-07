package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C4571x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J@\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0011¨\u0006,"}, d2 = {"Lcom/plaid/link/result/LinkSuccessMetadata;", "Landroid/os/Parcelable;", "Lcom/plaid/link/result/LinkInstitution;", "institution", "", "Lcom/plaid/link/result/LinkAccount;", "accounts", "", "linkSessionId", "metadataJson", "<init>", "(Lcom/plaid/link/result/LinkInstitution;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/plaid/link/result/LinkInstitution;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/plaid/link/result/LinkInstitution;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/plaid/link/result/LinkSuccessMetadata;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/plaid/link/result/LinkInstitution;", "getInstitution", "Ljava/util/List;", "getAccounts", "Ljava/lang/String;", "getLinkSessionId", "getMetadataJson", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkSuccessMetadata implements Parcelable {
    public static final Parcelable.Creator<LinkSuccessMetadata> CREATOR = new Creator();
    private final List<LinkAccount> accounts;
    private final LinkInstitution institution;
    private final String linkSessionId;
    private final String metadataJson;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkSuccessMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccessMetadata createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            LinkInstitution linkInstitutionCreateFromParcel = parcel.readInt() == 0 ? null : LinkInstitution.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(LinkAccount.CREATOR.createFromParcel(parcel));
            }
            return new LinkSuccessMetadata(linkInstitutionCreateFromParcel, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccessMetadata[] newArray(int i11) {
            return new LinkSuccessMetadata[i11];
        }
    }

    public LinkSuccessMetadata(LinkInstitution linkInstitution, List<LinkAccount> accounts, String linkSessionId, String metadataJson) {
        s.k(accounts, "accounts");
        s.k(linkSessionId, "linkSessionId");
        s.k(metadataJson, "metadataJson");
        this.institution = linkInstitution;
        this.accounts = accounts;
        this.linkSessionId = linkSessionId;
        this.metadataJson = metadataJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkSuccessMetadata copy$default(LinkSuccessMetadata linkSuccessMetadata, LinkInstitution linkInstitution, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkInstitution = linkSuccessMetadata.institution;
        }
        if ((i11 & 2) != 0) {
            list = linkSuccessMetadata.accounts;
        }
        if ((i11 & 4) != 0) {
            str = linkSuccessMetadata.linkSessionId;
        }
        if ((i11 & 8) != 0) {
            str2 = linkSuccessMetadata.metadataJson;
        }
        return linkSuccessMetadata.copy(linkInstitution, list, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LinkInstitution getInstitution() {
        return this.institution;
    }

    public final List<LinkAccount> component2() {
        return this.accounts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public final LinkSuccessMetadata copy(LinkInstitution institution, List<LinkAccount> accounts, String linkSessionId, String metadataJson) {
        s.k(accounts, "accounts");
        s.k(linkSessionId, "linkSessionId");
        s.k(metadataJson, "metadataJson");
        return new LinkSuccessMetadata(institution, accounts, linkSessionId, metadataJson);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkSuccessMetadata)) {
            return false;
        }
        LinkSuccessMetadata linkSuccessMetadata = (LinkSuccessMetadata) other;
        return s.f(this.institution, linkSuccessMetadata.institution) && s.f(this.accounts, linkSuccessMetadata.accounts) && s.f(this.linkSessionId, linkSuccessMetadata.linkSessionId) && s.f(this.metadataJson, linkSuccessMetadata.metadataJson);
    }

    public final List<LinkAccount> getAccounts() {
        return this.accounts;
    }

    public final LinkInstitution getInstitution() {
        return this.institution;
    }

    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public int hashCode() {
        LinkInstitution linkInstitution = this.institution;
        return this.metadataJson.hashCode() + C4571x.a(this.linkSessionId, (this.accounts.hashCode() + ((linkInstitution == null ? 0 : linkInstitution.hashCode()) * 31)) * 31, 31);
    }

    public String toString() {
        return "LinkSuccessMetadata(institution=" + this.institution + ", accounts=" + this.accounts + ", linkSessionId=" + this.linkSessionId + ", metadataJson=" + this.metadataJson + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        LinkInstitution linkInstitution = this.institution;
        if (linkInstitution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkInstitution.writeToParcel(parcel, flags);
        }
        List<LinkAccount> list = this.accounts;
        parcel.writeInt(list.size());
        Iterator<LinkAccount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.linkSessionId);
        parcel.writeString(this.metadataJson);
    }
}
