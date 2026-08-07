package com.plaid.internal;

import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkResult;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4585y4 extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4594z4 f48236b;

    /* JADX INFO: renamed from: com.plaid.internal.y4$a */
    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$linkResultCallback$1$onNoResultFromChannel$1", f = "OutOfProcessWebviewViewModel.kt", i = {1}, l = {93, 95}, m = "invokeSuspend", n = {"it"}, s = {"L$1"})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C4594z4 f48237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LinkResult f48238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C4594z4 f48240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C4585y4 f48241e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4594z4 c4594z4, C4585y4 c4585y4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f48240d = c4594z4;
            this.f48241e = c4585y4;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f48240d, this.f48241e, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return new a(this.f48240d, this.f48241e, continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C4594z4 c4594z4;
            LinkResult linkResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48239c;
            if (i11 == 0) {
                jn0.t.b(obj);
                C4594z4 c4594z5 = this.f48240d;
                this.f48239c = 1;
                obj = C4594z4.b(c4594z5, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                jn0.t.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                linkResult = this.f48238b;
                c4594z4 = this.f48237a;
                jn0.t.b(obj);
            }
            C4594z4.a(c4594z4, linkResult);
            return jn0.h0.f84049a;
            LinkResult linkResult2 = (LinkResult) obj;
            if (linkResult2 == null) {
                X5.a.a(X5.f46812a, "Link Exit -- no LinkResult from polling and no preCompletionResult.");
                C4594z4.a(this.f48240d, new LinkExit(null, new LinkExitMetadata(null, null, this.f48241e.b(), null, null, 27, null)));
                return jn0.h0.f84049a;
            }
            c4594z4 = this.f48240d;
            X5.a.a(X5.f46812a, "The preCompletionResult is: " + linkResult2);
            D7 d7B = c4594z4.b();
            this.f48237a = c4594z4;
            this.f48238b = linkResult2;
            this.f48239c = 2;
            if (d7B.b(this) != coroutine_suspended) {
                linkResult = linkResult2;
                C4594z4.a(c4594z4, linkResult);
                return jn0.h0.f84049a;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.y4$b */
    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$linkResultCallback$1$onPreCompletionResult$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4594z4 f48243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Channel$Message.SDKResult f48244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4594z4 c4594z4, Channel$Message.SDKResult sDKResult, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f48243b = c4594z4;
            this.f48244c = sDKResult;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f48243b, this.f48244c, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return new b(this.f48243b, this.f48244c, continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48242a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C4594z4 c4594z4 = this.f48243b;
                Channel$Message.SDKResult sDKResult = this.f48244c;
                this.f48242a = 1;
                u8 u8Var = c4594z4.f48270f;
                if (u8Var == null) {
                    p013kotlin.jvm.internal.s.B("writePreCompletionResult");
                    u8Var = null;
                }
                Object objA = u8Var.a(sDKResult, this);
                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objA = jn0.h0.f84049a;
                }
                if (objA == coroutine_suspended) {
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

    public C4585y4(C4594z4 c4594z4) {
        this.f48236b = c4594z4;
    }

    @Override // com.plaid.internal.G
    public final void a(Channel$Message.SDKResult result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        X5.a.a(X5.f46812a, "Pre Completion Result: " + result);
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this.f48236b), null, null, new b(this.f48236b, result, null), 3, null);
    }

    public final String b() {
        return this.f48235a;
    }

    @Override // com.plaid.internal.G
    public final void a(LinkResult result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        X5.a.a(X5.f46812a, "Link Result from polling: " + result);
        C4594z4.a(this.f48236b, result);
    }

    @Override // com.plaid.internal.G
    public final void a(LinkEvent event, I2.d options) {
        p013kotlin.jvm.internal.s.k(event, "event");
        p013kotlin.jvm.internal.s.k(options, "options");
        X5.a.a(X5.f46812a, "Link Event from polling: " + event);
        if (this.f48235a == null) {
            this.f48235a = event.getMetadata().getLinkSessionId();
        }
        wn0.p<LinkEvent, I2, jn0.h0> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(event, options);
        }
    }

    @Override // com.plaid.internal.G
    public final void a() {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this.f48236b), null, null, new a(this.f48236b, this, null), 3, null);
    }
}
