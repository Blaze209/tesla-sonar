package com.plaid.internal;

import java.util.List;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 2, 2, 2, 2, 2}, l = {346, 351, 358, 385}, m = "previous", n = {"this", "state", "currentPaneId", "this", "state", "currentPaneId", "backstack", "lastPaneId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class V2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y2 f46764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N2 f46765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m8 f46766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f46767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m8 f46768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f46769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y2 f46770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46771h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(Y2 y11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46770g = y11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46769f = obj;
        this.f46771h |= Integer.MIN_VALUE;
        return this.f46770g.b(null, this);
    }
}
