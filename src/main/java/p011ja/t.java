package p011ja;

import androidx.collection.a1;
import androidx.collection.y0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Gender;
import ho0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import ro0.d;
import ro0.r;
import wn0.l;
import xn0.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000 X2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001YB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00172\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J-\u0010\"\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\tH\u0007¢\u0006\u0004\b'\u0010(J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010)H\u0086\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b,\u0010\u0019J\u0015\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u0017\"\b\b\u0000\u00104*\u0002032\u0006\u00100\u001a\u00028\u0000¢\u0006\u0004\b5\u00106J7\u0010;\u001a\u00020\u0017\"\u0004\b\u0000\u001042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000709H\u0007¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0007H\u0016¢\u0006\u0004\b=\u0010>J\u001a\u0010@\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u001eH\u0016¢\u0006\u0004\bB\u0010CR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010D8G¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010-\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR.\u0010Q\u001a\u0004\u0018\u00010\u00072\b\u00100\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010L\u001a\u0004\bO\u0010>\"\u0004\bP\u00102R$\u0010S\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e8G@BX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010C\"\u0004\bR\u0010/R\u0014\u0010U\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010>R\u0011\u0010W\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bV\u0010>¨\u0006Z"}, d2 = {"Lja/t;", "Lja/r;", "", "Lja/d0;", "navGraphNavigator", "<init>", "(Lja/d0;)V", "", PlaceTypes.ROUTE, "", "searchChildren", "searchParent", "lastVisited", "Lja/r$b;", "L", "(Ljava/lang/String;ZZLja/r;)Lja/r$b;", "Lja/q;", "navDeepLinkRequest", "K", "(Lja/q;ZZLja/r;)Lja/r$b;", "s", "(Lja/q;)Lja/r$b;", "node", "Ljn0/h0;", "A", "(Lja/r;)V", "", "nodes", "B", "(Ljava/util/Collection;)V", "", "resId", "C", "(I)Lja/r;", Gender.FEMALE, "(ILja/r;Z)Lja/r;", "D", "(Ljava/lang/String;)Lja/r;", "searchParents", "E", "(Ljava/lang/String;Z)Lja/r;", "", "iterator", "()Ljava/util/Iterator;", Gender.MALE, "startDestId", Gender.NONE, "(I)V", "startDestRoute", "P", "(Ljava/lang/String;)V", "", "T", Gender.OTHER, "(Ljava/lang/Object;)V", "Lro0/d;", "serializer", "Lkotlin/Function1;", "parseRoute", "Q", "(Lro0/d;Lwn0/l;)V", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/collection/y0;", "m", "Landroidx/collection/y0;", "G", "()Landroidx/collection/y0;", "n", "I", "o", "Ljava/lang/String;", "startDestIdName", "p", "J", "S", "startDestinationRoute", "R", "startDestinationId", "l", "displayName", "H", "startDestDisplayName", "q", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class t extends r implements Iterable<r>, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final y0<r> nodes;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int startDestId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String startDestIdName;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String startDestinationRoute;

    /* JADX INFO: renamed from: ja.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lja/t$a;", "", "<init>", "()V", "Lja/t;", "Lja/r;", "b", "(Lja/t;)Lja/r;", "Lho0/i;", "a", "(Lja/t;)Lho0/i;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: ja.t$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/r;", "it", "a", "(Lja/r;)Lja/r;"}, k = 3, mv = {1, 8, 0})
        static final class C1756a extends u implements l<r, r> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1756a f83414c = new C1756a();

            C1756a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke(r it) {
                s.k(it, "it");
                if (!(it instanceof t)) {
                    return null;
                }
                t tVar = (t) it;
                return tVar.C(tVar.getStartDestId());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i<r> a(t tVar) {
            s.k(tVar, "<this>");
            return ho0.l.q(tVar, C1756a.f83414c);
        }

        public final r b(t tVar) {
            s.k(tVar, "<this>");
            return (r) ho0.l.S(a(tVar));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"ja/t$b", "", "Lja/r;", "", "hasNext", "()Z", "b", "()Lja/r;", "Ljn0/h0;", "remove", "()V", "", "a", "I", "index", "Z", "wentToNext", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Iterator<r>, a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean wentToNext;

        b() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.wentToNext = true;
            y0<r> y0VarG = t.this.G();
            int i11 = this.index + 1;
            this.index = i11;
            return y0VarG.m(i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index + 1 < t.this.G().l();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.wentToNext) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            y0<r> y0VarG = t.this.G();
            y0VarG.m(this.index).x(null);
            y0VarG.j(this.index);
            this.index--;
            this.wentToNext = false;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lja/r;", "startDestination", "", "a", "(Lja/r;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<r, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f83418c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(T t11) {
            super(1);
            this.f83418c = t11;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(r startDestination) {
            s.k(startDestination, "startDestination");
            Map<String, h> mapK = startDestination.k();
            LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapK.size()));
            Iterator<T> it = mapK.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), ((h) entry.getValue()).a());
            }
            return la.c.c(this.f83418c, linkedHashMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d0<? extends t> navGraphNavigator) {
        super(navGraphNavigator);
        s.k(navGraphNavigator, "navGraphNavigator");
        this.nodes = new y0<>(0, 1, null);
    }

    private final void R(int i11) {
        if (i11 != getId()) {
            if (this.startDestinationRoute != null) {
                S(null);
            }
            this.startDestId = i11;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i11 + " cannot use the same id as the graph " + this).toString());
    }

    private final void S(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (s.f(str, getRoute())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (p013kotlin.text.t.y0(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = r.INSTANCE.a(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    public final void A(r node) {
        s.k(node, "node");
        int id2 = node.getId();
        String route = node.getRoute();
        if (id2 == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (getRoute() != null && s.f(route, getRoute())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (id2 == getId()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        r rVarE = this.nodes.e(id2);
        if (rVarE == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (rVarE != null) {
            rVarE.x(null);
        }
        node.x(this);
        this.nodes.i(node.getId(), node);
    }

    public final void B(Collection<? extends r> nodes) {
        s.k(nodes, "nodes");
        for (r rVar : nodes) {
            if (rVar != null) {
                A(rVar);
            }
        }
    }

    public final r C(int resId) {
        return F(resId, this, false);
    }

    public final r D(String route) {
        if (route == null || p013kotlin.text.t.y0(route)) {
            return null;
        }
        return E(route, true);
    }

    public final r E(String route, boolean searchParents) {
        Object next;
        r rVar;
        s.k(route, "route");
        Iterator it = ho0.l.h(a1.b(this.nodes)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            rVar = (r) next;
            if (p013kotlin.text.t.N(rVar.getRoute(), route, false, 2, null)) {
                break;
            }
        } while (rVar.t(route) == null);
        r rVar2 = (r) next;
        if (rVar2 != null) {
            return rVar2;
        }
        if (!searchParents || getParent() == null) {
            return null;
        }
        t parent = getParent();
        s.h(parent);
        return parent.D(route);
    }

    public final r F(int resId, r lastVisited, boolean searchChildren) {
        r rVarE = this.nodes.e(resId);
        if (rVarE != null) {
            return rVarE;
        }
        if (searchChildren) {
            Iterator it = ho0.l.h(a1.b(this.nodes)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    rVarE = null;
                    break;
                }
                r rVar = (r) it.next();
                r rVarF = (!(rVar instanceof t) || s.f(rVar, lastVisited)) ? null : ((t) rVar).F(resId, this, true);
                if (rVarF != null) {
                    rVarE = rVarF;
                    break;
                }
            }
        }
        if (rVarE != null) {
            return rVarE;
        }
        if (getParent() == null || s.f(getParent(), lastVisited)) {
            return null;
        }
        t parent = getParent();
        s.h(parent);
        return parent.F(resId, this, searchChildren);
    }

    public final y0<r> G() {
        return this.nodes;
    }

    public final String H() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        String str = this.startDestIdName;
        s.h(str);
        return str;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    public final r.b K(q navDeepLinkRequest, boolean searchChildren, boolean searchParent, r lastVisited) {
        r.b bVar;
        s.k(navDeepLinkRequest, "navDeepLinkRequest");
        s.k(lastVisited, "lastVisited");
        r.b bVarS = super.s(navDeepLinkRequest);
        r.b bVarK = null;
        if (searchChildren) {
            ArrayList arrayList = new ArrayList();
            for (r rVar : this) {
                r.b bVarS2 = !s.f(rVar, lastVisited) ? rVar.s(navDeepLinkRequest) : null;
                if (bVarS2 != null) {
                    arrayList.add(bVarS2);
                }
            }
            bVar = (r.b) v.E0(arrayList);
        } else {
            bVar = null;
        }
        t parent = getParent();
        if (parent != null && searchParent && !s.f(parent, lastVisited)) {
            bVarK = parent.K(navDeepLinkRequest, searchChildren, true, this);
        }
        return (r.b) v.E0(v.r(bVarS, bVar, bVarK));
    }

    public final r.b L(String route, boolean searchChildren, boolean searchParent, r lastVisited) {
        r.b bVar;
        s.k(route, "route");
        s.k(lastVisited, "lastVisited");
        r.b bVarT = t(route);
        r.b bVarL = null;
        if (searchChildren) {
            ArrayList arrayList = new ArrayList();
            for (r rVar : this) {
                r.b bVarL2 = s.f(rVar, lastVisited) ? null : rVar instanceof t ? ((t) rVar).L(route, true, false, this) : rVar.t(route);
                if (bVarL2 != null) {
                    arrayList.add(bVarL2);
                }
            }
            bVar = (r.b) v.E0(arrayList);
        } else {
            bVar = null;
        }
        t parent = getParent();
        if (parent != null && searchParent && !s.f(parent, lastVisited)) {
            bVarL = parent.L(route, searchChildren, true, this);
        }
        return (r.b) v.E0(v.r(bVarT, bVar, bVarL));
    }

    public final void M(r node) {
        s.k(node, "node");
        int iF = this.nodes.f(node.getId());
        if (iF >= 0) {
            this.nodes.m(iF).x(null);
            this.nodes.j(iF);
        }
    }

    public final void N(int startDestId) {
        R(startDestId);
    }

    public final <T> void O(T startDestRoute) {
        s.k(startDestRoute, "startDestRoute");
        Q(r.a(o0.b(startDestRoute.getClass())), new c(startDestRoute));
    }

    public final void P(String startDestRoute) {
        s.k(startDestRoute, "startDestRoute");
        S(startDestRoute);
    }

    public final <T> void Q(d<T> serializer, l<? super r, String> parseRoute) {
        s.k(serializer, "serializer");
        s.k(parseRoute, "parseRoute");
        int iB = la.c.b(serializer);
        r rVarC = C(iB);
        if (rVarC != null) {
            S(parseRoute.invoke(rVarC));
            this.startDestId = iB;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + serializer.getDescriptor().getSerialName() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }

    @Override // p011ja.r
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof t) && super.equals(other)) {
            t tVar = (t) other;
            if (this.nodes.l() == tVar.nodes.l() && getStartDestId() == tVar.getStartDestId()) {
                for (r rVar : ho0.l.h(a1.b(this.nodes))) {
                    if (!s.f(rVar, tVar.nodes.e(rVar.getId()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p011ja.r
    public int hashCode() {
        int startDestId = getStartDestId();
        y0<r> y0Var = this.nodes;
        int iL = y0Var.l();
        for (int i11 = 0; i11 < iL; i11++) {
            startDestId = (((startDestId * 31) + y0Var.h(i11)) * 31) + y0Var.m(i11).hashCode();
        }
        return startDestId;
    }

    @Override // java.lang.Iterable
    public final Iterator<r> iterator() {
        return new b();
    }

    @Override // p011ja.r
    public String l() {
        return getId() != 0 ? super.l() : "the root navigation";
    }

    @Override // p011ja.r
    public r.b s(q navDeepLinkRequest) {
        s.k(navDeepLinkRequest, "navDeepLinkRequest");
        return K(navDeepLinkRequest, true, false, this);
    }

    @Override // p011ja.r
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        r rVarD = D(this.startDestinationRoute);
        if (rVarD == null) {
            rVarD = C(getStartDestId());
        }
        sb2.append(" startDestination=");
        if (rVarD == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(rVarD.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        s.j(string, "sb.toString()");
        return string;
    }
}
