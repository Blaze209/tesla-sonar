package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {1, 1}, l = {439, 456}, m = "resume", n = {"this", "currentState"}, s = {"L$0", "L$1"})
public final class W2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y2 f46786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N2 f46787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f46788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y2 f46789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46790e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(Y2 y11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46789d = y11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46788c = obj;
        this.f46790e |= Integer.MIN_VALUE;
        return this.f46789d.a((N2) null, (AbstractC4587y6) null, this);
    }
}
