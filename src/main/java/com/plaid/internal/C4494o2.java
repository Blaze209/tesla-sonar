package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", i = {0, 0, 1}, l = {50, 50, 52}, m = "next", n = {"this", "outputs", "this"}, s = {"L$0", "L$1", "L$0"})
public final class C4494o2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4538t2 f47976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pane$PaneOutput[] f47977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Y2 f47978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f47979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4538t2 f47980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47981f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4494o2(C4538t2 c4538t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47980e = c4538t2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47979d = obj;
        this.f47981f |= Integer.MIN_VALUE;
        return this.f47980e.a((Pane$PaneOutput[]) null, this);
    }
}
