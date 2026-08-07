package w1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p019p1.f2;
import p019p1.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006JI\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u0002*\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lw1/c;", "", "Landroidx/compose/ui/d;", "", "fraction", "f", "(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;", "e", "Lp1/g0;", "fadeInSpec", "Lw4/n;", "placementSpec", "fadeOutSpec", "g", "(Landroidx/compose/ui/d;Lp1/g0;Lp1/g0;Lp1/g0;)Landroidx/compose/ui/d;", "animationSpec", "a", "(Landroidx/compose/ui/d;Lp1/g0;)Landroidx/compose/ui/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface c {
    static /* synthetic */ androidx.compose.ui.d b(c cVar, androidx.compose.ui.d dVar, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return cVar.f(dVar, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.ui.d c(c cVar, androidx.compose.ui.d dVar, g0 g0Var, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i11 & 1) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, w4.n.b(f2.e(w4.n.INSTANCE)), 1, null);
        }
        return cVar.a(dVar, g0Var);
    }

    static /* synthetic */ androidx.compose.ui.d d(c cVar, androidx.compose.ui.d dVar, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return cVar.e(dVar, f11);
    }

    @jn0.e
    default androidx.compose.ui.d a(androidx.compose.ui.d dVar, g0<w4.n> g0Var) {
        return g(dVar, null, g0Var, null);
    }

    androidx.compose.ui.d e(androidx.compose.ui.d dVar, float f11);

    androidx.compose.ui.d f(androidx.compose.ui.d dVar, float f11);

    default androidx.compose.ui.d g(androidx.compose.ui.d dVar, g0<Float> g0Var, g0<w4.n> g0Var2, g0<Float> g0Var3) {
        return dVar;
    }
}
