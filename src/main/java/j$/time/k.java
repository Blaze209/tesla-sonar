package j$.time;

import ch.qos.logback.core.CoreConstants;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements TemporalAccessor, j$.time.temporal.m, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f82167c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82169b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        int i11 = this.f82168a - kVar.f82168a;
        return i11 == 0 ? this.f82169b - kVar.f82169b : i11;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e("--");
        dateTimeFormatterBuilder.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.d(CoreConstants.DASH_CHAR);
        dateTimeFormatterBuilder.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    public k(int i11, int i12) {
        this.f82168a = i11;
        this.f82169b = i12;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.DAY_OF_MONTH;
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        int i11;
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.E();
        }
        if (pVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.j(pVar);
        }
        Month monthE = Month.E(this.f82168a);
        monthE.getClass();
        int i12 = i.f82165a[monthE.ordinal()];
        if (i12 != 1) {
            i11 = (i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5) ? 30 : 31;
        } else {
            i11 = 28;
        }
        return j$.time.temporal.t.g(1L, i11, Month.E(this.f82168a).B());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        return j(pVar).a(i(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        int i11;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.J(this);
        }
        int i12 = j.f82166a[((j$.time.temporal.a) pVar).ordinal()];
        if (i12 == 1) {
            i11 = this.f82169b;
        } else {
            if (i12 != 2) {
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
            }
            i11 = this.f82168a;
        }
        return i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82215b) {
            return j$.time.chrono.s.f82037c;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.l.n(lVar).equals(j$.time.chrono.s.f82037c)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.l lVarD = lVar.d(this.f82168a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return lVarD.d(Math.min(lVarD.j(aVar).f82224d, this.f82169b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f82168a == kVar.f82168a && this.f82169b == kVar.f82169b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f82168a << 6) + this.f82169b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f82168a < 10 ? WebrtcBuildVersion.maint_version : "");
        sb2.append(this.f82168a);
        sb2.append(this.f82169b < 10 ? "-0" : "-");
        sb2.append(this.f82169b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new o((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
