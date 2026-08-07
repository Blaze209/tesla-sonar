package p011ja;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.d;
import com.google.android.libraries.places.api.model.PlaceTypes;
import la.c;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import ro0.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001:\u0001#B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0014BQ\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010 R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$R\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b#\u0010 R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b%\u0010 R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b&\u0010 R\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b)\u0010 R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b*\u0010\"R0\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b+\u00100R(\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010-\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b,\u00102¨\u00063"}, d2 = {"Lja/y;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "Lco0/d;", "popUpToRouteClass", "(ZZLco0/d;ZZIIII)V", "popUpToRouteObject", "(ZZLjava/lang/Object;ZZIIII)V", "j", "()Z", "l", IntegerTokenConverter.CONVERTER_KEY, "k", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Z", "b", "c", "I", "e", DateTokenConverter.CONVERTER_KEY, "f", "g", "h", "<set-?>", "Ljava/lang/String;", "Lco0/d;", "()Lco0/d;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleTop;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean restoreState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int popUpToId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToInclusive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToSaveState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int enterAnim;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int exitAnim;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int popEnterAnim;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int popExitAnim;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String popUpToRoute;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private d<?> popUpToRouteClass;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Object popUpToRouteObject;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00020\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0019\u001a\u00020\u0000\"\b\b\u0000\u0010\u0018*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020\n¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001dJ\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010'R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u001c\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010(R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010(¨\u00063"}, d2 = {"Lja/y$a;", "", "<init>", "()V", "", "singleTop", DateTokenConverter.CONVERTER_KEY, "(Z)Lja/y$a;", "restoreState", "l", "", "destinationId", "inclusive", "saveState", "g", "(IZZ)Lja/y$a;", "", PlaceTypes.ROUTE, "j", "(Ljava/lang/String;ZZ)Lja/y$a;", "Lco0/d;", "klass", "h", "(Lco0/d;ZZ)Lja/y$a;", "T", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;ZZ)Lja/y$a;", "enterAnim", "b", "(I)Lja/y$a;", "exitAnim", "c", "popEnterAnim", "e", "popExitAnim", "f", "Lja/y;", "a", "()Lja/y;", "Z", "I", "popUpToId", "Ljava/lang/String;", "popUpToRoute", "Lco0/d;", "popUpToRouteClass", "Ljava/lang/Object;", "popUpToRouteObject", "popUpToInclusive", "popUpToSaveState", "k", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean singleTop;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean restoreState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String popUpToRoute;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private d<?> popUpToRouteClass;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Object popUpToRouteObject;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean popUpToInclusive;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean popUpToSaveState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int popUpToId = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int enterAnim = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int exitAnim = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private int popEnterAnim = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private int popExitAnim = -1;

        public static /* synthetic */ a k(a aVar, int i11, boolean z11, boolean z12, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                z12 = false;
            }
            return aVar.g(i11, z11, z12);
        }

        public final y a() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new y(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            d<?> dVar = this.popUpToRouteClass;
            if (dVar != null) {
                return new y(this.singleTop, this.restoreState, dVar, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            Object obj = this.popUpToRouteObject;
            if (obj == null) {
                return new y(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            boolean z11 = this.singleTop;
            boolean z12 = this.restoreState;
            s.h(obj);
            return new y(z11, z12, obj, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        public final a b(int enterAnim) {
            this.enterAnim = enterAnim;
            return this;
        }

        public final a c(int exitAnim) {
            this.exitAnim = exitAnim;
            return this;
        }

        public final a d(boolean singleTop) {
            this.singleTop = singleTop;
            return this;
        }

        public final a e(int popEnterAnim) {
            this.popEnterAnim = popEnterAnim;
            return this;
        }

        public final a f(int popExitAnim) {
            this.popExitAnim = popExitAnim;
            return this;
        }

        public final a g(int destinationId, boolean inclusive, boolean saveState) {
            this.popUpToId = destinationId;
            this.popUpToRoute = null;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final a h(d<?> klass, boolean inclusive, boolean saveState) {
            s.k(klass, "klass");
            this.popUpToRouteClass = klass;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final <T> a i(T route, boolean inclusive, boolean saveState) {
            s.k(route, "route");
            this.popUpToRouteObject = route;
            g(c.b(r.a(o0.b(route.getClass()))), inclusive, saveState);
            return this;
        }

        public final a j(String route, boolean inclusive, boolean saveState) {
            this.popUpToRoute = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final a l(boolean restoreState) {
            this.restoreState = restoreState;
            return this;
        }
    }

    public y(boolean z11, boolean z12, int i11, boolean z13, boolean z14, int i12, int i13, int i14, int i15) {
        this.singleTop = z11;
        this.restoreState = z12;
        this.popUpToId = i11;
        this.popUpToInclusive = z13;
        this.popUpToSaveState = z14;
        this.enterAnim = i12;
        this.exitAnim = i13;
        this.popEnterAnim = i14;
        this.popExitAnim = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEnterAnim() {
        return this.enterAnim;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getExitAnim() {
        return this.exitAnim;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof y)) {
            y yVar = (y) other;
            if (this.singleTop == yVar.singleTop && this.restoreState == yVar.restoreState && this.popUpToId == yVar.popUpToId && s.f(this.popUpToRoute, yVar.popUpToRoute) && s.f(this.popUpToRouteClass, yVar.popUpToRouteClass) && s.f(this.popUpToRouteObject, yVar.popUpToRouteObject) && this.popUpToInclusive == yVar.popUpToInclusive && this.popUpToSaveState == yVar.popUpToSaveState && this.enterAnim == yVar.enterAnim && this.exitAnim == yVar.exitAnim && this.popEnterAnim == yVar.popEnterAnim && this.popExitAnim == yVar.popExitAnim) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public final d<?> g() {
        return this.popUpToRouteClass;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public int hashCode() {
        int i11 = (((((getSingleTop() ? 1 : 0) * 31) + (getRestoreState() ? 1 : 0)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        int iHashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        d<?> dVar = this.popUpToRouteClass;
        int iHashCode2 = (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Object obj = this.popUpToRouteObject;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (getPopUpToInclusive() ? 1 : 0)) * 31) + (getPopUpToSaveState() ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getSingleTop() {
        return this.singleTop;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y.class.getSimpleName());
        sb2.append("(");
        if (this.singleTop) {
            sb2.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb2.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb2.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                d<?> dVar = this.popUpToRouteClass;
                if (dVar != null) {
                    sb2.append(dVar);
                } else {
                    Object obj = this.popUpToRouteObject;
                    if (obj != null) {
                        sb2.append(obj);
                    } else {
                        sb2.append("0x");
                        sb2.append(Integer.toHexString(this.popUpToId));
                    }
                }
            }
            if (this.popUpToInclusive) {
                sb2.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.enterAnim));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.exitAnim));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.popEnterAnim));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.popExitAnim));
            sb2.append(")");
        }
        String string = sb2.toString();
        s.j(string, "sb.toString()");
        return string;
    }

    public y(boolean z11, boolean z12, String str, boolean z13, boolean z14, int i11, int i12, int i13, int i14) {
        this(z11, z12, r.INSTANCE.a(str).hashCode(), z13, z14, i11, i12, i13, i14);
        this.popUpToRoute = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(boolean z11, boolean z12, d<?> dVar, boolean z13, boolean z14, int i11, int i12, int i13, int i14) {
        this(z11, z12, c.b(r.a(dVar)), z13, z14, i11, i12, i13, i14);
        s.h(dVar);
        this.popUpToRouteClass = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(boolean z11, boolean z12, Object popUpToRouteObject, boolean z13, boolean z14, int i11, int i12, int i13, int i14) {
        this(z11, z12, c.b(r.a(o0.b(popUpToRouteObject.getClass()))), z13, z14, i11, i12, i13, i14);
        s.k(popUpToRouteObject, "popUpToRouteObject");
        this.popUpToRouteObject = popUpToRouteObject;
    }
}
