package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.p002activity.result.ActivityResultLauncher;
import com.plaid.internal.Q0;
import com.plaid.link.Plaid;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkExit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkTokenConfiguration f46616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityResultLauncher<LinkTokenConfiguration> f46617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wn0.l<LinkTokenConfiguration, jn0.h0> f46618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wn0.l<LinkExit, jn0.h0> f46619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P0 f46620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4583y2 f46621f;

    @DebugMetadata(c = "com.plaid.internal.views.EmbeddedViewHandler$loadWebviewFromLinkToken$1", f = "EmbeddedViewHandler.kt", i = {}, l = {78, 79}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46624a;

        @DebugMetadata(c = "com.plaid.internal.views.EmbeddedViewHandler$loadWebviewFromLinkToken$1$1", f = "EmbeddedViewHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f46626a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q0 f46627b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, Q0 q11, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f46626a = obj;
                this.f46627b = q11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f46626a, this.f46627b, continuation);
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return new a(this.f46626a, this.f46627b, continuation).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                jn0.t.b(obj);
                Object obj2 = this.f46626a;
                Q0 q11 = this.f46627b;
                if (jn0.s.e(obj2) != null) {
                    q11.f46621f.getProgressBar$link_sdk_release().setVisibility(4);
                    q11.f46621f.getWebView$link_sdk_release().setVisibility(4);
                    q11.f46621f.getRetryContainer$link_sdk_release().setVisibility(0);
                    return jn0.h0.f84049a;
                }
                Q0 q12 = this.f46627b;
                U5 webView$link_sdk_release = q12.f46621f.getWebView$link_sdk_release();
                webView$link_sdk_release.loadUrl((String) obj2);
                webView$link_sdk_release.setVisibility(0);
                q12.f46621f.getProgressBar$link_sdk_release().setVisibility(4);
                q12.f46621f.getRetryContainer$link_sdk_release().setVisibility(4);
                return jn0.h0.f84049a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return Q0.this.new b(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return Q0.this.new b(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f46624a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r7)
                goto L4f
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                jn0.t.b(r7)
                jn0.s r7 = (jn0.s) r7
                java.lang.Object r7 = r7.getValue()
                goto L3a
            L24:
                jn0.t.b(r7)
                com.plaid.internal.Q0 r7 = com.plaid.internal.Q0.this
                com.plaid.internal.P0 r1 = r7.f46620e
                com.plaid.link.configuration.LinkTokenConfiguration r7 = r7.f46616a
                java.lang.String r7 = r7.getToken()
                r6.f46624a = r3
                java.lang.Object r7 = r1.a(r7, r6)
                if (r7 != r0) goto L3a
                goto L4e
            L3a:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.plaid.internal.Q0$b$a r3 = new com.plaid.internal.Q0$b$a
                com.plaid.internal.Q0 r4 = com.plaid.internal.Q0.this
                r5 = 0
                r3.<init>(r7, r4, r5)
                r6.f46624a = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.Q0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q0(Context context, LinkTokenConfiguration linkTokenConfig, ActivityResultLauncher<LinkTokenConfiguration> activityResultLauncher, wn0.l<? super LinkTokenConfiguration, jn0.h0> lVar, wn0.l<? super LinkExit, jn0.h0> failureCallback) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(linkTokenConfig, "linkTokenConfig");
        p013kotlin.jvm.internal.s.k(failureCallback, "failureCallback");
        this.f46616a = linkTokenConfig;
        this.f46617b = activityResultLauncher;
        this.f46618c = lVar;
        this.f46619d = failureCallback;
        Plaid plaid = Plaid.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        p013kotlin.jvm.internal.s.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
        P0 p11 = new P0(plaid.provideLinkTokenComponent$link_sdk_release((Application) applicationContext));
        this.f46620e = p11;
        a aVar = new a(context);
        wo0.b bVar = p11.f46573c;
        if (bVar == null) {
            p013kotlin.jvm.internal.s.B("json");
            bVar = null;
        }
        S0 s11 = new S0(aVar, bVar);
        C4583y2 c4583y2 = new C4583y2(context);
        U5 webView$link_sdk_release = c4583y2.getWebView$link_sdk_release();
        R0 listener = new R0(s11);
        webView$link_sdk_release.getClass();
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(listener, "interceptor");
        Context context2 = webView$link_sdk_release.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        }
        webView$link_sdk_release.f46744c = L5.a.f46429a;
        C4397d4 c4397d4 = webView$link_sdk_release.f46742a;
        c4397d4.getClass();
        p013kotlin.jvm.internal.s.k(listener, "listener");
        c4397d4.f47615a = listener;
        c4583y2.getRetryButton$link_sdk_release().setOnClickListener(new View.OnClickListener() { // from class: g00.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q0.a(this.f66821a, view);
            }
        });
        this.f46621f = c4583y2;
    }

    public static final void a(Q0 this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.a();
    }

    public final void a() {
        this.f46621f.getProgressBar$link_sdk_release().setVisibility(0);
        this.f46621f.getWebView$link_sdk_release().setVisibility(4);
        this.f46621f.getRetryContainer$link_sdk_release().setVisibility(4);
        BuildersKt__Builders_commonKt.launch$default(C4552u7.a(this.f46621f), null, null, new b(null), 3, null);
    }

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f46623b;

        public a(Context context) {
            this.f46623b = context;
        }

        public final void a(M0 embeddedSessionInfo) {
            p013kotlin.jvm.internal.s.k(embeddedSessionInfo, "embeddedSessionInfo");
            LinkTokenConfiguration linkTokenConfigurationBuild = new LinkTokenConfiguration.Builder().embeddedSessionInfo(embeddedSessionInfo).noLoadingState(Q0.this.f46616a.getNoLoadingState()).logLevel(Q0.this.f46616a.getLogLevel()).build();
            Q0 q11 = Q0.this;
            ActivityResultLauncher<LinkTokenConfiguration> activityResultLauncher = q11.f46617b;
            if (activityResultLauncher != null) {
                activityResultLauncher.b(linkTokenConfigurationBuild);
                return;
            }
            wn0.l<LinkTokenConfiguration, jn0.h0> lVar = q11.f46618c;
            if (lVar != null) {
                lVar.invoke(linkTokenConfigurationBuild);
            }
        }

        public final void a(String url) {
            p013kotlin.jvm.internal.s.k(url, "url");
            androidx.browser.customtabs.d dVarB = new androidx.browser.customtabs.d.C0067d().b();
            p013kotlin.jvm.internal.s.j(dVarB, "build(...)");
            dVarB.a(this.f46623b, Uri.parse(url));
        }

        public final void a(LinkExit linkExit) {
            p013kotlin.jvm.internal.s.k(linkExit, "linkExit");
            Q0.this.f46619d.invoke(linkExit);
        }
    }
}
