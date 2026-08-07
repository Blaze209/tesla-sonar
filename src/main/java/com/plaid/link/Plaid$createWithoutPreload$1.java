package com.plaid.link;

import com.plaid.internal.EnumC4419g;
import com.plaid.internal.X5;
import com.plaid.link.configuration.LinkTokenConfiguration;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plaid.link.Plaid$createWithoutPreload$1", f = "Plaid.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m = "invokeSuspend", n = {}, s = {})
public final class Plaid$createWithoutPreload$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ LinkTokenConfiguration $linkTokenConfiguration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$createWithoutPreload$1(LinkTokenConfiguration linkTokenConfiguration, Continuation<? super Plaid$createWithoutPreload$1> continuation) {
        super(2, continuation);
        this.$linkTokenConfiguration = linkTokenConfiguration;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new Plaid$createWithoutPreload$1(this.$linkTokenConfiguration, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            t.b(obj);
            Plaid plaid = Plaid.INSTANCE;
            LinkTokenConfiguration linkTokenConfiguration = this.$linkTokenConfiguration;
            this.label = 1;
            if (plaid.setLinkConfiguration(linkTokenConfiguration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        X5.f46812a.getClass();
        X5.a.a("Link token configuration stored to disk", true);
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((Plaid$createWithoutPreload$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
