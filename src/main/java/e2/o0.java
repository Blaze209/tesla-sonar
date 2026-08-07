package e2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextLayoutResult;
import o4.TextFieldValue;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\f*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Lo4/o0;", "textFieldValue", "Lo4/f0;", "offsetMapping", "Li4/m0;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Lj3/i;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "b", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lo4/o0;Lo4/f0;Li4/m0;Landroid/graphics/Matrix;Lj3/i;Lj3/i;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILo4/f0;Li4/m0;Lj3/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILo4/f0;Li4/m0;Lj3/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "x", "y", "c", "(Lj3/i;FF)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i11, int i12, o4.f0 f0Var, TextLayoutResult textLayoutResult, j3.i iVar) {
        ?? r11;
        int iOriginalToTransformed = f0Var.originalToTransformed(i11);
        int iOriginalToTransformed2 = f0Var.originalToTransformed(i12);
        float[] fArr = new float[(iOriginalToTransformed2 - iOriginalToTransformed) * 4];
        textLayoutResult.getMultiParagraph().a(i4.q0.b(iOriginalToTransformed, iOriginalToTransformed2), fArr, 0);
        for (int i13 = i11; i13 < i12; i13++) {
            int iOriginalToTransformed3 = f0Var.originalToTransformed(i13);
            int i14 = (iOriginalToTransformed3 - iOriginalToTransformed) * 4;
            j3.i iVar2 = new j3.i(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], fArr[i14 + 3]);
            boolean zS = iVar.s(iVar2);
            if (!c(iVar, iVar2.getLeft(), iVar2.getTop()) || !c(iVar, iVar2.getRight(), iVar2.getBottom())) {
                r11 = zS;
                r11 = (zS ? 1 : 0) | 2;
            }
            r11 = zS;
            if (textLayoutResult.c(iOriginalToTransformed3) == t4.i.Rtl) {
                r11 = (r11 == true ? 1 : 0) | 4;
            }
            builder.addCharacterBounds(i13, iVar2.getLeft(), iVar2.getTop(), iVar2.getRight(), iVar2.getBottom(), r11 == true ? 1 : 0);
        }
        return builder;
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, o4.f0 f0Var, TextLayoutResult textLayoutResult, Matrix matrix, j3.i iVar, j3.i iVar2, boolean z11, boolean z12, boolean z13, boolean z14) {
        builder.reset();
        builder.setMatrix(matrix);
        int iL = i4.p0.l(textFieldValue.getSelection());
        builder.setSelectionRange(iL, i4.p0.k(textFieldValue.getSelection()));
        if (z11) {
            d(builder, iL, f0Var, textLayoutResult, iVar);
        }
        if (z12) {
            i4.p0 composition = textFieldValue.getComposition();
            int iL2 = composition != null ? i4.p0.l(composition.getPackedValue()) : -1;
            i4.p0 composition2 = textFieldValue.getComposition();
            int iK = composition2 != null ? i4.p0.k(composition2.getPackedValue()) : -1;
            if (iL2 >= 0 && iL2 < iK) {
                builder.setComposingText(iL2, textFieldValue.h().subSequence(iL2, iK));
                a(builder, iL2, iK, f0Var, textLayoutResult, iVar);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && z13) {
            g.a(builder, iVar2);
        }
        if (i11 >= 34 && z14) {
            h.a(builder, textLayoutResult, iVar);
        }
        return builder.build();
    }

    public static final boolean c(j3.i iVar, float f11, float f12) {
        float left = iVar.getLeft();
        if (f11 > iVar.getRight() || left > f11) {
            return false;
        }
        return f12 <= iVar.getBottom() && iVar.getTop() <= f12;
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i11, o4.f0 f0Var, TextLayoutResult textLayoutResult, j3.i iVar) {
        if (i11 < 0) {
            return builder;
        }
        int iOriginalToTransformed = f0Var.originalToTransformed(i11);
        j3.i iVarE = textLayoutResult.e(iOriginalToTransformed);
        float fM = bo0.n.m(iVarE.getLeft(), BitmapDescriptorFactory.HUE_RED, w4.r.g(textLayoutResult.getSize()));
        boolean zC = c(iVar, fM, iVarE.getTop());
        boolean zC2 = c(iVar, fM, iVarE.getBottom());
        boolean z11 = textLayoutResult.c(iOriginalToTransformed) == t4.i.Rtl;
        int i12 = (zC || zC2) ? 1 : 0;
        if (!zC || !zC2) {
            i12 |= 2;
        }
        if (z11) {
            i12 |= 4;
        }
        builder.setInsertionMarkerLocation(fM, iVarE.getTop(), iVarE.getBottom(), iVarE.getBottom(), i12);
        return builder;
    }
}
