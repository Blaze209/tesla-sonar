package net.time4j.calendar;

import net.time4j.engine.b0;
import net.time4j.engine.g;
import net.time4j.engine.q;
import net.time4j.engine.u;
import net.time4j.engine.y;
import net.time4j.engine.z;
import net.time4j.x0;

/* JADX INFO: loaded from: classes9.dex */
final class r<T extends net.time4j.engine.q<T> & net.time4j.engine.g> extends net.time4j.calendar.service.f<T> implements l<T> {
    private static final long serialVersionUID = 4275169663905222176L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient net.time4j.engine.p<Integer> f94088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient net.time4j.engine.p<x0> f94089i;

    private static class a<T extends net.time4j.engine.q<T> & net.time4j.engine.g> implements b0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r<T> f94090a;

        a(r<T> rVar) {
            this.f94090a = rVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)I */
        private int f(net.time4j.engine.q qVar) {
            int iP = qVar.p(((r) this.f94090a).f94088h);
            while (true) {
                int i11 = iP + 7;
                if (i11 > ((Integer) qVar.o(((r) this.f94090a).f94088h)).intValue()) {
                    return net.time4j.base.c.a(iP - 1, 7) + 1;
                }
                iP = i11;
            }
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lnet/time4j/engine/p<*>; */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p getChildAtCeiling(net.time4j.engine.q qVar) {
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lnet/time4j/engine/p<*>; */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p getChildAtFloor(net.time4j.engine.q qVar) {
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)I */
        @Override // net.time4j.engine.b0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int b(net.time4j.engine.q qVar) {
            return net.time4j.base.c.a(qVar.p(((r) this.f94090a).f94088h) - 1, 7) + 1;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(net.time4j.engine.q qVar) {
            return Integer.valueOf(f(qVar));
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(net.time4j.engine.q qVar) {
            return 1;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getValue(net.time4j.engine.q qVar) {
            return Integer.valueOf(b(qVar));
        }

        /* JADX WARN: Incorrect types in method signature: (TT;I)Z */
        public boolean j(net.time4j.engine.q qVar, int i11) {
            return i11 >= 1 && i11 <= f(qVar);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Integer;)Z */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean isValid(net.time4j.engine.q qVar, Integer num) {
            return num != null && j(qVar, num.intValue());
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;IZ)TT; */
        @Override // net.time4j.engine.b0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q a(net.time4j.engine.q qVar, int i11, boolean z11) {
            if (j(qVar, i11)) {
                return qVar.C(this.f94090a.u(i11, (x0) qVar.s(((r) this.f94090a).f94089i)));
            }
            throw new IllegalArgumentException("Invalid value: " + i11);
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;Ljava/lang/Integer;Z)TT; */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q withValue(net.time4j.engine.q qVar, Integer num, boolean z11) {
            if (num != null) {
                return a(qVar, num.intValue(), z11);
            }
            throw new IllegalArgumentException("Missing value.");
        }
    }

    private static class b<T extends net.time4j.engine.q<T> & net.time4j.engine.g> implements u<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r<T> f94091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f94092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x0 f94093c;

        b(r<T> rVar, int i11, x0 x0Var) {
            if (x0Var == null) {
                throw new NullPointerException("Missing value.");
            }
            this.f94091a = rVar;
            this.f94092b = i11;
            this.f94093c = x0Var;
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;)TT; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q apply(net.time4j.engine.q qVar) {
            long jA;
            x0 x0Var = (x0) qVar.s(((r) this.f94091a).f94089i);
            int iP = qVar.p(((r) this.f94091a).f94088h);
            if (this.f94092b == 2147483647L) {
                int iIntValue = ((Integer) qVar.o(((r) this.f94091a).f94088h)).intValue() - iP;
                int value = x0Var.getValue() + (iIntValue % 7);
                if (value > 7) {
                    value -= 7;
                }
                int value2 = this.f94093c.getValue() - value;
                jA = iIntValue + value2;
                if (value2 > 0) {
                    jA -= 7;
                }
            } else {
                int value3 = this.f94093c.getValue() - x0Var.getValue();
                jA = ((this.f94092b - ((long) (net.time4j.base.c.a((iP + value3) - 1, 7) + 1))) * 7) + ((long) value3);
            }
            return qVar.A(z.UTC, ((net.time4j.engine.g) qVar).h() + jA);
        }
    }

    private static class c<T extends net.time4j.engine.q<T>> implements u<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f94094a;

        c(boolean z11) {
            this.f94094a = z11;
        }

        @Override // net.time4j.engine.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T apply(T t11) {
            z zVar = z.UTC;
            long jLongValue = ((Long) t11.s(zVar)).longValue();
            return (T) t11.A(zVar, this.f94094a ? jLongValue - 7 : jLongValue + 7);
        }
    }

    r(Class<T> cls, net.time4j.engine.p<Integer> pVar, net.time4j.engine.p<x0> pVar2) {
        super("WEEKDAY_IN_MONTH", cls, 1, pVar.getDefaultMaximum().intValue() / 7, 'F', new c(true), new c(false));
        this.f94088h = pVar;
        this.f94089i = pVar2;
    }

    static <T extends net.time4j.engine.q<T> & net.time4j.engine.g> y<T, Integer> t(r<T> rVar) {
        return new a(rVar);
    }

    public u<T> u(int i11, x0 x0Var) {
        return new b(this, i11, x0Var);
    }
}
