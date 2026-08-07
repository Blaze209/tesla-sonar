package lo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0004\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!¨\u0006("}, d2 = {"Llo0/x;", "Llo0/n0;", "Lpo0/c;", "", "isNegative", "", "totalHoursAbs", "minutesOfHour", "secondsOfMinute", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lko0/i;", "b", "()Lko0/i;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "()Llo0/x;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "u", "()Ljava/lang/Integer;", "l", "(Ljava/lang/Integer;)V", "c", "v", "j", DateTokenConverter.CONVERTER_KEY, "p", "x", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x implements n0, po0.c<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Boolean isNegative;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer totalHoursAbs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Integer minutesOfHour;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Integer secondsOfMinute;

    public x() {
        this(null, null, null, null, 15, null);
    }

    @Override // po0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x copy() {
        return new x(getIsNegative(), getTotalHoursAbs(), getMinutesOfHour(), getSecondsOfMinute());
    }

    public final ko0.i b() {
        int i11 = p013kotlin.jvm.internal.s.f(getIsNegative(), Boolean.TRUE) ? -1 : 1;
        Integer totalHoursAbs = getTotalHoursAbs();
        Integer numValueOf = totalHoursAbs != null ? Integer.valueOf(totalHoursAbs.intValue() * i11) : null;
        Integer minutesOfHour = getMinutesOfHour();
        Integer numValueOf2 = minutesOfHour != null ? Integer.valueOf(minutesOfHour.intValue() * i11) : null;
        Integer secondsOfMinute = getSecondsOfMinute();
        return ko0.k.a(numValueOf, numValueOf2, secondsOfMinute != null ? Integer.valueOf(secondsOfMinute.intValue() * i11) : null);
    }

    public boolean equals(Object other) {
        if (!(other instanceof x)) {
            return false;
        }
        x xVar = (x) other;
        return p013kotlin.jvm.internal.s.f(getIsNegative(), xVar.getIsNegative()) && p013kotlin.jvm.internal.s.f(getTotalHoursAbs(), xVar.getTotalHoursAbs()) && p013kotlin.jvm.internal.s.f(getMinutesOfHour(), xVar.getMinutesOfHour()) && p013kotlin.jvm.internal.s.f(getSecondsOfMinute(), xVar.getSecondsOfMinute());
    }

    public int hashCode() {
        Boolean isNegative = getIsNegative();
        int iHashCode = isNegative != null ? isNegative.hashCode() : 0;
        Integer totalHoursAbs = getTotalHoursAbs();
        int iHashCode2 = iHashCode + (totalHoursAbs != null ? totalHoursAbs.hashCode() : 0);
        Integer minutesOfHour = getMinutesOfHour();
        int iHashCode3 = iHashCode2 + (minutesOfHour != null ? minutesOfHour.hashCode() : 0);
        Integer secondsOfMinute = getSecondsOfMinute();
        return iHashCode3 + (secondsOfMinute != null ? secondsOfMinute.hashCode() : 0);
    }

    @Override // lo0.n0
    public void i(Boolean bool) {
        this.isNegative = bool;
    }

    @Override // lo0.n0
    /* JADX INFO: renamed from: isNegative, reason: from getter */
    public Boolean getIsNegative() {
        return this.isNegative;
    }

    @Override // lo0.n0
    public void j(Integer num) {
        this.minutesOfHour = num;
    }

    @Override // lo0.n0
    public void l(Integer num) {
        this.totalHoursAbs = num;
    }

    @Override // lo0.n0
    /* JADX INFO: renamed from: p, reason: from getter */
    public Integer getSecondsOfMinute() {
        return this.secondsOfMinute;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        Boolean isNegative = getIsNegative();
        if (isNegative != null) {
            str = isNegative.booleanValue() ? "-" : Marker.ANY_NON_NULL_MARKER;
        } else {
            str = " ";
        }
        sb2.append(str);
        Object totalHoursAbs = getTotalHoursAbs();
        if (totalHoursAbs == null) {
            totalHoursAbs = "??";
        }
        sb2.append(totalHoursAbs);
        sb2.append(CoreConstants.COLON_CHAR);
        Object minutesOfHour = getMinutesOfHour();
        if (minutesOfHour == null) {
            minutesOfHour = "??";
        }
        sb2.append(minutesOfHour);
        sb2.append(CoreConstants.COLON_CHAR);
        Integer secondsOfMinute = getSecondsOfMinute();
        sb2.append(secondsOfMinute != null ? secondsOfMinute : "??");
        return sb2.toString();
    }

    @Override // lo0.n0
    /* JADX INFO: renamed from: u, reason: from getter */
    public Integer getTotalHoursAbs() {
        return this.totalHoursAbs;
    }

    @Override // lo0.n0
    /* JADX INFO: renamed from: v, reason: from getter */
    public Integer getMinutesOfHour() {
        return this.minutesOfHour;
    }

    @Override // lo0.n0
    public void x(Integer num) {
        this.secondsOfMinute = num;
    }

    public x(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.isNegative = bool;
        this.totalHoursAbs = num;
        this.minutesOfHour = num2;
        this.secondsOfMinute = num3;
    }

    public /* synthetic */ x(Boolean bool, Integer num, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : num3);
    }
}
