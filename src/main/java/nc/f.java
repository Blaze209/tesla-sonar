package nc;

import android.content.Context;
import android.net.ConnectivityManager;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lnc/d;", "a", "(Landroid/content/Context;)Lnc/d;", "coil-network-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final d a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.b.getSystemService(applicationContext, ConnectivityManager.class);
        if (connectivityManager == null || !oc.f.b(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return d.f93717b;
        }
        try {
            return new e(connectivityManager);
        } catch (Exception unused) {
            return d.f93717b;
        }
    }
}
