package q4;

import android.graphics.Matrix;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.ParagraphInfo;
import java.util.List;
import k3.Shadow;
import k3.SolidColor;
import k3.c4;
import k3.h1;
import k3.i1;
import k3.j1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a^\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Li4/j;", "Lk3/j1;", "canvas", "Lk3/h1;", "brush", "", "alpha", "Lk3/e4;", "shadow", "Lt4/k;", "decoration", "Lm3/g;", "drawStyle", "Lk3/b1;", "blendMode", "Ljn0/h0;", "a", "(Li4/j;Lk3/j1;Lk3/h1;FLk3/e4;Lt4/k;Lm3/g;I)V", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final void a(i4.j jVar, j1 j1Var, h1 h1Var, float f11, Shadow shadow, t4.k kVar, m3.g gVar, int i11) {
        j1Var.u();
        if (jVar.w().size() <= 1 || (h1Var instanceof SolidColor)) {
            b(jVar, j1Var, h1Var, f11, shadow, kVar, gVar, i11);
        } else if (h1Var instanceof c4) {
            List<ParagraphInfo> listW = jVar.w();
            int size = listW.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i12 = 0; i12 < size; i12++) {
                ParagraphInfo paragraphInfo = listW.get(i12);
                height += paragraphInfo.getParagraph().getHeight();
                fMax = Math.max(fMax, paragraphInfo.getParagraph().getWidth());
            }
            Shader shaderB = ((c4) h1Var).b(j3.n.a(fMax, height));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            List<ParagraphInfo> listW2 = jVar.w();
            int size2 = listW2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ParagraphInfo paragraphInfo2 = listW2.get(i13);
                paragraphInfo2.getParagraph().p(j1Var, i1.a(shaderB), f11, shadow, kVar, gVar, i11);
                j1Var.c(BitmapDescriptorFactory.HUE_RED, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(BitmapDescriptorFactory.HUE_RED, -paragraphInfo2.getParagraph().getHeight());
                shaderB.setLocalMatrix(matrix);
            }
        }
        j1Var.o();
    }

    private static final void b(i4.j jVar, j1 j1Var, h1 h1Var, float f11, Shadow shadow, t4.k kVar, m3.g gVar, int i11) {
        List<ParagraphInfo> listW = jVar.w();
        int size = listW.size();
        for (int i12 = 0; i12 < size; i12++) {
            ParagraphInfo paragraphInfo = listW.get(i12);
            paragraphInfo.getParagraph().p(j1Var, h1Var, f11, shadow, kVar, gVar, i11);
            j1Var.c(BitmapDescriptorFactory.HUE_RED, paragraphInfo.getParagraph().getHeight());
        }
    }
}
