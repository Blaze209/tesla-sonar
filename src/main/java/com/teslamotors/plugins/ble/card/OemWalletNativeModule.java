package com.teslamotors.plugins.ble.card;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ie0.r;
import ie0.y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.AbstractCoroutineContextElement;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import xe0.OemWalletSupportStatus;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J>\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072$\b\u0004\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u001eJ/\u0010#\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b(\u0010\u001eJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010*\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b*\u0010\u001eJ3\u00102\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/teslamotors/plugins/ble/card/OemWalletNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ActivityEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "launchWithPromise", "(Lcom/facebook/react/bridge/Promise;Lwn0/p;)V", "", "vin", "", "supported", "authorized", "cardIssued", "notSupportedReason", "Lcom/facebook/react/bridge/WritableMap;", "buildOemWalletStatus", "(Ljava/lang/String;ZZZLjava/lang/String;)Lcom/facebook/react/bridge/WritableMap;", "getName", "()Ljava/lang/String;", "authorize", "(Lcom/facebook/react/bridge/Promise;)V", "unauthorize", "getCurrentCardAuthStatus", "carType", "macAddress", "issueCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "withdrawCard", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getOemWalletStatus", "isIgnoringBatteryOptimizations", "shouldShowBatteryOptimizations", "requestIgnoringBatteryOptimizations", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", AnalyticsAttribute.Intent, "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "moduleScope", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/atomic/AtomicReference;", "activityResultPromise", "Ljava/util/concurrent/atomic/AtomicReference;", "tesla-oem-wallet_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OemWalletNativeModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private final AtomicReference<Promise> activityResultPromise;
    private final com.tesla.logging.g logger;
    private final CoroutineScope moduleScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "com/teslamotors/plugins/ble/card/OemWalletNativeModule$f"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$authorize$$inlined$launchWithPromise$1", f = "OemWalletNativeModule.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56744n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56745o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f56747q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f56748r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Promise f56749s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Promise promise, Continuation continuation, OemWalletNativeModule oemWalletNativeModule, Promise promise2) {
            super(2, continuation);
            this.f56747q = promise;
            this.f56748r = oemWalletNativeModule;
            this.f56749s = promise2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = OemWalletNativeModule.this.new a(this.f56747q, continuation, this.f56748r, this.f56749s);
            aVar.f56745o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56744n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    OemWalletProvider.Companion companion = OemWalletProvider.INSTANCE;
                    ReactApplicationContext reactApplicationContext = this.f56748r.getReactApplicationContext();
                    s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    this.f56744n = 1;
                    obj = companion.e(reactApplicationContext, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                OemWalletProvider oemWalletProvider = (OemWalletProvider) obj;
                if (oemWalletProvider == null) {
                    this.f56749s.resolve(Boxing.boxBoolean(false));
                } else {
                    ReactApplicationContext reactApplicationContext2 = this.f56748r.getReactApplicationContext();
                    s.j(reactApplicationContext2, "access$getReactApplicationContext(...)");
                    oemWalletProvider.authorize(reactApplicationContext2, new b(this.f56749s));
                }
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                OemWalletNativeModule.this.logger.d("OemWalletNativeModule coroutine failed", e12);
                this.f56747q.resolve(Boxing.boxBoolean(false));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<Object, h0> {
        b(Object obj) {
            super(1, obj, Promise.class, "resolve", "resolve(Ljava/lang/Object;)V", 0);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            invoke2(obj);
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            ((Promise) this.receiver).resolve(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "com/teslamotors/plugins/ble/card/OemWalletNativeModule$f"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$getCurrentCardAuthStatus$$inlined$launchWithPromise$1", f = "OemWalletNativeModule.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56750n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56751o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f56753q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f56754r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Promise f56755s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Promise promise, Continuation continuation, OemWalletNativeModule oemWalletNativeModule, Promise promise2) {
            super(2, continuation);
            this.f56753q = promise;
            this.f56754r = oemWalletNativeModule;
            this.f56755s = promise2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = OemWalletNativeModule.this.new c(this.f56753q, continuation, this.f56754r, this.f56755s);
            cVar.f56751o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56750n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    OemWalletProvider.Companion companion = OemWalletProvider.INSTANCE;
                    ReactApplicationContext reactApplicationContext = this.f56754r.getReactApplicationContext();
                    s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    this.f56750n = 1;
                    obj = companion.e(reactApplicationContext, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                OemWalletProvider oemWalletProvider = (OemWalletProvider) obj;
                if (oemWalletProvider == null) {
                    this.f56755s.resolve(Boxing.boxBoolean(false));
                } else {
                    Promise promise = this.f56755s;
                    ReactApplicationContext reactApplicationContext2 = this.f56754r.getReactApplicationContext();
                    s.j(reactApplicationContext2, "access$getReactApplicationContext(...)");
                    promise.resolve(Boxing.boxBoolean(oemWalletProvider.currentAuthStatus(reactApplicationContext2)));
                }
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                OemWalletNativeModule.this.logger.d("OemWalletNativeModule coroutine failed", e12);
                this.f56753q.resolve(Boxing.boxBoolean(false));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "com/teslamotors/plugins/ble/card/OemWalletNativeModule$f"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$getOemWalletStatus$$inlined$launchWithPromise$1", f = "OemWalletNativeModule.kt", i = {1, 2}, l = {48, 62, 65}, m = "invokeSuspend", n = {"supportedProvider", "authorized"}, s = {"L$0", "Z$0"})
    public static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56756n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56757o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f56759q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f56760r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Promise f56761s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f56762t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f56763u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Promise promise, Continuation continuation, OemWalletNativeModule oemWalletNativeModule, Promise promise2, String str) {
            super(2, continuation);
            this.f56759q = promise;
            this.f56760r = oemWalletNativeModule;
            this.f56761s = promise2;
            this.f56762t = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = OemWalletNativeModule.this.new d(this.f56759q, continuation, this.f56760r, this.f56761s, this.f56762t);
            dVar.f56757o = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0097 A[Catch: Exception -> 0x001b, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, Exception -> 0x001b, blocks: (B:8:0x0015, B:39:0x00bf, B:17:0x002f, B:33:0x008f, B:35:0x0097, B:40:0x00d5, B:18:0x0033, B:24:0x0052, B:26:0x0057, B:29:0x006e, B:30:0x007b, B:21:0x003e), top: B:46:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d5 A[Catch: Exception -> 0x001b, CancellationException -> 0x001f, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x001f, Exception -> 0x001b, blocks: (B:8:0x0015, B:39:0x00bf, B:17:0x002f, B:33:0x008f, B:35:0x0097, B:40:0x00d5, B:18:0x0033, B:24:0x0052, B:26:0x0057, B:29:0x006e, B:30:0x007b, B:21:0x003e), top: B:46:0x000b }] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OemWalletProvider oemWalletProvider;
            OemWalletSupportStatus oemWalletSupportStatus;
            boolean zCurrentAuthStatus;
            Object objCardIssued;
            boolean z11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56756n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    OemWalletProvider.Companion companion = OemWalletProvider.INSTANCE;
                    ReactApplicationContext reactApplicationContext = this.f56760r.getReactApplicationContext();
                    s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    this.f56756n = 1;
                    obj = companion.e(reactApplicationContext, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    t.b(obj);
                } else {
                    if (i11 == 2) {
                        oemWalletProvider = (OemWalletProvider) this.f56757o;
                        t.b(obj);
                        oemWalletSupportStatus = (OemWalletSupportStatus) obj;
                        if (oemWalletSupportStatus.getSupported()) {
                            ReactApplicationContext reactApplicationContext2 = this.f56760r.getReactApplicationContext();
                            s.j(reactApplicationContext2, "access$getReactApplicationContext(...)");
                            zCurrentAuthStatus = oemWalletProvider.currentAuthStatus(reactApplicationContext2);
                            String str = this.f56762t;
                            ReactApplicationContext reactApplicationContext3 = this.f56760r.getReactApplicationContext();
                            s.j(reactApplicationContext3, "access$getReactApplicationContext(...)");
                            this.f56757o = null;
                            this.f56763u = zCurrentAuthStatus;
                            this.f56756n = 3;
                            objCardIssued = oemWalletProvider.cardIssued(str, reactApplicationContext3, this);
                            if (objCardIssued != coroutine_suspended) {
                                z11 = zCurrentAuthStatus;
                                obj = objCardIssued;
                            }
                            return coroutine_suspended;
                        }
                        this.f56761s.resolve(this.f56760r.buildOemWalletStatus(this.f56762t, false, false, false, oemWalletSupportStatus.getNotSupportedReason()));
                        return h0.f84049a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z12 = this.f56763u;
                    t.b(obj);
                    z11 = z12;
                }
                this.f56761s.resolve(this.f56760r.buildOemWalletStatus(this.f56762t, true, z11, ((Boolean) obj).booleanValue(), null));
                return h0.f84049a;
                oemWalletProvider = (OemWalletProvider) obj;
                if (oemWalletProvider != null) {
                    ReactApplicationContext reactApplicationContext4 = this.f56760r.getReactApplicationContext();
                    s.j(reactApplicationContext4, "access$getReactApplicationContext(...)");
                    this.f56757o = oemWalletProvider;
                    this.f56756n = 2;
                    obj = oemWalletProvider.checkModelSupportWallet(reactApplicationContext4, this);
                    if (obj != coroutine_suspended) {
                        oemWalletSupportStatus = (OemWalletSupportStatus) obj;
                        if (oemWalletSupportStatus.getSupported()) {
                            ReactApplicationContext reactApplicationContext5 = this.f56760r.getReactApplicationContext();
                            s.j(reactApplicationContext5, "access$getReactApplicationContext(...)");
                            zCurrentAuthStatus = oemWalletProvider.currentAuthStatus(reactApplicationContext5);
                            String str2 = this.f56762t;
                            ReactApplicationContext reactApplicationContext6 = this.f56760r.getReactApplicationContext();
                            s.j(reactApplicationContext6, "access$getReactApplicationContext(...)");
                            this.f56757o = null;
                            this.f56763u = zCurrentAuthStatus;
                            this.f56756n = 3;
                            objCardIssued = oemWalletProvider.cardIssued(str2, reactApplicationContext6, this);
                            if (objCardIssued != coroutine_suspended) {
                                z11 = zCurrentAuthStatus;
                                obj = objCardIssued;
                                this.f56761s.resolve(this.f56760r.buildOemWalletStatus(this.f56762t, true, z11, ((Boolean) obj).booleanValue(), null));
                            }
                        } else {
                            this.f56761s.resolve(this.f56760r.buildOemWalletStatus(this.f56762t, false, false, false, oemWalletSupportStatus.getNotSupportedReason()));
                        }
                    }
                    return coroutine_suspended;
                }
                Promise promise = this.f56761s;
                OemWalletNativeModule oemWalletNativeModule = this.f56760r;
                String str3 = this.f56762t;
                OemWalletProvider.Companion companion2 = OemWalletProvider.INSTANCE;
                ReactApplicationContext reactApplicationContext7 = oemWalletNativeModule.getReactApplicationContext();
                s.j(reactApplicationContext7, "access$getReactApplicationContext(...)");
                String strD = companion2.d(reactApplicationContext7);
                if (strD == null) {
                    strD = "provider_unavailable";
                }
                promise.resolve(oemWalletNativeModule.buildOemWalletStatus(str3, false, false, false, strD));
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                OemWalletNativeModule.this.logger.d("OemWalletNativeModule coroutine failed", e12);
                this.f56759q.resolve(Boxing.boxBoolean(false));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "com/teslamotors/plugins/ble/card/OemWalletNativeModule$f"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$issueCard$$inlined$launchWithPromise$1", f = "OemWalletNativeModule.kt", i = {}, l = {48, 52}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56764n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56765o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f56767q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f56768r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Promise f56769s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f56770t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f56771u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f56772v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Promise promise, Continuation continuation, OemWalletNativeModule oemWalletNativeModule, Promise promise2, String str, String str2, String str3) {
            super(2, continuation);
            this.f56767q = promise;
            this.f56768r = oemWalletNativeModule;
            this.f56769s = promise2;
            this.f56770t = str;
            this.f56771u = str2;
            this.f56772v = str3;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = OemWalletNativeModule.this.new e(this.f56767q, continuation, this.f56768r, this.f56769s, this.f56770t, this.f56771u, this.f56772v);
            eVar.f56765o = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (r12 == r0) goto L28;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f56764n
                r2 = 0
                java.lang.String r3 = "access$getReactApplicationContext(...)"
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2c
                if (r1 == r5) goto L28
                if (r1 != r4) goto L20
                jn0.t.b(r12)     // Catch: java.lang.Exception -> L16 java.util.concurrent.CancellationException -> L1b
                r10 = r11
                goto L71
            L16:
                r0 = move-exception
                r12 = r0
                r10 = r11
                goto L8d
            L1b:
                r0 = move-exception
                r12 = r0
                r10 = r11
                goto La4
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                jn0.t.b(r12)     // Catch: java.lang.Exception -> L16 java.util.concurrent.CancellationException -> L1b
                goto L48
            L2c:
                jn0.t.b(r12)
                java.lang.Object r12 = r11.f56765o
                kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
                com.teslamotors.plugins.ble.card.OemWalletProvider$a r12 = com.teslamotors.plugins.ble.card.OemWalletProvider.INSTANCE     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                com.teslamotors.plugins.ble.card.OemWalletNativeModule r1 = r11.f56768r     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                com.facebook.react.bridge.ReactApplicationContext r1 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.access$getReactApplicationContext(r1)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                p013kotlin.jvm.internal.s.j(r1, r3)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                r11.f56764n = r5     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                java.lang.Object r12 = r12.e(r1, r11)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                if (r12 != r0) goto L48
                r10 = r11
                goto L70
            L48:
                r5 = r12
                com.teslamotors.plugins.ble.card.OemWalletProvider r5 = (com.teslamotors.plugins.ble.card.OemWalletProvider) r5     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                if (r5 != 0) goto L58
                com.facebook.react.bridge.Promise r12 = r11.f56769s     // Catch: java.lang.Exception -> L16 java.util.concurrent.CancellationException -> L1b
                java.lang.Boolean r0 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch: java.lang.Exception -> L16 java.util.concurrent.CancellationException -> L1b
                r12.resolve(r0)     // Catch: java.lang.Exception -> L16 java.util.concurrent.CancellationException -> L1b
                r10 = r11
                goto La1
            L58:
                java.lang.String r6 = r11.f56770t     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                java.lang.String r7 = r11.f56771u     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                java.lang.String r8 = r11.f56772v     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                com.teslamotors.plugins.ble.card.OemWalletNativeModule r12 = r11.f56768r     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                com.facebook.react.bridge.ReactApplicationContext r9 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.access$getReactApplicationContext(r12)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                p013kotlin.jvm.internal.s.j(r9, r3)     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                r11.f56764n = r4     // Catch: java.lang.Exception -> L87 java.util.concurrent.CancellationException -> L8a
                r10 = r11
                java.lang.Object r12 = r5.issueCard(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L84
                if (r12 != r0) goto L71
            L70:
                return r0
            L71:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L84
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L84
                com.facebook.react.bridge.Promise r0 = r10.f56769s     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L84
                java.lang.Boolean r12 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L84
                r0.resolve(r12)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L84
                goto La1
            L81:
                r0 = move-exception
            L82:
                r12 = r0
                goto L8d
            L84:
                r0 = move-exception
            L85:
                r12 = r0
                goto La4
            L87:
                r0 = move-exception
                r10 = r11
                goto L82
            L8a:
                r0 = move-exception
                r10 = r11
                goto L85
            L8d:
                com.teslamotors.plugins.ble.card.OemWalletNativeModule r0 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.this
                com.tesla.logging.g r0 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.access$getLogger$p(r0)
                java.lang.String r1 = "OemWalletNativeModule coroutine failed"
                r0.d(r1, r12)
                com.facebook.react.bridge.Promise r12 = r10.f56767q
                java.lang.Boolean r0 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                r12.resolve(r0)
            La1:
                jn0.h0 r12 = jn0.h0.f84049a
                return r12
            La4:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.ble.card.OemWalletNativeModule.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$launchWithPromise$1", f = "OemWalletNativeModule.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56773n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56774o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<CoroutineScope, Continuation<? super h0>, Object> f56775p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f56776q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Promise f56777r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, OemWalletNativeModule oemWalletNativeModule, Promise promise, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f56775p = pVar;
            this.f56776q = oemWalletNativeModule;
            this.f56777r = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f56775p, this.f56776q, this.f56777r, continuation);
            fVar.f56774o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56773n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f56774o;
                    p<CoroutineScope, Continuation<? super h0>, Object> pVar = this.f56775p;
                    this.f56773n = 1;
                    if (pVar.invoke(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                this.f56776q.logger.d("OemWalletNativeModule coroutine failed", e12);
                this.f56777r.resolve(Boxing.boxBoolean(false));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "com/teslamotors/plugins/ble/card/OemWalletNativeModule$f"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$requestIgnoringBatteryOptimizations$$inlined$launchWithPromise$1", f = "OemWalletNativeModule.kt", i = {}, l = {48, 53}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56778n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56779o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f56781q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f56782r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Promise f56783s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Promise promise, Continuation continuation, OemWalletNativeModule oemWalletNativeModule, Promise promise2) {
            super(2, continuation);
            this.f56781q = promise;
            this.f56782r = oemWalletNativeModule;
            this.f56783s = promise2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = OemWalletNativeModule.this.new g(this.f56781q, continuation, this.f56782r, this.f56783s);
            gVar.f56779o = obj;
            return gVar;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0064 A[Catch: Exception -> 0x0014, CancellationException -> 0x0016, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0016, Exception -> 0x0014, blocks: (B:6:0x000f, B:14:0x0021, B:20:0x0042, B:22:0x0046, B:24:0x004e, B:26:0x0054, B:28:0x005a, B:29:0x0064, B:17:0x002c), top: B:36:0x0009 }] */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7) == r0) goto L31;
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
                int r1 = r7.f56778n
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                jn0.t.b(r8)     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                goto L8f
            L14:
                r8 = move-exception
                goto L7b
            L16:
                r8 = move-exception
                goto L92
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                jn0.t.b(r8)     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                goto L42
            L25:
                jn0.t.b(r8)
                java.lang.Object r8 = r7.f56779o
                kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
                com.teslamotors.plugins.ble.card.OemWalletProvider$a r8 = com.teslamotors.plugins.ble.card.OemWalletProvider.INSTANCE     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                com.teslamotors.plugins.ble.card.OemWalletNativeModule r1 = r7.f56782r     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                com.facebook.react.bridge.ReactApplicationContext r1 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.access$getReactApplicationContext(r1)     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                java.lang.String r5 = "access$getReactApplicationContext(...)"
                p013kotlin.jvm.internal.s.j(r1, r5)     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                r7.f56778n = r4     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                java.lang.Object r8 = r8.e(r1, r7)     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                if (r8 != r0) goto L42
                goto L7a
            L42:
                com.teslamotors.plugins.ble.card.OemWalletProvider r8 = (com.teslamotors.plugins.ble.card.OemWalletProvider) r8     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                if (r8 != 0) goto L64
                ie0.y r8 = ie0.y.f77624a     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                boolean r1 = r8.b()     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                if (r1 != 0) goto L64
                boolean r1 = r8.h()     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                if (r1 != 0) goto L64
                boolean r8 = r8.d()     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                if (r8 != 0) goto L64
                com.facebook.react.bridge.Promise r8 = r7.f56783s     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                java.lang.Boolean r0 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                r8.resolve(r0)     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                goto L8f
            L64:
                kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                com.teslamotors.plugins.ble.card.OemWalletNativeModule$h r1 = new com.teslamotors.plugins.ble.card.OemWalletNativeModule$h     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                com.teslamotors.plugins.ble.card.OemWalletNativeModule r4 = r7.f56782r     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                com.facebook.react.bridge.Promise r5 = r7.f56783s     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                r6 = 0
                r1.<init>(r5, r6)     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                r7.f56778n = r3     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)     // Catch: java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16
                if (r8 != r0) goto L8f
            L7a:
                return r0
            L7b:
                com.teslamotors.plugins.ble.card.OemWalletNativeModule r0 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.this
                com.tesla.logging.g r0 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.access$getLogger$p(r0)
                java.lang.String r1 = "OemWalletNativeModule coroutine failed"
                r0.d(r1, r8)
                com.facebook.react.bridge.Promise r8 = r7.f56781q
                java.lang.Boolean r0 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                r8.resolve(r0)
            L8f:
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            L92:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.ble.card.OemWalletNativeModule.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$requestIgnoringBatteryOptimizations$1$1", f = "OemWalletNativeModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56784n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56785o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f56787q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Promise promise, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f56787q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            h hVar = OemWalletNativeModule.this.new h(this.f56787q, continuation);
            hVar.f56785o = obj;
            return hVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56784n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Activity currentActivity = OemWalletNativeModule.this.getReactApplicationContext().getCurrentActivity();
            if (currentActivity == null) {
                this.f56787q.resolve(Boxing.boxBoolean(false));
                return h0.f84049a;
            }
            try {
                OemWalletNativeModule.this.activityResultPromise.set(this.f56787q);
                ie0.h.f77583a.a(currentActivity);
                return h0.f84049a;
            } catch (Exception e11) {
                androidx.camera.view.i.a(OemWalletNativeModule.this.activityResultPromise, this.f56787q, null);
                throw e11;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "com/teslamotors/plugins/ble/card/OemWalletNativeModule$f"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$shouldShowBatteryOptimizations$$inlined$launchWithPromise$1", f = "OemWalletNativeModule.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56788n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56789o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f56791q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f56792r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Promise f56793s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Promise promise, Continuation continuation, OemWalletNativeModule oemWalletNativeModule, Promise promise2) {
            super(2, continuation);
            this.f56791q = promise;
            this.f56792r = oemWalletNativeModule;
            this.f56793s = promise2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            i iVar = OemWalletNativeModule.this.new i(this.f56791q, continuation, this.f56792r, this.f56793s);
            iVar.f56789o = obj;
            return iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56788n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    OemWalletProvider.Companion companion = OemWalletProvider.INSTANCE;
                    ReactApplicationContext reactApplicationContext = this.f56792r.getReactApplicationContext();
                    s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    this.f56788n = 1;
                    obj = companion.e(reactApplicationContext, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                OemWalletProvider oemWalletProvider = (OemWalletProvider) obj;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                if (Build.VERSION.SDK_INT < 31 || oemWalletProvider == null || !s.f(oemWalletProvider.getVendor(), com.teslamotors.plugins.ble.card.a.INSTANCE.a())) {
                    y yVar = y.f77624a;
                    if ((!yVar.h() || r.a()) && !yVar.d()) {
                        writableNativeMap.putBoolean("shouldShow", false);
                        writableNativeMap.putBoolean("canDismiss", false);
                    } else {
                        writableNativeMap.putBoolean("shouldShow", true);
                        writableNativeMap.putBoolean("canDismiss", true);
                    }
                } else {
                    writableNativeMap.putBoolean("shouldShow", true);
                    writableNativeMap.putBoolean("canDismiss", false);
                }
                this.f56793s.resolve(writableNativeMap);
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                OemWalletNativeModule.this.logger.d("OemWalletNativeModule coroutine failed", e12);
                this.f56791q.resolve(Boxing.boxBoolean(false));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "Ljn0/h0;", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f56794b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(CoroutineExceptionHandler.Companion companion, OemWalletNativeModule oemWalletNativeModule) {
            super(companion);
            this.f56794b = oemWalletNativeModule;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            this.f56794b.logger.d("OemWalletNativeModule coroutine failed", exception);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "com/teslamotors/plugins/ble/card/OemWalletNativeModule$f"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$unauthorize$$inlined$launchWithPromise$1", f = "OemWalletNativeModule.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56795n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56796o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f56798q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f56799r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Promise f56800s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Promise promise, Continuation continuation, OemWalletNativeModule oemWalletNativeModule, Promise promise2) {
            super(2, continuation);
            this.f56798q = promise;
            this.f56799r = oemWalletNativeModule;
            this.f56800s = promise2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            k kVar = OemWalletNativeModule.this.new k(this.f56798q, continuation, this.f56799r, this.f56800s);
            kVar.f56796o = obj;
            return kVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56795n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    OemWalletProvider.Companion companion = OemWalletProvider.INSTANCE;
                    ReactApplicationContext reactApplicationContext = this.f56799r.getReactApplicationContext();
                    s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    this.f56795n = 1;
                    obj = companion.e(reactApplicationContext, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                OemWalletProvider oemWalletProvider = (OemWalletProvider) obj;
                if (oemWalletProvider == null) {
                    this.f56800s.resolve(Boxing.boxBoolean(false));
                } else {
                    ReactApplicationContext reactApplicationContext2 = this.f56799r.getReactApplicationContext();
                    s.j(reactApplicationContext2, "access$getReactApplicationContext(...)");
                    oemWalletProvider.unauthorize(reactApplicationContext2);
                    this.f56800s.resolve(Boxing.boxBoolean(true));
                }
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                OemWalletNativeModule.this.logger.d("OemWalletNativeModule coroutine failed", e12);
                this.f56798q.resolve(Boxing.boxBoolean(false));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V", "com/teslamotors/plugins/ble/card/OemWalletNativeModule$f"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$withdrawCard$$inlined$launchWithPromise$1", f = "OemWalletNativeModule.kt", i = {}, l = {48, 52}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56801n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56802o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f56804q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f56805r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Promise f56806s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f56807t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Promise promise, Continuation continuation, OemWalletNativeModule oemWalletNativeModule, Promise promise2, String str) {
            super(2, continuation);
            this.f56804q = promise;
            this.f56805r = oemWalletNativeModule;
            this.f56806s = promise2;
            this.f56807t = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            l lVar = OemWalletNativeModule.this.new l(this.f56804q, continuation, this.f56805r, this.f56806s, this.f56807t);
            lVar.f56802o = obj;
            return lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        
            if (r7 == r0) goto L25;
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
                int r1 = r6.f56801n
                r2 = 0
                java.lang.String r3 = "access$getReactApplicationContext(...)"
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                jn0.t.b(r7)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                goto L62
            L15:
                r7 = move-exception
                goto L72
            L17:
                r7 = move-exception
                goto L89
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                jn0.t.b(r7)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                goto L40
            L25:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f56802o
                kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
                com.teslamotors.plugins.ble.card.OemWalletProvider$a r7 = com.teslamotors.plugins.ble.card.OemWalletProvider.INSTANCE     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                com.teslamotors.plugins.ble.card.OemWalletNativeModule r1 = r6.f56805r     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                com.facebook.react.bridge.ReactApplicationContext r1 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.access$getReactApplicationContext(r1)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                p013kotlin.jvm.internal.s.j(r1, r3)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                r6.f56801n = r5     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                java.lang.Object r7 = r7.e(r1, r6)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                if (r7 != r0) goto L40
                goto L61
            L40:
                com.teslamotors.plugins.ble.card.OemWalletProvider r7 = (com.teslamotors.plugins.ble.card.OemWalletProvider) r7     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                if (r7 != 0) goto L4e
                com.facebook.react.bridge.Promise r7 = r6.f56806s     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                java.lang.Boolean r0 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                r7.resolve(r0)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                goto L86
            L4e:
                java.lang.String r1 = r6.f56807t     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                com.teslamotors.plugins.ble.card.OemWalletNativeModule r5 = r6.f56805r     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                com.facebook.react.bridge.ReactApplicationContext r5 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.access$getReactApplicationContext(r5)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                p013kotlin.jvm.internal.s.j(r5, r3)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                r6.f56801n = r4     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                java.lang.Object r7 = r7.withdrawCard(r1, r5, r6)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                if (r7 != r0) goto L62
            L61:
                return r0
            L62:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                com.facebook.react.bridge.Promise r0 = r6.f56806s     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                java.lang.Boolean r7 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                r0.resolve(r7)     // Catch: java.lang.Exception -> L15 java.util.concurrent.CancellationException -> L17
                goto L86
            L72:
                com.teslamotors.plugins.ble.card.OemWalletNativeModule r0 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.this
                com.tesla.logging.g r0 = com.teslamotors.plugins.ble.card.OemWalletNativeModule.access$getLogger$p(r0)
                java.lang.String r1 = "OemWalletNativeModule coroutine failed"
                r0.d(r1, r7)
                com.facebook.react.bridge.Promise r7 = r6.f56804q
                java.lang.Boolean r0 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                r7.resolve(r0)
            L86:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            L89:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.ble.card.OemWalletNativeModule.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OemWalletNativeModule(ReactApplicationContext context) {
        super(context);
        s.k(context, "context");
        this.logger = com.tesla.logging.g.INSTANCE.a("OemWalletNativeModule");
        getReactApplicationContext().addActivityEventListener(this);
        this.moduleScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new j(CoroutineExceptionHandler.INSTANCE, this)));
        this.activityResultPromise = new AtomicReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableMap buildOemWalletStatus(String vin, boolean supported, boolean authorized, boolean cardIssued, String notSupportedReason) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("is_oem_wallet_supported", supported);
        writableNativeMap.putBoolean("is_oem_wallet_authorized", authorized);
        writableNativeMap.putBoolean("is_oem_wallet_card_issued", cardIssued);
        if (notSupportedReason != null) {
            writableNativeMap.putString("oem_wallet_not_supported_reason", notSupportedReason);
        } else {
            writableNativeMap.putNull("oem_wallet_not_supported_reason");
        }
        writableNativeMap.putString("vin", vin);
        return writableNativeMap;
    }

    private final void launchWithPromise(Promise promise, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> block) {
        BuildersKt__Builders_commonKt.launch$default(this.moduleScope, null, null, new f(block, this, promise, null), 3, null);
    }

    @ReactMethod
    public final void authorize(Promise promise) {
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.moduleScope, null, null, new a(promise, null, this, promise), 3, null);
    }

    @ReactMethod
    public final void getCurrentCardAuthStatus(Promise promise) {
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.moduleScope, null, null, new c(promise, null, this, promise), 3, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "OemWalletNativeModule";
    }

    @ReactMethod
    public final void getOemWalletStatus(String vin, Promise promise) {
        s.k(vin, "vin");
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.moduleScope, null, null, new d(promise, null, this, promise, vin), 3, null);
    }

    @ReactMethod
    public final void isIgnoringBatteryOptimizations(Promise promise) {
        s.k(promise, "promise");
        ie0.h hVar = ie0.h.f77583a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        promise.resolve(Boolean.valueOf(hVar.b(reactApplicationContext)));
    }

    @ReactMethod
    public final void issueCard(String vin, String carType, String macAddress, Promise promise) {
        s.k(vin, "vin");
        s.k(carType, "carType");
        s.k(macAddress, "macAddress");
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.moduleScope, null, null, new e(promise, null, this, promise, vin, carType, macAddress), 3, null);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        Promise andSet;
        ie0.h hVar = ie0.h.f77583a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        boolean zB = hVar.b(reactApplicationContext);
        if ((requestCode == 1688 || requestCode == 8816) && (andSet = this.activityResultPromise.getAndSet(null)) != null) {
            andSet.resolve(Boolean.valueOf(zB));
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public final void requestIgnoringBatteryOptimizations(Promise promise) {
        s.k(promise, "promise");
        Promise andSet = this.activityResultPromise.getAndSet(null);
        if (andSet != null) {
            andSet.resolve(Boolean.FALSE);
        }
        BuildersKt__Builders_commonKt.launch$default(this.moduleScope, null, null, new g(promise, null, this, promise), 3, null);
    }

    @ReactMethod
    public final void shouldShowBatteryOptimizations(Promise promise) {
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.moduleScope, null, null, new i(promise, null, this, promise), 3, null);
    }

    @ReactMethod
    public final void unauthorize(Promise promise) {
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.moduleScope, null, null, new k(promise, null, this, promise), 3, null);
    }

    @ReactMethod
    public final void withdrawCard(String vin, Promise promise) {
        s.k(vin, "vin");
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.moduleScope, null, null, new l(promise, null, this, promise, vin), 3, null);
    }
}
