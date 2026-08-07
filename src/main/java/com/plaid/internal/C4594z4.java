package com.plaid.internal;

import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4594z4 extends androidx.p003lifecycle.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4547u2 f48265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4578x6 f48266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4524r6 f48267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4569w6 f48268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4551u6 f48269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u8 f48270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d8 f48271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D7 f48272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F f48273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Job f48274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C4585y4 f48275k;

    /* JADX INFO: renamed from: com.plaid.internal.z4$a */
    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessClosed$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48276a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4594z4.this.new a(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return C4594z4.this.new a(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48276a;
            if (i11 == 0) {
                jn0.t.b(obj);
                D7 d7B = C4594z4.this.b();
                this.f48276a = 1;
                if (d7B.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.z4$b */
    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessClosed$3$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48278a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4594z4.this.new b(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return C4594z4.this.new b(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48278a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C4594z4 c4594z4 = C4594z4.this;
                this.f48278a = 1;
                if (C4594z4.a(c4594z4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            F f11 = C4594z4.this.f48273i;
            if (f11 == null) {
                p013kotlin.jvm.internal.s.B("channelPolling");
                f11 = null;
            }
            f11.f46305c = true;
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.z4$c */
    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessOpened$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {141, 142}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48280a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4594z4.this.new c(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return C4594z4.this.new c(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (com.plaid.internal.C4594z4.a(r5, r4) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f48280a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L3b
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                goto L30
            L1e:
                jn0.t.b(r5)
                com.plaid.internal.z4 r5 = com.plaid.internal.C4594z4.this
                com.plaid.internal.D7 r5 = r5.b()
                r4.f48280a = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L30
                goto L3a
            L30:
                com.plaid.internal.z4 r5 = com.plaid.internal.C4594z4.this
                r4.f48280a = r2
                java.lang.Object r5 = com.plaid.internal.C4594z4.a(r5, r4)
                if (r5 != r0) goto L3b
            L3a:
                return r0
            L3b:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4594z4.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C4594z4(H1 outOfProcessComponent) {
        p013kotlin.jvm.internal.s.k(outOfProcessComponent, "outOfProcessComponent");
        C4483n0 c4483n0 = (C4483n0) outOfProcessComponent;
        this.f48265a = c4483n0.f47905n.get();
        this.f48266b = c4483n0.f47906o.get();
        this.f48267c = c4483n0.f47911t.get();
        this.f48268d = c4483n0.f47908q.get();
        this.f48269e = c4483n0.f47917z.get();
        this.f48270f = c4483n0.A.get();
        C4492o0 c4492o0 = c4483n0.f47893b;
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
        this.f48271g = (d8) qj0.h.d((d8) objB);
        this.f48272h = c4483n0.f47910s.get();
        this.f48273i = c4483n0.f47912u.get();
        this.f48275k = new C4585y4(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C4594z4 c4594z4, ContinuationImpl continuationImpl) {
        A4 a11;
        c4594z4.getClass();
        if (continuationImpl instanceof A4) {
            a11 = (A4) continuationImpl;
            int i11 = a11.f46205d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a11.f46205d = i11 - Integer.MIN_VALUE;
            } else {
                a11 = new A4(c4594z4, continuationImpl);
            }
        } else {
            a11 = new A4(c4594z4, continuationImpl);
        }
        Object objB = a11.f46203b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = a11.f46205d;
        if (i12 == 0) {
            jn0.t.b(objB);
            InterfaceC4524r6 interfaceC4524r6 = c4594z4.f48267c;
            if (interfaceC4524r6 == null) {
                p013kotlin.jvm.internal.s.B("readChannelInfo");
                interfaceC4524r6 = null;
            }
            a11.f46202a = c4594z4;
            a11.f46205d = 1;
            objB = interfaceC4524r6.b(a11);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4594z4 = a11.f46202a;
            jn0.t.b(objB);
        }
        A channelInfo = (A) objB;
        if (channelInfo == null) {
            X5.a.e(X5.f46812a, "No Out Of Process Polling Info Available");
            InterfaceC4547u2 interfaceC4547u2 = c4594z4.f48265a;
            if (interfaceC4547u2 == null) {
                p013kotlin.jvm.internal.s.B("linkController");
                interfaceC4547u2 = null;
            }
            interfaceC4547u2.a(new LinkExit(null, null, 3, null));
            return jn0.h0.f84049a;
        }
        F f11 = c4594z4.f48273i;
        if (f11 == null) {
            p013kotlin.jvm.internal.s.B("channelPolling");
            f11 = null;
        }
        CoroutineScope coroutineScope = androidx.p003lifecycle.d1.a(c4594z4);
        C4585y4 pollingCallback = c4594z4.f48275k;
        f11.getClass();
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(channelInfo, "channelInfo");
        p013kotlin.jvm.internal.s.k(pollingCallback, "pollingCallback");
        c4594z4.f48274j = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new D(f11, channelInfo, pollingCallback, null), 3, null);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(C4594z4 c4594z4, ContinuationImpl continuationImpl) {
        B4 b11;
        c4594z4.getClass();
        if (continuationImpl instanceof B4) {
            b11 = (B4) continuationImpl;
            int i11 = b11.f46227d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b11.f46227d = i11 - Integer.MIN_VALUE;
            } else {
                b11 = new B4(c4594z4, continuationImpl);
            }
        } else {
            b11 = new B4(c4594z4, continuationImpl);
        }
        Object objA = b11.f46225b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = b11.f46227d;
        InterfaceC4551u6 interfaceC4551u6 = null;
        if (i12 == 0) {
            jn0.t.b(objA);
            InterfaceC4551u6 interfaceC4551u7 = c4594z4.f48269e;
            if (interfaceC4551u7 == null) {
                p013kotlin.jvm.internal.s.B("readPreCompletionResult");
                interfaceC4551u7 = null;
            }
            b11.f46224a = c4594z4;
            b11.f46227d = 1;
            objA = interfaceC4551u7.a(b11);
            if (objA != coroutine_suspended) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LinkResult linkResult = (LinkResult) b11.f46224a;
            jn0.t.b(objA);
            return linkResult;
        }
        c4594z4 = (C4594z4) b11.f46224a;
        jn0.t.b(objA);
        Channel$Message.SDKResult sDKResult = (Channel$Message.SDKResult) objA;
        LinkResult linkResultA = sDKResult != null ? O6.a(sDKResult) : null;
        InterfaceC4551u6 interfaceC4551u8 = c4594z4.f48269e;
        if (interfaceC4551u8 != null) {
            interfaceC4551u6 = interfaceC4551u8;
        } else {
            p013kotlin.jvm.internal.s.B("readPreCompletionResult");
        }
        b11.f46224a = linkResultA;
        b11.f46227d = 2;
        return interfaceC4551u6.b(b11) == coroutine_suspended ? coroutine_suspended : linkResultA;
    }

    public final void c() {
        Job job = this.f48274j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new c(null), 3, null);
    }

    public final D7 b() {
        D7 d11 = this.f48272h;
        if (d11 != null) {
            return d11;
        }
        p013kotlin.jvm.internal.s.B("webviewFallbackAnalytics");
        return null;
    }

    public static final void a(C4594z4 c4594z4, LinkResult linkResult) {
        c4594z4.getClass();
        InterfaceC4547u2 interfaceC4547u2 = null;
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(c4594z4), null, null, new C4567w4(c4594z4, null), 3, null);
        InterfaceC4547u2 interfaceC4547u3 = c4594z4.f48265a;
        if (interfaceC4547u3 != null) {
            interfaceC4547u2 = interfaceC4547u3;
        } else {
            p013kotlin.jvm.internal.s.B("linkController");
        }
        interfaceC4547u2.a(linkResult);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        C4576x4 c4576x4;
        if (continuationImpl instanceof C4576x4) {
            c4576x4 = (C4576x4) continuationImpl;
            int i11 = c4576x4.f48220c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4576x4.f48220c = i11 - Integer.MIN_VALUE;
            } else {
                c4576x4 = new C4576x4(this, continuationImpl);
            }
        } else {
            c4576x4 = new C4576x4(this, continuationImpl);
        }
        Object objA = c4576x4.f48218a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4576x4.f48220c;
        if (i12 == 0) {
            jn0.t.b(objA);
            InterfaceC4578x6 interfaceC4578x6 = this.f48266b;
            if (interfaceC4578x6 == null) {
                p013kotlin.jvm.internal.s.B("readWebviewFallbackUri");
                interfaceC4578x6 = null;
            }
            c4576x4.f48220c = 1;
            objA = interfaceC4578x6.a(c4576x4);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objA);
        }
        String str = (String) objA;
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public final void a(boolean z11) {
        F f11 = null;
        if (z11) {
            BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new a(null), 3, null);
        }
        if (this.f48274j == null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new b(null), 3, null);
            return;
        }
        F f12 = this.f48273i;
        if (f12 != null) {
            f11 = f12;
        } else {
            p013kotlin.jvm.internal.s.B("channelPolling");
        }
        f11.f46305c = true;
    }

    public final void a() {
        InterfaceC4547u2 interfaceC4547u2 = null;
        LinkExit linkExit = new LinkExit(null, null, 3, null);
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new C4567w4(this, null), 3, null);
        InterfaceC4547u2 interfaceC4547u3 = this.f48265a;
        if (interfaceC4547u3 != null) {
            interfaceC4547u2 = interfaceC4547u3;
        } else {
            p013kotlin.jvm.internal.s.B("linkController");
        }
        interfaceC4547u2.a(linkExit);
    }
}
