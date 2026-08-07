package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class L6 {
    public static final AbstractC4366c7 a(Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth) {
        p013kotlin.jvm.internal.s.k(requestSilentNetworkAuth, "<this>");
        String verificationId = requestSilentNetworkAuth.getVerificationId();
        if (verificationId != null && verificationId.length() != 0) {
            if (requestSilentNetworkAuth.hasTwilio()) {
                String redirectUri = requestSilentNetworkAuth.getTwilio().getRedirectUri();
                if (redirectUri == null || redirectUri.length() == 0) {
                    return null;
                }
                String verificationId2 = requestSilentNetworkAuth.getVerificationId();
                p013kotlin.jvm.internal.s.j(verificationId2, "getVerificationId(...)");
                String redirectUri2 = requestSilentNetworkAuth.getTwilio().getRedirectUri();
                p013kotlin.jvm.internal.s.j(redirectUri2, "getRedirectUri(...)");
                return new C4508p7(verificationId2, redirectUri2);
            }
            if (requestSilentNetworkAuth.hasProve()) {
                String verificationId3 = requestSilentNetworkAuth.getVerificationId();
                p013kotlin.jvm.internal.s.j(verificationId3, "getVerificationId(...)");
                return new C4498o6(verificationId3);
            }
        }
        return null;
    }
}
