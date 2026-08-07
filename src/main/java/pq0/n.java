package pq0;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sq0.u;
import sq0.w;

/* JADX INFO: loaded from: classes10.dex */
public class n implements tq0.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f103697i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f103698j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f103699k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f103700l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f103701m = Pattern.compile("`+");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f103702n = Pattern.compile("^`+");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f103703o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f103704p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f103705q = Pattern.compile("^ *(?:\n *)?");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f103706r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f103707s = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f103708t = Pattern.compile(" *$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BitSet f103709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BitSet f103710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Character, vq0.a> f103711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tq0.b f103712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f103713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f103714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f103715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f103716h;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f103717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f103718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f103719c;

        a(int i11, boolean z11, boolean z12) {
            this.f103717a = i11;
            this.f103719c = z11;
            this.f103718b = z12;
        }
    }

    public n(tq0.b bVar) {
        Map<Character, vq0.a> mapF = f(bVar.a());
        this.f103711c = mapF;
        BitSet bitSetE = e(mapF.keySet());
        this.f103710b = bitSetE;
        this.f103709a = g(bitSetE);
        this.f103712d = bVar;
    }

    private sq0.r A() {
        int i11 = this.f103714f;
        int length = this.f103713e.length();
        while (true) {
            int i12 = this.f103714f;
            if (i12 == length || this.f103709a.get(this.f103713e.charAt(i12))) {
                break;
            }
            this.f103714f++;
        }
        int i13 = this.f103714f;
        if (i11 != i13) {
            return M(this.f103713e, i11, i13);
        }
        return null;
    }

    private char B() {
        if (this.f103714f < this.f103713e.length()) {
            return this.f103713e.charAt(this.f103714f);
        }
        return (char) 0;
    }

    private void C(f fVar) {
        boolean z11;
        HashMap map = new HashMap();
        f fVar2 = this.f103715g;
        while (fVar2 != null) {
            f fVar3 = fVar2.f103660e;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            char c11 = fVar2.f103657b;
            vq0.a aVar = this.f103711c.get(Character.valueOf(c11));
            if (!fVar2.f103659d || aVar == null) {
                fVar2 = fVar2.f103661f;
            } else {
                char c12 = aVar.c();
                f fVar4 = fVar2.f103660e;
                int iD = 0;
                boolean z12 = false;
                while (true) {
                    if (fVar4 == null || fVar4 == fVar || fVar4 == map.get(Character.valueOf(c11))) {
                        z11 = z12;
                        z12 = false;
                        break;
                    }
                    if (fVar4.f103658c && fVar4.f103657b == c12) {
                        iD = aVar.d(fVar4, fVar2);
                        z12 = true;
                        if (iD > 0) {
                            z11 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.f103660e;
                }
                if (z12) {
                    w wVar = fVar4.f103656a;
                    w wVar2 = fVar2.f103656a;
                    fVar4.f103662g -= iD;
                    fVar2.f103662g -= iD;
                    wVar.n(wVar.m().substring(0, wVar.m().length() - iD));
                    wVar2.n(wVar2.m().substring(0, wVar2.m().length() - iD));
                    G(fVar4, fVar2);
                    k(wVar, wVar2);
                    aVar.e(wVar, wVar2, iD);
                    if (fVar4.f103662g == 0) {
                        E(fVar4);
                    }
                    if (fVar2.f103662g == 0) {
                        f fVar5 = fVar2.f103661f;
                        E(fVar2);
                        fVar2 = fVar5;
                    }
                } else {
                    if (!z11) {
                        map.put(Character.valueOf(c11), fVar2.f103660e);
                        if (!fVar2.f103658c) {
                            F(fVar2);
                        }
                    }
                    fVar2 = fVar2.f103661f;
                }
            }
        }
        while (true) {
            f fVar6 = this.f103715g;
            if (fVar6 == null || fVar6 == fVar) {
                return;
            } else {
                F(fVar6);
            }
        }
    }

    private void D(f fVar) {
        f fVar2 = fVar.f103660e;
        if (fVar2 != null) {
            fVar2.f103661f = fVar.f103661f;
        }
        f fVar3 = fVar.f103661f;
        if (fVar3 == null) {
            this.f103715g = fVar2;
        } else {
            fVar3.f103660e = fVar2;
        }
    }

    private void E(f fVar) {
        fVar.f103656a.l();
        D(fVar);
    }

    private void F(f fVar) {
        D(fVar);
    }

    private void G(f fVar, f fVar2) {
        f fVar3 = fVar2.f103660e;
        while (fVar3 != null && fVar3 != fVar) {
            f fVar4 = fVar3.f103660e;
            F(fVar3);
            fVar3 = fVar4;
        }
    }

    private void H() {
        this.f103716h = this.f103716h.f103652d;
    }

    private a J(vq0.a aVar, char c11) {
        boolean z11;
        int i11 = this.f103714f;
        boolean z12 = false;
        int i12 = 0;
        while (B() == c11) {
            i12++;
            this.f103714f++;
        }
        if (i12 < aVar.b()) {
            this.f103714f = i11;
            return null;
        }
        String strSubstring = i11 == 0 ? "\n" : this.f103713e.substring(i11 - 1, i11);
        char cB = B();
        String strValueOf = cB != 0 ? String.valueOf(cB) : "\n";
        Pattern pattern = f103697i;
        boolean zMatches = pattern.matcher(strSubstring).matches();
        Pattern pattern2 = f103706r;
        boolean zMatches2 = pattern2.matcher(strSubstring).matches();
        boolean zMatches3 = pattern.matcher(strValueOf).matches();
        boolean zMatches4 = pattern2.matcher(strValueOf).matches();
        boolean z13 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
        boolean z14 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
        if (c11 == '_') {
            z11 = z13 && (!z14 || zMatches);
            if (z14 && (!z13 || zMatches3)) {
                z12 = true;
            }
        } else {
            boolean z15 = z13 && c11 == aVar.c();
            if (z14 && c11 == aVar.a()) {
                z12 = true;
            }
            z11 = z15;
        }
        this.f103714f = i11;
        return new a(i12, z11, z12);
    }

    private void K() {
        h(f103705q);
    }

    private w L(String str) {
        return new w(str);
    }

    private w M(String str, int i11, int i12) {
        return new w(str.substring(i11, i12));
    }

    private void b(e eVar) {
        e eVar2 = this.f103716h;
        if (eVar2 != null) {
            eVar2.f103655g = true;
        }
        this.f103716h = eVar;
    }

    private static void c(char c11, vq0.a aVar, Map<Character, vq0.a> map) {
        if (map.put(Character.valueOf(c11), aVar) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c11 + "'");
    }

    private static void d(Iterable<vq0.a> iterable, Map<Character, vq0.a> map) {
        s sVar;
        for (vq0.a aVar : iterable) {
            char c11 = aVar.c();
            char cA = aVar.a();
            if (c11 == cA) {
                vq0.a aVar2 = map.get(Character.valueOf(c11));
                if (aVar2 == null || aVar2.c() != aVar2.a()) {
                    c(c11, aVar, map);
                } else {
                    if (aVar2 instanceof s) {
                        sVar = (s) aVar2;
                    } else {
                        s sVar2 = new s(c11);
                        sVar2.f(aVar2);
                        sVar = sVar2;
                    }
                    sVar.f(aVar);
                    map.put(Character.valueOf(c11), sVar);
                }
            } else {
                c(c11, aVar, map);
                c(cA, aVar, map);
            }
        }
    }

    public static BitSet e(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        return bitSet;
    }

    public static Map<Character, vq0.a> f(List<vq0.a> list) {
        HashMap map = new HashMap();
        d(Arrays.asList(new qq0.a(), new qq0.c()), map);
        d(list, map);
        return map;
    }

    public static BitSet g(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    private String h(Pattern pattern) {
        if (this.f103714f >= this.f103713e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f103713e);
        matcher.region(this.f103714f, this.f103713e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f103714f = matcher.end();
        return matcher.group();
    }

    private void i(sq0.r rVar) {
        if (rVar.c() == rVar.d()) {
            return;
        }
        l(rVar.c(), rVar.d());
    }

    private void j(w wVar, w wVar2, int i11) {
        if (wVar == null || wVar2 == null || wVar == wVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append(wVar.m());
        sq0.r rVarE = wVar.e();
        sq0.r rVarE2 = wVar2.e();
        while (rVarE != rVarE2) {
            sb2.append(((w) rVarE).m());
            sq0.r rVarE3 = rVarE.e();
            rVarE.l();
            rVarE = rVarE3;
        }
        wVar.n(sb2.toString());
    }

    private void k(sq0.r rVar, sq0.r rVar2) {
        if (rVar == rVar2 || rVar.e() == rVar2) {
            return;
        }
        l(rVar.e(), rVar2.g());
    }

    private void l(sq0.r rVar, sq0.r rVar2) {
        w wVar = null;
        w wVar2 = null;
        int length = 0;
        while (rVar != null) {
            if (rVar instanceof w) {
                wVar2 = (w) rVar;
                if (wVar == null) {
                    wVar = wVar2;
                }
                length += wVar2.m().length();
            } else {
                j(wVar, wVar2, length);
                wVar = null;
                wVar2 = null;
                length = 0;
            }
            if (rVar == rVar2) {
                break;
            } else {
                rVar = rVar.e();
            }
        }
        j(wVar, wVar2, length);
    }

    private sq0.r m() {
        String strH = h(f103703o);
        if (strH != null) {
            String strSubstring = strH.substring(1, strH.length() - 1);
            sq0.n nVar = new sq0.n("mailto:" + strSubstring, null);
            nVar.b(new w(strSubstring));
            return nVar;
        }
        String strH2 = h(f103704p);
        if (strH2 == null) {
            return null;
        }
        String strSubstring2 = strH2.substring(1, strH2.length() - 1);
        sq0.n nVar2 = new sq0.n(strSubstring2, null);
        nVar2.b(new w(strSubstring2));
        return nVar2;
    }

    private sq0.r n() {
        this.f103714f++;
        if (B() == '\n') {
            sq0.h hVar = new sq0.h();
            this.f103714f++;
            return hVar;
        }
        if (this.f103714f < this.f103713e.length()) {
            Pattern pattern = f103699k;
            String str = this.f103713e;
            int i11 = this.f103714f;
            if (pattern.matcher(str.substring(i11, i11 + 1)).matches()) {
                String str2 = this.f103713e;
                int i12 = this.f103714f;
                w wVarM = M(str2, i12, i12 + 1);
                this.f103714f++;
                return wVarM;
            }
        }
        return L("\\");
    }

    private sq0.r o() {
        String strH;
        String strH2 = h(f103702n);
        if (strH2 == null) {
            return null;
        }
        int i11 = this.f103714f;
        do {
            strH = h(f103701m);
            if (strH == null) {
                this.f103714f = i11;
                return L(strH2);
            }
        } while (!strH.equals(strH2));
        sq0.d dVar = new sq0.d();
        String strReplace = this.f103713e.substring(i11, this.f103714f - strH2.length()).replace('\n', ' ');
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && rq0.d.e(strReplace)) {
            strReplace = strReplace.substring(1, strReplace.length() - 1);
        }
        dVar.n(strReplace);
        return dVar;
    }

    private sq0.r p() {
        int i11 = this.f103714f;
        this.f103714f = i11 + 1;
        if (B() != '[') {
            return L("!");
        }
        this.f103714f++;
        w wVarL = L("![");
        b(e.a(wVarL, i11 + 1, this.f103716h, this.f103715g));
        return wVarL;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    private sq0.r q() {
        boolean z11;
        String strM;
        String strO;
        boolean z12 = true;
        int i11 = this.f103714f + 1;
        this.f103714f = i11;
        e eVar = this.f103716h;
        if (eVar == null) {
            return L("]");
        }
        if (!eVar.f103654f) {
            H();
            return L("]");
        }
        String strSubstring = null;
        if (B() == '(') {
            this.f103714f++;
            K();
            strM = v();
            if (strM != null) {
                K();
                Pattern pattern = f103707s;
                String str = this.f103713e;
                int i12 = this.f103714f;
                if (pattern.matcher(str.substring(i12 - 1, i12)).matches()) {
                    strO = x();
                    K();
                } else {
                    strO = null;
                }
                if (B() == ')') {
                    this.f103714f++;
                    z11 = true;
                } else {
                    this.f103714f = i11;
                    z11 = false;
                }
            } else {
                z11 = false;
                strO = null;
            }
        } else {
            z11 = false;
            strM = null;
            strO = null;
        }
        if (z11) {
            z12 = z11;
        } else {
            int i13 = this.f103714f;
            w();
            int i14 = this.f103714f - i13;
            if (i14 > 2) {
                strSubstring = this.f103713e.substring(i13, i14 + i13);
            } else if (!eVar.f103655g) {
                strSubstring = this.f103713e.substring(eVar.f103650b, i11);
            }
            if (strSubstring != null) {
                sq0.o oVarB = this.f103712d.b(rq0.a.c(strSubstring));
                if (oVarB != null) {
                    strM = oVarB.m();
                    strO = oVarB.o();
                } else {
                    z12 = z11;
                }
            } else {
                z12 = z11;
            }
        }
        if (!z12) {
            this.f103714f = i11;
            H();
            return L("]");
        }
        sq0.r lVar = eVar.f103651c ? new sq0.l(strM, strO) : new sq0.n(strM, strO);
        sq0.r rVarE = eVar.f103649a.e();
        while (rVarE != null) {
            sq0.r rVarE2 = rVarE.e();
            lVar.b(rVarE);
            rVarE = rVarE2;
        }
        C(eVar.f103653e);
        i(lVar);
        eVar.f103649a.l();
        H();
        if (!eVar.f103651c) {
            for (e eVar2 = this.f103716h; eVar2 != null; eVar2 = eVar2.f103652d) {
                if (!eVar2.f103651c) {
                    eVar2.f103654f = false;
                }
            }
        }
        return lVar;
    }

    private sq0.r r(vq0.a aVar, char c11) {
        a aVarJ = J(aVar, c11);
        if (aVarJ == null) {
            return null;
        }
        int i11 = aVarJ.f103717a;
        int i12 = this.f103714f;
        int i13 = i12 + i11;
        this.f103714f = i13;
        w wVarM = M(this.f103713e, i12, i13);
        f fVar = new f(wVarM, c11, aVarJ.f103719c, aVarJ.f103718b, this.f103715g);
        this.f103715g = fVar;
        fVar.f103662g = i11;
        fVar.f103663h = i11;
        f fVar2 = fVar.f103660e;
        if (fVar2 != null) {
            fVar2.f103661f = fVar;
        }
        return wVarM;
    }

    private sq0.r s() {
        String strH = h(f103700l);
        if (strH != null) {
            return L(rq0.b.a(strH));
        }
        return null;
    }

    private sq0.r t() {
        String strH = h(f103698j);
        if (strH == null) {
            return null;
        }
        sq0.k kVar = new sq0.k();
        kVar.m(strH);
        return kVar;
    }

    private sq0.r u(sq0.r rVar) {
        sq0.r rVarY;
        char cB = B();
        if (cB == 0) {
            return null;
        }
        if (cB == '\n') {
            rVarY = y(rVar);
        } else if (cB == '!') {
            rVarY = p();
        } else if (cB == '&') {
            rVarY = s();
        } else if (cB == '<') {
            rVarY = m();
            if (rVarY == null) {
                rVarY = t();
            }
        } else if (cB != '`') {
            switch (cB) {
                case '[':
                    rVarY = z();
                    break;
                case '\\':
                    rVarY = n();
                    break;
                case ']':
                    rVarY = q();
                    break;
                default:
                    rVarY = !this.f103710b.get(cB) ? A() : r(this.f103711c.get(Character.valueOf(cB)), cB);
                    break;
            }
        } else {
            rVarY = o();
        }
        if (rVarY != null) {
            return rVarY;
        }
        this.f103714f++;
        return L(String.valueOf(cB));
    }

    private String v() {
        int iA = rq0.c.a(this.f103713e, this.f103714f);
        if (iA == -1) {
            return null;
        }
        String strSubstring = B() == '<' ? this.f103713e.substring(this.f103714f + 1, iA - 1) : this.f103713e.substring(this.f103714f, iA);
        this.f103714f = iA;
        return rq0.a.e(strSubstring);
    }

    private String x() {
        int iD = rq0.c.d(this.f103713e, this.f103714f);
        if (iD == -1) {
            return null;
        }
        String strSubstring = this.f103713e.substring(this.f103714f + 1, iD - 1);
        this.f103714f = iD;
        return rq0.a.e(strSubstring);
    }

    private sq0.r y(sq0.r rVar) {
        this.f103714f++;
        if (rVar instanceof w) {
            w wVar = (w) rVar;
            if (wVar.m().endsWith(" ")) {
                String strM = wVar.m();
                Matcher matcher = f103708t.matcher(strM);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    wVar.n(strM.substring(0, strM.length() - iEnd));
                }
                return iEnd >= 2 ? new sq0.h() : new u();
            }
        }
        return new u();
    }

    private sq0.r z() {
        int i11 = this.f103714f;
        this.f103714f = i11 + 1;
        w wVarL = L("[");
        b(e.b(wVarL, i11, this.f103716h, this.f103715g));
        return wVarL;
    }

    void I(String str) {
        this.f103713e = str;
        this.f103714f = 0;
        this.f103715g = null;
        this.f103716h = null;
    }

    @Override // tq0.a
    public void a(String str, sq0.r rVar) {
        I(str.trim());
        sq0.r rVarU = null;
        while (true) {
            rVarU = u(rVarU);
            if (rVarU == null) {
                C(null);
                i(rVar);
                return;
            }
            rVar.b(rVarU);
        }
    }

    int w() {
        if (this.f103714f < this.f103713e.length() && this.f103713e.charAt(this.f103714f) == '[') {
            int i11 = this.f103714f + 1;
            int iC = rq0.c.c(this.f103713e, i11);
            int i12 = iC - i11;
            if (iC != -1 && i12 <= 999 && iC < this.f103713e.length() && this.f103713e.charAt(iC) == ']') {
                this.f103714f = iC + 1;
                return i12 + 2;
            }
        }
        return 0;
    }
}
