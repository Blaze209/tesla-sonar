package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse;

/* JADX INFO: renamed from: com.plaid.internal.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4489n6 implements InterfaceC4418f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4357b7 f47937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47938b;

    public C4489n6(InterfaceC4357b7 snaApi) {
        p013kotlin.jvm.internal.s.k(snaApi, "snaApi");
        this.f47937a = snaApi;
    }

    @Override // com.plaid.internal.InterfaceC4418f7
    public final C4428h a(InterfaceC4412f1 finishInput, C4500p context) {
        p013kotlin.jvm.internal.s.k(finishInput, "finishInput");
        p013kotlin.jvm.internal.s.k(context, "context");
        String str = this.f47938b;
        if (str == null) {
            C4428h c4428hA = C4428h.a(new Exception("FAILURE: sessionVerificationId is null"));
            p013kotlin.jvm.internal.s.j(c4428hA, "completedExceptionally(...)");
            return c4428hA;
        }
        InterfaceC4357b7 interfaceC4357b7 = this.f47937a;
        String strA = finishInput.a();
        p013kotlin.jvm.internal.s.j(strA, "getVfp(...)");
        try {
            retrofit2.y<SilentNetworkAuth$LinkSNAProveFinishResponse> yVarExecute = interfaceC4357b7.a(str, strA).execute();
            if (yVarExecute.g()) {
                C4428h c4428hA2 = C4428h.a(String.valueOf(yVarExecute.a()));
                p013kotlin.jvm.internal.s.j(c4428hA2, "completed(...)");
                return c4428hA2;
            }
            T6.a.a("Prove Finish Step failure - response: " + yVarExecute);
            C4428h c4428hA3 = C4428h.a(new Exception("FAILURE: " + yVarExecute));
            p013kotlin.jvm.internal.s.j(c4428hA3, "completedExceptionally(...)");
            return c4428hA3;
        } catch (Exception e11) {
            T6.a.a("Prove Finish Step failure - exception: " + e11);
            C4428h c4428hA4 = C4428h.a(new Exception("FAILURE: " + e11));
            p013kotlin.jvm.internal.s.j(c4428hA4, "completedExceptionally(...)");
            return c4428hA4;
        }
    }
}
