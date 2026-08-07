package j4;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 \"\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "k", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "Lj4/l0;", "a", "(II)J", "Lj4/i0;", "l", "(Lj4/i0;)J", "", "Ll4/h;", IntegerTokenConverter.CONVERTER_KEY, "([Ll4/h;)J", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "lineHeightSpans", "Landroid/graphics/Paint$FontMetricsInt;", "h", "(Lj4/i0;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Ll4/h;)Landroid/graphics/Paint$FontMetricsInt;", "j", "(Lj4/i0;)[Ll4/h;", "Landroid/text/Layout;", "lineIndex", "", "m", "(Landroid/text/Layout;I)Z", "Lj4/h0;", "Lj4/h0;", "SharedTextAndroidCanvas", "b", "J", "ZeroVerticalPadding", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f82533a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f82534b = a(0, 0);

    public static final long a(int i11, int i12) {
        return l0.a((((long) i12) & 4294967295L) | (((long) i11) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt h(i0 i0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, l4.h[] hVarArr) {
        int iM = i0Var.m() - 1;
        if (i0Var.i().getLineStart(iM) != i0Var.i().getLineEnd(iM) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        l4.h hVar = (l4.h) p013kotlin.collections.n.k0(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iM == 0 || !hVar.getTrimLastLineBottom()) ? hVar.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutA = d0.f82481a.a(spannableString, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? p.f82544a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? p.f82544a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, (2072512 & 2048) != 0 ? 0.0f : BitmapDescriptorFactory.HUE_RED, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & PKIFailureInfo.certRevoked) != 0 ? false : i0Var.h(), (2072512 & 16384) != 0 ? true : i0Var.e(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & PKIFailureInfo.badCertTemplate) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
        fontMetricsInt.top = staticLayoutA.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(l4.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (l4.h hVar : hVarArr) {
            if (hVar.getFirstAscentDiff() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.getFirstAscentDiff()));
            }
            if (hVar.getLastDescentDiff() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.getLastDescentDiff()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f82534b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4.h[] j(i0 i0Var) {
        if (!(i0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceG = i0Var.G();
        p013kotlin.jvm.internal.s.i(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!x.a((Spanned) charSequenceG, l4.h.class) && i0Var.G().length() > 0) {
            return null;
        }
        CharSequence charSequenceG2 = i0Var.G();
        p013kotlin.jvm.internal.s.i(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (l4.h[]) ((Spanned) charSequenceG2).getSpans(0, i0Var.G().length(), l4.h.class);
    }

    public static final TextDirectionHeuristic k(int i11) {
        if (i11 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i11 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i11 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i11 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i11 != 4) {
            return i11 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(i0 i0Var) {
        if (i0Var.h() || i0Var.J()) {
            return f82534b;
        }
        TextPaint paint = i0Var.i().getPaint();
        CharSequence text = i0Var.i().getText();
        Rect rectC = w.c(paint, text, i0Var.i().getLineStart(0), i0Var.i().getLineEnd(0));
        int lineAscent = i0Var.i().getLineAscent(0);
        int i11 = rectC.top;
        int topPadding = i11 < lineAscent ? lineAscent - i11 : i0Var.i().getTopPadding();
        if (i0Var.m() != 1) {
            int iM = i0Var.m() - 1;
            rectC = w.c(paint, text, i0Var.i().getLineStart(iM), i0Var.i().getLineEnd(iM));
        }
        int lineDescent = i0Var.i().getLineDescent(i0Var.m() - 1);
        int i12 = rectC.bottom;
        int bottomPadding = i12 > lineDescent ? i12 - lineDescent : i0Var.i().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f82534b : a(topPadding, bottomPadding);
    }

    public static final boolean m(Layout layout, int i11) {
        return layout.getEllipsisCount(i11) > 0;
    }
}
