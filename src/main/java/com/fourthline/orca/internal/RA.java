package com.fourthline.orca.internal;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import i4.SpanStyle;
import java.util.Arrays;
import p013kotlin.NoWhenBranchMatchedException;
import p014n4.FontWeight;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RA {
    public static final String a(QA qa2, wn0.a resources) {
        p013kotlin.jvm.internal.s.k(qa2, "<this>");
        p013kotlin.jvm.internal.s.k(resources, "resources");
        return a(qa2, (Resources) resources.invoke());
    }

    public static final i4.d b(QA qa2, p020r2.l lVar, int i11) {
        SpannedString spannedString;
        p013kotlin.jvm.internal.s.k(qa2, "<this>");
        lVar.o(1862927287);
        if (p020r2.o.J()) {
            p020r2.o.S(1862927287, i11, -1, "com.fourthline.orca.core.internal.styling.text.asAnnotatedString (TextResource.kt:88)");
        }
        Resources resourcesE = C3825sp.f35377a.e(lVar, 6);
        int i12 = 0;
        if (qa2 instanceof QA.d) {
            spannedString = new SpannedString(resourcesE.getText(((QA.d) qa2).b()));
        } else if (qa2 instanceof QA.c) {
            QA.c cVar = (QA.c) qa2;
            int iB = cVar.b();
            String[] strArr = (String[]) cVar.a().toArray(new String[0]);
            spannedString = new SpannedString(a(resourcesE, iB, (String[]) Arrays.copyOf(strArr, strArr.length)));
        } else if (qa2 instanceof QA.e) {
            String strA = ((QA.e) qa2).a();
            p013kotlin.jvm.internal.s.i(strA, "null cannot be cast to non-null type kotlin.CharSequence");
            spannedString = new SpannedString(strA);
        } else {
            if (!(qa2 instanceof QA.b)) {
                throw new NoWhenBranchMatchedException();
            }
            spannedString = new SpannedString("");
        }
        i4.d.a aVar = new i4.d.a(i12, 1, null);
        String string = spannedString.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        aVar.i(string);
        Object[] spans = spannedString.getSpans(0, spannedString.length(), Object.class);
        p013kotlin.jvm.internal.s.j(spans, "getSpans(...)");
        int length = spans.length;
        while (i12 < length) {
            Object obj = spans[i12];
            int spanStart = spannedString.getSpanStart(obj);
            int spanEnd = spannedString.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    aVar.c(new SpanStyle(0L, 0L, FontWeight.INSTANCE.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null), spanStart, spanEnd);
                } else if (style == 2) {
                    aVar.c(new SpanStyle(0L, 0L, null, p014n4.b0.c(p014n4.b0.INSTANCE.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null), spanStart, spanEnd);
                } else if (style == 3) {
                    aVar.c(new SpanStyle(0L, 0L, FontWeight.INSTANCE.a(), p014n4.b0.c(p014n4.b0.INSTANCE.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), spanStart, spanEnd);
                }
            } else if (obj instanceof UnderlineSpan) {
                aVar.c(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61439, null), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                aVar.c(new SpanStyle(k3.r1.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), spanStart, spanEnd);
            }
            i12++;
        }
        i4.d dVarO = aVar.o();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return dVarO;
    }

    public static final String c(QA qa2, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(qa2, "<this>");
        lVar.o(588039963);
        if (p020r2.o.J()) {
            p020r2.o.S(588039963, i11, -1, "com.fourthline.orca.core.internal.styling.text.asString (TextResource.kt:61)");
        }
        String strA = a(qa2, C3825sp.f35377a.e(lVar, 6));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return strA;
    }

    public static final String a(QA qa2, Resources resources) {
        String strA;
        p013kotlin.jvm.internal.s.k(qa2, "<this>");
        p013kotlin.jvm.internal.s.k(resources, "resources");
        if (qa2 instanceof QA.d) {
            strA = resources.getString(((QA.d) qa2).b());
        } else if (qa2 instanceof QA.c) {
            QA.c cVar = (QA.c) qa2;
            int iB = cVar.b();
            String[] strArr = (String[]) cVar.a().toArray(new String[0]);
            strA = resources.getString(iB, Arrays.copyOf(strArr, strArr.length));
        } else if (qa2 instanceof QA.e) {
            strA = ((QA.e) qa2).a();
        } else {
            if (!(qa2 instanceof QA.b)) {
                throw new NoWhenBranchMatchedException();
            }
            strA = "";
        }
        p013kotlin.jvm.internal.s.j(strA, "with(...)");
        return strA;
    }

    public static final String a(QA qa2, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(qa2, "<this>");
        lVar.o(1056690694);
        if (p020r2.o.J()) {
            p020r2.o.S(1056690694, i11, -1, "com.fourthline.orca.core.internal.styling.text.accessibilityDescription (TextResource.kt:76)");
        }
        C3825sp c3825sp = C3825sp.f35377a;
        Resources resourcesE = c3825sp.e(lVar, 6);
        lVar.o(-1352793399);
        String string = qa2 instanceof QA.d ? resourcesE.getString(((QA.d) qa2).a()) : a(qa2, c3825sp.e(lVar, 6));
        lVar.l();
        p013kotlin.jvm.internal.s.h(string);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return string;
    }

    private static final CharSequence a(Resources resources, int i11, String... strArr) {
        SpannedString spannedString = new SpannedString(resources.getText(i11));
        p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
        String html = Html.toHtml(spannedString, 63);
        p013kotlin.jvm.internal.s.j(html, "toHtml(...)");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(html, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        Spanned spannedFromHtml = Html.fromHtml(str, 63);
        p013kotlin.jvm.internal.s.h(spannedFromHtml);
        return p013kotlin.text.t.F1(spannedFromHtml);
    }
}
