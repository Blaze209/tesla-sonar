package net.time4j.format.expert;

import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
final class n implements h<net.time4j.tz.k> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final net.time4j.tz.p f94372i = net.time4j.tz.p.p(64800);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ConcurrentMap<Locale, String> f94373j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ConcurrentMap<Locale, a> f94374k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f94375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f94376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f94377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Locale f94378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f94379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f94380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final char f94381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final net.time4j.format.g f94382h;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f94383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f94384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f94385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f94386d;

        a(String str, String str2, int i11, int i12) {
            this.f94383a = str;
            this.f94384b = str2;
            this.f94385c = i11;
            this.f94386d = i12;
        }
    }

    n(boolean z11) {
        this(z11, true, false, Locale.ROOT, Marker.ANY_NON_NULL_MARKER, "-", '0', net.time4j.format.g.SMART);
    }

    private static boolean a(char c11, char c12) {
        return c11 == c12 || Character.toUpperCase(c11) == Character.toUpperCase(c12) || Character.toLowerCase(c11) == Character.toLowerCase(c12);
    }

    private static String b(Locale locale) {
        String strPutIfAbsent;
        ConcurrentMap<Locale, String> concurrentMap = f94373j;
        String strM = concurrentMap.get(locale);
        return (strM != null || (strPutIfAbsent = concurrentMap.putIfAbsent(locale, (strM = net.time4j.tz.p.f94822k.m(locale)))) == null) ? strM : strPutIfAbsent;
    }

    private static net.time4j.tz.p c(net.time4j.engine.o oVar, net.time4j.engine.d dVar) {
        net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f94173d;
        if (dVar.c(cVar)) {
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.a(cVar);
            if (kVar instanceof net.time4j.tz.p) {
                return (net.time4j.tz.p) kVar;
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + oVar);
    }

    private static a d(Locale locale) {
        a aVar = f94374k.get(locale);
        if (aVar != null) {
            return aVar;
        }
        String strM = f94372i.m(locale);
        int length = strM.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (strM.charAt(i11) == 177) {
                int iIndexOf = strM.indexOf("hh", i11) + 2;
                int iIndexOf2 = strM.indexOf("mm", iIndexOf);
                a aVar2 = new a(strM, strM.substring(iIndexOf, iIndexOf2), i11, iIndexOf2 + 2);
                a aVarPutIfAbsent = f94374k.putIfAbsent(locale, aVar2);
                return aVarPutIfAbsent != null ? aVarPutIfAbsent : aVar2;
            }
        }
        return aVar;
    }

    private static int e(CharSequence charSequence, int i11, char c11) {
        int i12 = 0;
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = i11 + i13;
            if (i14 >= charSequence.length()) {
                if (i13 == 0) {
                    return -1000;
                }
                return ~i12;
            }
            int iCharAt = charSequence.charAt(i14) - c11;
            if (iCharAt < 0 || iCharAt > 9) {
                if (i13 == 0) {
                    return -1000;
                }
                return ~i12;
            }
            i12 = (i12 * 10) + iCharAt;
        }
        return i12;
    }

    private static int f(CharSequence charSequence, int i11, char c11) {
        int iCharAt;
        int i12 = 0;
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = i11 + i13;
            if (i14 >= charSequence.length() || (iCharAt = charSequence.charAt(i14) - c11) < 0 || iCharAt > 9) {
                return -1000;
            }
            i12 = (i12 * 10) + iCharAt;
        }
        return i12;
    }

    private static int g(CharSequence charSequence, int i11, int i12, Locale locale, boolean z11) {
        String[] strArr = {"GMT", b(locale), "UTC", "UT"};
        for (int i13 = 0; i13 < 4; i13++) {
            String str = strArr[i13];
            int length = str.length();
            if (i11 - i12 >= length) {
                String string = charSequence.subSequence(i12, i12 + length).toString();
                if ((z11 && string.equalsIgnoreCase(str)) || (!z11 && string.equals(str))) {
                    return length;
                }
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f94375a == ((n) obj).f94375a;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<net.time4j.tz.k> getElement() {
        return b0.TIMEZONE_OFFSET;
    }

    public int hashCode() {
        return this.f94375a ? 1 : 0;
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        String str;
        net.time4j.tz.f fVar;
        int i11;
        int i12;
        int iF;
        net.time4j.tz.p pVarO;
        int iH;
        n nVar = this;
        net.time4j.engine.d dVar2 = dVar;
        int length = charSequence.length();
        int iF2 = sVar.f();
        if (iF2 >= length) {
            sVar.k(iF2, "Missing localized time zone offset.");
            return;
        }
        Locale locale = z11 ? nVar.f94378d : (Locale) dVar2.b(net.time4j.format.a.f94172c, Locale.ROOT);
        boolean zQ = net.time4j.format.b.q(locale);
        boolean zBooleanValue = z11 ? nVar.f94377c : ((Boolean) dVar2.b(net.time4j.format.a.f94183n, Boolean.FALSE)).booleanValue();
        boolean zBooleanValue2 = z11 ? nVar.f94376b : ((Boolean) dVar2.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue();
        char cCharValue = z11 ? nVar.f94381g : ((Character) dVar2.b(net.time4j.format.a.f94182m, '0')).charValue();
        String str2 = z11 ? nVar.f94379e : (String) dVar2.b(b.f94226g, Marker.ANY_NON_NULL_MARKER);
        String str3 = z11 ? nVar.f94380f : (String) dVar2.b(b.f94227h, "-");
        a aVarD = d(locale);
        int length2 = aVarD.f94383a.length();
        boolean z12 = zBooleanValue;
        net.time4j.tz.p pVar = null;
        int i13 = iF2;
        int i14 = 0;
        while (i14 < length2) {
            int i15 = length2;
            char cCharAt = aVarD.f94383a.charAt(i14);
            if (aVarD.f94385c > i14 || aVarD.f94386d <= i14) {
                str = str2;
                str3 = str3;
                if (z12) {
                    continue;
                } else {
                    char cCharAt2 = i13 < length ? charSequence.charAt(i13) : (char) 0;
                    if ((zBooleanValue2 || cCharAt != cCharAt2) && !(zBooleanValue2 && a(cCharAt, cCharAt2))) {
                        int iG = g(charSequence, length, iF2, locale, zBooleanValue2);
                        if (iG <= 0) {
                            sVar.k(iF2, "Literal mismatched in localized time zone offset.");
                            return;
                        } else {
                            tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.f94822k);
                            sVar.l(iF2 + iG);
                            return;
                        }
                    }
                    i13++;
                }
            } else {
                int iH2 = m.h(charSequence, i13, str2, zBooleanValue2, zQ);
                if (iH2 == -1) {
                    iH2 = m.h(charSequence, i13, str3, zBooleanValue2, zQ);
                    if (iH2 == -1) {
                        int iG2 = z12 ? 0 : g(charSequence, length, iF2, locale, zBooleanValue2);
                        if (iG2 <= 0) {
                            sVar.k(iF2, "Missing sign in localized time zone offset.");
                            return;
                        } else {
                            tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.f94822k);
                            sVar.l(iF2 + iG2);
                            return;
                        }
                    }
                    fVar = net.time4j.tz.f.BEHIND_UTC;
                } else {
                    fVar = net.time4j.tz.f.AHEAD_OF_UTC;
                }
                net.time4j.tz.f fVar2 = fVar;
                int i16 = i13 + iH2;
                int iE = e(charSequence, i16, cCharValue);
                str = str2;
                if (iE == -1000) {
                    sVar.k(i16, "Missing hour part in localized time zone offset.");
                    return;
                }
                if (iE < 0) {
                    iE = ~iE;
                    i11 = i16 + 1;
                } else {
                    i11 = i16 + 2;
                }
                if (i11 >= length) {
                    if (!nVar.f94375a) {
                        sVar.k(i11, "Missing minute part in localized time zone offset.");
                        return;
                    } else {
                        tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar2, iE));
                        sVar.l(i11);
                        return;
                    }
                }
                net.time4j.format.g gVar = z11 ? nVar.f94382h : (net.time4j.format.g) dVar2.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART);
                int iH3 = m.h(charSequence, i11, aVarD.f94384b, zBooleanValue2, zQ);
                if (iH3 != -1) {
                    i11 += iH3;
                } else if (nVar.f94375a) {
                    tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar2, iE));
                    sVar.l(i11);
                    return;
                } else if (gVar.isStrict()) {
                    sVar.k(i11, "Mismatch of localized time zone offset separator.");
                    return;
                }
                int iF3 = f(charSequence, i11, cCharValue);
                if (iF3 == -1000) {
                    sVar.k(i11, "Minute part in localized time zone offset does not match expected pattern mm.");
                    return;
                }
                i13 = i11 + 2;
                if (i13 >= length || (iH = m.h(charSequence, i13, aVarD.f94384b, zBooleanValue2, zQ)) == -1) {
                    i12 = -1000;
                    iF = 0;
                } else {
                    int i17 = i13 + iH;
                    iF = f(charSequence, i17, cCharValue);
                    i12 = -1000;
                    i13 = iF == -1000 ? i17 - iH : i17 + 2;
                }
                if (iF == 0 || iF == i12) {
                    pVarO = net.time4j.tz.p.o(fVar2, iE, iF3);
                } else {
                    int i18 = (iE * 3600) + (iF3 * 60) + iF;
                    if (fVar2 == net.time4j.tz.f.BEHIND_UTC) {
                        i18 = -i18;
                    }
                    pVarO = net.time4j.tz.p.p(i18);
                }
                i14 = aVarD.f94386d - 1;
                pVar = pVarO;
            }
            i14++;
            nVar = this;
            dVar2 = dVar;
            length2 = i15;
            str2 = str;
            str3 = str3;
        }
        if (pVar == null) {
            sVar.k(i13, "Unable to determine localized time zone offset.");
        } else {
            tVar.F(b0.TIMEZONE_OFFSET, pVar);
            sVar.l(i13);
        }
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        net.time4j.tz.p pVarB;
        int length;
        net.time4j.tz.p pVar;
        int length2;
        int length3 = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        net.time4j.tz.k kVarG = oVar.j() ? oVar.g() : null;
        if (kVarG == null) {
            pVarB = c(oVar, dVar);
        } else if (kVarG instanceof net.time4j.tz.p) {
            pVarB = (net.time4j.tz.p) kVarG;
        } else {
            if (!(oVar instanceof net.time4j.base.f)) {
                throw new IllegalArgumentException("Cannot extract timezone offset from: " + oVar);
            }
            pVarB = net.time4j.tz.l.N(kVarG).B((net.time4j.base.f) oVar);
        }
        Locale locale = z11 ? this.f94378d : (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT);
        char c11 = '0';
        char cCharValue = z11 ? this.f94381g : ((Character) dVar.b(net.time4j.format.a.f94182m, '0')).charValue();
        String str = z11 ? this.f94379e : (String) dVar.b(b.f94226g, Marker.ANY_NON_NULL_MARKER);
        String str2 = z11 ? this.f94380f : (String) dVar.b(b.f94227h, "-");
        boolean zBooleanValue = z11 ? this.f94377c : ((Boolean) dVar.b(net.time4j.format.a.f94183n, Boolean.FALSE)).booleanValue();
        int iJ = pVarB.j();
        int i11 = pVarB.i();
        if (!zBooleanValue && iJ == 0 && i11 == 0) {
            String strB = b(locale);
            appendable.append(strB);
            length = strB.length();
        } else {
            a aVarD = d(locale);
            int length4 = aVarD.f94383a.length();
            int length5 = 0;
            int i12 = 0;
            while (i12 < length4) {
                char c12 = c11;
                char cCharAt = aVarD.f94383a.charAt(i12);
                if (aVarD.f94385c > i12 || aVarD.f94386d <= i12) {
                    pVar = pVarB;
                    if (!zBooleanValue) {
                        appendable.append(cCharAt);
                        length5++;
                    }
                } else {
                    if (pVarB.l() == net.time4j.tz.f.BEHIND_UTC) {
                        appendable.append(str2);
                        length2 = str2.length();
                    } else {
                        appendable.append(str);
                        length2 = str.length();
                    }
                    length5 += length2;
                    int iF = pVarB.f();
                    int iG = pVarB.g();
                    int iH = pVarB.h();
                    if (iF < 10 && !this.f94375a) {
                        appendable.append(cCharValue);
                        length5++;
                    }
                    String strValueOf = String.valueOf(iF);
                    pVar = pVarB;
                    for (int i13 = 0; i13 < strValueOf.length(); i13++) {
                        appendable.append((char) ((strValueOf.charAt(i13) - '0') + cCharValue));
                        length5++;
                    }
                    if (iG != 0 || iH != 0 || !this.f94375a) {
                        appendable.append(aVarD.f94384b);
                        length5 += aVarD.f94384b.length();
                        if (iG < 10) {
                            appendable.append(cCharValue);
                            length5++;
                        }
                        String strValueOf2 = String.valueOf(iG);
                        for (int i14 = 0; i14 < strValueOf2.length(); i14++) {
                            appendable.append((char) ((strValueOf2.charAt(i14) - '0') + cCharValue));
                            length5++;
                        }
                        if (iH != 0) {
                            appendable.append(aVarD.f94384b);
                            length5 += aVarD.f94384b.length();
                            if (iH < 10) {
                                appendable.append(cCharValue);
                                length5++;
                            }
                            String strValueOf3 = String.valueOf(iH);
                            for (int i15 = 0; i15 < strValueOf3.length(); i15++) {
                                appendable.append((char) ((strValueOf3.charAt(i15) - '0') + cCharValue));
                                length5++;
                            }
                        }
                    }
                    i12 = aVarD.f94386d - 1;
                }
                i12++;
                c11 = c12;
                pVarB = pVar;
            }
            length = length5;
        }
        if (length3 != -1 && length > 0 && set != null) {
            set.add(new g(b0.TIMEZONE_ID, length3, length3 + length));
        }
        return length;
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new n(this.f94375a, ((Boolean) dVar.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue(), ((Boolean) dVar.b(net.time4j.format.a.f94183n, Boolean.FALSE)).booleanValue(), (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT), (String) dVar.b(b.f94226g, Marker.ANY_NON_NULL_MARKER), (String) dVar.b(b.f94227h, "-"), ((Character) dVar.b(net.time4j.format.a.f94182m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(n.class.getName());
        sb2.append("[abbreviated=");
        sb2.append(this.f94375a);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> withElement(net.time4j.engine.p<net.time4j.tz.k> pVar) {
        return this;
    }

    private n(boolean z11, boolean z12, boolean z13, Locale locale, String str, String str2, char c11, net.time4j.format.g gVar) {
        this.f94375a = z11;
        this.f94376b = z12;
        this.f94377c = z13;
        this.f94378d = locale;
        this.f94379e = str;
        this.f94380f = str2;
        this.f94381g = c11;
        this.f94382h = gVar;
    }
}
