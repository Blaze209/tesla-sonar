package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.plaid.internal.C4354b4;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/plaid/link/result/LinkSuccess;", "Lcom/plaid/link/result/LinkResult;", "", "publicToken", "Lcom/plaid/link/result/LinkSuccessMetadata;", OrcaKeys.METADATA, "<init>", "(Ljava/lang/String;Lcom/plaid/link/result/LinkSuccessMetadata;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/plaid/link/result/LinkSuccessMetadata;", "copy", "(Ljava/lang/String;Lcom/plaid/link/result/LinkSuccessMetadata;)Lcom/plaid/link/result/LinkSuccess;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPublicToken", "Lcom/plaid/link/result/LinkSuccessMetadata;", "getMetadata", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkSuccess implements LinkResult {
    private final LinkSuccessMetadata metadata;
    private final String publicToken;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkSuccess> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/plaid/link/result/LinkSuccess$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/result/LinkSuccess;", "linkData", "", "", "accounts", "", "Lcom/plaid/link/result/LinkAccount;", "fromMap$link_sdk_release", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkSuccess fromMap$link_sdk_release(Map<String, String> linkData, List<LinkAccount> accounts) {
            s.k(linkData, "linkData");
            s.k(accounts, "accounts");
            String strA = C4354b4.a(linkData, "public_token", "");
            String strA2 = C4354b4.a(linkData, "institution_id", "");
            String strA3 = C4354b4.a(linkData, "institution_name", "");
            String linkSessionId = C4354b4.a(linkData, "link_session_id", "");
            String metadataJson = C4354b4.a(linkData, "metadata_json", "");
            s.k(accounts, "accounts");
            s.k(linkSessionId, "linkSessionId");
            s.k(metadataJson, "metadataJson");
            return new LinkSuccess(strA, new LinkSuccessMetadata((strA2 == null || strA2.length() == 0 || strA3 == null || strA3.length() == 0) ? null : new LinkInstitution(strA2, strA3), accounts, linkSessionId, metadataJson));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkSuccess> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccess createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkSuccess(parcel.readString(), LinkSuccessMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccess[] newArray(int i11) {
            return new LinkSuccess[i11];
        }
    }

    public LinkSuccess(String publicToken, LinkSuccessMetadata metadata) {
        s.k(publicToken, "publicToken");
        s.k(metadata, "metadata");
        this.publicToken = publicToken;
        this.metadata = metadata;
    }

    public static /* synthetic */ LinkSuccess copy$default(LinkSuccess linkSuccess, String str, LinkSuccessMetadata linkSuccessMetadata, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = linkSuccess.publicToken;
        }
        if ((i11 & 2) != 0) {
            linkSuccessMetadata = linkSuccess.metadata;
        }
        return linkSuccess.copy(str, linkSuccessMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPublicToken() {
        return this.publicToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LinkSuccessMetadata getMetadata() {
        return this.metadata;
    }

    public final LinkSuccess copy(String publicToken, LinkSuccessMetadata metadata) {
        s.k(publicToken, "publicToken");
        s.k(metadata, "metadata");
        return new LinkSuccess(publicToken, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkSuccess)) {
            return false;
        }
        LinkSuccess linkSuccess = (LinkSuccess) other;
        return s.f(this.publicToken, linkSuccess.publicToken) && s.f(this.metadata, linkSuccess.metadata);
    }

    public final LinkSuccessMetadata getMetadata() {
        return this.metadata;
    }

    public final String getPublicToken() {
        return this.publicToken;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.publicToken.hashCode() * 31);
    }

    public String toString() {
        return "LinkSuccess(publicToken=" + this.publicToken + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.publicToken);
        this.metadata.writeToParcel(parcel, flags);
    }
}
