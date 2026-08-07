package com.plaid.internal;

import android.webkit.JavascriptInterface;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4462k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4397d4 f47801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wo0.b f47802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableStateFlow<Boolean> f47803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StateFlow<Boolean> f47804d;

    /* JADX INFO: renamed from: com.plaid.internal.k6$a */
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<wo0.d, jn0.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47805a = new a();

        public a() {
            super(1);
        }

        @Override // wn0.l
        public final jn0.h0 invoke(wo0.d dVar) {
            wo0.d Json = dVar;
            p013kotlin.jvm.internal.s.k(Json, "$this$Json");
            Json.h(true);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.k6$b */
    @DebugMetadata(c = "com.plaid.core.webview.PreloadWebViewJSInterface$postMessage$1", f = "PreloadWebViewJSInterface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4462k6.this.new b(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return C4462k6.this.new b(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            jn0.t.b(obj);
            C4462k6.this.f47803c.setValue(Boxing.boxBoolean(true));
            return jn0.h0.f84049a;
        }
    }

    public C4462k6(C4397d4 mutablePlaidWebViewMessageInterceptor) {
        p013kotlin.jvm.internal.s.k(mutablePlaidWebViewMessageInterceptor, "mutablePlaidWebViewMessageInterceptor");
        this.f47801a = mutablePlaidWebViewMessageInterceptor;
        this.f47802b = wo0.u.b(null, a.f47805a, 1, null);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f47803c = MutableStateFlow;
        this.f47804d = FlowKt.asStateFlow(MutableStateFlow);
    }

    @JavascriptInterface
    public final void postMessage(String message) {
        p013kotlin.jvm.internal.s.k(message, "message");
        try {
            wo0.b bVar = this.f47802b;
            C4340a.b.a();
            C4340a c4340a = (C4340a) bVar.d(C4340a.C0720a.f46856a, message);
            String strA = c4340a.a();
            if (p013kotlin.jvm.internal.s.f(strA, "ready")) {
                X5.a.a(X5.f46812a, "JS received Link is ready");
                A6.a.b(p013kotlin.collections.v0.i(), "JSBridge - received ready");
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new b(null), 3, null);
                return;
            }
            if (!p013kotlin.jvm.internal.s.f(strA, "open-webview")) {
                T6.a.a("JS sent unknown action: " + c4340a.a());
                A6.a.a(p013kotlin.collections.v0.f(jn0.x.a("action", c4340a.a())), "JSBridge - received unknown action");
                return;
            }
            AbstractC4531s4 abstractC4531s4A = AbstractC4531s4.a.a(message);
            X5.a.a(X5.f46812a, "JS received open webview message : " + abstractC4531s4A);
            A6.a.b(p013kotlin.collections.v0.i(), "JSBridge - received open-webview");
            this.f47801a.a(abstractC4531s4A);
        } catch (Exception e11) {
            T6.a.a(e11, "Error parsing message: " + message);
            Pair pairA = jn0.x.a("message", message);
            String message2 = e11.getMessage();
            if (message2 == null) {
                message2 = "unknown";
            }
            A6.a.a(p013kotlin.collections.v0.m(pairA, jn0.x.a(AnalyticsAttribute.Error, message2)), "JSBridge - error parsing message");
        }
    }
}
