package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.ChannelPolling", f = "ChannelPolling.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 52}, m = "pollOnChannel", n = {"this", "channelInfo", "pollingCallback", "fetchId", "shouldExitAfterThisPoll", "this", "channelInfo", "pollingCallback", "fetchId", "shouldExitAfterThisPoll"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"})
public final class E extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F f46278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f46279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G f46280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f46283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F f46284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46285h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46284g = f11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46283f = obj;
        this.f46285h |= Integer.MIN_VALUE;
        return F.a(this.f46284g, null, null, this);
    }
}
