package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BE\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010\u0011¨\u0006."}, d2 = {"Lcom/plaid/link/result/LinkExitMetadata;", "Landroid/os/Parcelable;", "Lcom/plaid/link/result/LinkExitMetadataStatus;", PermissionsResponse.STATUS_KEY, "Lcom/plaid/link/result/LinkInstitution;", "institution", "", "linkSessionId", "requestId", "metadataJson", "<init>", "(Lcom/plaid/link/result/LinkExitMetadataStatus;Lcom/plaid/link/result/LinkInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/plaid/link/result/LinkExitMetadataStatus;", "component2", "()Lcom/plaid/link/result/LinkInstitution;", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lcom/plaid/link/result/LinkExitMetadataStatus;Lcom/plaid/link/result/LinkInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/plaid/link/result/LinkExitMetadata;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/plaid/link/result/LinkExitMetadataStatus;", "getStatus", "Lcom/plaid/link/result/LinkInstitution;", "getInstitution", "Ljava/lang/String;", "getLinkSessionId", "getRequestId", "getMetadataJson", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkExitMetadata implements Parcelable {
    public static final Parcelable.Creator<LinkExitMetadata> CREATOR = new Creator();
    private final LinkInstitution institution;
    private final String linkSessionId;
    private final String metadataJson;
    private final String requestId;
    private final LinkExitMetadataStatus status;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkExitMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExitMetadata createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkExitMetadata((LinkExitMetadataStatus) parcel.readParcelable(LinkExitMetadata.class.getClassLoader()), parcel.readInt() == 0 ? null : LinkInstitution.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExitMetadata[] newArray(int i11) {
            return new LinkExitMetadata[i11];
        }
    }

    public LinkExitMetadata() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ LinkExitMetadata copy$default(LinkExitMetadata linkExitMetadata, LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkExitMetadataStatus = linkExitMetadata.status;
        }
        if ((i11 & 2) != 0) {
            linkInstitution = linkExitMetadata.institution;
        }
        if ((i11 & 4) != 0) {
            str = linkExitMetadata.linkSessionId;
        }
        if ((i11 & 8) != 0) {
            str2 = linkExitMetadata.requestId;
        }
        if ((i11 & 16) != 0) {
            str3 = linkExitMetadata.metadataJson;
        }
        String str4 = str3;
        String str5 = str;
        return linkExitMetadata.copy(linkExitMetadataStatus, linkInstitution, str5, str2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LinkExitMetadataStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LinkInstitution getInstitution() {
        return this.institution;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public final LinkExitMetadata copy(LinkExitMetadataStatus status, LinkInstitution institution, String linkSessionId, String requestId, String metadataJson) {
        return new LinkExitMetadata(status, institution, linkSessionId, requestId, metadataJson);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkExitMetadata)) {
            return false;
        }
        LinkExitMetadata linkExitMetadata = (LinkExitMetadata) other;
        return s.f(this.status, linkExitMetadata.status) && s.f(this.institution, linkExitMetadata.institution) && s.f(this.linkSessionId, linkExitMetadata.linkSessionId) && s.f(this.requestId, linkExitMetadata.requestId) && s.f(this.metadataJson, linkExitMetadata.metadataJson);
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

    public final String getRequestId() {
        return this.requestId;
    }

    public final LinkExitMetadataStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        LinkExitMetadataStatus linkExitMetadataStatus = this.status;
        int iHashCode = (linkExitMetadataStatus == null ? 0 : linkExitMetadataStatus.hashCode()) * 31;
        LinkInstitution linkInstitution = this.institution;
        int iHashCode2 = (iHashCode + (linkInstitution == null ? 0 : linkInstitution.hashCode())) * 31;
        String str = this.linkSessionId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metadataJson;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "LinkExitMetadata(status=" + this.status + ", institution=" + this.institution + ", linkSessionId=" + this.linkSessionId + ", requestId=" + this.requestId + ", metadataJson=" + this.metadataJson + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeParcelable(this.status, flags);
        LinkInstitution linkInstitution = this.institution;
        if (linkInstitution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkInstitution.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.linkSessionId);
        parcel.writeString(this.requestId);
        parcel.writeString(this.metadataJson);
    }

    public LinkExitMetadata(LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3) {
        this.status = linkExitMetadataStatus;
        this.institution = linkInstitution;
        this.linkSessionId = str;
        this.requestId = str2;
        this.metadataJson = str3;
    }

    public /* synthetic */ LinkExitMetadata(LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : linkExitMetadataStatus, (i11 & 2) != 0 ? null : linkInstitution, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
    }
}
