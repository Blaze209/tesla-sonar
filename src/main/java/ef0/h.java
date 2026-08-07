package ef0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.teslamotors.plugins.ble.BLEService;
import ie0.e0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lef0/h;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "a", "(Landroid/content/Context;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "", "b", "(Landroid/content/Intent;)Z", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f62899a = new h();

    private h() {
    }

    public static final void a(Context context) {
        s.k(context, "context");
        Intent intent = new Intent(context, (Class<?>) BLEService.class);
        intent.putExtra("RESTARTED", true);
        intent.setAction("com.teslamotors.plugins.ble.action.RESTART_PROCESS");
        PendingIntent service = PendingIntent.getService(context, 1, intent, 335544320);
        Object systemService = context.getSystemService("alarm");
        s.i(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).set(1, System.currentTimeMillis() + ((long) 100), service);
        e0.i(context);
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static final boolean b(Intent intent) {
        return intent != null && intent.getBooleanExtra("RESTARTED", false);
    }
}
