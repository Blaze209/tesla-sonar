package com.plaid.link;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.plaid.link.Plaid", f = "Plaid.kt", i = {0}, l = {128}, m = "awaitPreload$link_sdk_release", n = {"this"}, s = {"L$0"})
public final class Plaid$awaitPreload$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Plaid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$awaitPreload$1(Plaid plaid, Continuation<? super Plaid$awaitPreload$1> continuation) {
        super(continuation);
        this.this$0 = plaid;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitPreload$link_sdk_release(this);
    }
}
