package ta0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.logging.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lta0/a;", "", "<init>", "()V", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Ljn0/h0;", "e", "(Landroid/net/ConnectivityManager$NetworkCallback;)V", "f", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)V", "c", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "", "Ljava/util/List;", "callbacks", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f113032a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("TeslaConnectivity");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final List<ConnectivityManager.NetworkCallback> callbacks = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final AtomicBoolean isRegistered = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ta0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"ta0/a$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Ljn0/h0;", "onAvailable", "(Landroid/net/Network;)V", "", "maxMsToLive", "onLosing", "(Landroid/net/Network;I)V", "onLost", "onUnavailable", "()V", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "Landroid/net/LinkProperties;", "linkProperties", "onLinkPropertiesChanged", "(Landroid/net/Network;Landroid/net/LinkProperties;)V", "", "blocked", "onBlockedStatusChanged", "(Landroid/net/Network;Z)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2413a extends ConnectivityManager.NetworkCallback {
        C2413a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            s.k(network, "network");
            super.onAvailable(network);
            a.logger.j("calling onAvailable " + a.callbacks.size());
            Iterator it = a.callbacks.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean blocked) {
            s.k(network, "network");
            super.onBlockedStatusChanged(network, blocked);
            a.logger.j("calling onBlockedStatusChanged " + a.callbacks.size());
            for (ConnectivityManager.NetworkCallback networkCallback : a.callbacks) {
                if (Build.VERSION.SDK_INT >= 29) {
                    networkCallback.onBlockedStatusChanged(network, blocked);
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            s.k(network, "network");
            s.k(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            a.logger.j("calling onCapabilitiesChanged " + a.callbacks.size());
            Iterator it = a.callbacks.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            s.k(network, "network");
            s.k(linkProperties, "linkProperties");
            super.onLinkPropertiesChanged(network, linkProperties);
            a.logger.j("calling onLinkPropertiesChanged " + a.callbacks.size());
            Iterator it = a.callbacks.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onLinkPropertiesChanged(network, linkProperties);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int maxMsToLive) {
            s.k(network, "network");
            super.onLosing(network, maxMsToLive);
            a.logger.j("calling onLosing " + a.callbacks.size());
            Iterator it = a.callbacks.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onLosing(network, maxMsToLive);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            s.k(network, "network");
            super.onLost(network);
            a.logger.j("calling onLost " + a.callbacks.size());
            Iterator it = a.callbacks.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            a.logger.j("calling onUnavailable " + a.callbacks.size());
            for (ConnectivityManager.NetworkCallback networkCallback : a.callbacks) {
                if (Build.VERSION.SDK_INT >= 26) {
                    networkCallback.onUnavailable();
                }
            }
        }
    }

    private a() {
    }

    public static final void e(ConnectivityManager.NetworkCallback networkCallback) {
        s.k(networkCallback, "networkCallback");
        logger.j("Tesla registerDefaultNetworkCallback called with: " + networkCallback);
        callbacks.add(networkCallback);
    }

    public static final void f(ConnectivityManager.NetworkCallback networkCallback) {
        s.k(networkCallback, "networkCallback");
        logger.j("Tesla unregisterNetworkCallback called with: " + networkCallback);
        callbacks.remove(networkCallback);
    }

    public final void c(Context context) {
        s.k(context, "context");
        if (isRegistered.compareAndSet(false, true)) {
            logger.j("initConnectivityManager");
            Object systemService = context.getSystemService("connectivity");
            s.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            try {
                ((ConnectivityManager) systemService).registerDefaultNetworkCallback(new C2413a());
            } catch (Exception e11) {
                if (s.f(e11.getClass().getSimpleName(), "TooManyRequestsException")) {
                    logger.d("TooManyRequestsException: Too many network callbacks registered", e11);
                } else {
                    logger.d("Exception when registering network callback", e11);
                }
            }
        }
    }

    public final void d(Context context) {
        s.k(context, "context");
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        c(applicationContext);
    }
}
