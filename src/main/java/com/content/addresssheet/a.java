package com.content.addresssheet;

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
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.paymentsheet.addresselement.d;
import com.stripe.android.paymentsheet.y;
import java.util.Set;
import jn0.h0;
import jn0.i;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.s;
import p017o70.AddressDetails;
import p017o70.e;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 82\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0089\u0001\u0010,\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010#\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010(\u001a\u0004\u0018\u00010'2\u001c\u0010+\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00060)¢\u0006\u0004\b,\u0010-R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R.\u0010+\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u0006\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/stripe/android/paymentsheet/addresselement/e;", "result", "Ljn0/h0;", "f", "(Lcom/stripe/android/paymentsheet/addresselement/e;)V", "Landroidx/fragment/app/u;", "currentActivity", DateTokenConverter.CONVERTER_KEY, "(Landroidx/fragment/app/u;)V", "e", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/paymentsheet/y$b;", "appearance", "Lo70/a;", "defaultAddress", "", "", "allowedCountries", "buttonTitle", "title", "googlePlacesApiKey", "autocompleteCountries", "Lcom/stripe/android/paymentsheet/addresselement/d$a;", "additionalFields", "Lkotlin/Function2;", "Lcom/facebook/react/bridge/WritableMap;", "callback", "g", "(Lcom/facebook/react/bridge/ReactContext;Lcom/stripe/android/paymentsheet/y$b;Lo70/a;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/paymentsheet/addresselement/d$a;Lwn0/p;)V", "Lcom/stripe/android/paymentsheet/addresselement/d;", "m", "Lcom/stripe/android/paymentsheet/addresselement/d;", "addressLauncher", "Lcom/stripe/android/paymentsheet/addresselement/d$b;", "n", "Lcom/stripe/android/paymentsheet/addresselement/d$b;", "configuration", "o", "Lwn0/p;", "p", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f48734q;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private d addressLauncher;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private d.Configuration configuration = new d.Configuration(null, null, null, null, null, null, null, null, 255, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private p<? super WritableMap, ? super AddressDetails, h0> callback;

    /* JADX INFO: renamed from: com.reactnativestripesdk.addresssheet.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/a$a;", "", "<init>", "()V", "", "publishableKey", "Ljava/lang/String;", "getPublishableKey$stripe_stripe_react_native_release", "()Ljava/lang/String;", "a", "(Ljava/lang/String;)V", "TAG", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String str) {
            a.f48734q = str;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class b implements e, m {
        b() {
        }

        @Override // p017o70.e
        public final void a(com.stripe.android.paymentsheet.addresselement.e p11) {
            s.k(p11, "p0");
            a.this.f(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof e) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final i<?> getFunctionDelegate() {
            return new p013kotlin.jvm.internal.p(1, a.this, a.class, "onAddressLauncherResult", "onAddressLauncherResult(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0);
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
            currentActivity.getSupportFragmentManager().r().e(this, "address_launcher_fragment").g();
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(com.stripe.android.paymentsheet.addresselement.e result) {
        if (result instanceof com.stripe.android.paymentsheet.addresselement.e.a) {
            p<? super WritableMap, ? super AddressDetails, h0> pVar = this.callback;
            if (pVar != null) {
                pVar.invoke(s10.e.d(s10.d.Canceled.toString(), "The flow has been canceled."), null);
                return;
            }
            return;
        }
        if (!(result instanceof com.stripe.android.paymentsheet.addresselement.e.Succeeded)) {
            throw new NoWhenBranchMatchedException();
        }
        p<? super WritableMap, ? super AddressDetails, h0> pVar2 = this.callback;
        if (pVar2 != null) {
            pVar2.invoke(null, ((com.stripe.android.paymentsheet.addresselement.e.Succeeded) result).getAddress());
        }
    }

    public final void g(ReactContext context, y.Appearance appearance, AddressDetails defaultAddress, Set<String> allowedCountries, String buttonTitle, String title, String googlePlacesApiKey, Set<String> autocompleteCountries, d.AdditionalFieldsConfiguration additionalFields, p<? super WritableMap, ? super AddressDetails, h0> callback) {
        s.k(context, "context");
        s.k(appearance, "appearance");
        s.k(allowedCountries, "allowedCountries");
        s.k(autocompleteCountries, "autocompleteCountries");
        s.k(callback, "callback");
        this.configuration = new d.Configuration(appearance, defaultAddress, allowedCountries, buttonTitle, additionalFields, title, googlePlacesApiKey, autocompleteCountries);
        this.callback = callback;
        Activity currentActivity = context.getCurrentActivity();
        u uVar = currentActivity instanceof u ? (u) currentActivity : null;
        if (uVar != null) {
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
        String str = f48734q;
        if (str != null) {
            d dVar = new d(this, new b());
            dVar.c(str, this.configuration);
            this.addressLauncher = dVar;
        } else {
            p<? super WritableMap, ? super AddressDetails, h0> pVar = this.callback;
            if (pVar != null) {
                pVar.invoke(s10.e.d(s10.d.Failed.toString(), "No publishable key set. Stripe has not been initialized. Initialize Stripe in your app with the StripeProvider component or the initStripe method."), null);
            }
        }
    }
}
