package ps;

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
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f103955a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f103956b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f103957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f103958d;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<b> f103959c = new Comparator() { // from class: ps.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((f.b) obj).f103960a.f103963b, ((f.b) obj2).f103960a.f103963b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f103960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f103961b;

        private b(c cVar, int i11) {
            this.f103960a = cVar;
            this.f103961b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f103963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f103964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f103965d;

        private c(String str, int i11, String str2, Set<String> set) {
            this.f103963b = i11;
            this.f103962a = str;
            this.f103964c = str2;
            this.f103965d = set;
        }

        public static c a(String str, int i11) {
            String str2;
            String strTrim = str.trim();
            ts.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrP0 = p0.P0(strTrim, "\\.");
            String str3 = strArrP0[0];
            HashSet hashSet = new HashSet();
            for (int i12 = 1; i12 < strArrP0.length; i12++) {
                hashSet.add(strArrP0[i12]);
            }
            return new c(str3, i11, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ps.d f103967b;

        public d(int i11, ps.d dVar) {
            this.f103966a = i11;
            this.f103967b = dVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f103966a, dVar.f103966a);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f103970c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f103968a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f103969b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f103971d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f103972e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f103973f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f103974g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f103975h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f103976i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f103977j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f103978k = Integer.MIN_VALUE;

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
                            u.i("WebvttCueParser", "Unknown textAlignment: " + i11);
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

        public ps.e a() {
            return new ps.e(g().a(), this.f103968a, this.f103969b);
        }

        public gs.b.C1421b g() {
            float fE = this.f103975h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f103971d);
            }
            int iF = this.f103976i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f103971d);
            }
            gs.b.C1421b c1421bR = new gs.b.C1421b().p(c(this.f103971d)).h(b(this.f103972e, this.f103973f), this.f103973f).i(this.f103974g).k(fE).l(iF).n(Math.min(this.f103977j, d(iF, fE))).r(this.f103978k);
            CharSequence charSequence = this.f103970c;
            if (charSequence != null) {
                c1421bR.o(charSequence);
            }
            return c1421bR;
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
        f103957c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f103958d = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i11, int i12) {
        for (String str : set) {
            Map<String, Integer> map = f103957c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i11, i12, 33);
            } else {
                Map<String, Integer> map2 = f103958d;
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
                u.i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<ps.d> list2) {
        int i11 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f103959c);
        int i12 = cVar.f103963b;
        int length = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if ("rt".equals(((b) arrayList.get(i13)).f103960a.f103962a)) {
                b bVar = (b) arrayList.get(i13);
                int iG = g(i(list2, str, bVar.f103960a), i11, 1);
                int i14 = bVar.f103960a.f103963b - length;
                int i15 = bVar.f103961b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i14, i15);
                spannableStringBuilder.delete(i14, i15);
                spannableStringBuilder.setSpan(new ks.c(charSequenceSubSequence.toString(), iG), i12, i14, 33);
                length += charSequenceSubSequence.length();
                i12 = i14;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<ps.d> list2) {
        int i11 = cVar.f103963b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f103962a;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f103965d, i11, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> listH = h(list2, str, cVar);
        for (int i12 = 0; i12 < listH.size(); i12++) {
            e(spannableStringBuilder, listH.get(i12).f103967b, i11, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, ps.d dVar, int i11, int i12) {
        if (dVar == null) {
            return;
        }
        if (dVar.i() != -1) {
            ks.d.a(spannableStringBuilder, new StyleSpan(dVar.i()), i11, i12, 33);
        }
        if (dVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i11, i12, 33);
        }
        if (dVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, 33);
        }
        if (dVar.k()) {
            ks.d.a(spannableStringBuilder, new ForegroundColorSpan(dVar.c()), i11, i12, 33);
        }
        if (dVar.j()) {
            ks.d.a(spannableStringBuilder, new BackgroundColorSpan(dVar.a()), i11, i12, 33);
        }
        if (dVar.d() != null) {
            ks.d.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i11, i12, 33);
        }
        int iF = dVar.f();
        if (iF == 1) {
            ks.d.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.e(), true), i11, i12, 33);
        } else if (iF == 2) {
            ks.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e()), i11, i12, 33);
        } else if (iF == 3) {
            ks.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.e() / 100.0f), i11, i12, 33);
        }
        if (dVar.b()) {
            spannableStringBuilder.setSpan(new ks.a(), i11, i12, 33);
        }
    }

    private static int f(String str, int i11) {
        int iIndexOf = str.indexOf(62, i11);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int g(int i11, int i12, int i13) {
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

    private static List<d> h(List<ps.d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ps.d dVar = list.get(i11);
            int iH = dVar.h(str, cVar.f103962a, cVar.f103965d, cVar.f103964c);
            if (iH > 0) {
                arrayList.add(new d(iH, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List<ps.d> list, String str, c cVar) {
        List<d> listH = h(list, str, cVar);
        for (int i11 = 0; i11 < listH.size(); i11++) {
            ps.d dVar = listH.get(i11).f103967b;
            if (dVar.g() != -1) {
                return dVar.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String strTrim = str.trim();
        ts.a.a(!strTrim.isEmpty());
        return p0.Q0(strTrim, "[ \\.]")[0];
    }

    private static boolean k(String str) {
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

    static gs.b l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f103970c = charSequence;
        return eVar.g().a();
    }

    private static ps.e m(String str, Matcher matcher, d0 d0Var, List<ps.d> list) {
        e eVar = new e();
        try {
            eVar.f103968a = i.c((String) ts.a.e(matcher.group(1)));
            eVar.f103969b = i.c((String) ts.a.e(matcher.group(2)));
            p((String) ts.a.e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String strS = d0Var.s();
            while (!TextUtils.isEmpty(strS)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strS.trim());
                strS = d0Var.s();
            }
            eVar.f103970c = q(str, sb2.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            u.i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static ps.e n(d0 d0Var, List<ps.d> list) {
        String strS = d0Var.s();
        if (strS == null) {
            return null;
        }
        Pattern pattern = f103955a;
        Matcher matcher = pattern.matcher(strS);
        if (matcher.matches()) {
            return m(null, matcher, d0Var, list);
        }
        String strS2 = d0Var.s();
        if (strS2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strS2);
        if (matcher2.matches()) {
            return m(strS.trim(), matcher2, d0Var, list);
        }
        return null;
    }

    static gs.b.C1421b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    private static void p(String str, e eVar) {
        Matcher matcher = f103956b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) ts.a.e(matcher.group(1));
            String str3 = (String) ts.a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f103971d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f103977j = i.b(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f103978k = w(str3);
                } else {
                    u.i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                u.i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString q(String str, String str2, List<ps.d> list) {
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
                int iF = i11 + 1;
                if (iF < str2.length()) {
                    boolean z11 = str2.charAt(iF) == '/';
                    iF = f(str2, iF);
                    int i12 = iF - 2;
                    boolean z12 = str2.charAt(i12) == '/';
                    int i13 = i11 + (z11 ? 2 : 1);
                    if (!z12) {
                        i12 = iF - 1;
                    }
                    String strSubstring = str2.substring(i13, i12);
                    if (!strSubstring.trim().isEmpty()) {
                        String strJ = j(strSubstring);
                        if (k(strJ)) {
                            if (z11) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f103962a.equals(strJ)) {
                                        break;
                                    }
                                }
                            } else if (!z12) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i11 = iF;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int r(String str) {
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
                u.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void s(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f103974g = r(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.f103972e = i.b(str);
            eVar.f103973f = 0;
        } else {
            eVar.f103972e = Integer.parseInt(str);
            eVar.f103973f = 1;
        }
    }

    private static int t(String str) {
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
                u.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void u(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f103976i = t(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        eVar.f103975h = i.b(str);
    }

    private static int v(String str) {
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
                u.i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int w(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        u.i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
