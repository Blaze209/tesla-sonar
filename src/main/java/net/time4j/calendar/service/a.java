package net.time4j.calendar.service;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import net.time4j.engine.x;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static String a(String str, x xVar, Locale locale) {
        net.time4j.format.e eVarOfStyle = net.time4j.format.e.ofStyle(xVar.getStyleValue());
        if (str.equals("iso8601")) {
            return net.time4j.format.b.r(eVarOfStyle, locale);
        }
        String str2 = "F(" + Character.toLowerCase(eVarOfStyle.name().charAt(0)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        net.time4j.i18n.e eVarI = b.i(str, locale);
        if (!eVarI.b(str2)) {
            eVarI = b.i("generic", locale);
        }
        return eVarI.f(str2);
    }
}
