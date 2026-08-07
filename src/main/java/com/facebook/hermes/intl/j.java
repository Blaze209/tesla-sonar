package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import android.os.Build;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ezvcard.property.Kind;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Format f21665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.icu.text.NumberFormat f21666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private em.f f21667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.h f21668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MeasureUnit f21669e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21670a;

        static {
            int[] iArr = new int[c.g.values().length];
            f21670a = iArr;
            try {
                iArr[c.g.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21670a[c.g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21670a[c.g.EXCEPTZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    j() {
    }

    public static int n(String str) throws JSRangeErrorException {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new JSRangeErrorException("Invalid currency code !");
        }
    }

    private void o(android.icu.text.NumberFormat numberFormat, em.b<?> bVar, c.h hVar) {
        this.f21666b = numberFormat;
        this.f21665a = numberFormat;
        this.f21667c = (em.f) bVar;
        this.f21668d = hVar;
        numberFormat.setRoundingMode(4);
    }

    private static MeasureUnit p(String str) throws JSRangeErrorException {
        for (MeasureUnit measureUnit : MeasureUnit.getAvailable()) {
            if (!measureUnit.getSubtype().equals(str)) {
                if (measureUnit.getSubtype().equals(measureUnit.getType() + "-" + str)) {
                }
            }
            return measureUnit;
        }
        throw new JSRangeErrorException("Unknown unit: " + str);
    }

    @Override // com.facebook.hermes.intl.c
    public AttributedCharacterIterator a(double d11) {
        try {
            try {
                Format format = this.f21665a;
                return (!(format instanceof MeasureFormat) || this.f21669e == null) ? format.formatToCharacterIterator(Double.valueOf(d11)) : format.formatToCharacterIterator(new Measure(Double.valueOf(d11), this.f21669e));
            } catch (RuntimeException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d11));
            }
        } catch (NumberFormatException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d11));
        } catch (Exception unused3) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d11));
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String b(em.b<?> bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.getLocale()).getName();
    }

    @Override // com.facebook.hermes.intl.c
    public String c(double d11) {
        try {
            try {
                Format format = this.f21665a;
                return (!(format instanceof MeasureFormat) || this.f21669e == null) ? format.format(Double.valueOf(d11)) : format.format(new Measure(Double.valueOf(d11), this.f21669e));
            } catch (NumberFormatException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).format(d11);
            }
        } catch (RuntimeException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d11);
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String l(AttributedCharacterIterator.Attribute attribute, double d11) {
        if (attribute == android.icu.text.NumberFormat.Field.SIGN) {
            return Double.compare(d11, 0.0d) >= 0 ? "plusSign" : "minusSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.INTEGER) {
            if (Double.isNaN(d11)) {
                return "nan";
            }
            return Double.isInfinite(d11) ? "infinity" : InquiryField.IntegerField.TYPE;
        }
        if (attribute == android.icu.text.NumberFormat.Field.FRACTION) {
            return "fraction";
        }
        if (attribute == android.icu.text.NumberFormat.Field.EXPONENT) {
            return "exponentInteger";
        }
        if (attribute == android.icu.text.NumberFormat.Field.EXPONENT_SIGN) {
            return "exponentMinusSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.EXPONENT_SYMBOL) {
            return "exponentSeparator";
        }
        if (attribute == android.icu.text.NumberFormat.Field.DECIMAL_SEPARATOR) {
            return "decimal";
        }
        if (attribute == android.icu.text.NumberFormat.Field.GROUPING_SEPARATOR) {
            return Kind.GROUP;
        }
        if (attribute == android.icu.text.NumberFormat.Field.PERCENT) {
            return "percentSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.PERMILLE) {
            return "permilleSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.CURRENCY) {
            return "currency";
        }
        return attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public j i(em.b<?> bVar, String str, c.h hVar, c.d dVar, c.e eVar, c.b bVar2) throws JSRangeErrorException {
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(em.d.h(str)) == null) {
                    throw new JSRangeErrorException("Invalid numbering system: " + str);
                }
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(em.d.h(str));
                bVar.c("nu", arrayList);
            } catch (RuntimeException unused) {
                throw new JSRangeErrorException("Invalid numbering system: " + str);
            }
        }
        if (eVar == c.e.COMPACT && (hVar == c.h.DECIMAL || hVar == c.h.UNIT)) {
            o(CompactDecimalFormat.getInstance((ULocale) bVar.getLocale(), bVar2 == c.b.SHORT ? CompactDecimalFormat.CompactStyle.SHORT : CompactDecimalFormat.CompactStyle.LONG), bVar, hVar);
            return this;
        }
        android.icu.text.NumberFormat numberFormat = android.icu.text.NumberFormat.getInstance((ULocale) bVar.getLocale(), hVar.getInitialNumberFormatStyle(eVar, dVar));
        if (eVar == c.e.ENGINEERING) {
            numberFormat.setMaximumIntegerDigits(3);
        }
        o(numberFormat, bVar, hVar);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public j d(String str, c.EnumC0435c enumC0435c) {
        if (this.f21668d == c.h.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f21666b.setCurrency(currency);
            if (enumC0435c != c.EnumC0435c.CODE) {
                str = currency.getName(this.f21667c.getLocale(), enumC0435c.getNameStyle(), (boolean[]) null);
            }
            android.icu.text.NumberFormat numberFormat = this.f21666b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public j g(c.f fVar, int i11, int i12) {
        if (fVar == c.f.FRACTION_DIGITS) {
            if (i11 >= 0) {
                this.f21666b.setMinimumFractionDigits(i11);
            }
            if (i12 >= 0) {
                this.f21666b.setMaximumFractionDigits(i12);
            }
            android.icu.text.NumberFormat numberFormat = this.f21666b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public j f(boolean z11) {
        this.f21666b.setGroupingUsed(z11);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public j e(int i11) {
        if (i11 != -1) {
            this.f21666b.setMinimumIntegerDigits(i11);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public j h(c.g gVar) {
        android.icu.text.NumberFormat numberFormat = this.f21666b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            if (Build.VERSION.SDK_INT >= 31) {
                int i11 = a.f21670a[gVar.ordinal()];
                if (i11 == 1) {
                    decimalFormat.setSignAlwaysShown(false);
                    return this;
                }
                if (i11 == 2 || i11 == 3) {
                    decimalFormat.setSignAlwaysShown(true);
                    return this;
                }
            } else {
                int i12 = a.f21670a[gVar.ordinal()];
                if (i12 == 1) {
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setPositiveSuffix("");
                    decimalFormat.setNegativePrefix("");
                    decimalFormat.setNegativeSuffix("");
                } else if (i12 == 2 || i12 == 3) {
                    if (!decimalFormat.getNegativePrefix().isEmpty()) {
                        decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                    }
                    if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                        decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                        return this;
                    }
                }
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public j j(c.f fVar, int i11, int i12) throws JSRangeErrorException {
        android.icu.text.NumberFormat numberFormat = this.f21666b;
        if ((numberFormat instanceof DecimalFormat) && fVar == c.f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i11 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i11);
            }
            if (i12 >= 0) {
                if (i12 < decimalFormat.getMinimumSignificantDigits()) {
                    throw new JSRangeErrorException("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
                decimalFormat.setMaximumSignificantDigits(i12);
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public j k(String str, c.i iVar) {
        if (this.f21668d == c.h.UNIT) {
            this.f21669e = p(str);
            this.f21665a = MeasureFormat.getInstance(this.f21667c.getLocale(), iVar.getFormatWidth(), this.f21666b);
        }
        return this;
    }
}
