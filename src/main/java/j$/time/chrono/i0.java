package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends c {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient LocalDate f82014a;

    @Override // j$.time.chrono.ChronoLocalDate
    public final d F(LocalTime localTime) {
        return new f(this, localTime);
    }

    public i0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f82014a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final l getChronology() {
        return g0.f82011c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        g0.f82011c.getClass();
        return this.f82014a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final m H() {
        return J() >= 1 ? j0.BE : j0.BEFORE_BE;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.w(this);
        }
        if (!h(pVar)) {
            throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i11 = h0.f82013a[aVar.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return this.f82014a.j(pVar);
        }
        if (i11 != 4) {
            return g0.f82011c.u(aVar);
        }
        j$.time.temporal.t tVar = j$.time.temporal.a.YEAR.f82197b;
        return j$.time.temporal.t.f(1L, J() <= 0 ? (-(tVar.f82221a + 543)) + 1 : 543 + tVar.f82224d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i11 = h0.f82013a[((j$.time.temporal.a) pVar).ordinal()];
            if (i11 == 4) {
                int iJ = J();
                if (iJ < 1) {
                    iJ = 1 - iJ;
                }
                return iJ;
            }
            if (i11 == 5) {
                return ((((long) J()) * 12) + ((long) this.f82014a.getMonthValue())) - 1;
            }
            if (i11 == 6) {
                return J();
            }
            if (i11 != 7) {
                return this.f82014a.i(pVar);
            }
            return J() < 1 ? 0 : 1;
        }
        return pVar.J(this);
    }

    public final int J() {
        return this.f82014a.getYear() + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final i0 d(long j11, j$.time.temporal.p pVar) {
        int iA;
        int i11;
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (i(aVar) == j11) {
                return this;
            }
            int[] iArr = h0.f82013a;
            int i12 = iArr[aVar.ordinal()];
            if (i12 == 4) {
                iA = g0.f82011c.u(aVar).a(j11, aVar);
                i11 = iArr[aVar.ordinal()];
                if (i11 != 4) {
                    LocalDate localDate = this.f82014a;
                    if (J() < 1) {
                        iA = 1 - iA;
                    }
                    return R(localDate.c0(iA - 543));
                }
                if (i11 != 6) {
                    return R(this.f82014a.c0(iA - 543));
                }
                if (i11 == 7) {
                    return R(this.f82014a.c0((-542) - J()));
                }
            } else {
                if (i12 == 5) {
                    g0.f82011c.u(aVar).b(j11, aVar);
                    return R(this.f82014a.plusMonths(j11 - (((((long) J()) * 12) + ((long) this.f82014a.getMonthValue())) - 1)));
                }
                if (i12 == 6 || i12 == 7) {
                    iA = g0.f82011c.u(aVar).a(j11, aVar);
                    i11 = iArr[aVar.ordinal()];
                    if (i11 != 4) {
                        LocalDate localDate2 = this.f82014a;
                        if (J() < 1) {
                            iA = 1 - iA;
                        }
                        return R(localDate2.c0(iA - 543));
                    }
                    if (i11 != 6) {
                        return R(this.f82014a.c0(iA - 543));
                    }
                    if (i11 == 7) {
                        return R(this.f82014a.c0((-542) - J()));
                    }
                }
            }
            return R(this.f82014a.d(j11, pVar));
        }
        return (i0) super.d(j11, pVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        return (i0) super.k(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate k(j$.time.temporal.m mVar) {
        return (i0) super.k(mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate L(j$.time.temporal.o oVar) {
        return (i0) super.L(oVar);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate E(long j11) {
        return R(this.f82014a.Y(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate B(long j11) {
        return R(this.f82014a.plusMonths(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate w(long j11) {
        return R(this.f82014a.W(j11));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate g(long j11, j$.time.temporal.r rVar) {
        return (i0) super.g(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l g(long j11, j$.time.temporal.r rVar) {
        return (i0) super.g(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate a(long j11, j$.time.temporal.r rVar) {
        return (i0) super.a(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return (i0) super.a(j11, rVar);
    }

    public final i0 R(LocalDate localDate) {
        return localDate.equals(this.f82014a) ? this : new i0(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f82014a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return this.f82014a.equals(((i0) obj).f82014a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 8, this);
    }
}
