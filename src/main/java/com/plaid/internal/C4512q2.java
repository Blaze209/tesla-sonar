package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 0, 1, 1, 1, 2}, l = {65, 68, 70, 72}, m = "resume", n = {"this", "result", "this", "result", "currentState", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
public final class C4512q2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4538t2 f48059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC4587y6 f48060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public N2 f48061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f48062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4538t2 f48063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4512q2(C4538t2 c4538t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48063e = c4538t2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48062d = obj;
        this.f48064f |= Integer.MIN_VALUE;
        return this.f48063e.a((AbstractC4587y6) null, this);
    }
}
