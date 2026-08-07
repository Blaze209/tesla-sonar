package ca;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r7.l;
import s7.c0;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f18988a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f18989b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f18990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f18991d;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<b> f18992c = new Comparator() { // from class: ca.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((e.b) obj).f18993a.f18996b, ((e.b) obj2).f18993a.f18996b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f18993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18994b;

        private b(c cVar, int i11) {
            this.f18993a = cVar;
            this.f18994b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f18997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f18998d;

        private c(String str, int i11, String str2, Set<String> set) {
            this.f18996b = i11;
            this.f18995a = str;
            this.f18997c = str2;
            this.f18998d = set;
        }

        public static c a(String str, int i11) {
            String str2;
            String strTrim = str.trim();
            s7.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrE1 = q0.E1(strTrim, "\\.");
            String str3 = strArrE1[0];
            HashSet hashSet = new HashSet();
            for (int i12 = 1; i12 < strArrE1.length; i12++) {
                hashSet.add(strArrE1[i12]);
            }
            return new c(str3, i11, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ca.c f19000b;

        public d(int i11, ca.c cVar) {
            this.f18999a = i11;
            this.f19000b = cVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f18999a, dVar.f18999a);
        }
    }

    /* JADX INFO: renamed from: ca.e$e, reason: collision with other inner class name */
    private static final class C0387e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f19003c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f19001a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f19002b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19004d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f19005e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19006f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19007g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f19008h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19009i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f19010j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19011k = Integer.MIN_VALUE;

        private static float b(float f11, int i11) {
            if (f11 != -3.4028235E38f && i11 == 0 && (f11 < BitmapDescriptorFactory.HUE_RED || f11 > 1.0f)) {
                return 1.0f;
            }
            if (f11 != -3.4028235E38f) {
                return f11;
            }
            return i11 == 0 ? 1.0f : -3.4028235E38f;
        }

        private static Layout.Alignment c(int i11) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            t.i("WebvttCueParser", "Unknown textAlignment: " + i11);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i11, float f11) {
            if (i11 == 0) {
                return 1.0f - f11;
            }
            if (i11 == 1) {
                return f11 <= 0.5f ? f11 * 2.0f : (1.0f - f11) * 2.0f;
            }
            if (i11 == 2) {
                return f11;
            }
            throw new IllegalStateException(String.valueOf(i11));
        }

        private static float e(int i11) {
            if (i11 != 4) {
                return i11 != 5 ? 0.5f : 1.0f;
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        private static int f(int i11) {
            if (i11 == 1) {
                return 0;
            }
            if (i11 == 3) {
                return 2;
            }
            if (i11 != 4) {
                return i11 != 5 ? 1 : 2;
            }
            return 0;
        }

        public ca.d a() {
            return new ca.d(g().a(), this.f19001a, this.f19002b);
        }

        public r7.a.b g() {
            float fE = this.f19008h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f19004d);
            }
            int iF = this.f19009i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f19004d);
            }
            r7.a.b bVarR = new r7.a.b().p(c(this.f19004d)).h(b(this.f19005e, this.f19006f), this.f19006f).i(this.f19007g).k(fE).l(iF).n(Math.min(this.f19010j, d(iF, fE))).r(this.f19011k);
            CharSequence charSequence = this.f19003c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f18990c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f18991d = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i11, int i12) {
        for (String str : set) {
            Map<String, Integer> map = f18990c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i11, i12, 33);
            } else {
                Map<String, Integer> map2 = f18991d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i11, i12, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                t.i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<ca.c> list2) {
        int iJ = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f18992c);
        int i11 = cVar.f18996b;
        int length = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((b) arrayList.get(i12)).f18993a.f18995a)) {
                b bVar = (b) arrayList.get(i12);
                int iH = h(j(list2, str, bVar.f18993a), iJ, 1);
                int i13 = bVar.f18993a.f18996b - length;
                int i14 = bVar.f18994b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new r7.i(charSequenceSubSequence.toString(), iH), i11, i13, 33);
                length += charSequenceSubSequence.length();
                i11 = i13;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<ca.c> list2) {
        int i11 = cVar.f18996b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f18995a;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f18998d, i11, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case "v":
                f(spannableStringBuilder, cVar.f18997c, i11, length);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> listI = i(list2, str, cVar);
        for (int i12 = 0; i12 < listI.size(); i12++) {
            e(spannableStringBuilder, listI.get(i12).f19000b, i11, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, ca.c cVar, int i11, int i12) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            r7.j.b(spannableStringBuilder, new StyleSpan(cVar.i()), i11, i12, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i11, i12, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, 33);
        }
        if (cVar.k()) {
            r7.j.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i11, i12, 33);
        }
        if (cVar.j()) {
            r7.j.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i11, i12, 33);
        }
        if (cVar.d() != null) {
            r7.j.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i11, i12, 33);
        }
        int iF = cVar.f();
        if (iF == 1) {
            r7.j.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i11, i12, 33);
        } else if (iF == 2) {
            r7.j.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i11, i12, 33);
        } else if (iF == 3) {
            r7.j.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i11, i12, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new r7.g(), i11, i12, 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String str, int i11, int i12) {
        spannableStringBuilder.setSpan(new l(str), i11, i12, 33);
    }

    private static int g(String str, int i11) {
        int iIndexOf = str.indexOf(62, i11);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int h(int i11, int i12, int i13) {
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        if (i13 != -1) {
            return i13;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> i(List<ca.c> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ca.c cVar2 = list.get(i11);
            int iH = cVar2.h(str, cVar.f18995a, cVar.f18998d, cVar.f18997c);
            if (iH > 0) {
                arrayList.add(new d(iH, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int j(List<ca.c> list, String str, c cVar) {
        List<d> listI = i(list, str, cVar);
        for (int i11 = 0; i11 < listI.size(); i11++) {
            ca.c cVar2 = listI.get(i11).f19000b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String k(String str) {
        String strTrim = str.trim();
        s7.a.a(!strTrim.isEmpty());
        return q0.F1(strTrim, "[ \\.]")[0];
    }

    private static boolean l(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static r7.a m(CharSequence charSequence) {
        C0387e c0387e = new C0387e();
        c0387e.f19003c = charSequence;
        return c0387e.g().a();
    }

    private static ca.d n(String str, Matcher matcher, c0 c0Var, List<ca.c> list) {
        C0387e c0387e = new C0387e();
        try {
            c0387e.f19001a = h.d((String) s7.a.f(matcher.group(1)));
            c0387e.f19002b = h.d((String) s7.a.f(matcher.group(2)));
            q((String) s7.a.f(matcher.group(3)), c0387e);
            StringBuilder sb2 = new StringBuilder();
            String strX = c0Var.x();
            while (!TextUtils.isEmpty(strX)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strX.trim());
                strX = c0Var.x();
            }
            c0387e.f19003c = r(str, sb2.toString(), list);
            return c0387e.a();
        } catch (IllegalArgumentException unused) {
            t.i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static ca.d o(c0 c0Var, List<ca.c> list) {
        String strX = c0Var.x();
        if (strX == null) {
            return null;
        }
        Pattern pattern = f18988a;
        Matcher matcher = pattern.matcher(strX);
        if (matcher.matches()) {
            return n(null, matcher, c0Var, list);
        }
        String strX2 = c0Var.x();
        if (strX2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strX2);
        if (matcher2.matches()) {
            return n(strX.trim(), matcher2, c0Var, list);
        }
        return null;
    }

    static r7.a.b p(String str) {
        C0387e c0387e = new C0387e();
        q(str, c0387e);
        return c0387e.g();
    }

    private static void q(String str, C0387e c0387e) {
        Matcher matcher = f18989b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) s7.a.f(matcher.group(1));
            String str3 = (String) s7.a.f(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t(str3, c0387e);
                } else if ("align".equals(str2)) {
                    c0387e.f19004d = w(str3);
                } else if ("position".equals(str2)) {
                    v(str3, c0387e);
                } else if ("size".equals(str2)) {
                    c0387e.f19010j = h.c(str3);
                } else if ("vertical".equals(str2)) {
                    c0387e.f19011k = x(str3);
                } else {
                    t.i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                t.i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString r(String str, String str2, List<ca.c> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < str2.length()) {
            char cCharAt = str2.charAt(i11);
            if (cCharAt == '&') {
                i11++;
                int iIndexOf = str2.indexOf(59, i11);
                int iIndexOf2 = str2.indexOf(32, i11);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i11, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i11 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i11++;
            } else {
                int iG = i11 + 1;
                if (iG < str2.length()) {
                    boolean z11 = str2.charAt(iG) == '/';
                    iG = g(str2, iG);
                    int i12 = iG - 2;
                    boolean z12 = str2.charAt(i12) == '/';
                    int i13 = i11 + (z11 ? 2 : 1);
                    if (!z12) {
                        i12 = iG - 1;
                    }
                    String strSubstring = str2.substring(i13, i12);
                    if (!strSubstring.trim().isEmpty()) {
                        String strK = k(strSubstring);
                        if (l(strK)) {
                            if (z11) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f18995a.equals(strK)) {
                                        break;
                                    }
                                }
                            } else if (!z12) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i11 = iG;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int s(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                t.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void t(String str, C0387e c0387e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0387e.f19007g = s(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c0387e.f19005e = h.c(str);
            c0387e.f19006f = 0;
        } else {
            c0387e.f19005e = Integer.parseInt(str);
            c0387e.f19006f = 1;
        }
    }

    private static int u(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                t.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void v(String str, C0387e c0387e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0387e.f19009i = u(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c0387e.f19008h = h.c(str);
    }

    private static int w(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                t.i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int x(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        t.i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
