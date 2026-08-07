package com.plaid.link;

import com.plaid.internal.C4408e6;
import com.plaid.internal.C4417f6;
import com.plaid.internal.C4492o0;
import com.plaid.internal.InterfaceC4344a3;
import com.plaid.internal.N5;
import com.plaid.internal.U5;
import com.plaid.internal.X5;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plaid.link.Plaid$submitInternal$1", f = "Plaid.kt", i = {0}, l = {102}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class Plaid$submitInternal$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ SubmissionData $submissionData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$submitInternal$1(SubmissionData submissionData, Continuation<? super Plaid$submitInternal$1> continuation) {
        super(2, continuation);
        this.$submissionData = submissionData;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        Plaid$submitInternal$1 plaid$submitInternal$1 = new Plaid$submitInternal$1(this.$submissionData, continuation);
        plaid$submitInternal$1.L$0 = obj;
        return plaid$submitInternal$1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        C4417f6 c4417f6;
        Object objWithContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            InterfaceC4344a3 interfaceC4344a3 = Plaid.tokenComponent;
            h0Var = null;
            if (interfaceC4344a3 != null && (c4417f6 = ((C4492o0) interfaceC4344a3).f47970q.get()) != null) {
                SubmissionData submissionData = this.$submissionData;
                this.L$0 = coroutineScope;
                this.label = 1;
                N5 n11 = c4417f6.f47664c;
                U5 u11 = n11.f46540b;
                if (u11 == null) {
                    u11 = null;
                } else if (u11.f46746e.get()) {
                    n11.f46540b = null;
                    u11 = null;
                }
                if (u11 == null) {
                    c4417f6.f47668g = submissionData;
                    objWithContext = h0.f84049a;
                } else {
                    objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C4408e6(u11, submissionData, null), this);
                    if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objWithContext = h0.f84049a;
                    }
                }
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (h0Var == null) {
                X5.a.b(X5.f46812a, "Token component is null, submit is has no effect");
            }
            return h0.f84049a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        h0Var = h0.f84049a;
        if (h0Var == null) {
            X5.a.b(X5.f46812a, "Token component is null, submit is has no effect");
        }
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((Plaid$submitInternal$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
