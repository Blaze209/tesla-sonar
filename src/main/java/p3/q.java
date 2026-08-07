package p3;

import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import k3.q1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a*\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a$\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aD\u0010\u001f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u00020#*\u00020#2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lp3/d;", "image", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "g", "(Lp3/d;Lr2/l;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lw4/d;", "Lw4/h;", "defaultWidth", "defaultHeight", "Lj3/m;", "e", "(Lw4/d;FF)J", "defaultSize", "", "viewportWidth", "viewportHeight", "f", "(JFF)J", "Lk3/p1;", "tintColor", "Lk3/b1;", "tintBlendMode", "Lk3/q1;", "b", "(JI)Lk3/q1;", "viewportSize", "", "name", "intrinsicColorFilter", "", "autoMirror", "a", "(Landroidx/compose/ui/graphics/vector/VectorPainter;JJLjava/lang/String;Lk3/q1;Z)Landroidx/compose/ui/graphics/vector/VectorPainter;", "density", "imageVector", "Lp3/c;", "root", DateTokenConverter.CONVERTER_KEY, "(Lw4/d;Lp3/d;Lp3/c;)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lp3/n;", "currentGroup", "c", "(Lp3/c;Lp3/n;)Lp3/c;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {
    public static final VectorPainter a(VectorPainter vectorPainter, long j11, long j12, String str, q1 q1Var, boolean z11) {
        vectorPainter.k(j11);
        vectorPainter.g(z11);
        vectorPainter.h(q1Var);
        vectorPainter.l(j12);
        vectorPainter.j(str);
        return vectorPainter;
    }

    private static final q1 b(long j11, int i11) {
        if (j11 != 16) {
            return q1.INSTANCE.a(j11, i11);
        }
        return null;
    }

    public static final c c(c cVar, n nVar) {
        int iN = nVar.n();
        for (int i11 = 0; i11 < iN; i11++) {
            p pVarD = nVar.d(i11);
            if (pVarD instanceof r) {
                g gVar = new g();
                r rVar = (r) pVarD;
                gVar.k(rVar.h());
                gVar.l(rVar.getPathFillType());
                gVar.j(rVar.getName());
                gVar.h(rVar.getFill());
                gVar.i(rVar.getFillAlpha());
                gVar.m(rVar.getStroke());
                gVar.n(rVar.getStrokeAlpha());
                gVar.r(rVar.getStrokeLineWidth());
                gVar.o(rVar.getStrokeLineCap());
                gVar.p(rVar.getStrokeLineJoin());
                gVar.q(rVar.getStrokeLineMiter());
                gVar.u(rVar.getTrimPathStart());
                gVar.s(rVar.getTrimPathEnd());
                gVar.t(rVar.getTrimPathOffset());
                cVar.i(i11, gVar);
            } else if (pVarD instanceof n) {
                c cVar2 = new c();
                n nVar2 = (n) pVarD;
                cVar2.p(nVar2.getName());
                cVar2.s(nVar2.getRotation());
                cVar2.t(nVar2.getScaleX());
                cVar2.u(nVar2.getScaleY());
                cVar2.v(nVar2.getTranslationX());
                cVar2.w(nVar2.getTranslationY());
                cVar2.q(nVar2.getPivotX());
                cVar2.r(nVar2.getPivotY());
                cVar2.o(nVar2.e());
                c(cVar2, nVar2);
                cVar.i(i11, cVar2);
            }
        }
        return cVar;
    }

    public static final VectorPainter d(w4.d dVar, d dVar2, c cVar) {
        long jE = e(dVar, dVar2.getDefaultWidth(), dVar2.getDefaultHeight());
        return a(new VectorPainter(cVar), jE, f(jE, dVar2.getViewportWidth(), dVar2.getViewportHeight()), dVar2.getName(), b(dVar2.getTintColor(), dVar2.getTintBlendMode()), dVar2.getAutoMirror());
    }

    private static final long e(w4.d dVar, float f11, float f12) {
        return j3.n.a(dVar.O1(f11), dVar.O1(f12));
    }

    private static final long f(long j11, float f11, float f12) {
        if (Float.isNaN(f11)) {
            f11 = j3.m.k(j11);
        }
        if (Float.isNaN(f12)) {
            f12 = j3.m.i(j11);
        }
        return j3.n.a(f11, f12);
    }

    public static final VectorPainter g(d dVar, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(1413834416, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:171)");
        }
        w4.d dVar2 = (w4.d) lVar.U(z0.g());
        float genId = dVar.getGenId();
        boolean zS = lVar.s((((long) Float.floatToRawIntBits(dVar2.getDensity())) & 4294967295L) | (Float.floatToRawIntBits(genId) << 32));
        Object objI = lVar.I();
        if (zS || objI == p020r2.l.INSTANCE.a()) {
            c cVar = new c();
            c(cVar, dVar.getRoot());
            h0 h0Var = h0.f84049a;
            objI = d(dVar2, dVar, cVar);
            lVar.B(objI);
        }
        VectorPainter vectorPainter = (VectorPainter) objI;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return vectorPainter;
    }
}
