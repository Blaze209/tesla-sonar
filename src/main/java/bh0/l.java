package bh0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbh0/l;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "Landroid/app/Application;", "a", "()Landroid/app/Application;", "Landroid/view/Window;", DateTokenConverter.CONVERTER_KEY, "()Landroid/view/Window;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lec/r;", "c", "(Landroid/content/Context;)Lec/r;", "Landroid/app/Activity;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Activity activity;

    public l(Activity activity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        this.activity = activity;
    }

    public final Application a() {
        Application application = this.activity.getApplication();
        p013kotlin.jvm.internal.s.j(application, "getApplication(...)");
        return application;
    }

    public final Context b() {
        Context applicationContext = this.activity.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public final ec.r c(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return rc.h.a(new ec.r.a(context), true).g(null).c();
    }

    public final Window d() {
        Window window = this.activity.getWindow();
        p013kotlin.jvm.internal.s.j(window, "getWindow(...)");
        return window;
    }
}
