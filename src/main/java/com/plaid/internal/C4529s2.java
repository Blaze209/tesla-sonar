package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, l = {108, 112, 115, 116, 119, 124, 125}, m = "storeStateAndNavigate", n = {"this", "nextState", "this", "nextState", "this", "nextState", "this", "nextState", "this", "nextState", "this", "nextState"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
public final class C4529s2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f48101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N2 f48102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f48103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4538t2 f48104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4529s2(C4538t2 c4538t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48104d = c4538t2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48103c = obj;
        this.f48105e |= Integer.MIN_VALUE;
        return this.f48104d.a((N2) null, this);
    }
}
