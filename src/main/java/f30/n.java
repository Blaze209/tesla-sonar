package f30;

import a70.DefaultReturnUrl;
import androidx.p002activity.result.ActivityResultLauncher;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf30/n;", "Lcom/stripe/android/view/m;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "a", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface n extends com.stripe.android.view.m<PaymentBrowserAuthContract.Args> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf30/n$a;", "Lf30/n;", "Lcom/stripe/android/view/n;", "host", "La70/a;", "defaultReturnUrl", "<init>", "(Lcom/stripe/android/view/n;La70/a;)V", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "args", "Ljn0/h0;", "b", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;)V", "a", "Lcom/stripe/android/view/n;", "La70/a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.view.n host;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final DefaultReturnUrl defaultReturnUrl;

        public a(com.stripe.android.view.n host, DefaultReturnUrl defaultReturnUrl) {
            p013kotlin.jvm.internal.s.k(host, "host");
            p013kotlin.jvm.internal.s.k(defaultReturnUrl, "defaultReturnUrl");
            this.host = host;
            this.defaultReturnUrl = defaultReturnUrl;
        }

        @Override // com.stripe.android.view.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentBrowserAuthContract.Args args) {
            p013kotlin.jvm.internal.s.k(args, "args");
            this.host.b((args.q(this.defaultReturnUrl) || args.getIsInstantApp()) ? StripeBrowserLauncherActivity.class : PaymentAuthWebViewActivity.class, args.a((31743 & 1) != 0 ? args.objectId : null, (31743 & 2) != 0 ? args.requestCode : 0, (31743 & 4) != 0 ? args.clientSecret : null, (31743 & 8) != 0 ? args.url : null, (31743 & 16) != 0 ? args.returnUrl : null, (31743 & 32) != 0 ? args.enableLogging : false, (31743 & 64) != 0 ? args.toolbarCustomization : null, (31743 & 128) != 0 ? args.stripeAccountId : null, (31743 & 256) != 0 ? args.shouldCancelSource : false, (31743 & 512) != 0 ? args.shouldCancelIntentOnUserNavigation : false, (31743 & 1024) != 0 ? args.statusBarColor : this.host.getStatusBarColor(), (31743 & 2048) != 0 ? args.publishableKey : null, (31743 & 4096) != 0 ? args.isInstantApp : false, (31743 & PKIFailureInfo.certRevoked) != 0 ? args.referrer : null, (31743 & 16384) != 0 ? args.forceInAppWebView : false).s(), args.getRequestCode());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf30/n$b;", "Lf30/n;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "launcher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "args", "Ljn0/h0;", "b", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;)V", "a", "Landroidx/activity/result/ActivityResultLauncher;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ActivityResultLauncher<PaymentBrowserAuthContract.Args> launcher;

        public b(ActivityResultLauncher<PaymentBrowserAuthContract.Args> launcher) {
            p013kotlin.jvm.internal.s.k(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentBrowserAuthContract.Args args) {
            p013kotlin.jvm.internal.s.k(args, "args");
            this.launcher.b(args);
        }
    }
}
