package dd0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.tesla.logging.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/content/Intent;", "b", "()Landroid/content/Intent;", "Landroid/content/Context;", "", "pkg", "", "c", "(Landroid/content/Context;Ljava/lang/String;)Z", "Lcom/tesla/logging/g;", "a", "Lcom/tesla/logging/g;", "log", "app_prodGlobalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f60462a = g.INSTANCE.a("NavigationProvider");

    public static final Intent b() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        return intent;
    }

    public static final boolean c(Context context, String pkg) {
        s.k(context, "<this>");
        s.k(pkg, "pkg");
        try {
            context.getPackageManager().getPackageInfo(pkg, 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
