package r4;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.SpanStyle;
import i4.TextStyle;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import k3.Shadow;
import k3.SolidColor;
import k3.c4;
import k3.h1;
import k3.r1;
import l4.f;
import l4.h;
import l4.l;
import l4.m;
import l4.o;
import m3.g;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import p4.LocaleList;
import t4.LineHeightStyle;
import t4.TextGeometricTransform;
import t4.TextIndent;
import t4.k;
import w4.v;
import w4.w;
import w4.x;
import wn0.q;
import wn0.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a6\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a_\u0010+\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u0006\u0010\u000e\u001a\u00020\r2&\u0010*\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0$H\u0000¢\u0006\u0004\b+\u0010,\u001a)\u0010.\u001a\u00020\u0006*\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010/\u001aW\u00100\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2&\u0010*\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0$H\u0002¢\u0006\u0004\b0\u00101\u001aM\u00105\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\"2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u001e\u00104\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000603H\u0000¢\u0006\u0004\b5\u00106\u001a$\u00109\u001a\u0004\u0018\u0001082\u0006\u00107\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a-\u0010=\u001a\u00020\u0006*\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>\u001a-\u0010A\u001a\u00020\u0006*\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bA\u0010B\u001a.\u0010E\u001a\u00020\u0006*\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a-\u0010I\u001a\u00020\u0006*\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bI\u0010J\u001a-\u0010M\u001a\u00020\u0006*\u00020\u00002\b\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bM\u0010N\u001a-\u0010Q\u001a\u00020\u0006*\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bQ\u0010R\u001a6\u0010T\u001a\u00020\u0006*\u00020\u00002\u0006\u0010S\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a-\u0010X\u001a\u00020\u0006*\u00020\u00002\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bX\u0010Y\u001a.\u0010Z\u001a\u00020\u0006*\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bZ\u0010F\u001a0\u0010]\u001a\u00020\u0006*\u00020\u00002\b\u0010\\\u001a\u0004\u0018\u00010[2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b]\u0010^\u001a5\u0010b\u001a\u00020\u0006*\u00020\u00002\b\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bb\u0010c\u001a\u0013\u0010d\u001a\u00020\u001b*\u00020\u001eH\u0002¢\u0006\u0004\bd\u0010e\u001a\u001d\u0010g\u001a\u00020\"*\u0004\u0018\u00010\"2\u0006\u0010f\u001a\u00020\"H\u0002¢\u0006\u0004\bg\u0010h\"\u0018\u0010k\u001a\u00020\u001b*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "Ljn0/h0;", "u", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Lt4/q;", "textIndent", "", "contextFontSize", "Lw4/d;", "density", "y", "(Landroid/text/Spannable;Lt4/q;FLw4/d;)V", "Lw4/v;", "lineHeight", "Lt4/h;", "lineHeightStyle", "q", "(Landroid/text/Spannable;JFLw4/d;Lt4/h;)V", "r", "(Landroid/text/Spannable;JFLw4/d;)V", "g", "(JFLw4/d;)F", "", "e", "(Lw4/d;)Z", "Li4/r0;", "contextTextStyle", "", "Li4/d$c;", "Li4/d0;", "spanStyles", "Lkotlin/Function4;", "Ln4/q;", "Ln4/f0;", "Ln4/b0;", "Ln4/c0;", "Landroid/graphics/Typeface;", "resolveTypeface", "w", "(Landroid/text/Spannable;Li4/r0;Ljava/util/List;Lw4/d;Lwn0/r;)V", "spanStyleRange", "v", "(Landroid/text/Spannable;Li4/d$c;Lw4/d;)V", "m", "(Landroid/text/Spannable;Li4/r0;Ljava/util/List;Lwn0/r;)V", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "b", "(Li4/d0;Ljava/util/List;Lwn0/q;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "a", "(JLw4/d;)Landroid/text/style/MetricAffectingSpan;", "Lk3/e4;", "shadow", "t", "(Landroid/text/Spannable;Lk3/e4;II)V", "Lm3/g;", "drawStyle", "l", "(Landroid/text/Spannable;Lm3/g;II)V", "Lk3/p1;", "color", "h", "(Landroid/text/Spannable;JII)V", "Lp4/e;", "localeList", "s", "(Landroid/text/Spannable;Lp4/e;II)V", "Lt4/o;", "textGeometricTransform", "p", "(Landroid/text/Spannable;Lt4/o;II)V", "", "fontFeatureSettings", "n", "(Landroid/text/Spannable;Ljava/lang/String;II)V", OrcaFlavourKeys.FONT_SIZE, "o", "(Landroid/text/Spannable;JLw4/d;II)V", "Lt4/k;", "textDecoration", "x", "(Landroid/text/Spannable;Lt4/k;II)V", "k", "Lt4/a;", "baselineShift", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/text/Spannable;Lt4/a;II)V", "Lk3/h1;", "brush", "alpha", "j", "(Landroid/text/Spannable;Lk3/h1;FII)V", DateTokenConverter.CONVERTER_KEY, "(Li4/r0;)Z", "spanStyle", "f", "(Li4/d0;Li4/d0;)Li4/d0;", "c", "(Li4/d0;)Z", "needsLetterSpacingSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li4/d0;", "spanStyle", "", "start", "end", "Ljn0/h0;", "a", "(Li4/d0;II)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<SpanStyle, Integer, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Spannable f106967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r<p014n4.q, FontWeight, b0, c0, Typeface> f106968d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Spannable spannable, r<? super p014n4.q, ? super FontWeight, ? super b0, ? super c0, ? extends Typeface> rVar) {
            super(3);
            this.f106967c = spannable;
            this.f106968d = rVar;
        }

        public final void a(SpanStyle spanStyle, int i11, int i12) {
            Spannable spannable = this.f106967c;
            r<p014n4.q, FontWeight, b0, c0, Typeface> rVar = this.f106968d;
            p014n4.q fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.d();
            }
            b0 fontStyle = spanStyle.getFontStyle();
            b0 b0VarC = b0.c(fontStyle != null ? fontStyle.getValue() : b0.INSTANCE.b());
            c0 fontSynthesis = spanStyle.getFontSynthesis();
            spannable.setSpan(new o(rVar.invoke(fontFamily, fontWeight, b0VarC, c0.e(fontSynthesis != null ? fontSynthesis.getValue() : c0.INSTANCE.a()))), i11, i12, 33);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(SpanStyle spanStyle, Integer num, Integer num2) {
            a(spanStyle, num.intValue(), num2.intValue());
            return h0.f84049a;
        }
    }

    private static final MetricAffectingSpan a(long j11, w4.d dVar) {
        long jG = v.g(j11);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            return new f(dVar.m1(j11));
        }
        if (x.g(jG, companion.a())) {
            return new l4.e(v.h(j11));
        }
        return null;
    }

    public static final void b(SpanStyle spanStyle, List<i4.d.Range<SpanStyle>> list, q<? super SpanStyle, ? super Integer, ? super Integer, h0> qVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            qVar.invoke(f(spanStyle, list.get(0).e()), Integer.valueOf(list.get(0).f()), Integer.valueOf(list.get(0).d()));
            return;
        }
        int size = list.size();
        int i11 = size * 2;
        Integer[] numArr = new Integer[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            numArr[i12] = 0;
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            i4.d.Range<SpanStyle> range = list.get(i13);
            numArr[i13] = Integer.valueOf(range.f());
            numArr[i13 + size] = Integer.valueOf(range.d());
        }
        n.Q(numArr);
        int iIntValue = ((Number) n.k0(numArr)).intValue();
        for (int i14 = 0; i14 < i11; i14++) {
            Integer num = numArr[i14];
            int iIntValue2 = num.intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                SpanStyle spanStyleF = spanStyle;
                for (int i15 = 0; i15 < size3; i15++) {
                    i4.d.Range<SpanStyle> range2 = list.get(i15);
                    if (range2.f() != range2.d() && i4.e.l(iIntValue, iIntValue2, range2.f(), range2.d())) {
                        spanStyleF = f(spanStyleF, range2.e());
                    }
                }
                if (spanStyleF != null) {
                    qVar.invoke(spanStyleF, Integer.valueOf(iIntValue), num);
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean c(SpanStyle spanStyle) {
        long jG = v.g(spanStyle.getLetterSpacing());
        x.Companion companion = x.INSTANCE;
        return x.g(jG, companion.b()) || x.g(v.g(spanStyle.getLetterSpacing()), companion.a());
    }

    private static final boolean d(TextStyle textStyle) {
        return d.d(textStyle.O()) || textStyle.p() != null;
    }

    private static final boolean e(w4.d dVar) {
        return ((double) dVar.getFontScale()) > 1.05d;
    }

    private static final SpanStyle f(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.x(spanStyle2);
    }

    private static final float g(long j11, float f11, w4.d dVar) {
        float fH;
        long jG = v.g(j11);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            if (!e(dVar)) {
                return dVar.m1(j11);
            }
            fH = v.h(j11) / v.h(dVar.s(f11));
        } else {
            if (!x.g(jG, companion.a())) {
                return Float.NaN;
            }
            fH = v.h(j11);
        }
        return fH * f11;
    }

    public static final void h(Spannable spannable, long j11, int i11, int i12) {
        if (j11 != 16) {
            u(spannable, new BackgroundColorSpan(r1.k(j11)), i11, i12);
        }
    }

    private static final void i(Spannable spannable, t4.a aVar, int i11, int i12) {
        if (aVar != null) {
            u(spannable, new l4.a(aVar.getMultiplier()), i11, i12);
        }
    }

    private static final void j(Spannable spannable, h1 h1Var, float f11, int i11, int i12) {
        if (h1Var != null) {
            if (h1Var instanceof SolidColor) {
                k(spannable, ((SolidColor) h1Var).getValue(), i11, i12);
            } else if (h1Var instanceof c4) {
                u(spannable, new s4.b((c4) h1Var, f11), i11, i12);
            }
        }
    }

    public static final void k(Spannable spannable, long j11, int i11, int i12) {
        if (j11 != 16) {
            u(spannable, new ForegroundColorSpan(r1.k(j11)), i11, i12);
        }
    }

    private static final void l(Spannable spannable, g gVar, int i11, int i12) {
        if (gVar != null) {
            u(spannable, new s4.a(gVar), i11, i12);
        }
    }

    private static final void m(Spannable spannable, TextStyle textStyle, List<i4.d.Range<SpanStyle>> list, r<? super p014n4.q, ? super FontWeight, ? super b0, ? super c0, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            i4.d.Range<SpanStyle> range = list.get(i11);
            i4.d.Range<SpanStyle> range2 = range;
            if (d.d(range2.e()) || range2.e().getFontSynthesis() != null) {
                arrayList.add(range);
            }
        }
        b(d(textStyle) ? new SpanStyle(0L, 0L, textStyle.q(), textStyle.o(), textStyle.p(), textStyle.l(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList, new a(spannable, rVar));
    }

    private static final void n(Spannable spannable, String str, int i11, int i12) {
        if (str != null) {
            u(spannable, new l4.b(str), i11, i12);
        }
    }

    public static final void o(Spannable spannable, long j11, w4.d dVar, int i11, int i12) {
        long jG = v.g(j11);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            u(spannable, new AbsoluteSizeSpan(yn0.a.d(dVar.m1(j11)), false), i11, i12);
        } else if (x.g(jG, companion.a())) {
            u(spannable, new RelativeSizeSpan(v.h(j11)), i11, i12);
        }
    }

    private static final void p(Spannable spannable, TextGeometricTransform textGeometricTransform, int i11, int i12) {
        if (textGeometricTransform != null) {
            u(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i11, i12);
            u(spannable, new m(textGeometricTransform.getSkewX()), i11, i12);
        }
    }

    public static final void q(Spannable spannable, long j11, float f11, w4.d dVar, LineHeightStyle lineHeightStyle) {
        float fG = g(j11, f11, dVar);
        if (Float.isNaN(fG)) {
            return;
        }
        u(spannable, new h(fG, 0, (spannable.length() == 0 || t.Q1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.c.f(lineHeightStyle.getTrim()), LineHeightStyle.c.g(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment()), 0, spannable.length());
    }

    public static final void r(Spannable spannable, long j11, float f11, w4.d dVar) {
        float fG = g(j11, f11, dVar);
        if (Float.isNaN(fG)) {
            return;
        }
        u(spannable, new l4.g(fG), 0, spannable.length());
    }

    public static final void s(Spannable spannable, LocaleList localeList, int i11, int i12) {
        if (localeList != null) {
            u(spannable, r4.a.f106966a.a(localeList), i11, i12);
        }
    }

    private static final void t(Spannable spannable, Shadow shadow, int i11, int i12) {
        if (shadow != null) {
            u(spannable, new l(r1.k(shadow.getColor()), j3.g.m(shadow.getOffset()), j3.g.n(shadow.getOffset()), d.b(shadow.getBlurRadius())), i11, i12);
        }
    }

    public static final void u(Spannable spannable, Object obj, int i11, int i12) {
        spannable.setSpan(obj, i11, i12, 33);
    }

    private static final void v(Spannable spannable, i4.d.Range<SpanStyle> range, w4.d dVar) {
        int iF = range.f();
        int iD = range.d();
        SpanStyle spanStyleE = range.e();
        i(spannable, spanStyleE.getBaselineShift(), iF, iD);
        k(spannable, spanStyleE.g(), iF, iD);
        j(spannable, spanStyleE.f(), spanStyleE.c(), iF, iD);
        x(spannable, spanStyleE.getTextDecoration(), iF, iD);
        o(spannable, spanStyleE.getFontSize(), dVar, iF, iD);
        n(spannable, spanStyleE.getFontFeatureSettings(), iF, iD);
        p(spannable, spanStyleE.getTextGeometricTransform(), iF, iD);
        s(spannable, spanStyleE.getLocaleList(), iF, iD);
        h(spannable, spanStyleE.getBackground(), iF, iD);
        t(spannable, spanStyleE.getShadow(), iF, iD);
        l(spannable, spanStyleE.getDrawStyle(), iF, iD);
    }

    public static final void w(Spannable spannable, TextStyle textStyle, List<i4.d.Range<SpanStyle>> list, w4.d dVar, r<? super p014n4.q, ? super FontWeight, ? super b0, ? super c0, ? extends Typeface> rVar) {
        MetricAffectingSpan metricAffectingSpanA;
        m(spannable, textStyle, list, rVar);
        int size = list.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            i4.d.Range<SpanStyle> range = list.get(i11);
            int iF = range.f();
            int iD = range.d();
            if (iF >= 0 && iF < spannable.length() && iD > iF && iD <= spannable.length()) {
                v(spannable, range, dVar);
                if (c(range.e())) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                i4.d.Range<SpanStyle> range2 = list.get(i12);
                int iF2 = range2.f();
                int iD2 = range2.d();
                SpanStyle spanStyleE = range2.e();
                if (iF2 >= 0 && iF2 < spannable.length() && iD2 > iF2 && iD2 <= spannable.length() && (metricAffectingSpanA = a(spanStyleE.getLetterSpacing(), dVar)) != null) {
                    u(spannable, metricAffectingSpanA, iF2, iD2);
                }
            }
        }
    }

    public static final void x(Spannable spannable, k kVar, int i11, int i12) {
        if (kVar != null) {
            k.Companion companion = k.INSTANCE;
            u(spannable, new l4.n(kVar.d(companion.d()), kVar.d(companion.b())), i11, i12);
        }
    }

    public static final void y(Spannable spannable, TextIndent textIndent, float f11, w4.d dVar) {
        float fH;
        if (textIndent != null) {
            if ((v.e(textIndent.getFirstLine(), w.h(0)) && v.e(textIndent.getRestLine(), w.h(0))) || w.i(textIndent.getFirstLine()) || w.i(textIndent.getRestLine())) {
                return;
            }
            long jG = v.g(textIndent.getFirstLine());
            x.Companion companion = x.INSTANCE;
            boolean zG = x.g(jG, companion.b());
            float fH2 = BitmapDescriptorFactory.HUE_RED;
            if (zG) {
                fH = dVar.m1(textIndent.getFirstLine());
            } else {
                fH = x.g(jG, companion.a()) ? v.h(textIndent.getFirstLine()) * f11 : 0.0f;
            }
            long jG2 = v.g(textIndent.getRestLine());
            if (x.g(jG2, companion.b())) {
                fH2 = dVar.m1(textIndent.getRestLine());
            } else if (x.g(jG2, companion.a())) {
                fH2 = v.h(textIndent.getRestLine()) * f11;
            }
            u(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fH), (int) Math.ceil(fH2)), 0, spannable.length());
        }
    }
}
