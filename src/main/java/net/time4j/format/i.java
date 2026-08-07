package net.time4j.format;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f94437a = new a();

    static class a implements i {
        a() {
        }

        private DecimalFormatSymbols g(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }

        @Override // net.time4j.format.i
        public Locale[] a() {
            return DecimalFormatSymbols.getAvailableLocales();
        }

        @Override // net.time4j.format.i
        public j b(Locale locale) {
            return j.ARABIC;
        }

        @Override // net.time4j.format.i
        public String c(Locale locale) {
            return locale.getLanguage().equals("ar") ? "\u200f-" : String.valueOf(g(locale).getMinusSign());
        }

        @Override // net.time4j.format.i
        public char d(Locale locale) {
            return g(locale).getZeroDigit();
        }

        @Override // net.time4j.format.i
        public char e(Locale locale) {
            return g(locale).getDecimalSeparator();
        }

        @Override // net.time4j.format.i
        public String f(Locale locale) {
            return locale.getLanguage().equals("ar") ? "\u200f+" : String.valueOf('+');
        }
    }

    Locale[] a();

    j b(Locale locale);

    String c(Locale locale);

    char d(Locale locale);

    char e(Locale locale);

    String f(Locale locale);
}
