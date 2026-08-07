package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.di.ChannelInfoStore", f = "ChannelInfoStore.kt", i = {0}, l = {25}, m = "readChannelInfo", n = {"this"}, s = {"L$0"})
public final class B extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C f46212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f46214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46214c = c11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46213b = obj;
        this.f46215d |= Integer.MIN_VALUE;
        return this.f46214c.b(this);
    }
}
