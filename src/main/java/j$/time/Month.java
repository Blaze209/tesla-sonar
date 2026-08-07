package j$.time;

import com.plaid.internal.EnumC4419g;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Month implements TemporalAccessor, j$.time.temporal.m {
    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Month[] f81976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Month[] f81977b;

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) f81977b.clone();
    }

    static {
        Month month = new Month("JANUARY", 0);
        JANUARY = month;
        Month month2 = new Month("FEBRUARY", 1);
        FEBRUARY = month2;
        Month month3 = new Month("MARCH", 2);
        MARCH = month3;
        Month month4 = new Month("APRIL", 3);
        APRIL = month4;
        Month month5 = new Month("MAY", 4);
        MAY = month5;
        Month month6 = new Month("JUNE", 5);
        JUNE = month6;
        Month month7 = new Month("JULY", 6);
        JULY = month7;
        Month month8 = new Month("AUGUST", 7);
        AUGUST = month8;
        Month month9 = new Month("SEPTEMBER", 8);
        SEPTEMBER = month9;
        Month month10 = new Month("OCTOBER", 9);
        OCTOBER = month10;
        Month month11 = new Month("NOVEMBER", 10);
        NOVEMBER = month11;
        Month month12 = new Month("DECEMBER", 11);
        DECEMBER = month12;
        f81977b = new Month[]{month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        f81976a = values();
    }

    public static Month E(int i11) {
        if (i11 < 1 || i11 > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: " + i11);
        }
        return f81976a[i11 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.E();
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return super.e(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
        return pVar.J(this);
    }

    public final int w(boolean z11) {
        int i11 = i.f82165a[ordinal()];
        if (i11 != 1) {
            return (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31;
        }
        return z11 ? 29 : 28;
    }

    public final int B() {
        int i11 = i.f82165a[ordinal()];
        if (i11 != 1) {
            return (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int s(boolean z11) {
        switch (i.f82165a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z11 ? 1 : 0) + 91;
            case 3:
                return (z11 ? 1 : 0) + 152;
            case 4:
                return (z11 ? 1 : 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE;
            case 5:
                return (z11 ? 1 : 0) + EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE;
            case 6:
                return 1;
            case 7:
                return (z11 ? 1 : 0) + 60;
            case 8:
                return (z11 ? 1 : 0) + 121;
            case 9:
                return (z11 ? 1 : 0) + 182;
            case 10:
                return (z11 ? 1 : 0) + EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE;
            case 11:
                return (z11 ? 1 : 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
            default:
                return (z11 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82215b) {
            return j$.time.chrono.s.f82037c;
        }
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return ChronoUnit.MONTHS;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.l.n(lVar).equals(j$.time.chrono.s.f82037c)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return lVar.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
