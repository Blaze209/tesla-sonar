package net.time4j.history;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.m0;
import net.time4j.engine.z;
import net.time4j.format.t;
import net.time4j.g0;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements m0, Serializable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final net.time4j.engine.c<p> f94562p = net.time4j.format.a.e("YEAR_DEFINITION", p.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f94563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f94564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f94565s;
    private static final long serialVersionUID = 4100690610730913643L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f94566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final d f94567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final d f94568v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map<String, d> f94569w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient ep0.b f94570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient List<f> f94571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient net.time4j.history.a f94572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient o f94573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient g f94574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient net.time4j.engine.p<h> f94575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient net.time4j.engine.p<j> f94576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient t<Integer> f94577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient net.time4j.engine.p<Integer> f94578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient net.time4j.engine.p<Integer> f94579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient t<Integer> f94580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient t<Integer> f94581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final transient t<Integer> f94582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final transient net.time4j.engine.p<Integer> f94583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final transient Set<net.time4j.engine.p<?>> f94584o;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f94586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f94587c;

        static {
            int[] iArr = new int[p.values().length];
            f94587c = iArr;
            try {
                iArr[p.DUAL_DATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94587c[p.AFTER_NEW_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94587c[p.BEFORE_NEW_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[j.values().length];
            f94586b = iArr2;
            try {
                iArr2[j.HISPANIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94586b[j.BYZANTINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94586b[j.AB_URBE_CONDITA.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[ep0.b.values().length];
            f94585a = iArr3;
            try {
                iArr3[ep0.b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f94585a[ep0.b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f94585a[ep0.b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f94585a[ep0.b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f94585a[ep0.b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f94585a[ep0.b.SINGLE_CUTOVER_DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        ep0.b bVar = ep0.b.PROLEPTIC_GREGORIAN;
        c cVar = c.GREGORIAN;
        f94563q = new d(bVar, Collections.singletonList(new f(Long.MIN_VALUE, cVar, cVar)));
        ep0.b bVar2 = ep0.b.PROLEPTIC_JULIAN;
        c cVar2 = c.JULIAN;
        d dVar = new d(bVar2, Collections.singletonList(new f(Long.MIN_VALUE, cVar2, cVar2)));
        f94564r = dVar;
        ep0.b bVar3 = ep0.b.PROLEPTIC_BYZANTINE;
        List listSingletonList = Collections.singletonList(new f(Long.MIN_VALUE, cVar2, cVar2));
        n nVar = n.BEGIN_OF_SEPTEMBER;
        f94565s = new d(bVar3, listSingletonList, null, new o(nVar, Integer.MAX_VALUE), g.c((g0) g0.q0().G()));
        long jLongValue = ((Long) g0.I0(1582, 10, 15).s(z.MODIFIED_JULIAN_DATE)).longValue();
        f94566t = jLongValue;
        f94567u = F(jLongValue);
        ArrayList arrayList = new ArrayList();
        c cVar3 = c.SWEDISH;
        arrayList.add(new f(-57959L, cVar2, cVar3));
        arrayList.add(new f(-53575L, cVar3, cVar2));
        arrayList.add(new f(-38611L, cVar2, cVar));
        d dVar2 = new d(ep0.b.SWEDEN, Collections.unmodifiableList(arrayList));
        f94568v = dVar2;
        HashMap map = new HashMap();
        j jVar = j.AD;
        g0 g0VarD = dVar.d(h.g(jVar, 988, 3, 1));
        g0 g0VarD2 = dVar.d(h.g(jVar, 1382, 12, 24));
        g0 g0VarD3 = dVar.d(h.g(jVar, 1421, 12, 24));
        g0 g0VarD4 = dVar.d(h.g(jVar, 1699, 12, 31));
        d dVarE = E();
        n nVar2 = n.BEGIN_OF_JANUARY;
        o oVarUntil = nVar2.until(1383);
        n nVar3 = n.CHRISTMAS_STYLE;
        map.put("ES", dVarE.K(oVarUntil.b(nVar3.until(1556))).J(g.f(g0VarD2)));
        map.put("PT", E().K(nVar2.until(1422).b(nVar3.until(1556))).J(g.f(g0VarD3)));
        map.put("FR", G(g0.I0(1582, 12, 20)).K(n.EASTER_STYLE.until(1567)));
        map.put("DE", E().K(nVar3.until(1544)));
        map.put("DE-BAYERN", G(g0.I0(1583, 10, 16)).K(nVar3.until(1544)));
        map.put("DE-PREUSSEN", G(g0.I0(1610, 9, 2)).K(nVar3.until(1559)));
        map.put("DE-PROTESTANT", G(g0.I0(1700, 3, 1)).K(nVar3.until(1559)));
        map.put("NL", G(g0.I0(1583, 1, 1)));
        map.put("AT", G(g0.I0(1584, 1, 17)));
        map.put("CH", G(g0.I0(1584, 1, 22)));
        map.put("HU", G(g0.I0(1587, 11, 1)));
        d dVarG = G(g0.I0(1700, 3, 1));
        n nVar4 = n.MARIA_ANUNCIATA;
        map.put("DK", dVarG.K(nVar4.until(1623)));
        map.put("NO", G(g0.I0(1700, 3, 1)).K(nVar4.until(1623)));
        map.put("IT", E().K(nVar3.until(1583)));
        map.put("IT-FLORENCE", E().K(nVar4.until(1749)));
        map.put("IT-PISA", E().K(n.CALCULUS_PISANUS.until(1749)));
        d dVarE2 = E();
        n nVar5 = n.BEGIN_OF_MARCH;
        map.put("IT-VENICE", dVarE2.K(nVar5.until(1798)));
        map.put("GB", G(g0.I0(1752, 9, 14)).K(nVar3.until(1087).b(nVar2.until(1155)).b(nVar4.until(1752))));
        map.put("GB-SCT", G(g0.I0(1752, 9, 14)).K(nVar3.until(1087).b(nVar2.until(1155)).b(nVar4.until(1600))));
        map.put("RU", G(g0.I0(1918, 2, 14)).K(nVar2.until(988).b(nVar5.until(1493)).b(nVar.until(1700))).J(g.b(g0VarD, g0VarD4)));
        map.put("SE", dVar2);
        f94569w = Collections.unmodifiableMap(map);
    }

    private d(ep0.b bVar, List<f> list) {
        this(bVar, list, null, null, g.f94592d);
    }

    private boolean A(h hVar) {
        int iAnnoDomini = hVar.c().annoDomini(hVar.e());
        if (this == f94565s) {
            return iAnnoDomini < -5508 || (iAnnoDomini == -5508 && hVar.d() < 9) || iAnnoDomini > 999979465;
        }
        if (this == f94564r) {
            return Math.abs(iAnnoDomini) > 999979465;
        }
        if (this == f94563q) {
            return Math.abs(iAnnoDomini) > 999999999;
        }
        return iAnnoDomini < -44 || iAnnoDomini > 9999;
    }

    public static d D(Locale locale) {
        d dVar;
        String country = locale.getCountry();
        if (locale.getVariant().isEmpty()) {
            dVar = null;
        } else {
            country = country + "-" + locale.getVariant();
            dVar = f94569w.get(country);
        }
        if (dVar == null) {
            dVar = f94569w.get(country);
        }
        return dVar == null ? E() : dVar;
    }

    public static d E() {
        return f94567u;
    }

    private static d F(long j11) {
        return new d(j11 == f94566t ? ep0.b.INTRODUCTION_ON_1582_10_15 : ep0.b.SINGLE_CUTOVER_DATE, Collections.singletonList(new f(j11, c.JULIAN, c.GREGORIAN)));
    }

    public static d G(g0 g0Var) {
        if (g0Var.equals(g0.q0().G())) {
            return f94564r;
        }
        if (g0Var.equals(g0.q0().H())) {
            return f94563q;
        }
        long jLongValue = ((Long) g0Var.s(z.MODIFIED_JULIAN_DATE)).longValue();
        c(jLongValue);
        return jLongValue == f94566t ? f94567u : F(jLongValue);
    }

    public static d H() {
        return f94568v;
    }

    private static void c(long j11) {
        if (j11 < f94566t) {
            throw new IllegalArgumentException("Gregorian calendar did not exist before 1582-10-15");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4 A[LOOP:0: B:23:0x00a1->B:25:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:53:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0170 A[Catch: ParseException -> 0x01a2, TryCatch #0 {ParseException -> 0x01a2, blocks: (B:51:0x0141, B:56:0x0170, B:58:0x0179, B:59:0x018f, B:60:0x0190, B:62:0x0199), top: B:77:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0179 A[Catch: ParseException -> 0x01a2, TryCatch #0 {ParseException -> 0x01a2, blocks: (B:51:0x0141, B:56:0x0170, B:58:0x0179, B:59:0x018f, B:60:0x0190, B:62:0x0199), top: B:77:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0190 A[Catch: ParseException -> 0x01a2, TryCatch #0 {ParseException -> 0x01a2, blocks: (B:51:0x0141, B:56:0x0170, B:58:0x0179, B:59:0x018f, B:60:0x0190, B:62:0x0199), top: B:77:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0199 A[Catch: ParseException -> 0x01a2, TRY_LEAVE, TryCatch #0 {ParseException -> 0x01a2, blocks: (B:51:0x0141, B:56:0x0170, B:58:0x0179, B:59:0x018f, B:60:0x0190, B:62:0x0199), top: B:77:0x0141 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0179, please report this as an issue */
    public static d j(String str) {
        d dVarH;
        int i11;
        String[] strArrSplit;
        String[] strArrSplit2;
        String[] strArrSplit3;
        String strSubstring;
        g0 g0VarI;
        g0 g0VarI2;
        int i12;
        o oVarB;
        int i13;
        String[] strArrSplit4;
        n nVarValueOf;
        int i14;
        String strSubstring2;
        String[] strArrSplit5;
        int[] iArr;
        int i15;
        if (!str.startsWith("historic-")) {
            throw new IllegalArgumentException("Variant does not start with \"historic-\": " + str);
        }
        String[] strArrSplit6 = str.substring(9).split(":");
        if (strArrSplit6.length == 0) {
            throw new IllegalArgumentException("Invalid variant description.");
        }
        ep0.b bVarValueOf = ep0.b.valueOf(strArrSplit6[0]);
        switch (a.f94585a[bVarValueOf.ordinal()]) {
            case 1:
                return f94563q;
            case 2:
                return f94564r;
            case 3:
                return f94565s;
            case 4:
                dVarH = H();
                i11 = 1;
                strArrSplit = strArrSplit6[i11].split("=");
                if (strArrSplit[0].equals("ancient-julian-leap-years")) {
                    String str2 = strArrSplit[1];
                    strSubstring2 = str2.substring(1, str2.length() - 1);
                    if (!strSubstring2.isEmpty()) {
                        strArrSplit5 = strSubstring2.split(",");
                        iArr = new int[strArrSplit5.length];
                        for (i15 = 0; i15 < strArrSplit5.length; i15++) {
                            iArr[i15] = 1 - Integer.parseInt(strArrSplit5[i15]);
                        }
                        dVarH = dVarH.I(net.time4j.history.a.f(iArr));
                    }
                }
                strArrSplit2 = strArrSplit6[i11 + 1].split("=");
                if (strArrSplit2[0].equals("new-year-strategy")) {
                    String str3 = strArrSplit2[1];
                    oVarB = null;
                    for (String str4 : str3.substring(1, str3.length() - 1).split(",")) {
                        strArrSplit4 = str4.split("->");
                        nVarValueOf = n.valueOf(strArrSplit4[0]);
                        if (strArrSplit4.length == 2) {
                            i14 = Integer.parseInt(strArrSplit4[1]);
                        } else {
                            i14 = Integer.MAX_VALUE;
                        }
                        if (oVarB != null) {
                            oVarB = oVarB.b(nVarValueOf.until(i14));
                        } else if (nVarValueOf == n.BEGIN_OF_JANUARY || i14 != 567) {
                            oVarB = nVarValueOf.until(i14);
                        }
                    }
                    dVarH = dVarH.K(oVarB);
                }
                strArrSplit3 = strArrSplit6[i11 + 2].split("=");
                if (strArrSplit3[0].equals("era-preference")) {
                    String str5 = strArrSplit3[1];
                    strSubstring = str5.substring(1, str5.length() - 1);
                    if (!strSubstring.equals("default")) {
                        String[] strArrSplit7 = strSubstring.split(",");
                        try {
                            j jVarValueOf = j.valueOf(strArrSplit7[0].substring(5));
                            g0VarI = net.time4j.format.expert.l.i(strArrSplit7[1].substring(7));
                            g0VarI2 = net.time4j.format.expert.l.i(strArrSplit7[2].substring(5));
                            i12 = a.f94586b[jVarValueOf.ordinal()];
                            if (i12 == 1) {
                                return dVarH.J(g.e(g0VarI, g0VarI2));
                            }
                            if (i12 == 2) {
                                return dVarH.J(g.b(g0VarI, g0VarI2));
                            }
                            if (i12 == 3) {
                                return dVarH.J(g.a(g0VarI, g0VarI2));
                            }
                            throw new IllegalArgumentException("BC/AD not allowed as era preference: " + str);
                        } catch (ParseException unused) {
                            throw new IllegalArgumentException("Invalid date syntax: " + str);
                        }
                    }
                }
                return dVarH;
            case 5:
                if (!s(strArrSplit6, str).equals(g0.I0(1582, 10, 15))) {
                    throw new IllegalArgumentException("Inconsistent cutover date: " + str);
                }
                dVarH = E();
                i11 = 2;
                strArrSplit = strArrSplit6[i11].split("=");
                if (strArrSplit[0].equals("ancient-julian-leap-years")) {
                    String str6 = strArrSplit[1];
                    strSubstring2 = str6.substring(1, str6.length() - 1);
                    if (!strSubstring2.isEmpty()) {
                        strArrSplit5 = strSubstring2.split(",");
                        iArr = new int[strArrSplit5.length];
                        while (i15 < strArrSplit5.length) {
                            iArr[i15] = 1 - Integer.parseInt(strArrSplit5[i15]);
                        }
                        dVarH = dVarH.I(net.time4j.history.a.f(iArr));
                    }
                }
                strArrSplit2 = strArrSplit6[i11 + 1].split("=");
                if (strArrSplit2[0].equals("new-year-strategy")) {
                    String str7 = strArrSplit2[1];
                    oVarB = null;
                    while (i13 < r6.length) {
                        strArrSplit4 = str4.split("->");
                        nVarValueOf = n.valueOf(strArrSplit4[0]);
                        if (strArrSplit4.length == 2) {
                            i14 = Integer.parseInt(strArrSplit4[1]);
                        } else {
                            i14 = Integer.MAX_VALUE;
                        }
                        if (oVarB != null) {
                            oVarB = oVarB.b(nVarValueOf.until(i14));
                        } else if (nVarValueOf == n.BEGIN_OF_JANUARY) {
                            oVarB = nVarValueOf.until(i14);
                        } else {
                            oVarB = nVarValueOf.until(i14);
                        }
                    }
                    dVarH = dVarH.K(oVarB);
                }
                strArrSplit3 = strArrSplit6[i11 + 2].split("=");
                if (strArrSplit3[0].equals("era-preference")) {
                    String str8 = strArrSplit3[1];
                    strSubstring = str8.substring(1, str8.length() - 1);
                    if (!strSubstring.equals("default")) {
                        String[] strArrSplit8 = strSubstring.split(",");
                        j jVarValueOf2 = j.valueOf(strArrSplit8[0].substring(5));
                        g0VarI = net.time4j.format.expert.l.i(strArrSplit8[1].substring(7));
                        g0VarI2 = net.time4j.format.expert.l.i(strArrSplit8[2].substring(5));
                        i12 = a.f94586b[jVarValueOf2.ordinal()];
                        if (i12 == 1) {
                            return dVarH.J(g.e(g0VarI, g0VarI2));
                        }
                        if (i12 == 2) {
                            return dVarH.J(g.b(g0VarI, g0VarI2));
                        }
                        if (i12 == 3) {
                            return dVarH.J(g.a(g0VarI, g0VarI2));
                        }
                        throw new IllegalArgumentException("BC/AD not allowed as era preference: " + str);
                    }
                }
                return dVarH;
            case 6:
                dVarH = G(s(strArrSplit6, str));
                i11 = 2;
                strArrSplit = strArrSplit6[i11].split("=");
                if (strArrSplit[0].equals("ancient-julian-leap-years")) {
                    String str9 = strArrSplit[1];
                    strSubstring2 = str9.substring(1, str9.length() - 1);
                    if (!strSubstring2.isEmpty()) {
                        strArrSplit5 = strSubstring2.split(",");
                        iArr = new int[strArrSplit5.length];
                        while (i15 < strArrSplit5.length) {
                            iArr[i15] = 1 - Integer.parseInt(strArrSplit5[i15]);
                        }
                        dVarH = dVarH.I(net.time4j.history.a.f(iArr));
                    }
                }
                strArrSplit2 = strArrSplit6[i11 + 1].split("=");
                if (strArrSplit2[0].equals("new-year-strategy")) {
                    String str10 = strArrSplit2[1];
                    oVarB = null;
                    while (i13 < r6.length) {
                        strArrSplit4 = str4.split("->");
                        nVarValueOf = n.valueOf(strArrSplit4[0]);
                        if (strArrSplit4.length == 2) {
                            i14 = Integer.parseInt(strArrSplit4[1]);
                        } else {
                            i14 = Integer.MAX_VALUE;
                        }
                        if (oVarB != null) {
                            oVarB = oVarB.b(nVarValueOf.until(i14));
                        } else if (nVarValueOf == n.BEGIN_OF_JANUARY) {
                            oVarB = nVarValueOf.until(i14);
                        } else {
                            oVarB = nVarValueOf.until(i14);
                        }
                    }
                    dVarH = dVarH.K(oVarB);
                }
                strArrSplit3 = strArrSplit6[i11 + 2].split("=");
                if (strArrSplit3[0].equals("era-preference")) {
                    String str11 = strArrSplit3[1];
                    strSubstring = str11.substring(1, str11.length() - 1);
                    if (!strSubstring.equals("default")) {
                        String[] strArrSplit9 = strSubstring.split(",");
                        j jVarValueOf3 = j.valueOf(strArrSplit9[0].substring(5));
                        g0VarI = net.time4j.format.expert.l.i(strArrSplit9[1].substring(7));
                        g0VarI2 = net.time4j.format.expert.l.i(strArrSplit9[2].substring(5));
                        i12 = a.f94586b[jVarValueOf3.ordinal()];
                        if (i12 == 1) {
                            return dVarH.J(g.e(g0VarI, g0VarI2));
                        }
                        if (i12 == 2) {
                            return dVarH.J(g.b(g0VarI, g0VarI2));
                        }
                        if (i12 == 3) {
                            return dVarH.J(g.a(g0VarI, g0VarI2));
                        }
                        throw new IllegalArgumentException("BC/AD not allowed as era preference: " + str);
                    }
                }
                return dVarH;
            default:
                throw new UnsupportedOperationException(bVarValueOf.name());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private static g0 s(String[] strArr, String str) {
        String[] strArrSplit = strArr[1].split("=");
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Invalid syntax in variant description: " + str);
        }
        if (strArrSplit[0].equals("cutover")) {
            try {
                return net.time4j.format.expert.l.f94353m.D(strArrSplit[1]);
            } catch (ParseException unused) {
            }
        }
        throw new IllegalArgumentException("Invalid cutover definition: " + str);
    }

    private b u() {
        net.time4j.history.a aVar = this.f94572c;
        return aVar != null ? aVar.d() : c.JULIAN;
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    private static boolean z(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public boolean B(h hVar) {
        b bVarK;
        return (hVar == null || A(hVar) || (bVarK = k(hVar)) == null || !bVarK.isValid(hVar)) ? false : true;
    }

    public t<Integer> C() {
        return this.f94580k;
    }

    public d I(net.time4j.history.a aVar) {
        if (aVar != null) {
            return !y() ? this : new d(this.f94570a, this.f94571b, aVar, this.f94573d, this.f94574e);
        }
        throw new NullPointerException("Missing ancient julian leap years.");
    }

    public d J(g gVar) {
        return (gVar.equals(this.f94574e) || !y()) ? this : new d(this.f94570a, this.f94571b, this.f94572c, this.f94573d, gVar);
    }

    public d K(o oVar) {
        if (oVar.equals(o.f94610d)) {
            if (this.f94573d != null) {
                return new d(this.f94570a, this.f94571b, this.f94572c, null, this.f94574e);
            }
        } else if (y()) {
            return new d(this.f94570a, this.f94571b, this.f94572c, oVar, this.f94574e);
        }
        return this;
    }

    public net.time4j.engine.p<Integer> L(p pVar) {
        int i11 = a.f94587c[pVar.ordinal()];
        if (i11 == 1) {
            return this.f94577h;
        }
        if (i11 == 2) {
            return this.f94578i;
        }
        if (i11 == 3) {
            return this.f94579j;
        }
        throw new UnsupportedOperationException(pVar.name());
    }

    public t<Integer> M() {
        return this.f94577h;
    }

    h a(h hVar) {
        int maximumDayOfMonth;
        b bVarK = k(hVar);
        return (bVarK != null && (maximumDayOfMonth = bVarK.getMaximumDayOfMonth(hVar)) < hVar.b()) ? h.g(hVar.c(), hVar.e(), hVar.d(), maximumDayOfMonth) : hVar;
    }

    public net.time4j.engine.p<Integer> b() {
        return this.f94583n;
    }

    public g0 d(h hVar) {
        if (A(hVar)) {
            throw new IllegalArgumentException("Out of supported range: " + hVar);
        }
        b bVarK = k(hVar);
        if (bVarK != null) {
            return g0.O0(bVarK.toMJD(hVar), z.MODIFIED_JULIAN_DATE);
        }
        throw new IllegalArgumentException("Invalid historic date: " + hVar);
    }

    public h e(g0 g0Var) {
        h hVarG;
        long jLongValue = ((Long) g0Var.s(z.MODIFIED_JULIAN_DATE)).longValue();
        int size = this.f94571b.size() - 1;
        while (true) {
            if (size < 0) {
                hVarG = null;
                break;
            }
            f fVar = this.f94571b.get(size);
            if (jLongValue >= fVar.f94588a) {
                hVarG = fVar.f94589b.fromMJD(jLongValue);
                break;
            }
            size--;
        }
        if (hVarG == null) {
            hVarG = u().fromMJD(jLongValue);
        }
        j jVarD = this.f94574e.d(hVarG, g0Var);
        if (jVarD != hVarG.c()) {
            hVarG = h.g(jVarD, jVarD.yearOfEra(hVarG.c(), hVarG.e()), hVarG.d(), hVarG.b());
        }
        if (!A(hVarG)) {
            return hVarG;
        }
        throw new IllegalArgumentException("Out of supported range: " + hVarG);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f94570a == dVar.f94570a && z(this.f94572c, dVar.f94572c) && z(this.f94573d, dVar.f94573d) && this.f94574e.equals(dVar.f94574e)) {
                return this.f94570a != ep0.b.SINGLE_CUTOVER_DATE || this.f94571b.get(0).f94588a == dVar.f94571b.get(0).f94588a;
            }
        }
        return false;
    }

    public net.time4j.engine.p<h> f() {
        return this.f94575f;
    }

    public net.time4j.engine.p<Integer> g() {
        return this.f94581l;
    }

    public net.time4j.engine.p<Integer> h() {
        return this.f94582m;
    }

    public int hashCode() {
        ep0.b bVar = this.f94570a;
        if (bVar != ep0.b.SINGLE_CUTOVER_DATE) {
            return bVar.hashCode();
        }
        long j11 = this.f94571b.get(0).f94588a;
        return (int) (j11 ^ (j11 << 32));
    }

    public net.time4j.engine.p<j> i() {
        return this.f94576g;
    }

    b k(h hVar) {
        for (int size = this.f94571b.size() - 1; size >= 0; size--) {
            f fVar = this.f94571b.get(size);
            if (hVar.compareTo(fVar.f94590c) >= 0) {
                return fVar.f94589b;
            }
            if (hVar.compareTo(fVar.f94591d) > 0) {
                return null;
            }
        }
        return u();
    }

    public net.time4j.history.a l() {
        net.time4j.history.a aVar = this.f94572c;
        if (aVar != null) {
            return aVar;
        }
        throw new UnsupportedOperationException("No historic julian leap years were defined.");
    }

    public h m(j jVar, int i11) {
        h hVarD = w().d(jVar, i11);
        if (B(hVarD)) {
            j jVarD = this.f94574e.d(hVarD, d(hVarD));
            return jVarD != jVar ? h.g(jVarD, jVarD.yearOfEra(hVarD.c(), hVarD.e()), hVarD.d(), hVarD.b()) : hVarD;
        }
        throw new IllegalArgumentException("Cannot determine valid New Year: " + jVar + "-" + i11);
    }

    public Set<net.time4j.engine.p<?>> n() {
        return this.f94584o;
    }

    g o() {
        return this.f94574e;
    }

    List<f> p() {
        return this.f94571b;
    }

    @Override // net.time4j.engine.m0
    public String q() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("historic-");
        sb2.append(this.f94570a.name());
        int i11 = a.f94585a[this.f94570a.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            sb2.append(":no-cutover");
        } else {
            if (i11 == 5 || i11 == 6) {
                sb2.append(":cutover=");
                sb2.append(r());
            }
            sb2.append(":ancient-julian-leap-years=");
            net.time4j.history.a aVar = this.f94572c;
            if (aVar != null) {
                int[] iArrE = aVar.e();
                sb2.append('[');
                sb2.append(iArrE[0]);
                for (int i12 = 1; i12 < iArrE.length; i12++) {
                    sb2.append(CoreConstants.COMMA_CHAR);
                    sb2.append(iArrE[i12]);
                }
                sb2.append(']');
            } else {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            sb2.append(":new-year-strategy=");
            sb2.append(w());
            sb2.append(":era-preference=");
            sb2.append(o());
        }
        return sb2.toString();
    }

    public g0 r() {
        List<f> list = this.f94571b;
        long j11 = list.get(list.size() - 1).f94588a;
        if (j11 != Long.MIN_VALUE) {
            return g0.O0(j11, z.MODIFIED_JULIAN_DATE);
        }
        throw new UnsupportedOperationException("Proleptic history without any gregorian reform date.");
    }

    ep0.b t() {
        return this.f94570a;
    }

    public String toString() {
        return "ChronoHistory[" + q() + "]";
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    public int v(j jVar, int i11) {
        h hVarD;
        h hVarD2;
        try {
            o oVar = this.f94573d;
            int i12 = 1;
            if (oVar == null) {
                hVarD = h.g(jVar, i11, 1, 1);
                hVarD2 = h.g(jVar, i11, 12, 31);
            } else {
                hVarD = oVar.d(jVar, i11);
                if (jVar == j.BC) {
                    hVarD2 = i11 == 1 ? this.f94573d.d(j.AD, 1) : this.f94573d.d(jVar, i11 - 1);
                } else {
                    h hVarD3 = this.f94573d.d(jVar, i11 + 1);
                    if (jVar == j.BYZANTINE) {
                        hVarD2 = this.f94573d.d(j.AD, jVar.annoDomini(i11));
                        if (hVarD2.compareTo(hVarD) <= 0) {
                            hVarD2 = hVarD3;
                        }
                    } else {
                        hVarD2 = hVarD3;
                    }
                }
                i12 = 0;
            }
            return (int) (net.time4j.f.DAYS.between(d(hVarD), d(hVarD2)) + ((long) i12));
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public o w() {
        o oVar = this.f94573d;
        return oVar == null ? o.f94610d : oVar;
    }

    public boolean x() {
        return this.f94572c != null;
    }

    public boolean y() {
        List<f> list = this.f94571b;
        return list.get(list.size() - 1).f94588a > Long.MIN_VALUE;
    }

    private d(ep0.b bVar, List<f> list, net.time4j.history.a aVar, o oVar, g gVar) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one cutover event must be present in chronological history.");
        }
        if (bVar == null) {
            throw new NullPointerException("Missing historic variant.");
        }
        if (gVar == null) {
            throw new NullPointerException("Missing era preference.");
        }
        this.f94570a = bVar;
        this.f94571b = list;
        this.f94572c = aVar;
        this.f94573d = oVar;
        this.f94574e = gVar;
        i iVar = new i(this);
        this.f94575f = iVar;
        k kVar = new k(this);
        this.f94576g = kVar;
        l lVar = new l('y', 1, 999999999, this, 2);
        this.f94577h = lVar;
        l lVar2 = new l((char) 0, 1, 999999999, this, 6);
        this.f94578i = lVar2;
        l lVar3 = new l((char) 0, 1, 999999999, this, 7);
        this.f94579j = lVar3;
        l lVar4 = new l('M', 1, 12, this, 3);
        this.f94580k = lVar4;
        l lVar5 = new l('d', 1, 31, this, 4);
        this.f94581l = lVar5;
        l lVar6 = new l('D', 1, 365, this, 5);
        this.f94582m = lVar6;
        l lVar7 = new l((char) 0, 1, 10000000, this, 8);
        this.f94583n = lVar7;
        HashSet hashSet = new HashSet();
        hashSet.add(iVar);
        hashSet.add(kVar);
        hashSet.add(lVar);
        hashSet.add(lVar2);
        hashSet.add(lVar3);
        hashSet.add(lVar4);
        hashSet.add(lVar5);
        hashSet.add(lVar6);
        hashSet.add(lVar7);
        this.f94584o = Collections.unmodifiableSet(hashSet);
    }
}
