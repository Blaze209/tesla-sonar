package net.time4j;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public enum a0 implements net.time4j.engine.n<net.time4j.base.g> {
    AM,
    PM;

    public static a0 ofHour(int i11) {
        if (i11 >= 0 && i11 <= 24) {
            return (i11 < 12 || i11 == 24) ? AM : PM;
        }
        throw new IllegalArgumentException("Hour of day out of range: " + i11);
    }

    public static a0 parse(CharSequence charSequence, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) throws ParseException {
        char cCharAt;
        if (charSequence.length() == 2 && ((cCharAt = charSequence.charAt(1)) == 'M' || cCharAt == 'm')) {
            char cCharAt2 = charSequence.charAt(0);
            if (cCharAt2 == 'A' || cCharAt2 == 'a') {
                return AM;
            }
            if (cCharAt2 == 'P' || cCharAt2 == 'p') {
                return PM;
            }
        }
        ParsePosition parsePosition = new ParsePosition(0);
        a0 a0Var = (a0) net.time4j.format.b.d(locale).h(vVar, mVar).c(charSequence, parsePosition, a0.class);
        if (a0Var != null) {
            return a0Var;
        }
        throw new ParseException("Cannot parse: " + ((Object) charSequence), parsePosition.getErrorIndex());
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.v.WIDE, net.time4j.format.m.FORMAT);
    }

    public String getDisplayName(Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(locale).h(vVar, mVar).g(this);
    }

    @Override // net.time4j.engine.n
    public boolean test(net.time4j.base.g gVar) {
        int iC = gVar.c();
        if (this == AM) {
            return iC < 12 || iC == 24;
        }
        return iC >= 12 && iC < 24;
    }
}
