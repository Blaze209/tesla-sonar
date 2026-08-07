package kotlin;

import i4.Placeholder;
import i4.TextLayoutInput;
import i4.TextLayoutResult;
import i4.TextStyle;
import i4.d;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.jvm.internal.s;
import p014n4.q;
import w4.b;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ar\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Li4/m0;", "Li4/d;", "text", "Li4/r0;", "style", "", "Li4/d$c;", "Li4/w;", "placeholders", "", "maxLines", "", "softWrap", "Lt4/t;", "overflow", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "Ln4/q$b;", "fontFamilyResolver", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "a", "(Li4/m0;Li4/d;Li4/r0;Ljava/util/List;IZILw4/d;Lw4/t;Ln4/q$b;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b1 {
    public static final boolean a(TextLayoutResult textLayoutResult, d dVar, TextStyle textStyle, List<d.Range<Placeholder>> list, int i11, boolean z11, int i12, w4.d dVar2, t tVar, q.b bVar, long j11) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().a() || !s.f(layoutInput.getText(), dVar) || !layoutInput.getStyle().I(textStyle) || !s.f(layoutInput.g(), list) || layoutInput.getMaxLines() != i11 || layoutInput.getSoftWrap() != z11 || !t4.t.e(layoutInput.getOverflow(), i12) || !s.f(layoutInput.getDensity(), dVar2) || layoutInput.getLayoutDirection() != tVar || !s.f(layoutInput.getFontFamilyResolver(), bVar) || b.n(j11) != b.n(layoutInput.getConstraints())) {
            return false;
        }
        if (z11 || t4.t.e(i12, t4.t.INSTANCE.b())) {
            return b.l(j11) == b.l(layoutInput.getConstraints()) && b.k(j11) == b.k(layoutInput.getConstraints());
        }
        return true;
    }
}
