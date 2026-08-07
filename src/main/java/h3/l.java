package h3;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import k3.a4;
import k3.g4;
import k3.h3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/d;", "Lw4/h;", "elevation", "Lk3/g4;", "shape", "", "clip", "Lk3/p1;", "ambientColor", "spotColor", "a", "(Landroidx/compose/ui/d;FLk3/g4;ZJJ)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f11, g4 g4Var, boolean z11, long j11, long j12) {
        return (w4.h.f(f11, w4.h.g((float) 0)) > 0 || z11) ? dVar.g(new ShadowGraphicsLayerElement(f11, g4Var, z11, j11, j12, null)) : dVar;
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f11, g4 g4Var, boolean z11, long j11, long j12, int i11, Object obj) {
        boolean z12;
        g4 g4VarA = (i11 & 2) != 0 ? a4.a() : g4Var;
        if ((i11 & 4) != 0) {
            z12 = false;
            if (w4.h.f(f11, w4.h.g(0)) > 0) {
                z12 = true;
            }
        } else {
            z12 = z11;
        }
        return a(dVar, f11, g4VarA, z12, (i11 & 8) != 0 ? h3.a() : j11, (i11 & 16) != 0 ? h3.a() : j12);
    }
}
