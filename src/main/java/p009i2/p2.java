package p009i2;

import k3.SolidColor;
import k3.p1;
import p013kotlin.Metadata;
import p019p1.c;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;
import q1.BorderStroke;
import u1.f;
import u1.j;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "isError", "Lu1/j;", "interactionSource", "Li2/n2;", "colors", "Lw4/h;", "focusedBorderThickness", "unfocusedBorderThickness", "Lr2/y3;", "Lq1/g;", "b", "(ZZLu1/j;Li2/n2;FFLr2/l;I)Lr2/y3;", "focused", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final y3<BorderStroke> b(boolean z11, boolean z12, j jVar, n2 n2Var, float f11, float f12, l lVar, int i11) {
        y3<h> y3VarO;
        if (o.J()) {
            o.S(1097899920, i11, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:982)");
        }
        y3<Boolean> y3VarA = f.a(jVar, lVar, (i11 >> 6) & 14);
        y3<p1> y3VarC = n2Var.c(z11, z12, jVar, lVar, i11 & 8190);
        float f13 = c(y3VarA) ? f11 : f12;
        if (z11) {
            lVar.o(772641254);
            y3VarO = c.c(f13, p019p1.j.l(150, 0, null, 6, null), null, null, lVar, 48, 12);
            lVar.l();
        } else {
            lVar.o(772737540);
            y3VarO = n3.o(h.d(f12), lVar, (i11 >> 15) & 14);
            lVar.l();
        }
        y3<BorderStroke> y3VarO2 = n3.o(new BorderStroke(y3VarO.getValue().getValue(), new SolidColor(y3VarC.getValue().getValue(), null), null), lVar, 0);
        if (o.J()) {
            o.R();
        }
        return y3VarO2;
    }

    private static final boolean c(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }
}
