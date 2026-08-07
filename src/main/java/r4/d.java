package r4;

import android.graphics.Typeface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.SpanStyle;
import j3.m;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import p014n4.q;
import p4.LocaleList;
import q4.i;
import t4.TextGeometricTransform;
import w4.v;
import w4.x;
import wn0.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lq4/i;", "Li4/d0;", "style", "Lkotlin/Function4;", "Ln4/q;", "Ln4/f0;", "Ln4/b0;", "Ln4/c0;", "Landroid/graphics/Typeface;", "resolveTypeface", "Lw4/d;", "density", "", "requiresLetterSpacing", "a", "(Lq4/i;Li4/d0;Lwn0/r;Lw4/d;Z)Li4/d0;", "Lw4/v;", "letterSpacing", "Lk3/p1;", AppStateModule.APP_STATE_BACKGROUND, "Lt4/a;", "baselineShift", "c", "(JZJLt4/a;)Li4/d0;", "Lt4/s;", "textMotion", "Ljn0/h0;", "e", "(Lq4/i;Lt4/s;)V", DateTokenConverter.CONVERTER_KEY, "(Li4/d0;)Z", "", "blurRadius", "b", "(F)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final SpanStyle a(i iVar, SpanStyle spanStyle, r<? super q, ? super FontWeight, ? super b0, ? super c0, ? extends Typeface> rVar, w4.d dVar, boolean z11) {
        long jG = v.g(spanStyle.getFontSize());
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            iVar.setTextSize(dVar.m1(spanStyle.getFontSize()));
        } else if (x.g(jG, companion.a())) {
            iVar.setTextSize(iVar.getTextSize() * v.h(spanStyle.getFontSize()));
        }
        if (d(spanStyle)) {
            q fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.d();
            }
            b0 fontStyle = spanStyle.getFontStyle();
            b0 b0VarC = b0.c(fontStyle != null ? fontStyle.getValue() : b0.INSTANCE.b());
            c0 fontSynthesis = spanStyle.getFontSynthesis();
            iVar.setTypeface(rVar.invoke(fontFamily, fontWeight, b0VarC, c0.e(fontSynthesis != null ? fontSynthesis.getValue() : c0.INSTANCE.a())));
        }
        if (spanStyle.getLocaleList() != null && !s.f(spanStyle.getLocaleList(), LocaleList.INSTANCE.a())) {
            a.f106966a.b(iVar, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !s.f(spanStyle.getFontFeatureSettings(), "")) {
            iVar.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !s.f(spanStyle.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.a())) {
            iVar.setTextScaleX(iVar.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            iVar.setTextSkewX(iVar.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        iVar.f(spanStyle.g());
        iVar.e(spanStyle.f(), m.INSTANCE.a(), spanStyle.c());
        iVar.h(spanStyle.getShadow());
        iVar.i(spanStyle.getTextDecoration());
        iVar.g(spanStyle.getDrawStyle());
        if (x.g(v.g(spanStyle.getLetterSpacing()), companion.b()) && v.h(spanStyle.getLetterSpacing()) != BitmapDescriptorFactory.HUE_RED) {
            float textSize = iVar.getTextSize() * iVar.getTextScaleX();
            float fM1 = dVar.m1(spanStyle.getLetterSpacing());
            if (textSize != BitmapDescriptorFactory.HUE_RED) {
                iVar.setLetterSpacing(fM1 / textSize);
            }
        } else if (x.g(v.g(spanStyle.getLetterSpacing()), companion.a())) {
            iVar.setLetterSpacing(v.h(spanStyle.getLetterSpacing()));
        }
        return c(spanStyle.getLetterSpacing(), z11, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    public static final float b(float f11) {
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            return Float.MIN_VALUE;
        }
        return f11;
    }

    private static final SpanStyle c(long j11, boolean z11, long j12, t4.a aVar) {
        long j13 = j12;
        boolean z12 = false;
        boolean z13 = z11 && x.g(v.g(j11), x.INSTANCE.b()) && v.h(j11) != BitmapDescriptorFactory.HUE_RED;
        p1.Companion companion = p1.INSTANCE;
        boolean z14 = (p1.r(j13, companion.j()) || p1.r(j13, companion.i())) ? false : true;
        if (aVar != null) {
            if (!t4.a.e(aVar.getMultiplier(), t4.a.INSTANCE.a())) {
                z12 = true;
            }
        }
        if (!z13 && !z14 && !z12) {
            return null;
        }
        long jA = z13 ? j11 : v.INSTANCE.a();
        if (!z14) {
            j13 = companion.j();
        }
        return new SpanStyle(0L, 0L, null, null, null, null, null, jA, z12 ? aVar : null, null, null, j13, null, null, null, null, 63103, null);
    }

    public static final boolean d(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void e(i iVar, t4.s sVar) {
        if (sVar == null) {
            sVar = t4.s.INSTANCE.a();
        }
        iVar.setFlags(sVar.getSubpixelTextPositioning() ? iVar.getFlags() | 128 : iVar.getFlags() & (-129));
        int linearity = sVar.getLinearity();
        t4.s.b.Companion companion = t4.s.b.INSTANCE;
        if (t4.s.b.e(linearity, companion.b())) {
            iVar.setFlags(iVar.getFlags() | 64);
            iVar.setHinting(0);
        } else if (t4.s.b.e(linearity, companion.a())) {
            iVar.getFlags();
            iVar.setHinting(1);
        } else if (!t4.s.b.e(linearity, companion.c())) {
            iVar.getFlags();
        } else {
            iVar.getFlags();
            iVar.setHinting(0);
        }
    }
}
