package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 2, 2, 2, 4, 4}, l = {56, 66, 74, 85, 93}, m = "start", n = {"this", "state", "this", "state", "isEagerStart", "this", "state"}, s = {"L$0", "L$1", "L$0", "L$1", "Z$0", "L$0", "L$1"})
public final class X2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y2 f46806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N2 f46807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f46809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y2 f46810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(Y2 y11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46810e = y11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46809d = obj;
        this.f46811f |= Integer.MIN_VALUE;
        return this.f46810e.a((N2) null, false, (ContinuationImpl) this);
    }
}
