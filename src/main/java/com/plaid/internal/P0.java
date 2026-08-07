package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8 f46571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d8 f46572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wo0.b f46573c;

    public P0(InterfaceC4344a3 tokenComponent) {
        p013kotlin.jvm.internal.s.k(tokenComponent, "tokenComponent");
        C4492o0 c4492o0 = (C4492o0) tokenComponent;
        C4501p0 c4501p0 = c4492o0.f47954a;
        C4492o0 c4492o1 = c4492o0.f47955b;
        new C4483n0(c4501p0, c4492o1, new I1());
        this.f46571a = c4492o1.f47962i.get();
        E5 retrofitFactory = c4492o1.f47954a.f48019l.get();
        C4479m5 plaidEnvironmentStore = c4492o1.f47954a.f48020m.get();
        p013kotlin.jvm.internal.s.k(retrofitFactory, "retrofitFactory");
        p013kotlin.jvm.internal.s.k(plaidEnvironmentStore, "plaidEnvironmentStore");
        EnumC4452j5 env = plaidEnvironmentStore.b();
        p013kotlin.jvm.internal.s.k(env, "env");
        int i11 = C4461k5.f47800a[env.ordinal()];
        String str = "https://production.plaid.com/";
        if (i11 != 1) {
            if (i11 == 2) {
                str = "https://development.plaid.com/";
            } else if (i11 == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object objB = retrofitFactory.a(str, new G5(null, 3)).b(d8.class);
        p013kotlin.jvm.internal.s.j(objB, "create(...)");
        this.f46572b = (d8) qj0.h.d((d8) objB);
        this.f46573c = c4501p0.f48012e.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        O0 o11;
        if (continuationImpl instanceof O0) {
            o11 = (O0) continuationImpl;
            int i11 = o11.f46546c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o11.f46546c = i11 - Integer.MIN_VALUE;
            } else {
                o11 = new O0(this, continuationImpl);
            }
        } else {
            o11 = new O0(this, continuationImpl);
        }
        Object objA = o11.f46544a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = o11.f46546c;
        if (i12 == 0) {
            jn0.t.b(objA);
            i8 i8Var = this.f46571a;
            d8 d8Var = null;
            if (i8Var == null) {
                p013kotlin.jvm.internal.s.B("workflowApiRequestFactory");
                i8Var = null;
            }
            Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestA = i8Var.a(str);
            X5.a.a(X5.f46812a, "embedded view workflow start request is : " + workflow$LinkWorkflowStartRequestA);
            d8 d8Var2 = this.f46572b;
            if (d8Var2 != null) {
                d8Var = d8Var2;
            } else {
                p013kotlin.jvm.internal.s.B("workflowApi");
            }
            o11.f46546c = 1;
            objA = d8Var.a(workflow$LinkWorkflowStartRequestA, o11);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objA);
        }
        AbstractC4442i4 abstractC4442i4 = (AbstractC4442i4) objA;
        if (abstractC4442i4.a()) {
            X5.a.b(X5.f46812a, "embedded search workflow start request error: " + abstractC4442i4);
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(new Exception("embedded search workflow start request error: " + abstractC4442i4)));
        }
        p013kotlin.jvm.internal.s.i(abstractC4442i4, "null cannot be cast to non-null type com.plaid.internal.core.networking.models.NetworkResponse.Success<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse>");
        Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = (Workflow$LinkWorkflowStartResponse) ((AbstractC4442i4.c) abstractC4442i4).b();
        String url = workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
        p013kotlin.jvm.internal.s.j(url, "getUrl(...)");
        if (url.length() != 0) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl());
        }
        X5.a.b(X5.f46812a, "missing webview fallback url: " + workflow$LinkWorkflowStartResponse);
        jn0.s.Companion companion3 = jn0.s.INSTANCE;
        return jn0.s.b(jn0.t.a(new Exception("missing webview fallback url: " + workflow$LinkWorkflowStartResponse)));
    }
}
