package j4;

import android.graphics.RectF;
import android.text.Layout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\r\u001aO\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u001e\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001am\u0010 \u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b \u0010\u001f\u001a'\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a'\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010#\u001a#\u0010'\u001a\u00020\n*\u00020\u00052\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lj4/i0;", "Landroid/text/Layout;", "layout", "Lj4/r;", "layoutHelper", "Landroid/graphics/RectF;", "rect", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", DateTokenConverter.CONVERTER_KEY, "(Lj4/i0;Landroid/text/Layout;Lj4/r;Landroid/graphics/RectF;ILwn0/p;)[I", "lineIndex", "Lk4/e;", "segmentFinder", "getStart", "f", "(Lj4/i0;Landroid/text/Layout;Lj4/r;ILandroid/graphics/RectF;Lk4/e;Lwn0/p;Z)I", "Lj4/r$a;", "lineStart", "lineTop", "lineBottom", "", "runLeft", "runRight", "", "horizontalBounds", "e", "(Lj4/r$a;Landroid/graphics/RectF;IIIFF[FLk4/e;Lwn0/p;)I", "c", "offset", "a", "(II[F)F", "b", "left", "right", "g", "(Landroid/graphics/RectF;FF)Z", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j0 {
    private static final float a(int i11, int i12, float[] fArr) {
        return fArr[(i11 - i12) * 2];
    }

    private static final float b(int i11, int i12, float[] fArr) {
        return fArr[((i11 - i12) * 2) + 1];
    }

    private static final int c(r.BidiRun aVar, RectF rectF, int i11, int i12, int i13, float f11, float f12, float[] fArr, k4.e eVar, wn0.p<? super RectF, ? super RectF, Boolean> pVar) {
        int iB;
        int iD;
        if (!g(rectF, f11, f12)) {
            return -1;
        }
        if ((aVar.getIsRtl() || rectF.right < f12) && (!aVar.getIsRtl() || rectF.left > f11)) {
            iB = aVar.getStart();
            int iA = aVar.getEnd();
            while (iA - iB > 1) {
                int i14 = (iA + iB) / 2;
                float fA = a(i14, i11, fArr);
                if ((aVar.getIsRtl() || fA <= rectF.right) && (!aVar.getIsRtl() || fA >= rectF.left)) {
                    iB = i14;
                } else {
                    iA = i14;
                }
            }
            if (aVar.getIsRtl()) {
                iB = iA;
            }
        } else {
            iB = aVar.getEnd() - 1;
        }
        int iC = eVar.c(iB + 1);
        if (iC == -1 || (iD = eVar.d(iC)) <= aVar.getStart()) {
            return -1;
        }
        int iF = bo0.n.f(iC, aVar.getStart());
        int iJ = bo0.n.j(iD, aVar.getEnd());
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, i12, BitmapDescriptorFactory.HUE_RED, i13);
        while (true) {
            rectF2.left = aVar.getIsRtl() ? a(iJ - 1, i11, fArr) : a(iF, i11, fArr);
            rectF2.right = aVar.getIsRtl() ? b(iF, i11, fArr) : b(iJ - 1, i11, fArr);
            if (pVar.invoke(rectF2, rectF).booleanValue()) {
                return iJ;
            }
            iJ = eVar.a(iJ);
            if (iJ == -1 || iJ <= aVar.getStart()) {
                return -1;
            }
            iF = bo0.n.f(eVar.c(iJ), aVar.getStart());
        }
    }

    public static final int[] d(i0 i0Var, Layout layout, r rVar, RectF rectF, int i11, wn0.p<? super RectF, ? super RectF, Boolean> pVar) {
        int i12;
        k4.e iVar = i11 == 1 ? new k4.i(i0Var.G(), i0Var.I()) : k4.f.a(i0Var.G(), i0Var.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > i0Var.l(lineForVertical) && (lineForVertical = lineForVertical + 1) >= i0Var.getLineCount()) {
            return null;
        }
        int i13 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < i0Var.w(0)) {
            return null;
        }
        int iF = f(i0Var, layout, rVar, i13, rectF, iVar, pVar, true);
        while (true) {
            i12 = i13;
            if (iF != -1 || i12 >= lineForVertical2) {
                break;
            }
            i13 = i12 + 1;
            iF = f(i0Var, layout, rVar, i13, rectF, iVar, pVar, true);
        }
        if (iF == -1) {
            return null;
        }
        int iF2 = f(i0Var, layout, rVar, lineForVertical2, rectF, iVar, pVar, false);
        while (iF2 == -1 && i12 < lineForVertical2) {
            int i14 = lineForVertical2 - 1;
            iF2 = f(i0Var, layout, rVar, i14, rectF, iVar, pVar, false);
            lineForVertical2 = i14;
        }
        if (iF2 == -1) {
            return null;
        }
        return new int[]{iVar.c(iF + 1), iVar.d(iF2 - 1)};
    }

    private static final int e(r.BidiRun aVar, RectF rectF, int i11, int i12, int i13, float f11, float f12, float[] fArr, k4.e eVar, wn0.p<? super RectF, ? super RectF, Boolean> pVar) {
        int iB;
        int iC;
        if (!g(rectF, f11, f12)) {
            return -1;
        }
        if ((aVar.getIsRtl() || rectF.left > f11) && (!aVar.getIsRtl() || rectF.right < f12)) {
            iB = aVar.getStart();
            int iA = aVar.getEnd();
            while (iA - iB > 1) {
                int i14 = (iA + iB) / 2;
                float fA = a(i14, i11, fArr);
                if ((aVar.getIsRtl() || fA <= rectF.left) && (!aVar.getIsRtl() || fA >= rectF.right)) {
                    iB = i14;
                } else {
                    iA = i14;
                }
            }
            if (aVar.getIsRtl()) {
                iB = iA;
            }
        } else {
            iB = aVar.getStart();
        }
        int iD = eVar.d(iB);
        if (iD == -1 || (iC = eVar.c(iD)) >= aVar.getEnd()) {
            return -1;
        }
        int iF = bo0.n.f(iC, aVar.getStart());
        int iJ = bo0.n.j(iD, aVar.getEnd());
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, i12, BitmapDescriptorFactory.HUE_RED, i13);
        while (true) {
            rectF2.left = aVar.getIsRtl() ? a(iJ - 1, i11, fArr) : a(iF, i11, fArr);
            rectF2.right = aVar.getIsRtl() ? b(iF, i11, fArr) : b(iJ - 1, i11, fArr);
            if (pVar.invoke(rectF2, rectF).booleanValue()) {
                return iF;
            }
            iF = eVar.b(iF);
            if (iF == -1 || iF >= aVar.getEnd()) {
                return -1;
            }
            iJ = bo0.n.j(eVar.d(iF), aVar.getEnd());
        }
    }

    private static final int f(i0 i0Var, Layout layout, r rVar, int i11, RectF rectF, k4.e eVar, wn0.p<? super RectF, ? super RectF, Boolean> pVar, boolean z11) {
        int lineTop = layout.getLineTop(i11);
        int lineBottom = layout.getLineBottom(i11);
        int lineStart = layout.getLineStart(i11);
        int lineEnd = layout.getLineEnd(i11);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        i0Var.b(i11, fArr);
        r.BidiRun[] aVarArrD = rVar.d(i11);
        bo0.h hVarP0 = z11 ? p013kotlin.collections.n.p0(aVarArrD) : bo0.n.s(p013kotlin.collections.n.u0(aVarArrD), 0);
        int first = hVarP0.getFirst();
        int last = hVarP0.getLast();
        int step = hVarP0.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            int i12 = first;
            while (true) {
                r.BidiRun aVar = aVarArrD[i12];
                float fA = aVar.getIsRtl() ? a(aVar.getEnd() - 1, lineStart, fArr) : a(aVar.getStart(), lineStart, fArr);
                float fB = aVar.getIsRtl() ? b(aVar.getStart(), lineStart, fArr) : b(aVar.getEnd() - 1, lineStart, fArr);
                int iE = z11 ? e(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, eVar, pVar) : c(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, eVar, pVar);
                if (iE >= 0) {
                    return iE;
                }
                if (i12 != last) {
                    i12 += step;
                }
            }
        }
        return -1;
    }

    private static final boolean g(RectF rectF, float f11, float f12) {
        return f12 >= rectF.left && f11 <= rectF.right;
    }
}
