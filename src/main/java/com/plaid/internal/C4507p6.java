package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse;

/* JADX INFO: renamed from: com.plaid.internal.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4507p6 implements InterfaceC4418f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4357b7 f48039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48040b;

    public C4507p6(InterfaceC4357b7 snaApi) {
        p013kotlin.jvm.internal.s.k(snaApi, "snaApi");
        this.f48039a = snaApi;
    }

    @Override // com.plaid.internal.InterfaceC4418f7
    public final C4428h a(InterfaceC4409e7 params, C4500p context) {
        p013kotlin.jvm.internal.s.k(params, "params");
        p013kotlin.jvm.internal.s.k(context, "context");
        String str = this.f48040b;
        if (str == null) {
            C4428h c4428hA = C4428h.a(new Exception("FAILURE: sessionVerificationId is null"));
            p013kotlin.jvm.internal.s.j(c4428hA, "completedExceptionally(...)");
            return c4428hA;
        }
        SilentNetworkAuth$LinkSNAProveStartRequest silentNetworkAuth$LinkSNAProveStartRequestBuild = SilentNetworkAuth$LinkSNAProveStartRequest.newBuilder().a(params.a().a()).b(str).build();
        InterfaceC4357b7 interfaceC4357b7 = this.f48039a;
        p013kotlin.jvm.internal.s.h(silentNetworkAuth$LinkSNAProveStartRequestBuild);
        try {
            retrofit2.y<SilentNetworkAuth$LinkSNAProveStartResponse> yVarExecute = interfaceC4357b7.a(silentNetworkAuth$LinkSNAProveStartRequestBuild).execute();
            if (yVarExecute.g()) {
                SilentNetworkAuth$LinkSNAProveStartResponse silentNetworkAuth$LinkSNAProveStartResponseA = yVarExecute.a();
                String redirectTargetUrl = silentNetworkAuth$LinkSNAProveStartResponseA != null ? silentNetworkAuth$LinkSNAProveStartResponseA.getRedirectTargetUrl() : null;
                if (redirectTargetUrl != null) {
                    X5.a.a(X5.f46812a, "Prove Start Step success - redirectTargetUrl: " + redirectTargetUrl);
                    C4428h c4428hA2 = C4428h.a(redirectTargetUrl);
                    p013kotlin.jvm.internal.s.j(c4428hA2, "completed(...)");
                    return c4428hA2;
                }
            }
            T6.a.a("Prove Start Step failure - response: " + yVarExecute);
            C4428h c4428hA3 = C4428h.a(new Exception("FAILURE: " + yVarExecute));
            p013kotlin.jvm.internal.s.j(c4428hA3, "completedExceptionally(...)");
            return c4428hA3;
        } catch (Exception e11) {
            T6.a.a("Prove Start Step failure - exception: " + e11);
            C4428h c4428hA4 = C4428h.a(new Exception("FAILURE: " + e11));
            p013kotlin.jvm.internal.s.j(c4428hA4, "completedExceptionally(...)");
            return c4428hA4;
        }
    }
}
