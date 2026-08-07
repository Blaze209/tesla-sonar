package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController", f = "PreloadLinkController.kt", i = {0, 1}, l = {44, 48, 52}, m = "preloadWorkflow", n = {"this", "this"}, s = {"L$0", "L$0"})
public final class C4399d6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4417f6 f47618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f47619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4417f6 f47620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4399d6(C4417f6 c4417f6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47620c = c4417f6;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47619b = obj;
        this.f47621d |= Integer.MIN_VALUE;
        return this.f47620c.c(this);
    }
}
