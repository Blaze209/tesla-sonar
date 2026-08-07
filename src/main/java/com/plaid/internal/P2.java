package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0}, l = {132, 147, 161}, m = "callWorkflowStart", n = {"this", "workflowId", "linkOpenId", "oauthNonce"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class P2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y2 f46575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f46579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y2 f46580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46581g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2(Y2 y11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46580f = y11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46579e = obj;
        this.f46581g |= Integer.MIN_VALUE;
        return this.f46580f.a((Workflow$LinkWorkflowStartRequest) null, (String) null, (String) null, (String) null, this);
    }
}
