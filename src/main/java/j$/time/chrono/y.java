package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements m, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f82046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y[] f82047e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f82048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient LocalDate f82049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f82050c;

    static {
        y yVar = new y(-1, LocalDate.of(1868, 1, 1), "Meiji");
        f82046d = yVar;
        f82047e = new y[]{yVar, new y(0, LocalDate.of(1912, 7, 30), "Taisho"), new y(1, LocalDate.of(1926, 12, 25), "Showa"), new y(2, LocalDate.of(1989, 1, 8), "Heisei"), new y(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public final y m() {
        y[] yVarArr = f82047e;
        if (this == yVarArr[yVarArr.length - 1]) {
            return null;
        }
        return n(this.f82048a + 1);
    }

    public y(int i11, LocalDate localDate, String str) {
        this.f82048a = i11;
        this.f82049b = localDate;
        this.f82050c = str;
    }

    public static y n(int i11) {
        int i12 = i11 + 1;
        if (i12 >= 0) {
            y[] yVarArr = f82047e;
            if (i12 < yVarArr.length) {
                return yVarArr[i12];
            }
        }
        throw new DateTimeException("Invalid era: " + i11);
    }

    public static y l(LocalDate localDate) {
        if (localDate.P(x.f82042d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f82047e.length - 1; length >= 0; length--) {
            y yVar = f82047e[length];
            if (localDate.compareTo((ChronoLocalDate) yVar.f82049b) >= 0) {
                return yVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return this.f82048a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (pVar == aVar) {
            return v.f82040c.u(aVar);
        }
        return super.j(pVar);
    }

    public final String toString() {
        return this.f82050c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 5, this);
    }
}
