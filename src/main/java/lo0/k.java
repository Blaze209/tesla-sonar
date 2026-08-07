package lo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005B3\b\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010/\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001e\u00105\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001e\u00108\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\u001e\u0010:\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001d\u0010,\"\u0004\b9\u0010.R\u001e\u0010@\u001a\u0004\u0018\u00010;8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010G\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8V@VX\u0096\u000f¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010I\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b!\u0010,\"\u0004\bH\u0010.R\u001e\u0010L\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bJ\u0010,\"\u0004\bK\u0010.R\u001e\u0010O\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bM\u0010,\"\u0004\bN\u0010.R\u001e\u0010Q\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0019\u0010,\"\u0004\bP\u0010.R\u001e\u0010S\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b%\u0010,\"\u0004\bR\u0010.R\u001e\u0010T\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010Z\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bX\u0010,\"\u0004\bY\u0010.R\u001e\u0010]\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b[\u0010,\"\u0004\b\\\u0010.R\u001e\u0010`\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b^\u0010,\"\u0004\b_\u0010.¨\u0006a"}, d2 = {"Llo0/k;", "Llo0/h;", "Llo0/k0;", "Llo0/n0;", "", "Lpo0/c;", "Llo0/v;", InquiryField.DateField.TYPE, "Llo0/w;", "time", "Llo0/x;", "offset", "", "timeZoneId", "<init>", "(Llo0/v;Llo0/w;Llo0/x;Ljava/lang/String;)V", Gender.FEMALE, "()Llo0/k;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Llo0/v;", "G", "()Llo0/v;", "b", "Llo0/w;", "I", "()Llo0/w;", "c", "Llo0/x;", "H", "()Llo0/x;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "J", "()Ljava/lang/String;", "K", "(Ljava/lang/String;)V", "f", "()Ljava/lang/Integer;", "q", "(Ljava/lang/Integer;)V", "dayOfMonth", "B", "w", "dayOfYear", "h", "s", "isoDayOfWeek", "r", "y", "monthNumber", "C", "year", "Llo0/g;", "m", "()Llo0/g;", "t", "(Llo0/g;)V", "amPm", "Lmo0/a;", "value", "A", "()Lmo0/a;", "E", "(Lmo0/a;)V", "fractionOfSecond", "D", "hour", "g", "n", "hourOfAmPm", "e", "z", "minute", "o", "nanosecond", "k", "second", "isNegative", "()Ljava/lang/Boolean;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Boolean;)V", "v", "j", "minutesOfHour", "p", "x", "secondsOfMinute", "u", "l", "totalHoursAbs", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k implements h, k0, n0, po0.c<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w time;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x offset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String timeZoneId;

    public k() {
        this(null, null, null, null, 15, null);
    }

    @Override // lo0.k0
    public mo0.a A() {
        return this.time.A();
    }

    @Override // lo0.h
    /* JADX INFO: renamed from: B */
    public Integer getDayOfYear() {
        return this.date.getDayOfYear();
    }

    @Override // lo0.h
    public void C(Integer num) {
        this.date.C(num);
    }

    @Override // lo0.k0
    public void D(Integer num) {
        this.time.D(num);
    }

    @Override // lo0.k0
    public void E(mo0.a aVar) {
        this.time.E(aVar);
    }

    @Override // po0.c
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public k copy() {
        return new k(this.date.copy(), this.time.copy(), this.offset.copy(), this.timeZoneId);
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final v getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final x getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final w getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    public final void K(String str) {
        this.timeZoneId = str;
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: a */
    public Integer getNanosecond() {
        return this.time.getNanosecond();
    }

    @Override // lo0.h
    /* JADX INFO: renamed from: b */
    public Integer getYear() {
        return this.date.getYear();
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: c */
    public Integer getHour() {
        return this.time.getHour();
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: d */
    public Integer getSecond() {
        return this.time.getSecond();
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: e */
    public Integer getMinute() {
        return this.time.getMinute();
    }

    public boolean equals(Object other) {
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return p013kotlin.jvm.internal.s.f(kVar.date, this.date) && p013kotlin.jvm.internal.s.f(kVar.time, this.time) && p013kotlin.jvm.internal.s.f(kVar.offset, this.offset) && p013kotlin.jvm.internal.s.f(kVar.timeZoneId, this.timeZoneId);
    }

    @Override // lo0.h
    /* JADX INFO: renamed from: f */
    public Integer getDayOfMonth() {
        return this.date.getDayOfMonth();
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: g */
    public Integer getHourOfAmPm() {
        return this.time.getHourOfAmPm();
    }

    @Override // lo0.h
    /* JADX INFO: renamed from: h */
    public Integer getIsoDayOfWeek() {
        return this.date.getIsoDayOfWeek();
    }

    public int hashCode() {
        int iHashCode = (this.date.hashCode() ^ this.time.hashCode()) ^ this.offset.hashCode();
        String str = this.timeZoneId;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // lo0.n0
    public void i(Boolean bool) {
        this.offset.i(bool);
    }

    @Override // lo0.n0
    /* JADX INFO: renamed from: isNegative */
    public Boolean getIsNegative() {
        return this.offset.getIsNegative();
    }

    @Override // lo0.n0
    public void j(Integer num) {
        this.offset.j(num);
    }

    @Override // lo0.k0
    public void k(Integer num) {
        this.time.k(num);
    }

    @Override // lo0.n0
    public void l(Integer num) {
        this.offset.l(num);
    }

    @Override // lo0.k0
    /* JADX INFO: renamed from: m */
    public g getAmPm() {
        return this.time.getAmPm();
    }

    @Override // lo0.k0
    public void n(Integer num) {
        this.time.n(num);
    }

    @Override // lo0.k0
    public void o(Integer num) {
        this.time.o(num);
    }

    @Override // lo0.n0
    /* JADX INFO: renamed from: p */
    public Integer getSecondsOfMinute() {
        return this.offset.getSecondsOfMinute();
    }

    @Override // lo0.h
    public void q(Integer num) {
        this.date.q(num);
    }

    @Override // lo0.h
    /* JADX INFO: renamed from: r */
    public Integer getMonthNumber() {
        return this.date.getMonthNumber();
    }

    @Override // lo0.h
    public void s(Integer num) {
        this.date.s(num);
    }

    @Override // lo0.k0
    public void t(g gVar) {
        this.time.t(gVar);
    }

    @Override // lo0.n0
    /* JADX INFO: renamed from: u */
    public Integer getTotalHoursAbs() {
        return this.offset.getTotalHoursAbs();
    }

    @Override // lo0.n0
    /* JADX INFO: renamed from: v */
    public Integer getMinutesOfHour() {
        return this.offset.getMinutesOfHour();
    }

    @Override // lo0.h
    public void w(Integer num) {
        this.date.w(num);
    }

    @Override // lo0.n0
    public void x(Integer num) {
        this.offset.x(num);
    }

    @Override // lo0.h
    public void y(Integer num) {
        this.date.y(num);
    }

    @Override // lo0.k0
    public void z(Integer num) {
        this.time.z(num);
    }

    public k(v date, w time, x offset, String str) {
        p013kotlin.jvm.internal.s.k(date, "date");
        p013kotlin.jvm.internal.s.k(time, "time");
        p013kotlin.jvm.internal.s.k(offset, "offset");
        this.date = date;
        this.time = time;
        this.offset = offset;
        this.timeZoneId = str;
    }

    public /* synthetic */ k(v vVar, w wVar, x xVar, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new v(null, null, null, null, null, 31, null) : vVar, (i11 & 2) != 0 ? new w(null, null, null, null, null, null, 63, null) : wVar, (i11 & 4) != 0 ? new x(null, null, null, null, 15, null) : xVar, (i11 & 8) != 0 ? null : str);
    }
}
