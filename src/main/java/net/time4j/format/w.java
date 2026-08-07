package net.time4j.format;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.time4j.engine.j0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class w<U, S extends j0<U>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f94451d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<U> f94452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b<U>> f94453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f94454c;

    private static abstract class b<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f94455a;

        b(int i11) {
            this.f94455a = i11;
        }

        abstract int a();

        abstract b<U> b(int i11);
    }

    private static class c<U> extends b<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f94456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final U f94457c;

        @Override // net.time4j.format.w.b
        int a() {
            return this.f94456b;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new c(i11, this.f94456b, this.f94457c);
        }

        private c(int i11, int i12, U u11) {
            super(i11);
            if (i12 >= 1 && i12 <= 9) {
                this.f94456b = i12;
                this.f94457c = u11;
            } else {
                throw new IllegalArgumentException("Fraction width out of bounds: " + i12);
            }
        }
    }

    private static class e<U> extends b<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f94459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f94460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final U f94461d;

        @Override // net.time4j.format.w.b
        int a() {
            return this.f94459b;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new e(i11, this.f94459b, this.f94460c, this.f94461d);
        }

        private e(int i11, int i12, int i13, U u11) {
            super(i11);
            if (i12 < 1 || i12 > 18) {
                throw new IllegalArgumentException("Min width out of bounds: " + i12);
            }
            if (i13 < i12) {
                throw new IllegalArgumentException("Max width smaller than min width.");
            }
            if (i13 > 18) {
                throw new IllegalArgumentException("Max width out of bounds: " + i13);
            }
            if (u11 == null) {
                throw new NullPointerException("Missing unit.");
            }
            this.f94459b = i12;
            this.f94460c = i13;
            this.f94461d = u11;
        }
    }

    private static class f<U> extends b<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<b<U>> f94462b;

        @Override // net.time4j.format.w.b
        int a() {
            return 0;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            ArrayList arrayList = new ArrayList(this.f94462b);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                arrayList.set(size, bVar.b(i11));
                i11 += bVar.a();
            }
            return new f(arrayList);
        }

        private f(List<b<U>> list) {
            super(0);
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Optional section is empty.");
            }
            b<U> bVar = list.get(0);
            g gVar = g.f94463b;
            if (bVar == gVar || list.get(list.size() - 1) == gVar) {
                throw new IllegalArgumentException("Optional section must not start or end with an or-operator.");
            }
            this.f94462b = Collections.unmodifiableList(list);
        }
    }

    private static class g<U> extends b<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final g f94463b = new g();

        private g() {
            super(0);
        }

        static <U> b<U> c() {
            return f94463b;
        }

        @Override // net.time4j.format.w.b
        int a() {
            return 0;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return this;
        }
    }

    private static class h<U> extends b<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e<U> f94464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b<U> f94465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p f94466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map<n, String> f94467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f94468f;

        @Override // net.time4j.format.w.b
        int a() {
            return this.f94468f;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new h(i11, this.f94464b, this.f94465c, this.f94466d, this.f94467e, this.f94468f);
        }

        private h(U u11, String str, p pVar, Map<n, String> map) {
            super(0);
            this.f94464b = new e<>(0, 1, 18, u11);
            this.f94465c = new d(str, true);
            this.f94466d = pVar;
            this.f94467e = map;
            int length = Integer.MAX_VALUE;
            for (String str2 : map.values()) {
                if (str2.length() < length) {
                    length = str2.length();
                }
            }
            this.f94468f = length;
        }

        private h(int i11, e<U> eVar, b<U> bVar, p pVar, Map<n, String> map, int i12) {
            super(i11);
            this.f94464b = eVar;
            this.f94465c = bVar;
            this.f94466d = pVar;
            this.f94467e = map;
            this.f94468f = i12;
        }
    }

    private static class i<U> extends b<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f94469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f94470c;

        @Override // net.time4j.format.w.b
        int a() {
            return 1;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new i(i11, this.f94469b, this.f94470c);
        }

        private i(char c11, char c12) {
            this(0, c11, c12);
        }

        private i(int i11, char c11, char c12) {
            super(i11);
            this.f94469b = c11;
            this.f94470c = c12;
        }
    }

    private static class j<U> extends b<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f94471b;

        @Override // net.time4j.format.w.b
        int a() {
            return this.f94471b ? 1 : 0;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new j(i11, this.f94471b);
        }

        private j(boolean z11) {
            super(0);
            this.f94471b = z11;
        }

        private j(int i11, boolean z11) {
            super(i11);
            this.f94471b = z11;
        }
    }

    protected w(Class<U> cls, String str) {
        int i11;
        if (cls == null) {
            throw new NullPointerException("Missing unit type.");
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ArrayList());
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= length) {
                if (arrayList.size() > 1) {
                    throw new IllegalArgumentException("Open square bracket without closing one.");
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException("Empty or invalid pattern.");
                }
                List<b<U>> list = arrayList.get(0);
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("Missing format pattern.");
                }
                b<U> bVar = list.get(0);
                g gVar = g.f94463b;
                if (bVar == gVar || list.get(list.size() - 1) == gVar) {
                    throw new IllegalArgumentException("Pattern must not start or end with an or-operator.");
                }
                int size = list.size();
                int iA = list.get(size - 1).a();
                for (int i14 = size - 2; i14 >= 0; i14--) {
                    b<U> bVar2 = list.get(i14);
                    if (bVar2 == g.f94463b) {
                        iA = 0;
                    } else {
                        list.set(i14, bVar2.b(iA));
                        iA += bVar2.a();
                    }
                }
                this.f94452a = cls;
                this.f94453b = Collections.unmodifiableList(list);
                this.f94454c = str;
                return;
            }
            char cCharAt = str.charAt(i12);
            if (cCharAt == '#') {
                i13++;
            } else if (g(cCharAt)) {
                int i15 = i12 + 1;
                while (i15 < length && str.charAt(i15) == cCharAt) {
                    i15++;
                }
                d(cCharAt, i15 - i12, i13, arrayList);
                i12 = i15 - 1;
                i13 = 0;
            } else {
                if (i13 > 0) {
                    throw new IllegalArgumentException("Char # must be followed by unit symbol.");
                }
                if (cCharAt == '\'') {
                    int i16 = i12 + 1;
                    i11 = i16;
                    while (i11 < length) {
                        if (str.charAt(i11) == '\'') {
                            int i17 = i11 + 1;
                            if (i17 >= length || str.charAt(i17) != '\'') {
                                break;
                            } else {
                                i11 = i17;
                            }
                        }
                        i11++;
                    }
                    if (i11 >= length) {
                        throw new IllegalArgumentException("String literal in pattern not closed: " + str);
                    }
                    if (i16 == i11) {
                        a(CoreConstants.SINGLE_QUOTE_CHAR, arrayList);
                    } else {
                        b(str.substring(i16, i11).replace("''", "'"), arrayList);
                    }
                } else if (cCharAt == '[') {
                    i(arrayList);
                } else if (cCharAt == ']') {
                    e(arrayList);
                } else {
                    char c11 = CoreConstants.COMMA_CHAR;
                    char c12 = CoreConstants.DOT;
                    if (cCharAt == '.') {
                        h(arrayList).add(new i(c12, c11));
                    } else if (cCharAt == ',') {
                        h(arrayList).add(new i(c11, c12));
                    } else if (cCharAt == '-') {
                        h(arrayList).add(new j(z11));
                    } else if (cCharAt == '+') {
                        h(arrayList).add(new j(z12));
                    } else if (cCharAt == '{') {
                        int i18 = i12 + 1;
                        i11 = i18;
                        while (i11 < length && str.charAt(i11) != '}') {
                            i11++;
                        }
                        c(str.substring(i18, i11), arrayList);
                    } else if (cCharAt == '|') {
                        h(arrayList).add(g.c());
                    } else {
                        a(cCharAt, arrayList);
                    }
                }
                i12 = i11;
            }
            i12++;
        }
    }

    private void a(char c11, List<List<b<U>>> list) {
        b(String.valueOf(c11), list);
    }

    private void b(String str, List<List<b<U>>> list) {
        h(list).add(new d(str));
    }

    private void c(String str, List<List<b<U>>> list) {
        Locale locale;
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length > 9 || strArrSplit.length < 4) {
            throw new IllegalArgumentException("Plural information has wrong format: " + str);
        }
        if (strArrSplit[0].length() != 1) {
            throw new IllegalArgumentException("Plural information has wrong symbol: " + str);
        }
        U uF = f(strArrSplit[0].charAt(0));
        String[] strArrSplit2 = strArrSplit[2].split("-|_");
        String str2 = strArrSplit2[0];
        if (strArrSplit2.length > 1) {
            String str3 = strArrSplit2[1];
            if (strArrSplit2.length > 2) {
                String str4 = strArrSplit2[2];
                if (strArrSplit2.length > 3) {
                    throw new IllegalArgumentException("Plural information has wrong locale: " + str);
                }
                locale = new Locale(str2, str3, str4);
            } else {
                locale = new Locale(str2, str3);
            }
        } else {
            locale = new Locale(str2);
        }
        EnumMap enumMap = new EnumMap(n.class);
        p pVarF = p.f(locale, k.CARDINALS);
        for (int i11 = 3; i11 < strArrSplit.length; i11++) {
            String[] strArrSplit3 = strArrSplit[i11].split("=");
            if (strArrSplit3.length != 2) {
                throw new IllegalArgumentException("Plural information has wrong format: " + str);
            }
            enumMap.put(n.valueOf(strArrSplit3[0]), strArrSplit3[1]);
        }
        if (enumMap.isEmpty()) {
            throw new IllegalArgumentException("Missing plural forms: " + str);
        }
        if (enumMap.containsKey(n.OTHER)) {
            h(list).add(new h(uF, strArrSplit[1], pVarF, enumMap));
            return;
        }
        throw new IllegalArgumentException("Missing plural category OTHER: " + str);
    }

    private void d(char c11, int i11, int i12, List<List<b<U>>> list) {
        U uF = f(c11);
        List<b<U>> list2 = list.get(list.size() - 1);
        if (c11 != 'f') {
            list2.add(new e(0, i11, i11 + i12, uF));
        } else {
            if (i12 > 0) {
                throw new IllegalArgumentException("Combination of # and f-symbol not allowed.");
            }
            list2.add(new c(0, i11, f(c11)));
        }
    }

    private static <U> void e(List<List<b<U>>> list) {
        int size = list.size();
        int i11 = size - 1;
        if (i11 < 1) {
            throw new IllegalArgumentException("Closing square bracket without open one.");
        }
        list.get(size - 2).add(new f(list.remove(i11)));
    }

    private static boolean g(char c11) {
        if (c11 < 'A' || c11 > 'Z') {
            return c11 >= 'a' && c11 <= 'z';
        }
        return true;
    }

    private static <U> List<b<U>> h(List<List<b<U>>> list) {
        return list.get(list.size() - 1);
    }

    private static <U> void i(List<List<b<U>>> list) {
        list.add(new ArrayList());
    }

    protected abstract U f(char c11);

    private static class d<U> extends b<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f94458b;

        @Override // net.time4j.format.w.b
        int a() {
            return this.f94458b.length();
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new d(i11, this.f94458b);
        }

        private d(String str) {
            this(str, false);
        }

        private d(String str, boolean z11) {
            super(0);
            if (!z11 && str.isEmpty()) {
                throw new IllegalArgumentException("Literal is empty.");
            }
            this.f94458b = str;
        }

        private d(int i11, String str) {
            super(i11);
            this.f94458b = str;
        }
    }
}
