package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1", f = "LinkStateReducer.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
public final class U2 extends SuspendLambda implements wn0.l<Continuation<? super AbstractC4442i4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2 f46732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Workflow$LinkWorkflowNextRequest f46733c;

    @DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1$1", f = "LinkStateReducer.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super AbstractC4442i4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y2 f46735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Workflow$LinkWorkflowNextRequest f46736c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y2 y11, Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f46735b = y11;
            this.f46736c = workflow$LinkWorkflowNextRequest;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f46735b, this.f46736c, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC4442i4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>> continuation) {
            return new a(this.f46735b, this.f46736c, continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f46734a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            d8 d8Var = this.f46735b.f46821a;
            Workflow$LinkWorkflowNextRequest nextRequest = this.f46736c;
            p013kotlin.jvm.internal.s.j(nextRequest, "$nextRequest");
            this.f46734a = 1;
            Object objA = d8Var.a(nextRequest, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(Y2 y11, Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, Continuation<? super U2> continuation) {
        super(1, continuation);
        this.f46732b = y11;
        this.f46733c = workflow$LinkWorkflowNextRequest;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Continuation<?> continuation) {
        return new U2(this.f46732b, this.f46733c, continuation);
    }

    @Override // wn0.l
    public final Object invoke(Continuation<? super AbstractC4442i4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>> continuation) {
        return new U2(this.f46732b, this.f46733c, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46731a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return obj;
        }
        jn0.t.b(obj);
        CoroutineDispatcher io2 = Dispatchers.getIO();
        a aVar = new a(this.f46732b, this.f46733c, null);
        this.f46731a = 1;
        Object objWithContext = BuildersKt.withContext(io2, aVar, this);
        return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
    }
}
