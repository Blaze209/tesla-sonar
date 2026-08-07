package p011ja;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.d;
import com.google.android.libraries.places.api.model.PlaceTypes;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR*\u0010+\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00048\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u00101\u001a\u0004\u0018\u00010\f2\b\u0010%\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00102\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001bR\u0016\u00103\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u001bR6\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u0001042\f\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u0001048F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R.\u0010A\u001a\u0004\u0018\u00010\u00012\b\u0010%\u001a\u0004\u0018\u00010\u00018F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lja/z;", "", "<init>", "()V", "", "id", "Lkotlin/Function1;", "Lja/g0;", "Ljn0/h0;", "popUpToBuilder", "c", "(ILwn0/l;)V", "", PlaceTypes.ROUTE, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lwn0/l;)V", "Lja/b;", "animBuilder", "a", "(Lwn0/l;)V", "Lja/y;", "b", "()Lja/y;", "Lja/y$a;", "Lja/y$a;", "builder", "", "Z", "getLaunchSingleTop", "()Z", "e", "(Z)V", "launchSingleTop", "<set-?>", "getRestoreState", "h", "restoreState", "value", "I", "getPopUpToId", "()I", "f", "(I)V", "popUpToId", "Ljava/lang/String;", "getPopUpToRoute", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "popUpToRoute", "inclusive", "saveState", "Lco0/d;", "Lco0/d;", "getPopUpToRouteClass", "()Lco0/d;", "setPopUpToRouteClass", "(Lco0/d;)V", "popUpToRouteClass", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "setPopUpToRouteObject", "(Ljava/lang/Object;)V", "popUpToRouteObject", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean launchSingleTop;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean restoreState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String popUpToRoute;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean inclusive;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean saveState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private d<?> popUpToRouteClass;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Object popUpToRouteObject;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y.a builder = new y.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int popUpToId = -1;

    private final void g(String str) {
        if (str != null) {
            if (t.y0(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    public final void a(l<? super b, h0> animBuilder) {
        s.k(animBuilder, "animBuilder");
        b bVar = new b();
        animBuilder.invoke(bVar);
        this.builder.b(bVar.getEnter()).c(bVar.getExit()).e(bVar.getPopEnter()).f(bVar.getPopExit());
    }

    public final y b() {
        y.a aVar = this.builder;
        aVar.d(this.launchSingleTop);
        aVar.l(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            aVar.j(str, this.inclusive, this.saveState);
        } else {
            d<?> dVar = this.popUpToRouteClass;
            if (dVar != null) {
                s.h(dVar);
                aVar.h(dVar, this.inclusive, this.saveState);
            } else {
                Object obj = this.popUpToRouteObject;
                if (obj != null) {
                    s.h(obj);
                    aVar.i(obj, this.inclusive, this.saveState);
                } else {
                    aVar.g(this.popUpToId, this.inclusive, this.saveState);
                }
            }
        }
        return aVar.a();
    }

    public final void c(int id2, l<? super g0, h0> popUpToBuilder) {
        s.k(popUpToBuilder, "popUpToBuilder");
        f(id2);
        g(null);
        g0 g0Var = new g0();
        popUpToBuilder.invoke(g0Var);
        this.inclusive = g0Var.getInclusive();
        this.saveState = g0Var.getSaveState();
    }

    public final void d(String route, l<? super g0, h0> popUpToBuilder) {
        s.k(route, "route");
        s.k(popUpToBuilder, "popUpToBuilder");
        g(route);
        f(-1);
        g0 g0Var = new g0();
        popUpToBuilder.invoke(g0Var);
        this.inclusive = g0Var.getInclusive();
        this.saveState = g0Var.getSaveState();
    }

    public final void e(boolean z11) {
        this.launchSingleTop = z11;
    }

    public final void f(int i11) {
        this.popUpToId = i11;
        this.inclusive = false;
    }

    public final void h(boolean z11) {
        this.restoreState = z11;
    }
}
