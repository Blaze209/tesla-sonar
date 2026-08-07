package com.stripe.android.payments.core.authentication.threeds2;

import a70.Unvalidated;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.n;
import f30.l;
import i70.f;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import t80.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0094@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R0\u0010.\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010\u0017\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00101¨\u00063"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/b;", "Li70/f;", "Lcom/stripe/android/model/StripeIntent;", "Lf30/l;", "config", "", "enableLogging", "Lkotlin/Function0;", "", "publishableKeyProvider", "", "productUsage", "<init>", "(Lf30/l;ZLwn0/a;Ljava/util/Set;)V", "Lh/b;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCallback;", "La70/c;", "activityResultCallback", "Ljn0/h0;", "b", "(Lh/b;Landroidx/activity/result/ActivityResultCallback;)V", "c", "()V", "Lcom/stripe/android/view/n;", "host", "actionable", "Lw30/l$c;", "requestOptions", "g", "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/StripeIntent;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lf30/l;", "Z", "Lwn0/a;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "e", "Landroidx/activity/result/ActivityResultLauncher;", "f", "()Landroidx/activity/result/ActivityResultLauncher;", "setStripe3ds2CompletionLauncher$payments_core_release", "(Landroidx/activity/result/ActivityResultLauncher;)V", "getStripe3ds2CompletionLauncher$payments_core_release$annotations", "stripe3ds2CompletionLauncher", "Lkotlin/Function1;", "Lcom/stripe/android/payments/core/authentication/threeds2/c;", "Lwn0/l;", "stripe3ds2CompletionStarterFactory", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends f<StripeIntent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean enableLogging;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> publishableKeyProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<String> productUsage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<Stripe3ds2TransactionContract.Args> stripe3ds2CompletionLauncher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<n, c> stripe3ds2CompletionStarterFactory;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/view/n;", "host", "Lcom/stripe/android/payments/core/authentication/threeds2/c;", "a", "(Lcom/stripe/android/view/n;)Lcom/stripe/android/payments/core/authentication/threeds2/c;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<n, c> {
        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(n host) {
            s.k(host, "host");
            ActivityResultLauncher<Stripe3ds2TransactionContract.Args> activityResultLauncherF = b.this.f();
            return activityResultLauncherF != null ? new c.b(activityResultLauncherF) : new c.a(host);
        }
    }

    public b(l config, boolean z11, wn0.a<String> publishableKeyProvider, Set<String> productUsage) {
        s.k(config, "config");
        s.k(publishableKeyProvider, "publishableKeyProvider");
        s.k(productUsage, "productUsage");
        this.config = config;
        this.enableLogging = z11;
        this.publishableKeyProvider = publishableKeyProvider;
        this.productUsage = productUsage;
        this.stripe3ds2CompletionStarterFactory = new a();
    }

    @Override // i70.f, g70.a
    public void b(h.b activityResultCaller, ActivityResultCallback<Unvalidated> activityResultCallback) {
        s.k(activityResultCaller, "activityResultCaller");
        s.k(activityResultCallback, "activityResultCallback");
        this.stripe3ds2CompletionLauncher = activityResultCaller.registerForActivityResult(new Stripe3ds2TransactionContract(), activityResultCallback);
    }

    @Override // i70.f, g70.a
    public void c() {
        ActivityResultLauncher<Stripe3ds2TransactionContract.Args> activityResultLauncher = this.stripe3ds2CompletionLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.d();
        }
        this.stripe3ds2CompletionLauncher = null;
    }

    public final ActivityResultLauncher<Stripe3ds2TransactionContract.Args> f() {
        return this.stripe3ds2CompletionLauncher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i70.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object e(n nVar, StripeIntent stripeIntent, w30.l.Options options, Continuation<? super h0> continuation) {
        c cVarInvoke = this.stripe3ds2CompletionStarterFactory.invoke(nVar);
        q qVarA = q.INSTANCE.a();
        l.Stripe3ds2Config stripe3ds2Config = this.config.getStripe3ds2Config();
        StripeIntent.a nextActionData = stripeIntent.getNextActionData();
        s.i(nextActionData, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2");
        cVarInvoke.a(new Stripe3ds2TransactionContract.Args(qVarA, stripe3ds2Config, stripeIntent, (StripeIntent.a.j.Use3DS2) nextActionData, options, this.enableLogging, nVar.getStatusBarColor(), this.publishableKeyProvider.invoke(), this.productUsage));
        return h0.f84049a;
    }
}
