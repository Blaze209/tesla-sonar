package p011ja;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.d;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.r;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lja/u;", "Lja/s;", "Lja/t;", "Lja/e0;", "provider", "", "startDestination", PlaceTypes.ROUTE, "<init>", "(Lja/e0;Ljava/lang/String;Ljava/lang/String;)V", "Lja/r;", "D", "navDestination", "Ljn0/h0;", "h", "(Lja/s;)V", "destination", "f", "(Lja/r;)V", "g", "()Lja/t;", "Lja/e0;", IntegerTokenConverter.CONVERTER_KEY, "()Lja/e0;", "", "I", "startDestinationId", "j", "Ljava/lang/String;", "startDestinationRoute", "Lco0/d;", "k", "Lco0/d;", "startDestinationClass", "", "l", "Ljava/lang/Object;", "startDestinationObject", "", "m", "Ljava/util/List;", "destinations", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class u extends s<t> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final e0 provider;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int startDestinationId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String startDestinationRoute;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private d<?> startDestinationClass;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Object startDestinationObject;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<r> destinations;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/r;", "it", "", "a", "(Lja/r;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements l<r, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f83425c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(r it) {
            s.k(it, "it");
            String route = it.getRoute();
            s.h(route);
            return route;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e0 provider, String startDestination, String str) {
        super(provider.d(v.class), str);
        s.k(provider, "provider");
        s.k(startDestination, "startDestination");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationRoute = startDestination;
    }

    public final void f(r destination) {
        s.k(destination, "destination");
        this.destinations.add(destination);
    }

    @Override // p011ja.s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public t b() {
        t tVar = (t) super.b();
        tVar.B(this.destinations);
        int i11 = this.startDestinationId;
        if (i11 == 0 && this.startDestinationRoute == null && this.startDestinationClass == null && this.startDestinationObject == null) {
            if (getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            s.h(str);
            tVar.P(str);
            return tVar;
        }
        d<?> dVar = this.startDestinationClass;
        if (dVar != null) {
            s.h(dVar);
            tVar.Q(r.a(dVar), a.f83425c);
            return tVar;
        }
        Object obj = this.startDestinationObject;
        if (obj == null) {
            tVar.N(i11);
            return tVar;
        }
        s.h(obj);
        tVar.O(obj);
        return tVar;
    }

    public final <D extends r> void h(s<? extends D> navDestination) {
        s.k(navDestination, "navDestination");
        this.destinations.add(navDestination.b());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final e0 getProvider() {
        return this.provider;
    }
}
