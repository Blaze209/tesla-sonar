package com.plaid.link.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.plaid.internal.C4354b4;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006%"}, d2 = {"Lcom/plaid/link/event/LinkEvent;", "Landroid/os/Parcelable;", "Lcom/plaid/link/event/LinkEventName;", "eventName", "Lcom/plaid/link/event/LinkEventMetadata;", OrcaKeys.METADATA, "<init>", "(Lcom/plaid/link/event/LinkEventName;Lcom/plaid/link/event/LinkEventMetadata;)V", "component1", "()Lcom/plaid/link/event/LinkEventName;", "component2", "()Lcom/plaid/link/event/LinkEventMetadata;", "copy", "(Lcom/plaid/link/event/LinkEventName;Lcom/plaid/link/event/LinkEventMetadata;)Lcom/plaid/link/event/LinkEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/plaid/link/event/LinkEventName;", "getEventName", "Lcom/plaid/link/event/LinkEventMetadata;", "getMetadata", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkEvent implements Parcelable {
    private final LinkEventName eventName;
    private final LinkEventMetadata metadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkEvent> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0000¢\u0006\u0002\b\bJ\b\u0010\t\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEvent$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/event/LinkEvent;", "linkData", "", "", "fromMap$link_sdk_release", "getTimestamp", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getTimestamp() {
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ENGLISH).format(new Date());
            s.j(str, "format(...)");
            return str;
        }

        public final LinkEvent fromMap$link_sdk_release(Map<String, String> linkData) {
            s.k(linkData, "linkData");
            LinkEventName linkEventNameFromString$link_sdk_release = LinkEventName.INSTANCE.fromString$link_sdk_release(C4354b4.a(linkData, "event_name", ""));
            String strA = C4354b4.a(linkData, "error_code", "");
            String strA2 = C4354b4.a(linkData, "error_message", "");
            String strA3 = C4354b4.a(linkData, "error_type", "");
            String strA4 = C4354b4.a(linkData, "exit_status", "");
            String strA5 = C4354b4.a(linkData, "institution_id", "");
            String strA6 = C4354b4.a(linkData, "institution_name", "");
            String strA7 = C4354b4.a(linkData, "institution_search_query", "");
            String strA8 = C4354b4.a(linkData, "issue_description", "");
            String strA9 = C4354b4.a(linkData, "issue_detected_at", "");
            String strA10 = C4354b4.a(linkData, "issue_id", "");
            String strA11 = C4354b4.a(linkData, "link_session_id", "");
            String strA12 = C4354b4.a(linkData, "mfa_type", "");
            String strA13 = C4354b4.a(linkData, "request_id", "");
            String strA14 = C4354b4.a(linkData, "timestamp", getTimestamp());
            LinkEventViewName linkEventViewNameFromString$link_sdk_release = LinkEventViewName.INSTANCE.fromString$link_sdk_release(C4354b4.a(linkData, "view_name", ""));
            return new LinkEvent(linkEventNameFromString$link_sdk_release, new LinkEventMetadata(null, strA, strA2, strA3, strA4, strA5, strA6, strA7, strA8, strA9, strA10, strA11, strA12, strA13, C4354b4.a(linkData, "selection", ""), strA14, linkEventViewNameFromString$link_sdk_release, C4354b4.a(linkData, "metadata_json", ""), null, linkData.containsKey("is_update_mode") ? linkData.get("is_update_mode") : null, linkData.containsKey("match_reason") ? linkData.get("match_reason") : null, linkData.containsKey("account_number_mask") ? linkData.get("account_number_mask") : null, 262145, null));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEvent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkEvent((LinkEventName) parcel.readParcelable(LinkEvent.class.getClassLoader()), LinkEventMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEvent[] newArray(int i11) {
            return new LinkEvent[i11];
        }
    }

    public LinkEvent(LinkEventName eventName, LinkEventMetadata metadata) {
        s.k(eventName, "eventName");
        s.k(metadata, "metadata");
        this.eventName = eventName;
        this.metadata = metadata;
    }

    public static /* synthetic */ LinkEvent copy$default(LinkEvent linkEvent, LinkEventName linkEventName, LinkEventMetadata linkEventMetadata, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkEventName = linkEvent.eventName;
        }
        if ((i11 & 2) != 0) {
            linkEventMetadata = linkEvent.metadata;
        }
        return linkEvent.copy(linkEventName, linkEventMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LinkEventName getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LinkEventMetadata getMetadata() {
        return this.metadata;
    }

    public final LinkEvent copy(LinkEventName eventName, LinkEventMetadata metadata) {
        s.k(eventName, "eventName");
        s.k(metadata, "metadata");
        return new LinkEvent(eventName, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkEvent)) {
            return false;
        }
        LinkEvent linkEvent = (LinkEvent) other;
        return s.f(this.eventName, linkEvent.eventName) && s.f(this.metadata, linkEvent.metadata);
    }

    public final LinkEventName getEventName() {
        return this.eventName;
    }

    public final LinkEventMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.eventName.hashCode() * 31);
    }

    public String toString() {
        return "LinkEvent(eventName=" + this.eventName + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeParcelable(this.eventName, flags);
        this.metadata.writeToParcel(parcel, flags);
    }
}
