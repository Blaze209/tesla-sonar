package tb;

import android.content.Context;
import android.os.PowerManager;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f113066a;

    static {
        String strI = androidx.work.z.i("WakeLocks");
        p013kotlin.jvm.internal.s.j(strI, "tagWithPrefix(...)");
        f113066a = strI;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        i0 i0Var = i0.f113069a;
        synchronized (i0Var) {
            i0Var.a().put(wakeLockNewWakeLock, str);
        }
        p013kotlin.jvm.internal.s.h(wakeLockNewWakeLock);
        return wakeLockNewWakeLock;
    }
}
