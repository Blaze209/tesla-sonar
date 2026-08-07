package k40;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.d;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lk40/a;", "", "Landroid/app/Application;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/app/Application;)V", "Landroid/net/Uri;", "Landroid/content/Intent;", "f", "(Landroid/net/Uri;)Landroid/content/Intent;", AnalyticsAttribute.Intent, "", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Intent;)Ljava/lang/String;", "uri", "c", "", "a", "()Z", "e", "(Landroid/net/Uri;)Ljava/lang/String;", "b", "Landroid/app/Application;", "getContext", "()Landroid/app/Application;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Application context;

    public a(Application context) {
        s.k(context, "context");
        this.context = context;
    }

    private final Intent c(Uri uri) {
        d dVarB = new d.C0067d().j(2).b();
        dVarB.f2960a.setData(uri);
        Intent intent = dVarB.f2960a;
        s.j(intent, "intent");
        return intent;
    }

    private final String d(Intent intent) {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoResolveActivity = this.context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }

    private final Intent f(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    public final boolean a() {
        Uri uri = Uri.parse("https://");
        s.j(uri, "parse(...)");
        return e(uri) != null;
    }

    public final Intent b(Uri uri) {
        s.k(uri, "uri");
        Intent intentF = f(uri);
        String strD = d(intentF);
        return (strD == null || !t.h0(strD, "org.mozilla", false, 2, null)) ? c(uri) : intentF;
    }

    public final String e(Uri uri) {
        Object objB;
        s.k(uri, "uri");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(d(f(uri)));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        return (String) objB;
    }
}
