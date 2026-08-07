package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 1}, l = {56, 56, 58}, m = "previous", n = {"this", "this"}, s = {"L$0", "L$0"})
public final class C4503p2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4538t2 f48029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y2 f48030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f48031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4538t2 f48032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4503p2(C4538t2 c4538t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48032d = c4538t2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48031c = obj;
        this.f48033e |= Integer.MIN_VALUE;
        return this.f48032d.a(this);
    }
}
