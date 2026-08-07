package androidx.compose.ui.draw;

import com.google.android.libraries.places.api.model.PlaceTypes;
import k3.q1;
import p013kotlin.Metadata;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/d;", "Landroidx/compose/ui/graphics/painter/b;", PlaceTypes.PAINTER, "", "sizeToIntrinsics", "Ld3/c;", "alignment", "Lz3/k;", "contentScale", "", "alpha", "Lk3/q1;", "colorFilter", "a", "(Landroidx/compose/ui/d;Landroidx/compose/ui/graphics/painter/b;ZLd3/c;Lz3/k;FLk3/q1;)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, androidx.compose.ui.graphics.painter.b bVar, boolean z11, d3.c cVar, k kVar, float f11, q1 q1Var) {
        return dVar.g(new PainterElement(bVar, z11, cVar, kVar, f11, q1Var));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, androidx.compose.ui.graphics.painter.b bVar, boolean z11, d3.c cVar, k kVar, float f11, q1 q1Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            cVar = d3.c.INSTANCE.e();
        }
        d3.c cVar2 = cVar;
        if ((i11 & 8) != 0) {
            kVar = k.INSTANCE.f();
        }
        k kVar2 = kVar;
        if ((i11 & 16) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i11 & 32) != 0) {
            q1Var = null;
        }
        return a(dVar, bVar, z12, cVar2, kVar2, f12, q1Var);
    }
}
