package com.plaid.internal;

import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class L2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static LinkExit b(Throwable th2, String str) {
        return new LinkExit(a(th2, str), null, 2, 0 == true ? 1 : 0);
    }

    public static String a(String str, String str2, String str3) {
        return "{\"error_code\":\"" + str + "\",\"error_message\":\"" + str2 + "\",\"display_message\":\"" + str3 + "\"}";
    }

    public static LinkError a(Throwable th2, String str) {
        if (th2 instanceof B2) {
            X5.a.a(X5.f46812a, th2);
            String str2 = "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists";
            if (str != null && str.length() != 0) {
                str2 = "Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists\n" + str;
            }
            return LinkError.INSTANCE.fromException$link_sdk_release(new LinkException(str2));
        }
        return LinkError.INSTANCE.fromException$link_sdk_release(th2);
    }

    public static LinkExitMetadata a(int i11, String str) {
        if ((i11 & 8) != 0) {
            str = null;
        }
        return new LinkExitMetadata(null, null, null, str, null);
    }

    public static LinkSuccess a(String publicToken, LinkSuccessMetadata metadata) {
        p013kotlin.jvm.internal.s.k(publicToken, "publicToken");
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        return new LinkSuccess(publicToken, metadata);
    }

    public static LinkSuccess a(LinkedHashMap linkData, List accounts) {
        p013kotlin.jvm.internal.s.k(linkData, "linkData");
        p013kotlin.jvm.internal.s.k(accounts, "accounts");
        return LinkSuccess.INSTANCE.fromMap$link_sdk_release(linkData, accounts);
    }

    public static LinkSuccessMetadata a(ArrayList accounts, String str, String str2, String linkSessionId, String metadataJson) {
        p013kotlin.jvm.internal.s.k(accounts, "accounts");
        p013kotlin.jvm.internal.s.k(linkSessionId, "linkSessionId");
        p013kotlin.jvm.internal.s.k(metadataJson, "metadataJson");
        return new LinkSuccessMetadata((str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? null : new LinkInstitution(str, str2), accounts, linkSessionId, metadataJson);
    }

    public static LinkAccount a(D1 account) {
        p013kotlin.jvm.internal.s.k(account, "account");
        return LinkAccount.INSTANCE.fromResponse$link_sdk_release(account);
    }

    public static String a(String linkSessionId, String requestId) {
        p013kotlin.jvm.internal.s.k(linkSessionId, "linkSessionId");
        p013kotlin.jvm.internal.s.k(requestId, "requestId");
        return "{\"link_session_id\":\"" + linkSessionId + "\",\"request_id\":\"" + requestId + "\"}";
    }
}
