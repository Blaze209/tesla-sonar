package p009i2;

import androidx.compose.ui.d;
import jn0.h0;
import k3.g4;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;
import q1.BorderStroke;
import w4.h;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a^\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lk3/g4;", "shape", "Lk3/p1;", "backgroundColor", "contentColor", "Lq1/g;", "border", "Lw4/h;", "elevation", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Landroidx/compose/ui/d;Lk3/g4;JJLq1/g;FLwn0/p;Lr2/l;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {
    public static final void a(d dVar, g4 g4Var, long j11, long j12, BorderStroke borderStroke, float f11, p<? super l, ? super Integer, h0> pVar, l lVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            dVar = d.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            g4Var = j1.f74525a.b(lVar, 6).getMedium();
        }
        g4 g4Var2 = g4Var;
        long jN = (i12 & 4) != 0 ? j1.f74525a.a(lVar, 6).n() : j11;
        long jB = (i12 & 8) != 0 ? s.b(jN, lVar, (i11 >> 6) & 14) : j12;
        BorderStroke borderStroke2 = (i12 & 16) != 0 ? null : borderStroke;
        float fG = (i12 & 32) != 0 ? h.g(1) : f11;
        if (o.J()) {
            o.S(1956755640, i11, -1, "androidx.compose.material.Card (Card.kt:62)");
        }
        m2.a(dVar, g4Var2, jN, jB, borderStroke2, fG, pVar, lVar, i11 & 4194302, 0);
        if (o.J()) {
            o.R();
        }
    }
}
