package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.di.PreCompletionResultStore", f = "PreCompletionResultStore.kt", i = {}, l = {24}, m = "readPreCompletionResult", n = {}, s = {})
public final class Y5 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z5 f46832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5(Z5 z11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46832b = z11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46831a = obj;
        this.f46833c |= Integer.MIN_VALUE;
        return this.f46832b.a(this);
    }
}
