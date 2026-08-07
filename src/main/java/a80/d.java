package a80;

import android.app.Application;
import android.content.Context;
import ezvcard.property.Kind;
import f30.PaymentConfiguration;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La80/d;", "", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "Landroid/content/Context;", "b", "(Landroid/app/Application;)Landroid/content/Context;", "appContext", "Lf30/o;", "a", "(Landroid/content/Context;)Lf30/o;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {
    public final PaymentConfiguration a(Context appContext) {
        s.k(appContext, "appContext");
        return PaymentConfiguration.INSTANCE.a(appContext);
    }

    public final Context b(Application application) {
        s.k(application, "application");
        return application;
    }
}
