package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.time4j.engine.ChronoException;
import net.time4j.x;

/* JADX INFO: loaded from: classes9.dex */
public final class o<U extends x> extends net.time4j.engine.a<U> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char f94684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o f94685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a<f> f94686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a<f> f94687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a<f> f94688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a<f> f94689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a<h> f94690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a<h> f94691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Comparator<net.time4j.engine.j0.a<? extends net.time4j.engine.v>> f94692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static net.time4j.engine.c0<x> f94693l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static net.time4j.engine.c0<f> f94694m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static net.time4j.engine.c0<h> f94695n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final net.time4j.engine.h0<f, o<f>> f94696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final net.time4j.engine.h0<h, o<h>> f94697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final net.time4j.engine.h0<v, o<v>> f94698q;
    private static final long serialVersionUID = -6321211763598951499L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient List<net.time4j.engine.j0.a<U>> f94699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient boolean f94700b;

    public static final class a<U extends x> extends net.time4j.format.w<U, o<U>> {
        private a(Class<U> cls, String str) {
            super(cls, str);
        }

        public static <U extends x> a<U> k(Class<U> cls, String str) {
            return new a<>(cls, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.format.w
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public U f(char c11) {
            if (c11 == 'I') {
                return f.MILLENNIA;
            }
            if (c11 == 'M') {
                return f.MONTHS;
            }
            if (c11 == 'Q') {
                return f.QUARTERS;
            }
            if (c11 == 'W') {
                return f.WEEKS;
            }
            if (c11 == 'Y') {
                return f.YEARS;
            }
            if (c11 == 'f') {
                return h.NANOS;
            }
            if (c11 == 'h') {
                return h.HOURS;
            }
            if (c11 == 'm') {
                return h.MINUTES;
            }
            if (c11 == 's') {
                return h.SECONDS;
            }
            switch (c11) {
                case 'C':
                    return f.CENTURIES;
                case 'D':
                    return f.DAYS;
                case 'E':
                    return f.DECADES;
                default:
                    throw new IllegalArgumentException("Unsupported pattern symbol: " + c11);
            }
        }
    }

    private static class b<U extends x> extends net.time4j.engine.b<U, o<U>> {
        /* synthetic */ b(x[] xVarArr, n nVar) {
            this(xVarArr);
        }

        private b(U... uArr) {
            super(uArr.length > 1, uArr);
        }
    }

    static {
        f94684c = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? CoreConstants.DOT : CoreConstants.COMMA_CHAR;
        f94685d = new o();
        f94686e = d(true, false);
        f94687f = d(true, true);
        f94688g = d(false, false);
        f94689h = d(false, true);
        f94690i = e(true);
        f94691j = e(false);
        f94692k = o0.a();
        f94693l = o0.j();
        f94694m = o0.f();
        f94695n = o0.h();
        f fVar = f.YEARS;
        f fVar2 = f.MONTHS;
        f fVar3 = f.DAYS;
        f94696o = f(fVar, fVar2, fVar3);
        f94697p = f(h.HOURS, h.MINUTES, h.SECONDS, h.NANOS);
        f94698q = f(f.weekBasedYears(), f.WEEKS, fVar3);
    }

    o(List<net.time4j.engine.j0.a<U>> list, boolean z11) {
        boolean zIsEmpty = list.isEmpty();
        if (zIsEmpty) {
            this.f94699a = Collections.EMPTY_LIST;
        } else {
            Collections.sort(list, f94692k);
            this.f94699a = Collections.unmodifiableList(list);
        }
        this.f94700b = !zIsEmpty && z11;
    }

    private int c() {
        return a().size();
    }

    private static a<f> d(boolean z11, boolean z12) {
        String str;
        if (z11) {
            str = z12 ? "YYYY-DDD" : "YYYY-MM-DD";
        } else {
            str = z12 ? "YYYYDDD" : "YYYYMMDD";
        }
        return a.k(f.class, str);
    }

    private static a<h> e(boolean z11) {
        return a.k(h.class, z11 ? "hh[:mm[:ss[,fffffffff]]]" : "hh[mm[ss[,fffffffff]]]");
    }

    public static <U extends x> net.time4j.engine.h0<U, o<U>> f(U... uArr) {
        return new b(uArr, null);
    }

    private boolean g(x xVar) {
        char symbol = xVar.getSymbol();
        return symbol >= '1' && symbol <= '9';
    }

    public static <U extends x> o<U> h() {
        return f94685d;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:83:0x015c  */
    private String i(int i11) {
        boolean z11;
        if (i11 == 1 && isNegative()) {
            throw new ChronoException("Negative sign not allowed in ISO-8601.");
        }
        if (isEmpty()) {
            return "PT0S";
        }
        boolean z12 = i11 == 2;
        StringBuilder sb2 = new StringBuilder();
        if (isNegative()) {
            sb2.append(CoreConstants.DASH_CHAR);
        }
        sb2.append('P');
        int iC = c();
        long jI = 0;
        int i12 = 0;
        long j11 = 0;
        boolean z13 = false;
        long j12 = 0;
        boolean z14 = false;
        while (i12 < iC) {
            net.time4j.engine.j0.a<U> aVar = a().get(i12);
            U uB = aVar.b();
            if (!z13 && !uB.isCalendrical()) {
                sb2.append('T');
                z13 = true;
            }
            boolean z15 = z12;
            long jA = aVar.a();
            int i13 = i12;
            char symbol = uB.getSymbol();
            long j13 = j11;
            if (uB == w0.f94831a) {
                z14 = true;
            }
            if (symbol <= '0' || symbol > '9') {
                if (symbol == 'S') {
                    j12 = jA;
                } else if ((z15 || i11 == 1) && symbol != 'H') {
                    if (symbol == 'I') {
                        sb2.append(net.time4j.base.c.i(jA, 1000L));
                    } else if (symbol == 'M') {
                        sb2.append(jA);
                        if (symbol == 0) {
                            sb2.append(CoreConstants.CURLY_LEFT);
                            sb2.append(uB);
                            sb2.append(CoreConstants.CURLY_RIGHT);
                        } else {
                            sb2.append(symbol);
                        }
                    } else {
                        if (symbol == 'Q') {
                            sb2.append(net.time4j.base.c.i(jA, 3L));
                            symbol = 'M';
                        } else if (symbol == 'W') {
                            if (iC != 1) {
                                jI = net.time4j.base.c.i(jA, 7L);
                                if (!b(f.DAYS)) {
                                    sb2.append(jI);
                                    jI = 0;
                                }
                            } else if (z15) {
                                sb2.append(net.time4j.base.c.i(jA, 7L));
                            } else {
                                sb2.append(jA);
                            }
                            symbol = 'D';
                        } else if (symbol != 'Y') {
                            switch (symbol) {
                                case 'C':
                                    sb2.append(net.time4j.base.c.i(jA, 100L));
                                    break;
                                case 'D':
                                    if (jI != 0) {
                                        jA = net.time4j.base.c.f(jA, jI);
                                        jI = 0;
                                    }
                                    sb2.append(jA);
                                    break;
                                case 'E':
                                    sb2.append(net.time4j.base.c.i(jA, 10L));
                                    break;
                                default:
                                    throw new ChronoException("Special units cannot be output in " + (z15 ? "XML" : "ISO") + "-mode: " + i(0));
                            }
                        } else {
                            sb2.append(jA);
                        }
                        if (symbol == 0) {
                            sb2.append(CoreConstants.CURLY_LEFT);
                            sb2.append(uB);
                            sb2.append(CoreConstants.CURLY_RIGHT);
                        } else {
                            sb2.append(symbol);
                        }
                    }
                    symbol = 'Y';
                    if (symbol == 0) {
                        sb2.append(CoreConstants.CURLY_LEFT);
                        sb2.append(uB);
                        sb2.append(CoreConstants.CURLY_RIGHT);
                    } else {
                        sb2.append(symbol);
                    }
                } else {
                    sb2.append(jA);
                    if (symbol == 0) {
                        sb2.append(CoreConstants.CURLY_LEFT);
                        sb2.append(uB);
                        sb2.append(CoreConstants.CURLY_RIGHT);
                    } else {
                        sb2.append(symbol);
                    }
                }
                j11 = j13;
            } else {
                j11 = jA;
            }
            i12 = i13 + 1;
            z12 = z15;
        }
        boolean z16 = z12;
        long j14 = j11;
        if (j14 != 0) {
            sb2.append(net.time4j.base.c.f(j12, j14 / 1000000000));
            sb2.append(z16 ? CoreConstants.DOT : f94684c);
            String strValueOf = String.valueOf(j14 % 1000000000);
            int length = 9 - strValueOf.length();
            for (int i14 = 0; i14 < length; i14++) {
                sb2.append('0');
            }
            sb2.append(strValueOf);
            sb2.append('S');
        } else if (j12 != 0) {
            sb2.append(j12);
            sb2.append('S');
        }
        if (z14) {
            boolean z17 = !z13;
            if (z13) {
                z11 = z17;
            } else {
                int iC2 = c();
                int i15 = 0;
                while (true) {
                    if (i15 >= iC2) {
                        z11 = z17;
                    } else {
                        U uB2 = a().get(i15).b();
                        if (uB2 == w0.f94831a || uB2 == f.WEEKS || uB2 == f.DAYS) {
                            i15++;
                        } else {
                            z11 = false;
                        }
                    }
                }
            }
            if (!z11) {
                int iIndexOf = sb2.indexOf("Y");
                sb2.replace(iIndexOf, iIndexOf + 1, "{WEEK_BASED_YEARS}");
            }
        }
        return sb2.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 6);
    }

    @Override // net.time4j.engine.j0
    public List<net.time4j.engine.j0.a<U>> a() {
        return this.f94699a;
    }

    public boolean b(x xVar) {
        if (xVar == null) {
            return false;
        }
        boolean zG = g(xVar);
        int size = this.f94699a.size();
        for (int i11 = 0; i11 < size; i11++) {
            net.time4j.engine.j0.a<U> aVar = this.f94699a.get(i11);
            U uB = aVar.b();
            if (uB.equals(xVar) || (zG && g(uB))) {
                if (aVar.a() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) o.class.cast(obj);
            if (this.f94700b == oVar.f94700b && a().equals(oVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = a().hashCode();
        if (this.f94700b) {
            return 0;
        }
        return iHashCode;
    }

    @Override // net.time4j.engine.j0
    public boolean isNegative() {
        return this.f94700b;
    }

    public String toString() {
        return i(0);
    }

    private o() {
        this.f94699a = Collections.EMPTY_LIST;
        this.f94700b = false;
    }
}
