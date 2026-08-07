package com.plaid.internal;

import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4484n1<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4466l1 f47918a;

    /* JADX INFO: renamed from: com.plaid.internal.n1$a */
    @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$doOnStart$2", f = "HeadlessOAuthViewModel.kt", i = {0}, l = {68, 69, 70}, m = "emit", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C4484n1 f47919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4484n1<T> f47921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f47922d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C4484n1<? super T> c4484n1, Continuation<? super a> continuation) {
            super(continuation);
            this.f47921c = c4484n1;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47920b = obj;
            this.f47922d |= Integer.MIN_VALUE;
            return this.f47921c.emit(null, this);
        }
    }

    public C4484n1(C4466l1 c4466l1) {
        this.f47918a = c4466l1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (com.plaid.internal.C4466l1.a(r8, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (com.plaid.internal.C4466l1.b(r8, r9, r0) == r1) goto L33;
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.plaid.internal.C4484n1.a
            if (r0 == 0) goto L13
            r0 = r9
            com.plaid.internal.n1$a r0 = (com.plaid.internal.C4484n1.a) r0
            int r1 = r0.f47922d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47922d = r1
            goto L18
        L13:
            com.plaid.internal.n1$a r0 = new com.plaid.internal.n1$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f47920b
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f47922d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            jn0.t.b(r9)
            goto L82
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            jn0.t.b(r9)
            goto L6a
        L3b:
            com.plaid.internal.n1 r8 = r0.f47919a
            jn0.t.b(r9)
            goto L52
        L41:
            jn0.t.b(r9)
            com.plaid.internal.l1 r9 = r7.f47918a
            r0.f47919a = r7
            r0.f47922d = r5
            java.lang.Object r9 = com.plaid.internal.C4466l1.a(r9, r8, r0)
            if (r9 != r1) goto L51
            goto L81
        L51:
            r8 = r7
        L52:
            com.plaid.internal.l1$b r9 = (com.plaid.internal.C4466l1.b) r9
            boolean r2 = r9 instanceof com.plaid.internal.C4466l1.b.C0758b
            r6 = 0
            if (r2 == 0) goto L6d
            com.plaid.internal.l1 r8 = r8.f47918a
            com.plaid.internal.l1$b$b r9 = (com.plaid.internal.C4466l1.b.C0758b) r9
            java.lang.String r9 = r9.f47831a
            r0.f47919a = r6
            r0.f47922d = r4
            java.lang.Object r8 = com.plaid.internal.C4466l1.a(r8, r9, r0)
            if (r8 != r1) goto L6a
            goto L81
        L6a:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        L6d:
            boolean r2 = r9 instanceof com.plaid.internal.C4466l1.b.a
            if (r2 == 0) goto L85
            com.plaid.internal.l1 r8 = r8.f47918a
            com.plaid.internal.l1$b$a r9 = (com.plaid.internal.C4466l1.b.a) r9
            java.lang.String r9 = r9.f47830a
            r0.f47919a = r6
            r0.f47922d = r3
            java.lang.Object r8 = com.plaid.internal.C4466l1.b(r8, r9, r0)
            if (r8 != r1) goto L82
        L81:
            return r1
        L82:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        L85:
            boolean r0 = r9 instanceof com.plaid.internal.C4466l1.b.c
            if (r0 == 0) goto Lb9
            com.plaid.internal.l1 r8 = r8.f47918a
            com.plaid.internal.l1$b$c r9 = (com.plaid.internal.C4466l1.b.c) r9
            java.lang.String r9 = r9.f47832a
            r8.getClass()
            com.plaid.internal.X5$a r0 = com.plaid.internal.X5.f46812a
            r0.getClass()
            java.lang.String r0 = "Submit redirect URI"
            com.plaid.internal.X5.a.a(r0, r5)
            java.lang.String r0 = "oauthRedirectUri"
            p013kotlin.jvm.internal.s.k(r9, r0)
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$Actions$b r0 = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder()
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$Actions$SubmitAction$a r1 = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.newBuilder()
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$Actions$SubmitAction$a r9 = r1.b(r9)
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$Actions$b r9 = r0.a(r9)
            java.lang.String r0 = "submitUri(...)"
            p013kotlin.jvm.internal.s.j(r9, r0)
            com.plaid.internal.C4466l1.a(r8, r9)
        Lb9:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4484n1.emit(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
