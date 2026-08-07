package ie0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Lie0/h;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Landroid/content/Context;)Z", "Landroid/app/Activity;", "activity", "Ljn0/h0;", "a", "(Landroid/app/Activity;)V", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f77583a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("BatteryOptimizationUtils");

    private h() {
    }

    public final void a(Activity activity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        logger.j("requesting ignoring battery optimization # in app dialog");
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + activity.getPackageName()));
        activity.startActivityForResult(intent, 8816);
    }

    public final boolean b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("power");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        boolean zIsIgnoringBatteryOptimizations = ((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName());
        logger.j("fetching current status if ignored battery optimizations: [" + zIsIgnoringBatteryOptimizations + "]");
        return zIsIgnoringBatteryOptimizations;
    }
}
