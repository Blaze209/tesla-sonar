package com.plaid.internal;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$2", f = "WebviewViewModel.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
public final class M7 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P7 f46464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7(P7 p11, Continuation<? super M7> continuation) {
        super(2, continuation);
        this.f46464b = p11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new M7(this.f46464b, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new M7(this.f46464b, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46463a;
        if (i11 == 0) {
            jn0.t.b(obj);
            InterfaceC4524r6 interfaceC4524r6 = this.f46464b.f46600i;
            if (interfaceC4524r6 == null) {
                p013kotlin.jvm.internal.s.B("readChannelInfo");
                interfaceC4524r6 = null;
            }
            this.f46463a = 1;
            obj = interfaceC4524r6.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        A channelInfo = (A) obj;
        if (channelInfo == null) {
            X5.a.e(X5.f46812a, "No Out Of Process Polling Info Available");
            return jn0.h0.f84049a;
        }
        F f11 = this.f46464b.f46601j;
        if (f11 == null) {
            p013kotlin.jvm.internal.s.B("channelPolling");
            f11 = null;
        }
        CoroutineScope coroutineScope = androidx.p003lifecycle.d1.a(this.f46464b);
        O7 pollingCallback = this.f46464b.f46609r;
        f11.getClass();
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(channelInfo, "channelInfo");
        p013kotlin.jvm.internal.s.k(pollingCallback, "pollingCallback");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new D(f11, channelInfo, pollingCallback, null), 3, null);
        return jn0.h0.f84049a;
    }
}
