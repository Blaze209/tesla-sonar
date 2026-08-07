package qb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.work.z;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ob.NetworkState;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import tb.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u0013\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lqb/j;", "Lqb/h;", "Lob/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lub/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lub/b;)V", "k", "()Lob/h;", "Ljn0/h0;", "h", "()V", IntegerTokenConverter.CONVERTER_KEY, "Landroid/net/ConnectivityManager;", "f", "Landroid/net/ConnectivityManager;", "connectivityManager", "qb/j$a", "g", "Lqb/j$a;", "networkCallback", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends h<NetworkState> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a networkCallback;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"qb/j$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "capabilities", "Ljn0/h0;", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            s.k(network, "network");
            s.k(capabilities, "capabilities");
            z.e().a(k.f105306a, "Network capabilities changed: " + capabilities);
            j jVar = j.this;
            jVar.g(Build.VERSION.SDK_INT >= 28 ? k.d(capabilities) : k.c(jVar.connectivityManager));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            s.k(network, "network");
            z.e().a(k.f105306a, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.connectivityManager));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, ub.b taskExecutor) {
        super(context, taskExecutor);
        s.k(context, "context");
        s.k(taskExecutor, "taskExecutor");
        Object systemService = getAppContext().getSystemService("connectivity");
        s.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        this.networkCallback = new a();
    }

    @Override // qb.h
    public void h() {
        try {
            z.e().a(k.f105306a, "Registering network callback");
            q.a(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e11) {
            z.e().d(k.f105306a, "Received exception while registering network callback", e11);
        } catch (SecurityException e12) {
            z.e().d(k.f105306a, "Received exception while registering network callback", e12);
        }
    }

    @Override // qb.h
    public void i() {
        try {
            z.e().a(k.f105306a, "Unregistering network callback");
            ta0.a.f(this.networkCallback);
        } catch (IllegalArgumentException e11) {
            z.e().d(k.f105306a, "Received exception while unregistering network callback", e11);
        } catch (SecurityException e12) {
            z.e().d(k.f105306a, "Received exception while unregistering network callback", e12);
        }
    }

    @Override // qb.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public NetworkState e() {
        return k.c(this.connectivityManager);
    }
}
