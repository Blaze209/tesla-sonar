package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest;

/* JADX INFO: renamed from: com.plaid.internal.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4496o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8 f47987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4575x3 f47988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4505p4 f47989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m8 f47990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Workflow$LinkWorkflowPollRequest f47991e;

    public C4496o4(d8 workflowApi, C4575x3 analytics, C4505p4 pollingOptions, String oAuthStateId, m8 workflowPaneId) {
        p013kotlin.jvm.internal.s.k(workflowApi, "workflowApi");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(pollingOptions, "pollingOptions");
        p013kotlin.jvm.internal.s.k(oAuthStateId, "oAuthStateId");
        p013kotlin.jvm.internal.s.k(workflowPaneId, "workflowPaneId");
        this.f47987a = workflowApi;
        this.f47988b = analytics;
        this.f47989c = pollingOptions;
        this.f47990d = workflowPaneId;
        this.f47991e = Workflow$LinkWorkflowPollRequest.newBuilder().a(workflowPaneId.f47884a).a(Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.newBuilder().a(oAuthStateId).build()).build();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4 A[PHI: r2 r6
      0x00a4: PHI (r2v7 com.plaid.internal.o4) = (r2v8 com.plaid.internal.o4), (r2v10 com.plaid.internal.o4) binds: [B:23:0x00a1, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r6v1 long) = (r6v2 long), (r6v4 long) binds: [B:23:0x00a1, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d2, code lost:
    
        if (r14 == r1) goto L27;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x00a4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0119, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d2 -> B:28:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p013kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4496o4.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
