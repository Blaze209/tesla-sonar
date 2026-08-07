package net.time4j.i18n;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import net.time4j.format.m;
import net.time4j.format.u;
import net.time4j.format.v;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements u, dp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f94634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<Locale> f94635b;

    static {
        String[] strArrSplit = e.h("calendar/names/iso8601/iso8601", Locale.ROOT).f("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strArrSplit);
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        f94634a = setUnmodifiableSet;
        HashSet hashSet2 = new HashSet();
        Iterator<String> it = setUnmodifiableSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(new Locale(it.next()));
        }
        for (d dVar : d.values()) {
            hashSet2.add(new Locale(dVar.name()));
        }
        f94635b = Collections.unmodifiableSet(hashSet2);
    }

    private static String[] l(Locale locale, v vVar) {
        v vVar2;
        e eVarM = m(locale);
        String[] strArrO = null;
        if (eVarM != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            v vVar3 = vVar;
            strArrO = o(eVarM, 5, n(eVarM, "ERA"), vVar3, vVar3 == v.NARROW ? v.ABBREVIATED : null, m.FORMAT, 0);
            if (strArrO == null && vVar3 != (vVar2 = v.ABBREVIATED)) {
                strArrO = l(locale, vVar2);
            }
        }
        if (strArrO != null) {
            return strArrO;
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for era and locale: " + locale, c.class.getName(), locale.toString());
    }

    private static e m(Locale locale) {
        return e.h("calendar/names/iso8601/iso8601", locale);
    }

    private static String n(e eVar, String str) {
        return (eVar.b("useShortKeys") && "true".equals(eVar.f("useShortKeys"))) ? str.substring(0, 1) : str;
    }

    private static String[] o(e eVar, int i11, String str, v vVar, v vVar2, m mVar, int i12) {
        String[] strArrO;
        String[] strArr = new String[i11];
        boolean z11 = str.length() == 1;
        for (int i13 = 0; i13 < i11; i13++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            if (z11) {
                char cCharAt = vVar.name().charAt(0);
                if (mVar != m.STANDALONE) {
                    cCharAt = Character.toLowerCase(cCharAt);
                }
                sb2.append(cCharAt);
            } else {
                sb2.append(vVar.name());
                if (mVar == m.STANDALONE) {
                    sb2.append('|');
                    sb2.append(mVar.name());
                }
            }
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            sb2.append('_');
            sb2.append(i13 + i12);
            String string = sb2.toString();
            if (eVar.b(string)) {
                strArr[i13] = eVar.f(string);
            } else {
                if (vVar2 == null || (strArrO = o(eVar, i11, str, vVar2, null, mVar, i12)) == null) {
                    return null;
                }
                strArr[i13] = strArrO[i13];
            }
        }
        return strArr;
    }

    private static String p(String str, v vVar, m mVar) {
        char cCharAt = vVar.name().charAt(0);
        if (mVar == m.FORMAT) {
            cCharAt = Character.toLowerCase(cCharAt);
        }
        return "P(" + String.valueOf(cCharAt) + ")_" + str;
    }

    private static String[] q(Locale locale, v vVar, m mVar) {
        e eVarM = m(locale);
        if (eVarM != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            String strP = p("am", vVar, mVar);
            String strP2 = p("pm", vVar, mVar);
            if (eVarM.b(strP) && eVarM.b(strP2)) {
                return new String[]{eVarM.f(strP), eVarM.f(strP2)};
            }
            if (mVar == m.STANDALONE) {
                v vVar2 = v.ABBREVIATED;
                return vVar == vVar2 ? q(locale, vVar, m.FORMAT) : q(locale, vVar2, mVar);
            }
            v vVar3 = v.ABBREVIATED;
            if (vVar != vVar3) {
                return q(locale, vVar3, mVar);
            }
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for am/pm and locale: " + locale, c.class.getName(), locale.toString());
    }

    private static String[] r(Locale locale, v vVar, m mVar) {
        String[] strArrO;
        e eVarM = m(locale);
        if (eVarM != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            v vVar2 = vVar;
            strArrO = o(eVarM, 12, n(eVarM, "MONTH_OF_YEAR"), vVar2, null, mVar, 1);
            if (strArrO == null) {
                m mVar2 = m.STANDALONE;
                if (mVar == mVar2) {
                    if (vVar2 != v.NARROW) {
                        strArrO = r(locale, vVar2, m.FORMAT);
                    }
                } else if (vVar2 == v.ABBREVIATED) {
                    strArrO = r(locale, v.WIDE, m.FORMAT);
                } else if (vVar2 == v.NARROW) {
                    strArrO = r(locale, vVar2, mVar2);
                }
            }
        } else {
            strArrO = null;
        }
        if (strArrO != null) {
            return strArrO;
        }
        throw new MissingResourceException("Cannot find ISO-8601-month for locale: " + locale, c.class.getName(), locale.toString());
    }

    private static String[] s(Locale locale, v vVar, m mVar) {
        String[] strArrO;
        e eVarM = m(locale);
        if (eVarM != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            v vVar2 = vVar;
            strArrO = o(eVarM, 4, n(eVarM, "QUARTER_OF_YEAR"), vVar2, null, mVar, 1);
            if (strArrO == null) {
                m mVar2 = m.STANDALONE;
                if (mVar == mVar2) {
                    if (vVar2 != v.NARROW) {
                        strArrO = s(locale, vVar2, m.FORMAT);
                    }
                } else if (vVar2 == v.ABBREVIATED) {
                    strArrO = s(locale, v.WIDE, m.FORMAT);
                } else if (vVar2 == v.NARROW) {
                    strArrO = s(locale, vVar2, mVar2);
                }
            }
        } else {
            strArrO = null;
        }
        if (strArrO != null) {
            return strArrO;
        }
        throw new MissingResourceException("Cannot find ISO-8601-quarter-of-year for locale: " + locale, c.class.getName(), locale.toString());
    }

    private static char t(net.time4j.format.e eVar) {
        return Character.toLowerCase(eVar.name().charAt(0));
    }

    private static String[] u(Locale locale, v vVar, m mVar) {
        String[] strArrO;
        e eVarM = m(locale);
        if (eVarM != null) {
            strArrO = o(eVarM, 7, n(eVarM, "DAY_OF_WEEK"), vVar, null, mVar, 1);
            if (strArrO == null) {
                m mVar2 = m.STANDALONE;
                if (mVar != mVar2) {
                    v vVar2 = v.ABBREVIATED;
                    if (vVar == vVar2) {
                        strArrO = u(locale, v.WIDE, m.FORMAT);
                    } else if (vVar == v.SHORT) {
                        strArrO = u(locale, vVar2, m.FORMAT);
                    } else if (vVar == v.NARROW) {
                        strArrO = u(locale, vVar, mVar2);
                    }
                } else if (vVar != v.NARROW) {
                    strArrO = u(locale, vVar, m.FORMAT);
                }
            }
        } else {
            strArrO = null;
        }
        if (strArrO != null) {
            return strArrO;
        }
        throw new MissingResourceException("Cannot find ISO-8601-day-of-week for locale: " + locale, c.class.getName(), locale.toString());
    }

    @Override // net.time4j.format.f
    public String a(net.time4j.format.e eVar, Locale locale) {
        return i(eVar, locale, false);
    }

    @Override // net.time4j.format.u
    public String[] b(String str, Locale locale, v vVar, m mVar) {
        return u(locale, vVar, mVar);
    }

    @Override // net.time4j.format.u
    public boolean c(Locale locale) {
        return f94634a.contains(d.getAlias(locale));
    }

    @Override // net.time4j.format.u
    public String[] d(String str, Locale locale, v vVar, m mVar) {
        return s(locale, vVar, mVar);
    }

    @Override // net.time4j.format.u
    public String[] e(String str, Locale locale, v vVar, m mVar, boolean z11) {
        return r(locale, vVar, mVar);
    }

    @Override // net.time4j.format.f
    public String f(net.time4j.format.e eVar, Locale locale) {
        return m(locale).f("F(" + t(eVar) + ")_d");
    }

    @Override // net.time4j.format.u
    public String[] g(String str, Locale locale, v vVar) {
        return l(locale, vVar);
    }

    @Override // net.time4j.format.u
    public String[] h(String str, Locale locale, v vVar, m mVar) {
        return q(locale, vVar, mVar);
    }

    @Override // dp0.c
    public String i(net.time4j.format.e eVar, Locale locale, boolean z11) {
        String str;
        if (z11 && eVar == net.time4j.format.e.FULL) {
            str = "F(alt)";
        } else {
            str = "F(" + t(eVar) + ")_t";
        }
        return m(locale).f(str);
    }

    @Override // net.time4j.format.u
    public boolean j(String str) {
        return "iso8601".equals(str);
    }

    @Override // net.time4j.format.f
    public String k(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale) {
        if (eVar.compareTo(eVar2) < 0) {
            eVar = eVar2;
        }
        return m(locale).f("F(" + t(eVar) + ")_dt");
    }

    public String toString() {
        return "IsoTextProviderSPI";
    }
}
