package ie0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lie0/z;", "", "<init>", "()V", "", "isConnected", "Ljn0/h0;", "c", "(Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "(Landroid/content/Context;)V", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Lwm0/e;", "Lwm0/e;", "connectedEvents", "ie0/z$a", DateTokenConverter.CONVERTER_KEY, "Lie0/z$a;", "networkCallback", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f77633a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("NetworkListener");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final wm0.e<Boolean> connectedEvents;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final a networkCallback;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ie0/z$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Ljn0/h0;", "onAvailable", "(Landroid/net/Network;)V", "onLost", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            p013kotlin.jvm.internal.s.k(network, "network");
            super.onAvailable(network);
            z.logger.j("network available.");
            z.f77633a.c(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            p013kotlin.jvm.internal.s.k(network, "network");
            super.onLost(network);
            z.logger.j("network lost.");
            z.f77633a.c(false);
        }
    }

    static {
        wm0.e eVarB0 = wm0.a.d0().b0();
        p013kotlin.jvm.internal.s.j(eVarB0, "toSerialized(...)");
        connectedEvents = eVarB0;
        networkCallback = new a();
    }

    private z() {
    }

    public final void b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("connectivity");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ta0.a.e(networkCallback);
    }

    public final void c(boolean isConnected) {
        connectedEvents.onNext(Boolean.valueOf(isConnected));
    }
}
