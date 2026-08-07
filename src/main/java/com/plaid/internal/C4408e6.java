package com.plaid.internal;

import com.plaid.link.SubmissionData;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$setSubmissionData$2", f = "PreloadLinkController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class C4408e6 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U5 f47639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubmissionData f47640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4408e6(U5 u11, SubmissionData submissionData, Continuation<? super C4408e6> continuation) {
        super(2, continuation);
        this.f47639a = u11;
        this.f47640b = submissionData;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4408e6(this.f47639a, this.f47640b, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new C4408e6(this.f47639a, this.f47640b, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        this.f47639a.a(this.f47640b.getPhoneNumber(), this.f47640b.getDateOfBirth());
        return jn0.h0.f84049a;
    }
}
