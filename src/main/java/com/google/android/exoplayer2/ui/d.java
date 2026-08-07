package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f40865a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f40867b;

        private b(String str, Map<String, String> map) {
            this.f40866a = str;
            this.f40867b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Comparator<c> f40868e = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.c.a((d.c) obj, (d.c) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Comparator<c> f40869f = new Comparator() { // from class: com.google.android.exoplayer2.ui.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.c.b((d.c) obj, (d.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f40872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f40873d;

        public static /* synthetic */ int a(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f40871b, cVar.f40871b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f40872c.compareTo(cVar2.f40872c);
            return iCompareTo != 0 ? iCompareTo : cVar.f40873d.compareTo(cVar2.f40873d);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f40870a, cVar.f40870a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f40872c.compareTo(cVar.f40872c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f40873d.compareTo(cVar.f40873d);
        }

        private c(int i11, int i12, String str, String str2) {
            this.f40870a = i11;
            this.f40871b = i12;
            this.f40872c = str;
            this.f40873d = str2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$d, reason: collision with other inner class name */
    private static final class C0653d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f40874a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<c> f40875b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f11) {
        if (charSequence == null) {
            return new b("", com.google.common.collect.z.m());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), com.google.common.collect.z.m());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i11 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(com.google.android.exoplayer2.ui.c.a("bg_" + iIntValue), p0.B("background-color:%s;", com.google.android.exoplayer2.ui.c.b(iIntValue)));
        }
        SparseArray<C0653d> sparseArrayC = c(spanned, f11);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i12 = 0;
        while (i11 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i11);
            sb2.append(b(spanned.subSequence(i12, iKeyAt)));
            C0653d c0653d = sparseArrayC.get(iKeyAt);
            Collections.sort(c0653d.f40875b, c.f40869f);
            Iterator it2 = c0653d.f40875b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).f40873d);
            }
            Collections.sort(c0653d.f40874a, c.f40868e);
            Iterator it3 = c0653d.f40874a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).f40872c);
            }
            i11++;
            i12 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i12, spanned.length())));
        return new b(sb2.toString(), map);
    }

    private static String b(CharSequence charSequence) {
        return f40865a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<C0653d> c(Spanned spanned, float f11) {
        SparseArray<C0653d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f11);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                ts.a.e(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f40874a.add(cVar);
                f(sparseArray, spanEnd).f40875b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof ks.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof ks.e)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof ks.c) {
                return "<rt>" + b(((ks.c) obj).f89374a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f11) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return p0.B("<span style='color:%s;'>", com.google.android.exoplayer2.ui.c.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return p0.B("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof ks.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return p0.B("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f11));
        }
        if (obj instanceof RelativeSizeSpan) {
            return p0.B("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return p0.B("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof ks.c)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof ks.e)) {
                return null;
            }
            ks.e eVar = (ks.e) obj;
            return p0.B("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(eVar.f89376a, eVar.f89377b), g(eVar.f89378c));
        }
        int i11 = ((ks.c) obj).f89375b;
        if (i11 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i11 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i11 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static C0653d f(SparseArray<C0653d> sparseArray, int i11) {
        C0653d c0653d = sparseArray.get(i11);
        if (c0653d != null) {
            return c0653d;
        }
        C0653d c0653d2 = new C0653d();
        sparseArray.put(i11, c0653d2);
        return c0653d2;
    }

    private static String g(int i11) {
        return i11 != 2 ? "over right" : "under left";
    }

    private static String h(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        if (i12 == 1) {
            sb2.append("filled ");
        } else if (i12 == 2) {
            sb2.append("open ");
        }
        if (i11 == 0) {
            sb2.append("none");
        } else if (i11 == 1) {
            sb2.append("circle");
        } else if (i11 == 2) {
            sb2.append("dot");
        } else if (i11 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
