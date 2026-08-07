package com.plaid.link.event;

import android.os.Parcel;
import android.os.Parcelable;
import ax.c;
import com.plaid.internal.C4571x;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.x;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0001`B\u0089\u0002\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010 J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010 J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010 J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010 J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010 J\u0094\u0002\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010 J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020:HÖ\u0001¢\u0006\u0004\bB\u0010<J \u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020:HÖ\u0001¢\u0006\u0004\bG\u0010HR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\bK\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bL\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bM\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bN\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bO\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bP\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bQ\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bR\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bS\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bT\u0010 R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bU\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bV\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bW\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bX\u0010 R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bY\u0010 R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010Z\u001a\u0004\b[\u00101R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\b\\\u0010 R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\b]\u0010 R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\b\u0017\u0010 R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\b^\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010I\u001a\u0004\b_\u0010 ¨\u0006a"}, d2 = {"Lcom/plaid/link/event/LinkEventMetadata;", "Landroid/os/Parcelable;", "", "brandName", "errorCode", "errorMessage", "errorType", "exitStatus", "institutionId", "institutionName", "institutionSearchQuery", "issueDescription", "issueDetectedAt", "issueId", "linkSessionId", "mfaType", "requestId", "selection", "timestamp", "Lcom/plaid/link/event/LinkEventViewName;", "viewName", "metadataJson", "routingNumber", "isUpdateMode", "matchReason", "accountNumberMask", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/plaid/link/event/LinkEventViewName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "toMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Lcom/plaid/link/event/LinkEventViewName;", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/plaid/link/event/LinkEventViewName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/plaid/link/event/LinkEventMetadata;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBrandName", "getErrorCode", "getErrorMessage", "getErrorType", "getExitStatus", "getInstitutionId", "getInstitutionName", "getInstitutionSearchQuery", "getIssueDescription", "getIssueDetectedAt", "getIssueId", "getLinkSessionId", "getMfaType", "getRequestId", "getSelection", "getTimestamp", "Lcom/plaid/link/event/LinkEventViewName;", "getViewName", "getMetadataJson", "getRoutingNumber", "getMatchReason", "getAccountNumberMask", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkEventMetadata implements Parcelable {

    @c("account_number_mask")
    private final String accountNumberMask;

    @c("brand_name")
    private final String brandName;

    @c("error_code")
    private final String errorCode;

    @c("error_message")
    private final String errorMessage;

    @c("error_type")
    private final String errorType;

    @c("exit_status")
    private final String exitStatus;

    @c("institution_id")
    private final String institutionId;

    @c("institution_name")
    private final String institutionName;

    @c("institution_search_query")
    private final String institutionSearchQuery;

    @c("is_update_mode")
    private final String isUpdateMode;

    @c("issue_description")
    private final String issueDescription;

    @c("issue_detected_at")
    private final String issueDetectedAt;

    @c("issue_id")
    private final String issueId;

    @c("link_session_id")
    private final String linkSessionId;

    @c("match_reason")
    private final String matchReason;

    @c("metadata_json")
    private final String metadataJson;

    @c("mfa_type")
    private final String mfaType;

    @c("request_id")
    private final String requestId;

    @c("routing_number")
    private final String routingNumber;

    @c("selection")
    private final String selection;

    @c("timestamp")
    private final String timestamp;

    @c("view_name")
    private final LinkEventViewName viewName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkEventMetadata> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, d2 = {"Lcom/plaid/link/event/LinkEventMetadata$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/event/LinkEventMetadata;", "linkData", "", "", "linkSessionId", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkEventMetadata fromMap(Map<String, String> linkData, String linkSessionId) {
            s.k(linkData, "linkData");
            String str = linkData.get("error_code");
            String str2 = linkData.get("error_message");
            String str3 = linkData.get("error_type");
            String str4 = linkData.get("exit_status");
            String str5 = linkData.get("institution_id");
            String str6 = linkData.get("institution_name");
            String str7 = linkData.get("institution_search_query");
            String str8 = linkData.get("issue_description");
            String str9 = linkData.get("issue_detected_at");
            String str10 = linkData.get("issue_id");
            String str11 = linkSessionId == null ? "" : linkSessionId;
            String str12 = linkData.get("mfa_type");
            String str13 = linkData.get("request_id");
            String str14 = str13 == null ? "" : str13;
            String str15 = linkData.containsKey("routing_number") ? linkData.get("routing_number") : null;
            String str16 = linkData.get("timestamp");
            String str17 = str16 == null ? "" : str16;
            LinkEventViewName linkEventViewNameFromString$link_sdk_release = LinkEventViewName.INSTANCE.fromString$link_sdk_release(linkData.get("view_name"));
            return new LinkEventMetadata(linkData.containsKey("brand_name") ? linkData.get("brand_name") : null, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str14, linkData.containsKey("selection") ? linkData.get("selection") : null, str17, linkEventViewNameFromString$link_sdk_release, linkData.get("metadata_json"), str15, linkData.containsKey("is_update_mode") ? linkData.get("is_update_mode") : null, linkData.containsKey("match_reason") ? linkData.get("match_reason") : null, linkData.containsKey("account_number_mask") ? linkData.get("account_number_mask") : null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkEventMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEventMetadata createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkEventMetadata(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LinkEventViewName) parcel.readParcelable(LinkEventMetadata.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEventMetadata[] newArray(int i11) {
            return new LinkEventMetadata[i11];
        }
    }

    public LinkEventMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String linkSessionId, String str12, String str13, String str14, String timestamp, LinkEventViewName linkEventViewName, String str15, String str16, String str17, String str18, String str19) {
        s.k(linkSessionId, "linkSessionId");
        s.k(timestamp, "timestamp");
        this.brandName = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.errorType = str4;
        this.exitStatus = str5;
        this.institutionId = str6;
        this.institutionName = str7;
        this.institutionSearchQuery = str8;
        this.issueDescription = str9;
        this.issueDetectedAt = str10;
        this.issueId = str11;
        this.linkSessionId = linkSessionId;
        this.mfaType = str12;
        this.requestId = str13;
        this.selection = str14;
        this.timestamp = timestamp;
        this.viewName = linkEventViewName;
        this.metadataJson = str15;
        this.routingNumber = str16;
        this.isUpdateMode = str17;
        this.matchReason = str18;
        this.accountNumberMask = str19;
    }

    public static /* synthetic */ LinkEventMetadata copy$default(LinkEventMetadata linkEventMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, LinkEventViewName linkEventViewName, String str17, String str18, String str19, String str20, String str21, int i11, Object obj) {
        String str22;
        String str23;
        String str24 = (i11 & 1) != 0 ? linkEventMetadata.brandName : str;
        String str25 = (i11 & 2) != 0 ? linkEventMetadata.errorCode : str2;
        String str26 = (i11 & 4) != 0 ? linkEventMetadata.errorMessage : str3;
        String str27 = (i11 & 8) != 0 ? linkEventMetadata.errorType : str4;
        String str28 = (i11 & 16) != 0 ? linkEventMetadata.exitStatus : str5;
        String str29 = (i11 & 32) != 0 ? linkEventMetadata.institutionId : str6;
        String str30 = (i11 & 64) != 0 ? linkEventMetadata.institutionName : str7;
        String str31 = (i11 & 128) != 0 ? linkEventMetadata.institutionSearchQuery : str8;
        String str32 = (i11 & 256) != 0 ? linkEventMetadata.issueDescription : str9;
        String str33 = (i11 & 512) != 0 ? linkEventMetadata.issueDetectedAt : str10;
        String str34 = (i11 & 1024) != 0 ? linkEventMetadata.issueId : str11;
        String str35 = (i11 & 2048) != 0 ? linkEventMetadata.linkSessionId : str12;
        String str36 = (i11 & 4096) != 0 ? linkEventMetadata.mfaType : str13;
        String str37 = (i11 & PKIFailureInfo.certRevoked) != 0 ? linkEventMetadata.requestId : str14;
        String str38 = str24;
        String str39 = (i11 & 16384) != 0 ? linkEventMetadata.selection : str15;
        String str40 = (i11 & 32768) != 0 ? linkEventMetadata.timestamp : str16;
        LinkEventViewName linkEventViewName2 = (i11 & 65536) != 0 ? linkEventMetadata.viewName : linkEventViewName;
        String str41 = (i11 & 131072) != 0 ? linkEventMetadata.metadataJson : str17;
        String str42 = (i11 & 262144) != 0 ? linkEventMetadata.routingNumber : str18;
        String str43 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? linkEventMetadata.isUpdateMode : str19;
        String str44 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? linkEventMetadata.matchReason : str20;
        if ((i11 & PKIFailureInfo.badSenderNonce) != 0) {
            str23 = str44;
            str22 = linkEventMetadata.accountNumberMask;
        } else {
            str22 = str21;
            str23 = str44;
        }
        return linkEventMetadata.copy(str38, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str39, str40, linkEventViewName2, str41, str42, str43, str23, str22);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBrandName() {
        return this.brandName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIssueDetectedAt() {
        return this.issueDetectedAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIssueId() {
        return this.issueId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMfaType() {
        return this.mfaType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final LinkEventViewName getViewName() {
        return this.viewName;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMetadataJson() {
        return this.metadataJson;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getIsUpdateMode() {
        return this.isUpdateMode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getMatchReason() {
        return this.matchReason;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getAccountNumberMask() {
        return this.accountNumberMask;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExitStatus() {
        return this.exitStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInstitutionSearchQuery() {
        return this.institutionSearchQuery;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIssueDescription() {
        return this.issueDescription;
    }

    public final LinkEventMetadata copy(String brandName, String errorCode, String errorMessage, String errorType, String exitStatus, String institutionId, String institutionName, String institutionSearchQuery, String issueDescription, String issueDetectedAt, String issueId, String linkSessionId, String mfaType, String requestId, String selection, String timestamp, LinkEventViewName viewName, String metadataJson, String routingNumber, String isUpdateMode, String matchReason, String accountNumberMask) {
        s.k(linkSessionId, "linkSessionId");
        s.k(timestamp, "timestamp");
        return new LinkEventMetadata(brandName, errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, issueDescription, issueDetectedAt, issueId, linkSessionId, mfaType, requestId, selection, timestamp, viewName, metadataJson, routingNumber, isUpdateMode, matchReason, accountNumberMask);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkEventMetadata)) {
            return false;
        }
        LinkEventMetadata linkEventMetadata = (LinkEventMetadata) other;
        return s.f(this.brandName, linkEventMetadata.brandName) && s.f(this.errorCode, linkEventMetadata.errorCode) && s.f(this.errorMessage, linkEventMetadata.errorMessage) && s.f(this.errorType, linkEventMetadata.errorType) && s.f(this.exitStatus, linkEventMetadata.exitStatus) && s.f(this.institutionId, linkEventMetadata.institutionId) && s.f(this.institutionName, linkEventMetadata.institutionName) && s.f(this.institutionSearchQuery, linkEventMetadata.institutionSearchQuery) && s.f(this.issueDescription, linkEventMetadata.issueDescription) && s.f(this.issueDetectedAt, linkEventMetadata.issueDetectedAt) && s.f(this.issueId, linkEventMetadata.issueId) && s.f(this.linkSessionId, linkEventMetadata.linkSessionId) && s.f(this.mfaType, linkEventMetadata.mfaType) && s.f(this.requestId, linkEventMetadata.requestId) && s.f(this.selection, linkEventMetadata.selection) && s.f(this.timestamp, linkEventMetadata.timestamp) && s.f(this.viewName, linkEventMetadata.viewName) && s.f(this.metadataJson, linkEventMetadata.metadataJson) && s.f(this.routingNumber, linkEventMetadata.routingNumber) && s.f(this.isUpdateMode, linkEventMetadata.isUpdateMode) && s.f(this.matchReason, linkEventMetadata.matchReason) && s.f(this.accountNumberMask, linkEventMetadata.accountNumberMask);
    }

    public final String getAccountNumberMask() {
        return this.accountNumberMask;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getExitStatus() {
        return this.exitStatus;
    }

    public final String getInstitutionId() {
        return this.institutionId;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getInstitutionSearchQuery() {
        return this.institutionSearchQuery;
    }

    public final String getIssueDescription() {
        return this.issueDescription;
    }

    public final String getIssueDetectedAt() {
        return this.issueDetectedAt;
    }

    public final String getIssueId() {
        return this.issueId;
    }

    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    public final String getMatchReason() {
        return this.matchReason;
    }

    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public final String getMfaType() {
        return this.mfaType;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final String getSelection() {
        return this.selection;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final LinkEventViewName getViewName() {
        return this.viewName;
    }

    public int hashCode() {
        String str = this.brandName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.exitStatus;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.institutionId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.institutionName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.institutionSearchQuery;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.issueDescription;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.issueDetectedAt;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.issueId;
        int iA = C4571x.a(this.linkSessionId, (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31, 31);
        String str12 = this.mfaType;
        int iHashCode11 = (iA + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.requestId;
        int iHashCode12 = (iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.selection;
        int iA2 = C4571x.a(this.timestamp, (iHashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31, 31);
        LinkEventViewName linkEventViewName = this.viewName;
        int iHashCode13 = (iA2 + (linkEventViewName == null ? 0 : linkEventViewName.hashCode())) * 31;
        String str15 = this.metadataJson;
        int iHashCode14 = (iHashCode13 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.routingNumber;
        int iHashCode15 = (iHashCode14 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.isUpdateMode;
        int iHashCode16 = (iHashCode15 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.matchReason;
        int iHashCode17 = (iHashCode16 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.accountNumberMask;
        return iHashCode17 + (str19 != null ? str19.hashCode() : 0);
    }

    public final String isUpdateMode() {
        return this.isUpdateMode;
    }

    public final Map<String, String> toMap() {
        Pair pairA = x.a("brand_name", this.brandName);
        Pair pairA2 = x.a("error_code", this.errorCode);
        Pair pairA3 = x.a("error_message", this.errorMessage);
        Pair pairA4 = x.a("error_type", this.errorType);
        Pair pairA5 = x.a("exit_status", this.exitStatus);
        Pair pairA6 = x.a("institution_id", this.institutionId);
        Pair pairA7 = x.a("institution_name", this.institutionName);
        Pair pairA8 = x.a("institution_search_query", this.institutionSearchQuery);
        Pair pairA9 = x.a("issue_description", this.issueDescription);
        Pair pairA10 = x.a("issue_detected_at", this.issueDetectedAt);
        Pair pairA11 = x.a("issue_id", this.issueId);
        Pair pairA12 = x.a("link_session_id", this.linkSessionId);
        Pair pairA13 = x.a("mfa_type", this.mfaType);
        Pair pairA14 = x.a("request_id", this.requestId);
        Pair pairA15 = x.a("routing_number", this.routingNumber);
        Pair pairA16 = x.a("selection", this.selection);
        Pair pairA17 = x.a("isUpdateMode", this.isUpdateMode);
        Pair pairA18 = x.a("matchReason", this.matchReason);
        Pair pairA19 = x.a("accountNumberMask", this.accountNumberMask);
        Pair pairA20 = x.a("timestamp", this.timestamp);
        LinkEventViewName linkEventViewName = this.viewName;
        Map mapM = v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, pairA18, pairA19, pairA20, x.a("view_name", linkEventViewName != null ? linkEventViewName.getJsonValue() : null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM.entrySet()) {
            CharSequence charSequence = (CharSequence) entry.getValue();
            if (charSequence != null && charSequence.length() != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        return "LinkEventMetadata(brandName=" + this.brandName + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", errorType=" + this.errorType + ", exitStatus=" + this.exitStatus + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", institutionSearchQuery=" + this.institutionSearchQuery + ", issueDescription=" + this.issueDescription + ", issueDetectedAt=" + this.issueDetectedAt + ", issueId=" + this.issueId + ", linkSessionId=" + this.linkSessionId + ", mfaType=" + this.mfaType + ", requestId=" + this.requestId + ", selection=" + this.selection + ", timestamp=" + this.timestamp + ", viewName=" + this.viewName + ", metadataJson=" + this.metadataJson + ", routingNumber=" + this.routingNumber + ", isUpdateMode=" + this.isUpdateMode + ", matchReason=" + this.matchReason + ", accountNumberMask=" + this.accountNumberMask + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.brandName);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.errorType);
        parcel.writeString(this.exitStatus);
        parcel.writeString(this.institutionId);
        parcel.writeString(this.institutionName);
        parcel.writeString(this.institutionSearchQuery);
        parcel.writeString(this.issueDescription);
        parcel.writeString(this.issueDetectedAt);
        parcel.writeString(this.issueId);
        parcel.writeString(this.linkSessionId);
        parcel.writeString(this.mfaType);
        parcel.writeString(this.requestId);
        parcel.writeString(this.selection);
        parcel.writeString(this.timestamp);
        parcel.writeParcelable(this.viewName, flags);
        parcel.writeString(this.metadataJson);
        parcel.writeString(this.routingNumber);
        parcel.writeString(this.isUpdateMode);
        parcel.writeString(this.matchReason);
        parcel.writeString(this.accountNumberMask);
    }

    public /* synthetic */ LinkEventMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, LinkEventViewName linkEventViewName, String str17, String str18, String str19, String str20, String str21, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, str12, (i11 & 4096) != 0 ? null : str13, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str14, (i11 & 16384) != 0 ? null : str15, str16, (65536 & i11) != 0 ? null : linkEventViewName, (131072 & i11) != 0 ? null : str17, (262144 & i11) != 0 ? null : str18, (524288 & i11) != 0 ? null : str19, (1048576 & i11) != 0 ? null : str20, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : str21);
    }
}
