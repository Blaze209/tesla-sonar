package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.di.WebviewFallbackUriStore", f = "WebviewFallbackUriStore.kt", i = {0, 1}, l = {20, 24}, m = "readWebviewFallbackUri", n = {"this", "uri"}, s = {"L$0", "L$0"})
public final class I7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f46361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J7 f46363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7(J7 j11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46363c = j11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46362b = obj;
        this.f46364d |= Integer.MIN_VALUE;
        return this.f46363c.a(this);
    }
}
