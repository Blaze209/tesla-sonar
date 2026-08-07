package com.plaid.internal;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.adyen.checkout.components.core.Address;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class U5 extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4397d4 f46742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4462k6 f46743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L5 f46744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f46745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f46746e;

    @DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$submit$1", f = "PlaidWebview.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46747a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f46749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f46750d;

        /* JADX INFO: renamed from: com.plaid.internal.U5$a$a, reason: collision with other inner class name */
        public static final class C0718a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ U5 f46751a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f46752b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f46753c;

            public C0718a(U5 u11, String str, String str2) {
                this.f46751a = u11;
                this.f46752b = str;
                this.f46753c = str2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                ((Boolean) obj).getClass();
                Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new T5(this.f46751a, this.f46752b, this.f46753c, null), continuation);
                return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f46749c = str;
            this.f46750d = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return U5.this.new a(this.f46749c, this.f46750d, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f46747a;
            if (i11 == 0) {
                jn0.t.b(obj);
                U5 u11 = U5.this;
                StateFlow<Boolean> stateFlow = u11.f46743b.f47804d;
                C0718a c0718a = new C0718a(u11, this.f46749c, this.f46750d);
                this.f46747a = 1;
                Object objCollect = stateFlow.collect(new V5(c0718a), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = jn0.h0.f84049a;
                }
                if (objCollect == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(Context context) {
        super(new MutableContextWrapper(context), null, 0);
        p013kotlin.jvm.internal.s.k(context, "context");
        C4397d4 c4397d4 = new C4397d4();
        this.f46742a = c4397d4;
        C4462k6 c4462k6 = new C4462k6(c4397d4);
        this.f46743b = c4462k6;
        this.f46746e = new AtomicBoolean(false);
        if (Build.VERSION.SDK_INT >= 26) {
            setRendererPriorityPolicy(2, false);
        }
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setCacheMode(2);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setBackgroundColor(0);
        addJavascriptInterface(c4462k6, "PlaidAndroid");
        setWebViewClient(new K5(c4397d4));
    }

    public final AtomicBoolean a() {
        return this.f46746e;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f46742a.f47615a = null;
        Job job = this.f46745d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event.getAction() != 0 || i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (canGoBack()) {
            goBack();
            return true;
        }
        L5 l11 = this.f46744c;
        L5 l12 = null;
        if (l11 == null) {
            p013kotlin.jvm.internal.s.B(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            l11 = null;
        }
        l11.a();
        L5 l13 = this.f46744c;
        if (l13 == null) {
            p013kotlin.jvm.internal.s.B(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        } else {
            l12 = l13;
        }
        if (p013kotlin.jvm.internal.s.f(l12, L5.a.f46429a)) {
            return super.onKeyDown(i11, event);
        }
        return true;
    }

    public final void a(String str, String str2) {
        if (str == null && str2 == null) {
            X5.a.b(X5.f46812a, "null phone number && null DOB passed to submit -- noop");
            return;
        }
        if (str == null) {
            str = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        if (str2 == null) {
            str2 = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        Job job = this.f46745d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f46745d = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(str, str2, null), 3, null);
    }
}
