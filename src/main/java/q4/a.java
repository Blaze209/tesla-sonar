package q4;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import i4.SpanStyle;
import i4.UrlAnnotation;
import i4.t0;
import java.util.List;
import p013kotlin.Metadata;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import p014n4.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Li4/d;", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "Lq4/x;", "urlSpanCache", "Landroid/text/SpannableString;", "b", "(Li4/d;Lw4/d;Ln4/q$b;Lq4/x;)Landroid/text/SpannableString;", "Li4/d0;", "spanStyle", "", "start", "end", "Ljn0/h0;", "a", "(Landroid/text/SpannableString;Li4/d0;IILw4/d;Ln4/q$b;)V", "Li4/d$c;", "Li4/h;", "Li4/h$b;", "c", "(Li4/d$c;)Li4/d$c;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    private static final void a(SpannableString spannableString, SpanStyle spanStyle, int i11, int i12, w4.d dVar, n4.q.b bVar) {
        r4.c.k(spannableString, spanStyle.g(), i11, i12);
        r4.c.o(spannableString, spanStyle.getFontSize(), dVar, i11, i12);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.d();
            }
            b0 fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new StyleSpan(p014n4.h.c(fontWeight, fontStyle != null ? fontStyle.getValue() : b0.INSTANCE.b())), i11, i12, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof j0) {
                spannableString.setSpan(new TypefaceSpan(((j0) spanStyle.getFontFamily()).getName()), i11, i12, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                p014n4.q fontFamily = spanStyle.getFontFamily();
                c0 fontSynthesis = spanStyle.getFontSynthesis();
                Object value = n4.q.b.b(bVar, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : c0.INSTANCE.a(), 6, null).getValue();
                p013kotlin.jvm.internal.s.i(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(m.f104756a.a((Typeface) value), i11, i12, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            t4.k textDecoration = spanStyle.getTextDecoration();
            t4.k.Companion companion = t4.k.INSTANCE;
            if (textDecoration.d(companion.d())) {
                spannableString.setSpan(new UnderlineSpan(), i11, i12, 33);
            }
            if (spanStyle.getTextDecoration().d(companion.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i11, i12, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i11, i12, 33);
        }
        r4.c.s(spannableString, spanStyle.getLocaleList(), i11, i12);
        r4.c.h(spannableString, spanStyle.getBackground(), i11, i12);
    }

    public static final SpannableString b(i4.d dVar, w4.d dVar2, n4.q.b bVar, x xVar) {
        SpannableString spannableString = new SpannableString(dVar.getText());
        List<i4.d.Range<SpanStyle>> listH = dVar.h();
        if (listH != null) {
            int size = listH.size();
            for (int i11 = 0; i11 < size; i11++) {
                i4.d.Range<SpanStyle> range = listH.get(i11);
                a(spannableString, SpanStyle.b(range.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), range.getStart(), range.getEnd(), dVar2, bVar);
            }
        }
        List<i4.d.Range<t0>> listL = dVar.l(0, dVar.length());
        int size2 = listL.size();
        for (int i12 = 0; i12 < size2; i12++) {
            i4.d.Range<t0> range2 = listL.get(i12);
            spannableString.setSpan(r4.e.a(range2.a()), range2.getStart(), range2.getEnd(), 33);
        }
        List<i4.d.Range<UrlAnnotation>> listM = dVar.m(0, dVar.length());
        int size3 = listM.size();
        for (int i13 = 0; i13 < size3; i13++) {
            i4.d.Range<UrlAnnotation> range3 = listM.get(i13);
            spannableString.setSpan(xVar.c(range3.a()), range3.getStart(), range3.getEnd(), 33);
        }
        List<i4.d.Range<i4.h>> listD = dVar.d(0, dVar.length());
        int size4 = listD.size();
        for (int i14 = 0; i14 < size4; i14++) {
            i4.d.Range<i4.h> range4 = listD.get(i14);
            if (range4.f() != range4.d()) {
                i4.h hVarE = range4.e();
                if (hVarE instanceof i4.h.b) {
                    hVarE.a();
                    spannableString.setSpan(xVar.b(c(range4)), range4.f(), range4.d(), 33);
                } else {
                    spannableString.setSpan(xVar.a(range4), range4.f(), range4.d(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final i4.d.Range<i4.h.b> c(i4.d.Range<i4.h> range) {
        i4.h hVarE = range.e();
        p013kotlin.jvm.internal.s.i(hVarE, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new i4.d.Range<>((i4.h.b) hVarE, range.f(), range.d());
    }
}
