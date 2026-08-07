package p021s1;

import p013kotlin.Metadata;
import p019p1.z;
import p020r2.l;
import p020r2.o;
import q1.b;
import q1.n0;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ls1/w;", "", "<init>", "()V", "Ls1/m;", "a", "(Lr2/l;I)Ls1/m;", "Lq1/n0;", "b", "(Lr2/l;I)Lq1/n0;", "Lw4/t;", "layoutDirection", "Ls1/p;", "orientation", "", "reverseScrolling", "c", "(Lw4/t;Ls1/p;Z)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f109634a = new w();

    private w() {
    }

    public final m a(l lVar, int i11) {
        if (o.J()) {
            o.S(1107739818, i11, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        z zVarB = p015o1.z.b(lVar, 0);
        boolean zN = lVar.n(zVarB);
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            objI = new g(zVarB, null, 2, null);
            lVar.B(objI);
        }
        g gVar = (g) objI;
        if (o.J()) {
            o.R();
        }
        return gVar;
    }

    public final n0 b(l lVar, int i11) {
        if (o.J()) {
            o.S(1809802212, i11, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        n0 n0VarA = b.a(lVar, 0);
        if (o.J()) {
            o.R();
        }
        return n0VarA;
    }

    public final boolean c(t layoutDirection, p orientation, boolean reverseScrolling) {
        return (layoutDirection != t.Rtl || orientation == p.Vertical) ? !reverseScrolling : reverseScrolling;
    }
}
