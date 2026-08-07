package j$.time.format;

import j$.time.DayOfWeek;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final char f82134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f82135h;

    @Override // j$.time.format.i, j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i11) {
        return f(uVar.f82145a.f82060b).w(uVar, charSequence, i11);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean s(w wVar, StringBuilder sb2) {
        return f(wVar.f82155b.f82060b).s(wVar, sb2);
    }

    public r(char c11, int i11, int i12, int i13, int i14) {
        super(null, i12, i13, d0.NOT_NEGATIVE, i14);
        this.f82134g = c11;
        this.f82135h = i11;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f82107e == -1) {
            return this;
        }
        return new r(this.f82134g, this.f82135h, this.f82104b, this.f82105c, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i11) {
        return new r(this.f82134g, this.f82135h, this.f82104b, this.f82105c, this.f82107e + i11);
    }

    public final i f(Locale locale) {
        j$.time.temporal.u uVar;
        ConcurrentMap concurrentMap = j$.time.temporal.v.f82234g;
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        j$.time.temporal.v vVarA = j$.time.temporal.v.a(DayOfWeek.f81957a[((((int) (((long) (calendar.getFirstDayOfWeek() - 1)) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
        char c11 = this.f82134g;
        if (c11 == 'W') {
            uVar = vVarA.f82239d;
        } else {
            if (c11 == 'Y') {
                j$.time.temporal.u uVar2 = vVarA.f82241f;
                int i11 = this.f82135h;
                if (i11 == 2) {
                    return new o(uVar2, 2, 2, o.f82127h, this.f82107e);
                }
                return new i(uVar2, i11, 19, i11 < 4 ? d0.NORMAL : d0.EXCEEDS_PAD, this.f82107e);
            }
            if (c11 == 'c' || c11 == 'e') {
                uVar = vVarA.f82238c;
            } else {
                if (c11 != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                uVar = vVarA.f82240e;
            }
        }
        return new i(uVar, this.f82104b, this.f82105c, d0.NOT_NEGATIVE, this.f82107e);
    }

    @Override // j$.time.format.i
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        int i11 = this.f82135h;
        char c11 = this.f82134g;
        if (c11 != 'Y') {
            if (c11 == 'W') {
                sb2.append("WeekOfMonth");
            } else if (c11 == 'c' || c11 == 'e') {
                sb2.append("DayOfWeek");
            } else if (c11 == 'w') {
                sb2.append("WeekOfWeekBasedYear");
            }
            sb2.append(",");
            sb2.append(i11);
        } else if (i11 == 1) {
            sb2.append("WeekBasedYear");
        } else if (i11 == 2) {
            sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb2.append("WeekBasedYear,");
            sb2.append(i11);
            sb2.append(",19,");
            sb2.append(i11 < 4 ? d0.NORMAL : d0.EXCEEDS_PAD);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
