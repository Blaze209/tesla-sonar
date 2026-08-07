package ob;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.z;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B!\b\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lob/d;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlin/Function1;", "Lob/b;", "Ljn0/h0;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "<init>", "(Lwn0/l;)V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "a", "Lwn0/l;", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<b, h0> onConstraintState;

    /* JADX INFO: renamed from: ob.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lob/d$a;", "", "<init>", "()V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Lob/b;", "Ljn0/h0;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "b", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lwn0/l;)Lwn0/a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 c(j0 j0Var, ConnectivityManager connectivityManager, d dVar) {
            if (j0Var.f86523a) {
                z.e().a(n.f97080a, "NetworkRequestConstraintController unregister callback");
                ta0.a.f(dVar);
            }
            return h0.f84049a;
        }

        public final wn0.a<h0> b(final ConnectivityManager connManager, NetworkRequest networkRequest, wn0.l<? super b, h0> onConstraintState) {
            s.k(connManager, "connManager");
            s.k(networkRequest, "networkRequest");
            s.k(onConstraintState, "onConstraintState");
            final d dVar = new d(onConstraintState, null);
            final j0 j0Var = new j0();
            try {
                z.e().a(n.f97080a, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, dVar);
                j0Var.f86523a = true;
            } catch (RuntimeException e11) {
                String name = e11.getClass().getName();
                s.j(name, "getName(...)");
                if (!t.L(name, "TooManyRequestsException", false, 2, null)) {
                    throw e11;
                }
                z.e().b(n.f97080a, "NetworkRequestConstraintController couldn't register callback", e11);
                onConstraintState.invoke(new b.ConstraintsNotMet(7));
            }
            return new wn0.a() { // from class: ob.c
                @Override // wn0.a
                public final Object invoke() {
                    return d.Companion.c(j0Var, connManager, dVar);
                }
            };
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(wn0.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        s.k(network, "network");
        s.k(networkCapabilities, "networkCapabilities");
        z.e().a(n.f97080a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.invoke(b.a.f97044a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        s.k(network, "network");
        z.e().a(n.f97080a, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.invoke(new b.ConstraintsNotMet(7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(wn0.l<? super b, h0> lVar) {
        this.onConstraintState = lVar;
    }
}
