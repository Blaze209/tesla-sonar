package net.time4j;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public enum c0 implements net.time4j.engine.n<net.time4j.base.a>, net.time4j.engine.u<g0> {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final c0[] ENUMS = values();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f93979b;

        static {
            int[] iArr = new int[m0.values().length];
            f93979b = iArr;
            try {
                iArr[m0.Q1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93979b[m0.Q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93979b[m0.Q3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[c0.values().length];
            f93978a = iArr2;
            try {
                iArr2[c0.JANUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93978a[c0.FEBRUARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93978a[c0.MARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93978a[c0.APRIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f93978a[c0.MAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f93978a[c0.JUNE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f93978a[c0.JULY.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f93978a[c0.AUGUST.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f93978a[c0.SEPTEMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static c0 atEndOfQuarterYear(m0 m0Var) {
        int i11 = a.f93979b[m0Var.ordinal()];
        if (i11 == 1) {
            return MARCH;
        }
        if (i11 != 2) {
            return i11 != 3 ? DECEMBER : SEPTEMBER;
        }
        return JUNE;
    }

    public static c0 atStartOfQuarterYear(m0 m0Var) {
        int i11 = a.f93979b[m0Var.ordinal()];
        if (i11 == 1) {
            return JANUARY;
        }
        if (i11 != 2) {
            return i11 != 3 ? OCTOBER : JULY;
        }
        return APRIL;
    }

    public static c0 parse(CharSequence charSequence, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        c0 c0Var = (c0) net.time4j.format.b.d(locale).l(vVar, mVar).c(charSequence, parsePosition, c0.class);
        if (c0Var != null) {
            return c0Var;
        }
        throw new ParseException("Cannot parse: " + ((Object) charSequence), parsePosition.getErrorIndex());
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.v.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getLength(int i11) {
        return net.time4j.base.b.d(i11, getValue());
    }

    public m0 getQuarterOfYear() {
        switch (a.f93978a[ordinal()]) {
            case 1:
            case 2:
            case 3:
                return m0.Q1;
            case 4:
            case 5:
            case 6:
                return m0.Q2;
            case 7:
            case 8:
            case 9:
                return m0.Q3;
            default:
                return m0.Q4;
        }
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public c0 next() {
        return roll(1);
    }

    public c0 previous() {
        return roll(-1);
    }

    public c0 roll(int i11) {
        return valueOf(((ordinal() + ((i11 % 12) + 12)) % 12) + 1);
    }

    public static c0 valueOf(int i11) {
        if (i11 >= 1 && i11 <= 12) {
            return ENUMS[i11 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.u
    public g0 apply(g0 g0Var) {
        return (g0) g0Var.B(g0.f94492s, this);
    }

    public String getDisplayName(Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(locale).l(vVar, mVar).g(this);
    }

    @Override // net.time4j.engine.n
    public boolean test(net.time4j.base.a aVar) {
        return aVar.r() == getValue();
    }
}
