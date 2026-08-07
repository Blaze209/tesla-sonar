package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.persistence.LinkWorkflowAnalyticsDatabaseBackedStore", f = "LinkWorkflowAnalyticsDatabaseBackedStore.kt", i = {}, l = {25}, m = "retrieveAllEvents", n = {}, s = {})
public final class C4584y3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f48232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4593z3 f48233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4584y3(C4593z3 c4593z3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48233b = c4593z3;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48232a = obj;
        this.f48234c |= Integer.MIN_VALUE;
        return this.f48233b.a(this);
    }
}
