package androidx.media3.ui;

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
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f12986a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f12988b;

        private b(String str, Map<String, String> map) {
            this.f12987a = str;
            this.f12988b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Comparator<c> f12989e = new Comparator() { // from class: androidx.media3.ui.a0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z.c.b((z.c) obj, (z.c) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Comparator<c> f12990f = new Comparator() { // from class: androidx.media3.ui.b0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z.c.a((z.c) obj, (z.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f12993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f12994d;

        public static /* synthetic */ int a(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f12991a, cVar.f12991a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f12993c.compareTo(cVar.f12993c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f12994d.compareTo(cVar.f12994d);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f12992b, cVar.f12992b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f12993c.compareTo(cVar2.f12993c);
            return iCompareTo != 0 ? iCompareTo : cVar.f12994d.compareTo(cVar2.f12994d);
        }

        private c(int i11, int i12, String str, String str2) {
            this.f12991a = i11;
            this.f12992b = i12;
            this.f12993c = str;
            this.f12994d = str2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f12995a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<c> f12996b = new ArrayList();
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
            map.put(androidx.media3.ui.b.a("bg_" + iIntValue), q0.J("background-color:%s;", androidx.media3.ui.b.b(iIntValue)));
        }
        SparseArray<d> sparseArrayC = c(spanned, f11);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i12 = 0;
        while (i11 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i11);
            sb2.append(b(spanned.subSequence(i12, iKeyAt)));
            d dVar = sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f12996b, c.f12990f);
            Iterator it2 = dVar.f12996b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).f12994d);
            }
            Collections.sort(dVar.f12995a, c.f12989e);
            Iterator it3 = dVar.f12995a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).f12993c);
            }
            i11++;
            i12 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i12, spanned.length())));
        return new b(sb2.toString(), map);
    }

    private static String b(CharSequence charSequence) {
        return f12986a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f11) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f11);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                s7.a.f(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f12995a.add(cVar);
                f(sparseArray, spanEnd).f12996b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof r7.g) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof r7.k)) {
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
            if (obj instanceof r7.i) {
                return "<rt>" + b(((r7.i) obj).f107115a) + "</rt></ruby>";
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
            return q0.J("<span style='color:%s;'>", androidx.media3.ui.b.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return q0.J("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof r7.g) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return q0.J("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f11));
        }
        if (obj instanceof RelativeSizeSpan) {
            return q0.J("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return q0.J("<span style='font-family:\"%s\";'>", family);
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
        if (!(obj instanceof r7.i)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof r7.k)) {
                return null;
            }
            r7.k kVar = (r7.k) obj;
            return q0.J("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(kVar.f107120a, kVar.f107121b), g(kVar.f107122c));
        }
        int i11 = ((r7.i) obj).f107116b;
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

    private static d f(SparseArray<d> sparseArray, int i11) {
        d dVar = sparseArray.get(i11);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i11, dVar2);
        return dVar2;
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
