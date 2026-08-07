package androidx.compose.animation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p019p1.f2;
import p019p1.g0;
import p019p1.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\fJ@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0001\u0001\u0012ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/d;", "S", "Lp1/l1$b;", "Landroidx/compose/animation/d$a;", "towards", "Lp1/g0;", "Lw4/n;", "animationSpec", "Lkotlin/Function1;", "", "initialOffset", "Landroidx/compose/animation/i;", "a", "(ILp1/g0;Lwn0/l;)Landroidx/compose/animation/i;", "targetOffset", "Landroidx/compose/animation/k;", "c", "(ILp1/g0;Lwn0/l;)Landroidx/compose/animation/k;", "Landroidx/compose/animation/e;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d<S> extends l1.b<S> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/d$a;", "", "", "value", "g", "(I)I", "a", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @vn0.b
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f4014b = g(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f4015c = g(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f4016d = g(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f4017e = g(3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f4018f = g(4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f4019g = g(5);

        /* JADX INFO: renamed from: androidx.compose.animation.d$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/d$a$a;", "", "<init>", "()V", "Landroidx/compose/animation/d$a;", "Left", "I", "c", "()I", "Right", DateTokenConverter.CONVERTER_KEY, "Up", "f", "Down", "a", "Start", "e", "End", "b", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return a.f4017e;
            }

            public final int b() {
                return a.f4019g;
            }

            public final int c() {
                return a.f4014b;
            }

            public final int d() {
                return a.f4015c;
            }

            public final int e() {
                return a.f4018f;
            }

            public final int f() {
                return a.f4016d;
            }

            private Companion() {
            }
        }

        public static int g(int i11) {
            return i11;
        }

        public static final boolean h(int i11, int i12) {
            return i11 == i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f4020c = new b();

        b() {
            super(1);
        }

        public final Integer a(int i11) {
            return Integer.valueOf(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f4021c = new c();

        c() {
            super(1);
        }

        public final Integer a(int i11) {
            return Integer.valueOf(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ k d(d dVar, int i11, g0 g0Var, wn0.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i12 & 2) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.n.b(f2.e(w4.n.INSTANCE)), 3, null);
        }
        if ((i12 & 4) != 0) {
            lVar = c.f4021c;
        }
        return dVar.c(i11, g0Var, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ i f(d dVar, int i11, g0 g0Var, wn0.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i12 & 2) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.n.b(f2.e(w4.n.INSTANCE)), 3, null);
        }
        if ((i12 & 4) != 0) {
            lVar = b.f4020c;
        }
        return dVar.a(i11, g0Var, lVar);
    }

    i a(int towards, g0<w4.n> animationSpec, wn0.l<? super Integer, Integer> initialOffset);

    k c(int towards, g0<w4.n> animationSpec, wn0.l<? super Integer, Integer> targetOffset);
}
