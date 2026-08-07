package net.time4j;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class z0 implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map<Locale, z0> f94845l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final z0 f94846m = new z0(x0.MONDAY, 4, x0.SATURDAY, x0.SUNDAY);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final net.time4j.format.y f94847n;
    private static final long serialVersionUID = 7794495882610436763L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient x0 f94848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f94849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient x0 f94850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient x0 f94851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient net.time4j.c<Integer, g0> f94852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient net.time4j.c<Integer, g0> f94853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient net.time4j.c<Integer, g0> f94854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient net.time4j.c<Integer, g0> f94855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient d0<x0> f94856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient Set<net.time4j.engine.p<?>> f94857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient net.time4j.engine.n<net.time4j.base.a> f94858k;

    class a implements net.time4j.engine.n<net.time4j.base.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0 f94859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x0 f94860b;

        a(x0 x0Var, x0 x0Var2) {
            this.f94859a = x0Var;
            this.f94860b = x0Var2;
        }

        @Override // net.time4j.engine.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(net.time4j.base.a aVar) {
            x0 x0VarValueOf = x0.valueOf(net.time4j.base.b.c(aVar.b(), aVar.r(), aVar.f()));
            return x0VarValueOf == this.f94859a || x0VarValueOf == this.f94860b;
        }
    }

    private static class b<T extends net.time4j.engine.q<T>> implements net.time4j.engine.y<T, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f94862a;

        /* synthetic */ b(d dVar, a aVar) {
            this(dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private net.time4j.engine.p<?> c(T t11, boolean z11) {
            g0 g0Var = (g0) t11.s(g0.f94487n);
            d0<x0> d0VarI = this.f94862a.t().i();
            int iIntValue = getValue(t11).intValue();
            if (z11) {
                if (iIntValue >= (this.f94862a.v() ? 52 : 4)) {
                    g0 g0Var2 = (g0) g0Var.B(d0VarI, t11.o(d0VarI));
                    if (this.f94862a.v()) {
                        if (g0Var2.B0() < g0Var.B0()) {
                            return g0.f94496w;
                        }
                    } else if (g0Var2.f() < g0Var.f()) {
                        return g0.f94494u;
                    }
                }
            } else if (iIntValue <= 1) {
                g0 g0Var3 = (g0) g0Var.B(d0VarI, t11.k(d0VarI));
                if (this.f94862a.v()) {
                    if (g0Var3.B0() > g0Var.B0()) {
                        return g0.f94496w;
                    }
                } else if (g0Var3.f() > g0Var.f()) {
                    return g0.f94494u;
                }
            }
            return d0VarI;
        }

        private int f(g0 g0Var) {
            if (this.f94862a.v()) {
                return net.time4j.base.b.e(g0Var.b()) ? 366 : 365;
            }
            return net.time4j.base.b.d(g0Var.b(), g0Var.r());
        }

        private int g(g0 g0Var) {
            return m(g0Var, 1);
        }

        private int i(g0 g0Var) {
            return m(g0Var, -1);
        }

        private int l(g0 g0Var) {
            return m(g0Var, 0);
        }

        private int m(g0 g0Var, int i11) {
            int iB0 = this.f94862a.v() ? g0Var.B0() : g0Var.f();
            int value = z0.c((g0Var.C0() - ((long) iB0)) + 1).getValue(this.f94862a.t());
            int i12 = value <= 8 - this.f94862a.t().g() ? 2 - value : 9 - value;
            if (i11 == -1) {
                iB0 = 1;
            } else if (i11 != 0) {
                if (i11 != 1) {
                    throw new AssertionError("Unexpected: " + i11);
                }
                iB0 = f(g0Var);
            }
            return net.time4j.base.c.a(iB0 - i12, 7) + 1;
        }

        private g0 o(g0 g0Var, int i11) {
            int iL = l(g0Var);
            if (i11 == iL) {
                return g0Var;
            }
            return g0Var.V0(g0Var.C0() + ((long) ((i11 - iL) * 7)));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
            return c(t11, true);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(T t11) {
            return c(t11, false);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(T t11) {
            return Integer.valueOf(g((g0) t11.s(g0.f94487n)));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(T t11) {
            return Integer.valueOf(i((g0) t11.s(g0.f94487n)));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getValue(T t11) {
            return Integer.valueOf(l((g0) t11.s(g0.f94487n)));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean isValid(T t11, Integer num) {
            if (num == null) {
                return false;
            }
            int iIntValue = num.intValue();
            g0 g0Var = (g0) t11.s(g0.f94487n);
            return iIntValue >= i(g0Var) && iIntValue <= g(g0Var);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public T withValue(T t11, Integer num, boolean z11) {
            net.time4j.engine.p<g0> pVar = g0.f94487n;
            g0 g0Var = (g0) t11.s(pVar);
            if (num != null && (z11 || isValid(t11, num))) {
                return (T) t11.B(pVar, o(g0Var, num.intValue()));
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + t11 + ")");
        }

        private b(d dVar) {
            this.f94862a = dVar;
        }
    }

    private static class c<T extends net.time4j.engine.q<T>> implements net.time4j.engine.y<T, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f94863a;

        /* synthetic */ c(d dVar, a aVar) {
            this(dVar);
        }

        private int c(g0 g0Var) {
            int iB0 = this.f94863a.v() ? g0Var.B0() : g0Var.f();
            int iG = g(g0Var, 0);
            if (iG > iB0) {
                return (((iB0 + h(g0Var, -1)) - g(g0Var, -1)) / 7) + 1;
            }
            int i11 = ((iB0 - iG) / 7) + 1;
            if ((i11 >= 53 || (!this.f94863a.v() && i11 >= 5)) && g(g0Var, 1) + h(g0Var, 0) <= iB0) {
                return 1;
            }
            return i11;
        }

        private net.time4j.engine.p<?> d() {
            return this.f94863a.t().i();
        }

        private int g(g0 g0Var, int i11) {
            x0 x0VarM = m(g0Var, i11);
            z0 z0VarT = this.f94863a.t();
            int value = x0VarM.getValue(z0VarT);
            return value <= 8 - z0VarT.g() ? 2 - value : 9 - value;
        }

        private int h(g0 g0Var, int i11) {
            if (this.f94863a.v()) {
                return net.time4j.base.b.e(g0Var.b() + i11) ? 366 : 365;
            }
            int iB = g0Var.b();
            int iR = g0Var.r() + i11;
            if (iR == 0) {
                iB--;
                iR = 12;
            } else if (iR == 13) {
                iB++;
                iR = 1;
            }
            return net.time4j.base.b.d(iB, iR);
        }

        private int i(g0 g0Var) {
            int iB0 = this.f94863a.v() ? g0Var.B0() : g0Var.f();
            int iG = g(g0Var, 0);
            if (iG > iB0) {
                return ((iG + h(g0Var, -1)) - g(g0Var, -1)) / 7;
            }
            int iG2 = g(g0Var, 1) + h(g0Var, 0);
            if (iG2 <= iB0) {
                try {
                    int iG3 = g(g0Var, 1);
                    iG2 = g(g0Var, 2) + h(g0Var, 1);
                    iG = iG3;
                } catch (RuntimeException unused) {
                    iG2 += 7;
                }
            }
            return (iG2 - iG) / 7;
        }

        private x0 m(g0 g0Var, int i11) {
            if (this.f94863a.v()) {
                return x0.valueOf(net.time4j.base.b.c(g0Var.b() + i11, 1, 1));
            }
            int iB = g0Var.b();
            int iR = g0Var.r() + i11;
            if (iR == 0) {
                iB--;
                iR = 12;
            } else if (iR == 13) {
                iB++;
                iR = 1;
            } else if (iR == 14) {
                iB++;
                iR = 2;
            }
            return x0.valueOf(net.time4j.base.b.c(iB, iR, 1));
        }

        private g0 o(g0 g0Var, int i11) {
            int iC = c(g0Var);
            if (i11 == iC) {
                return g0Var;
            }
            return g0Var.V0(g0Var.C0() + ((long) ((i11 - iC) * 7)));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
            return d();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(T t11) {
            return d();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(T t11) {
            return Integer.valueOf(i((g0) t11.s(g0.f94487n)));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(T t11) {
            return 1;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer getValue(T t11) {
            return Integer.valueOf(c((g0) t11.s(g0.f94487n)));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean isValid(T t11, Integer num) {
            if (num == null) {
                return false;
            }
            int iIntValue = num.intValue();
            if (this.f94863a.v() && iIntValue >= 1 && iIntValue <= 52) {
                return true;
            }
            if (!this.f94863a.v() || iIntValue == 53) {
                return iIntValue >= 1 && iIntValue <= i((g0) t11.s(g0.f94487n));
            }
            return false;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public T withValue(T t11, Integer num, boolean z11) {
            net.time4j.engine.p<g0> pVar = g0.f94487n;
            g0 g0Var = (g0) t11.s(pVar);
            if (num != null && (z11 || isValid(t11, num))) {
                return (T) t11.B(pVar, o(g0Var, num.intValue()));
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + t11 + ")");
        }

        private c(d dVar) {
            this.f94863a = dVar;
        }
    }

    private class d extends net.time4j.a<Integer> {
        private static final long serialVersionUID = -5936254509996557266L;
        private final int category;

        d(String str, int i11) {
            super(str);
            this.category = i11;
        }

        private Object readResolve() throws InvalidObjectException {
            z0 z0VarT = t();
            int i11 = this.category;
            if (i11 == 0) {
                return z0VarT.n();
            }
            if (i11 == 1) {
                return z0VarT.m();
            }
            if (i11 == 2) {
                return z0VarT.b();
            }
            if (i11 == 3) {
                return z0VarT.a();
            }
            throw new InvalidObjectException("Unknown category: " + this.category);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public z0 t() {
            return z0.this;
        }

        private boolean u() {
            return this.category >= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean v() {
            return this.category % 2 == 0;
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.q<T>> net.time4j.engine.y<T, Integer> f(net.time4j.engine.w<T> wVar) {
            a aVar = null;
            if (wVar.v(g0.f94487n)) {
                return u() ? new b(this, aVar) : new c(this, aVar);
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public char getSymbol() {
            int i11 = this.category;
            if (i11 == 0) {
                return 'w';
            }
            if (i11 != 1) {
                return super.getSymbol();
            }
            return 'W';
        }

        @Override // net.time4j.engine.p
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // net.time4j.engine.e
        protected boolean h(net.time4j.engine.e<?> eVar) {
            return t().equals(((d) eVar).t());
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public boolean isLenient() {
            return true;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.e
        protected net.time4j.engine.p<?> j() {
            return g0.f94498y;
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer s() {
            return Integer.valueOf(v() ? 52 : 5);
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Integer t() {
            return 1;
        }
    }

    private static class e<T extends net.time4j.engine.q<T>> implements net.time4j.engine.y<T, x0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f f94864a;

        /* synthetic */ e(f fVar, a aVar) {
            this(fVar);
        }

        private net.time4j.engine.p<?> c(T t11) {
            net.time4j.engine.p<h0> pVar = h0.f94524o;
            if (t11.n(pVar)) {
                return pVar;
            }
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
            return c(t11);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(T t11) {
            return c(t11);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public x0 getMaximum(T t11) {
            g0 g0Var = (g0) t11.s(g0.f94487n);
            return (g0Var.h() + 7) - ((long) g0Var.A0().getValue(this.f94864a.t())) > g0.q0().n().a() ? x0.FRIDAY : this.f94864a.getDefaultMaximum();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public x0 getMinimum(T t11) {
            g0 g0Var = (g0) t11.s(g0.f94487n);
            return (g0Var.h() + 1) - ((long) g0Var.A0().getValue(this.f94864a.t())) < g0.q0().n().c() ? x0.MONDAY : this.f94864a.getDefaultMinimum();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public x0 getValue(T t11) {
            return ((g0) t11.s(g0.f94487n)).A0();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean isValid(T t11, x0 x0Var) {
            if (x0Var == null) {
                return false;
            }
            try {
                withValue(t11, x0Var, false);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public T withValue(T t11, x0 x0Var, boolean z11) {
            if (x0Var == null) {
                throw new IllegalArgumentException("Missing weekday.");
            }
            net.time4j.engine.p<g0> pVar = g0.f94487n;
            g0 g0Var = (g0) t11.s(pVar);
            long jC0 = g0Var.C0();
            x0 x0VarC = z0.c(jC0);
            if (x0Var == x0VarC) {
                return t11;
            }
            return (T) t11.B(pVar, g0Var.V0((jC0 + ((long) x0Var.getValue(this.f94864a.t()))) - ((long) x0VarC.getValue(this.f94864a.t()))));
        }

        private e(f fVar) {
            this.f94864a = fVar;
        }
    }

    private class f extends net.time4j.a<x0> implements d0<x0>, net.time4j.format.l<x0>, net.time4j.format.t<x0> {
        private static final long serialVersionUID = 1945670789283677398L;

        f() {
            super("LOCAL_DAY_OF_WEEK");
        }

        private net.time4j.format.s q(net.time4j.engine.d dVar, net.time4j.format.m mVar) {
            return net.time4j.format.b.d((Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT)).p((net.time4j.format.v) dVar.b(net.time4j.format.a.f94176g, net.time4j.format.v.WIDE), mVar);
        }

        private Object readResolve() {
            return z0.this.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public z0 t() {
            return z0.this;
        }

        @Override // net.time4j.engine.e, java.util.Comparator
        /* JADX INFO: renamed from: c */
        public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
            int value = ((x0) oVar.s(this)).getValue(z0.this);
            int value2 = ((x0) oVar2.s(this)).getValue(z0.this);
            if (value < value2) {
                return -1;
            }
            return value == value2 ? 0 : 1;
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.q<T>> net.time4j.engine.y<T, x0> f(net.time4j.engine.w<T> wVar) {
            a aVar = null;
            if (wVar.v(g0.f94487n)) {
                return new e(this, aVar);
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public char getSymbol() {
            return 'e';
        }

        @Override // net.time4j.engine.p
        public Class<x0> getType() {
            return x0.class;
        }

        @Override // net.time4j.engine.e
        protected boolean h(net.time4j.engine.e<?> eVar) {
            return t().equals(((f) eVar).t());
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.e
        protected net.time4j.engine.p<?> j() {
            return g0.f94495v;
        }

        @Override // net.time4j.format.l
        public boolean k(net.time4j.engine.q<?> qVar, int i11) {
            for (x0 x0Var : x0.values()) {
                if (x0Var.getValue(z0.this) == i11) {
                    qVar.B(this, x0Var);
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.format.t
        public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
            appendable.append(q(dVar, (net.time4j.format.m) dVar.b(net.time4j.format.a.f94177h, net.time4j.format.m.FORMAT)).g((Enum) oVar.s(this)));
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public x0 s() {
            return z0.this.f().roll(6);
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public x0 t() {
            return z0.this.f();
        }

        public int u(x0 x0Var) {
            return x0Var.getValue(z0.this);
        }

        @Override // net.time4j.format.t
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public x0 parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            int index = parsePosition.getIndex();
            net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f94177h;
            net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
            net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
            x0 x0Var = (x0) q(dVar, mVar2).d(charSequence, parsePosition, getType(), dVar);
            if (x0Var != null || !((Boolean) dVar.b(net.time4j.format.a.f94180k, Boolean.TRUE)).booleanValue()) {
                return x0Var;
            }
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = net.time4j.format.m.STANDALONE;
            }
            return (x0) q(dVar, mVar).d(charSequence, parsePosition, getType(), dVar);
        }

        @Override // net.time4j.format.l
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public int d(x0 x0Var, net.time4j.engine.o oVar, net.time4j.engine.d dVar) {
            return u(x0Var);
        }
    }

    static {
        Iterator it = net.time4j.base.d.c().g(net.time4j.format.y.class).iterator();
        f94847n = it.hasNext() ? (net.time4j.format.y) it.next() : null;
    }

    private z0(x0 x0Var, int i11, x0 x0Var2, x0 x0Var3) {
        if (x0Var == null) {
            throw new NullPointerException("Missing first day of week.");
        }
        if (i11 < 1 || i11 > 7) {
            throw new IllegalArgumentException("Minimal days in first week out of range: " + i11);
        }
        if (x0Var2 == null) {
            throw new NullPointerException("Missing start of weekend.");
        }
        if (x0Var3 == null) {
            throw new NullPointerException("Missing end of weekend.");
        }
        this.f94848a = x0Var;
        this.f94849b = i11;
        this.f94850c = x0Var2;
        this.f94851d = x0Var3;
        d dVar = new d("WEEK_OF_YEAR", 0);
        this.f94852e = dVar;
        d dVar2 = new d("WEEK_OF_MONTH", 1);
        this.f94853f = dVar2;
        d dVar3 = new d("BOUNDED_WEEK_OF_YEAR", 2);
        this.f94854g = dVar3;
        d dVar4 = new d("BOUNDED_WEEK_OF_MONTH", 3);
        this.f94855h = dVar4;
        f fVar = new f();
        this.f94856i = fVar;
        this.f94858k = new a(x0Var2, x0Var3);
        HashSet hashSet = new HashSet();
        hashSet.add(dVar);
        hashSet.add(dVar2);
        hashSet.add(fVar);
        hashSet.add(dVar3);
        hashSet.add(dVar4);
        this.f94857j = Collections.unmodifiableSet(hashSet);
    }

    static x0 c(long j11) {
        return x0.valueOf(net.time4j.base.c.d(j11 + 5, 7) + 1);
    }

    public static z0 j(Locale locale) {
        if (locale.getCountry().isEmpty()) {
            return f94846m;
        }
        Map<Locale, z0> map = f94845l;
        z0 z0Var = map.get(locale);
        if (z0Var != null) {
            return z0Var;
        }
        net.time4j.format.y yVar = f94847n;
        if (yVar == null) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
            int firstDayOfWeek = gregorianCalendar.getFirstDayOfWeek();
            return k(x0.valueOf(firstDayOfWeek == 1 ? 7 : firstDayOfWeek - 1), gregorianCalendar.getMinimalDaysInFirstWeek());
        }
        z0 z0Var2 = new z0(x0.valueOf(yVar.d(locale)), yVar.c(locale), x0.valueOf(yVar.b(locale)), x0.valueOf(yVar.a(locale)));
        if (map.size() > 150) {
            map.clear();
        }
        map.put(locale, z0Var2);
        return z0Var2;
    }

    public static z0 k(x0 x0Var, int i11) {
        return l(x0Var, i11, x0.SATURDAY, x0.SUNDAY);
    }

    public static z0 l(x0 x0Var, int i11, x0 x0Var2, x0 x0Var3) {
        return (x0Var == x0.MONDAY && i11 == 4 && x0Var2 == x0.SATURDAY && x0Var3 == x0.SUNDAY) ? f94846m : new z0(x0Var, i11, x0Var2, x0Var3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    public net.time4j.c<Integer, g0> a() {
        return this.f94855h;
    }

    public net.time4j.c<Integer, g0> b() {
        return this.f94854g;
    }

    Set<net.time4j.engine.p<?>> d() {
        return this.f94857j;
    }

    public x0 e() {
        return this.f94851d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (this.f94848a == z0Var.f94848a && this.f94849b == z0Var.f94849b && this.f94850c == z0Var.f94850c && this.f94851d == z0Var.f94851d) {
                return true;
            }
        }
        return false;
    }

    public x0 f() {
        return this.f94848a;
    }

    public int g() {
        return this.f94849b;
    }

    public x0 h() {
        return this.f94850c;
    }

    public int hashCode() {
        return (this.f94848a.name().hashCode() * 17) + (this.f94849b * 37);
    }

    public d0<x0> i() {
        return this.f94856i;
    }

    public net.time4j.c<Integer, g0> m() {
        return this.f94853f;
    }

    public net.time4j.c<Integer, g0> n() {
        return this.f94852e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(z0.class.getName());
        sb2.append("[firstDayOfWeek=");
        sb2.append(this.f94848a);
        sb2.append(",minimalDaysInFirstWeek=");
        sb2.append(this.f94849b);
        sb2.append(",startOfWeekend=");
        sb2.append(this.f94850c);
        sb2.append(",endOfWeekend=");
        sb2.append(this.f94851d);
        sb2.append(']');
        return sb2.toString();
    }
}
