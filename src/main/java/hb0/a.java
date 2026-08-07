package hb0;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.command.CommandRequestBroadcastReceiver;
import com.tesla.logging.g;
import ic0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, d2 = {"Lhb0/a;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lic0/e;", "a", "(Landroid/content/Intent;)Lic0/e;", "", "c", "(Landroid/content/Intent;)I", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "notificationId", "", "productId", "Lhb0/b;", "action", "b", "(Landroid/content/Context;ILjava/lang/String;Lhb0/b;)Landroid/content/Intent;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f72473a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("CommandNotificationActionIntentFactory");

    private a() {
    }

    public final e a(Intent intent) {
        s.k(intent, "intent");
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("NotificationAction:CommandRequest");
            if (byteArrayExtra != null) {
                return e.f77490w.decode(byteArrayExtra);
            }
            return null;
        } catch (Exception e11) {
            logger.d("Failure to get command request", e11);
            return null;
        }
    }

    public final Intent b(Context context, int notificationId, String productId, b action) {
        byte[] bArrEncode;
        s.k(context, "context");
        s.k(productId, "productId");
        s.k(action, "action");
        try {
            bArrEncode = action.a(productId).encode();
        } catch (Exception e11) {
            logger.d("Failure to build or encode command request", e11);
            bArrEncode = null;
        }
        Intent intent = new Intent(context, (Class<?>) CommandRequestBroadcastReceiver.class);
        if (bArrEncode != null) {
            intent.putExtra("NotificationAction:CommandRequest", bArrEncode);
        }
        intent.putExtra("NotificationAction:NotificationId", notificationId);
        return intent;
    }

    public final int c(Intent intent) {
        s.k(intent, "intent");
        return intent.getIntExtra("NotificationAction:NotificationId", 0);
    }
}
