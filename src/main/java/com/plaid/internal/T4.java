package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore", f = "PlaidClientSideOnlyConfigurationStore.kt", i = {0}, l = {22}, m = "read", n = {"this"}, s = {"L$0"})
public final class T4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W4 f46714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W4 f46716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(W4 w11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46716c = w11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46715b = obj;
        this.f46717d |= Integer.MIN_VALUE;
        return this.f46716c.a(this);
    }
}
