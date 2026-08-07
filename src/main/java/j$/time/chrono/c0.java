package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends c {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient LocalDate f81998a;

    @Override // j$.time.chrono.ChronoLocalDate
    public final d F(LocalTime localTime) {
        return new f(this, localTime);
    }

    public c0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f81998a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final l getChronology() {
        return a0.f81995c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        a0.f81995c.getClass();
        return this.f81998a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final m H() {
        return J() >= 1 ? d0.ROC : d0.BEFORE_ROC;
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
        int i11 = b0.f81997a[aVar.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return this.f81998a.j(pVar);
        }
        if (i11 != 4) {
            return a0.f81995c.u(aVar);
        }
        j$.time.temporal.t tVar = j$.time.temporal.a.YEAR.f82197b;
        return j$.time.temporal.t.f(1L, J() <= 0 ? (-tVar.f82221a) + 1912 : tVar.f82224d - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i11 = b0.f81997a[((j$.time.temporal.a) pVar).ordinal()];
            if (i11 == 4) {
                int iJ = J();
                if (iJ < 1) {
                    iJ = 1 - iJ;
                }
                return iJ;
            }
            if (i11 == 5) {
                return ((((long) J()) * 12) + ((long) this.f81998a.getMonthValue())) - 1;
            }
            if (i11 == 6) {
                return J();
            }
            if (i11 != 7) {
                return this.f81998a.i(pVar);
            }
            return J() < 1 ? 0 : 1;
        }
        return pVar.J(this);
    }

    public final int J() {
        return this.f81998a.getYear() - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final c0 d(long j11, j$.time.temporal.p pVar) {
        int iA;
        int i11;
        int i12;
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (i(aVar) == j11) {
                return this;
            }
            int[] iArr = b0.f81997a;
            int i13 = iArr[aVar.ordinal()];
            if (i13 == 4) {
                iA = a0.f81995c.u(aVar).a(j11, aVar);
                i11 = iArr[aVar.ordinal()];
                if (i11 != 4) {
                    LocalDate localDate = this.f81998a;
                    if (J() >= 1) {
                        i12 = iA + 1911;
                    } else {
                        i12 = 1912 - iA;
                    }
                    return R(localDate.c0(i12));
                }
                if (i11 != 6) {
                    return R(this.f81998a.c0(iA + 1911));
                }
                if (i11 == 7) {
                    return R(this.f81998a.c0(1912 - J()));
                }
            } else {
                if (i13 == 5) {
                    a0.f81995c.u(aVar).b(j11, aVar);
                    return R(this.f81998a.plusMonths(j11 - (((((long) J()) * 12) + ((long) this.f81998a.getMonthValue())) - 1)));
                }
                if (i13 == 6 || i13 == 7) {
                    iA = a0.f81995c.u(aVar).a(j11, aVar);
                    i11 = iArr[aVar.ordinal()];
                    if (i11 != 4) {
                        LocalDate localDate2 = this.f81998a;
                        if (J() >= 1) {
                            i12 = iA + 1911;
                        } else {
                            i12 = 1912 - iA;
                        }
                        return R(localDate2.c0(i12));
                    }
                    if (i11 != 6) {
                        return R(this.f81998a.c0(iA + 1911));
                    }
                    if (i11 == 7) {
                        return R(this.f81998a.c0(1912 - J()));
                    }
                }
            }
            return R(this.f81998a.d(j11, pVar));
        }
        return (c0) super.d(j11, pVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        return (c0) super.k(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate k(j$.time.temporal.m mVar) {
        return (c0) super.k(mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate L(j$.time.temporal.o oVar) {
        return (c0) super.L(oVar);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate E(long j11) {
        return R(this.f81998a.Y(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate B(long j11) {
        return R(this.f81998a.plusMonths(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate w(long j11) {
        return R(this.f81998a.W(j11));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate g(long j11, j$.time.temporal.r rVar) {
        return (c0) super.g(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l g(long j11, j$.time.temporal.r rVar) {
        return (c0) super.g(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate a(long j11, j$.time.temporal.r rVar) {
        return (c0) super.a(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return (c0) super.a(j11, rVar);
    }

    public final c0 R(LocalDate localDate) {
        return localDate.equals(this.f81998a) ? this : new c0(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f81998a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f81998a.equals(((c0) obj).f81998a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 7, this);
    }
}
