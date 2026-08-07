package r10;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.content.StripeSdkModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.a1;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.CompletableDeferred;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u001a\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u001a\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001d\u0010\u001cJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096@¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0015H\u0096@¢\u0006\u0004\b\"\u0010\u0019J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0096@¢\u0006\u0004\b#\u0010\u0019J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020$H\u0096A¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R0\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b-\u00101\"\u0004\b2\u00103R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b+\u00101\"\u0004\b6\u00103R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00100\u001a\u0004\b,\u00101\"\u0004\b9\u00103R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u00100\u001a\u0004\b5\u00101\"\u0004\b<\u00103R,\u0010@\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u00100\u001a\u0004\b/\u00101\"\u0004\b?\u00103R*\u0010C\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u00100\u001a\u0004\b8\u00101\"\u0004\bB\u00103R\u0014\u0010E\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010DR\u001c\u0010H\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lr10/a;", "Lcom/stripe/android/customersheet/b;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "adapter", "", "overridesFetchPaymentMethods", "overridesAttachPaymentMethod", "overridesDetachPaymentMethod", "overridesSetSelectedPaymentOption", "overridesFetchSelectedPaymentOption", "overridesSetupIntentClientSecretForCustomerAttach", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/stripe/android/customersheet/b;ZZZZZZ)V", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "Ljn0/h0;", "f", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/stripe/android/customersheet/b$c;", "", "Lcom/stripe/android/model/v0;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentMethodId", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/stripe/android/customersheet/b$b;", "paymentOption", "u", "(Lcom/stripe/android/customersheet/b$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "w", "Lcom/stripe/android/model/a1;", "e", "(Ljava/lang/String;Lcom/stripe/android/model/a1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "c", "Lcom/stripe/android/customersheet/b;", "Z", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CompletableDeferred;", "j", "Lkotlinx/coroutines/CompletableDeferred;", "()Lkotlinx/coroutines/CompletableDeferred;", "setFetchPaymentMethodsCallback$stripe_stripe_react_native_release", "(Lkotlinx/coroutines/CompletableDeferred;)V", "fetchPaymentMethodsCallback", "k", "setAttachPaymentMethodCallback$stripe_stripe_react_native_release", "attachPaymentMethodCallback", "l", "setDetachPaymentMethodCallback$stripe_stripe_react_native_release", "detachPaymentMethodCallback", "m", "setSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release", "setSelectedPaymentOptionCallback", "n", "setFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release", "fetchSelectedPaymentOptionCallback", "o", "setSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release", "setupIntentClientSecretForCustomerAttachCallback", "()Z", "canCreateSetupIntents", "t", "()Ljava/util/List;", "paymentMethodTypes", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements com.stripe.android.customersheet.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.customersheet.b adapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean overridesFetchPaymentMethods;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean overridesAttachPaymentMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean overridesDetachPaymentMethod;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean overridesSetSelectedPaymentOption;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean overridesFetchSelectedPaymentOption;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean overridesSetupIntentClientSecretForCustomerAttach;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private CompletableDeferred<List<PaymentMethod>> fetchPaymentMethodsCallback;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private CompletableDeferred<PaymentMethod> attachPaymentMethodCallback;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private CompletableDeferred<PaymentMethod> detachPaymentMethodCallback;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private CompletableDeferred<h0> setSelectedPaymentOptionCallback;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private CompletableDeferred<String> fetchSelectedPaymentOptionCallback;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private CompletableDeferred<String> setupIntentClientSecretForCustomerAttachCallback;

    /* JADX INFO: renamed from: r10.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.customersheet.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {51, 56}, m = "attachPaymentMethod", n = {}, s = {})
    static final class C2262a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f106448n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f106450p;

        C2262a(Continuation<? super C2262a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106448n = obj;
            this.f106450p |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.customersheet.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {67, 72}, m = "detachPaymentMethod", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f106451n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f106453p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106451n = obj;
            this.f106453p |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.customersheet.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {35, 40}, m = "retrievePaymentMethods", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f106454n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f106456p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106454n = obj;
            this.f106456p |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.customersheet.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {96, 107}, m = "retrieveSelectedPaymentOption", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f106457n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f106459p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106457n = obj;
            this.f106459p |= Integer.MIN_VALUE;
            return a.this.v(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.customersheet.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {83, 88}, m = "setSelectedPaymentOption", n = {}, s = {})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f106460n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f106462p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106460n = obj;
            this.f106462p |= Integer.MIN_VALUE;
            return a.this.u(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.customersheet.ReactNativeCustomerAdapter", f = "ReactNativeCustomerAdapter.kt", i = {}, l = {115, 120}, m = "setupIntentClientSecretForCustomerAttach", n = {}, s = {})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f106463n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f106465p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106463n = obj;
            this.f106465p |= Integer.MIN_VALUE;
            return a.this.w(this);
        }
    }

    public a(ReactApplicationContext context, com.stripe.android.customersheet.b adapter, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        s.k(context, "context");
        s.k(adapter, "adapter");
        this.context = context;
        this.adapter = adapter;
        this.overridesFetchPaymentMethods = z11;
        this.overridesAttachPaymentMethod = z12;
        this.overridesDetachPaymentMethod = z13;
        this.overridesSetSelectedPaymentOption = z14;
        this.overridesFetchSelectedPaymentOption = z15;
        this.overridesSetupIntentClientSecretForCustomerAttach = z16;
    }

    private final void f(String eventName, WritableMap params) {
        StripeSdkModule stripeSdkModule = (StripeSdkModule) this.context.getNativeModule(StripeSdkModule.class);
        if (stripeSdkModule == null || stripeSdkModule.getEventListenerCount() == 0) {
            Log.e("StripeReactNative", "Tried to call " + eventName + ", but no callback was found. Please file an issue: https://github.com/stripe/stripe-react-native/issues");
        }
        if (stripeSdkModule != null) {
            stripeSdkModule.sendEvent$stripe_stripe_react_native_release(this.context, eventName, params);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r6 == r1) goto L26;
     */
    @Override // com.stripe.android.customersheet.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p013kotlin.coroutines.Continuation<? super com.stripe.android.customersheet.b.c<java.util.List<com.stripe.android.model.PaymentMethod>>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof r10.a.c
            if (r0 == 0) goto L13
            r0 = r6
            r10.a$c r0 = (r10.a.c) r0
            int r1 = r0.f106456p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106456p = r1
            goto L18
        L13:
            r10.a$c r0 = new r10.a$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f106454n
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f106456p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            jn0.t.b(r6)
            goto L5d
        L38:
            jn0.t.b(r6)
            boolean r6 = r5.overridesFetchPaymentMethods
            if (r6 == 0) goto L66
            r6 = 0
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r6, r4, r6)
            r5.fetchPaymentMethodsCallback = r6
            com.facebook.react.bridge.WritableMap r2 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r3 = "createMap(...)"
            p013kotlin.jvm.internal.s.j(r2, r3)
            java.lang.String r3 = "onCustomerAdapterFetchPaymentMethodsCallback"
            r5.f(r3, r2)
            r0.f106456p = r4
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L5d
            goto L70
        L5d:
            java.util.List r6 = (java.util.List) r6
            com.stripe.android.customersheet.b$c$a r0 = com.stripe.android.customersheet.b.c.INSTANCE
            com.stripe.android.customersheet.b$c r6 = r0.b(r6)
            return r6
        L66:
            com.stripe.android.customersheet.b r6 = r5.adapter
            r0.f106456p = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L71
        L70:
            return r1
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.a.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r7 == r1) goto L26;
     */
    @Override // com.stripe.android.customersheet.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r6, p013kotlin.coroutines.Continuation<? super com.stripe.android.customersheet.b.c<com.stripe.android.model.PaymentMethod>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof r10.a.b
            if (r0 == 0) goto L13
            r0 = r7
            r10.a$b r0 = (r10.a.b) r0
            int r1 = r0.f106453p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106453p = r1
            goto L18
        L13:
            r10.a$b r0 = new r10.a$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f106451n
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f106453p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            jn0.t.b(r7)
            goto L60
        L38:
            jn0.t.b(r7)
            boolean r7 = r5.overridesDetachPaymentMethod
            if (r7 == 0) goto L69
            r7 = 0
            kotlinx.coroutines.CompletableDeferred r7 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r7, r4, r7)
            r5.detachPaymentMethodCallback = r7
            com.facebook.react.bridge.WritableMap r2 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r3 = "paymentMethodId"
            r2.putString(r3, r6)
            p013kotlin.jvm.internal.s.h(r2)
            java.lang.String r6 = "onCustomerAdapterDetachPaymentMethodCallback"
            r5.f(r6, r2)
            r0.f106453p = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L60
            goto L73
        L60:
            com.stripe.android.model.v0 r7 = (com.stripe.android.model.PaymentMethod) r7
            com.stripe.android.customersheet.b$c$a r6 = com.stripe.android.customersheet.b.c.INSTANCE
            com.stripe.android.customersheet.b$c r6 = r6.b(r7)
            return r6
        L69:
            com.stripe.android.customersheet.b r7 = r5.adapter
            r0.f106453p = r3
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L74
        L73:
            return r1
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.a.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.stripe.android.customersheet.b
    public boolean c() {
        return this.adapter.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r7 == r1) goto L26;
     */
    @Override // com.stripe.android.customersheet.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r6, p013kotlin.coroutines.Continuation<? super com.stripe.android.customersheet.b.c<com.stripe.android.model.PaymentMethod>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof r10.a.C2262a
            if (r0 == 0) goto L13
            r0 = r7
            r10.a$a r0 = (r10.a.C2262a) r0
            int r1 = r0.f106450p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106450p = r1
            goto L18
        L13:
            r10.a$a r0 = new r10.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f106448n
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f106450p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            jn0.t.b(r7)
            goto L60
        L38:
            jn0.t.b(r7)
            boolean r7 = r5.overridesAttachPaymentMethod
            if (r7 == 0) goto L69
            r7 = 0
            kotlinx.coroutines.CompletableDeferred r7 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r7, r4, r7)
            r5.attachPaymentMethodCallback = r7
            com.facebook.react.bridge.WritableMap r2 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r3 = "paymentMethodId"
            r2.putString(r3, r6)
            p013kotlin.jvm.internal.s.h(r2)
            java.lang.String r6 = "onCustomerAdapterAttachPaymentMethodCallback"
            r5.f(r6, r2)
            r0.f106450p = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L60
            goto L73
        L60:
            com.stripe.android.model.v0 r7 = (com.stripe.android.model.PaymentMethod) r7
            com.stripe.android.customersheet.b$c$a r6 = com.stripe.android.customersheet.b.c.INSTANCE
            com.stripe.android.customersheet.b$c r6 = r6.b(r7)
            return r6
        L69:
            com.stripe.android.customersheet.b r7 = r5.adapter
            r0.f106450p = r3
            java.lang.Object r6 = r7.d(r6, r0)
            if (r6 != r1) goto L74
        L73:
            return r1
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.a.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.stripe.android.customersheet.b
    public Object e(String str, a1 a1Var, Continuation<? super com.stripe.android.customersheet.b.c<PaymentMethod>> continuation) {
        return this.adapter.e(str, a1Var, continuation);
    }

    public final CompletableDeferred<PaymentMethod> g() {
        return this.attachPaymentMethodCallback;
    }

    public final CompletableDeferred<PaymentMethod> h() {
        return this.detachPaymentMethodCallback;
    }

    public final CompletableDeferred<List<PaymentMethod>> i() {
        return this.fetchPaymentMethodsCallback;
    }

    public final CompletableDeferred<String> j() {
        return this.fetchSelectedPaymentOptionCallback;
    }

    public final CompletableDeferred<h0> k() {
        return this.setSelectedPaymentOptionCallback;
    }

    public final CompletableDeferred<String> l() {
        return this.setupIntentClientSecretForCustomerAttachCallback;
    }

    @Override // com.stripe.android.customersheet.b
    public List<String> t() {
        return this.adapter.t();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r2.await(r0) == r1) goto L29;
     */
    @Override // com.stripe.android.customersheet.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(com.stripe.android.customersheet.b.AbstractC0802b r6, p013kotlin.coroutines.Continuation<? super com.stripe.android.customersheet.b.c<jn0.h0>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof r10.a.e
            if (r0 == 0) goto L13
            r0 = r7
            r10.a$e r0 = (r10.a.e) r0
            int r1 = r0.f106462p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106462p = r1
            goto L18
        L13:
            r10.a$e r0 = new r10.a$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f106460n
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f106462p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            jn0.t.b(r7)
            goto L66
        L38:
            jn0.t.b(r7)
            boolean r7 = r5.overridesSetSelectedPaymentOption
            if (r7 == 0) goto L6f
            r7 = 0
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r7, r4, r7)
            r5.setSelectedPaymentOptionCallback = r2
            com.facebook.react.bridge.WritableMap r3 = com.facebook.react.bridge.Arguments.createMap()
            if (r6 == 0) goto L50
            java.lang.String r7 = r6.getId()
        L50:
            java.lang.String r6 = "paymentOption"
            r3.putString(r6, r7)
            p013kotlin.jvm.internal.s.h(r3)
            java.lang.String r6 = "onCustomerAdapterSetSelectedPaymentOptionCallback"
            r5.f(r6, r3)
            r0.f106462p = r4
            java.lang.Object r6 = r2.await(r0)
            if (r6 != r1) goto L66
            goto L79
        L66:
            jn0.h0 r6 = jn0.h0.f84049a
            com.stripe.android.customersheet.b$c$a r7 = com.stripe.android.customersheet.b.c.INSTANCE
            com.stripe.android.customersheet.b$c r6 = r7.b(r6)
            return r6
        L6f:
            com.stripe.android.customersheet.b r7 = r5.adapter
            r0.f106462p = r3
            java.lang.Object r6 = r7.u(r6, r0)
            if (r6 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.a.u(com.stripe.android.customersheet.b$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r7 == r1) goto L29;
     */
    @Override // com.stripe.android.customersheet.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(p013kotlin.coroutines.Continuation<? super com.stripe.android.customersheet.b.c<com.stripe.android.customersheet.b.AbstractC0802b>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof r10.a.d
            if (r0 == 0) goto L13
            r0 = r7
            r10.a$d r0 = (r10.a.d) r0
            int r1 = r0.f106459p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106459p = r1
            goto L18
        L13:
            r10.a$d r0 = new r10.a$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f106457n
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f106459p
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            jn0.t.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            jn0.t.b(r7)
            goto L5d
        L39:
            jn0.t.b(r7)
            boolean r7 = r6.overridesFetchSelectedPaymentOption
            if (r7 == 0) goto L6e
            kotlinx.coroutines.CompletableDeferred r7 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r4, r5, r4)
            r6.fetchSelectedPaymentOptionCallback = r7
            com.facebook.react.bridge.WritableMap r2 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r3 = "createMap(...)"
            p013kotlin.jvm.internal.s.j(r2, r3)
            java.lang.String r3 = "onCustomerAdapterFetchSelectedPaymentOptionCallback"
            r6.f(r3, r2)
            r0.f106459p = r5
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L5d
            goto L78
        L5d:
            java.lang.String r7 = (java.lang.String) r7
            com.stripe.android.customersheet.b$c$a r0 = com.stripe.android.customersheet.b.c.INSTANCE
            if (r7 == 0) goto L69
            com.stripe.android.customersheet.b$b$a r1 = com.stripe.android.customersheet.b.AbstractC0802b.INSTANCE
            com.stripe.android.customersheet.b$b r4 = r1.a(r7)
        L69:
            com.stripe.android.customersheet.b$c r7 = r0.b(r4)
            return r7
        L6e:
            com.stripe.android.customersheet.b r7 = r6.adapter
            r0.f106459p = r3
            java.lang.Object r7 = r7.v(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.a.v(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r6 == r1) goto L26;
     */
    @Override // com.stripe.android.customersheet.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(p013kotlin.coroutines.Continuation<? super com.stripe.android.customersheet.b.c<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof r10.a.f
            if (r0 == 0) goto L13
            r0 = r6
            r10.a$f r0 = (r10.a.f) r0
            int r1 = r0.f106465p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106465p = r1
            goto L18
        L13:
            r10.a$f r0 = new r10.a$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f106463n
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f106465p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            jn0.t.b(r6)
            goto L5d
        L38:
            jn0.t.b(r6)
            boolean r6 = r5.overridesSetupIntentClientSecretForCustomerAttach
            if (r6 == 0) goto L66
            r6 = 0
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r6, r4, r6)
            r5.setupIntentClientSecretForCustomerAttachCallback = r6
            com.facebook.react.bridge.WritableMap r2 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r3 = "createMap(...)"
            p013kotlin.jvm.internal.s.j(r2, r3)
            java.lang.String r3 = "onCustomerAdapterSetupIntentClientSecretForCustomerAttachCallback"
            r5.f(r3, r2)
            r0.f106465p = r4
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L5d
            goto L70
        L5d:
            java.lang.String r6 = (java.lang.String) r6
            com.stripe.android.customersheet.b$c$a r0 = com.stripe.android.customersheet.b.c.INSTANCE
            com.stripe.android.customersheet.b$c r6 = r0.b(r6)
            return r6
        L66:
            com.stripe.android.customersheet.b r6 = r5.adapter
            r0.f106465p = r3
            java.lang.Object r6 = r6.w(r0)
            if (r6 != r1) goto L71
        L70:
            return r1
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.a.w(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
