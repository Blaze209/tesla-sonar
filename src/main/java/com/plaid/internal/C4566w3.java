package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1", f = "LinkWorkflowAnalytics.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
public final class C4566w3 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4575x3 f48196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ClientEventOuterClass$ClientEvent.a f48197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f48198d;

    /* JADX INFO: renamed from: com.plaid.internal.w3$a */
    @DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1$1", f = "LinkWorkflowAnalytics.kt", i = {}, l = {169, 170}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4575x3 f48200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ClientEventOuterClass$ClientEvent.a f48201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48202d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4575x3 c4575x3, ClientEventOuterClass$ClientEvent.a aVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f48200b = c4575x3;
            this.f48201c = aVar;
            this.f48202d = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f48200b, this.f48201c, this.f48202d, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (com.plaid.internal.C4575x3.a(r6, r5) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f48199a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)
                goto L41
            L1e:
                jn0.t.b(r6)
                com.plaid.internal.x3 r6 = r5.f48200b
                com.plaid.internal.A3 r6 = r6.f48215b
                com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$a r1 = r5.f48201c
                java.lang.String r4 = r5.f48202d
                com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent$a r1 = r1.a(r4)
                com.google.protobuf.GeneratedMessageLite r1 = r1.build()
                java.lang.String r4 = "build(...)"
                p013kotlin.jvm.internal.s.j(r1, r4)
                com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent r1 = (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent) r1
                r5.f48199a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L41
                goto L4b
            L41:
                com.plaid.internal.x3 r6 = r5.f48200b
                r5.f48199a = r2
                java.lang.Object r6 = com.plaid.internal.C4575x3.a(r6, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                com.plaid.internal.X5$a r6 = com.plaid.internal.X5.f46812a
                r6.getClass()
                java.lang.String r6 = "events send"
                com.plaid.internal.X5.a.a(r6, r3)
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4566w3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4566w3(C4575x3 c4575x3, ClientEventOuterClass$ClientEvent.a aVar, String str, Continuation<? super C4566w3> continuation) {
        super(2, continuation);
        this.f48196b = c4575x3;
        this.f48197c = aVar;
        this.f48198d = str;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4566w3(this.f48196b, this.f48197c, this.f48198d, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return ((C4566w3) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f48195a;
        if (i11 == 0) {
            jn0.t.b(obj);
            C4575x3 c4575x3 = this.f48196b;
            CoroutineDispatcher coroutineDispatcher = c4575x3.f48216c;
            a aVar = new a(c4575x3, this.f48197c, this.f48198d, null);
            this.f48195a = 1;
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
