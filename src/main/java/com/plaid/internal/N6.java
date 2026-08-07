package com.plaid.internal;

import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;

/* JADX INFO: loaded from: classes6.dex */
public final class N6 {
    public static final LinkEvent a(Common$SDKEvent common$SDKEvent) {
        LinkEventMetadata metadata;
        p013kotlin.jvm.internal.s.k(common$SDKEvent, "<this>");
        if (common$SDKEvent.hasMetadata()) {
            String brandName = common$SDKEvent.getMetadata().getBrandName();
            String errorCode = common$SDKEvent.getMetadata().getErrorCode();
            String errorMessage = common$SDKEvent.getMetadata().getErrorMessage();
            String errorType = common$SDKEvent.getMetadata().getErrorType();
            String exitStatus = common$SDKEvent.getMetadata().getExitStatus();
            String institutionId = common$SDKEvent.getMetadata().getInstitutionId();
            String institutionName = common$SDKEvent.getMetadata().getInstitutionName();
            String institutionSearchQuery = common$SDKEvent.getMetadata().getInstitutionSearchQuery();
            String linkSessionId = common$SDKEvent.getMetadata().getLinkSessionId();
            String mfaType = common$SDKEvent.getMetadata().getMfaType();
            String requestId = common$SDKEvent.getMetadata().getRequestId();
            String selection = common$SDKEvent.getMetadata().getSelection();
            String timestamp = common$SDKEvent.getMetadata().getTimestamp();
            String viewName = common$SDKEvent.getMetadata().getViewName();
            p013kotlin.jvm.internal.s.h(errorCode);
            p013kotlin.jvm.internal.s.h(errorMessage);
            p013kotlin.jvm.internal.s.h(errorType);
            p013kotlin.jvm.internal.s.h(exitStatus);
            p013kotlin.jvm.internal.s.h(institutionId);
            p013kotlin.jvm.internal.s.h(institutionName);
            p013kotlin.jvm.internal.s.h(institutionSearchQuery);
            p013kotlin.jvm.internal.s.h(linkSessionId);
            p013kotlin.jvm.internal.s.h(mfaType);
            p013kotlin.jvm.internal.s.h(requestId);
            p013kotlin.jvm.internal.s.h(timestamp);
            p013kotlin.jvm.internal.s.h(viewName);
            p013kotlin.jvm.internal.s.h(brandName);
            p013kotlin.jvm.internal.s.h(selection);
            metadata = C4592z2.a((32896 & 1) != 0 ? "" : errorCode, (32896 & 2) != 0 ? "" : errorMessage, (32896 & 4) != 0 ? "" : errorType, (32896 & 8) != 0 ? "" : exitStatus, (32896 & 16) != 0 ? "" : institutionId, (32896 & 32) != 0 ? "" : institutionName, (32896 & 64) != 0 ? "" : institutionSearchQuery, "", linkSessionId, (32896 & 512) != 0 ? "" : mfaType, (32896 & 1024) != 0 ? "" : requestId, timestamp, (32896 & 4096) != 0 ? "" : viewName, brandName, (32896 & 16384) != 0 ? "" : selection, "{}");
        } else {
            String brandName2 = common$SDKEvent.getMetadata().getBrandName();
            p013kotlin.jvm.internal.s.j(brandName2, "getBrandName(...)");
            metadata = C4592z2.a((32896 & 1) != 0 ? "" : null, (32896 & 2) != 0 ? "" : null, (32896 & 4) != 0 ? "" : null, (32896 & 8) != 0 ? "" : null, (32896 & 16) != 0 ? "" : null, (32896 & 32) != 0 ? "" : null, (32896 & 64) != 0 ? "" : null, "", "", (32896 & 512) != 0 ? "" : null, (32896 & 1024) != 0 ? "" : null, "", (32896 & 4096) != 0 ? "" : null, brandName2, (32896 & 16384) != 0 ? "" : null, "{}");
        }
        String eventName = common$SDKEvent.getEventName();
        p013kotlin.jvm.internal.s.j(eventName, "getEventName(...)");
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        return new LinkEvent(LinkEventName.INSTANCE.fromString$link_sdk_release(eventName), metadata);
    }

    public static final LinkEvent a(Channel$Message.SDKEvent sDKEvent) {
        p013kotlin.jvm.internal.s.k(sDKEvent, "<this>");
        String brandName = sDKEvent.getMetadata().getBrandName();
        String errorCode = sDKEvent.getMetadata().getErrorCode();
        String errorMessage = sDKEvent.getMetadata().getErrorMessage();
        String errorType = sDKEvent.getMetadata().getErrorType();
        String exitStatus = sDKEvent.getMetadata().getExitStatus();
        String institutionId = sDKEvent.getMetadata().getInstitutionId();
        String institutionName = sDKEvent.getMetadata().getInstitutionName();
        String institutionSearchQuery = sDKEvent.getMetadata().getInstitutionSearchQuery();
        String issueId = sDKEvent.getMetadata().getIssueId();
        String linkSessionId = sDKEvent.getMetadata().getLinkSessionId();
        String mfaType = sDKEvent.getMetadata().getMfaType();
        String requestId = sDKEvent.getMetadata().getRequestId();
        String selection = sDKEvent.getMetadata().getSelection();
        String timestamp = sDKEvent.getMetadata().getTimestamp();
        String viewName = sDKEvent.getMetadata().getViewName();
        String metadataJson = sDKEvent.getMetadataJson();
        if (p013kotlin.text.t.y0(metadataJson)) {
            metadataJson = "{}";
        }
        String str = metadataJson;
        p013kotlin.jvm.internal.s.h(errorCode);
        p013kotlin.jvm.internal.s.h(errorMessage);
        p013kotlin.jvm.internal.s.h(errorType);
        p013kotlin.jvm.internal.s.h(exitStatus);
        p013kotlin.jvm.internal.s.h(institutionId);
        p013kotlin.jvm.internal.s.h(institutionName);
        p013kotlin.jvm.internal.s.h(institutionSearchQuery);
        p013kotlin.jvm.internal.s.h(issueId);
        p013kotlin.jvm.internal.s.h(linkSessionId);
        p013kotlin.jvm.internal.s.h(mfaType);
        p013kotlin.jvm.internal.s.h(requestId);
        p013kotlin.jvm.internal.s.h(timestamp);
        p013kotlin.jvm.internal.s.h(viewName);
        p013kotlin.jvm.internal.s.h(brandName);
        p013kotlin.jvm.internal.s.h(selection);
        p013kotlin.jvm.internal.s.h(str);
        LinkEventMetadata metadata = C4592z2.a(errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, issueId, linkSessionId, mfaType, requestId, timestamp, viewName, brandName, selection, str);
        String eventName = sDKEvent.getEventName();
        p013kotlin.jvm.internal.s.j(eventName, "getEventName(...)");
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        return new LinkEvent(LinkEventName.INSTANCE.fromString$link_sdk_release(eventName), metadata);
    }
}
