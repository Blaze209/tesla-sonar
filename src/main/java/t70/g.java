package t70;

import android.app.Application;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import ezvcard.property.Kind;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lt70/g;", "", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "Landroid/content/Context;", "f", "(Landroid/app/Application;)Landroid/content/Context;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "a", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "", "", "c", "()Ljava/util/Set;", "Lcom/stripe/android/paymentsheet/flowcontroller/f;", "viewModel", "Lkotlinx/coroutines/CoroutineScope;", "e", "(Lcom/stripe/android/paymentsheet/flowcontroller/f;)Lkotlinx/coroutines/CoroutineScope;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo90/f;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Lo90/f;", "", "b", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f112862a = new g();

    private g() {
    }

    public final EventReporter.Mode a() {
        return EventReporter.Mode.Custom;
    }

    public final boolean b() {
        return true;
    }

    public final Set<String> c() {
        return d1.c("PaymentSheet.FlowController");
    }

    public final o90.f d(Context context) {
        s.k(context, "context");
        return new o90.f(context, null, null, null, null, 30, null);
    }

    public final CoroutineScope e(com.stripe.android.paymentsheet.flowcontroller.f viewModel) {
        s.k(viewModel, "viewModel");
        return androidx.p003lifecycle.d1.a(viewModel);
    }

    public final Context f(Application application) {
        s.k(application, "application");
        Context applicationContext = application.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }
}
