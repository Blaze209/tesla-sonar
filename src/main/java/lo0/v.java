package lo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.datetime.DateTimeFormatException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BC\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001e¨\u0006)"}, d2 = {"Llo0/v;", "Llo0/h;", "Lpo0/c;", "", "year", "monthNumber", "dayOfMonth", "isoDayOfWeek", "dayOfYear", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lko0/d;", "c", "()Lko0/d;", "a", "()Llo0/v;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "C", "(Ljava/lang/Integer;)V", "r", "y", "f", "q", DateTokenConverter.CONVERTER_KEY, "h", "s", "e", "B", "w", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v implements h, po0.c<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Integer year;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer monthNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Integer dayOfMonth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Integer isoDayOfWeek;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Integer dayOfYear;

    public v() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // lo0.h
    /* JADX INFO: renamed from: B, reason: from getter */
    public Integer getDayOfYear() {
        return this.dayOfYear;
    }

    @Override // lo0.h
    public void C(Integer num) {
        this.year = num;
    }

    @Override // po0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v copy() {
        return new v(getYear(), getMonthNumber(), getDayOfMonth(), getIsoDayOfWeek(), getDayOfYear());
    }

    @Override // lo0.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public Integer getYear() {
        return this.year;
    }

    public final ko0.d c() {
        ko0.d dVar;
        int iIntValue;
        int iIntValue2 = ((Number) z.d(getYear(), "year")).intValue();
        Integer dayOfYear = getDayOfYear();
        if (dayOfYear == null) {
            dVar = new ko0.d(iIntValue2, ((Number) z.d(getMonthNumber(), "monthNumber")).intValue(), ((Number) z.d(getDayOfMonth(), "dayOfMonth")).intValue());
        } else {
            ko0.d dVarB = ko0.e.b(new ko0.d(iIntValue2, 1, 1), dayOfYear.intValue() - 1, ko0.a.INSTANCE.a());
            if (dVarB.g() != iIntValue2) {
                throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + dayOfYear + ", which is not a valid day of year for the year " + iIntValue2);
            }
            if (getMonthNumber() != null) {
                int iE = dVarB.e();
                Integer monthNumber = getMonthNumber();
                if (monthNumber == null || iE != monthNumber.intValue()) {
                    throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + dayOfYear + ", which is " + dVarB.d() + ", but " + getMonthNumber() + " was specified as the month number");
                }
            }
            if (getDayOfMonth() != null) {
                int iB = dVarB.b();
                Integer dayOfMonth = getDayOfMonth();
                if (dayOfMonth == null || iB != dayOfMonth.intValue()) {
                    throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + dayOfYear + ", which is the day " + dVarB.b() + " of " + dVarB.d() + ", but " + getDayOfMonth() + " was specified as the day of month");
                }
            }
            dVar = dVarB;
        }
        Integer isoDayOfWeek = getIsoDayOfWeek();
        if (isoDayOfWeek == null || (iIntValue = isoDayOfWeek.intValue()) == ko0.b.b(dVar.c())) {
            return dVar;
        }
        throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of week is " + ko0.b.a(iIntValue) + " but the date is " + dVar + ", which is a " + dVar.c());
    }

    public boolean equals(Object other) {
        if (!(other instanceof v)) {
            return false;
        }
        v vVar = (v) other;
        return p013kotlin.jvm.internal.s.f(getYear(), vVar.getYear()) && p013kotlin.jvm.internal.s.f(getMonthNumber(), vVar.getMonthNumber()) && p013kotlin.jvm.internal.s.f(getDayOfMonth(), vVar.getDayOfMonth()) && p013kotlin.jvm.internal.s.f(getIsoDayOfWeek(), vVar.getIsoDayOfWeek()) && p013kotlin.jvm.internal.s.f(getDayOfYear(), vVar.getDayOfYear());
    }

    @Override // lo0.h
    /* JADX INFO: renamed from: f, reason: from getter */
    public Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    @Override // lo0.h
    /* JADX INFO: renamed from: h, reason: from getter */
    public Integer getIsoDayOfWeek() {
        return this.isoDayOfWeek;
    }

    public int hashCode() {
        Integer year = getYear();
        int iHashCode = (year != null ? year.hashCode() : 0) * 923521;
        Integer monthNumber = getMonthNumber();
        int iHashCode2 = iHashCode + ((monthNumber != null ? monthNumber.hashCode() : 0) * 29791);
        Integer dayOfMonth = getDayOfMonth();
        int iHashCode3 = iHashCode2 + ((dayOfMonth != null ? dayOfMonth.hashCode() : 0) * 961);
        Integer isoDayOfWeek = getIsoDayOfWeek();
        int iHashCode4 = iHashCode3 + ((isoDayOfWeek != null ? isoDayOfWeek.hashCode() : 0) * 31);
        Integer dayOfYear = getDayOfYear();
        return iHashCode4 + (dayOfYear != null ? dayOfYear.hashCode() : 0);
    }

    @Override // lo0.h
    public void q(Integer num) {
        this.dayOfMonth = num;
    }

    @Override // lo0.h
    /* JADX INFO: renamed from: r, reason: from getter */
    public Integer getMonthNumber() {
        return this.monthNumber;
    }

    @Override // lo0.h
    public void s(Integer num) {
        this.isoDayOfWeek = num;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Object year = getYear();
        if (year == null) {
            year = "??";
        }
        sb2.append(year);
        sb2.append(CoreConstants.DASH_CHAR);
        Object monthNumber = getMonthNumber();
        if (monthNumber == null) {
            monthNumber = "??";
        }
        sb2.append(monthNumber);
        sb2.append(CoreConstants.DASH_CHAR);
        Object dayOfMonth = getDayOfMonth();
        if (dayOfMonth == null) {
            dayOfMonth = "??";
        }
        sb2.append(dayOfMonth);
        sb2.append(" (day of week is ");
        Integer isoDayOfWeek = getIsoDayOfWeek();
        sb2.append(isoDayOfWeek != null ? isoDayOfWeek : "??");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    @Override // lo0.h
    public void w(Integer num) {
        this.dayOfYear = num;
    }

    @Override // lo0.h
    public void y(Integer num) {
        this.monthNumber = num;
    }

    public v(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.year = num;
        this.monthNumber = num2;
        this.dayOfMonth = num3;
        this.isoDayOfWeek = num4;
        this.dayOfYear = num5;
    }

    public /* synthetic */ v(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4, (i11 & 16) != 0 ? null : num5);
    }
}
