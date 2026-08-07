package com.plaid.internal;

import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventViewName;

/* JADX INFO: renamed from: com.plaid.internal.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4592z2 {
    public static LinkEventMetadata a(String errorCode, String errorMessage, String errorType, String exitStatus, String institutionId, String institutionName, String institutionSearchQuery, String issueId, String linkSessionId, String mfaType, String requestId, String timestamp, String viewName, String brandName, String selection, String metadataJson) {
        p013kotlin.jvm.internal.s.k(errorCode, "errorCode");
        p013kotlin.jvm.internal.s.k(errorMessage, "errorMessage");
        p013kotlin.jvm.internal.s.k(errorType, "errorType");
        p013kotlin.jvm.internal.s.k(exitStatus, "exitStatus");
        p013kotlin.jvm.internal.s.k(institutionId, "institutionId");
        p013kotlin.jvm.internal.s.k(institutionName, "institutionName");
        p013kotlin.jvm.internal.s.k(institutionSearchQuery, "institutionSearchQuery");
        p013kotlin.jvm.internal.s.k(issueId, "issueId");
        p013kotlin.jvm.internal.s.k(linkSessionId, "linkSessionId");
        p013kotlin.jvm.internal.s.k(mfaType, "mfaType");
        p013kotlin.jvm.internal.s.k(requestId, "requestId");
        p013kotlin.jvm.internal.s.k(timestamp, "timestamp");
        p013kotlin.jvm.internal.s.k(viewName, "viewName");
        p013kotlin.jvm.internal.s.k(brandName, "brandName");
        p013kotlin.jvm.internal.s.k(selection, "selection");
        p013kotlin.jvm.internal.s.k(metadataJson, "metadataJson");
        return new LinkEventMetadata(brandName, errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, null, null, issueId, linkSessionId, mfaType, requestId, selection, timestamp, LinkEventViewName.INSTANCE.fromString$link_sdk_release(viewName), metadataJson, null, null, null, null, 3932928, null);
    }
}
