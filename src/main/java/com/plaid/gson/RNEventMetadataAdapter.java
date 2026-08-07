package com.plaid.gson;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.r;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventViewName;
import java.lang.reflect.Type;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/gson/RNEventMetadataAdapter;", "Lcom/google/gson/r;", "Lcom/plaid/link/event/LinkEventMetadata;", "<init>", "()V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/q;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/gson/l;", "serialize", "(Lcom/plaid/link/event/LinkEventMetadata;Ljava/lang/reflect/Type;Lcom/google/gson/q;)Lcom/google/gson/l;", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNEventMetadataAdapter implements r<LinkEventMetadata> {
    @Override // com.google.gson.r
    public l serialize(LinkEventMetadata src, Type typeOfSrc, q context) {
        String jsonValue;
        if (src == null) {
            return new n();
        }
        n nVar = new n();
        nVar.l("errorType", src.getErrorType());
        nVar.l("errorCode", src.getErrorCode());
        nVar.l("errorMessage", src.getErrorMessage());
        nVar.l("exitStatus", src.getExitStatus());
        nVar.l("institutionId", src.getInstitutionId());
        nVar.l("institutionName", src.getInstitutionName());
        nVar.l("institutionSearchQuery", src.getInstitutionSearchQuery());
        nVar.l("accountNumberMask", src.getAccountNumberMask());
        nVar.l("isUpdateMode", src.isUpdateMode());
        nVar.l("matchReason", src.getMatchReason());
        nVar.l("routingNumber", src.getRoutingNumber());
        nVar.l("selection", src.getSelection());
        nVar.l("linkSessionId", src.getLinkSessionId());
        nVar.l("mfaType", src.getMfaType());
        nVar.l("requestId", src.getRequestId());
        nVar.l("issueId", src.getIssueId());
        nVar.l("timestamp", src.getTimestamp());
        LinkEventViewName viewName = src.getViewName();
        if (viewName == null || (jsonValue = viewName.getJsonValue()) == null) {
            jsonValue = "";
        }
        nVar.l("viewName", jsonValue);
        nVar.l("metadata_json", src.getMetadataJson());
        nVar.l("metadataJson", src.getMetadataJson());
        return nVar;
    }
}
