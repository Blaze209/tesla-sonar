package ca;

import androidx.media3.common.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.c0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f19014a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(c0 c0Var) {
        String strX;
        while (true) {
            String strX2 = c0Var.x();
            if (strX2 == null) {
                return null;
            }
            if (f19014a.matcher(strX2).matches()) {
                do {
                    strX = c0Var.x();
                    if (strX == null) {
                        break;
                    }
                } while (!strX.isEmpty());
            } else {
                Matcher matcher = e.f18988a.matcher(strX2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(c0 c0Var) {
        String strX = c0Var.x();
        return strX != null && strX.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] strArrF1 = q0.F1(str, "\\.");
        long j11 = 0;
        for (String str2 : q0.E1(strArrF1[0], ":")) {
            j11 = (j11 * 60) + Long.parseLong(str2);
        }
        long j12 = j11 * 1000;
        if (strArrF1.length == 2) {
            String strTrim = strArrF1[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j12 += Long.parseLong(strTrim);
        }
        return j12 * 1000;
    }

    public static void e(c0 c0Var) throws ParserException {
        int iG = c0Var.g();
        if (b(c0Var)) {
            return;
        }
        c0Var.b0(iG);
        throw ParserException.a("Expected WEBVTT. Got " + c0Var.x(), null);
    }
}
