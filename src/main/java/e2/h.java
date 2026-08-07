package e2;

import android.view.inputmethod.CursorAnchorInfo;
import i4.TextLayoutResult;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le2/h;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Li4/m0;", "textLayoutResult", "Lj3/i;", "innerTextFieldBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Li4/m0;Lj3/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f61483a = new h();

    private h() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, j3.i innerTextFieldBounds) {
        int iR;
        int iR2;
        if (!innerTextFieldBounds.r() && (iR = textLayoutResult.r(innerTextFieldBounds.getTop())) <= (iR2 = textLayoutResult.r(innerTextFieldBounds.getBottom()))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.s(iR), textLayoutResult.v(iR), textLayoutResult.t(iR), textLayoutResult.m(iR));
                if (iR == iR2) {
                    break;
                }
                iR++;
            }
        }
        return builder;
    }
}
