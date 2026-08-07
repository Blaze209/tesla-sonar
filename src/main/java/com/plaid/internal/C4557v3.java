package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvent$1", f = "LinkWorkflowAnalytics.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
public final class C4557v3 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4575x3 f48167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f48168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClientEventOuterClass$ClientEvent f48169d;

    /* JADX INFO: renamed from: com.plaid.internal.v3$a */
    @DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvent$1$1", f = "LinkWorkflowAnalytics.kt", i = {0}, l = {150}, m = "invokeSuspend", n = {"request"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Workflow$LinkWorkflowEventRequest f48170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4575x3 f48172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ClientEventOuterClass$ClientEvent f48174e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4575x3 c4575x3, String str, ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f48172c = c4575x3;
            this.f48173d = str;
            this.f48174e = clientEventOuterClass$ClientEvent;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f48172c, this.f48173d, this.f48174e, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48171b;
            if (i11 == 0) {
                jn0.t.b(obj);
                Workflow$LinkWorkflowEventRequest.a aVarNewBuilder = Workflow$LinkWorkflowEventRequest.newBuilder();
                String str = this.f48173d;
                ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = this.f48174e;
                aVarNewBuilder.a(str);
                aVarNewBuilder.a(clientEventOuterClass$ClientEvent).build();
                Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequestBuild = aVarNewBuilder.build();
                d8 d8Var = this.f48172c.f48214a;
                p013kotlin.jvm.internal.s.h(workflow$LinkWorkflowEventRequestBuild);
                this.f48170a = workflow$LinkWorkflowEventRequestBuild;
                this.f48171b = 1;
                Object objA = d8Var.a(workflow$LinkWorkflowEventRequestBuild, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                workflow$LinkWorkflowEventRequest = workflow$LinkWorkflowEventRequestBuild;
                obj = objA;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workflow$LinkWorkflowEventRequest = this.f48170a;
                jn0.t.b(obj);
            }
            if (((AbstractC4442i4) obj) instanceof AbstractC4442i4.c) {
                X5.a.a(X5.f46812a, "Event sent: " + workflow$LinkWorkflowEventRequest);
            } else {
                X5.a.b(X5.f46812a, "Error sending event " + workflow$LinkWorkflowEventRequest);
            }
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4557v3(C4575x3 c4575x3, String str, ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, Continuation<? super C4557v3> continuation) {
        super(2, continuation);
        this.f48167b = c4575x3;
        this.f48168c = str;
        this.f48169d = clientEventOuterClass$ClientEvent;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4557v3(this.f48167b, this.f48168c, this.f48169d, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return ((C4557v3) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f48166a;
        if (i11 == 0) {
            jn0.t.b(obj);
            C4575x3 c4575x3 = this.f48167b;
            CoroutineDispatcher coroutineDispatcher = c4575x3.f48216c;
            a aVar = new a(c4575x3, this.f48168c, this.f48169d, null);
            this.f48166a = 1;
            if (BuildersKt.withContext(coroutineDispatcher, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        return jn0.h0.f84049a;
    }
}
