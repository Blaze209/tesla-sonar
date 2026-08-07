package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 1}, l = {42, 44, 46}, m = "start", n = {"this", "this"}, s = {"L$0", "L$0"})
public final class C4520r2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4538t2 f48086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f48087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4538t2 f48088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4520r2(C4538t2 c4538t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48088c = c4538t2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48087b = obj;
        this.f48089d |= Integer.MIN_VALUE;
        return this.f48088c.b(this);
    }
}
