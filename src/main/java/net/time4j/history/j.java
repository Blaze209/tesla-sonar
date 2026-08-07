package net.time4j.history;

import java.util.Locale;
import net.time4j.format.v;

/* JADX INFO: loaded from: classes9.dex */
public enum j implements net.time4j.engine.i {
    BC,
    AD,
    HISPANIC,
    BYZANTINE,
    AB_URBE_CONDITA;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94604a;

        static {
            int[] iArr = new int[j.values().length];
            f94604a = iArr;
            try {
                iArr[j.BC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94604a[j.AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94604a[j.HISPANIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94604a[j.BYZANTINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94604a[j.AB_URBE_CONDITA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public int annoDomini(int i11) {
        try {
            int i12 = a.f94604a[ordinal()];
            if (i12 == 1) {
                return net.time4j.base.c.l(1, i11);
            }
            if (i12 == 2) {
                return i11;
            }
            if (i12 == 3) {
                return net.time4j.base.c.l(i11, 38);
            }
            if (i12 == 4) {
                return net.time4j.base.c.l(i11, 5508);
            }
            if (i12 == 5) {
                return net.time4j.base.c.l(i11, 753);
            }
            throw new UnsupportedOperationException(name());
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Out of range: " + i11);
        }
    }

    public String getAlternativeName(Locale locale, v vVar) {
        return net.time4j.format.b.d(locale).o(d.E().i(), vVar == v.WIDE ? "w" : "a", "alt").g(this);
    }

    public String getDisplayName(Locale locale, v vVar) {
        return net.time4j.format.b.d(locale).b(vVar).g(this);
    }

    int yearOfEra(j jVar, int i11) {
        int iAnnoDomini = jVar.annoDomini(i11);
        try {
            int i12 = a.f94604a[ordinal()];
            if (i12 == 1) {
                return net.time4j.base.c.l(1, iAnnoDomini);
            }
            if (i12 == 2) {
                return iAnnoDomini;
            }
            if (i12 == 3) {
                return net.time4j.base.c.e(iAnnoDomini, 38);
            }
            if (i12 == 4) {
                return net.time4j.base.c.e(iAnnoDomini, 5508);
            }
            if (i12 == 5) {
                return net.time4j.base.c.e(iAnnoDomini, 753);
            }
            throw new UnsupportedOperationException(name());
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Out of range: " + i11);
        }
    }
}
