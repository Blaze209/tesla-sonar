package ko0;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import kotlinx.datetime.DateTimeArithmeticException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0011"}, d2 = {"Lko0/d;", "", "value", "Lko0/a$b;", "unit", "b", "(Lko0/d;ILko0/a$b;)Lko0/d;", "", "c", "(Lko0/d;JLko0/a$b;)Lko0/d;", "epochDay", "j$/time/LocalDate", "a", "(J)Lj$/time/LocalDate;", "J", "minEpochDay", "maxEpochDay", "kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f86442a = LocalDate.MIN.toEpochDay();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f86443b = LocalDate.MAX.toEpochDay();

    private static final LocalDate a(long j11) {
        long j12 = f86442a;
        if (j11 <= f86443b && j12 <= j11) {
            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(j11);
            s.j(localDateOfEpochDay, "ofEpochDay(...)");
            return localDateOfEpochDay;
        }
        throw new DateTimeException("The resulting day " + j11 + " is out of supported LocalDate range.");
    }

    public static final d b(d dVar, int i11, a.b unit) {
        s.k(dVar, "<this>");
        s.k(unit, "unit");
        return c(dVar, i11, unit);
    }

    public static final d c(d dVar, long j11, a.b unit) throws Exception {
        LocalDate localDatePlusMonths;
        s.k(dVar, "<this>");
        s.k(unit, "unit");
        try {
            if (unit instanceof a.c) {
                localDatePlusMonths = a(mo0.b.a(dVar.getValue().toEpochDay(), mo0.b.c(j11, ((a.c) unit).getDays())));
            } else {
                if (!(unit instanceof a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                localDatePlusMonths = dVar.getValue().plusMonths(mo0.b.c(j11, ((a.d) unit).getMonths()));
            }
            return new d(localDatePlusMonths);
        } catch (Exception e11) {
            if (!(e11 instanceof DateTimeException) && !(e11 instanceof ArithmeticException)) {
                throw e11;
            }
            throw new DateTimeArithmeticException("The result of adding " + j11 + " of " + unit + " to " + dVar + " is out of LocalDate range.", e11);
        }
    }
}
