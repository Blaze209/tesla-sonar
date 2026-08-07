package i4;

import k3.Shadow;
import k3.h1;
import k3.j1;
import k3.p1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li4/o0;", "", "<init>", "()V", "Lk3/j1;", "canvas", "Li4/m0;", "textLayoutResult", "Ljn0/h0;", "a", "(Lk3/j1;Li4/m0;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f75773a = new o0();

    private o0() {
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:? A[SYNTHETIC] */
    public final void a(j1 canvas, TextLayoutResult textLayoutResult) throws Throwable {
        j1 j1Var;
        Throwable th2;
        j1 j1Var2;
        float alpha;
        boolean z11 = textLayoutResult.i() && !t4.t.e(textLayoutResult.getLayoutInput().getOverflow(), t4.t.INSTANCE.c());
        if (z11) {
            j3.i iVarB = j3.j.b(j3.g.INSTANCE.c(), j3.n.a(w4.r.g(textLayoutResult.getSize()), w4.r.f(textLayoutResult.getSize())));
            canvas.u();
            j1Var = null;
            j1.w(canvas, iVarB, 0, 2, null);
        }
        SpanStyle spanStyle = textLayoutResult.getLayoutInput().getStyle().getSpanStyle();
        t4.k textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = t4.k.INSTANCE.c();
        }
        t4.k kVar = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.a();
        }
        Shadow shadow2 = shadow;
        m3.g drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = m3.j.f90966a;
        }
        m3.g gVar = drawStyle;
        try {
            h1 h1VarF = spanStyle.f();
            try {
                if (h1VarF != null) {
                    if (spanStyle.getTextForegroundStyle() != t4.n.b.f112354b) {
                        try {
                            alpha = spanStyle.getTextForegroundStyle().getAlpha();
                        } catch (Throwable th3) {
                            th2 = th3;
                            j1Var = canvas;
                            if (z11) {
                                throw th2;
                            }
                            j1Var.o();
                            throw th2;
                        }
                    } else {
                        alpha = 1.0f;
                    }
                    j1Var2 = canvas;
                    j.G(textLayoutResult.getMultiParagraph(), j1Var2, h1VarF, alpha, shadow2, kVar, gVar, 0, 64, null);
                } else {
                    j1Var2 = canvas;
                    textLayoutResult.getMultiParagraph().D(j1Var2, (32 & 2) != 0 ? p1.INSTANCE.j() : spanStyle.getTextForegroundStyle() != t4.n.b.f112354b ? spanStyle.getTextForegroundStyle().getValue() : p1.INSTANCE.a(), (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : kVar, (32 & 16) == 0 ? gVar : null, (32 & 32) != 0 ? m3.f.INSTANCE.a() : 0);
                }
                if (z11) {
                    j1Var2.o();
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                if (z11) {
                    throw th2;
                }
                j1Var.o();
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            j1Var = canvas;
        }
    }
}
