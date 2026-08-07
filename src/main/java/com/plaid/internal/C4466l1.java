package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4466l1 extends p8 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f47821k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableSharedFlow<Pane$PaneRendering> f47822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC4533s6 f47823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T3 f47824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d8 f47825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C4496o4 f47826j;

    /* JADX INFO: renamed from: com.plaid.internal.l1$a */
    @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$1", f = "HeadlessOAuthViewModel.kt", i = {}, l = {50, 62}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47827a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m8 f47829c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m8 m8Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f47829c = m8Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4466l1.this.new a(this.f47829c, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return C4466l1.this.new a(this.f47829c, continuation).invokeSuspend(jn0.h0.f84049a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L17;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws com.plaid.internal.D2 {
            /*
                r10 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f47827a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r11)
                goto L79
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                jn0.t.b(r11)
                goto L2e
            L1e:
                jn0.t.b(r11)
                com.plaid.internal.l1 r11 = com.plaid.internal.C4466l1.this
                com.plaid.internal.m8 r1 = r10.f47829c
                r10.f47827a = r3
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L2e
                goto L78
            L2e:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r11 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) r11
                boolean r1 = r11.hasHeadlessOAuth()
                if (r1 == 0) goto L7c
                com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane$Rendering r1 = r11.getHeadlessOAuth()
                com.plaid.internal.l1 r3 = com.plaid.internal.C4466l1.this
                r1.getEvents()
                com.plaid.internal.C4466l1.b(r3)
                com.plaid.internal.l1 r3 = com.plaid.internal.C4466l1.this
                com.plaid.internal.o4 r4 = new com.plaid.internal.o4
                com.plaid.internal.d8 r5 = r3.c()
                com.plaid.internal.l1 r6 = com.plaid.internal.C4466l1.this
                com.plaid.internal.x3 r6 = r6.a()
                com.plaid.internal.l1 r7 = com.plaid.internal.C4466l1.this
                p013kotlin.jvm.internal.s.h(r1)
                com.plaid.internal.p4 r7 = com.plaid.internal.C4466l1.a(r7, r1)
                java.lang.String r8 = r1.getOauthStateId()
                java.lang.String r1 = "getOauthStateId(...)"
                p013kotlin.jvm.internal.s.j(r8, r1)
                com.plaid.internal.m8 r9 = r10.f47829c
                r4.<init>(r5, r6, r7, r8, r9)
                r3.a(r4)
                com.plaid.internal.l1 r1 = com.plaid.internal.C4466l1.this
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.plaid.internal.C4466l1.a(r1)
                r10.f47827a = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L79
            L78:
                return r0
            L79:
                jn0.h0 r11 = jn0.h0.f84049a
                return r11
            L7c:
                com.plaid.internal.D2 r0 = new com.plaid.internal.D2
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering$b r1 = r11.getRenderingCase()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Pane rendering must be headless oauth. was "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r11.getId()
                r11.getPaneNodeId()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4466l1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.l1$b */
    public static abstract class b {

        /* JADX INFO: renamed from: com.plaid.internal.l1$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f47830a;

            public a(String oautStateId) {
                p013kotlin.jvm.internal.s.k(oautStateId, "oautStateId");
                this.f47830a = oautStateId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f47830a, ((a) obj).f47830a);
            }

            public final int hashCode() {
                return this.f47830a.hashCode();
            }

            public final String toString() {
                return "PollOAuthResult(oautStateId=" + this.f47830a + ")";
            }
        }

        /* JADX INFO: renamed from: com.plaid.internal.l1$b$b, reason: collision with other inner class name */
        public static final class C0758b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f47831a;

            public C0758b(String loginUrl) {
                p013kotlin.jvm.internal.s.k(loginUrl, "loginUrl");
                this.f47831a = loginUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0758b) && p013kotlin.jvm.internal.s.f(this.f47831a, ((C0758b) obj).f47831a);
            }

            public final int hashCode() {
                return this.f47831a.hashCode();
            }

            public final String toString() {
                return "ShowLogin(loginUrl=" + this.f47831a + ")";
            }
        }

        /* JADX INFO: renamed from: com.plaid.internal.l1$b$c */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f47832a;

            public c(String redirectUri) {
                p013kotlin.jvm.internal.s.k(redirectUri, "redirectUri");
                this.f47832a = redirectUri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f47832a, ((c) obj).f47832a);
            }

            public final int hashCode() {
                return this.f47832a.hashCode();
            }

            public final String toString() {
                return "SubmitRedirectUri(redirectUri=" + this.f47832a + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4466l1(m8 paneId, J4 paneHostComponent) {
        super(paneId, paneHostComponent);
        p013kotlin.jvm.internal.s.k(paneId, "paneId");
        p013kotlin.jvm.internal.s.k(paneHostComponent, "paneHostComponent");
        this.f47822f = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        C4474m0 c4474m0A = paneHostComponent.a();
        C4492o0 c4492o0 = c4474m0A.f47862a;
        C4483n0 c4483n0 = c4474m0A.f47863b;
        this.f48045c = c4483n0.f47905n.get();
        this.f48046d = c4483n0.f47904m.get();
        this.f48047e = c4492o0.f47957d.get();
        this.f47823g = c4483n0.B.get();
        this.f47824h = c4492o0.f47963j.get();
        E5 retrofitFactory = c4492o0.f47954a.f48019l.get();
        C4479m5 plaidEnvironmentStore = c4492o0.f47954a.f48020m.get();
        p013kotlin.jvm.internal.s.k(retrofitFactory, "retrofitFactory");
        p013kotlin.jvm.internal.s.k(plaidEnvironmentStore, "plaidEnvironmentStore");
        EnumC4452j5 env = plaidEnvironmentStore.b();
        p013kotlin.jvm.internal.s.k(env, "env");
        int i11 = C4461k5.f47800a[env.ordinal()];
        String str = "https://production.plaid.com/";
        if (i11 != 1) {
            if (i11 == 2) {
                str = "https://development.plaid.com/";
            } else if (i11 == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object objB = retrofitFactory.a(str, new G5(null, 3)).b(d8.class);
        p013kotlin.jvm.internal.s.j(objB, "create(...)");
        this.f47825i = (d8) qj0.h.d((d8) objB);
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new a(paneId, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C4466l1 c4466l1, Pane$PaneRendering pane$PaneRendering, ContinuationImpl continuationImpl) {
        C4493o1 c4493o1;
        Pane$PaneRendering pane$PaneRendering2;
        String str;
        c4466l1.getClass();
        if (continuationImpl instanceof C4493o1) {
            c4493o1 = (C4493o1) continuationImpl;
            int i11 = c4493o1.f47975e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4493o1.f47975e = i11 - Integer.MIN_VALUE;
            } else {
                c4493o1 = new C4493o1(c4466l1, continuationImpl);
            }
        } else {
            c4493o1 = new C4493o1(c4466l1, continuationImpl);
        }
        Object objA = c4493o1.f47973c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4493o1.f47975e;
        if (i12 == 0) {
            jn0.t.b(objA);
            T3 t11 = c4466l1.f47824h;
            if (t11 == null) {
                p013kotlin.jvm.internal.s.B("localPaneStateStore");
                t11 = null;
            }
            String str2 = c4466l1.f48043a.f47885b;
            c4493o1.f47971a = c4466l1;
            c4493o1.f47972b = pane$PaneRendering;
            c4493o1.f47975e = 1;
            objA = t11.a(str2, "login_url", c4493o1);
            if (objA != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            pane$PaneRendering = c4493o1.f47972b;
            c4466l1 = (C4466l1) c4493o1.f47971a;
            jn0.t.b(objA);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pane$PaneRendering2 = (Pane$PaneRendering) c4493o1.f47971a;
            jn0.t.b(objA);
        }
        str = (String) objA;
        if (str == null && str.length() != 0) {
            return new b.c(str);
        }
        String oauthStateId = pane$PaneRendering2.getHeadlessOAuth().getOauthStateId();
        p013kotlin.jvm.internal.s.j(oauthStateId, "getOauthStateId(...)");
        return new b.a(oauthStateId);
        String str3 = (String) objA;
        if (str3 == null || str3.length() == 0) {
            String loginUri = pane$PaneRendering.getHeadlessOAuth().getLoginUri();
            p013kotlin.jvm.internal.s.j(loginUri, "getLoginUri(...)");
            return new b.C0758b(loginUri);
        }
        InterfaceC4533s6 interfaceC4533s6 = c4466l1.f47823g;
        if (interfaceC4533s6 == null) {
            p013kotlin.jvm.internal.s.B("readOAuthRedirectUri");
            interfaceC4533s6 = null;
        }
        c4493o1.f47971a = pane$PaneRendering;
        c4493o1.f47972b = null;
        c4493o1.f47975e = 2;
        objA = interfaceC4533s6.a(c4493o1);
        if (objA != coroutine_suspended) {
            pane$PaneRendering2 = pane$PaneRendering;
            str = (String) objA;
            if (str == null) {
            }
            String oauthStateId2 = pane$PaneRendering2.getHeadlessOAuth().getOauthStateId();
            p013kotlin.jvm.internal.s.j(oauthStateId2, "getOauthStateId(...)");
            return new b.a(oauthStateId2);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(C4466l1 c4466l1, String oauthStateId, ContinuationImpl continuationImpl) {
        C4511q1 c4511q1;
        c4466l1.getClass();
        if (continuationImpl instanceof C4511q1) {
            c4511q1 = (C4511q1) continuationImpl;
            int i11 = c4511q1.f48058e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4511q1.f48058e = i11 - Integer.MIN_VALUE;
            } else {
                c4511q1 = new C4511q1(c4466l1, continuationImpl);
            }
        } else {
            c4511q1 = new C4511q1(c4466l1, continuationImpl);
        }
        Object obj = c4511q1.f48056c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4511q1.f48058e;
        if (i12 == 0) {
            jn0.t.b(obj);
            X5.f46812a.getClass();
            X5.a.a("Poll for oAuth result", true);
            C4496o4 c4496o4 = c4466l1.f47826j;
            if (c4496o4 == null) {
                p013kotlin.jvm.internal.s.B("oAuthPolling");
                c4496o4 = null;
            }
            c4511q1.f48054a = c4466l1;
            c4511q1.f48055b = oauthStateId;
            c4511q1.f48058e = 1;
            if (c4496o4.a(c4511q1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oauthStateId = c4511q1.f48055b;
            c4466l1 = c4511q1.f48054a;
            jn0.t.b(obj);
        }
        p013kotlin.jvm.internal.s.k(oauthStateId, "oauthStateId");
        HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.b bVarA = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().a(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.SubmitAction.newBuilder().a(oauthStateId));
        p013kotlin.jvm.internal.s.j(bVarA, "submitStateId(...)");
        a(c4466l1, bVarA);
        return jn0.h0.f84049a;
    }

    public final d8 c() {
        d8 d8Var = this.f47825i;
        if (d8Var != null) {
            return d8Var;
        }
        p013kotlin.jvm.internal.s.B("workflowApi");
        return null;
    }

    public static final C4505p4 a(C4466l1 c4466l1, HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering) {
        c4466l1.getClass();
        Common$PollingOptions polling = rendering.getPolling();
        p013kotlin.jvm.internal.s.j(polling, "getPolling(...)");
        return C4505p4.a.a(polling);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C4466l1 c4466l1, String str, ContinuationImpl continuationImpl) {
        C4502p1 c4502p1;
        c4466l1.getClass();
        if (continuationImpl instanceof C4502p1) {
            c4502p1 = (C4502p1) continuationImpl;
            int i11 = c4502p1.f48028e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4502p1.f48028e = i11 - Integer.MIN_VALUE;
            } else {
                c4502p1 = new C4502p1(c4466l1, continuationImpl);
            }
        } else {
            c4502p1 = new C4502p1(c4466l1, continuationImpl);
        }
        Object obj = c4502p1.f48026c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4502p1.f48028e;
        InterfaceC4547u2 interfaceC4547u2 = null;
        if (i12 == 0) {
            jn0.t.b(obj);
            X5.f46812a.getClass();
            X5.a.a("Opening login URL", true);
            T3 t11 = c4466l1.f47824h;
            if (t11 == null) {
                p013kotlin.jvm.internal.s.B("localPaneStateStore");
                t11 = null;
            }
            String str2 = c4466l1.f48043a.f47885b;
            c4502p1.f48024a = c4466l1;
            c4502p1.f48025b = str;
            c4502p1.f48028e = 1;
            if (t11.a(str2, "login_url", str, c4502p1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c4502p1.f48025b;
            c4466l1 = c4502p1.f48024a;
            jn0.t.b(obj);
        }
        InterfaceC4547u2 interfaceC4547u3 = c4466l1.f48045c;
        if (interfaceC4547u3 != null) {
            interfaceC4547u2 = interfaceC4547u3;
        } else {
            p013kotlin.jvm.internal.s.B("linkController");
        }
        interfaceC4547u2.a(str);
        return jn0.h0.f84049a;
    }

    public static void a(C4466l1 c4466l1, HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.b bVar) {
        String paneNodeId = c4466l1.f48043a.f47886c;
        Pane$PaneOutput.a actionsOutput = Pane$PaneOutput.newBuilder().a(bVar);
        p013kotlin.jvm.internal.s.j(actionsOutput, "setHeadlessOAuth(...)");
        p013kotlin.jvm.internal.s.k(paneNodeId, "paneNodeId");
        p013kotlin.jvm.internal.s.k(actionsOutput, "actionsOutput");
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(c4466l1), null, null, new o8(null, c4466l1, actionsOutput, paneNodeId, null), 3, null);
    }

    public final void a(C4496o4 c4496o4) {
        p013kotlin.jvm.internal.s.k(c4496o4, "<set-?>");
        this.f47826j = c4496o4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        C4475m1 c4475m1;
        if (continuationImpl instanceof C4475m1) {
            c4475m1 = (C4475m1) continuationImpl;
            int i11 = c4475m1.f47866c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4475m1.f47866c = i11 - Integer.MIN_VALUE;
            } else {
                c4475m1 = new C4475m1(this, continuationImpl);
            }
        } else {
            c4475m1 = new C4475m1(this, continuationImpl);
        }
        Object obj = c4475m1.f47864a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4475m1.f47866c;
        if (i12 == 0) {
            jn0.t.b(obj);
            MutableSharedFlow<Pane$PaneRendering> mutableSharedFlow = this.f47822f;
            C4484n1 c4484n1 = new C4484n1(this);
            c4475m1.f47866c = 1;
            if (mutableSharedFlow.collect(c4484n1, c4475m1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
