package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.Shadow;
import k3.f4;
import k3.h1;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.FontWeight;
import p4.LocaleList;
import t4.TextGeometricTransform;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aÀ\u0001\u0010\u0002\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010-\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00102\u001a\u0004\u0018\u00010\u00102\b\u00104\u001a\u0004\u0018\u000103H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u00105\u001a\u001f\u00107\u001a\u0004\u0018\u00010\u0010*\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b7\u00108\"\u0014\u0010:\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u00109\"\u0014\u0010;\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u00109\"\u0014\u0010<\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109\"\u0014\u0010=\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109\"\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Lw4/v;", "a", "b", "", "t", "f", "(JJF)J", "T", "fraction", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Li4/d0;", "start", "stop", "c", "(Li4/d0;Li4/d0;F)Li4/d0;", "Li4/z;", "e", "(Li4/z;Li4/z;F)Li4/z;", "style", "h", "(Li4/d0;)Li4/d0;", "Lk3/p1;", "color", "Lk3/h1;", "brush", "alpha", OrcaFlavourKeys.FONT_SIZE, "Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "Ln4/c0;", "fontSynthesis", "Ln4/q;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lt4/a;", "baselineShift", "Lt4/o;", "textGeometricTransform", "Lp4/e;", "localeList", AppStateModule.APP_STATE_BACKGROUND, "Lt4/k;", "textDecoration", "Lk3/e4;", "shadow", "platformStyle", "Lm3/g;", "drawStyle", "(Li4/d0;JLk3/h1;FJLn4/f0;Ln4/b0;Ln4/c0;Ln4/q;Ljava/lang/String;JLt4/a;Lt4/o;Lp4/e;JLt4/k;Lk3/e4;Li4/z;Lm3/g;)Li4/d0;", "other", "g", "(Li4/d0;Li4/z;)Li4/z;", "J", "DefaultFontSize", "DefaultLetterSpacing", "DefaultBackgroundColor", "DefaultColor", "Lt4/n;", "Lt4/n;", "DefaultColorForegroundStyle", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f75705a = w4.w.h(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f75706b = w4.w.h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f75707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f75708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final t4.n f75709e;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt4/n;", "b", "()Lt4/n;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<t4.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f75710c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t4.n invoke() {
            return e0.f75709e;
        }
    }

    static {
        p1.Companion companion = p1.INSTANCE;
        f75707c = companion.i();
        long jA = companion.a();
        f75708d = jA;
        f75709e = t4.n.INSTANCE.b(jA);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017b  */
    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0184  */
    /* JADX WARN: Code duplicated, block: B:105:0x018a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0190  */
    /* JADX WARN: Code duplicated, block: B:108:0x0195  */
    /* JADX WARN: Code duplicated, block: B:112:0x019c  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0129  */
    /* JADX WARN: Code duplicated, block: B:78:0x0132  */
    /* JADX WARN: Code duplicated, block: B:7:0x002b A[PHI: r11
      0x002b: PHI (r11v7 long) = 
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v8 long)
     binds: [B:35:0x0096, B:47:0x00c8, B:44:0x00bc, B:41:0x00b0, B:38:0x00a4, B:33:0x0088, B:28:0x0079, B:24:0x0067, B:21:0x005f, B:18:0x0053, B:15:0x0047, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147  */
    /* JADX WARN: Code duplicated, block: B:86:0x0150  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x015b  */
    /* JADX WARN: Code duplicated, block: B:91:0x015f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0164  */
    /* JADX WARN: Code duplicated, block: B:94:0x0168  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0171  */
    public static final SpanStyle b(SpanStyle spanStyle, long j11, h1 h1Var, float f11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow shadow, z zVar, m3.g gVar) {
        long fontSize;
        TextGeometricTransform textGeometricTransform2;
        long background;
        m3.g gVar2;
        t4.n nVarB;
        p014n4.q fontFamily;
        FontWeight fontWeight2;
        p014n4.b0 fontStyle;
        p014n4.c0 fontSynthesis;
        long letterSpacing;
        LocaleList localeList2;
        m3.g drawStyle;
        String fontFeatureSettings = str;
        t4.a baselineShift = aVar;
        t4.k textDecoration = kVar;
        Shadow shadow2 = shadow;
        if (!w4.w.i(j12)) {
            fontSize = j12;
            if (!w4.v.e(fontSize, spanStyle.getFontSize())) {
                textGeometricTransform2 = textGeometricTransform;
                background = j14;
                gVar2 = gVar;
            }
            if (h1Var != null) {
                nVarB = t4.n.INSTANCE.a(h1Var, f11);
            } else {
                nVarB = t4.n.INSTANCE.b(j11);
            }
            t4.n nVarD = spanStyle.getTextForegroundStyle().d(nVarB);
            if (qVar == null) {
                fontFamily = spanStyle.getFontFamily();
            } else {
                fontFamily = qVar;
            }
            if (w4.w.i(fontSize)) {
                fontSize = spanStyle.getFontSize();
            }
            if (fontWeight == null) {
                fontWeight2 = spanStyle.getFontWeight();
            } else {
                fontWeight2 = fontWeight;
            }
            if (b0Var == null) {
                fontStyle = spanStyle.getFontStyle();
            } else {
                fontStyle = b0Var;
            }
            if (c0Var == null) {
                fontSynthesis = spanStyle.getFontSynthesis();
            } else {
                fontSynthesis = c0Var;
            }
            if (fontFeatureSettings == null) {
                fontFeatureSettings = spanStyle.getFontFeatureSettings();
            }
            if (w4.w.i(j13)) {
                letterSpacing = spanStyle.getLetterSpacing();
            } else {
                letterSpacing = j13;
            }
            if (baselineShift == null) {
                baselineShift = spanStyle.getBaselineShift();
            }
            if (textGeometricTransform2 == null) {
                textGeometricTransform2 = spanStyle.getTextGeometricTransform();
            }
            if (localeList == null) {
                localeList2 = spanStyle.getLocaleList();
            } else {
                localeList2 = localeList;
            }
            if (background == 16) {
                background = spanStyle.getBackground();
            }
            if (textDecoration == null) {
                textDecoration = spanStyle.getTextDecoration();
            }
            if (shadow2 == null) {
                shadow2 = spanStyle.getShadow();
            }
            Shadow shadow3 = shadow2;
            z zVarG = g(spanStyle, zVar);
            if (gVar2 == null) {
                drawStyle = spanStyle.getDrawStyle();
            } else {
                drawStyle = gVar2;
            }
            return new SpanStyle(nVarD, fontSize, fontWeight2, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform2, localeList2, background, textDecoration, shadow3, zVarG, drawStyle, (DefaultConstructorMarker) null);
        }
        fontSize = j12;
        if ((h1Var != null || j11 == 16 || p1.r(j11, spanStyle.getTextForegroundStyle().getValue())) && ((b0Var == null || p013kotlin.jvm.internal.s.f(b0Var, spanStyle.getFontStyle())) && ((fontWeight == null || p013kotlin.jvm.internal.s.f(fontWeight, spanStyle.getFontWeight())) && ((qVar == null || qVar == spanStyle.getFontFamily()) && (w4.w.i(j13) || w4.v.e(j13, spanStyle.getLetterSpacing())))))) {
            if ((textDecoration == null || p013kotlin.jvm.internal.s.f(textDecoration, spanStyle.getTextDecoration())) && p013kotlin.jvm.internal.s.f(h1Var, spanStyle.getTextForegroundStyle().e()) && ((h1Var == null || f11 == spanStyle.getTextForegroundStyle().b()) && ((c0Var == null || p013kotlin.jvm.internal.s.f(c0Var, spanStyle.getFontSynthesis())) && ((fontFeatureSettings == null || p013kotlin.jvm.internal.s.f(fontFeatureSettings, spanStyle.getFontFeatureSettings())) && (baselineShift == null || p013kotlin.jvm.internal.s.f(baselineShift, spanStyle.getBaselineShift())))))) {
                if (textGeometricTransform != null) {
                    textGeometricTransform2 = textGeometricTransform;
                    if (p013kotlin.jvm.internal.s.f(textGeometricTransform2, spanStyle.getTextGeometricTransform())) {
                    }
                } else {
                    textGeometricTransform2 = textGeometricTransform;
                }
                if (localeList == null || p013kotlin.jvm.internal.s.f(localeList, spanStyle.getLocaleList())) {
                    if (j14 != 16) {
                        background = j14;
                        if (p1.r(background, spanStyle.getBackground())) {
                        }
                    } else {
                        background = j14;
                    }
                    if ((shadow2 == null || p013kotlin.jvm.internal.s.f(shadow2, spanStyle.getShadow())) && (zVar == null || p013kotlin.jvm.internal.s.f(zVar, spanStyle.getPlatformStyle()))) {
                        gVar2 = gVar;
                        if (gVar2 == null || p013kotlin.jvm.internal.s.f(gVar2, spanStyle.getDrawStyle())) {
                            return spanStyle;
                        }
                    }
                }
                gVar2 = gVar;
            } else {
                textGeometricTransform2 = textGeometricTransform;
            }
            background = j14;
            gVar2 = gVar;
        } else {
            textGeometricTransform2 = textGeometricTransform;
            background = j14;
            gVar2 = gVar;
        }
        if (h1Var != null) {
            nVarB = t4.n.INSTANCE.a(h1Var, f11);
        } else {
            nVarB = t4.n.INSTANCE.b(j11);
        }
        t4.n nVarD2 = spanStyle.getTextForegroundStyle().d(nVarB);
        if (qVar == null) {
            fontFamily = spanStyle.getFontFamily();
        } else {
            fontFamily = qVar;
        }
        if (w4.w.i(fontSize)) {
            fontSize = spanStyle.getFontSize();
        }
        if (fontWeight == null) {
            fontWeight2 = spanStyle.getFontWeight();
        } else {
            fontWeight2 = fontWeight;
        }
        if (b0Var == null) {
            fontStyle = spanStyle.getFontStyle();
        } else {
            fontStyle = b0Var;
        }
        if (c0Var == null) {
            fontSynthesis = spanStyle.getFontSynthesis();
        } else {
            fontSynthesis = c0Var;
        }
        if (fontFeatureSettings == null) {
            fontFeatureSettings = spanStyle.getFontFeatureSettings();
        }
        if (w4.w.i(j13)) {
            letterSpacing = j13;
        } else {
            letterSpacing = spanStyle.getLetterSpacing();
        }
        if (baselineShift == null) {
            baselineShift = spanStyle.getBaselineShift();
        }
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = spanStyle.getTextGeometricTransform();
        }
        if (localeList == null) {
            localeList2 = spanStyle.getLocaleList();
        } else {
            localeList2 = localeList;
        }
        if (background == 16) {
            background = spanStyle.getBackground();
        }
        if (textDecoration == null) {
            textDecoration = spanStyle.getTextDecoration();
        }
        if (shadow2 == null) {
            shadow2 = spanStyle.getShadow();
        }
        Shadow shadow4 = shadow2;
        z zVarG2 = g(spanStyle, zVar);
        if (gVar2 == null) {
            drawStyle = spanStyle.getDrawStyle();
        } else {
            drawStyle = gVar2;
        }
        return new SpanStyle(nVarD2, fontSize, fontWeight2, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform2, localeList2, background, textDecoration, shadow4, zVarG2, drawStyle, (DefaultConstructorMarker) null);
    }

    public static final SpanStyle c(SpanStyle spanStyle, SpanStyle spanStyle2, float f11) {
        t4.n nVarB = t4.m.b(spanStyle.getTextForegroundStyle(), spanStyle2.getTextForegroundStyle(), f11);
        p014n4.q qVar = (p014n4.q) d(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f11);
        long jF = f(spanStyle.getFontSize(), spanStyle2.getFontSize(), f11);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.d();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.d();
        }
        FontWeight fontWeightA = p014n4.i0.a(fontWeight, fontWeight2, f11);
        p014n4.b0 b0Var = (p014n4.b0) d(spanStyle.getFontStyle(), spanStyle2.getFontStyle(), f11);
        p014n4.c0 c0Var = (p014n4.c0) d(spanStyle.getFontSynthesis(), spanStyle2.getFontSynthesis(), f11);
        String str = (String) d(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f11);
        long jF2 = f(spanStyle.getLetterSpacing(), spanStyle2.getLetterSpacing(), f11);
        t4.a baselineShift = spanStyle.getBaselineShift();
        float multiplier = baselineShift != null ? baselineShift.getMultiplier() : t4.a.c(BitmapDescriptorFactory.HUE_RED);
        t4.a baselineShift2 = spanStyle2.getBaselineShift();
        float fA = t4.b.a(multiplier, baselineShift2 != null ? baselineShift2.getMultiplier() : t4.a.c(BitmapDescriptorFactory.HUE_RED), f11);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransformA = t4.p.a(textGeometricTransform, textGeometricTransform2, f11);
        LocaleList localeList = (LocaleList) d(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f11);
        long jI = r1.i(spanStyle.getBackground(), spanStyle2.getBackground(), f11);
        t4.k kVar = (t4.k) d(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f11);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, BitmapDescriptorFactory.HUE_RED, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, BitmapDescriptorFactory.HUE_RED, 7, null);
        }
        return new SpanStyle(nVarB, jF, fontWeightA, b0Var, c0Var, qVar, str, jF2, t4.a.b(fA), textGeometricTransformA, localeList, jI, kVar, f4.a(shadow, shadow2, f11), e(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f11), (m3.g) d(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f11), (DefaultConstructorMarker) null);
    }

    public static final <T> T d(T t11, T t12, float f11) {
        return ((double) f11) < 0.5d ? t11 : t12;
    }

    private static final z e(z zVar, z zVar2, float f11) {
        if (zVar == null && zVar2 == null) {
            return null;
        }
        if (zVar == null) {
            zVar = z.INSTANCE.a();
        }
        if (zVar2 == null) {
            zVar2 = z.INSTANCE.a();
        }
        return c.c(zVar, zVar2, f11);
    }

    public static final long f(long j11, long j12, float f11) {
        return (w4.w.i(j11) || w4.w.i(j12)) ? ((w4.v) d(w4.v.b(j11), w4.v.b(j12), f11)).getPackedValue() : w4.w.j(j11, j12, f11);
    }

    private static final z g(SpanStyle spanStyle, z zVar) {
        if (spanStyle.getPlatformStyle() == null) {
            return zVar;
        }
        return zVar == null ? spanStyle.getPlatformStyle() : spanStyle.getPlatformStyle().b(zVar);
    }

    public static final SpanStyle h(SpanStyle spanStyle) {
        t4.n nVarA = spanStyle.getTextForegroundStyle().a(a.f75710c);
        long fontSize = w4.w.i(spanStyle.getFontSize()) ? f75705a : spanStyle.getFontSize();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.d();
        }
        FontWeight fontWeight2 = fontWeight;
        p014n4.b0 fontStyle = spanStyle.getFontStyle();
        p014n4.b0 b0VarC = p014n4.b0.c(fontStyle != null ? fontStyle.getValue() : p014n4.b0.INSTANCE.b());
        p014n4.c0 fontSynthesis = spanStyle.getFontSynthesis();
        p014n4.c0 c0VarE = p014n4.c0.e(fontSynthesis != null ? fontSynthesis.getValue() : p014n4.c0.INSTANCE.a());
        p014n4.q fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = p014n4.q.INSTANCE.a();
        }
        p014n4.q qVar = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = w4.w.i(spanStyle.getLetterSpacing()) ? f75706b : spanStyle.getLetterSpacing();
        t4.a baselineShift = spanStyle.getBaselineShift();
        t4.a aVarB = t4.a.b(baselineShift != null ? baselineShift.getMultiplier() : t4.a.INSTANCE.a());
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.a();
        }
        LocaleList localeList2 = localeList;
        long background = spanStyle.getBackground();
        if (background == 16) {
            background = f75707c;
        }
        long j11 = background;
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
        z platformStyle = spanStyle.getPlatformStyle();
        m3.g drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = m3.j.f90966a;
        }
        return new SpanStyle(nVarA, fontSize, fontWeight2, b0VarC, c0VarE, qVar, str, letterSpacing, aVarB, textGeometricTransform2, localeList2, j11, kVar, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
