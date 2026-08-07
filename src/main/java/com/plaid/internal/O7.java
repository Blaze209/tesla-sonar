package com.plaid.internal;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class O7 extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P7 f46563a;

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$linkResultCallback$1$onRequestSilentNetworkAuth$1", f = "WebviewViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC4366c7 f46565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ P7 f46566c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4366c7 abstractC4366c7, P7 p11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f46565b = abstractC4366c7;
            this.f46566c = p11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f46565b, this.f46566c, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return new a(this.f46565b, this.f46566c, continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f46564a;
            if (i11 == 0) {
                jn0.t.b(obj);
                AbstractC4366c7 abstractC4366c7 = this.f46565b;
                C4499o7 c4499o7 = null;
                C4480m6 c4480m6 = null;
                if (abstractC4366c7 instanceof C4498o6) {
                    C4480m6 c4480m7 = this.f46566c.f46606o;
                    if (c4480m7 != null) {
                        c4480m6 = c4480m7;
                    } else {
                        p013kotlin.jvm.internal.s.B("proveAuthController");
                    }
                    c4480m6.a((C4498o6) this.f46565b);
                } else if (abstractC4366c7 instanceof C4508p7) {
                    C4499o7 c4499o8 = this.f46566c.f46602k;
                    if (c4499o8 != null) {
                        c4499o7 = c4499o8;
                    } else {
                        p013kotlin.jvm.internal.s.B("twilioAuthController");
                    }
                    C4508p7 c4508p7 = (C4508p7) this.f46565b;
                    this.f46564a = 1;
                    if (c4499o7.a(c4508p7, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public O7(P7 p11) {
        this.f46563a = p11;
    }

    @Override // com.plaid.internal.G
    public final void a(AbstractC4366c7 requestInfo) {
        p013kotlin.jvm.internal.s.k(requestInfo, "requestInfo");
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this.f46563a), Dispatchers.getIO(), null, new a(requestInfo, this.f46563a, null), 2, null);
    }
}
