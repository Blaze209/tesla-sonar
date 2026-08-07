package ps;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f103981a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(d0 d0Var) {
        String strS = d0Var.s();
        return strS != null && strS.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String[] strArrQ0 = p0.Q0(str, "\\.");
        long j11 = 0;
        for (String str2 : p0.P0(strArrQ0[0], ":")) {
            j11 = (j11 * 60) + Long.parseLong(str2);
        }
        long j12 = j11 * 1000;
        if (strArrQ0.length == 2) {
            j12 += Long.parseLong(strArrQ0[1]);
        }
        return j12 * 1000;
    }

    public static void d(d0 d0Var) throws ParserException {
        int iF = d0Var.f();
        if (a(d0Var)) {
            return;
        }
        d0Var.U(iF);
        throw ParserException.a("Expected WEBVTT. Got " + d0Var.s(), null);
    }
}
