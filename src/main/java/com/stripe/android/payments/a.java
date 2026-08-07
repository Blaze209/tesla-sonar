package com.stripe.android.payments;

import a70.Unvalidated;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.d;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f30.PaymentConfiguration;
import f30.d0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import w30.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 02\u00020\u0001:\u0002\u00141B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010/\u001a\u00020)2\u0006\u0010*\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/stripe/android/payments/a;", "Landroidx/lifecycle/c1;", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lp30/a;", "browserCapabilities", "", "intentChooserTitle", "resolveErrorMessage", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lp30/a;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/s0;)V", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "args", "Landroid/net/Uri;", ImagesContract.URL, "Landroidx/browser/customtabs/d;", "a", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;Landroid/net/Uri;)Landroidx/browser/customtabs/d;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "()V", "Landroid/content/Intent;", "c", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;)Landroid/content/Intent;", "h", "f", "s", "Lw30/c;", "t", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "u", "Lp30/a;", "v", "Ljava/lang/String;", "w", "x", "Landroidx/lifecycle/s0;", "", "value", "g", "()Z", "j", "(Z)V", "hasLaunched", "y", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends c1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f51950z = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final p30.a browserCapabilities;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final String intentChooserTitle;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final String resolveErrorMessage;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/payments/a$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            s.k(modelClass, "modelClass");
            s.k(extras, "extras");
            Application applicationA = z30.b.a(extras);
            s0 s0VarA = v0.a(extras);
            PaymentConfiguration paymentConfigurationA = PaymentConfiguration.INSTANCE.a(applicationA);
            p30.b bVar = new p30.b(applicationA);
            o oVar = new o();
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(applicationA, paymentConfigurationA.getPublishableKey(), null, 4, null);
            p30.a aVarA = bVar.a();
            String string = applicationA.getString(d0.P0);
            s.j(string, "getString(...)");
            String string2 = applicationA.getString(d0.f63965p0);
            s.j(string2, "getString(...)");
            return new a(oVar, paymentAnalyticsRequestFactory, aVarA, string, string2, s0VarA);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51957a;

        static {
            int[] iArr = new int[p30.a.values().length];
            try {
                iArr[p30.a.CustomTabs.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p30.a.Unknown.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51957a = iArr;
        }
    }

    public a(w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, p30.a browserCapabilities, String intentChooserTitle, String resolveErrorMessage, s0 savedStateHandle) {
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.k(browserCapabilities, "browserCapabilities");
        s.k(intentChooserTitle, "intentChooserTitle");
        s.k(resolveErrorMessage, "resolveErrorMessage");
        s.k(savedStateHandle, "savedStateHandle");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.browserCapabilities = browserCapabilities;
        this.intentChooserTitle = intentChooserTitle;
        this.resolveErrorMessage = resolveErrorMessage;
        this.savedStateHandle = savedStateHandle;
    }

    private final d a(PaymentBrowserAuthContract.Args args, Uri url) {
        androidx.browser.customtabs.a aVarA;
        Integer statusBarColor = args.getStatusBarColor();
        if (statusBarColor != null) {
            aVarA = new androidx.browser.customtabs.a.C0064a().e(statusBarColor.intValue()).a();
        } else {
            aVarA = null;
        }
        d.C0067d c0067dJ = new d.C0067d().j(2);
        if (aVarA != null) {
            c0067dJ.e(aVarA);
        }
        d dVarB = c0067dJ.b();
        s.j(dVarB, "build(...)");
        dVarB.f2960a.setData(url);
        return dVarB;
    }

    private final void i() {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        int i11 = c.f51957a[this.browserCapabilities.ordinal()];
        if (i11 == 1) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithCustomTabs;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithDefaultBrowser;
        }
        this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    public final Intent c(PaymentBrowserAuthContract.Args args) {
        Intent intent;
        s.k(args, "args");
        Uri uri = Uri.parse(args.getUrl());
        i();
        int i11 = c.f51957a[this.browserCapabilities.ordinal()];
        if (i11 == 1) {
            s.h(uri);
            intent = a(args, uri).f2960a;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            intent = new Intent("android.intent.action.VIEW", uri);
        }
        s.h(intent);
        Intent intentCreateChooser = Intent.createChooser(intent, this.intentChooserTitle);
        s.j(intentCreateChooser, "createChooser(...)");
        return intentCreateChooser;
    }

    public final Intent f(PaymentBrowserAuthContract.Args args) {
        s.k(args, "args");
        Uri uri = Uri.parse(args.getUrl());
        LocalStripeException localStripeException = new LocalStripeException(this.resolveErrorMessage, "failedBrowserLaunchError");
        Intent intent = new Intent();
        String clientSecret = args.getClientSecret();
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String stripeAccountId = args.getStripeAccountId();
        Intent intentPutExtras = intent.putExtras(new Unvalidated(clientSecret, 2, localStripeException, args.getShouldCancelSource(), lastPathSegment, null, stripeAccountId, 32, null).i());
        s.j(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    public final boolean g() {
        Boolean bool = (Boolean) this.savedStateHandle.f("has_launched");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Intent h(PaymentBrowserAuthContract.Args args) {
        s.k(args, "args");
        Uri uri = Uri.parse(args.getUrl());
        Intent intent = new Intent();
        String clientSecret = args.getClientSecret();
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String stripeAccountId = args.getStripeAccountId();
        Intent intentPutExtras = intent.putExtras(new Unvalidated(clientSecret, 0, null, args.getShouldCancelSource(), lastPathSegment, null, stripeAccountId, 38, null).i());
        s.j(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    public final void j(boolean z11) {
        this.savedStateHandle.n("has_launched", Boolean.valueOf(z11));
    }
}
