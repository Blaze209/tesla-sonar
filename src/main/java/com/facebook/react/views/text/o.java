package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import ap.ReactTextPaintHolderSpan;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f23776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f23777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<TextPaint> f23778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, Spannable> f23779d;

    class a extends ThreadLocal<TextPaint> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextPaint initialValue() {
            return new TextPaint(1);
        }
    }

    static {
        ln.a aVar = ln.a.f90481a;
        f23776a = false;
        f23777b = o.class.getSimpleName();
        f23778c = new a();
        f23779d = new ConcurrentHashMap<>();
    }

    static void a(Spannable spannable, float f11, com.facebook.yoga.p pVar, float f12, com.facebook.yoga.p pVar2, double d11, int i11, boolean z11, int i12, int i13, Layout.Alignment alignment, int i14, TextPaint textPaint) {
        Spannable spannable2 = spannable;
        TextPaint textPaint2 = textPaint;
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable2, textPaint2);
        Layout layoutD = d(spannable2, metricsIsBoring, f11, pVar, z11, i12, i13, alignment, i14, textPaint2);
        int iH = (int) (Double.isNaN(d11) ? w.h(4.0f) : d11);
        int i15 = 0;
        int iMax = iH;
        for (ap.d dVar : (ap.d[]) spannable2.getSpans(0, spannable2.length(), ap.d.class)) {
            iMax = Math.max(iMax, dVar.getSize());
        }
        int i16 = iMax;
        while (i16 > iH) {
            if ((i11 == -1 || i11 == 0 || layoutD.getLineCount() <= i11) && ((pVar2 == com.facebook.yoga.p.UNDEFINED || layoutD.getHeight() <= f12) && (spannable2.length() != 1 || layoutD.getLineWidth(i15) <= f11))) {
                return;
            }
            int iMax2 = i16 - Math.max(1, (int) w.h(1.0f));
            float f13 = iMax2 / iMax;
            float f14 = iH;
            textPaint2.setTextSize(Math.max(textPaint2.getTextSize() * f13, f14));
            ap.d[] dVarArr = (ap.d[]) spannable2.getSpans(i15, spannable2.length(), ap.d.class);
            int length = dVarArr.length;
            int i17 = i15;
            while (i17 < length) {
                ap.d dVar2 = dVarArr[i17];
                spannable2.setSpan(new ap.d((int) Math.max(dVar2.getSize() * f13, f14)), spannable2.getSpanStart(dVar2), spannable2.getSpanEnd(dVar2), spannable2.getSpanFlags(dVar2));
                spannable2.removeSpan(dVar2);
                i17++;
                metricsIsBoring = metricsIsBoring;
                f13 = f13;
                dVarArr = dVarArr;
            }
            BoringLayout.Metrics metrics = metricsIsBoring;
            metricsIsBoring = metrics != null ? BoringLayout.isBoring(spannable2, textPaint2) : metrics;
            Layout layoutD2 = d(spannable2, metricsIsBoring, f11, pVar, z11, i12, i13, alignment, i14, textPaint2);
            spannable2 = spannable;
            textPaint2 = textPaint;
            i16 = iMax2;
            layoutD = layoutD2;
            i15 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r21.add(new ap.n(r6, r8, new ap.f(r11)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(android.content.Context r18, com.facebook.react.common.mapbuffer.a r19, android.text.SpannableStringBuilder r20, java.util.List<ap.n> r21) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.o.b(android.content.Context, com.facebook.react.common.mapbuffer.a, android.text.SpannableStringBuilder, java.util.List):void");
    }

    private static Layout c(@NonNull Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f11, float f12, j jVar) {
        TextPaint textPaint;
        Spannable spannable;
        boolean z11;
        Spannable spannableG = g(context, aVar, jVar);
        if (aVar.c(3)) {
            textPaint = ((ReactTextPaintHolderSpan[]) spannableG.getSpans(0, 0, ReactTextPaintHolderSpan.class))[0].getTextPaint();
        } else {
            m mVarA = m.a(aVar.w0(4));
            TextPaint textPaint2 = (TextPaint) u5.h.g(f23778c.get());
            p(textPaint2, mVarA, context);
            textPaint = textPaint2;
        }
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannableG, textPaint);
        int iM = m.m(aVar2.getString(2));
        boolean z12 = aVar2.c(4) ? aVar2.getBoolean(4) : true;
        int iG = m.g(aVar2.getString(5));
        boolean z13 = aVar2.c(3) ? aVar2.getBoolean(3) : false;
        int i11 = aVar2.c(0) ? aVar2.getInt(0) : -1;
        String strI = i(aVar);
        Layout.Alignment alignmentH = h(aVar, spannableG, strI);
        int iK = k(strI);
        if (z13) {
            spannable = spannableG;
            z11 = z12;
            a(spannable, f11, com.facebook.yoga.p.EXACTLY, f12, com.facebook.yoga.p.UNDEFINED, aVar2.c(6) ? aVar2.getDouble(6) : Double.NaN, i11, z11, iM, iG, alignmentH, iK, textPaint);
        } else {
            spannable = spannableG;
            z11 = z12;
        }
        return d(spannable, metricsIsBoring, f11, com.facebook.yoga.p.EXACTLY, z11, iM, iG, alignmentH, iK, textPaint);
    }

    private static Layout d(Spannable spannable, BoringLayout.Metrics metrics, float f11, com.facebook.yoga.p pVar, boolean z11, int i11, int i12, Layout.Alignment alignment, int i13, TextPaint textPaint) {
        int i14;
        int length = spannable.length();
        boolean z12 = pVar == com.facebook.yoga.p.UNDEFINED || f11 < BitmapDescriptorFactory.HUE_RED;
        float desiredWidth = metrics == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, length);
        if (metrics == null && (z12 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f11))) {
            if (pVar == com.facebook.yoga.p.EXACTLY) {
                desiredWidth = f11;
            }
            StaticLayout.Builder textDirection = StaticLayout.Builder.obtain(spannable, 0, length, textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(z11).setBreakStrategy(i11).setHyphenationFrequency(i12).setTextDirection(zIsRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (Build.VERSION.SDK_INT >= 28) {
                textDirection.setUseLineSpacingFromFallbacks(true);
            }
            return textDirection.build();
        }
        if (metrics == null || (!z12 && metrics.width > f11)) {
            StaticLayout.Builder textDirection2 = StaticLayout.Builder.obtain(spannable, 0, length, textPaint, (int) Math.ceil(f11)).setAlignment(alignment).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(z11).setBreakStrategy(i11).setHyphenationFrequency(i12).setTextDirection(zIsRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 26) {
                textDirection2.setJustificationMode(i13);
            }
            if (i15 >= 28) {
                textDirection2.setUseLineSpacingFromFallbacks(true);
            }
            return textDirection2.build();
        }
        int iCeil = metrics.width;
        if (pVar == com.facebook.yoga.p.EXACTLY) {
            iCeil = (int) Math.ceil(f11);
        }
        if (metrics.width < 0) {
            ReactSoftExceptionLogger.logSoftException(f23777b, new ReactNoCrashSoftException("Text width is invalid: " + metrics.width));
            i14 = 0;
        } else {
            i14 = iCeil;
        }
        return BoringLayout.make(spannable, textPaint, i14, alignment, 1.0f, BitmapDescriptorFactory.HUE_RED, metrics, z11);
    }

    private static Spannable e(Context context, com.facebook.react.common.mapbuffer.a aVar, j jVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        b(context, aVar.w0(2), spannableStringBuilder, arrayList);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ap.n) arrayList.get((arrayList.size() - i11) - 1)).a(spannableStringBuilder, i11);
        }
        if (jVar != null) {
            jVar.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static void f(int i11) {
        if (f23776a) {
            qk.a.m(f23777b, "Delete cached spannable for tag[" + i11 + "]");
        }
        f23779d.remove(Integer.valueOf(i11));
    }

    public static Spannable g(Context context, com.facebook.react.common.mapbuffer.a aVar, j jVar) {
        if (!aVar.c(3)) {
            return e(context, aVar, jVar);
        }
        return f23779d.get(Integer.valueOf(aVar.getInt(3)));
    }

    private static Layout.Alignment h(com.facebook.react.common.mapbuffer.a aVar, Spannable spannable, String str) {
        boolean z11 = l(aVar) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        Layout.Alignment alignment = z11 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        if (str == null) {
            return alignment;
        }
        if (str.equals("center")) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (str.equals("right")) {
            return z11 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return alignment;
    }

    private static String i(com.facebook.react.common.mapbuffer.a aVar) {
        if (!aVar.c(2)) {
            return null;
        }
        com.facebook.react.common.mapbuffer.a aVarW0 = aVar.w0(2);
        if (aVarW0.getCount() != 0) {
            com.facebook.react.common.mapbuffer.a aVarW1 = aVarW0.w0(0).w0(5);
            if (aVarW1.c(12)) {
                return aVarW1.getString(12);
            }
        }
        return null;
    }

    public static int j(com.facebook.react.common.mapbuffer.a aVar, Spannable spannable, int i11) {
        Layout.Alignment alignmentH = h(aVar, spannable, i(aVar));
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        if (alignmentH == Layout.Alignment.ALIGN_NORMAL) {
            return zIsRtl ? 5 : 3;
        }
        if (alignmentH == Layout.Alignment.ALIGN_OPPOSITE) {
            return zIsRtl ? 3 : 5;
        }
        if (alignmentH == Layout.Alignment.ALIGN_CENTER) {
            return 1;
        }
        return i11;
    }

    private static int k(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return -1;
        }
        return (str == null || !str.equals("justified")) ? 0 : 1;
    }

    public static boolean l(com.facebook.react.common.mapbuffer.a aVar) {
        if (!aVar.c(2)) {
            return false;
        }
        com.facebook.react.common.mapbuffer.a aVarW0 = aVar.w0(2);
        if (aVarW0.getCount() == 0) {
            return false;
        }
        com.facebook.react.common.mapbuffer.a aVarW1 = aVarW0.w0(0).w0(5);
        return aVarW1.c(23) && m.i(aVarW1.getString(23)) == 1;
    }

    public static WritableArray m(@NonNull Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f11, float f12) {
        Layout layoutC = c(context, aVar, aVar2, f11, f12, null);
        return b.a(layoutC.getText(), layoutC, (TextPaint) u5.h.g(f23778c.get()), context);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130  */
    /* JADX WARN: Code duplicated, block: B:80:0x0133  */
    public static long n(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f11, com.facebook.yoga.p pVar, float f12, com.facebook.yoga.p pVar2, j jVar, float[] fArr) {
        float fCeil;
        float lineBottom;
        boolean z11;
        char c11;
        float lineRight;
        char c12;
        float lineWidth;
        Layout layoutC = c(context, aVar, aVar2, f11, f12, jVar);
        Spannable spannable = (Spannable) layoutC.getText();
        if (spannable == null) {
            return 0L;
        }
        int i11 = 0;
        int i12 = -1;
        int i13 = aVar2.c(0) ? aVar2.getInt(0) : -1;
        int lineCount = (i13 == -1 || i13 == 0) ? layoutC.getLineCount() : Math.min(i13, layoutC.getLineCount());
        char c13 = '\n';
        boolean z12 = true;
        if (pVar == com.facebook.yoga.p.EXACTLY) {
            fCeil = f11;
        } else {
            fCeil = BitmapDescriptorFactory.HUE_RED;
            for (int i14 = 0; i14 < lineCount; i14++) {
                boolean z13 = spannable.length() > 0 && spannable.charAt(layoutC.getLineEnd(i14) - 1) == '\n';
                if (!z13 && i14 + 1 < layoutC.getLineCount()) {
                    fCeil = f11;
                    break;
                }
                float lineMax = z13 ? layoutC.getLineMax(i14) : layoutC.getLineWidth(i14);
                if (lineMax > fCeil) {
                    fCeil = lineMax;
                }
            }
            if (pVar == com.facebook.yoga.p.AT_MOST && fCeil > f11) {
                fCeil = f11;
            }
        }
        if (Build.VERSION.SDK_INT > 29) {
            fCeil = (float) Math.ceil(fCeil);
        }
        if (pVar2 != com.facebook.yoga.p.EXACTLY) {
            lineBottom = layoutC.getLineBottom(lineCount - 1);
            if (pVar2 == com.facebook.yoga.p.AT_MOST && lineBottom > f12) {
                lineBottom = f12;
            }
        } else {
            lineBottom = f12;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < spannable.length()) {
            int iNextSpanTransition = spannable.nextSpanTransition(i15, spannable.length(), ap.q.class);
            ap.q[] qVarArr = (ap.q[]) spannable.getSpans(i15, iNextSpanTransition, ap.q.class);
            int length = qVarArr.length;
            int i17 = i11;
            while (i17 < length) {
                ap.q qVar = qVarArr[i17];
                int spanStart = spannable.getSpanStart(qVar);
                int lineForOffset = layoutC.getLineForOffset(spanStart);
                if (layoutC.getEllipsisCount(lineForOffset) <= 0 || spanStart < layoutC.getLineStart(lineForOffset) + layoutC.getEllipsisStart(lineForOffset) || spanStart >= layoutC.getLineEnd(lineForOffset)) {
                    float f13 = qVar.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                    float f14 = qVar.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                    z11 = z12;
                    boolean zIsRtlCharAt = layoutC.isRtlCharAt(spanStart);
                    boolean z14 = layoutC.getParagraphDirection(lineForOffset) == i12 ? z11 : false;
                    if (spanStart == spannable.length() - 1) {
                        if (spannable.length() > 0) {
                            c12 = '\n';
                            if (spannable.charAt(layoutC.getLineEnd(lineForOffset) - 1) == '\n') {
                                lineWidth = layoutC.getLineMax(lineForOffset);
                            }
                            if (z14) {
                                lineRight = fCeil - lineWidth;
                            } else {
                                lineRight = layoutC.getLineRight(lineForOffset) - f13;
                            }
                            c11 = c12;
                        } else {
                            c12 = '\n';
                        }
                        lineWidth = layoutC.getLineWidth(lineForOffset);
                        if (z14) {
                            lineRight = fCeil - lineWidth;
                        } else {
                            lineRight = layoutC.getLineRight(lineForOffset) - f13;
                        }
                        c11 = c12;
                    } else {
                        c11 = '\n';
                        float primaryHorizontal = z14 == zIsRtlCharAt ? layoutC.getPrimaryHorizontal(spanStart) : layoutC.getSecondaryHorizontal(spanStart);
                        float lineRight2 = (!z14 || zIsRtlCharAt) ? primaryHorizontal : fCeil - (layoutC.getLineRight(lineForOffset) - primaryHorizontal);
                        lineRight = zIsRtlCharAt ? lineRight2 - f13 : lineRight2;
                    }
                    int i18 = i16 * 2;
                    fArr[i18] = w.f(layoutC.getLineBaseline(lineForOffset) - f14);
                    fArr[i18 + 1] = w.f(lineRight);
                    i16++;
                } else {
                    c11 = c13;
                    z11 = z12;
                }
                i17++;
                z12 = z11;
                c13 = c11;
                i11 = 0;
                i12 = -1;
            }
            i15 = iNextSpanTransition;
        }
        float f15 = w.f(fCeil);
        float f16 = w.f(lineBottom);
        if (f23776a) {
            qk.a.m(f23777b, "TextMeasure call ('" + ((Object) spannable) + "'): w: " + fCeil + " px - h: " + lineBottom + " px - w : " + f15 + " sp - h: " + f16 + " sp");
        }
        return com.facebook.yoga.q.a(f15, f16);
    }

    public static void o(int i11, @NonNull Spannable spannable) {
        if (f23776a) {
            qk.a.m(f23777b, "Set cached spannable for tag[" + i11 + "]: " + spannable.toString());
        }
        f23779d.put(Integer.valueOf(i11), spannable);
    }

    private static void p(TextPaint textPaint, m mVar, Context context) {
        textPaint.reset();
        textPaint.setAntiAlias(true);
        if (mVar.b() != -1) {
            textPaint.setTextSize(mVar.b());
        }
        if (mVar.e() == -1 && mVar.f() == -1 && mVar.d() == null) {
            textPaint.setTypeface(null);
            return;
        }
        Typeface typefaceA = k.a(null, mVar.e(), mVar.f(), mVar.d(), context.getAssets());
        textPaint.setTypeface(typefaceA);
        if (mVar.e() == -1 || mVar.e() == typefaceA.getStyle()) {
            return;
        }
        int iE = mVar.e() & (~typefaceA.getStyle());
        textPaint.setFakeBoldText((iE & 1) != 0);
        textPaint.setTextSkewX((iE & 2) != 0 ? -0.25f : BitmapDescriptorFactory.HUE_RED);
    }
}
