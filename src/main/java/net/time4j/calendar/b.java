package net.time4j.calendar;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import net.time4j.engine.w;
import net.time4j.engine.y;
import net.time4j.engine.z;
import net.time4j.x0;
import net.time4j.z0;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final net.time4j.engine.p<Integer> f94034a = m.f94067a;

    /* JADX INFO: renamed from: net.time4j.calendar.b$b, reason: collision with other inner class name */
    private static class C2007b<D extends net.time4j.engine.q<D>> implements y<D, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<?> f94035a;

        private net.time4j.engine.p<?> c(D d11, boolean z11) {
            f fVarG = f.G(d11.getClass(), ((d) this.f94035a).model);
            int iK = k(d11);
            z zVar = z.UTC;
            long jLongValue = ((Long) d11.s(zVar)).longValue();
            int iP = d11.p(((d) this.f94035a).dayElement);
            if (z11) {
                if (((Integer) d11.o(((d) this.f94035a).dayElement)).intValue() < ((long) iP) + (((Long) d11.B(fVarG, d11.o(fVarG)).s(zVar)).longValue() - jLongValue)) {
                    return ((d) this.f94035a).dayElement;
                }
            } else if (iK <= 1) {
                if (((Integer) d11.k(((d) this.f94035a).dayElement)).intValue() > ((long) iP) - (jLongValue - ((Long) d11.B(fVarG, d11.k(fVarG)).s(zVar)).longValue())) {
                    return ((d) this.f94035a).dayElement;
                }
            }
            return fVarG;
        }

        private int f(D d11) {
            return l(d11, 1);
        }

        private int h(D d11) {
            return l(d11, -1);
        }

        private int k(D d11) {
            return l(d11, 0);
        }

        private int l(D d11, int i11) {
            int iP = d11.p(((d) this.f94035a).dayElement);
            int value = b.c((((Long) d11.s(z.UTC)).longValue() - ((long) iP)) + 1).getValue(((d) this.f94035a).model);
            int i12 = value <= 8 - ((d) this.f94035a).model.g() ? 2 - value : 9 - value;
            if (i11 == -1) {
                iP = 1;
            } else if (i11 != 0) {
                if (i11 != 1) {
                    throw new AssertionError("Unexpected: " + i11);
                }
                iP = ((Integer) d11.o(((d) this.f94035a).dayElement)).intValue();
            }
            return net.time4j.base.c.a(iP - i12, 7) + 1;
        }

        private D n(D d11, int i11) {
            int iK = k(d11);
            if (i11 == iK) {
                return d11;
            }
            int i12 = (i11 - iK) * 7;
            z zVar = z.UTC;
            return (D) d11.A(zVar, ((Long) d11.s(zVar)).longValue() + ((long) i12));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
            return c(d11, true);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(D d11) {
            return c(d11, false);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(D d11) {
            return Integer.valueOf(f(d11));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(D d11) {
            return Integer.valueOf(h(d11));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getValue(D d11) {
            return Integer.valueOf(k(d11));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean isValid(D d11, Integer num) {
            int iIntValue;
            return num != null && (iIntValue = num.intValue()) >= h(d11) && iIntValue <= f(d11);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public D withValue(D d11, Integer num, boolean z11) {
            if (num != null && (z11 || isValid(d11, num))) {
                return (D) n(d11, num.intValue());
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + d11 + ")");
        }

        private C2007b(d<?> dVar) {
            this.f94035a = dVar;
        }
    }

    private static class c<D extends net.time4j.engine.q<D>> implements y<D, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<?> f94036a;

        private int c(D d11) {
            int iH;
            int iP = d11.p(((d) this.f94036a).dayElement);
            int iG = g(d11, 0);
            if (iG > iP) {
                iH = ((iP + h(d11, -1)) - g(d11, -1)) / 7;
            } else {
                if (g(d11, 1) + h(d11, 0) <= iP) {
                    return 1;
                }
                iH = (iP - iG) / 7;
            }
            return iH + 1;
        }

        private net.time4j.engine.p<?> d(Object obj) {
            return new f((Class) obj, ((d) this.f94036a).model);
        }

        private int g(D d11, int i11) {
            x0 x0VarM = m(d11, i11);
            z0 z0Var = ((d) this.f94036a).model;
            int value = x0VarM.getValue(z0Var);
            return value <= 8 - z0Var.g() ? 2 - value : 9 - value;
        }

        private int h(D d11, int i11) {
            int iP = d11.p(((d) this.f94036a).dayElement);
            if (i11 == -1) {
                net.time4j.engine.p pVar = ((d) this.f94036a).dayElement;
                z zVar = z.UTC;
                return b.d(pVar, d11.A(zVar, ((Long) d11.s(zVar)).longValue() - ((long) iP)));
            }
            if (i11 == 0) {
                return b.d(((d) this.f94036a).dayElement, d11);
            }
            if (i11 == 1) {
                int iD = b.d(((d) this.f94036a).dayElement, d11);
                net.time4j.engine.p pVar2 = ((d) this.f94036a).dayElement;
                z zVar2 = z.UTC;
                return b.d(pVar2, d11.A(zVar2, ((((Long) d11.s(zVar2)).longValue() + ((long) iD)) + 1) - ((long) iP)));
            }
            throw new AssertionError("Unexpected: " + i11);
        }

        private int i(D d11) {
            int iP = d11.p(((d) this.f94036a).dayElement);
            int iG = g(d11, 0);
            if (iG > iP) {
                return ((iG + h(d11, -1)) - g(d11, -1)) / 7;
            }
            int iG2 = g(d11, 1) + h(d11, 0);
            if (iG2 <= iP) {
                try {
                    int iG3 = g(d11, 1);
                    z zVar = z.UTC;
                    iG2 = g(d11.A(zVar, ((Long) d11.s(zVar)).longValue() + 7), 1) + h(d11, 1);
                    iG = iG3;
                } catch (RuntimeException unused) {
                    iG2 += 7;
                }
            }
            return (iG2 - iG) / 7;
        }

        private x0 m(D d11, int i11) {
            int iP = d11.p(((d) this.f94036a).dayElement);
            if (i11 == -1) {
                z zVar = z.UTC;
                long jLongValue = ((Long) d11.s(zVar)).longValue() - ((long) iP);
                return b.c((jLongValue - ((long) d11.A(zVar, jLongValue).p(((d) this.f94036a).dayElement))) + 1);
            }
            if (i11 == 0) {
                return b.c((((Long) d11.s(z.UTC)).longValue() - ((long) iP)) + 1);
            }
            if (i11 == 1) {
                return b.c(((((Long) d11.s(z.UTC)).longValue() + ((long) b.d(((d) this.f94036a).dayElement, d11))) + 1) - ((long) iP));
            }
            throw new AssertionError("Unexpected: " + i11);
        }

        private D o(D d11, int i11) {
            int iC = c(d11);
            if (i11 == iC) {
                return d11;
            }
            z zVar = z.UTC;
            return (D) d11.A(zVar, ((Long) d11.s(zVar)).longValue() + ((long) ((i11 - iC) * 7)));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
            return d(d11.getClass());
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(D d11) {
            return d(d11.getClass());
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(D d11) {
            return Integer.valueOf(i(d11));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(D d11) {
            return 1;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer getValue(D d11) {
            return Integer.valueOf(c(d11));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean isValid(D d11, Integer num) {
            int iIntValue;
            return num != null && (iIntValue = num.intValue()) >= 1 && iIntValue <= i(d11);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public D withValue(D d11, Integer num, boolean z11) {
            int iIntValue = num.intValue();
            if (z11 || isValid(d11, num)) {
                return (D) o(d11, iIntValue);
            }
            throw new IllegalArgumentException("Invalid value: " + iIntValue + " (context=" + d11 + ")");
        }

        private c(d<?> dVar) {
            this.f94036a = dVar;
        }
    }

    private static class d<T extends net.time4j.engine.q<T>> extends net.time4j.calendar.service.f<T> {
        private static final long serialVersionUID = -7471192143785466686L;
        private final boolean bounded;
        private final net.time4j.engine.p<Integer> dayElement;
        private final z0 model;

        d(String str, Class<T> cls, int i11, int i12, char c11, z0 z0Var, net.time4j.engine.p<Integer> pVar, boolean z11) {
            super(str, cls, i11, i12, c11);
            if (z0Var == null) {
                throw new NullPointerException("Missing week model.");
            }
            this.model = z0Var;
            this.dayElement = pVar;
            this.bounded = z11;
        }

        static <T extends net.time4j.engine.q<T>> d<T> t(String str, Class<T> cls, int i11, int i12, char c11, z0 z0Var, net.time4j.engine.p<Integer> pVar, boolean z11) {
            return new d<>(str, cls, i11, i12, c11, z0Var, pVar, z11);
        }

        @Override // net.time4j.engine.e
        protected <D extends net.time4j.engine.q<D>> y<D, Integer> f(w<D> wVar) {
            if (o().equals(wVar.p())) {
                return this.bounded ? new C2007b(this) : new c(this);
            }
            return null;
        }

        @Override // net.time4j.calendar.service.d, net.time4j.engine.e
        protected boolean h(net.time4j.engine.e<?> eVar) {
            if (super.h(eVar)) {
                d dVar = (d) d.class.cast(eVar);
                if (this.model.equals(dVar.model) && this.bounded == dVar.bounded) {
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public boolean isLenient() {
            return true;
        }

        @Override // net.time4j.calendar.service.d
        protected Object readResolve() {
            return this;
        }
    }

    private static class e<T extends net.time4j.engine.q<T>> implements y<T, x0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f<?> f94037a;

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(T t11) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public x0 getMaximum(T t11) {
            w wVarX = w.x(t11.getClass());
            long jA = t11 instanceof net.time4j.engine.l ? wVarX.o(((net.time4j.engine.l) net.time4j.engine.l.class.cast(t11)).q()).a() : wVarX.n().a();
            long jLongValue = ((Long) t11.s(z.UTC)).longValue();
            return (jLongValue + 7) - ((long) b.c(jLongValue).getValue(((f) this.f94037a).model)) > jA ? b.c(jA) : this.f94037a.getDefaultMaximum();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public x0 getMinimum(T t11) {
            w wVarX = w.x(t11.getClass());
            long jC = t11 instanceof net.time4j.engine.l ? wVarX.o(((net.time4j.engine.l) net.time4j.engine.l.class.cast(t11)).q()).c() : wVarX.n().c();
            long jLongValue = ((Long) t11.s(z.UTC)).longValue();
            return (jLongValue + 1) - ((long) b.c(jLongValue).getValue(((f) this.f94037a).model)) < jC ? b.c(jC) : this.f94037a.getDefaultMinimum();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public x0 getValue(T t11) {
            return b.c(((Long) t11.s(z.UTC)).longValue());
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(T t11, x0 x0Var) {
            if (x0Var == null) {
                return false;
            }
            try {
                withValue(t11, x0Var, false);
                return true;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public T withValue(T t11, x0 x0Var, boolean z11) {
            z zVar = z.UTC;
            long jLongValue = ((Long) t11.s(zVar)).longValue();
            x0 x0VarC = b.c(jLongValue);
            if (x0Var == x0VarC) {
                return t11;
            }
            return (T) t11.A(zVar, (jLongValue + ((long) x0Var.getValue(((f) this.f94037a).model))) - ((long) x0VarC.getValue(((f) this.f94037a).model)));
        }

        private e(f<?> fVar) {
            this.f94037a = fVar;
        }
    }

    private static class f<T extends net.time4j.engine.q<T>> extends net.time4j.calendar.service.e<x0, T> {
        private static final long serialVersionUID = 5613494586572932860L;
        private final z0 model;

        f(Class<T> cls, z0 z0Var) {
            super("LOCAL_DAY_OF_WEEK", cls, x0.class, 'e');
            this.model = z0Var;
        }

        static <T extends net.time4j.engine.q<T>> f<T> G(Class<T> cls, z0 z0Var) {
            return new f<>(cls, z0Var);
        }

        @Override // net.time4j.calendar.service.e
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public x0 s() {
            return this.model.f().roll(6);
        }

        @Override // net.time4j.calendar.service.e
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public x0 t() {
            return this.model.f();
        }

        @Override // net.time4j.calendar.service.e
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public int z(x0 x0Var) {
            return x0Var.getValue(this.model);
        }

        @Override // net.time4j.engine.e, java.util.Comparator
        /* JADX INFO: renamed from: c */
        public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
            int value = ((x0) oVar.s(this)).getValue(this.model);
            int value2 = ((x0) oVar2.s(this)).getValue(this.model);
            if (value < value2) {
                return -1;
            }
            return value == value2 ? 0 : 1;
        }

        @Override // net.time4j.engine.e
        protected <D extends net.time4j.engine.q<D>> y<D, x0> f(w<D> wVar) {
            if (o().equals(wVar.p())) {
                return new e(this);
            }
            return null;
        }

        @Override // net.time4j.calendar.service.d, net.time4j.engine.e
        protected boolean h(net.time4j.engine.e<?> eVar) {
            if (!super.h(eVar)) {
                return false;
            }
            return this.model.equals(((f) f.class.cast(eVar)).model);
        }

        @Override // net.time4j.calendar.service.d
        protected Object readResolve() {
            return this;
        }

        @Override // net.time4j.calendar.service.e
        protected boolean x() {
            return true;
        }
    }

    static class g implements net.time4j.engine.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<? extends net.time4j.engine.q> f94038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.p<Integer> f94039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final net.time4j.engine.p<Integer> f94040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final z0 f94041d;

        g(Class<? extends net.time4j.engine.q> cls, net.time4j.engine.p<Integer> pVar, net.time4j.engine.p<Integer> pVar2, z0 z0Var) {
            this.f94038a = cls;
            this.f94039b = pVar;
            this.f94040c = pVar2;
            this.f94041d = z0Var;
        }

        @Override // net.time4j.engine.r
        public net.time4j.engine.q<?> a(net.time4j.engine.q<?> qVar, Locale locale, net.time4j.engine.d dVar) {
            return qVar;
        }

        @Override // net.time4j.engine.r
        public Set<net.time4j.engine.p<?>> b(Locale locale, net.time4j.engine.d dVar) {
            z0 z0VarJ = locale.getCountry().isEmpty() ? this.f94041d : z0.j(locale);
            HashSet hashSet = new HashSet();
            hashSet.add(f.G(this.f94038a, z0VarJ));
            hashSet.add(d.t("WEEK_OF_MONTH", this.f94038a, 1, 5, 'W', z0VarJ, this.f94039b, false));
            hashSet.add(d.t("WEEK_OF_YEAR", this.f94038a, 1, 52, 'w', z0VarJ, this.f94040c, false));
            hashSet.add(d.t("BOUNDED_WEEK_OF_MONTH", this.f94038a, 1, 5, (char) 0, z0VarJ, this.f94039b, true));
            hashSet.add(d.t("BOUNDED_WEEK_OF_YEAR", this.f94038a, 1, 52, (char) 0, z0VarJ, this.f94040c, true));
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // net.time4j.engine.r
        public boolean c(Class<?> cls) {
            return this.f94038a.equals(cls);
        }

        @Override // net.time4j.engine.r
        public boolean d(net.time4j.engine.p<?> pVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x0 c(long j11) {
        return x0.valueOf(net.time4j.base.c.d(j11 + 5, 7) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <D extends net.time4j.engine.q<D>> int d(net.time4j.engine.p<?> pVar, D d11) {
        return ((Integer) Integer.class.cast(d11.o(pVar))).intValue();
    }
}
