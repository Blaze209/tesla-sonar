package k70;

import a70.DefaultReturnUrl;
import android.content.Context;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lk70/h;", "", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k70.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lk70/h$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "La70/a;", "a", "(Landroid/content/Context;)La70/a;", "Lpj0/a;", "Li70/a;", "lazyRegistry", "Lkotlin/Function1;", "Lcom/stripe/android/view/n;", "Lcom/stripe/android/a;", "c", "(Lpj0/a;)Lwn0/l;", "defaultReturnUrl", "Lf30/n;", "b", "(Lpj0/a;La70/a;)Lwn0/l;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: k70.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/view/n;", "host", "Lf30/n;", "a", "(Lcom/stripe/android/view/n;)Lf30/n;"}, k = 3, mv = {1, 9, 0})
        static final class C1810a extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.view.n, f30.n> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj0.a<i70.a> f85287c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ DefaultReturnUrl f85288d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1810a(pj0.a<i70.a> aVar, DefaultReturnUrl defaultReturnUrl) {
                super(1);
                this.f85287c = aVar;
                this.f85288d = defaultReturnUrl;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f30.n invoke(com.stripe.android.view.n host) {
                p013kotlin.jvm.internal.s.k(host, "host");
                ActivityResultLauncher<PaymentBrowserAuthContract.Args> activityResultLauncherF = this.f85287c.get().f();
                return activityResultLauncherF != null ? new f30.n.b(activityResultLauncherF) : new f30.n.a(host, this.f85288d);
            }
        }

        /* JADX INFO: renamed from: k70.h$a$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/view/n;", "host", "Lcom/stripe/android/a;", "a", "(Lcom/stripe/android/view/n;)Lcom/stripe/android/a;"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.view.n, com.stripe.android.a> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj0.a<i70.a> f85289c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(pj0.a<i70.a> aVar) {
                super(1);
                this.f85289c = aVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.a invoke(com.stripe.android.view.n host) {
                p013kotlin.jvm.internal.s.k(host, "host");
                ActivityResultLauncher<com.stripe.android.a.AbstractC0787a> activityResultLauncherG = this.f85289c.get().g();
                return activityResultLauncherG != null ? new com.stripe.android.a.c(activityResultLauncherG) : new com.stripe.android.a.b(host);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DefaultReturnUrl a(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            return DefaultReturnUrl.INSTANCE.a(context);
        }

        public final wn0.l<com.stripe.android.view.n, f30.n> b(pj0.a<i70.a> lazyRegistry, DefaultReturnUrl defaultReturnUrl) {
            p013kotlin.jvm.internal.s.k(lazyRegistry, "lazyRegistry");
            p013kotlin.jvm.internal.s.k(defaultReturnUrl, "defaultReturnUrl");
            return new C1810a(lazyRegistry, defaultReturnUrl);
        }

        public final wn0.l<com.stripe.android.view.n, com.stripe.android.a> c(pj0.a<i70.a> lazyRegistry) {
            p013kotlin.jvm.internal.s.k(lazyRegistry, "lazyRegistry");
            return new b(lazyRegistry);
        }

        private Companion() {
        }
    }
}
