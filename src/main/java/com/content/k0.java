package com.content;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.googlepaylauncher.f;
import jn0.h0;
import jn0.i;
import on0.a;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.s;
import s10.g;
import s10.h;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 A2\u00020\u0001:\u0002BCB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010)\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u001c\u0010(\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u00060&¢\u0006\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00100R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00100R,\u0010(\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u00060&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/reactnativestripesdk/k0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroidx/fragment/app/u;", "currentActivity", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/fragment/app/u;)V", "e", "", "isReady", "f", "(Z)V", "Lcom/stripe/android/googlepaylauncher/f$h;", "result", "g", "(Lcom/stripe/android/googlepaylauncher/f$h;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "clientSecret", "Lcom/reactnativestripesdk/k0$b;", "mode", "Lcom/facebook/react/bridge/ReadableMap;", "googlePayParams", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lcom/facebook/react/bridge/WritableMap;", "callback", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lcom/reactnativestripesdk/k0$b;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReactApplicationContext;Lwn0/p;)V", "Lcom/stripe/android/googlepaylauncher/f;", "m", "Lcom/stripe/android/googlepaylauncher/f;", "launcher", "n", "Ljava/lang/String;", "o", "Lcom/reactnativestripesdk/k0$b;", "Lcom/stripe/android/googlepaylauncher/f$f;", "p", "Lcom/stripe/android/googlepaylauncher/f$f;", "configuration", "q", "currencyCode", "", "r", "Ljava/lang/Integer;", "amount", "s", AnnotatedPrivateKey.LABEL, "t", "Lwn0/p;", "u", "b", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 extends Fragment {

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private f launcher;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String clientSecret;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private b mode;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private f.Config configuration;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private String currencyCode;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Integer amount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private String label;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private p<? super f.h, ? super WritableMap, h0> callback;

    /* JADX INFO: renamed from: com.reactnativestripesdk.k0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/reactnativestripesdk/k0$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "params", "Lcom/stripe/android/googlepaylauncher/f$d;", "b", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/stripe/android/googlepaylauncher/f$d;", "", "TAG", "Ljava/lang/String;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f.BillingAddressConfig b(ReadableMap params) {
            f.BillingAddressConfig.b bVar;
            Boolean boolValueOf = params != null ? Boolean.valueOf(g.b(params, "isRequired", false)) : null;
            Boolean boolValueOf2 = params != null ? Boolean.valueOf(g.b(params, "isPhoneNumberRequired", false)) : null;
            String string = params != null ? params.getString("format") : null;
            if (string == null) {
                string = "";
            }
            if (s.f(string, "FULL")) {
                bVar = f.BillingAddressConfig.b.Full;
            } else {
                bVar = s.f(string, "MIN") ? f.BillingAddressConfig.b.Min : f.BillingAddressConfig.b.Min;
            }
            return new f.BillingAddressConfig(boolValueOf != null ? boolValueOf.booleanValue() : false, bVar, boolValueOf2 != null ? boolValueOf2.booleanValue() : false);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativestripesdk/k0$b;", "", "<init>", "(Ljava/lang/String;I)V", "ForSetup", "ForPayment", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        ForSetup,
        ForPayment;

        private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48844a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ForSetup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.ForPayment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48844a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class d implements f.g, m {
        d() {
        }

        @Override // com.stripe.android.googlepaylauncher.f.g
        public final void a(boolean z11) {
            k0.this.f(z11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof f.g) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final i<?> getFunctionDelegate() {
            return new p013kotlin.jvm.internal.p(1, k0.this, k0.class, "onGooglePayReady", "onGooglePayReady(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class e implements f.i, m {
        e() {
        }

        @Override // com.stripe.android.googlepaylauncher.f.i
        public final void a(f.h p11) {
            s.k(p11, "p0");
            k0.this.g(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof f.i) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final i<?> getFunctionDelegate() {
            return new p013kotlin.jvm.internal.p(1, k0.this, k0.class, "onGooglePayResult", "onGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private final void d(u currentActivity) {
        currentActivity.getSupportFragmentManager().r().n(this).h();
    }

    private final void e(u currentActivity) {
        try {
            currentActivity.getSupportFragmentManager().r().e(this, "google_pay_launcher_fragment").g();
        } catch (IllegalStateException e11) {
            p<? super f.h, ? super WritableMap, h0> pVar = this.callback;
            if (pVar == null) {
                s.B("callback");
                pVar = null;
            }
            pVar.invoke(null, s10.e.d(s10.d.Failed.toString(), e11.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(boolean isReady) {
        String str = null;
        if (!isReady) {
            p<? super f.h, ? super WritableMap, h0> pVar = this.callback;
            if (pVar == null) {
                s.B("callback");
                pVar = null;
            }
            pVar.invoke(null, s10.e.d(h.Failed.toString(), "Google Pay is not available on this device. You can use isPlatformPaySupported to preemptively check for Google Pay support."));
            return;
        }
        b bVar = this.mode;
        if (bVar == null) {
            s.B("mode");
            bVar = null;
        }
        int i11 = c.f48844a[bVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f fVar = this.launcher;
            if (fVar == null) {
                s.B("launcher");
                fVar = null;
            }
            String str2 = this.clientSecret;
            if (str2 == null) {
                s.B("clientSecret");
            } else {
                str = str2;
            }
            fVar.e(str, this.label);
            return;
        }
        f fVar2 = this.launcher;
        if (fVar2 == null) {
            s.B("launcher");
            fVar2 = null;
        }
        String str3 = this.clientSecret;
        if (str3 == null) {
            s.B("clientSecret");
            str3 = null;
        }
        String str4 = this.currencyCode;
        if (str4 == null) {
            s.B("currencyCode");
            str4 = null;
        }
        Integer num = this.amount;
        fVar2.f(str3, str4, num != null ? Long.valueOf(num.intValue()) : null, this.label);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(f.h result) {
        p<? super f.h, ? super WritableMap, h0> pVar = this.callback;
        if (pVar == null) {
            s.B("callback");
            pVar = null;
        }
        pVar.invoke(result, null);
    }

    public final void i(String clientSecret, b mode, ReadableMap googlePayParams, ReactApplicationContext context, p<? super f.h, ? super WritableMap, h0> callback) {
        s.k(clientSecret, "clientSecret");
        s.k(mode, "mode");
        s.k(googlePayParams, "googlePayParams");
        s.k(context, "context");
        s.k(callback, "callback");
        this.clientSecret = clientSecret;
        this.mode = mode;
        this.callback = callback;
        String string = googlePayParams.getString("currencyCode");
        if (string == null) {
            string = "USD";
        }
        this.currencyCode = string;
        this.amount = s10.i.f(googlePayParams, "amount");
        this.label = googlePayParams.getString(AnnotatedPrivateKey.LABEL);
        a60.d dVar = googlePayParams.getBoolean("testEnv") ? a60.d.Test : a60.d.Production;
        String string2 = googlePayParams.getString("merchantCountryCode");
        String str = string2 == null ? "" : string2;
        String string3 = googlePayParams.getString("merchantName");
        this.configuration = new f.Config(dVar, str, string3 == null ? "" : string3, g.b(googlePayParams, "isEmailRequired", false), INSTANCE.b(googlePayParams.getMap("billingAddressConfig")), g.b(googlePayParams, "existingPaymentMethodRequired", false), g.b(googlePayParams, "allowCreditCards", true));
        Activity currentActivity = context.getCurrentActivity();
        u uVar = currentActivity instanceof u ? (u) currentActivity : null;
        if (uVar == null) {
            callback.invoke(null, s10.e.f());
        } else {
            d(uVar);
            e(uVar);
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
        f.Config config = this.configuration;
        if (config == null) {
            s.B("configuration");
            config = null;
        }
        this.launcher = new f(this, config, new d(), new e());
    }
}
