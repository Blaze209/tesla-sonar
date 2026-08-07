package com.fourthline.adapters.workflow;

import com.fourthline.scanners.config.orca.common.JsonError;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.fourthline.adapters.workflow.WorkflowBridge$launch$2$1", f = "WorkflowBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class WorkflowBridge$launch$2$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ l<String, h0> $onFailure;
    final /* synthetic */ l<String, h0> $onSuccess;
    final /* synthetic */ s<h0> $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WorkflowBridge$launch$2$1(l<? super String, h0> lVar, s<h0> sVar, l<? super String, h0> lVar2, Continuation<? super WorkflowBridge$launch$2$1> continuation) {
        super(2, continuation);
        this.$onSuccess = lVar;
        this.$result = sVar;
        this.$onFailure = lVar2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new WorkflowBridge$launch$2$1(this.$onSuccess, this.$result, this.$onFailure, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        try {
            this.$onSuccess.invoke(new WorkflowOutputProcessorImpl().handle(this.$result.getValue()));
        } catch (JsonError e11) {
            l<String, h0> lVar = this.$onFailure;
            String string = e11.toFailJson().toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            lVar.invoke(string);
        }
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((WorkflowBridge$launch$2$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
