package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SortedMap<h0, String> f94667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static l f94668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final net.time4j.engine.c<l> f94669f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient Locale f94670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient String f94671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient SortedMap<h0, String> f94672c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94673a;

        static {
            int[] iArr = new int[net.time4j.format.v.values().length];
            f94673a = iArr;
            try {
                iArr[net.time4j.format.v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94673a[net.time4j.format.v.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class b extends net.time4j.engine.e<String> implements net.time4j.format.t<String>, net.time4j.engine.y<net.time4j.engine.q<?>, String> {
        private static final long serialVersionUID = 5589976208326940032L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final transient boolean f94674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient l f94675b;

        b(boolean z11, Locale locale, String str) {
            this(z11, l.r(locale, str));
        }

        /* JADX WARN: Code duplicated, block: B:57:0x0133 A[PHI: r3
          0x0133: PHI (r3v8 int) = (r3v4 int), (r3v3 int) binds: [B:65:0x0152, B:56:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
        private String C(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar, net.time4j.format.m mVar) {
            String str;
            Map map;
            String str2;
            String str3;
            boolean zO;
            String strK;
            ArrayList arrayList = new ArrayList();
            String str4 = "pm";
            String str5 = "am";
            if (this.f94674a) {
                arrayList.add("am");
                arrayList.add("pm");
                arrayList.add("midnight");
                arrayList.add("noon");
            } else {
                arrayList.addAll(new LinkedHashSet(this.f94675b.f94672c.values()));
                if (this.f94675b.p()) {
                    arrayList.add("midnight");
                    arrayList.add("noon");
                }
            }
            Map mapQ = this.f94675b.p() ? l.q(v(), p()) : null;
            net.time4j.format.v vVar = (net.time4j.format.v) dVar.b(net.time4j.format.a.f94176g, net.time4j.format.v.WIDE);
            boolean zBooleanValue = ((Boolean) dVar.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue();
            boolean zBooleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f94179j, Boolean.FALSE)).booleanValue();
            int index = parsePosition.getIndex();
            int length = charSequence.length();
            Iterator it = arrayList.iterator();
            String str6 = null;
            int i11 = 0;
            while (it.hasNext()) {
                boolean z11 = zBooleanValue2;
                String str7 = (String) it.next();
                Iterator it2 = it;
                if (this.f94675b.p()) {
                    if (this.f94674a) {
                        strK = l.k(mapQ, vVar, mVar, str7);
                        if (!mapQ.containsKey(strK)) {
                            if (str7.equals("midnight")) {
                                strK = l.k(mapQ, vVar, mVar, str5);
                            } else if (str7.equals("noon")) {
                                strK = l.k(mapQ, vVar, mVar, str4);
                            }
                        }
                    } else {
                        strK = l.k(mapQ, vVar, mVar, str7);
                    }
                    str = mapQ.containsKey(strK) ? (String) mapQ.get(strK) : null;
                } else {
                    str = str7;
                }
                if (str != null) {
                    int length2 = str.length();
                    map = mapQ;
                    int i12 = index;
                    int i13 = 0;
                    boolean z12 = true;
                    while (z12 && i13 < length2) {
                        String str8 = str4;
                        int i14 = index + i13;
                        if (i14 >= length) {
                            z12 = false;
                        } else {
                            char cCharAt = charSequence.charAt(i14);
                            char cCharAt2 = str.charAt(i13);
                            if (zBooleanValue) {
                                zO = o(cCharAt, cCharAt2);
                            } else {
                                zO = cCharAt == cCharAt2;
                            }
                            if (zO) {
                                i12++;
                            }
                            z12 = zO;
                        }
                        i13++;
                        str4 = str8;
                        str5 = str5;
                    }
                    str2 = str4;
                    str3 = str5;
                    if (z11 || length2 == 1) {
                        length2 = i12 - index;
                        if (i11 < length2) {
                            str6 = str7;
                            i11 = length2;
                        } else if (str6 != null && i11 == length2) {
                            if (this.f94674a) {
                                str6 = null;
                            } else {
                                str6 = str6 + "|" + str7;
                            }
                        }
                    } else if (z12) {
                        if (str6 == null) {
                            str6 = str7;
                        } else if (this.f94674a) {
                            i11 = length2;
                            str6 = null;
                        } else {
                            str6 = str6 + "|" + str7;
                        }
                        i11 = length2;
                    }
                } else {
                    map = mapQ;
                    str2 = str4;
                    str3 = str5;
                }
                it = it2;
                zBooleanValue2 = z11;
                mapQ = map;
                str4 = str2;
                str5 = str3;
            }
            if (str6 == null) {
                parsePosition.setErrorIndex(index);
                return str6;
            }
            parsePosition.setIndex(index + i11);
            return str6;
        }

        private boolean o(char c11, char c12) {
            if (c11 >= 'a' && c11 <= 'z') {
                c11 = (char) (c11 - ' ');
            }
            if (c12 >= 'a' && c12 <= 'z') {
                c12 = (char) (c12 - ' ');
            }
            if (c11 >= 'A' && c11 <= 'Z') {
                return c11 == c12;
            }
            Locale localeV = v();
            return String.valueOf(c11).toUpperCase(localeV).equals(String.valueOf(c12).toUpperCase(localeV));
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Serialization proxy required.");
        }

        private Object writeReplace() {
            return new SPX(this, 7);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public boolean isValid(net.time4j.engine.q<?> qVar, String str) {
            return false;
        }

        @Override // net.time4j.format.t
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public String parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            int index = parsePosition.getIndex();
            net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f94177h;
            net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
            net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
            String strC = C(charSequence, parsePosition, dVar, mVar2);
            if (strC != null || !((Boolean) dVar.b(net.time4j.format.a.f94180k, Boolean.TRUE)).booleanValue()) {
                return strC;
            }
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = net.time4j.format.m.STANDALONE;
            }
            return C(charSequence, parsePosition, dVar, mVar);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> withValue(net.time4j.engine.q<?> qVar, String str, boolean z11) {
            throw new IllegalArgumentException("Day period element cannot be set.");
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.q<T>> net.time4j.engine.y<T, String> f(net.time4j.engine.w<T> wVar) {
            if (wVar.v(h0.f94525p)) {
                return this;
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public char getSymbol() {
            return this.f94674a ? 'b' : 'B';
        }

        @Override // net.time4j.engine.p
        public Class<String> getType() {
            return String.class;
        }

        @Override // net.time4j.engine.e
        protected boolean h(net.time4j.engine.e<?> eVar) {
            return this.f94675b.equals(((b) eVar).f94675b);
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return true;
        }

        String p() {
            return this.f94675b.f94671b;
        }

        @Override // net.time4j.format.t
        public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
            net.time4j.format.v vVar = (net.time4j.format.v) dVar.b(net.time4j.format.a.f94176g, net.time4j.format.v.WIDE);
            net.time4j.format.m mVar = (net.time4j.format.m) dVar.b(net.time4j.format.a.f94177h, net.time4j.format.m.FORMAT);
            appendable.append(this.f94674a ? this.f94675b.l(vVar, mVar).apply(oVar) : this.f94675b.j(vVar, mVar).apply(oVar));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(net.time4j.engine.q<?> qVar) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(net.time4j.engine.q<?> qVar) {
            return null;
        }

        Object s() {
            return this.f94675b.f94672c;
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public String s() {
            if (this.f94674a) {
                return "pm";
            }
            return (String) this.f94675b.f94672c.get((h0) this.f94675b.f94672c.lastKey());
        }

        @Override // net.time4j.engine.e
        public String toString() {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(name());
            sb2.append('@');
            sb2.append(this.f94675b);
            return sb2.toString();
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public String t() {
            if (this.f94674a) {
                return "am";
            }
            return (String) this.f94675b.f94672c.get((h0) this.f94675b.f94672c.firstKey());
        }

        Locale v() {
            return this.f94675b.f94670a;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public String getMaximum(net.time4j.engine.q<?> qVar) {
            return getDefaultMaximum();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public String getMinimum(net.time4j.engine.q<?> qVar) {
            return getDefaultMinimum();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public String getValue(net.time4j.engine.q<?> qVar) {
            String str;
            h0 h0Var = (h0) qVar.s(h0.f94525p);
            if (this.f94674a) {
                return l.n(h0Var);
            }
            if (this.f94675b.p()) {
                Map mapQ = l.q(v(), p());
                if (h0Var.A0()) {
                    str = "midnight";
                } else {
                    str = h0Var.B0(h0.F0(12)) ? "noon" : null;
                }
                if (str != null && mapQ.containsKey(l.k(mapQ, net.time4j.format.v.ABBREVIATED, net.time4j.format.m.FORMAT, str))) {
                    return str;
                }
            }
            return (String) this.f94675b.f94672c.get(this.f94675b.o(h0Var));
        }

        boolean z() {
            return this.f94674a;
        }

        b(boolean z11, l lVar) {
            super(z11 ? "FIXED_DAY_PERIOD" : "APPROXIMATE_DAY_PERIOD");
            this.f94674a = z11;
            this.f94675b = lVar;
        }
    }

    static class c implements net.time4j.engine.r {
        c() {
        }

        private static l e(Locale locale, net.time4j.engine.d dVar) {
            return dVar.c(l.f94669f) ? (l) dVar.a(l.f94669f) : l.r(locale, (String) dVar.b(net.time4j.format.a.f94171b, "iso8601"));
        }

        private static int f(net.time4j.engine.q<?> qVar) {
            net.time4j.c<Integer, h0> cVar = h0.f94527r;
            if (qVar.n(cVar)) {
                int iIntValue = ((Integer) qVar.s(cVar)).intValue();
                if (iIntValue == 12) {
                    return 0;
                }
                return iIntValue;
            }
            k0<Integer, h0> k0Var = h0.f94529t;
            if (qVar.n(k0Var)) {
                return ((Integer) qVar.s(k0Var)).intValue();
            }
            return -1;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0072  */
        /* JADX WARN: Code duplicated, block: B:31:0x0084  */
        /* JADX WARN: Code duplicated, block: B:33:0x009a  */
        /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00db A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:65:0x0104 A[PHI: r6
          0x0104: PHI (r6v12 net.time4j.a0) = 
          (r6v11 net.time4j.a0)
          (r6v11 net.time4j.a0)
          (r6v17 net.time4j.a0)
          (r6v18 net.time4j.a0)
          (r6v19 net.time4j.a0)
          (r6v20 net.time4j.a0)
         binds: [B:56:0x00ec, B:57:0x00ee, B:70:0x0113, B:69:0x0110, B:64:0x0102, B:63:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:93:0x0116 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x0116 A[SYNTHETIC] */
        @Override // net.time4j.engine.r
        public net.time4j.engine.q<?> a(net.time4j.engine.q<?> qVar, Locale locale, net.time4j.engine.d dVar) {
            int iF;
            h0 h0VarM;
            a0 a0Var;
            a0 a0Var2;
            if (qVar.n(h0.f94525p) || qVar.n(h0.f94531v) || qVar.n(h0.f94530u) || qVar.n(h0.f94528s)) {
                return qVar;
            }
            l lVarE = e(locale, dVar);
            int i11 = 0;
            b bVar = new b(false, lVarE);
            int i12 = 1;
            if (!qVar.n(bVar)) {
                b bVar2 = new b(true, lVarE);
                if (!qVar.n(bVar2)) {
                    return qVar;
                }
                String str = (String) qVar.s(bVar2);
                return ((str.equals("am") || str.equals("midnight")) ? qVar.B(h0.f94526q, a0.AM) : qVar.B(h0.f94526q, a0.PM)).B(bVar2, null);
            }
            String str2 = (String) qVar.s(bVar);
            int i13 = 0;
            a0 a0Var3 = null;
            while (true) {
                int iIndexOf = str2.indexOf(124, i11);
                String strSubstring = iIndexOf == -1 ? str2.substring(i11) : str2.substring(i11, iIndexOf);
                int i14 = iIndexOf + 1;
                i13 += i12;
                if (lVarE.p() && a0Var3 == null) {
                    if (strSubstring.equals("midnight")) {
                        a0Var2 = a0.AM;
                    } else if (strSubstring.equals("noon")) {
                        a0Var2 = a0.PM;
                    } else {
                        for (h0 h0Var : lVarE.f94672c.keySet()) {
                            if (((String) lVarE.f94672c.get(h0Var)).equals(strSubstring)) {
                                iF = f(qVar);
                                h0VarM = lVarE.m(h0Var);
                                if (h0Var.c() >= 12) {
                                    if (h0VarM.w0(h0Var)) {
                                        a0Var = a0.PM;
                                    } else {
                                        a0Var = a0.PM;
                                    }
                                } else if (!h0VarM.w0(h0.F0(12))) {
                                    a0Var = a0.AM;
                                } else if (iF != -1) {
                                    a0Var = null;
                                } else if (iF >= h0Var.c()) {
                                    a0Var = a0.AM;
                                } else {
                                    a0Var = a0.PM;
                                }
                                if (a0Var == null) {
                                    if (a0Var3 != null) {
                                        a0Var3 = a0Var;
                                    } else {
                                        a0Var3 = a0Var;
                                    }
                                }
                            }
                        }
                    }
                    a0Var3 = a0Var2;
                } else {
                    while (r12.hasNext()) {
                        if (((String) lVarE.f94672c.get(h0Var)).equals(strSubstring)) {
                            iF = f(qVar);
                            h0VarM = lVarE.m(h0Var);
                            if (h0Var.c() >= 12) {
                                if (h0VarM.w0(h0Var) || h0VarM.B0(h0.E0())) {
                                    a0Var = a0.PM;
                                } else if (iF != -1) {
                                    a0Var = iF + 12 >= h0Var.c() ? a0.PM : a0.AM;
                                } else {
                                    a0Var = null;
                                }
                            } else if (!h0VarM.w0(h0.F0(12))) {
                                a0Var = a0.AM;
                            } else if (iF != -1) {
                                a0Var = null;
                            } else if (iF >= h0Var.c()) {
                                a0Var = a0.AM;
                            } else {
                                a0Var = a0.PM;
                            }
                            if (a0Var == null) {
                                if (a0Var3 != null || a0Var3 == a0Var) {
                                    a0Var3 = a0Var;
                                } else {
                                    if (iF != -1) {
                                        if (strSubstring.startsWith("night")) {
                                            a0Var = iF < 6 ? a0.AM : a0.PM;
                                        } else if (strSubstring.startsWith("afternoon")) {
                                            a0Var = iF < 6 ? a0.PM : a0.AM;
                                        }
                                        a0Var3 = a0Var;
                                    }
                                    a0Var3 = null;
                                }
                            }
                        }
                    }
                }
                if (i14 <= 0) {
                    break;
                }
                i11 = i14;
                i12 = 1;
            }
            if (a0Var3 == null) {
                return qVar;
            }
            net.time4j.engine.q<?> qVarB = qVar.B(h0.f94526q, a0Var3);
            return i13 > 1 ? qVarB.B(bVar, null) : qVarB;
        }

        @Override // net.time4j.engine.r
        public Set<net.time4j.engine.p<?>> b(Locale locale, net.time4j.engine.d dVar) {
            l lVarE = e(locale, dVar);
            HashSet hashSet = new HashSet();
            hashSet.add(new b(false, lVarE));
            if (!dVar.c(l.f94669f)) {
                hashSet.add(new b(true, lVarE));
            }
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // net.time4j.engine.r
        public boolean c(Class<?> cls) {
            return h0.class.isAssignableFrom(cls);
        }

        @Override // net.time4j.engine.r
        public boolean d(net.time4j.engine.p<?> pVar) {
            return pVar instanceof b;
        }
    }

    private class d implements net.time4j.engine.s<net.time4j.engine.o, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f94676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final net.time4j.format.v f94677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final net.time4j.format.m f94678c;

        d(boolean z11, net.time4j.format.v vVar, net.time4j.format.m mVar) {
            if (vVar == null) {
                throw new NullPointerException("Missing text width.");
            }
            if (mVar == null) {
                throw new NullPointerException("Missing output context.");
            }
            this.f94676a = z11;
            this.f94677b = vVar;
            this.f94678c = mVar;
        }

        @Override // net.time4j.engine.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(net.time4j.engine.o oVar) {
            h0 h0Var = (h0) oVar.s(h0.f94525p);
            l lVar = l.this;
            Locale locale = lVar.f94670a;
            if (this.f94676a) {
                String strN = l.n(h0Var);
                if (!lVar.p()) {
                    return strN;
                }
                Map mapQ = l.q(locale, lVar.f94671b);
                String strK = l.k(mapQ, this.f94677b, this.f94678c, strN);
                if (!mapQ.containsKey(strK)) {
                    if (strN.equals("midnight")) {
                        strK = l.k(mapQ, this.f94677b, this.f94678c, "am");
                    } else if (strN.equals("noon")) {
                        strK = l.k(mapQ, this.f94677b, this.f94678c, "pm");
                    }
                }
                if (mapQ.containsKey(strK)) {
                    return (String) mapQ.get(strK);
                }
            } else {
                if (!lVar.p()) {
                    return (String) lVar.f94672c.get(lVar.o(h0Var));
                }
                Map mapQ2 = l.q(locale, lVar.f94671b);
                if (h0Var.A0()) {
                    String strK2 = l.k(mapQ2, this.f94677b, this.f94678c, "midnight");
                    if (mapQ2.containsKey(strK2)) {
                        return (String) mapQ2.get(strK2);
                    }
                } else if (h0Var.B0(h0.F0(12))) {
                    String strK3 = l.k(mapQ2, this.f94677b, this.f94678c, "noon");
                    if (mapQ2.containsKey(strK3)) {
                        return (String) mapQ2.get(strK3);
                    }
                }
                String strK4 = l.k(mapQ2, this.f94677b, this.f94678c, (String) lVar.f94672c.get(lVar.o(h0Var)));
                if (mapQ2.containsKey(strK4)) {
                    return (String) mapQ2.get(strK4);
                }
            }
            a0 a0Var = (a0) h0Var.s(h0.f94526q);
            if (locale == null) {
                locale = Locale.ROOT;
            }
            return a0Var.getDisplayName(locale);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        treeMap.put(h0.E0(), "am");
        treeMap.put(h0.F0(12), "pm");
        SortedMap<h0, String> sortedMapUnmodifiableSortedMap = Collections.unmodifiableSortedMap(treeMap);
        f94667d = sortedMapUnmodifiableSortedMap;
        f94668e = new l(Locale.ROOT, "iso8601", sortedMapUnmodifiableSortedMap);
        f94669f = net.time4j.format.a.e("CUSTOM_DAY_PERIOD", l.class);
    }

    private l(Locale locale, String str, SortedMap<h0, String> sortedMap) {
        this.f94670a = locale;
        this.f94671b = str;
        this.f94672c = Collections.unmodifiableSortedMap(sortedMap);
    }

    private static boolean a(String str) {
        return str.charAt(0) == 'T' && str.length() == 5 && Character.isDigit(str.charAt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k(Map<String, String> map, net.time4j.format.v vVar, net.time4j.format.m mVar, String str) {
        if (vVar == net.time4j.format.v.SHORT) {
            vVar = net.time4j.format.v.ABBREVIATED;
        }
        String str2 = t(vVar, mVar) + str;
        if (!map.containsKey(str2)) {
            if (mVar == net.time4j.format.m.STANDALONE) {
                net.time4j.format.v vVar2 = net.time4j.format.v.ABBREVIATED;
                return vVar == vVar2 ? k(map, vVar, net.time4j.format.m.FORMAT, str) : k(map, vVar2, mVar, str);
            }
            net.time4j.format.v vVar3 = net.time4j.format.v.ABBREVIATED;
            if (vVar != vVar3) {
                return k(map, vVar3, mVar, str);
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n(h0 h0Var) {
        int iIntValue = ((Integer) h0Var.s(h0.f94533x)).intValue();
        if (iIntValue == 0 || iIntValue == 1440) {
            return "midnight";
        }
        if (iIntValue < 720) {
            return "am";
        }
        return iIntValue == 720 ? "noon" : "pm";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        return this.f94670a != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> q(Locale locale, String str) {
        Map<String, String> mapM = net.time4j.format.b.c(str, locale).m();
        return (str.equals("iso8601") || "true".equals(mapM.get("hasDayPeriods"))) ? mapM : net.time4j.format.b.d(locale).m();
    }

    static l r(Locale locale, String str) {
        String language = locale.getLanguage();
        if (language.equals("nn")) {
            locale = new Locale("nb");
        }
        Map<String, String> mapQ = q(locale, str);
        TreeMap treeMap = new TreeMap();
        for (String str2 : mapQ.keySet()) {
            if (a(str2)) {
                int i11 = Integer.parseInt(str2.substring(1, 3));
                int i12 = Integer.parseInt(str2.substring(3, 5));
                h0 h0VarE0 = h0.E0();
                if (i11 != 24) {
                    if (i11 < 0 || i11 >= 24 || i12 < 0 || i12 >= 60) {
                        throw new IllegalStateException("Invalid time key: " + str2);
                    }
                    h0VarE0 = h0VarE0.H((i11 * 60) + i12, h.MINUTES);
                } else if (i12 != 0) {
                    throw new IllegalStateException("Invalid time key: " + str2);
                }
                treeMap.put(h0VarE0, mapQ.get(str2));
            }
        }
        if (treeMap.isEmpty() || language.isEmpty()) {
            return f94668e;
        }
        Iterator it = treeMap.keySet().iterator();
        String str3 = "";
        while (it.hasNext()) {
            String str4 = (String) treeMap.get((h0) it.next());
            if (str4.equals(str3)) {
                it.remove();
            } else {
                str3 = str4;
            }
        }
        return new l(locale, str, treeMap);
    }

    public static l s(Map<h0, String> map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Label map is empty.");
        }
        TreeMap treeMap = new TreeMap(map);
        for (h0 h0Var : map.keySet()) {
            if (h0Var.c() == 24) {
                treeMap.put(h0.E0(), map.get(h0Var));
                treeMap.remove(h0Var);
            } else if (map.get(h0Var).isEmpty()) {
                throw new IllegalArgumentException("Map has empty label: " + map);
            }
        }
        return new l(null, "", treeMap);
    }

    private static String t(net.time4j.format.v vVar, net.time4j.format.m mVar) {
        char upperCase;
        int i11 = a.f94673a[vVar.ordinal()];
        if (i11 != 1) {
            upperCase = i11 != 2 ? 'a' : 'n';
        } else {
            upperCase = 'w';
        }
        if (mVar == net.time4j.format.m.STANDALONE) {
            upperCase = Character.toUpperCase(upperCase);
        }
        return "P(" + upperCase + ")_";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            Locale locale = this.f94670a;
            if (locale == null) {
                if (lVar.f94670a != null) {
                    return false;
                }
            } else if (!locale.equals(lVar.f94670a)) {
                return false;
            }
            if (this.f94672c.equals(lVar.f94672c) && this.f94671b.equals(lVar.f94671b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f94672c.hashCode();
    }

    public net.time4j.engine.s<net.time4j.engine.o, String> j(net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return new d(false, vVar, mVar);
    }

    public net.time4j.engine.s<net.time4j.engine.o, String> l(net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return new d(true, vVar, mVar);
    }

    public h0 m(h0 h0Var) {
        if (h0Var.c() == 24) {
            h0Var = h0.E0();
        }
        for (h0 h0Var2 : this.f94672c.keySet()) {
            if (h0Var.x0(h0Var2)) {
                return h0Var2;
            }
        }
        return this.f94672c.firstKey();
    }

    public h0 o(h0 h0Var) {
        if (h0Var.c() == 24) {
            h0Var = h0.E0();
        }
        h0 h0VarLastKey = this.f94672c.lastKey();
        for (h0 h0Var2 : this.f94672c.keySet()) {
            if (h0Var.B0(h0Var2)) {
                return h0Var2;
            }
            if (h0Var.x0(h0Var2)) {
                break;
            }
            h0VarLastKey = h0Var2;
        }
        return h0VarLastKey;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayPeriod[");
        if (p()) {
            sb2.append("locale=");
            sb2.append(this.f94670a);
            sb2.append(CoreConstants.COMMA_CHAR);
            if (!this.f94671b.equals("iso8601")) {
                sb2.append(",calendar-type=");
                sb2.append(this.f94671b);
                sb2.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb2.append(this.f94672c);
        sb2.append(']');
        return sb2.toString();
    }
}
