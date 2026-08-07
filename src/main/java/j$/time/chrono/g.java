package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements j$.time.temporal.o, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f82006e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f82007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82010d;

    static {
        j$.time.b.c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public g(l lVar, int i11, int i12, int i13) {
        this.f82007a = lVar;
        this.f82008b = i11;
        this.f82009c = i12;
        this.f82010d = i13;
    }

    public final String toString() {
        if (this.f82008b == 0 && this.f82009c == 0 && this.f82010d == 0) {
            return this.f82007a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f82007a.toString());
        sb2.append(" P");
        int i11 = this.f82008b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('Y');
        }
        int i12 = this.f82009c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('M');
        }
        int i13 = this.f82010d;
        if (i13 != 0) {
            sb2.append(i13);
            sb2.append('D');
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l s(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDateG;
        j$.time.temporal.l lVarG;
        l lVar = (l) chronoLocalDate.b(j$.time.temporal.q.f82215b);
        if (lVar == null || this.f82007a.equals(lVar)) {
            if (this.f82009c != 0) {
                j$.time.temporal.t tVarU = this.f82007a.u(j$.time.temporal.a.MONTH_OF_YEAR);
                long j11 = (tVarU.f82221a == tVarU.f82222b && tVarU.f82223c == tVarU.f82224d && tVarU.d()) ? (tVarU.f82224d - tVarU.f82221a) + 1 : -1L;
                if (j11 > 0) {
                    lVarG = chronoLocalDate.g((((long) this.f82008b) * j11) + ((long) this.f82009c), (j$.time.temporal.r) ChronoUnit.MONTHS);
                } else {
                    int i11 = this.f82008b;
                    if (i11 != 0) {
                        chronoLocalDateG = chronoLocalDate;
                        chronoLocalDateG = chronoLocalDate.g(i11, (j$.time.temporal.r) ChronoUnit.YEARS);
                    }
                    chronoLocalDateG = chronoLocalDate;
                    lVarG = chronoLocalDateG.g(this.f82009c, (j$.time.temporal.r) ChronoUnit.MONTHS);
                }
            } else {
                int i12 = this.f82008b;
                if (i12 != 0) {
                    lVarG = chronoLocalDate;
                    lVarG = chronoLocalDate.g(i12, (j$.time.temporal.r) ChronoUnit.YEARS);
                }
            }
            lVarG = chronoLocalDate;
            int i13 = this.f82010d;
            return i13 != 0 ? lVarG.g(i13, ChronoUnit.DAYS) : lVarG;
        }
        throw new DateTimeException("Chronology mismatch, expected: " + this.f82007a.m() + ", actual: " + lVar.m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f82008b == gVar.f82008b && this.f82009c == gVar.f82009c && this.f82010d == gVar.f82010d && this.f82007a.equals(gVar.f82007a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f82010d, 16) + (Integer.rotateLeft(this.f82009c, 8) + this.f82008b)) ^ this.f82007a.hashCode();
    }

    public Object writeReplace() {
        return new e0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
