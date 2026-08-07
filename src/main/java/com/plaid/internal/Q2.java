package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$callWorkflowStart$networkResponse$1", f = "LinkStateReducer.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
public final class Q2 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super AbstractC4442i4<? extends Workflow$LinkWorkflowStartResponse, ? extends Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2 f46631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Workflow$LinkWorkflowStartRequest f46632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(Y2 y11, Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, Continuation<? super Q2> continuation) {
        super(2, continuation);
        this.f46631b = y11;
        this.f46632c = workflow$LinkWorkflowStartRequest;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new Q2(this.f46631b, this.f46632c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC4442i4<? extends Workflow$LinkWorkflowStartResponse, ? extends Object>> continuation) {
        return new Q2(this.f46631b, this.f46632c, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46630a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return obj;
        }
        jn0.t.b(obj);
        d8 d8Var = this.f46631b.f46821a;
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest = this.f46632c;
        this.f46630a = 1;
        Object objA = d8Var.a(workflow$LinkWorkflowStartRequest, this);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
