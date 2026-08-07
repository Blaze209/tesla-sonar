package ob;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.z;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006*\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR0\u0010 \u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0013\u0012\u0004\u0012\u00020\u000f0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lob/k;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "Ljn0/h0;", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Lob/b;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "b", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lwn0/l;)Lwn0/a;", DateTokenConverter.CONVERTER_KEY, "(Landroid/net/ConnectivityManager;)Landroid/net/NetworkCapabilities;", "", "Ljava/lang/Object;", "requestsLock", "", "c", "Ljava/util/Map;", "requests", "Landroid/net/NetworkCapabilities;", "getCachedCapabilities", "()Landroid/net/NetworkCapabilities;", "setCachedCapabilities", "(Landroid/net/NetworkCapabilities;)V", "cachedCapabilities", "", "e", "Z", "getCapabilitiesInitialized", "()Z", "setCapabilitiesInitialized", "(Z)V", "capabilitiesInitialized", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f97069a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Object requestsLock = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<wn0.l<b, h0>, NetworkRequest> requests = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static NetworkCapabilities cachedCapabilities;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static boolean capabilitiesInitialized;

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(wn0.l lVar, ConnectivityManager connectivityManager) {
        synchronized (requestsLock) {
            Map<wn0.l<b, h0>, NetworkRequest> map = requests;
            map.remove(lVar);
            if (map.isEmpty()) {
                z.e().a(n.f97080a, "NetworkRequestConstraintController unregister shared callback");
                ta0.a.f(f97069a);
                cachedCapabilities = null;
                capabilitiesInitialized = false;
            }
        }
        return h0.f84049a;
    }

    public final wn0.a<h0> b(final ConnectivityManager connManager, NetworkRequest networkRequest, final wn0.l<? super b, h0> onConstraintState) {
        s.k(connManager, "connManager");
        s.k(networkRequest, "networkRequest");
        s.k(onConstraintState, "onConstraintState");
        synchronized (requestsLock) {
            try {
                Map<wn0.l<b, h0>, NetworkRequest> map = requests;
                boolean zIsEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (zIsEmpty) {
                    z.e().a(n.f97080a, "NetworkRequestConstraintController register shared callback");
                    ta0.a.e(f97069a);
                }
                z.e().a(n.f97080a, "NetworkRequestConstraintController send initial capabilities");
                onConstraintState.invoke(networkRequest.canBeSatisfiedBy(f97069a.d(connManager)) ? b.a.f97044a : new b.ConstraintsNotMet(7));
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new wn0.a() { // from class: ob.j
            @Override // wn0.a
            public final Object invoke() {
                return k.c(onConstraintState, connManager);
            }
        };
    }

    public final NetworkCapabilities d(ConnectivityManager connectivityManager) {
        s.k(connectivityManager, "<this>");
        if (capabilitiesInitialized) {
            return cachedCapabilities;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        cachedCapabilities = networkCapabilities;
        capabilitiesInitialized = true;
        return networkCapabilities;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        s.k(network, "network");
        s.k(networkCapabilities, "networkCapabilities");
        z.e().a(n.f97080a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            try {
                cachedCapabilities = networkCapabilities;
                Iterator<T> it = requests.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((wn0.l) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? b.a.f97044a : new b.ConstraintsNotMet(7));
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        s.k(network, "network");
        z.e().a(n.f97080a, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            try {
                cachedCapabilities = null;
                Iterator<T> it = requests.keySet().iterator();
                while (it.hasNext()) {
                    ((wn0.l) it.next()).invoke(new b.ConstraintsNotMet(7));
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
