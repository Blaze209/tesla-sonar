package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import t4.LineHeightStyle;
import t4.TextIndent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001af\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Li4/u;", "start", "stop", "", "fraction", "b", "(Li4/u;Li4/u;F)Li4/u;", "Li4/y;", "c", "(Li4/y;Li4/y;F)Li4/y;", "style", "Lw4/t;", "direction", "e", "(Li4/u;Lw4/t;)Li4/u;", "Lt4/j;", "textAlign", "Lt4/l;", "textDirection", "Lw4/v;", "lineHeight", "Lt4/q;", "textIndent", "platformStyle", "Lt4/h;", "lineHeightStyle", "Lt4/f;", "lineBreak", "Lt4/e;", "hyphens", "Lt4/s;", "textMotion", "a", "(Li4/u;IIJLt4/q;Li4/y;Lt4/h;IILt4/s;)Li4/u;", "other", DateTokenConverter.CONVERTER_KEY, "(Li4/u;Li4/y;)Li4/y;", "J", "DefaultLineHeight", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f75803a = w4.v.INSTANCE.a();

    public static final ParagraphStyle a(ParagraphStyle paragraphStyle, int i11, int i12, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i13, int i14, t4.s sVar) {
        long j12;
        int textAlign = i11;
        TextIndent textIndent2 = textIndent;
        t4.j.Companion companion = t4.j.INSTANCE;
        if (t4.j.k(textAlign, companion.g()) || t4.j.k(textAlign, paragraphStyle.getTextAlign())) {
            if (w4.w.i(j11)) {
                j12 = j11;
            } else {
                j12 = j11;
                if (w4.v.e(j12, paragraphStyle.getLineHeight())) {
                }
            }
            if ((textIndent2 == null || p013kotlin.jvm.internal.s.f(textIndent2, paragraphStyle.getTextIndent())) && ((t4.l.j(i12, t4.l.INSTANCE.f()) || t4.l.j(i12, paragraphStyle.getTextDirection())) && ((platformParagraphStyle == null || p013kotlin.jvm.internal.s.f(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || p013kotlin.jvm.internal.s.f(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((t4.f.f(i13, t4.f.INSTANCE.b()) || t4.f.f(i13, paragraphStyle.getLineBreak())) && ((t4.e.g(i14, t4.e.INSTANCE.c()) || t4.e.g(i14, paragraphStyle.getHyphens())) && (sVar == null || p013kotlin.jvm.internal.s.f(sVar, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j12 = j11;
        }
        long lineHeight = w4.w.i(j12) ? paragraphStyle.getLineHeight() : j12;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (t4.j.k(textAlign, companion.g())) {
            textAlign = paragraphStyle.getTextAlign();
        }
        return new ParagraphStyle(textAlign, !t4.l.j(i12, t4.l.INSTANCE.f()) ? i12 : paragraphStyle.getTextDirection(), lineHeight, textIndent3, d(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !t4.f.f(i13, t4.f.INSTANCE.b()) ? i13 : paragraphStyle.getLineBreak(), !t4.e.g(i14, t4.e.INSTANCE.c()) ? i14 : paragraphStyle.getHyphens(), sVar == null ? paragraphStyle.getTextMotion() : sVar, null);
    }

    public static final ParagraphStyle b(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f11) {
        int value = ((t4.j) e0.d(t4.j.h(paragraphStyle.getTextAlign()), t4.j.h(paragraphStyle2.getTextAlign()), f11)).getValue();
        int value2 = ((t4.l) e0.d(t4.l.g(paragraphStyle.getTextDirection()), t4.l.g(paragraphStyle2.getTextDirection()), f11)).getValue();
        long jF = e0.f(paragraphStyle.getLineHeight(), paragraphStyle2.getLineHeight(), f11);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.INSTANCE.a();
        }
        return new ParagraphStyle(value, value2, jF, t4.r.a(textIndent, textIndent2, f11), c(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f11), (LineHeightStyle) e0.d(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f11), ((t4.f) e0.d(t4.f.c(paragraphStyle.getLineBreak()), t4.f.c(paragraphStyle2.getLineBreak()), f11)).getMask(), ((t4.e) e0.d(t4.e.d(paragraphStyle.getHyphens()), t4.e.d(paragraphStyle2.getHyphens()), f11)).getValue(), (t4.s) e0.d(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f11), null);
    }

    private static final PlatformParagraphStyle c(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f11) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.INSTANCE.a();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.INSTANCE.a();
        }
        return c.b(platformParagraphStyle, platformParagraphStyle2, f11);
    }

    private static final PlatformParagraphStyle d(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        return platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().d(platformParagraphStyle);
    }

    public static final ParagraphStyle e(ParagraphStyle paragraphStyle, w4.t tVar) {
        int textAlign = paragraphStyle.getTextAlign();
        t4.j.Companion companion = t4.j.INSTANCE;
        int iF = t4.j.k(textAlign, companion.g()) ? companion.f() : paragraphStyle.getTextAlign();
        int iE = s0.e(tVar, paragraphStyle.getTextDirection());
        long lineHeight = w4.w.i(paragraphStyle.getLineHeight()) ? f75803a : paragraphStyle.getLineHeight();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int lineBreak = paragraphStyle.getLineBreak();
        t4.f.Companion companion2 = t4.f.INSTANCE;
        int iA = t4.f.f(lineBreak, companion2.b()) ? companion2.a() : paragraphStyle.getLineBreak();
        int hyphens = paragraphStyle.getHyphens();
        t4.e.Companion companion3 = t4.e.INSTANCE;
        int iB = t4.e.g(hyphens, companion3.c()) ? companion3.b() : paragraphStyle.getHyphens();
        t4.s textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = t4.s.INSTANCE.a();
        }
        return new ParagraphStyle(iF, iE, lineHeight, textIndent2, platformStyle, lineHeightStyle, iA, iB, textMotion, null);
    }
}
