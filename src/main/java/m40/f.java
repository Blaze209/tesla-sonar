package m40;

import android.app.Application;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import o30.ApiVersion;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm40/f;", "", "<init>", "()V", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/financialconnections/a$b;)Ljava/lang/String;", "e", "", "c", "()Z", "Landroid/app/Application;", Kind.APPLICATION, "b", "(Landroid/app/Application;)Ljava/lang/String;", "Lo30/b;", "a", "()Lo30/b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f91173a = new f();

    private f() {
    }

    public final ApiVersion a() {
        return new ApiVersion(d1.c("financial_connections_client_api_beta=v1"));
    }

    public final String b(Application application) {
        p013kotlin.jvm.internal.s.k(application, "application");
        String packageName = application.getPackageName();
        p013kotlin.jvm.internal.s.j(packageName, "getPackageName(...)");
        return packageName;
    }

    public final boolean c() {
        return false;
    }

    public final String d(com.stripe.android.financialconnections.a.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        return configuration.getPublishableKey();
    }

    public final String e(com.stripe.android.financialconnections.a.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        return configuration.getStripeAccountId();
    }
}
