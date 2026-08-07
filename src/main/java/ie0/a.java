package ie0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.tesla.logging.TeslaLog;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lie0/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Class;", "b", "(Landroid/content/Context;)Ljava/lang/Class;", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f77573a = new a();

    private a() {
    }

    public static final Intent a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Class<?> clsB = b(context);
        if (clsB == null) {
            return null;
        }
        return new Intent(context, clsB);
    }

    public static final Class<?> b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        try {
            String packageName = context.getPackageName();
            p013kotlin.jvm.internal.s.j(packageName, "getPackageName(...)");
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
            ComponentName component = launchIntentForPackage != null ? launchIntentForPackage.getComponent() : null;
            p013kotlin.jvm.internal.s.h(component);
            String className = component.getClassName();
            p013kotlin.jvm.internal.s.j(className, "getClassName(...)");
            return Class.forName(className);
        } catch (ClassNotFoundException e11) {
            TeslaLog.INSTANCE.e("ActivityHelpers", "Could not determine main activity class", e11);
            return null;
        }
    }
}
