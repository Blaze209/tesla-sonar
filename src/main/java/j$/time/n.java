package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements j$.time.temporal.o, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f82174d = new n(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82177c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        b.c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static n a(int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f82174d;
        }
        return new n(i11, i12, i13);
    }

    public n(int i11, int i12, int i13) {
        this.f82175a = i11;
        this.f82176b = i12;
        this.f82177c = i13;
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l s(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDateG;
        j$.time.chrono.l lVar = (j$.time.chrono.l) chronoLocalDate.b(j$.time.temporal.q.f82215b);
        if (lVar == null || j$.time.chrono.s.f82037c.equals(lVar)) {
            int i11 = this.f82176b;
            if (i11 != 0) {
                long j11 = (((long) this.f82175a) * 12) + ((long) i11);
                if (j11 != 0) {
                    chronoLocalDateG = chronoLocalDate;
                    chronoLocalDateG = chronoLocalDate.g(j11, (j$.time.temporal.r) ChronoUnit.MONTHS);
                }
            } else {
                int i12 = this.f82175a;
                if (i12 != 0) {
                    chronoLocalDateG = chronoLocalDate;
                    chronoLocalDateG = chronoLocalDate.g(i12, (j$.time.temporal.r) ChronoUnit.YEARS);
                }
            }
            chronoLocalDateG = chronoLocalDate;
            chronoLocalDateG = chronoLocalDate;
            int i13 = this.f82177c;
            return i13 != 0 ? chronoLocalDateG.g(i13, (j$.time.temporal.r) ChronoUnit.DAYS) : chronoLocalDateG;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + lVar.m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f82175a == nVar.f82175a && this.f82176b == nVar.f82176b && this.f82177c == nVar.f82177c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f82177c, 16) + Integer.rotateLeft(this.f82176b, 8) + this.f82175a;
    }

    public final String toString() {
        if (this == f82174d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i11 = this.f82175a;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('Y');
        }
        int i12 = this.f82176b;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('M');
        }
        int i13 = this.f82177c;
        if (i13 != 0) {
            sb2.append(i13);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new o((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
