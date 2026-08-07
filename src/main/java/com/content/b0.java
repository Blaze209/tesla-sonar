package com.content;

import android.app.Activity;
import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.content.utils.PaymentSheetAppearanceException;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.customersheet.q;
import com.stripe.android.customersheet.r;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.i;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import r10.a;
import s10.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 52\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00106\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010\u001eR\u0018\u00107\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00102¨\u00069"}, d2 = {"Lcom/reactnativestripesdk/b0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/stripe/android/customersheet/i;", "result", "Ljn0/h0;", "k", "(Lcom/stripe/android/customersheet/i;)V", "", "timeout", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "m", "(JLcom/facebook/react/bridge/Promise;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "l", "(Ljava/lang/Long;Lcom/facebook/react/bridge/Promise;)V", "p", "(Lcom/facebook/react/bridge/Promise;)V", "Lcom/stripe/android/customersheet/d;", "Lcom/stripe/android/customersheet/d;", "customerSheet", "Lr10/a;", "n", "Lr10/a;", "j", "()Lr10/a;", "setCustomerAdapter$stripe_stripe_react_native_release", "(Lr10/a;)V", "customerAdapter", "Lcom/facebook/react/bridge/ReactApplicationContext;", "o", "Lcom/facebook/react/bridge/ReactApplicationContext;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/facebook/react/bridge/ReactApplicationContext;", "q", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/bridge/Promise;", "getInitPromise$stripe_stripe_react_native_release", "()Lcom/facebook/react/bridge/Promise;", "r", "initPromise", "presentPromise", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0 extends Fragment {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private com.stripe.android.customersheet.d customerSheet;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private a customerAdapter;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private ReactApplicationContext context;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Promise initPromise;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Promise presentPromise;

    /* JADX INFO: renamed from: com.reactnativestripesdk.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/reactnativestripesdk/b0$a;", "", "<init>", "()V", "", AnnotatedPrivateKey.LABEL, "Landroid/graphics/drawable/Drawable;", "drawable", "Lcom/stripe/android/model/v0;", "paymentMethod", "Lcom/facebook/react/bridge/WritableMap;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/stripe/android/model/v0;)Lcom/facebook/react/bridge/WritableMap;", "k", "()Lcom/facebook/react/bridge/WritableMap;", "Landroid/os/Bundle;", "bundle", "Lcom/stripe/android/paymentsheet/y$c;", "j", "(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/y$c;", "Lcom/stripe/android/paymentsheet/y$d;", "e", "(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/y$d;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "customerId", "customerEphemeralKeySecret", "setupIntentClientSecret", "customerAdapterOverrideParams", "Lr10/a;", "g", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lr10/a;", "Lcom/stripe/android/customersheet/q;", "selection", "l", "(Lcom/stripe/android/customersheet/q;)Lcom/facebook/react/bridge/WritableMap;", "TAG", "Ljava/lang/String;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.reactnativestripesdk.b0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C0773a implements com.stripe.android.customersheet.c, m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ wn0.a<com.stripe.android.customersheet.b.c<a40.a>> f48767a;

            /* JADX WARN: Multi-variable type inference failed */
            C0773a(wn0.a<? extends com.stripe.android.customersheet.b.c<a40.a>> aVar) {
                this.f48767a = aVar;
            }

            @Override // com.stripe.android.customersheet.c
            public final Object a(Continuation<? super com.stripe.android.customersheet.b.c<a40.a>> continuation) {
                return Companion.h(this.f48767a, continuation);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof com.stripe.android.customersheet.c) && (obj instanceof m)) {
                    return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // p013kotlin.jvm.internal.m
            public final i<?> getFunctionDelegate() {
                return new p(1, this.f48767a, s.a.class, "suspendConversion0", "createCustomerAdapter$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: renamed from: com.reactnativestripesdk.b0$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b implements r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f48768a;

            b(String str) {
                this.f48768a = str;
            }

            @Override // com.stripe.android.customersheet.r
            public final Object a(String str, Continuation<? super com.stripe.android.customersheet.b.c<String>> continuation) {
                return com.stripe.android.customersheet.b.c.INSTANCE.b(this.f48768a);
            }
        }

        /* JADX INFO: renamed from: com.reactnativestripesdk.b0$a$c */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class c implements com.stripe.android.customersheet.c, m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ wn0.a<com.stripe.android.customersheet.b.c<a40.a>> f48769a;

            /* JADX WARN: Multi-variable type inference failed */
            c(wn0.a<? extends com.stripe.android.customersheet.b.c<a40.a>> aVar) {
                this.f48769a = aVar;
            }

            @Override // com.stripe.android.customersheet.c
            public final Object a(Continuation<? super com.stripe.android.customersheet.b.c<a40.a>> continuation) {
                return Companion.i(this.f48769a, continuation);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof com.stripe.android.customersheet.c) && (obj instanceof m)) {
                    return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // p013kotlin.jvm.internal.m
            public final i<?> getFunctionDelegate() {
                return new p(1, this.f48769a, s.a.class, "suspendConversion1", "createCustomerAdapter$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final WritableMap d(String label, Drawable drawable, PaymentMethod paymentMethod) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString(AnnotatedPrivateKey.LABEL, label);
            writableMapCreateMap2.putString("image", Context.a(Context.b(drawable)));
            writableMapCreateMap.putMap("paymentOption", writableMapCreateMap2);
            if (paymentMethod != null) {
                writableMapCreateMap.putMap("paymentMethod", s10.i.w(paymentMethod));
            }
            s.h(writableMapCreateMap);
            return writableMapCreateMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.stripe.android.customersheet.b.c f(String str, String str2) {
            return com.stripe.android.customersheet.b.c.INSTANCE.b(a40.a.INSTANCE.a(str, str2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object h(wn0.a aVar, Continuation continuation) {
            return aVar.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object i(wn0.a aVar, Continuation continuation) {
            return aVar.invoke();
        }

        public final y.BillingDetailsCollectionConfiguration e(Bundle bundle) {
            s.k(bundle, "bundle");
            return new y.BillingDetailsCollectionConfiguration(Context.f(bundle.getString("name")), Context.f(bundle.getString("phone")), Context.f(bundle.getString(Scopes.EMAIL)), Context.d(bundle.getString(PlaceTypes.ADDRESS)), bundle.getBoolean("attachDefaultsToPaymentMethod"));
        }

        public final a g(ReactApplicationContext context, final String customerId, final String customerEphemeralKeySecret, String setupIntentClientSecret, Bundle customerAdapterOverrideParams) {
            ReactApplicationContext reactApplicationContext;
            com.stripe.android.customersheet.b bVarB;
            s.k(context, "context");
            s.k(customerId, "customerId");
            s.k(customerEphemeralKeySecret, "customerEphemeralKeySecret");
            wn0.a aVar = new wn0.a() { // from class: com.reactnativestripesdk.a0
                @Override // wn0.a
                public final Object invoke() {
                    return b0.Companion.f(customerId, customerEphemeralKeySecret);
                }
            };
            if (setupIntentClientSecret != null) {
                bVarB = com.stripe.android.customersheet.b.Companion.b(com.stripe.android.customersheet.b.INSTANCE, context, new C0773a(aVar), new b(setupIntentClientSecret), null, 8, null);
                reactApplicationContext = context;
            } else {
                reactApplicationContext = context;
                bVarB = com.stripe.android.customersheet.b.Companion.b(com.stripe.android.customersheet.b.INSTANCE, reactApplicationContext, new c(aVar), null, null, 8, null);
            }
            return new a(reactApplicationContext, bVarB, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("fetchPaymentMethods") : false, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("attachPaymentMethod") : false, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("detachPaymentMethod") : false, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("setSelectedPaymentOption") : false, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("fetchSelectedPaymentOption") : false, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("setupIntentClientSecretForCustomerAttach") : false);
        }

        public final y.BillingDetails j(Bundle bundle) {
            s.k(bundle, "bundle");
            Bundle bundle2 = bundle.getBundle(PlaceTypes.ADDRESS);
            return new y.BillingDetails(new y.Address(bundle2 != null ? bundle2.getString("city") : null, bundle2 != null ? bundle2.getString(PlaceTypes.COUNTRY) : null, bundle2 != null ? bundle2.getString("line1") : null, bundle2 != null ? bundle2.getString("line2") : null, bundle2 != null ? bundle2.getString("postalCode") : null, bundle2 != null ? bundle2.getString("state") : null), bundle.getString(Scopes.EMAIL), bundle.getString("name"), bundle.getString("phone"));
        }

        public final WritableMap k() {
            return e.d(s10.d.Failed.toString(), "No customer sheet has been initialized yet.");
        }

        public final WritableMap l(q selection) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            if (selection instanceof q.a) {
                q.a aVar = (q.a) selection;
                writableMapCreateMap = d(aVar.getPaymentOption().getLabel(), aVar.getPaymentOption().e(), null);
            } else if (selection instanceof q.b) {
                q.b bVar = (q.b) selection;
                writableMapCreateMap = d(bVar.getPaymentOption().getLabel(), bVar.getPaymentOption().e(), bVar.getPaymentMethod());
            } else if (selection != null) {
                throw new NoWhenBranchMatchedException();
            }
            s.h(writableMapCreateMap);
            return writableMapCreateMap;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class b implements a40.d, m {
        b() {
        }

        @Override // a40.d
        public final void a(com.stripe.android.customersheet.i p11) {
            s.k(p11, "p0");
            b0.this.k(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof a40.d) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final i<?> getFunctionDelegate() {
            return new p(1, b0.this, b0.class, "handleResult", "handleResult(Lcom/stripe/android/customersheet/CustomerSheetResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"com/reactnativestripesdk/b0$c", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0<Activity> f48771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0<List<Activity>> f48772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0 f48773c;

        c(n0<Activity> n0Var, n0<List<Activity>> n0Var2, b0 b0Var) {
            this.f48771a = n0Var;
            this.f48772b = n0Var2;
            this.f48773c = b0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            s.k(activity, "activity");
            this.f48771a.f86529a = activity;
            this.f48772b.f86529a.add(activity);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Activity currentActivity;
            Application application;
            s.k(activity, "activity");
            this.f48771a.f86529a = null;
            this.f48772b.f86529a = new ArrayList();
            ReactApplicationContext context = this.f48773c.getContext();
            if (context == null || (currentActivity = context.getCurrentActivity()) == null || (application = currentActivity.getApplication()) == null) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativestripesdk.CustomerSheetFragment$retrievePaymentOptionSelection$1", f = "CustomerSheetFragment.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u242"}, s = {"L$1"})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f48774n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f48775o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f48776p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Promise f48778r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Promise promise, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f48778r = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = b0.this.new d(this.f48778r, continuation);
            dVar.f48776p = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Promise promise;
            Promise promise2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48775o;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f48776p;
                    b0 b0Var = b0.this;
                    promise = this.f48778r;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    com.stripe.android.customersheet.d dVar = b0Var.customerSheet;
                    if (dVar != null) {
                        this.f48776p = promise;
                        this.f48774n = coroutineScope;
                        this.f48775o = 1;
                        obj = dVar.g(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        promise2 = promise;
                    }
                    promise.resolve(b0.INSTANCE.k());
                    return h0.f84049a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                promise2 = (Promise) this.f48776p;
                t.b(obj);
                com.stripe.android.customersheet.i iVar = (com.stripe.android.customersheet.i) obj;
                if (iVar == null) {
                    promise = promise2;
                    promise.resolve(b0.INSTANCE.k());
                    return h0.f84049a;
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                if (iVar instanceof com.stripe.android.customersheet.i.c) {
                    promise2.resolve(e.e(s10.d.Failed.toString(), ((com.stripe.android.customersheet.i.c) iVar).getException()));
                } else if (iVar instanceof com.stripe.android.customersheet.i.d) {
                    writableMapCreateMap = b0.INSTANCE.l(((com.stripe.android.customersheet.i.d) iVar).getSelection());
                } else {
                    if (!(iVar instanceof com.stripe.android.customersheet.i.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    writableMapCreateMap = b0.INSTANCE.l(((com.stripe.android.customersheet.i.a) iVar).getSelection());
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putString("code", s10.d.Canceled.toString());
                    h0 h0Var = h0.f84049a;
                    writableMapCreateMap.putMap(AnalyticsAttribute.Error, writableMapCreateMap2);
                }
                promise2.resolve(writableMapCreateMap);
                objB = jn0.s.b(h0.f84049a);
                Promise promise3 = this.f48778r;
                Throwable thE = jn0.s.e(objB);
                if (thE != null) {
                    promise3.resolve(e.d(s10.c.Failed.toString(), thE.getMessage()));
                }
                return h0.f84049a;
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(com.stripe.android.customersheet.i result) {
        Promise promise = this.presentPromise;
        if (promise == null) {
            Log.e("StripeReactNative", "No promise found for CustomerSheet.present");
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (result instanceof com.stripe.android.customersheet.i.c) {
            promise.resolve(e.e(s10.d.Failed.toString(), ((com.stripe.android.customersheet.i.c) result).getException()));
        } else if (result instanceof com.stripe.android.customersheet.i.d) {
            writableMapCreateMap = INSTANCE.l(((com.stripe.android.customersheet.i.d) result).getSelection());
        } else {
            if (!(result instanceof com.stripe.android.customersheet.i.a)) {
                throw new NoWhenBranchMatchedException();
            }
            writableMapCreateMap = INSTANCE.l(((com.stripe.android.customersheet.i.a) result).getSelection());
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("code", s10.d.Canceled.toString());
            h0 h0Var = h0.f84049a;
            writableMapCreateMap.putMap(AnalyticsAttribute.Error, writableMapCreateMap2);
        }
        promise.resolve(writableMapCreateMap);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    private final void m(long timeout, Promise promise) {
        Activity currentActivity;
        Application application;
        n0 n0Var = new n0();
        final n0 n0Var2 = new n0();
        n0Var2.f86529a = new ArrayList();
        c cVar = new c(n0Var, n0Var2, this);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.reactnativestripesdk.z
            @Override // java.lang.Runnable
            public final void run() {
                b0.n(n0Var2);
            }
        }, timeout);
        ReactApplicationContext reactApplicationContext = this.context;
        if (reactApplicationContext != null && (currentActivity = reactApplicationContext.getCurrentActivity()) != null && (application = currentActivity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
        com.stripe.android.customersheet.d dVar = this.customerSheet;
        if (dVar != null) {
            dVar.f();
        } else {
            promise.resolve(INSTANCE.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(n0 n0Var) {
        Iterator it = ((List) n0Var.f86529a).iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).finish();
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ReactApplicationContext getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final a getCustomerAdapter() {
        return this.customerAdapter;
    }

    public final void l(Long timeout, Promise promise) {
        s.k(promise, "promise");
        this.presentPromise = promise;
        if (timeout != null) {
            m(timeout.longValue(), promise);
        }
        com.stripe.android.customersheet.d dVar = this.customerSheet;
        if (dVar != null) {
            dVar.f();
        } else {
            promise.resolve(INSTANCE.k());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.k(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.k(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ReactApplicationContext reactApplicationContext = this.context;
        if (reactApplicationContext == null) {
            Log.e("StripeReactNative", "No context found during CustomerSheet.initialize. Please file an issue: https://github.com/stripe/stripe-react-native/issues");
            return;
        }
        Promise promise = this.initPromise;
        if (promise == null) {
            Log.e("StripeReactNative", "No promise found for CustomerSheet.initialize. Please file an issue: https://github.com/stripe/stripe-react-native/issues");
            return;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("headerTextForSelectionScreen") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("merchantDisplayName") : null;
        Bundle arguments3 = getArguments();
        boolean z11 = arguments3 != null ? arguments3.getBoolean("googlePayEnabled") : false;
        Bundle arguments4 = getArguments();
        Bundle bundle = arguments4 != null ? arguments4.getBundle("defaultBillingDetails") : null;
        Bundle arguments5 = getArguments();
        Bundle bundle2 = arguments5 != null ? arguments5.getBundle("billingDetailsCollectionConfiguration") : null;
        Bundle arguments6 = getArguments();
        String string3 = arguments6 != null ? arguments6.getString("setupIntentClientSecret") : null;
        Bundle arguments7 = getArguments();
        String string4 = arguments7 != null ? arguments7.getString("customerId") : null;
        Bundle arguments8 = getArguments();
        String string5 = arguments8 != null ? arguments8.getString("customerEphemeralKeySecret") : null;
        Bundle arguments9 = getArguments();
        Bundle bundle3 = arguments9 != null ? arguments9.getBundle("customerAdapter") : null;
        Bundle arguments10 = getArguments();
        boolean z12 = arguments10 != null ? arguments10.getBoolean("allowsRemovalOfLastSavedPaymentMethod", true) : true;
        Bundle arguments11 = getArguments();
        ArrayList<String> stringArrayList = arguments11 != null ? arguments11.getStringArrayList("paymentMethodOrder") : null;
        if (string4 == null) {
            promise.resolve(e.d(s10.d.Failed.toString(), "You must provide a value for `customerId`"));
            return;
        }
        if (string5 == null) {
            promise.resolve(e.d(s10.d.Failed.toString(), "You must provide a value for `customerEphemeralKeySecret`"));
            return;
        }
        try {
            Bundle arguments12 = getArguments();
            y.Appearance appearanceB = Bundle.b(arguments12 != null ? arguments12.getBundle("appearance") : null, reactApplicationContext);
            com.stripe.android.customersheet.d.Configuration.Companion companion = com.stripe.android.customersheet.d.Configuration.INSTANCE;
            if (string2 == null) {
                string2 = "";
            }
            com.stripe.android.customersheet.d.Configuration.a aVarG = companion.a(string2).b(appearanceB).f(z11).g(string);
            Bundle arguments13 = getArguments();
            com.stripe.android.customersheet.d.Configuration.a aVarA = aVarG.i(s10.i.O(arguments13 != null ? arguments13.getIntegerArrayList("preferredNetworks") : null)).a(z12);
            if (stringArrayList != null) {
                aVarA.h(stringArrayList);
            }
            if (bundle != null) {
                aVarA.e(INSTANCE.j(bundle));
            }
            if (bundle2 != null) {
                aVarA.c(INSTANCE.e(bundle2));
            }
            a aVarG2 = INSTANCE.g(reactApplicationContext, string4, string5, string3, bundle3);
            this.customerAdapter = aVarG2;
            com.stripe.android.customersheet.d dVarA = com.stripe.android.customersheet.d.INSTANCE.a(this, aVarG2, new b());
            this.customerSheet = dVarA;
            if (dVarA != null) {
                dVarA.d(aVarA.d());
            }
            promise.resolve(new WritableNativeMap());
        } catch (PaymentSheetAppearanceException e11) {
            promise.resolve(e.c(s10.d.Failed.toString(), e11));
        }
    }

    public final void p(Promise promise) {
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new d(promise, null), 3, null);
    }

    public final void q(ReactApplicationContext reactApplicationContext) {
        this.context = reactApplicationContext;
    }

    public final void r(Promise promise) {
        this.initPromise = promise;
    }
}
