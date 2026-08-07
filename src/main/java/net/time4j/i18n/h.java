package net.time4j.i18n;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import java.util.MissingResourceException;
import net.time4j.format.n;
import net.time4j.format.r;
import net.time4j.format.v;
import net.time4j.x0;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements r {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94655a;

        static {
            int[] iArr = new int[v.values().length];
            f94655a = iArr;
            try {
                iArr[v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94655a[v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94655a[v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94655a[v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static String F(char c11, v vVar, n nVar) {
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c11);
        int i11 = a.f94655a[vVar.ordinal()];
        if (i11 == 1) {
            sb2.append('w');
        } else if (i11 == 2 || i11 == 3) {
            sb2.append('s');
        } else {
            if (i11 != 4) {
                throw new UnsupportedOperationException(vVar.name());
            }
            sb2.append('n');
        }
        sb2.append(nVar.ordinal());
        return sb2.toString();
    }

    private static String G(char c11, boolean z11, n nVar) {
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c11);
        sb2.append(z11 ? '+' : CoreConstants.DASH_CHAR);
        sb2.append(nVar.ordinal());
        return sb2.toString();
    }

    private static String H(v vVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('L');
        int i11 = a.f94655a[vVar.ordinal()];
        if (i11 == 1) {
            sb2.append('w');
        } else if (i11 == 2 || i11 == 3) {
            sb2.append('s');
        } else {
            if (i11 != 4) {
                throw new UnsupportedOperationException(vVar.name());
            }
            sb2.append('n');
        }
        sb2.append(CoreConstants.DASH_CHAR);
        sb2.append(str);
        return sb2.toString();
    }

    private String I(Locale locale, String str) {
        boolean z11 = true;
        e eVar = null;
        for (Locale locale2 : e.c(locale)) {
            e eVarH = (!z11 || eVar == null) ? e.h("i18n/reltime/relpattern", locale2) : eVar;
            if (z11) {
                if (locale2.equals(eVarH.e())) {
                    z11 = false;
                } else {
                    eVar = eVarH;
                }
            }
            if (eVarH.d().contains(str)) {
                return eVarH.f(str);
            }
        }
        return "";
    }

    private String J(Locale locale, String str, String str2, String str3, n nVar) throws Throwable {
        boolean z11 = true;
        e eVar = null;
        for (Locale locale2 : e.c(locale)) {
            e eVarH = (!z11 || eVar == null) ? e.h("i18n/" + str, locale2) : eVar;
            if (z11) {
                if (locale2.equals(eVarH.e())) {
                    z11 = false;
                } else {
                    eVar = eVarH;
                }
            }
            if (eVarH.d().contains(str2)) {
                return eVarH.f(str2);
            }
            if (nVar != n.OTHER && eVarH.d().contains(str3)) {
                return eVarH.f(str3);
            }
        }
        throw new MissingResourceException("Can't find resource for bundle " + str + ".properties, key " + str2, str + ".properties", str2);
    }

    private String K(Locale locale, char c11, boolean z11, n nVar) {
        return J(locale, "reltime/relpattern", G(c11, z11, nVar), G(c11, z11, n.OTHER), nVar);
    }

    private String L(Locale locale, char c11, v vVar, n nVar) {
        return J(locale, "units/upattern", F(c11, vVar, nVar), F(c11, vVar, n.OTHER), nVar);
    }

    private static String M(String str, char c11, int i11) {
        int length = str.length();
        int i12 = length - 2;
        for (int i13 = 0; i13 < i12; i13++) {
            if (str.charAt(i13) == '{') {
                int i14 = i13 + 1;
                if (str.charAt(i14) == c11) {
                    int i15 = i13 + 2;
                    if (str.charAt(i15) == '}') {
                        StringBuilder sb2 = new StringBuilder(length + 8);
                        sb2.append(str);
                        sb2.replace(i14, i15, String.valueOf(i11));
                        return sb2.toString();
                    }
                } else {
                    continue;
                }
            }
        }
        return str;
    }

    @Override // net.time4j.format.x
    public String A(Locale locale, v vVar, n nVar) {
        return L(locale, 'W', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String B(Locale locale, boolean z11, n nVar) {
        return K(locale, 'd', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String C(Locale locale, boolean z11, n nVar) {
        return K(locale, 'Y', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String D(Locale locale, boolean z11, n nVar) {
        return K(locale, 'N', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String E(Locale locale, boolean z11, n nVar) {
        return K(locale, 'n', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String a(Locale locale) {
        return J(locale, "reltime/relpattern", "yesterday", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String b(Locale locale) {
        return J(locale, "reltime/relpattern", "now", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String c(Locale locale, boolean z11, n nVar) {
        return K(locale, 'S', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String d(Locale locale, v vVar, n nVar) {
        return L(locale, 'N', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String e(Locale locale, boolean z11, n nVar) {
        return K(locale, 'M', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String f(Locale locale) {
        return J(locale, "reltime/relpattern", "tomorrow", null, n.OTHER);
    }

    @Override // net.time4j.format.r
    public String g(x0 x0Var, Locale locale) {
        return I(locale, x0Var.name().substring(0, 3).toLowerCase() + "-");
    }

    @Override // net.time4j.format.x
    public String h(Locale locale, v vVar, n nVar) {
        return L(locale, 'M', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String i(Locale locale, v vVar, n nVar) {
        return L(locale, '9', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String j(Locale locale) {
        return J(locale, "reltime/relpattern", "today", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String k(Locale locale, v vVar, n nVar) {
        return L(locale, '3', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String l(Locale locale, boolean z11, n nVar) {
        return K(locale, 'y', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String m(Locale locale, v vVar, int i11) throws Throwable {
        int i12;
        if (i11 < 2) {
            throw new IllegalArgumentException("Size must be greater than 1.");
        }
        e eVarH = e.h("i18n/units/upattern", locale);
        String strH = H(vVar, String.valueOf(i11));
        if (eVarH.b(strH)) {
            return eVarH.f(strH);
        }
        String strF = eVarH.f(H(vVar, "end"));
        if (i11 == 2) {
            return strF;
        }
        String strF2 = eVarH.f(H(vVar, "start"));
        String strF3 = eVarH.f(H(vVar, "middle"));
        String strM = M(M(strF, '1', i11 - 1), '0', i11 - 2);
        int i13 = i11 - 3;
        String strM2 = strM;
        while (i13 >= 0) {
            String str = i13 == 0 ? strF2 : strF3;
            int length = str.length();
            int i14 = length - 1;
            while (true) {
                if (i14 < 0) {
                    i12 = -1;
                    break;
                }
                if (i14 >= 2 && str.charAt(i14) == '}' && str.charAt(i14 - 1) == '1') {
                    i12 = i14 - 2;
                    if (str.charAt(i12) == '{') {
                        break;
                    }
                }
                i14--;
            }
            if (i12 > -1) {
                strM = str.substring(0, i12) + strM2;
                if (i12 < length - 3) {
                    strM = strM + str.substring(i12 + 3);
                }
            }
            if (i13 > 0) {
                strM2 = M(strM, '0', i13);
            }
            i13--;
        }
        return strM;
    }

    @Override // net.time4j.format.x
    public String n(Locale locale, boolean z11, n nVar) {
        return K(locale, 'D', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String o(Locale locale, boolean z11, n nVar) {
        return K(locale, 'w', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String p(Locale locale, boolean z11, n nVar) {
        return K(locale, 's', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String q(x0 x0Var, Locale locale) {
        return I(locale, x0Var.name().substring(0, 3).toLowerCase() + Marker.ANY_NON_NULL_MARKER);
    }

    @Override // net.time4j.format.x
    public String r(Locale locale, v vVar, n nVar) {
        return L(locale, '6', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String s(Locale locale, boolean z11, n nVar) {
        return K(locale, 'm', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String t(Locale locale, boolean z11, n nVar) {
        return K(locale, 'h', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String u(Locale locale, v vVar, n nVar) {
        return L(locale, 'H', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String v(Locale locale, boolean z11, n nVar) {
        return K(locale, 'W', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String w(Locale locale, v vVar, n nVar) {
        return L(locale, 'Y', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String x(Locale locale, v vVar, n nVar) {
        return L(locale, 'S', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String y(Locale locale, boolean z11, n nVar) {
        return K(locale, 'H', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String z(Locale locale, v vVar, n nVar) {
        return L(locale, 'D', vVar, nVar);
    }
}
