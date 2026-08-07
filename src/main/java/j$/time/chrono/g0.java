package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f82011c = new g0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.l
    public final m x(int i11) {
        if (i11 == 0) {
            return j0.BEFORE_BE;
        }
        if (i11 == 1) {
            return j0.BE;
        }
        throw new DateTimeException("Invalid era: " + i11);
    }

    @Override // j$.time.chrono.l
    public final String m() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate G() {
        return new i0(LocalDate.B(LocalDate.T(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.l
    public final String p() {
        return "buddhist";
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate K(int i11, int i12, int i13) {
        return new i0(LocalDate.of(i11 - 543, i12, i13));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate q(int i11, int i12) {
        return new i0(LocalDate.U(i11 - 543, i12));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate l(long j11) {
        return new i0(LocalDate.ofEpochDay(j11));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof i0) {
            return (i0) temporalAccessor;
        }
        return new i0(LocalDate.B(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final boolean Q(long j11) {
        return s.f82037c.Q(j11 - 543);
    }

    @Override // j$.time.chrono.l
    public final int y(m mVar, int i11) {
        if (mVar instanceof j0) {
            return mVar == j0.BE ? i11 : 1 - i11;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private g0() {
    }

    @Override // j$.time.chrono.l
    public final List v() {
        return j$.time.b.c(j0.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.t u(j$.time.temporal.a aVar) {
        int i11 = f0.f82005a[aVar.ordinal()];
        if (i11 == 1) {
            j$.time.temporal.t tVar = j$.time.temporal.a.PROLEPTIC_MONTH.f82197b;
            return j$.time.temporal.t.f(tVar.f82221a + 6516, tVar.f82224d + 6516);
        }
        if (i11 == 2) {
            j$.time.temporal.t tVar2 = j$.time.temporal.a.YEAR.f82197b;
            return j$.time.temporal.t.g(1L, (-(tVar2.f82221a + 543)) + 1, tVar2.f82224d + 543);
        }
        if (i11 != 3) {
            return aVar.f82197b;
        }
        j$.time.temporal.t tVar3 = j$.time.temporal.a.YEAR.f82197b;
        return j$.time.temporal.t.f(tVar3.f82221a + 543, tVar3.f82224d + 543);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final ChronoLocalDate M(Map map, j$.time.format.c0 c0Var) {
        return (i0) super.M(map, c0Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final i N(Instant instant, ZoneId zoneId) {
        return k.B(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
