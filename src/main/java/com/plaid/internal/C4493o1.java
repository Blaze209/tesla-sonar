package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", i = {0, 0, 1}, l = {78, 82}, m = "getOAuthState", n = {"this", "pane", "pane"}, s = {"L$0", "L$1", "L$0"})
public final class C4493o1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f47971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pane$PaneRendering f47972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f47973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4466l1 f47974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4493o1(C4466l1 c4466l1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47974d = c4466l1;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47973c = obj;
        this.f47975e |= Integer.MIN_VALUE;
        return C4466l1.a(this.f47974d, (Pane$PaneRendering) null, this);
    }
}
