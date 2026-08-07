package com.plaid.link;

import com.plaid.internal.C4501p0;
import com.plaid.internal.C4557v3;
import com.plaid.internal.C4575x3;
import com.plaid.internal.C4582y1;
import com.plaid.internal.EnumC4419g;
import com.plaid.internal.N2;
import com.plaid.internal.X4;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plaid.link.Plaid$trackSdkOpen$1", f = "Plaid.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m = "invokeSuspend", n = {}, s = {})
public final class Plaid$trackSdkOpen$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ C4575x3 $workflowAnalytics;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$trackSdkOpen$1(C4575x3 c4575x3, Continuation<? super Plaid$trackSdkOpen$1> continuation) {
        super(2, continuation);
        this.$workflowAnalytics = c4575x3;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new Plaid$trackSdkOpen$1(this.$workflowAnalytics, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            t.b(obj);
            X4 x11 = Plaid.component;
            if (x11 == null) {
                s.B("component");
                x11 = null;
            }
            C4582y1 c4582y1 = ((C4501p0) x11).f48013f.get();
            this.label = 1;
            obj = c4582y1.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        N2 n11 = (N2) obj;
        if (n11 instanceof N2.k) {
            C4575x3 c4575x3 = this.$workflowAnalytics;
            N2.k kVar = (N2.k) n11;
            String linkOpenId = kVar.f46512b;
            String webviewFallbackId = kVar.f46517g;
            c4575x3.getClass();
            s.k(linkOpenId, "linkOpenId");
            s.k(webviewFallbackId, "webviewFallbackId");
            ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild = C4575x3.a().a(ClientEventOuterClass$ClientEvent.LinkSdkOpen.newBuilder().a(linkOpenId)).build();
            s.h(clientEventOuterClass$ClientEventBuild);
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4557v3(c4575x3, webviewFallbackId, clientEventOuterClass$ClientEventBuild, null), 3, null);
        } else {
            C4575x3 c4575x4 = this.$workflowAnalytics;
            String linkOpenId2 = n11.g();
            c4575x4.getClass();
            s.k(linkOpenId2, "linkOpenId");
            s.k("", "webviewFallbackId");
            ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild2 = C4575x3.a().a(ClientEventOuterClass$ClientEvent.LinkSdkOpen.newBuilder().a(linkOpenId2)).build();
            s.h(clientEventOuterClass$ClientEventBuild2);
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C4557v3(c4575x4, "", clientEventOuterClass$ClientEventBuild2, null), 3, null);
        }
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((Plaid$trackSdkOpen$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
