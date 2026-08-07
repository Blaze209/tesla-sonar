package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$getPane$2", f = "WorkflowViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
public final class n8 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Pane$PaneRendering>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p8 f47943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m8 f47944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(p8 p8Var, m8 m8Var, Continuation<? super n8> continuation) {
        super(2, continuation);
        this.f47943b = p8Var;
        this.f47944c = m8Var;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new n8(this.f47943b, this.f47944c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pane$PaneRendering> continuation) {
        return new n8(this.f47943b, this.f47944c, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws F2 {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f47942a;
        if (i11 == 0) {
            jn0.t.b(obj);
            InterfaceC4542t6 interfaceC4542t6B = this.f47943b.b();
            m8 m8Var = this.f47944c;
            this.f47942a = 1;
            obj = interfaceC4542t6B.a(m8Var, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) obj;
        if (pane$PaneRendering != null) {
            return pane$PaneRendering;
        }
        m8 m8Var2 = this.f47944c;
        throw new F2("No pane rendering found for " + m8Var2 + ".first: " + m8Var2 + ".second");
    }
}
