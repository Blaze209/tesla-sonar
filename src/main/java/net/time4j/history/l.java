package net.time4j.history;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.text.ParsePosition;
import java.util.List;
import java.util.Locale;
import net.time4j.c0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.q;
import net.time4j.engine.w;
import net.time4j.engine.y;
import net.time4j.format.s;
import net.time4j.format.v;
import net.time4j.g0;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes9.dex */
final class l extends ep0.c implements dp0.a {
    private static final long serialVersionUID = -6283098762945747308L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f94607f;
    private final d history;

    private static class a<C extends q<C>> implements y<C, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f94608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f94609b;

        a(int i11, d dVar) {
            this.f94608a = i11;
            this.f94609b = dVar;
        }

        private h c(C c11, int i11) {
            h hVarE = this.f94609b.e((g0) c11.s(g0.f94488o));
            p pVar = p.DUAL_DATING;
            o oVarW = this.f94609b.w();
            int i12 = this.f94608a;
            switch (i12) {
                case 2:
                    break;
                case 3:
                    return this.f94609b.a(h.g(hVarE.c(), hVarE.e(), i11, hVarE.b()));
                case 4:
                    return h.g(hVarE.c(), hVarE.e(), hVarE.d(), i11);
                case 5:
                    int iF = hVarE.f(this.f94609b.w());
                    h hVarM = this.f94609b.m(hVarE.c(), iF);
                    int iV = this.f94609b.v(hVarE.c(), iF);
                    if (i11 == 1) {
                        return hVarM;
                    }
                    if (i11 > 1 && i11 <= iV) {
                        return this.f94609b.e(this.f94609b.d(hVarM).O(net.time4j.engine.h.c(i11 - 1)));
                    }
                    throw new IllegalArgumentException("Out of range: " + i11);
                case 6:
                case 7:
                    pVar = i12 == 6 ? p.AFTER_NEW_YEAR : p.BEFORE_NEW_YEAR;
                    break;
                case 8:
                    int iE = hVarE.e() % 100;
                    return this.f94609b.a(h.h(hVarE.c(), ((i11 - 1) * 100) + (iE != 0 ? iE : 100), hVarE.d(), hVarE.b(), pVar, oVarW));
                default:
                    throw new UnsupportedOperationException("Unknown element index: " + this.f94608a);
            }
            return this.f94609b.a(h.h(hVarE.c(), i11, hVarE.d(), hVarE.b(), pVar, oVarW));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(C c11) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(C c11) {
            throw new UnsupportedOperationException("Never called.");
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00b1 A[Catch: RuntimeException -> 0x0031, TryCatch #0 {RuntimeException -> 0x0031, blocks: (B:2:0x0000, B:3:0x0015, B:4:0x0018, B:5:0x0030, B:8:0x0034, B:10:0x004b, B:12:0x0050, B:13:0x0057, B:14:0x0058, B:22:0x007d, B:24:0x0085, B:26:0x008a, B:28:0x0098, B:30:0x00a6, B:31:0x00a9, B:32:0x00ac, B:34:0x00b1, B:36:0x00ba, B:35:0x00b6, B:15:0x0067, B:17:0x006f, B:21:0x0078, B:38:0x00bf, B:58:0x00fd, B:60:0x0101, B:61:0x0107, B:41:0x00c6, B:43:0x00ca, B:47:0x00da, B:49:0x00de, B:53:0x00ee), top: B:65:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00b6 A[Catch: RuntimeException -> 0x0031, TryCatch #0 {RuntimeException -> 0x0031, blocks: (B:2:0x0000, B:3:0x0015, B:4:0x0018, B:5:0x0030, B:8:0x0034, B:10:0x004b, B:12:0x0050, B:13:0x0057, B:14:0x0058, B:22:0x007d, B:24:0x0085, B:26:0x008a, B:28:0x0098, B:30:0x00a6, B:31:0x00a9, B:32:0x00ac, B:34:0x00b1, B:36:0x00ba, B:35:0x00b6, B:15:0x0067, B:17:0x006f, B:21:0x0078, B:38:0x00bf, B:58:0x00fd, B:60:0x0101, B:61:0x0107, B:41:0x00c6, B:43:0x00ca, B:47:0x00da, B:49:0x00de, B:53:0x00ee), top: B:65:0x0000 }] */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(C c11) {
            h hVarC;
            int maximumDayOfMonth;
            int iB;
            try {
                h hVarE = this.f94609b.e((g0) c11.s(g0.f94488o));
                int i11 = 8;
                int i12 = 999984973;
                switch (this.f94608a) {
                    case 2:
                    case 6:
                    case 7:
                    case 8:
                        d dVar = this.f94609b;
                        if (dVar != d.f94565s) {
                            if (dVar == d.f94564r) {
                                i12 = hVarE.c() == j.BC ? 999979466 : 999979465;
                            } else if (dVar == d.f94563q) {
                                i12 = hVarE.c() == j.BC ? Http2Connection.DEGRADED_PONG_TIMEOUT_NS : 999999999;
                            } else {
                                i12 = hVarE.c() == j.BC ? 45 : 9999;
                            }
                        }
                        if (this.f94608a == 8) {
                            i12 = ((i12 - 1) / 100) + 1;
                        }
                        return Integer.valueOf(i12);
                    case 3:
                        if (hVarE.c() != j.BYZANTINE || hVarE.e() != 999984973) {
                            i11 = 12;
                        }
                        hVarC = c(c11, i11);
                        maximumDayOfMonth = i11;
                        break;
                    case 4:
                        maximumDayOfMonth = this.f94609b.k(hVarE).getMaximumDayOfMonth(hVarE);
                        hVarC = c(c11, maximumDayOfMonth);
                        break;
                    case 5:
                        int iV = this.f94609b.v(hVarE.c(), hVarE.f(this.f94609b.w()));
                        if (iV != -1) {
                            return Integer.valueOf(iV);
                        }
                        throw new ChronoException("Length of historic year undefined.");
                    default:
                        throw new UnsupportedOperationException("Unknown element index: " + this.f94608a);
                }
                if (this.f94609b.B(hVarC)) {
                    return Integer.valueOf(maximumDayOfMonth);
                }
                List<f> listP = this.f94609b.p();
                for (int size = listP.size() - 1; size >= 0; size--) {
                    f fVar = listP.get(size);
                    if (hVarE.compareTo(fVar.f94590c) < 0) {
                        hVarC = fVar.f94591d;
                        if (this.f94608a == 3) {
                            iB = hVarC.d();
                        } else {
                            iB = hVarC.b();
                        }
                        return Integer.valueOf(iB);
                    }
                }
                if (this.f94608a == 3) {
                    iB = hVarC.d();
                } else {
                    iB = hVarC.b();
                }
                return Integer.valueOf(iB);
            } catch (RuntimeException e11) {
                throw new ChronoException(e11.getMessage(), e11);
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(C c11) {
            try {
                h hVarE = this.f94609b.e((g0) c11.s(g0.f94488o));
                int i11 = this.f94608a;
                if (i11 != 2 && i11 != 6 && i11 != 7 && i11 != 8) {
                    h hVarC = c(c11, 1);
                    if (this.f94609b.B(hVarC)) {
                        return 1;
                    }
                    if (this.f94608a == 5) {
                        throw new ChronoException("Historic New Year cannot be determined.");
                    }
                    List<f> listP = this.f94609b.p();
                    for (int size = listP.size() - 1; size >= 0; size--) {
                        f fVar = listP.get(size);
                        if (hVarE.compareTo(fVar.f94590c) >= 0) {
                            hVarC = fVar.f94590c;
                            break;
                        }
                    }
                    return Integer.valueOf(this.f94608a == 3 ? hVarC.d() : hVarC.b());
                }
                return (hVarE.c() != j.BYZANTINE || hVarE.d() < 9) ? 1 : 0;
            } catch (IllegalArgumentException e11) {
                throw new ChronoException(e11.getMessage(), e11);
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(C c11) {
            int iE;
            try {
                g0 g0Var = (g0) c11.s(g0.f94488o);
                h hVarE = this.f94609b.e(g0Var);
                switch (this.f94608a) {
                    case 2:
                        iE = hVarE.e();
                        break;
                    case 3:
                        iE = hVarE.d();
                        break;
                    case 4:
                        iE = hVarE.b();
                        break;
                    case 5:
                        iE = (int) ((g0Var.h() - this.f94609b.d(this.f94609b.m(hVarE.c(), hVarE.f(this.f94609b.w()))).h()) + 1);
                        break;
                    case 6:
                    case 7:
                        iE = hVarE.f(this.f94609b.w());
                        break;
                    case 8:
                        iE = ((hVarE.e() - 1) / 100) + 1;
                        break;
                    default:
                        throw new UnsupportedOperationException("Unknown element index: " + this.f94608a);
                }
                return Integer.valueOf(iE);
            } catch (IllegalArgumentException e11) {
                throw new ChronoException(e11.getMessage(), e11);
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean isValid(C c11, Integer num) {
            if (num == null) {
                return false;
            }
            try {
                return this.f94609b.B(c(c11, num.intValue()));
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C withValue(C c11, Integer num, boolean z11) {
            if (num == null) {
                throw new IllegalArgumentException("Missing historic element value.");
            }
            return (C) c11.B(g0.f94488o, this.f94609b.d(c(c11, num.intValue())));
        }
    }

    l(char c11, int i11, int i12, d dVar, int i13) {
        super(x(i13), c11, i11, i12);
        this.history = dVar;
        this.f94607f = i13;
    }

    private void q(String str, int i11) {
        if (str.length() <= i11) {
            return;
        }
        throw new IllegalArgumentException("Element " + name() + " cannot be printed as the formatted value " + str + " exceeds the maximum width of " + i11 + ".");
    }

    private String r(net.time4j.format.j jVar, char c11, int i11, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.toNumeral(i11));
        sb2.append('/');
        if (jVar.isDecimal() && i12 >= 100 && net.time4j.base.c.a(i11, 100) == net.time4j.base.c.a(i12, 100)) {
            int iC = net.time4j.base.c.c(i12, 100);
            if (iC < 10) {
                sb2.append(c11);
            }
            sb2.append(jVar.toNumeral(iC));
        } else {
            sb2.append(jVar.toNumeral(i12));
        }
        return jVar.isDecimal() ? u(sb2.toString(), i13, c11) : sb2.toString();
    }

    private Object readResolve() throws InvalidObjectException {
        String strName = name();
        if (strName.equals("YEAR_OF_ERA")) {
            return this.history.M();
        }
        if (strName.equals("HISTORIC_MONTH")) {
            return this.history.C();
        }
        if (strName.equals("HISTORIC_DAY_OF_MONTH")) {
            return this.history.g();
        }
        if (strName.equals("HISTORIC_DAY_OF_YEAR")) {
            return this.history.h();
        }
        if (strName.equals("YEAR_AFTER")) {
            return this.history.L(p.AFTER_NEW_YEAR);
        }
        if (strName.equals("YEAR_BEFORE")) {
            return this.history.L(p.BEFORE_NEW_YEAR);
        }
        if (strName.equals("CENTURY_OF_ERA")) {
            return this.history.b();
        }
        throw new InvalidObjectException("Unknown element: " + strName);
    }

    private int s(int i11, int i12, int i13) {
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        if (i12 >= 100 || i11 < 100) {
            return Integer.MAX_VALUE;
        }
        int i14 = i12 < 10 ? 10 : 100;
        if (Math.abs(i12 - net.time4j.base.c.c(i11, i14)) <= i13) {
            return (net.time4j.base.c.a(i11, i14) * i14) + i12;
        }
        return Integer.MAX_VALUE;
    }

    private s t(net.time4j.engine.d dVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d((Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT)).l((v) dVar.b(net.time4j.format.a.f94176g, v.WIDE), mVar);
    }

    private static String u(String str, int i11, char c11) {
        int length = str.length();
        if (i11 <= length) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = i11 - length;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(c11);
        }
        sb2.append(str);
        return sb2.toString();
    }

    private static int w(net.time4j.format.j jVar, char c11, CharSequence charSequence, int i11, ParsePosition parsePosition, net.time4j.format.g gVar) {
        int i12;
        boolean z11;
        int iCharAt;
        int iCharAt2 = 0;
        long integer = 0;
        if (jVar.isDecimal()) {
            if (jVar == net.time4j.format.j.ARABIC && charSequence.charAt(i11) == '-') {
                i12 = i11 + 1;
                z11 = true;
            } else {
                i12 = i11;
                z11 = false;
            }
            iCharAt2 = gVar.isStrict() ? 0 : jVar.getDigits().charAt(0);
            int iMin = Math.min(i12 + 9, charSequence.length());
            int i13 = i12;
            while (i12 < iMin) {
                int iCharAt3 = charSequence.charAt(i12) - c11;
                if (iCharAt3 >= 0 && iCharAt3 <= 9) {
                    integer = (integer * 10) + ((long) iCharAt3);
                    i13++;
                } else {
                    if (iCharAt2 == 0 || c11 == iCharAt2 || (iCharAt = charSequence.charAt(i12) - iCharAt2) < 0 || iCharAt > 9) {
                        break;
                    }
                    integer = (integer * 10) + ((long) iCharAt);
                    i13++;
                    c11 = iCharAt2;
                }
                i12++;
            }
            if (integer > 2147483647L) {
                parsePosition.setErrorIndex(i11);
                return Integer.MIN_VALUE;
            }
            if (!z11) {
                i11 = i13;
            } else if (i13 != i11 + 1) {
                integer = net.time4j.base.c.k(integer);
                i11 = i13;
            }
        } else {
            int length = charSequence.length();
            for (int i14 = i11; i14 < length && jVar.contains(charSequence.charAt(i14)); i14++) {
                iCharAt2++;
            }
            if (iCharAt2 > 0) {
                int i15 = iCharAt2 + i11;
                integer = jVar.toInteger(charSequence.subSequence(i11, i15).toString(), gVar);
                i11 = i15;
            }
        }
        parsePosition.setIndex(i11);
        return (int) integer;
    }

    private static String x(int i11) {
        switch (i11) {
            case 2:
                return "YEAR_OF_ERA";
            case 3:
                return "HISTORIC_MONTH";
            case 4:
                return "HISTORIC_DAY_OF_MONTH";
            case 5:
                return "HISTORIC_DAY_OF_YEAR";
            case 6:
                return "YEAR_AFTER";
            case 7:
                return "YEAR_BEFORE";
            case 8:
                return "CENTURY_OF_ERA";
            default:
                throw new UnsupportedOperationException("Unknown element index: " + i11);
        }
    }

    @Override // dp0.a
    public Integer e(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar, q<?> qVar) {
        char cCharAt;
        int i11 = this.f94607f;
        if (i11 == 3) {
            int index = parsePosition.getIndex();
            if (((Integer) dVar.b(dp0.a.B1, 0)).intValue() == 0) {
                net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f94177h;
                net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
                net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
                c0 c0Var = (c0) t(dVar, mVar2).d(charSequence, parsePosition, c0.class, dVar);
                if (c0Var == null && ((Boolean) dVar.b(net.time4j.format.a.f94180k, Boolean.TRUE)).booleanValue()) {
                    parsePosition.setErrorIndex(-1);
                    parsePosition.setIndex(index);
                    if (mVar2 == mVar) {
                        mVar = net.time4j.format.m.STANDALONE;
                    }
                    c0Var = (c0) t(dVar, mVar).d(charSequence, parsePosition, c0.class, dVar);
                }
                if (c0Var == null) {
                    return null;
                }
                return Integer.valueOf(c0Var.getValue());
            }
        } else if (i11 == 6 || i11 == 7 || i11 == 8) {
            throw new ChronoException("Not parseable as text element: " + name());
        }
        net.time4j.format.j jVar = (net.time4j.format.j) dVar.b(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC);
        net.time4j.engine.c<Character> cVar2 = net.time4j.format.a.f94182m;
        if (dVar.c(cVar2)) {
            cCharAt = ((Character) dVar.a(cVar2)).charValue();
        } else {
            cCharAt = jVar.isDecimal() ? jVar.getDigits().charAt(0) : '0';
        }
        char c11 = cCharAt;
        net.time4j.format.g gVar = jVar.isDecimal() ? net.time4j.format.g.SMART : (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART);
        int index2 = parsePosition.getIndex();
        int iW = w(jVar, c11, charSequence, index2, parsePosition, gVar);
        int index3 = parsePosition.getIndex();
        if (this.f94607f == 2 && index3 > index2 && !o.f94610d.equals(this.history.w()) && index3 < charSequence.length() && charSequence.charAt(index3) == '/') {
            net.time4j.engine.c<p> cVar3 = d.f94562p;
            p pVar = p.DUAL_DATING;
            if (dVar.b(cVar3, pVar) == pVar) {
                int i12 = index3 + 1;
                int iW2 = w(jVar, c11, charSequence, i12, parsePosition, gVar);
                int index4 = parsePosition.getIndex();
                if (index4 == i12) {
                    parsePosition.setIndex(index3);
                } else {
                    int i13 = this.history.w().f(j.AD, iW) != n.CALCULUS_PISANUS ? 1 : 2;
                    int iS = s(iW, iW2, i13);
                    if (jVar.isDecimal() && iS != Integer.MAX_VALUE) {
                        if (qVar != null) {
                            qVar.z(ep0.c.f63122e, iW);
                        }
                        index3 = index4;
                        iW = iS;
                    } else if (Math.abs(iW2 - iW) <= i13) {
                        if (qVar != null) {
                            qVar.z(ep0.c.f63122e, iW);
                        }
                        iW = iW2;
                        index3 = index4;
                    } else {
                        parsePosition.setIndex(index3);
                    }
                }
            }
        }
        if (index3 != index2) {
            return Integer.valueOf(iW);
        }
        parsePosition.setErrorIndex(index2);
        return null;
    }

    @Override // net.time4j.engine.e
    protected <T extends q<T>> y<T, Integer> f(w<T> wVar) {
        if (wVar.v(g0.f94488o)) {
            return new a(this.f94607f, this.history);
        }
        return null;
    }

    @Override // net.time4j.engine.e
    protected boolean h(net.time4j.engine.e<?> eVar) {
        return this.history.equals(((l) eVar).history);
    }

    @Override // dp0.a
    public void i(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, net.time4j.format.j jVar, char c11, int i11, int i12) throws IOException {
        int iF;
        if (this.f94607f == 5) {
            appendable.append(String.valueOf(oVar.s(this.history.h())));
            return;
        }
        h hVarE = oVar instanceof net.time4j.base.a ? this.history.e(g0.w0((net.time4j.base.a) oVar)) : (h) oVar.s(this.history.f());
        int i13 = this.f94607f;
        if (i13 != 2) {
            if (i13 != 3) {
                if (i13 == 4) {
                    appendable.append(String.valueOf(hVarE.b()));
                    return;
                }
                throw new ChronoException("Not printable as text: " + name());
            }
            int iIntValue = ((Integer) dVar.b(dp0.a.B1, 0)).intValue();
            int iD = hVarE.d();
            if (iIntValue == 0) {
                appendable.append(t(dVar, (net.time4j.format.m) dVar.b(net.time4j.format.a.f94177h, net.time4j.format.m.FORMAT)).g(c0.valueOf(iD)));
                return;
            }
            String numeral = jVar.toNumeral(iD);
            if (jVar.isDecimal()) {
                numeral = u(numeral, iIntValue, c11);
            }
            appendable.append(numeral);
            return;
        }
        o oVarW = this.history.w();
        int iE = hVarE.e();
        String string = null;
        if (!o.f94610d.equals(oVarW) && (iF = hVarE.f(oVarW)) != iE) {
            net.time4j.engine.c<p> cVar = d.f94562p;
            p pVar = p.DUAL_DATING;
            if (dVar.b(cVar, pVar) == pVar) {
                string = r(jVar, c11, iF, iE, i11);
            } else {
                iE = iF;
            }
        }
        if (string == null) {
            string = jVar.isDecimal() ? u(jVar.toNumeral(iE), i11, c11) : jVar.toNumeral(iE);
        }
        if (jVar.isDecimal()) {
            char cCharAt = jVar.getDigits().charAt(0);
            if (c11 != cCharAt) {
                StringBuilder sb2 = new StringBuilder();
                int length = string.length();
                for (int i14 = 0; i14 < length; i14++) {
                    char cCharAt2 = string.charAt(i14);
                    if (jVar.contains(cCharAt2)) {
                        sb2.append((char) (cCharAt2 + (c11 - cCharAt)));
                    } else {
                        sb2.append(cCharAt2);
                    }
                }
                string = sb2.toString();
            }
            q(string, i12);
        }
        appendable.append(string);
    }

    @Override // ep0.c, net.time4j.engine.e
    protected boolean n() {
        return false;
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        char cCharAt;
        net.time4j.format.j jVar = (net.time4j.format.j) dVar.b(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC);
        net.time4j.engine.c<Character> cVar = net.time4j.format.a.f94182m;
        if (dVar.c(cVar)) {
            cCharAt = ((Character) dVar.a(cVar)).charValue();
        } else {
            cCharAt = jVar.isDecimal() ? jVar.getDigits().charAt(0) : '0';
        }
        i(oVar, appendable, dVar, jVar, cCharAt, 1, 10);
    }

    @Override // net.time4j.format.t
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Integer parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        return e(charSequence, parsePosition, dVar, null);
    }
}
