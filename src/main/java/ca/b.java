package ca;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.c0;
import s7.l;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f18964c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f18965d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f18966a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f18967b = new StringBuilder();

    private void a(c cVar, String str) {
        if (str.isEmpty()) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f18964c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.z((String) s7.a.f(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrE1 = q0.E1(str, "\\.");
        String str2 = strArrE1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.y(str2.substring(0, iIndexOf2));
            cVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (strArrE1.length > 1) {
            cVar.w((String[]) q0.i1(strArrE1, 1, strArrE1.length));
        }
    }

    private static boolean b(c0 c0Var) {
        int iG = c0Var.g();
        int iJ = c0Var.j();
        byte[] bArrF = c0Var.f();
        if (iG + 2 > iJ) {
            return false;
        }
        int i11 = iG + 1;
        if (bArrF[iG] != 47) {
            return false;
        }
        int i12 = iG + 2;
        if (bArrF[i11] != 42) {
            return false;
        }
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= iJ) {
                c0Var.c0(iJ - c0Var.g());
                return true;
            }
            if (((char) bArrF[i12]) == '*' && ((char) bArrF[i13]) == '/') {
                i12 += 2;
                iJ = i12;
            } else {
                i12 = i13;
            }
        }
    }

    private static boolean c(c0 c0Var) {
        char cK = k(c0Var, c0Var.g());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        c0Var.c0(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f18965d.matcher(ou.c.e(str));
        if (!matcher.matches()) {
            t.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) s7.a.f(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) s7.a.f(matcher.group(1))));
    }

    private static String f(c0 c0Var, StringBuilder sb2) {
        boolean z11 = false;
        sb2.setLength(0);
        int iG = c0Var.g();
        int iJ = c0Var.j();
        while (iG < iJ && !z11) {
            char c11 = (char) c0Var.f()[iG];
            if ((c11 < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !((c11 >= '0' && c11 <= '9') || c11 == '#' || c11 == '-' || c11 == '.' || c11 == '_'))) {
                z11 = true;
            } else {
                iG++;
                sb2.append(c11);
            }
        }
        c0Var.c0(iG - c0Var.g());
        return sb2.toString();
    }

    static String g(c0 c0Var, StringBuilder sb2) {
        n(c0Var);
        if (c0Var.a() == 0) {
            return null;
        }
        String strF = f(c0Var, sb2);
        if (!strF.isEmpty()) {
            return strF;
        }
        return "" + ((char) c0Var.M());
    }

    private static String h(c0 c0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z11 = false;
        while (!z11) {
            int iG = c0Var.g();
            String strG = g(c0Var, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                c0Var.b0(iG);
                z11 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    private static String i(c0 c0Var, StringBuilder sb2) {
        n(c0Var);
        if (c0Var.a() < 5 || !"::cue".equals(c0Var.J(5))) {
            return null;
        }
        int iG = c0Var.g();
        String strG = g(c0Var, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            c0Var.b0(iG);
            return "";
        }
        String strL = "(".equals(strG) ? l(c0Var) : null;
        if (")".equals(g(c0Var, sb2))) {
            return strL;
        }
        return null;
    }

    private static void j(c0 c0Var, c cVar, StringBuilder sb2) {
        n(c0Var);
        String strF = f(c0Var, sb2);
        if (!strF.isEmpty() && ":".equals(g(c0Var, sb2))) {
            n(c0Var);
            String strH = h(c0Var, sb2);
            if (strH == null || strH.isEmpty()) {
                return;
            }
            int iG = c0Var.g();
            String strG = g(c0Var, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    c0Var.b0(iG);
                }
            }
            if ("color".equals(strF)) {
                cVar.q(l.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                cVar.n(l.b(strH));
                return;
            }
            boolean z11 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z11 = false;
                }
                cVar.p(z11);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                cVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, cVar);
            }
        }
    }

    private static char k(c0 c0Var, int i11) {
        return (char) c0Var.f()[i11];
    }

    private static String l(c0 c0Var) {
        int iG = c0Var.g();
        int iJ = c0Var.j();
        boolean z11 = false;
        while (iG < iJ && !z11) {
            int i11 = iG + 1;
            z11 = ((char) c0Var.f()[iG]) == ')';
            iG = i11;
        }
        return c0Var.J((iG - 1) - c0Var.g()).trim();
    }

    static void m(c0 c0Var) {
        while (!TextUtils.isEmpty(c0Var.x())) {
        }
    }

    static void n(c0 c0Var) {
        while (true) {
            for (boolean z11 = true; c0Var.a() > 0 && z11; z11 = false) {
                if (!c(c0Var) && !b(c0Var)) {
                }
            }
            return;
        }
    }

    public List<c> d(c0 c0Var) {
        this.f18967b.setLength(0);
        int iG = c0Var.g();
        m(c0Var);
        this.f18966a.Z(c0Var.f(), c0Var.g());
        this.f18966a.b0(iG);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f18966a, this.f18967b);
            if (strI == null || !"{".equals(g(this.f18966a, this.f18967b))) {
                break;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z11 = false;
            while (!z11) {
                int iG2 = this.f18966a.g();
                String strG = g(this.f18966a, this.f18967b);
                boolean z12 = strG == null || "}".equals(strG);
                if (!z12) {
                    this.f18966a.b0(iG2);
                    j(this.f18966a, cVar, this.f18967b);
                }
                str = strG;
                z11 = z12;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
