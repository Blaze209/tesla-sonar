package ps;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f103931c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f103932d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f103933a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f103934b = new StringBuilder();

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f103931c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.z((String) ts.a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrP0 = p0.P0(str, "\\.");
        String str2 = strArrP0[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.y(str2.substring(0, iIndexOf2));
            dVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.y(str2);
        }
        if (strArrP0.length > 1) {
            dVar.w((String[]) p0.I0(strArrP0, 1, strArrP0.length));
        }
    }

    private static boolean b(d0 d0Var) {
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        if (iF + 2 > iG) {
            return false;
        }
        int i11 = iF + 1;
        if (bArrE[iF] != 47) {
            return false;
        }
        int i12 = iF + 2;
        if (bArrE[i11] != 42) {
            return false;
        }
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= iG) {
                d0Var.V(iG - d0Var.f());
                return true;
            }
            if (((char) bArrE[i12]) == '*' && ((char) bArrE[i13]) == '/') {
                i12 += 2;
                iG = i12;
            } else {
                i12 = i13;
            }
        }
    }

    private static boolean c(d0 d0Var) {
        char cK = k(d0Var, d0Var.f());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        d0Var.V(1);
        return true;
    }

    private static void e(String str, d dVar) {
        Matcher matcher = f103932d.matcher(ou.c.e(str));
        if (!matcher.matches()) {
            u.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) ts.a.e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                dVar.t(3);
                break;
            case "em":
                dVar.t(2);
                break;
            case "px":
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) ts.a.e(matcher.group(1))));
    }

    private static String f(d0 d0Var, StringBuilder sb2) {
        boolean z11 = false;
        sb2.setLength(0);
        int iF = d0Var.f();
        int iG = d0Var.g();
        while (iF < iG && !z11) {
            char c11 = (char) d0Var.e()[iF];
            if ((c11 < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !((c11 >= '0' && c11 <= '9') || c11 == '#' || c11 == '-' || c11 == '.' || c11 == '_'))) {
                z11 = true;
            } else {
                iF++;
                sb2.append(c11);
            }
        }
        d0Var.V(iF - d0Var.f());
        return sb2.toString();
    }

    static String g(d0 d0Var, StringBuilder sb2) {
        n(d0Var);
        if (d0Var.a() == 0) {
            return null;
        }
        String strF = f(d0Var, sb2);
        if (!"".equals(strF)) {
            return strF;
        }
        return "" + ((char) d0Var.H());
    }

    private static String h(d0 d0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z11 = false;
        while (!z11) {
            int iF = d0Var.f();
            String strG = g(d0Var, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                d0Var.U(iF);
                z11 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    private static String i(d0 d0Var, StringBuilder sb2) {
        n(d0Var);
        if (d0Var.a() < 5 || !"::cue".equals(d0Var.E(5))) {
            return null;
        }
        int iF = d0Var.f();
        String strG = g(d0Var, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            d0Var.U(iF);
            return "";
        }
        String strL = "(".equals(strG) ? l(d0Var) : null;
        if (")".equals(g(d0Var, sb2))) {
            return strL;
        }
        return null;
    }

    private static void j(d0 d0Var, d dVar, StringBuilder sb2) {
        n(d0Var);
        String strF = f(d0Var, sb2);
        if (!"".equals(strF) && ":".equals(g(d0Var, sb2))) {
            n(d0Var);
            String strH = h(d0Var, sb2);
            if (strH == null || "".equals(strH)) {
                return;
            }
            int iF = d0Var.f();
            String strG = g(d0Var, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    d0Var.U(iF);
                }
            }
            if ("color".equals(strF)) {
                dVar.q(ts.f.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                dVar.n(ts.f.b(strH));
                return;
            }
            boolean z11 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    dVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        dVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z11 = false;
                }
                dVar.p(z11);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    dVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                dVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    dVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    dVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, dVar);
            }
        }
    }

    private static char k(d0 d0Var, int i11) {
        return (char) d0Var.e()[i11];
    }

    private static String l(d0 d0Var) {
        int iF = d0Var.f();
        int iG = d0Var.g();
        boolean z11 = false;
        while (iF < iG && !z11) {
            int i11 = iF + 1;
            z11 = ((char) d0Var.e()[iF]) == ')';
            iF = i11;
        }
        return d0Var.E((iF - 1) - d0Var.f()).trim();
    }

    static void m(d0 d0Var) {
        while (!TextUtils.isEmpty(d0Var.s())) {
        }
    }

    static void n(d0 d0Var) {
        while (true) {
            for (boolean z11 = true; d0Var.a() > 0 && z11; z11 = false) {
                if (!c(d0Var) && !b(d0Var)) {
                }
            }
            return;
        }
    }

    public List<d> d(d0 d0Var) {
        this.f103934b.setLength(0);
        int iF = d0Var.f();
        m(d0Var);
        this.f103933a.S(d0Var.e(), d0Var.f());
        this.f103933a.U(iF);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f103933a, this.f103934b);
            if (strI == null || !"{".equals(g(this.f103933a, this.f103934b))) {
                break;
            }
            d dVar = new d();
            a(dVar, strI);
            String str = null;
            boolean z11 = false;
            while (!z11) {
                int iF2 = this.f103933a.f();
                String strG = g(this.f103933a, this.f103934b);
                boolean z12 = strG == null || "}".equals(strG);
                if (!z12) {
                    this.f103933a.U(iF2);
                    j(this.f103933a, dVar, this.f103934b);
                }
                str = strG;
                z11 = z12;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }
}
