package net.time4j.calendar;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import net.time4j.calendar.f;
import net.time4j.engine.b0;
import net.time4j.engine.k0;
import net.time4j.engine.y;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f<U, D extends f<U, D>> extends net.time4j.engine.m<U, D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f94049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f94050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient h f94051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f94052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient long f94053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f94054f;

    private static class b<D extends f<?, D>> implements y<D, net.time4j.calendar.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.p<?> f94055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f94056b;

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
            return this.f94055a;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(D d11) {
            return this.f94055a;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.c getMaximum(D d11) {
            return net.time4j.calendar.c.n(d11.T() == 94 ? 56 : 60);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.c getMinimum(D d11) {
            if (this.f94056b) {
                return d11.T() == 75 ? net.time4j.calendar.c.n(10) : net.time4j.calendar.c.n(1);
            }
            return d11.T() == 72 ? net.time4j.calendar.c.n(22) : net.time4j.calendar.c.n(1);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.c getValue(D d11) {
            return d11.e0();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(D d11, net.time4j.calendar.c cVar) {
            return cVar != null && getMinimum(d11).compareTo(cVar) <= 0 && getMaximum(d11).compareTo(cVar) >= 0;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public D withValue(D d11, net.time4j.calendar.c cVar, boolean z11) {
            if (!isValid(d11, cVar)) {
                throw new IllegalArgumentException("Invalid cyclic year: " + cVar);
            }
            net.time4j.calendar.d<D> dVarS = d11.S();
            int iF = d11.f();
            h hVarZ = d11.Z();
            int number = cVar.getNumber();
            int iT = d11.T();
            if (hVarZ.c() && hVarZ.getNumber() != dVarS.f(iT, number)) {
                hVarZ = h.d(hVarZ.getNumber());
            }
            h hVar = hVarZ;
            if (iF <= 29) {
                return (D) dVarS.d(iT, number, hVar, iF, dVarS.s(iT, number, hVar, iF));
            }
            long jS = dVarS.s(iT, number, hVar, 1);
            int iMin = Math.min(iF, dVarS.b(jS).lengthOfMonth());
            return (D) dVarS.d(iT, number, hVar, iMin, (jS + ((long) iMin)) - 1);
        }

        private b(net.time4j.engine.p<?> pVar, boolean z11) {
            this.f94055a = pVar;
            this.f94056b = z11;
        }
    }

    private static class c<D extends f<?, D>> implements k0<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f94057a;

        c(int i11) {
            this.f94057a = i11;
        }

        private static <D extends f<?, D>> long e(D d11, D d12, int i11) {
            int iCompareTo;
            D d13;
            D d14;
            int iF;
            net.time4j.calendar.d<D> dVarS = d11.S();
            if (i11 == 0) {
                return e(d11, d12, 1) / 60;
            }
            if (i11 == 1) {
                int iT = (((d12.T() * 60) + d12.e0().getNumber()) - (d11.T() * 60)) - d11.e0().getNumber();
                if (iT > 0) {
                    int iCompareTo2 = d11.Z().compareTo(d12.Z());
                    if (iCompareTo2 > 0 || (iCompareTo2 == 0 && d11.f() > d12.f())) {
                        iT--;
                    }
                } else if (iT < 0 && ((iCompareTo = d11.Z().compareTo(d12.Z())) < 0 || (iCompareTo == 0 && d11.f() < d12.f()))) {
                    iT++;
                }
                return iT;
            }
            if (i11 != 2) {
                if (i11 == 3) {
                    return (d12.h() - d11.h()) / 7;
                }
                if (i11 == 4) {
                    return d12.h() - d11.h();
                }
                throw new UnsupportedOperationException();
            }
            boolean zM = d11.M(d12);
            if (zM) {
                d14 = d11;
                d13 = d12;
            } else {
                d13 = d11;
                d14 = d12;
            }
            int iT2 = d13.T();
            int number = d13.e0().getNumber();
            h hVarZ = d13.Z();
            int number2 = hVarZ.getNumber();
            boolean zC = hVarZ.c();
            int iF2 = dVarS.f(iT2, number);
            int i12 = 0;
            while (true) {
                if (iT2 == d14.T() && number == d14.e0().getNumber() && hVarZ.equals(d14.Z())) {
                    break;
                }
                if (zC) {
                    number2++;
                    zC = false;
                } else if (iF2 == number2) {
                    zC = true;
                } else {
                    number2++;
                }
                if (!zC) {
                    if (number2 == 13) {
                        number++;
                        if (number == 61) {
                            iT2++;
                            number = 1;
                        }
                        iF = dVarS.f(iT2, number);
                        number2 = 1;
                    } else if (number2 == 0) {
                        number--;
                        if (number == 0) {
                            iT2--;
                            number = 60;
                        }
                        iF = dVarS.f(iT2, number);
                        number2 = 12;
                    }
                    iF2 = iF;
                }
                hVarZ = h.d(number2);
                if (zC) {
                    hVarZ = hVarZ.e();
                }
                i12++;
            }
            if (i12 > 0 && d13.f() > d14.f()) {
                i12--;
            }
            if (zM) {
                i12 = -i12;
            }
            return i12;
        }

        private static void f(long j11) {
            if (j11 > 1200 || j11 < -1200) {
                throw new ArithmeticException("Month arithmetic limited to delta not greater than 1200.");
            }
        }

        private static <D extends f<?, D>> D g(int i11, int i12, h hVar, int i13, net.time4j.calendar.d<D> dVar) {
            if (i13 <= 29) {
                return (D) dVar.d(i11, i12, hVar, i13, dVar.s(i11, i12, hVar, i13));
            }
            long jS = dVar.s(i11, i12, hVar, 1);
            int iMin = Math.min(i13, dVar.b(jS).lengthOfMonth());
            return (D) dVar.d(i11, i12, hVar, iMin, (jS + ((long) iMin)) - 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [int] */
        /* JADX WARN: Type inference failed for: r14v10 */
        /* JADX WARN: Type inference failed for: r14v11 */
        /* JADX WARN: Type inference failed for: r14v12 */
        /* JADX WARN: Type inference failed for: r14v13 */
        /* JADX WARN: Type inference failed for: r14v14 */
        /* JADX WARN: Type inference failed for: r14v15 */
        /* JADX WARN: Type inference failed for: r14v16 */
        /* JADX WARN: Type inference failed for: r14v17 */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r14v5 */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r14v7 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v14 */
        /* JADX WARN: Type inference failed for: r5v3, types: [int] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v6, types: [int] */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference failed for: r5v9, types: [int] */
        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public D b(D d11, long j11) {
            boolean z11;
            int i11;
            ?? r14;
            ?? r15;
            long jI = j11;
            net.time4j.calendar.d<D> dVarS = d11.S();
            int iF = d11.f();
            int iT = d11.T();
            int number = d11.e0().getNumber();
            h hVarZ = d11.Z();
            int i12 = this.f94057a;
            boolean z12 = true;
            if (i12 == 0) {
                jI = net.time4j.base.c.i(jI, 60L);
            } else if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        jI = net.time4j.base.c.i(jI, 7L);
                    } else if (i12 != 4) {
                        throw new UnsupportedOperationException();
                    }
                    return (D) dVarS.b(net.time4j.base.c.f(d11.h(), jI));
                }
                f(jI);
                long j12 = 0;
                int i13 = jI > 0 ? 1 : -1;
                int number2 = hVarZ.getNumber();
                boolean zC = hVarZ.c();
                int iF2 = dVarS.f(iT, number);
                ?? r11 = number;
                ?? r16 = number2;
                while (jI != j12) {
                    if (zC) {
                        zC = false;
                        if (i13 == z12) {
                            r15 = r16;
                            r15 = r16 + 1;
                        }
                        r15 = r16;
                        z11 = z12;
                        r14 = r15;
                    } else if (i13 == z12 && iF2 == r16) {
                        zC = z12;
                        z11 = zC;
                    } else {
                        if (i13 == -1) {
                            z11 = z12;
                            if (iF2 == r16 - 1) {
                                i11 = r16 - 1;
                                zC = z11;
                            }
                        } else {
                            z11 = z12;
                        }
                        r14 = r16 + i13;
                    }
                    if (zC) {
                        r14 = i11;
                        r14 = r16;
                    } else {
                        r14 = i11;
                        r14 = r16;
                        if (r14 == 13) {
                            int i14 = r11 + 1;
                            if (i14 == 61) {
                                r11 = i14;
                                iT++;
                                r11 = z11;
                            }
                            r11 = i14;
                            iF2 = dVarS.f(iT, r11);
                            r14 = z11;
                        } else if (r14 == 0) {
                            int i15 = r11 - 1;
                            if (i15 == 0) {
                                r11 = i15;
                                iT--;
                                r11 = 60;
                            }
                            r11 = i15;
                            r14 = 12;
                            iF2 = dVarS.f(iT, r11);
                        }
                    }
                    jI -= (long) i13;
                    z12 = z11;
                    j12 = 0;
                    r11 = r11;
                    r16 = r14;
                }
                h hVarD = h.d(r16);
                if (zC) {
                    hVarD = hVarD.e();
                }
                return (D) g(iT, r11, hVarD, iF, dVarS);
            }
            long jF = net.time4j.base.c.f(((iT * 60) + number) - 1, jI);
            int iG = net.time4j.base.c.g(net.time4j.base.c.b(jF, 60));
            int iD = net.time4j.base.c.d(jF, 60) + 1;
            if (hVarZ.c() && dVarS.f(iG, iD) != hVarZ.getNumber()) {
                hVarZ = h.d(hVarZ.getNumber());
            }
            return (D) g(iG, iD, hVarZ, iF, dVarS);
        }

        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(D d11, D d12) {
            return e(d11, d12, this.f94057a);
        }
    }

    private static class d<D extends f<?, D>> implements b0<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.p<?> f94058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f94059b;

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
            return this.f94058a;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(D d11) {
            return this.f94058a;
        }

        @Override // net.time4j.engine.b0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int b(D d11) {
            int i11 = this.f94059b;
            if (i11 == 0) {
                return d11.f();
            }
            if (i11 == 1) {
                return d11.W();
            }
            if (i11 == 2) {
                int number = d11.Z().getNumber();
                int iY = d11.Y();
                return ((iY <= 0 || iY >= number) && !d11.Z().c()) ? number : number + 1;
            }
            if (i11 == 3) {
                return d11.T();
            }
            throw new UnsupportedOperationException("Unknown element index: " + this.f94059b);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(D d11) {
            int iLengthOfMonth;
            int i11 = this.f94059b;
            if (i11 == 0) {
                iLengthOfMonth = d11.lengthOfMonth();
            } else if (i11 == 1) {
                iLengthOfMonth = d11.lengthOfYear();
            } else if (i11 == 2) {
                iLengthOfMonth = d11.isLeapYear() ? 13 : 12;
            } else {
                if (i11 != 3) {
                    throw new UnsupportedOperationException("Unknown element index: " + this.f94059b);
                }
                net.time4j.calendar.d<D> dVarS = d11.S();
                iLengthOfMonth = dVarS.b(dVarS.a()).T();
            }
            return Integer.valueOf(iLengthOfMonth);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(D d11) {
            if (this.f94059b != 3) {
                return 1;
            }
            net.time4j.calendar.d<D> dVarS = d11.S();
            return Integer.valueOf(dVarS.b(dVarS.c()).T());
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(D d11) {
            return Integer.valueOf(b(d11));
        }

        public boolean i(D d11, int i11) {
            if (i11 < 1) {
                return false;
            }
            int i12 = this.f94059b;
            if (i12 == 0) {
                if (i11 > 30) {
                    return false;
                }
                return i11 != 30 || d11.lengthOfMonth() == 30;
            }
            if (i12 == 1) {
                return i11 <= d11.lengthOfYear();
            }
            if (i12 == 2) {
                return i11 <= 12 || (i11 == 13 && d11.Y() > 0);
            }
            if (i12 == 3) {
                net.time4j.calendar.d<D> dVarS = d11.S();
                return i11 >= dVarS.b(dVarS.c()).T() && i11 <= dVarS.b(dVarS.a()).T();
            }
            throw new UnsupportedOperationException("Unknown element index: " + this.f94059b);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean isValid(D d11, Integer num) {
            return num != null && i(d11, num.intValue());
        }

        @Override // net.time4j.engine.b0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public D a(D d11, int i11, boolean z11) {
            int i12 = this.f94059b;
            if (i12 == 0) {
                if (z11) {
                    return (D) d11.S().b((d11.h() + ((long) i11)) - ((long) d11.f()));
                }
                if (i11 >= 1 && i11 <= 30 && (i11 != 30 || d11.lengthOfMonth() >= 30)) {
                    return (D) d11.S().d(d11.T(), d11.e0().getNumber(), d11.Z(), i11, (d11.h() + ((long) i11)) - ((long) d11.f()));
                }
                throw new IllegalArgumentException("Day of month out of range: " + i11);
            }
            if (i12 == 1) {
                if (z11 || (i11 >= 1 && i11 <= d11.lengthOfYear())) {
                    return (D) d11.S().b((d11.h() + ((long) i11)) - ((long) d11.W()));
                }
                throw new IllegalArgumentException("Day of year out of range: " + i11);
            }
            boolean z12 = false;
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new UnsupportedOperationException("Unknown element index: " + this.f94059b);
                }
                if (i(d11, i11)) {
                    return (D) f.d0(0).b(d11, i11 - d11.T());
                }
                throw new IllegalArgumentException("Sexagesimal cycle out of range: " + i11);
            }
            if (!i(d11, i11)) {
                throw new IllegalArgumentException("Ordinal month out of range: " + i11);
            }
            int iY = d11.Y();
            if (iY > 0 && iY < i11) {
                boolean z13 = i11 == iY + 1;
                i11--;
                z12 = z13;
            }
            h hVarD = h.d(i11);
            if (z12) {
                hVarD = hVarD.e();
            }
            return (D) e.i(d11, hVarD);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public D withValue(D d11, Integer num, boolean z11) {
            if (num != null) {
                return (D) a(d11, num.intValue(), z11);
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        private d(int i11, net.time4j.engine.p<?> pVar) {
            this.f94059b = i11;
            this.f94058a = pVar;
        }
    }

    private static class e<D extends f<?, D>> implements y<D, h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.p<?> f94060a;

        static <D extends f<?, D>> D i(D d11, h hVar) {
            net.time4j.calendar.d<D> dVarS = d11.S();
            int iF = d11.f();
            int number = d11.e0().getNumber();
            if (iF <= 29) {
                return (D) dVarS.d(d11.T(), number, hVar, iF, dVarS.s(d11.T(), number, hVar, iF));
            }
            long jS = dVarS.s(d11.T(), number, hVar, 1);
            int iMin = Math.min(iF, dVarS.b(jS).lengthOfMonth());
            return (D) dVarS.d(d11.T(), number, hVar, iMin, (jS + ((long) iMin)) - 1);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
            return this.f94060a;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(D d11) {
            return this.f94060a;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public h getMaximum(D d11) {
            return h.d(12);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public h getMinimum(D d11) {
            return h.d(1);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public h getValue(D d11) {
            return d11.Z();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(D d11, h hVar) {
            if (hVar != null) {
                return !hVar.c() || hVar.getNumber() == d11.Y();
            }
            return false;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public D withValue(D d11, h hVar, boolean z11) {
            if (isValid(d11, hVar)) {
                return (D) i(d11, hVar);
            }
            throw new IllegalArgumentException("Invalid month: " + hVar);
        }

        private e(net.time4j.engine.p<?> pVar) {
            this.f94060a = pVar;
        }
    }

    f(int i11, int i12, h hVar, int i13, long j11) {
        this.f94049a = i11;
        this.f94050b = i12;
        this.f94051c = hVar;
        this.f94052d = i13;
        this.f94053e = j11;
        this.f94054f = S().f(i11, i12);
    }

    static <D extends f<?, D>> y<D, Integer> U(net.time4j.engine.p<?> pVar) {
        return new d(3, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <D extends f<?, D>> y<D, Integer> V() {
        return new d(0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <D extends f<?, D>> y<D, Integer> X() {
        return new d(1, null);
    }

    static <D extends f<?, D>> y<D, Integer> a0(net.time4j.engine.p<?> pVar) {
        return new d(2, pVar);
    }

    static <D extends f<?, D>> y<D, h> b0(net.time4j.engine.p<?> pVar) {
        return new e(pVar);
    }

    static <D extends f<?, D>> k0<D> d0(int i11) {
        return new c(i11);
    }

    static <D extends f<?, D>> y<D, net.time4j.calendar.c> f0(net.time4j.engine.p<?> pVar) {
        return new b(pVar, false);
    }

    abstract net.time4j.calendar.d<D> S();

    int T() {
        return this.f94049a;
    }

    public int W() {
        return (int) ((this.f94053e - S().p(this.f94049a, this.f94050b)) + 1);
    }

    int Y() {
        return this.f94054f;
    }

    public h Z() {
        return this.f94051c;
    }

    public net.time4j.calendar.c e0() {
        return net.time4j.calendar.c.n(this.f94050b);
    }

    @Override // net.time4j.engine.m
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f94049a == fVar.f94049a && this.f94050b == fVar.f94050b && this.f94052d == fVar.f94052d && this.f94051c.equals(fVar.f94051c) && this.f94053e == fVar.f94053e) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f94052d;
    }

    @Override // net.time4j.engine.m, net.time4j.engine.g
    public long h() {
        return this.f94053e;
    }

    @Override // net.time4j.engine.m
    public int hashCode() {
        long j11 = this.f94053e;
        return (int) (j11 ^ (j11 >>> 32));
    }

    public boolean isLeapYear() {
        return this.f94054f > 0;
    }

    public int lengthOfMonth() {
        return (int) (((((long) this.f94052d) + S().o(this.f94053e + 1)) - this.f94053e) - 1);
    }

    public int lengthOfYear() {
        int i11 = this.f94049a;
        int i12 = 1;
        int i13 = this.f94050b + 1;
        if (i13 > 60) {
            i11++;
        } else {
            i12 = i13;
        }
        return (int) (S().p(i11, i12) - S().p(this.f94049a, this.f94050b));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strValue = ((net.time4j.format.c) getClass().getAnnotation(net.time4j.format.c.class)).value();
        if (strValue.equals("dangi")) {
            strValue = "korean";
        }
        sb2.append(strValue);
        sb2.append('[');
        sb2.append(e0().g(Locale.ROOT));
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb2.append(p(net.time4j.calendar.b.f94034a));
        sb2.append(")-");
        sb2.append(this.f94051c.toString());
        sb2.append(CoreConstants.DASH_CHAR);
        if (this.f94052d < 10) {
            sb2.append('0');
        }
        sb2.append(this.f94052d);
        sb2.append(']');
        return sb2.toString();
    }
}
