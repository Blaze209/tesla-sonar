package com.stripe.android.view;

import a70.Unvalidated;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.p003lifecycle.ViewModelProvider;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import ezvcard.property.Kind;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import w30.AnalyticsRequest;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u000267B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R'\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010*\u001a\u0004\u0018\u00010%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u0014\u00101\u001a\u00020.8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/stripe/android/view/w1;", "Landroidx/lifecycle/c1;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "args", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "<init>", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "Lw30/b;", "request", "Ljn0/h0;", "c", "(Lw30/b;)V", "n", "()V", "m", "l", "s", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "t", "Lw30/c;", "u", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "", "", "v", "Lkotlin/Lazy;", "h", "()Ljava/util/Map;", "extraHeaders", "w", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "buttonText", "Lcom/stripe/android/view/w1$b;", "x", "Lcom/stripe/android/view/w1$b;", "k", "()Lcom/stripe/android/view/w1$b;", "toolbarTitle", "y", "j", "toolbarBackgroundColor", "La70/c;", IntegerTokenConverter.CONVERTER_KEY, "()La70/c;", "paymentResult", "Landroid/content/Intent;", "g", "()Landroid/content/Intent;", "cancellationResult", "a", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class w1 extends androidx.p003lifecycle.c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final PaymentBrowserAuthContract.Args args;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy extraHeaders;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final /* synthetic */ String buttonText;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final /* synthetic */ ToolbarTitleData toolbarTitle;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final /* synthetic */ String toolbarBackgroundColor;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/w1$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroid/app/Application;", Kind.APPLICATION, "Lo30/d;", "logger", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "args", "<init>", "(Landroid/app/Application;Lo30/d;Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "a", "Landroid/app/Application;", "b", "Lo30/d;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Application application;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final o30.d logger;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final PaymentBrowserAuthContract.Args args;

        public a(Application application, o30.d logger, PaymentBrowserAuthContract.Args args) {
            p013kotlin.jvm.internal.s.k(application, "application");
            p013kotlin.jvm.internal.s.k(logger, "logger");
            p013kotlin.jvm.internal.s.k(args, "args");
            this.application = application;
            this.logger = logger;
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            return new w1(this.args, new w30.o(this.logger, Dispatchers.getIO()), new PaymentAnalyticsRequestFactory(this.application, this.args.getPublishableKey(), (Set<String>) p013kotlin.collections.d1.c("PaymentAuthWebViewActivity")));
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.view.w1$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/w1$b;", "", "", "text", "Lq80/k;", "toolbarCustomization", "<init>", "(Ljava/lang/String;Lq80/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lq80/k;", "()Lq80/k;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToolbarTitleData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q80.k toolbarCustomization;

        public ToolbarTitleData(String text, q80.k toolbarCustomization) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(toolbarCustomization, "toolbarCustomization");
            this.text = text;
            this.toolbarCustomization = toolbarCustomization;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final q80.k getToolbarCustomization() {
            return this.toolbarCustomization;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolbarTitleData)) {
                return false;
            }
            ToolbarTitleData toolbarTitleData = (ToolbarTitleData) other;
            return p013kotlin.jvm.internal.s.f(this.text, toolbarTitleData.text) && p013kotlin.jvm.internal.s.f(this.toolbarCustomization, toolbarTitleData.toolbarCustomization);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.toolbarCustomization.hashCode();
        }

        public String toString() {
            return "ToolbarTitleData(text=" + this.text + ", toolbarCustomization=" + this.toolbarCustomization + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<Map<String, ? extends String>> {
        c() {
            super(0);
        }

        @Override // wn0.a
        public final Map<String, ? extends String> invoke() {
            w1 w1Var = w1.this;
            Map mapC = p013kotlin.collections.v0.c();
            if (w1Var.args.getReferrer() != null) {
                mapC.put("Referer", w1Var.args.getReferrer());
            }
            return p013kotlin.collections.v0.r(new w30.h0(null, 1, null).a(f30.h0.INSTANCE.b()), p013kotlin.collections.v0.b(mapC));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    public w1(PaymentBrowserAuthContract.Args args, w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        ToolbarTitleData toolbarTitleData;
        String strA;
        p013kotlin.jvm.internal.s.k(args, "args");
        p013kotlin.jvm.internal.s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        p013kotlin.jvm.internal.s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.args = args;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.extraHeaders = jn0.m.b(new c());
        q80.k toolbarCustomization = args.getToolbarCustomization();
        this.buttonText = (toolbarCustomization == null || (strA = toolbarCustomization.A()) == null || p013kotlin.text.t.y0(strA)) ? null : strA;
        q80.k toolbarCustomization2 = args.getToolbarCustomization();
        if (toolbarCustomization2 == null) {
            toolbarTitleData = null;
        } else {
            String strH = toolbarCustomization2.h();
            strH = (strH == null || p013kotlin.text.t.y0(strH)) ? null : strH;
            if (strH != null) {
                p013kotlin.jvm.internal.s.h(strH);
                toolbarTitleData = new ToolbarTitleData(strH, toolbarCustomization2);
            } else {
                toolbarTitleData = null;
            }
        }
        this.toolbarTitle = toolbarTitleData;
        q80.k toolbarCustomization3 = args.getToolbarCustomization();
        this.toolbarBackgroundColor = toolbarCustomization3 != null ? toolbarCustomization3.e() : null;
    }

    private final void c(AnalyticsRequest request) {
        this.analyticsRequestExecutor.a(request);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    public final /* synthetic */ Intent g() {
        Intent intentPutExtras = new Intent().putExtras(Unvalidated.b(i(), null, this.args.getShouldCancelIntentOnUserNavigation() ? 3 : 1, null, this.args.getShouldCancelSource(), null, null, null, 117, null).i());
        p013kotlin.jvm.internal.s.j(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    public final Map<String, String> h() {
        return (Map) this.extraHeaders.getValue();
    }

    public final /* synthetic */ Unvalidated i() {
        String clientSecret = this.args.getClientSecret();
        String lastPathSegment = Uri.parse(this.args.getUrl()).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new Unvalidated(clientSecret, 0, null, false, lastPathSegment, null, this.args.getStripeAccountId(), 46, null);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getToolbarBackgroundColor() {
        return this.toolbarBackgroundColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final ToolbarTitleData getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final void l() {
        c(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeComplete, null, null, null, null, null, 62, null));
    }

    public final void m() {
        c(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeError, null, null, null, null, null, 62, null));
    }

    public final void n() {
        c(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeStart, null, null, null, null, null, 62, null));
        c(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthWithWebView, null, null, null, null, null, 62, null));
    }
}
