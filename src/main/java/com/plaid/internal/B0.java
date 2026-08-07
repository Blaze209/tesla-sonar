package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.DestinationFactory", f = "DestinationFactory.kt", i = {0, 0, 0}, l = {63}, m = "create", n = {"this", "state", "paneId"}, s = {"L$0", "L$1", "L$2"})
public final class B0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A0 f46216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N2 f46217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m8 f46218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f46219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A0 f46220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46221f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(A0 a11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46220e = a11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46219d = obj;
        this.f46221f |= Integer.MIN_VALUE;
        return this.f46220e.a((N2) null, this);
    }
}
