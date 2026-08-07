package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.C4354b4;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006%"}, d2 = {"Lcom/plaid/link/result/LinkExit;", "Lcom/plaid/link/result/LinkResult;", "Lcom/plaid/link/result/LinkError;", AnalyticsAttribute.Error, "Lcom/plaid/link/result/LinkExitMetadata;", OrcaKeys.METADATA, "<init>", "(Lcom/plaid/link/result/LinkError;Lcom/plaid/link/result/LinkExitMetadata;)V", "component1", "()Lcom/plaid/link/result/LinkError;", "component2", "()Lcom/plaid/link/result/LinkExitMetadata;", "copy", "(Lcom/plaid/link/result/LinkError;Lcom/plaid/link/result/LinkExitMetadata;)Lcom/plaid/link/result/LinkExit;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/plaid/link/result/LinkError;", "getError", "Lcom/plaid/link/result/LinkExitMetadata;", "getMetadata", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkExit implements LinkResult {
    private final LinkError error;
    private final LinkExitMetadata metadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkExit> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/plaid/link/result/LinkExit$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/result/LinkExit;", "linkData", "", "", "fromMap$link_sdk_release", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkExit fromMap$link_sdk_release(Map<String, String> linkData) {
            s.k(linkData, "linkData");
            LinkInstitution linkInstitution = null;
            LinkError linkError = linkData.get("error_code") != null ? new LinkError(LinkErrorCode.INSTANCE.convert(C4354b4.a(linkData, "error_code", "")), C4354b4.a(linkData, "error_message", ""), C4354b4.a(linkData, "error_display_message", ""), C4354b4.a(linkData, "error_json", "")) : null;
            LinkExitMetadataStatus linkExitMetadataStatusFromString = LinkExitMetadataStatus.INSTANCE.fromString(C4354b4.a(linkData, PermissionsResponse.STATUS_KEY, ""));
            String strA = C4354b4.a(linkData, "institution_id", "");
            String strA2 = C4354b4.a(linkData, "institution_name", "");
            if (strA != null && strA.length() != 0 && strA2 != null && strA2.length() != 0) {
                linkInstitution = new LinkInstitution(strA, strA2);
            }
            return new LinkExit(linkError, new LinkExitMetadata(linkExitMetadataStatusFromString, linkInstitution, C4354b4.a(linkData, "link_session_id", ""), C4354b4.a(linkData, "request_id", ""), C4354b4.a(linkData, "metadata_json", "")));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkExit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExit createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkExit(parcel.readInt() == 0 ? null : LinkError.CREATOR.createFromParcel(parcel), LinkExitMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExit[] newArray(int i11) {
            return new LinkExit[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkExit() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LinkExit copy$default(LinkExit linkExit, LinkError linkError, LinkExitMetadata linkExitMetadata, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkError = linkExit.error;
        }
        if ((i11 & 2) != 0) {
            linkExitMetadata = linkExit.metadata;
        }
        return linkExit.copy(linkError, linkExitMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LinkError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LinkExitMetadata getMetadata() {
        return this.metadata;
    }

    public final LinkExit copy(LinkError error, LinkExitMetadata metadata) {
        s.k(metadata, "metadata");
        return new LinkExit(error, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkExit)) {
            return false;
        }
        LinkExit linkExit = (LinkExit) other;
        return s.f(this.error, linkExit.error) && s.f(this.metadata, linkExit.metadata);
    }

    public final LinkError getError() {
        return this.error;
    }

    public final LinkExitMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        LinkError linkError = this.error;
        return this.metadata.hashCode() + ((linkError == null ? 0 : linkError.hashCode()) * 31);
    }

    public String toString() {
        return "LinkExit(error=" + this.error + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        LinkError linkError = this.error;
        if (linkError == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkError.writeToParcel(parcel, flags);
        }
        this.metadata.writeToParcel(parcel, flags);
    }

    public LinkExit(LinkError linkError, LinkExitMetadata metadata) {
        s.k(metadata, "metadata");
        this.error = linkError;
        this.metadata = metadata;
    }

    public /* synthetic */ LinkExit(LinkError linkError, LinkExitMetadata linkExitMetadata, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : linkError, (i11 & 2) != 0 ? new LinkExitMetadata(null, null, null, null, null, 15, null) : linkExitMetadata);
    }
}
