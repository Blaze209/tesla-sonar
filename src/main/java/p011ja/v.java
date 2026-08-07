package p011ja;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@d0.b("navigation")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lja/v;", "Lja/d0;", "Lja/t;", "Lja/e0;", "navigatorProvider", "<init>", "(Lja/e0;)V", "Lja/k;", "entry", "Lja/y;", "navOptions", "Lja/d0$a;", "navigatorExtras", "Ljn0/h0;", "m", "(Lja/k;Lja/y;Lja/d0$a;)V", "l", "()Lja/t;", "", "entries", "e", "(Ljava/util/List;Lja/y;Lja/d0$a;)V", "c", "Lja/e0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class v extends d0<t> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e0 navigatorProvider;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Action.KEY_ATTRIBUTE, "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<String, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0<Bundle> f83427c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0<Bundle> n0Var) {
            super(1);
            this.f83427c = n0Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            s.k(key, "key");
            Bundle bundle = this.f83427c.f86529a;
            boolean z11 = true;
            if (bundle != null && bundle.containsKey(key)) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    public v(e0 navigatorProvider) {
        s.k(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.os.Bundle] */
    private final void m(k entry, y navOptions, d0.a navigatorExtras) {
        r destination = entry.getDestination();
        s.i(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        t tVar = (t) destination;
        n0 n0Var = new n0();
        n0Var.f86529a = entry.c();
        int startDestId = tVar.getStartDestId();
        String startDestinationRoute = tVar.getStartDestinationRoute();
        if (startDestId == 0 && startDestinationRoute == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + tVar.l()).toString());
        }
        r rVarE = startDestinationRoute != null ? tVar.E(startDestinationRoute, false) : tVar.G().e(startDestId);
        if (rVarE == null) {
            throw new IllegalArgumentException("navigation destination " + tVar.H() + " is not a direct child of this NavGraph");
        }
        if (startDestinationRoute != null) {
            if (!s.f(startDestinationRoute, rVarE.getRoute())) {
                r.b bVarT = rVarE.t(startDestinationRoute);
                Bundle matchingArgs = bVarT != null ? bVarT.getMatchingArgs() : null;
                if (matchingArgs != null && !matchingArgs.isEmpty()) {
                    ?? bundle = new Bundle();
                    bundle.putAll(matchingArgs);
                    T t11 = n0Var.f86529a;
                    if (((Bundle) t11) != null) {
                        bundle.putAll((Bundle) t11);
                    }
                    n0Var.f86529a = bundle;
                }
            }
            if (!rVarE.k().isEmpty()) {
                List<String> listA = j.a(rVarE.k(), new a(n0Var));
                if (!listA.isEmpty()) {
                    throw new IllegalArgumentException(("Cannot navigate to startDestination " + rVarE + ". Missing required arguments [" + listA + ']').toString());
                }
            }
        }
        this.navigatorProvider.e(rVarE.getNavigatorName()).e(p013kotlin.collections.v.e(b().a(rVarE, rVarE.h((Bundle) n0Var.f86529a))), navOptions, navigatorExtras);
    }

    @Override // p011ja.d0
    public void e(List<k> entries, y navOptions, d0.a navigatorExtras) {
        s.k(entries, "entries");
        Iterator<k> it = entries.iterator();
        while (it.hasNext()) {
            m(it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // p011ja.d0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t a() {
        return new t(this);
    }
}
