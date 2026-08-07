package q1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import k3.g4;
import k3.p3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/d;", "Ls1/p;", "orientation", "a", "(Landroidx/compose/ui/d;Ls1/p;)Landroidx/compose/ui/d;", "Lw4/h;", Gender.FEMALE, "b", "()F", "MaxSupportedElevation", "Landroidx/compose/ui/d;", "HorizontalScrollableClipModifier", "c", "VerticalScrollableClipModifier", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f104295a = w4.h.g(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.ui.d f104296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.compose.ui.d f104297c;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"q1/l$a", "Lk3/g4;", "Lj3/m;", "size", "Lw4/t;", "layoutDirection", "Lw4/d;", "density", "Lk3/p3;", "a", "(JLw4/t;Lw4/d;)Lk3/p3;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements g4 {
        a() {
        }

        @Override // k3.g4
        public p3 a(long size, w4.t layoutDirection, w4.d density) {
            float fI1 = density.i1(l.b());
            return new p3.b(new j3.i(BitmapDescriptorFactory.HUE_RED, -fI1, j3.m.k(size), j3.m.i(size) + fI1));
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"q1/l$b", "Lk3/g4;", "Lj3/m;", "size", "Lw4/t;", "layoutDirection", "Lw4/d;", "density", "Lk3/p3;", "a", "(JLw4/t;Lw4/d;)Lk3/p3;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements g4 {
        b() {
        }

        @Override // k3.g4
        public p3 a(long size, w4.t layoutDirection, w4.d density) {
            float fI1 = density.i1(l.b());
            return new p3.b(new j3.i(-fI1, BitmapDescriptorFactory.HUE_RED, j3.m.k(size) + fI1, j3.m.i(size)));
        }
    }

    static {
        androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
        f104296b = h3.e.a(companion, new a());
        f104297c = h3.e.a(companion, new b());
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p021s1.p pVar) {
        return dVar.g(pVar == p021s1.p.Vertical ? f104297c : f104296b);
    }

    public static final float b() {
        return f104295a;
    }
}
