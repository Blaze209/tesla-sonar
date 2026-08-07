package com.plaid.internal;

import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class O6 {
    public static final LinkResult a(Channel$Message.SDKResult sDKResult) {
        p013kotlin.jvm.internal.s.k(sDKResult, "<this>");
        LinkInstitution linkInstitution = null;
        if (sDKResult.getCallback() != SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_SUCCESS) {
            if (sDKResult.getCallback() != SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_ERROR) {
                return null;
            }
            String linkSessionId = sDKResult.getMetadata().getLinkSessionId();
            String institutionId = sDKResult.getMetadata().getInstitution().getInstitutionId();
            String name = sDKResult.getMetadata().getInstitution().getName();
            String requestId = sDKResult.getMetadata().getRequestId();
            LinkExitMetadataStatus linkExitMetadataStatusFromString = LinkExitMetadataStatus.INSTANCE.fromString(sDKResult.getMetadata().getStatus());
            String metadataJson = sDKResult.getMetadataJson();
            if (name != null && name.length() != 0 && institutionId != null && institutionId.length() != 0) {
                linkInstitution = new LinkInstitution(name, institutionId);
            }
            LinkExitMetadata linkExitMetadata = new LinkExitMetadata(linkExitMetadataStatusFromString, linkInstitution, linkSessionId, requestId, metadataJson);
            String errorCode = sDKResult.getError().getErrorCode();
            p013kotlin.jvm.internal.s.j(errorCode, "getErrorCode(...)");
            String errorMessage = sDKResult.getError().getErrorMessage();
            p013kotlin.jvm.internal.s.j(errorMessage, "getErrorMessage(...)");
            String displayMessage = sDKResult.getError().getDisplayMessage();
            p013kotlin.jvm.internal.s.j(displayMessage, "getDisplayMessage(...)");
            String errorJson = sDKResult.getErrorJson();
            p013kotlin.jvm.internal.s.j(errorJson, "getErrorJson(...)");
            p013kotlin.jvm.internal.s.k(errorCode, "errorCode");
            p013kotlin.jvm.internal.s.k(errorMessage, "errorMessage");
            p013kotlin.jvm.internal.s.k(displayMessage, "displayMessage");
            p013kotlin.jvm.internal.s.k(errorJson, "errorJson");
            return new LinkExit(new LinkError(LinkErrorCode.INSTANCE.convert(errorCode), errorMessage, displayMessage, errorJson), linkExitMetadata);
        }
        ArrayList accounts = new ArrayList();
        List<SdkResult$SDKResult.Metadata.Account> accountsList = sDKResult.getMetadata().getAccountsList();
        p013kotlin.jvm.internal.s.j(accountsList, "getAccountsList(...)");
        for (SdkResult$SDKResult.Metadata.Account account : accountsList) {
            p013kotlin.jvm.internal.s.h(account);
            p013kotlin.jvm.internal.s.k(account, "<this>");
            String id2 = account.getId();
            p013kotlin.jvm.internal.s.j(id2, "getId(...)");
            accounts.add(new LinkAccount(id2, account.getName(), account.getMask(), LinkAccountSubtype.INSTANCE.convert(account.getSubtype(), account.getType()), LinkAccountVerificationStatus.INSTANCE.convert(account.getVerificationStatus()), null, 32, null));
        }
        String institutionId2 = sDKResult.getMetadata().getInstitution().getInstitutionId();
        String name2 = sDKResult.getMetadata().getInstitution().getName();
        String linkSessionId2 = sDKResult.getMetadata().getLinkSessionId();
        p013kotlin.jvm.internal.s.j(linkSessionId2, "getLinkSessionId(...)");
        String metadataJson2 = sDKResult.getMetadataJson();
        p013kotlin.jvm.internal.s.j(metadataJson2, "getMetadataJson(...)");
        p013kotlin.jvm.internal.s.k(accounts, "accounts");
        p013kotlin.jvm.internal.s.k(linkSessionId2, "linkSessionId");
        p013kotlin.jvm.internal.s.k(metadataJson2, "metadataJson");
        if (institutionId2 != null && institutionId2.length() != 0 && name2 != null && name2.length() != 0) {
            linkInstitution = new LinkInstitution(institutionId2, name2);
        }
        LinkSuccessMetadata metadata = new LinkSuccessMetadata(linkInstitution, accounts, linkSessionId2, metadataJson2);
        String publicToken = sDKResult.getPublicToken();
        p013kotlin.jvm.internal.s.j(publicToken, "getPublicToken(...)");
        p013kotlin.jvm.internal.s.k(publicToken, "publicToken");
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        return new LinkSuccess(publicToken, metadata);
    }
}
