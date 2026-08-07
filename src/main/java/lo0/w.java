package lo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.datetime.DateTimeFormatException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BO\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b,\u0010!R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f\"\u0004\b-\u0010!¨\u0006."}, d2 = {"Llo0/w;", "Llo0/k0;", "Lpo0/c;", "", "hour", "hourOfAmPm", "Llo0/g;", "amPm", "minute", "second", "nanosecond", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Llo0/g;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lko0/g;", "f", "()Lko0/g;", "b", "()Llo0/w;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "D", "(Ljava/lang/Integer;)V", "g", "n", "Llo0/g;", "m", "()Llo0/g;", "t", "(Llo0/g;)V", DateTokenConverter.CONVERTER_KEY, "e", "z", "k", "o", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class w implements k0, po0.c<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Integer hour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer hourOfAmPm;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private g amPm;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Integer minute;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Integer second;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Integer nanosecond;

    public w() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // lo0.k0
    public mo0.a A() {
        return k0.a.a(this);
    }

    @Override // lo0.k0
    public void D(Integer num) {
        this.hour = num;
    }

    @Override // lo0.k0
    public void E(mo0.a aVar) {
        k0.a.b(this, aVar);
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: a, reason: from getter */
    public Integer getNanosecond() {
        return this.nanosecond;
    }

    @Override // po0.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w copy() {
        return new w(getHour(), getHourOfAmPm(), getAmPm(), getMinute(), getSecond(), getNanosecond());
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: c, reason: from getter */
    public Integer getHour() {
        return this.hour;
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: d, reason: from getter */
    public Integer getSecond() {
        return this.second;
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: e, reason: from getter */
    public Integer getMinute() {
        return this.minute;
    }

    public boolean equals(Object other) {
        if (!(other instanceof w)) {
            return false;
        }
        w wVar = (w) other;
        return p013kotlin.jvm.internal.s.f(getHour(), wVar.getHour()) && p013kotlin.jvm.internal.s.f(getHourOfAmPm(), wVar.getHourOfAmPm()) && getAmPm() == wVar.getAmPm() && p013kotlin.jvm.internal.s.f(getMinute(), wVar.getMinute()) && p013kotlin.jvm.internal.s.f(getSecond(), wVar.getSecond()) && p013kotlin.jvm.internal.s.f(getNanosecond(), wVar.getNanosecond());
    }

    public final ko0.g f() {
        int iIntValue;
        int iIntValue2;
        Integer hour = getHour();
        if (hour != null) {
            iIntValue = hour.intValue();
            Integer hourOfAmPm = getHourOfAmPm();
            if (hourOfAmPm != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = hourOfAmPm.intValue())) {
                throw new IllegalArgumentException(("Inconsistent hour and hour-of-am-pm: hour is " + iIntValue + ", but hour-of-am-pm is " + iIntValue2).toString());
            }
            g amPm = getAmPm();
            if (amPm != null) {
                if ((amPm == g.PM) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + amPm).toString());
                }
            }
        } else {
            Integer hourOfAmPm2 = getHourOfAmPm();
            Integer numValueOf = null;
            if (hourOfAmPm2 != null) {
                int iIntValue3 = hourOfAmPm2.intValue();
                g amPm2 = getAmPm();
                if (amPm2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (amPm2 != g.PM ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new DateTimeFormatException("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        int iIntValue4 = ((Number) z.d(getMinute(), "minute")).intValue();
        Integer second = getSecond();
        int iIntValue5 = second != null ? second.intValue() : 0;
        Integer nanosecond = getNanosecond();
        return new ko0.g(iIntValue, iIntValue4, iIntValue5, nanosecond != null ? nanosecond.intValue() : 0);
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: g, reason: from getter */
    public Integer getHourOfAmPm() {
        return this.hourOfAmPm;
    }

    public int hashCode() {
        Integer hour = getHour();
        int iIntValue = (hour != null ? hour.intValue() : 0) * 31;
        Integer hourOfAmPm = getHourOfAmPm();
        int iIntValue2 = iIntValue + ((hourOfAmPm != null ? hourOfAmPm.intValue() : 0) * 31);
        g amPm = getAmPm();
        int iHashCode = iIntValue2 + ((amPm != null ? amPm.hashCode() : 0) * 31);
        Integer minute = getMinute();
        int iIntValue3 = iHashCode + ((minute != null ? minute.intValue() : 0) * 31);
        Integer second = getSecond();
        int iIntValue4 = iIntValue3 + ((second != null ? second.intValue() : 0) * 31);
        Integer nanosecond = getNanosecond();
        return iIntValue4 + (nanosecond != null ? nanosecond.intValue() : 0);
    }

    @Override // lo0.k0
    public void k(Integer num) {
        this.second = num;
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: m, reason: from getter */
    public g getAmPm() {
        return this.amPm;
    }

    @Override // lo0.k0
    public void n(Integer num) {
        this.hourOfAmPm = num;
    }

    @Override // lo0.k0
    public void o(Integer num) {
        this.nanosecond = num;
    }

    @Override // lo0.k0
    public void t(g gVar) {
        this.amPm = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    public String toString() {
        String strK0;
        StringBuilder sb2 = new StringBuilder();
        Object hour = getHour();
        if (hour == null) {
            hour = "??";
        }
        sb2.append(hour);
        sb2.append(CoreConstants.COLON_CHAR);
        Object minute = getMinute();
        if (minute == null) {
            minute = "??";
        }
        sb2.append(minute);
        sb2.append(CoreConstants.COLON_CHAR);
        Integer second = getSecond();
        sb2.append(second != null ? second : "??");
        sb2.append(CoreConstants.DOT);
        Integer nanosecond = getNanosecond();
        if (nanosecond != null) {
            String strValueOf = String.valueOf(nanosecond.intValue());
            strK0 = p013kotlin.text.t.K0(strValueOf, 9 - strValueOf.length(), '0');
            if (strK0 == null) {
                strK0 = "???";
            }
        } else {
            strK0 = "???";
        }
        sb2.append(strK0);
        return sb2.toString();
    }

    @Override // lo0.k0
    public void z(Integer num) {
        this.minute = num;
    }

    public w(Integer num, Integer num2, g gVar, Integer num3, Integer num4, Integer num5) {
        this.hour = num;
        this.hourOfAmPm = num2;
        this.amPm = gVar;
        this.minute = num3;
        this.second = num4;
        this.nanosecond = num5;
    }

    public /* synthetic */ w(Integer num, Integer num2, g gVar, Integer num3, Integer num4, Integer num5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : gVar, (i11 & 8) != 0 ? null : num3, (i11 & 16) != 0 ? null : num4, (i11 & 32) != 0 ? null : num5);
    }
}
