package pd0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.teslamotors.TeslaApp.MainActivity;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpd0/b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/os/Bundle;", StatusResponse.PAYLOAD, "Landroid/content/Intent;", "b", "(Landroid/content/Context;Landroid/os/Bundle;)Landroid/content/Intent;", "", "requestCode", "Landroid/app/PendingIntent;", "a", "(Landroid/content/Context;ILandroid/os/Bundle;)Landroid/app/PendingIntent;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f102110a = new b();

    private b() {
    }

    private final Intent b(Context context, Bundle payload) {
        Object objB;
        try {
            s.Companion companion = s.INSTANCE;
            MainActivity.Companion companion2 = MainActivity.INSTANCE;
            objB = s.b(MainActivity.class);
        } catch (Throwable th2) {
            s.Companion companion3 = s.INSTANCE;
            objB = s.b(t.a(th2));
        }
        if (s.g(objB)) {
            objB = null;
        }
        Class cls = (Class) objB;
        if (cls == null) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.setFlags(335544320);
        if (payload != null) {
            intent.putExtra("pushNotification", payload);
        }
        return intent;
    }

    public final PendingIntent a(Context context, int requestCode, Bundle payload) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Intent intentB = b(context, payload);
        if (intentB == null) {
            intentB = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intentB != null) {
                intentB.setFlags(335544320);
            } else {
                intentB = null;
            }
            if (intentB == null) {
                return null;
            }
        }
        return PendingIntent.getActivity(context, requestCode, intentB, 201326592);
    }
}
