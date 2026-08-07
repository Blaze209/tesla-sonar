package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.persistence.DatabaseBackedPaneStore", f = "DatabaseBackedPaneStore.kt", i = {0, 0}, l = {19}, m = "getPane", n = {"this", "pane"}, s = {"L$0", "L$1"})
public final class C4510q0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4518r0 f48049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m8 f48050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f48051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4518r0 f48052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48053e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4510q0(C4518r0 c4518r0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48052d = c4518r0;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48051c = obj;
        this.f48053e |= Integer.MIN_VALUE;
        return this.f48052d.a(null, this);
    }
}
