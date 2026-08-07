package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController", f = "PreloadLinkController.kt", i = {0}, l = {99}, m = "getResult", n = {"this"}, s = {"L$0"})
public final class C4347a6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4417f6 f46865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4417f6 f46867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4347a6(C4417f6 c4417f6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46867c = c4417f6;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46866b = obj;
        this.f46868d |= Integer.MIN_VALUE;
        return this.f46867c.a(this);
    }
}
