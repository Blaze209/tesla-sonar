package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry", f = "ExponentialBackoffRetry.kt", i = {0, 0, 1}, l = {22, 24}, m = "doNetworkCallWithRetries$link_sdk_release", n = {"apiCall", "networkResponse", "networkResponse"}, s = {"L$0", "L$1", "L$0"})
public final class X0<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f46798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p013kotlin.jvm.internal.n0 f46799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p013kotlin.jvm.internal.n0 f46800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f46801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z0 f46802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Z0 z11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46802e = z11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46801d = obj;
        this.f46803f |= Integer.MIN_VALUE;
        return this.f46802e.a(null, this);
    }
}
