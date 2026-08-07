package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import com.google.android.libraries.places.api.model.PlaceTypes;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.text.AttributedCharacterIterator;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f21652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f21653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f21654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f21655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f21656g;

        static {
            int[] iArr = new int[d.values().length];
            f21656g = iArr;
            try {
                iArr[d.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21656g[d.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0435c.values().length];
            f21655f = iArr2;
            try {
                iArr2[EnumC0435c.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21655f[EnumC0435c.NARROWSYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21655f[EnumC0435c.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21655f[EnumC0435c.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[i.values().length];
            f21654e = iArr3;
            try {
                iArr3[i.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21654e[i.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21654e[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[g.values().length];
            f21653d = iArr4;
            try {
                iArr4[g.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21653d[g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21653d[g.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21653d[g.EXCEPTZERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[b.values().length];
            f21652c = iArr5;
            try {
                iArr5[b.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21652c[b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[e.values().length];
            f21651b = iArr6;
            try {
                iArr6[e.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21651b[e.SCIENTIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21651b[e.ENGINEERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21651b[e.COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr7 = new int[h.values().length];
            f21650a = iArr7;
            try {
                iArr7[h.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21650a[h.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21650a[h.CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f21650a[h.UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    public enum b {
        SHORT,
        LONG;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f21652c[ordinal()];
            if (i11 == 1) {
                return "short";
            }
            if (i11 == 2) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: com.facebook.hermes.intl.c$c, reason: collision with other inner class name */
    public enum EnumC0435c {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        public int getNameStyle() {
            return a.f21655f[ordinal()] != 4 ? 0 : 1;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f21655f[ordinal()];
            if (i11 == 1) {
                return "symbol";
            }
            if (i11 == 2) {
                return "narrowSymbol";
            }
            if (i11 == 3) {
                return "code";
            }
            if (i11 == 4) {
                return "name";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        STANDARD,
        ACCOUNTING;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f21656g[ordinal()];
            if (i11 == 1) {
                return PlaceTypes.ACCOUNTING;
            }
            if (i11 == 2) {
                return "standard";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum e {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f21651b[ordinal()];
            if (i11 == 1) {
                return "standard";
            }
            if (i11 == 2) {
                return "scientific";
            }
            if (i11 == 3) {
                return "engineering";
            }
            if (i11 == 4) {
                return "compact";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum f {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    public enum g {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f21653d[ordinal()];
            if (i11 == 1) {
                return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
            if (i11 == 2) {
                return PermissionsResponse.SCOPE_ALWAYS;
            }
            if (i11 == 3) {
                return PermissionsResponse.PERMISSION_EXPIRES_NEVER;
            }
            if (i11 == 4) {
                return "exceptZero";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum h {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        public int getInitialNumberFormatStyle(e eVar, d dVar) throws JSRangeErrorException {
            int i11 = a.f21650a[ordinal()];
            if (i11 == 2) {
                return 2;
            }
            if (i11 != 3) {
                return (eVar == e.SCIENTIFIC || eVar == e.ENGINEERING) ? 3 : 0;
            }
            if (dVar == d.ACCOUNTING) {
                return 7;
            }
            if (dVar == d.STANDARD) {
                return 1;
            }
            throw new JSRangeErrorException("Unrecognized formatting style requested.");
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f21650a[ordinal()];
            if (i11 == 1) {
                return "decimal";
            }
            if (i11 == 2) {
                return "percent";
            }
            if (i11 == 3) {
                return "currency";
            }
            if (i11 == 4) {
                return "unit";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum i {
        SHORT,
        NARROW,
        LONG;

        public MeasureFormat.FormatWidth getFormatWidth() {
            int i11 = a.f21654e[ordinal()];
            if (i11 != 2) {
                return i11 != 3 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE;
            }
            return MeasureFormat.FormatWidth.NARROW;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f21654e[ordinal()];
            if (i11 == 1) {
                return "short";
            }
            if (i11 == 2) {
                return "narrow";
            }
            if (i11 == 3) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    AttributedCharacterIterator a(double d11);

    String b(em.b<?> bVar);

    String c(double d11);

    c d(String str, EnumC0435c enumC0435c);

    c e(int i11);

    c f(boolean z11);

    c g(f fVar, int i11, int i12);

    c h(g gVar);

    c i(em.b<?> bVar, String str, h hVar, d dVar, e eVar, b bVar2);

    c j(f fVar, int i11, int i12);

    c k(String str, i iVar);

    String l(AttributedCharacterIterator.Attribute attribute, double d11);
}
