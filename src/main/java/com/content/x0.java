package com.content;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.content.utils.PaymentSheetException;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.b0;
import com.stripe.android.paymentsheet.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import s10.d;
import s10.e;
import s10.g;
import s10.i;
import s10.j;
import w70.PaymentOption;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    jadx.core.utils.exceptions.JadxRuntimeException: CodeVar not initialized for name set in SSAVar: r28v0 ??
    	at jadx.core.dex.instructions.args.SSAVar.setName(SSAVar.java:216)
    	at jadx.core.dex.instructions.args.RegisterArg.setName(RegisterArg.java:111)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.renameMethodArgs(KotlinMetadataDecompilePass.kt:54)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:34)
    */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 I2\u00020\u0001:\u0001JB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00100R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010&R\u0018\u0010=\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010&R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R(\u0010H\u001a\b\u0012\u0004\u0012\u00020C0B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b#\u0010F\"\u0004\b:\u0010G¨\u0006K"}, d2 = {"Lcom/reactnativestripesdk/x0;", "Landroidx/fragment/app/Fragment;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/bridge/Promise;", "initPromise", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/bridge/Promise;)V", "Ljn0/h0;", "j", "()V", "Lcom/facebook/react/bridge/WritableMap;", "map", "t", "(Lcom/facebook/react/bridge/WritableMap;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", BaseJavaModule.METHOD_TYPE_PROMISE, "q", "(Lcom/facebook/react/bridge/Promise;)V", "", "timeout", "r", "(JLcom/facebook/react/bridge/Promise;)V", "l", "m", "Lcom/facebook/react/bridge/ReactApplicationContext;", "n", "Lcom/facebook/react/bridge/Promise;", "Lcom/stripe/android/paymentsheet/y;", "o", "Lcom/stripe/android/paymentsheet/y;", "paymentSheet", "Lcom/stripe/android/paymentsheet/y$k;", "p", "Lcom/stripe/android/paymentsheet/y$k;", "flowController", "", "Ljava/lang/String;", "paymentIntentClientSecret", "setupIntentClientSecret", "Lcom/stripe/android/paymentsheet/y$n;", "s", "Lcom/stripe/android/paymentsheet/y$n;", "intentConfiguration", "Lcom/stripe/android/paymentsheet/y$h;", "Lcom/stripe/android/paymentsheet/y$h;", "paymentSheetConfiguration", "u", "confirmPromise", "v", "presentPromise", "", "w", "Z", "paymentSheetTimedOut", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/facebook/react/bridge/ReadableMap;", "x", "Lkotlinx/coroutines/CompletableDeferred;", "()Lkotlinx/coroutines/CompletableDeferred;", "(Lkotlinx/coroutines/CompletableDeferred;)V", "paymentSheetIntentCreationCallback", "y", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x0 extends Fragment {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f48938y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Map<Integer, y.GooglePayConfiguration.a> f48939z = v0.m(x.a(1, y.GooglePayConfiguration.a.Buy), x.a(6, y.GooglePayConfiguration.a.Book), x.a(5, y.GooglePayConfiguration.a.Checkout), x.a(4, y.GooglePayConfiguration.a.Donate), x.a(11, y.GooglePayConfiguration.a.Order), x.a(1000, y.GooglePayConfiguration.a.Pay), x.a(7, y.GooglePayConfiguration.a.Subscribe), x.a(1001, y.GooglePayConfiguration.a.Plain));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ReactApplicationContext f48940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Promise f48941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private y f48942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private y.k f48943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f48944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f48945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y.n f48946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private y.Configuration f48947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Promise f48948u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Promise f48949v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f48950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CompletableDeferred<ReadableMap> f48951x;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/reactnativestripesdk/x0$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "intentConfigurationParams", "Lcom/stripe/android/paymentsheet/y$n;", "e", "(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/y$n;", "modeParams", "Lcom/stripe/android/paymentsheet/y$n$d;", "f", "(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/y$n$d;", "bundle", "Lcom/stripe/android/paymentsheet/y$j;", "c", "(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/y$j;", "Lcom/facebook/react/bridge/WritableMap;", "g", "()Lcom/facebook/react/bridge/WritableMap;", "params", "Lcom/stripe/android/paymentsheet/y$l;", DateTokenConverter.CONVERTER_KEY, "(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/y$l;", "", "TAG", "Ljava/lang/String;", "", "", "Lcom/stripe/android/paymentsheet/y$l$a;", "mapIntToButtonType", "Ljava/util/Map;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ y.CustomerConfiguration a(a aVar, Bundle bundle) {
            return aVar.c(bundle);
        }

        public static final /* synthetic */ y.n b(a aVar, Bundle bundle) {
            return aVar.e(bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final y.CustomerConfiguration c(Bundle bundle) throws PaymentSheetException {
            String string = bundle != null ? bundle.getString("customerId") : null;
            if (string == null) {
                string = "";
            }
            String string2 = bundle != null ? bundle.getString("customerEphemeralKeySecret") : null;
            if (string2 == null) {
                string2 = "";
            }
            String string3 = bundle != null ? bundle.getString("customerSessionClientSecret") : null;
            String str = string3 != null ? string3 : "";
            if (str.length() > 0 && string2.length() > 0) {
                throw new PaymentSheetException("`customerEphemeralKeySecret` and `customerSessionClientSecret` cannot both be set");
            }
            if (string.length() > 0 && str.length() > 0) {
                return y.CustomerConfiguration.INSTANCE.a(string, str);
            }
            if (string.length() <= 0 || string2.length() <= 0) {
                return null;
            }
            return new y.CustomerConfiguration(string, string2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final y.n e(Bundle intentConfigurationParams) throws PaymentSheetException {
            List listM;
            if (intentConfigurationParams == null) {
                return null;
            }
            Bundle bundle = intentConfigurationParams.getBundle("mode");
            if (bundle == null) {
                throw new PaymentSheetException("If `intentConfiguration` is provided, `intentConfiguration.mode` is required");
            }
            y.n.d dVarF = f(bundle);
            ArrayList<String> stringArrayList = intentConfigurationParams.getStringArrayList("paymentMethodTypes");
            if (stringArrayList == null || (listM = v.m1(stringArrayList)) == null) {
                listM = v.m();
            }
            return new y.n(dVarF, listM, null, null, false, 28, null);
        }

        private final y.n.d f(Bundle modeParams) throws PaymentSheetException {
            String string = modeParams.getString("currencyCode");
            if (string == null) {
                throw new PaymentSheetException("You must provide a value to intentConfiguration.mode.currencyCode");
            }
            if (modeParams.containsKey("amount")) {
                return new y.n.d.a(modeParams.getInt("amount"), string, Context.h(modeParams.getString("setupFutureUsage")), Context.e(modeParams.getString("captureMethod")));
            }
            y.n.e eVarH = Context.h(modeParams.getString("setupFutureUsage"));
            if (eVarH != null) {
                return new y.n.d.b(string, eVarH);
            }
            throw new PaymentSheetException("You must provide a value to intentConfiguration.mode.setupFutureUsage");
        }

        public final y.GooglePayConfiguration d(Bundle params) {
            if (params == null) {
                return null;
            }
            String string = params.getString("merchantCountryCode");
            String str = string == null ? "" : string;
            String string2 = params.getString("currencyCode");
            String str2 = string2 == null ? "" : string2;
            boolean z11 = params.getBoolean("testEnv");
            String string3 = params.getString("amount");
            Long lZ = string3 != null ? t.z(string3) : null;
            String string4 = params.getString(AnnotatedPrivateKey.LABEL);
            y.GooglePayConfiguration.a aVar = (y.GooglePayConfiguration.a) x0.f48939z.get(Integer.valueOf(params.getInt("buttonType")));
            if (aVar == null) {
                aVar = y.GooglePayConfiguration.a.Pay;
            }
            return new y.GooglePayConfiguration(z11 ? y.GooglePayConfiguration.c.Test : y.GooglePayConfiguration.c.Production, str, str2, lZ, string4, aVar);
        }

        public final WritableMap g() {
            return e.d(j.Failed.toString(), "No payment sheet has been initialized yet. You must call `initPaymentSheet` before `presentPaymentSheet`.");
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements n70.a {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.reactnativestripesdk.PaymentSheetFragment$onViewCreated$createIntentCallback$1", f = "PaymentSheetFragment.kt", i = {0}, l = {156}, m = "onCreateIntent", n = {"this"}, s = {"L$0"})
        static final class a extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f48953n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f48954o;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f48956q;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f48954o = obj;
                this.f48956q |= Integer.MIN_VALUE;
                return b.this.a(null, false, this);
            }
        }

        b() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // n70.a
        public final Object a(PaymentMethod paymentMethod, boolean z11, Continuation<? super com.stripe.android.paymentsheet.a> continuation) {
            a aVar;
            b bVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f48956q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f48956q = i11 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(continuation);
                }
            } else {
                aVar = new a(continuation);
            }
            Object objAwait = aVar.f48954o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = aVar.f48956q;
            if (i12 == 0) {
                jn0.t.b(objAwait);
                StripeSdkModule stripeSdkModule = (StripeSdkModule) x0.this.f48940m.getNativeModule(StripeSdkModule.class);
                if (stripeSdkModule == null || stripeSdkModule.getEventListenerCount() == 0) {
                    return new com.stripe.android.paymentsheet.a.C0968a(new Exception("Tried to call confirmHandler, but no callback was found. Please file an issue: https://github.com/stripe/stripe-react-native/issues"), "An unexpected error occurred");
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("paymentMethod", i.w(paymentMethod));
                writableMapCreateMap.putBoolean("shouldSavePaymentMethod", z11);
                ReactApplicationContext reactApplicationContext = x0.this.f48940m;
                s.h(writableMapCreateMap);
                stripeSdkModule.sendEvent$stripe_stripe_react_native_release(reactApplicationContext, "onConfirmHandlerCallback", writableMapCreateMap);
                CompletableDeferred<ReadableMap> completableDeferredM = x0.this.m();
                aVar.f48953n = this;
                aVar.f48956q = 1;
                objAwait = completableDeferredM.await(aVar);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) aVar.f48953n;
                jn0.t.b(objAwait);
            }
            ReadableMap readableMap = (ReadableMap) objAwait;
            x0.this.u(CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
            String string = readableMap.getString("clientSecret");
            if (string != null) {
                return new com.stripe.android.paymentsheet.a.b(string);
            }
            ReadableMap map = readableMap.getMap(AnalyticsAttribute.Error);
            return new com.stripe.android.paymentsheet.a.C0968a(new Exception(map != null ? map.getString("message") : null), map != null ? map.getString("localizedMessage") : null);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"com/reactnativestripesdk/x0$c", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0<Activity> f48957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x0 f48958b;

        c(n0<Activity> n0Var, x0 x0Var) {
            this.f48957a = n0Var;
            this.f48958b = x0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            s.k(activity, "activity");
            this.f48957a.f86529a = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Application application;
            s.k(activity, "activity");
            this.f48957a.f86529a = null;
            Activity currentActivity = this.f48958b.f48940m.getCurrentActivity();
            if (currentActivity == null || (application = currentActivity.getApplication()) == null) {
                return;
            }
            application.unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            s.k(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            s.k(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            s.k(activity, "activity");
            s.k(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            s.k(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            s.k(activity, "activity");
        }
    }

    public x0(ReactApplicationContext context, Promise initPromise) {
        s.k(context, "context");
        s.k(initPromise, "initPromise");
        this.f48940m = context;
        this.f48941n = initPromise;
        this.f48951x = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    }

    private final void j() {
        y.k.b bVar = new y.k.b() { // from class: com.reactnativestripesdk.w0
            @Override // com.stripe.android.paymentsheet.y.k.b
            public final void a(boolean z11, Throwable th2) {
                x0.k(this.f48936a, z11, th2);
            }
        };
        String str = this.f48944q;
        y.Configuration configuration = null;
        if (str != null && str.length() != 0) {
            y.k kVar = this.f48943p;
            if (kVar != null) {
                String str2 = this.f48944q;
                s.h(str2);
                y.Configuration configuration2 = this.f48947t;
                if (configuration2 == null) {
                    s.B("paymentSheetConfiguration");
                } else {
                    configuration = configuration2;
                }
                kVar.c(str2, configuration, bVar);
                return;
            }
            return;
        }
        String str3 = this.f48945r;
        if (str3 != null && str3.length() != 0) {
            y.k kVar2 = this.f48943p;
            if (kVar2 != null) {
                String str4 = this.f48945r;
                s.h(str4);
                y.Configuration configuration3 = this.f48947t;
                if (configuration3 == null) {
                    s.B("paymentSheetConfiguration");
                } else {
                    configuration = configuration3;
                }
                kVar2.b(str4, configuration, bVar);
                return;
            }
            return;
        }
        y.n nVar = this.f48946s;
        if (nVar == null) {
            this.f48941n.resolve(e.d(d.Failed.toString(), "One of `paymentIntentClientSecret`, `setupIntentClientSecret`, or `intentConfiguration` is required"));
            return;
        }
        y.k kVar3 = this.f48943p;
        if (kVar3 != null) {
            s.h(nVar);
            y.Configuration configuration4 = this.f48947t;
            if (configuration4 == null) {
                s.B("paymentSheetConfiguration");
            } else {
                configuration = configuration4;
            }
            kVar3.a(nVar, configuration, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0033  */
    public static final void k(x0 x0Var, boolean z11, Throwable th2) {
        Object writableNativeMap;
        PaymentOption paymentOptionE;
        y.k kVar = x0Var.f48943p;
        if (kVar == null || (paymentOptionE = kVar.e()) == null) {
            writableNativeMap = new WritableNativeMap();
        } else {
            String strA = Context.a(Context.c(x0Var.f48940m, paymentOptionE.getDrawableResourceId()));
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString(AnnotatedPrivateKey.LABEL, paymentOptionE.getLabel());
            writableNativeMap2.putString("image", strA);
            writableNativeMap = i.d("paymentOption", writableNativeMap2);
            if (writableNativeMap == null) {
                writableNativeMap = new WritableNativeMap();
            }
        }
        x0Var.f48941n.resolve(writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:5:0x002b  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    public static final void n(x0 x0Var, PaymentOption paymentOption) {
        WritableMap writableMapD;
        if (paymentOption != null) {
            String strA = Context.a(Context.c(x0Var.f48940m, paymentOption.getDrawableResourceId()));
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(AnnotatedPrivateKey.LABEL, paymentOption.getLabel());
            writableNativeMap.putString("image", strA);
            writableMapD = i.d("paymentOption", writableNativeMap);
            if (writableMapD == null) {
                if (x0Var.f48950w) {
                    x0Var.f48950w = false;
                    writableMapD = e.d(j.Timeout.toString(), "The payment has timed out");
                } else {
                    writableMapD = e.d(j.Canceled.toString(), "The payment option selection flow has been canceled");
                }
            }
        } else if (x0Var.f48950w) {
            x0Var.f48950w = false;
            writableMapD = e.d(j.Timeout.toString(), "The payment has timed out");
        } else {
            writableMapD = e.d(j.Canceled.toString(), "The payment option selection flow has been canceled");
        }
        Promise promise = x0Var.f48949v;
        if (promise != null) {
            promise.resolve(writableMapD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(x0 x0Var, b0 paymentResult) {
        s.k(paymentResult, "paymentResult");
        if (x0Var.f48950w) {
            x0Var.f48950w = false;
            x0Var.t(e.d(j.Timeout.toString(), "The payment has timed out"));
            return;
        }
        if (paymentResult instanceof b0.a) {
            x0Var.t(e.d(j.Canceled.toString(), "The payment flow has been canceled"));
            return;
        }
        if (paymentResult instanceof b0.Failed) {
            x0Var.t(e.e(j.Failed.toString(), ((b0.Failed) paymentResult).getError()));
        } else {
            if (!(paymentResult instanceof b0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            x0Var.t(new WritableNativeMap());
            g.d(x0Var, x0Var.f48940m);
            x0Var.f48942o = null;
            x0Var.f48943p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(n0 n0Var, x0 x0Var) {
        Activity activity = (Activity) n0Var.f86529a;
        if (activity != null) {
            activity.finish();
            x0Var.f48950w = true;
        }
    }

    private final void t(WritableMap map) {
        Promise promise = this.f48948u;
        if (promise != null) {
            promise.resolve(map);
            this.f48948u = null;
        } else {
            Promise promise2 = this.f48949v;
            if (promise2 != null) {
                promise2.resolve(map);
            }
        }
    }

    public final void l(Promise promise) {
        s.k(promise, "promise");
        this.f48948u = promise;
        y.k kVar = this.f48943p;
        if (kVar != null) {
            kVar.f();
        }
    }

    public final CompletableDeferred<ReadableMap> m() {
        return this.f48951x;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.k(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v1 ??, still in use, count: 1, list:
          (r15v1 ?? I:??[OBJECT, ARRAY]) from 0x0200: CONSTRUCTOR (r14v5 ?? I:com.stripe.android.paymentsheet.y$c) = 
          (r15v1 ?? I:??[OBJECT, ARRAY])
          (r2v22 ?? I:java.lang.String)
          (r12v2 ?? I:java.lang.String)
          (r7v4 ?? I:java.lang.String)
         A[MD:(com.stripe.android.paymentsheet.y$a, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:43) call: com.stripe.android.paymentsheet.y.c.<init>(com.stripe.android.paymentsheet.y$a, java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v1 ??, still in use, count: 1, list:
          (r15v1 ?? I:??[OBJECT, ARRAY]) from 0x0200: CONSTRUCTOR (r14v5 ?? I:com.stripe.android.paymentsheet.y$c) = 
          (r15v1 ?? I:??[OBJECT, ARRAY])
          (r2v22 ?? I:java.lang.String)
          (r12v2 ?? I:java.lang.String)
          (r7v4 ?? I:java.lang.String)
         A[MD:(com.stripe.android.paymentsheet.y$a, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:43) call: com.stripe.android.paymentsheet.y.c.<init>(com.stripe.android.paymentsheet.y$a, java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    public final void q(Promise promise) {
        y yVar;
        s.k(promise, "promise");
        this.f48949v = promise;
        if (this.f48942o == null) {
            y.k kVar = this.f48943p;
            if (kVar == null) {
                promise.resolve(f48938y.g());
                return;
            } else {
                if (kVar != null) {
                    kVar.d();
                    return;
                }
                return;
            }
        }
        String str = this.f48944q;
        y.Configuration configuration = null;
        if (str != null && str.length() != 0) {
            y yVar2 = this.f48942o;
            if (yVar2 != null) {
                String str2 = this.f48944q;
                s.h(str2);
                y.Configuration configuration2 = this.f48947t;
                if (configuration2 == null) {
                    s.B("paymentSheetConfiguration");
                } else {
                    configuration = configuration2;
                }
                yVar2.b(str2, configuration);
                return;
            }
            return;
        }
        String str3 = this.f48945r;
        if (str3 == null || str3.length() == 0) {
            y.n nVar = this.f48946s;
            if (nVar == null || (yVar = this.f48942o) == null) {
                return;
            }
            s.h(nVar);
            y.Configuration configuration3 = this.f48947t;
            if (configuration3 == null) {
                s.B("paymentSheetConfiguration");
            } else {
                configuration = configuration3;
            }
            yVar.a(nVar, configuration);
            return;
        }
        y yVar3 = this.f48942o;
        if (yVar3 != null) {
            String str4 = this.f48945r;
            s.h(str4);
            y.Configuration configuration4 = this.f48947t;
            if (configuration4 == null) {
                s.B("paymentSheetConfiguration");
            } else {
                configuration = configuration4;
            }
            yVar3.c(str4, configuration);
        }
    }

    public final void r(long j11, Promise promise) {
        Application application;
        s.k(promise, "promise");
        final n0 n0Var = new n0();
        c cVar = new c(n0Var, this);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.reactnativestripesdk.t0
            @Override // java.lang.Runnable
            public final void run() {
                x0.s(n0Var, this);
            }
        }, j11);
        Activity currentActivity = this.f48940m.getCurrentActivity();
        if (currentActivity != null && (application = currentActivity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
        q(promise);
    }

    public final void u(CompletableDeferred<ReadableMap> completableDeferred) {
        s.k(completableDeferred, "<set-?>");
        this.f48951x = completableDeferred;
    }
}
