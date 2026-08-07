package com.plaid.internal;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class P7 extends androidx.p003lifecycle.c1 implements L5, M5, C4539t3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wo0.b f46592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4547u2 f46593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4578x6 f46594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4443i5 f46595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4569w6 f46596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4560v6 f46597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D7 f46598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N5 f46599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC4524r6 f46600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f46601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C4499o7 f46602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C4539t3 f46603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MutableSharedFlow<String> f46604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ValueCallback<Uri[]> f46605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C4480m6 f46606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C6 f46607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f46608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final O7 f46609r;

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onCleared$1", f = "WebviewViewModel.kt", i = {}, l = {142, 143}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public P7 f46610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f46611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46612c;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return P7.this.new a(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return P7.this.new a(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004a  */
        /* JADX WARN: Code duplicated, block: B:23:0x0055  */
        /* JADX WARN: Code duplicated, block: B:30:0x0065 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:32:? A[LOOP:0: B:18:0x0044->B:32:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            if (r8 == r0) goto L26;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f46612c
                r2 = 0
                java.lang.String r3 = "internalPictureStorage"
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                java.util.Iterator r1 = r7.f46611b
                com.plaid.internal.P7 r5 = r7.f46610a
                jn0.t.b(r8)
                goto L44
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                jn0.t.b(r8)
                goto L3c
            L25:
                jn0.t.b(r8)
                com.plaid.internal.P7 r8 = com.plaid.internal.P7.this
                com.plaid.internal.i5 r8 = r8.f46595d
                if (r8 == 0) goto L2f
                goto L33
            L2f:
                p013kotlin.jvm.internal.s.B(r3)
                r8 = r2
            L33:
                r7.f46612c = r5
                java.lang.Object r8 = r8.a(r7)
                if (r8 != r0) goto L3c
                goto L65
            L3c:
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                com.plaid.internal.P7 r5 = com.plaid.internal.P7.this
                java.util.Iterator r1 = r8.iterator()
            L44:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L66
                java.lang.Object r8 = r1.next()
                java.lang.String r8 = (java.lang.String) r8
                com.plaid.internal.i5 r6 = r5.f46595d
                if (r6 == 0) goto L55
                goto L59
            L55:
                p013kotlin.jvm.internal.s.B(r3)
                r6 = r2
            L59:
                r7.f46610a = r5
                r7.f46611b = r1
                r7.f46612c = r4
                java.lang.Object r8 = r6.a(r8, r7)
                if (r8 != r0) goto L44
            L65:
                return r0
            L66:
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.P7.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onWebviewCancelled$1", f = "WebviewViewModel.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46614a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return P7.this.new b(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return P7.this.new b(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f46614a;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC4547u2 interfaceC4547u2B = P7.this.b();
                this.f46614a = 1;
                if (interfaceC4547u2B.a(this) == coroutine_suspended) {
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

    public P7(H1 webviewComponent) {
        p013kotlin.jvm.internal.s.k(webviewComponent, "webviewComponent");
        this.f46604m = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f46609r = new O7(this);
        C4483n0 c4483n0 = (C4483n0) webviewComponent;
        wo0.b bVar = c4483n0.f47892a.f48012e.get();
        this.f46592a = bVar;
        this.f46593b = c4483n0.f47905n.get();
        this.f46594c = c4483n0.f47906o.get();
        this.f46595d = c4483n0.f47907p.get();
        this.f46596e = c4483n0.f47908q.get();
        this.f46597f = c4483n0.f47909r.get();
        this.f46598g = c4483n0.f47910s.get();
        this.f46599h = c4483n0.f47892a.f48022o.get();
        this.f46600i = c4483n0.f47911t.get();
        this.f46601j = c4483n0.f47912u.get();
        this.f46602k = c4483n0.f47914w.get();
        this.f46606o = c4483n0.f47915x.get();
        this.f46607p = c4483n0.f47893b.f47966m.get();
        if (bVar == null) {
            p013kotlin.jvm.internal.s.B("json");
            bVar = null;
        }
        this.f46603l = new C4539t3(this, bVar);
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new L7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new M7(this, null), 3, null);
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(C4342a1 exception) {
        p013kotlin.jvm.internal.s.k(exception, "exception");
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new N7(this, null), 3, null);
        b().a(L2.b(exception, null));
    }

    public final InterfaceC4547u2 b() {
        InterfaceC4547u2 interfaceC4547u2 = this.f46593b;
        if (interfaceC4547u2 != null) {
            return interfaceC4547u2;
        }
        p013kotlin.jvm.internal.s.B("linkController");
        return null;
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void c(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        b().a(url);
    }

    @Override // androidx.p003lifecycle.c1
    public final void onCleared() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new a(null), 3, null);
        super.onCleared();
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void b(String linkSessionId) {
        p013kotlin.jvm.internal.s.k(linkSessionId, "linkSessionId");
        if (p013kotlin.jvm.internal.s.f(this.f46608q, linkSessionId)) {
            return;
        }
        this.f46608q = linkSessionId;
        C6 c11 = this.f46607p;
        if (c11 == null) {
            p013kotlin.jvm.internal.s.B("remoteLogController");
            c11 = null;
        }
        c11.f46241a.a(linkSessionId);
        c11.a();
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(LinkExit linkExit) {
        p013kotlin.jvm.internal.s.k(linkExit, "linkExit");
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new N7(this, null), 3, null);
        b().a(linkExit);
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(LinkSuccess linkSuccess) {
        p013kotlin.jvm.internal.s.k(linkSuccess, "linkSuccess");
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new N7(this, null), 3, null);
        b().a(linkSuccess);
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(LinkedHashMap linkData) {
        p013kotlin.jvm.internal.s.k(linkData, "linkData");
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new Q7(this, linkData, null), 3, null);
    }

    @Override // com.plaid.internal.M5
    public final boolean a(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        this.f46603l.a(url);
        return true;
    }

    @Override // com.plaid.internal.L5
    public final void a() {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new b(null), 3, null);
    }

    public final void a(List uris) {
        p013kotlin.jvm.internal.s.k(uris, "uris");
        ValueCallback<Uri[]> valueCallback = this.f46605n;
        if (valueCallback != null) {
            valueCallback.onReceiveValue((Uri[]) uris.toArray(new Uri[0]));
        }
    }

    @Override // com.plaid.internal.M5
    public final void a(AbstractC4531s4 openInterstitialMessage) {
        p013kotlin.jvm.internal.s.k(openInterstitialMessage, "openInterstitialMessage");
        b().a(openInterstitialMessage);
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(LinkEvent linkEvent, I2 queueOptions) {
        p013kotlin.jvm.internal.s.k(linkEvent, "linkEvent");
        p013kotlin.jvm.internal.s.k(queueOptions, "queueOptions");
        X5.a.a(X5.f46812a, "Event: " + linkEvent.getEventName());
        wn0.p<LinkEvent, I2, jn0.h0> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, queueOptions);
        }
    }

    @Override // com.plaid.internal.C4539t3.a
    public final void a(String string, LinkEventMetadata metadata) {
        p013kotlin.jvm.internal.s.k(string, "action");
        p013kotlin.jvm.internal.s.k(metadata, "linkEventMetadata");
        wn0.p<LinkEvent, I2, jn0.h0> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            p013kotlin.jvm.internal.s.k(string, "string");
            LinkEventName eventName = LinkEventName.INSTANCE.fromString$link_sdk_release(string);
            p013kotlin.jvm.internal.s.k(eventName, "eventName");
            p013kotlin.jvm.internal.s.k(metadata, "metadata");
            linkEventListenerInternal$link_sdk_release.invoke(new LinkEvent(eventName, metadata), I2.d.f46349a);
        }
    }
}
