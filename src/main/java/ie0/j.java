package ie0;

import android.app.Activity;
import android.content.Intent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lie0/j;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Ljn0/h0;", "a", "(Landroid/app/Activity;)V", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f77587a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("ConnectionPreferencesUtils");

    private j() {
    }

    public final void a(Activity activity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        logger.j("action to Connection Preferences in app settings");
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", "com.android.settings.Settings$AdvancedConnectedDeviceActivity");
        activity.startActivity(intent);
    }
}
