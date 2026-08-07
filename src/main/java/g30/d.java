package g30;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f30.PaymentConfiguration;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import w30.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg30/d;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lg30/c;", "a", "(Landroid/content/Context;)Lg30/c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f67183a = new d();

    private d() {
    }

    public final c a(Context context) {
        s.k(context, "context");
        return new a(new o(o30.d.INSTANCE.a(false), Dispatchers.getIO()), new PaymentAnalyticsRequestFactory(context, PaymentConfiguration.INSTANCE.a(context).getPublishableKey(), null, 4, null), z30.c.INSTANCE.a(), Dispatchers.getIO());
    }
}
