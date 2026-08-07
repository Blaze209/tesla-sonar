package ie0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lie0/a0;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Landroid/content/Context;)Z", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f77574a = new a0();

    private a0() {
    }

    public final String a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("connectivity");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "-";
        }
        return activeNetworkInfo.getType() == 1 ? "wifi" : "cellular";
    }

    public final boolean b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("connectivity");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
