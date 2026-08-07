package com.plaid.internal;

import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.views.EmbeddedUrlService", f = "EmbeddedUrlService.kt", i = {}, l = {35}, m = "fetchEmbeddedUrlFromWorkflowStart-gIAlu-s$link_sdk_release", n = {}, s = {})
public final class O0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P0 f46545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(P0 p11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46545b = p11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46544a = obj;
        this.f46546c |= Integer.MIN_VALUE;
        Object objA = this.f46545b.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
    }
}
