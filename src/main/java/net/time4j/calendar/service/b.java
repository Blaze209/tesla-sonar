package net.time4j.calendar.service;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import net.time4j.format.m;
import net.time4j.format.u;
import net.time4j.format.v;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f94097a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f94098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f94099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<Locale> f94100d;

    static {
        String[] strArrSplit = net.time4j.i18n.e.h("calendar/names/generic/generic", Locale.ROOT).f("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strArrSplit);
        hashSet.add("");
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        f94099c = setUnmodifiableSet;
        HashSet hashSet2 = new HashSet();
        for (String str : setUnmodifiableSet) {
            if (str.isEmpty()) {
                hashSet2.add(Locale.ROOT);
            } else {
                hashSet2.add(new Locale(str));
            }
        }
        f94100d = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("buddhist");
        hashSet3.add("chinese");
        hashSet3.add("coptic");
        hashSet3.add("dangi");
        hashSet3.add("ethiopic");
        hashSet3.add("frenchrev");
        hashSet3.add("hindu");
        hashSet3.add("generic");
        hashSet3.add("hebrew");
        hashSet3.add("indian");
        hashSet3.add("islamic");
        hashSet3.add("japanese");
        hashSet3.add("juche");
        hashSet3.add("persian");
        hashSet3.add("roc");
        hashSet3.add("vietnam");
        f94098b = Collections.unmodifiableSet(hashSet3);
    }

    private static int a(String str) {
        if (str.equals("hindu")) {
            return 6;
        }
        return (str.equals("ethiopic") || str.equals("generic") || str.equals("roc") || str.equals("buddhist") || str.equals("korean")) ? 2 : 1;
    }

    private static int f(String str) {
        return (str.equals("coptic") || str.equals("ethiopic") || str.equals("generic") || str.equals("hebrew")) ? 13 : 12;
    }

    static net.time4j.i18n.e i(String str, Locale locale) {
        String str2 = "calendar/names/" + str + "/" + str;
        if (!f94099c.contains(net.time4j.i18n.d.getAlias(locale))) {
            locale = Locale.ROOT;
        }
        return net.time4j.i18n.e.h(str2, locale);
    }

    private static String k(net.time4j.i18n.e eVar, String str) {
        return (eVar.b("useShortKeys") && "true".equals(eVar.f("useShortKeys"))) ? str.substring(0, 1) : str;
    }

    private static String[] l(net.time4j.i18n.e eVar, String str, String str2, int i11, String str3, v vVar, m mVar, boolean z11, int i12) {
        String[] strArr = new String[i11];
        boolean z12 = str3.length() == 1;
        for (int i13 = 0; i13 < i11; i13++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            if (z12) {
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
                if (z11) {
                    sb2.append('|');
                    sb2.append("LEAP");
                }
            }
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            sb2.append('_');
            sb2.append(i13 + i12);
            if (z11 && i13 == 6 && str.equals("hebrew")) {
                sb2.append('L');
            }
            String string = sb2.toString();
            if (!eVar.b(string)) {
                return null;
            }
            String strF = eVar.f(string);
            if (z11 && str.equals("chinese")) {
                strF = m(strF, str2, vVar, mVar);
            }
            strArr[i13] = strF;
        }
        return strArr;
    }

    private static String m(String str, String str2, v vVar, m mVar) {
        if (str2.equals("en")) {
            if (vVar == v.NARROW) {
                return IntegerTokenConverter.CONVERTER_KEY + str;
            }
            return "(leap) " + str;
        }
        if (str2.equals("de") || str2.equals("es") || str2.equals("fr") || str2.equals("it") || str2.equals("pt") || str2.equals("ro")) {
            if (vVar == v.NARROW) {
                return IntegerTokenConverter.CONVERTER_KEY + str;
            }
            return "(i) " + str;
        }
        if (str2.equals("ja")) {
            return "閏" + str;
        }
        if (str2.equals("ko")) {
            return "윤" + str;
        }
        if (str2.equals("zh")) {
            return "閏" + str;
        }
        if (!str2.equals("vi")) {
            return Marker.ANY_MARKER + str;
        }
        if (vVar == v.NARROW) {
            return str + "n";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(mVar == m.STANDALONE ? " Nhuận" : " nhuận");
        return sb2.toString();
    }

    @Override // net.time4j.format.u
    public String[] b(String str, Locale locale, v vVar, m mVar) {
        return f94097a;
    }

    @Override // net.time4j.format.u
    public boolean c(Locale locale) {
        return true;
    }

    @Override // net.time4j.format.u
    public String[] d(String str, Locale locale, v vVar, m mVar) {
        return f94097a;
    }

    @Override // net.time4j.format.u
    public String[] e(String str, Locale locale, v vVar, m mVar, boolean z11) {
        String str2 = str;
        v vVar2 = vVar;
        if (str2.equals("roc") || str2.equals("buddhist")) {
            List<String> listB = net.time4j.format.b.d(locale).l(vVar2, mVar).b();
            return (String[]) listB.toArray(new String[listB.size()]);
        }
        if (str2.equals("japanese")) {
            return new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        }
        if (str2.equals("dangi") || str2.equals("vietnam")) {
            str2 = "chinese";
        } else if (str2.equals("hindu")) {
            str2 = "indian";
        } else if (str2.equals("juche")) {
            return (String[]) net.time4j.format.b.d(locale).l(vVar2, mVar).b().toArray(new String[12]);
        }
        String str3 = str2;
        net.time4j.i18n.e eVarI = i(str3, locale);
        if (vVar2 == v.SHORT) {
            vVar2 = v.ABBREVIATED;
        }
        v vVar3 = vVar2;
        String[] strArrL = l(eVarI, str3, locale.getLanguage(), f(str3), k(eVarI, "MONTH_OF_YEAR"), vVar3, mVar, z11, 1);
        if (strArrL == null) {
            m mVar2 = m.STANDALONE;
            if (mVar == mVar2) {
                if (vVar3 != v.NARROW) {
                    strArrL = e(str3, locale, vVar3, m.FORMAT, z11);
                }
            } else if (vVar3 == v.ABBREVIATED) {
                strArrL = e(str3, locale, v.WIDE, m.FORMAT, z11);
            } else if (vVar3 == v.NARROW) {
                strArrL = e(str3, locale, vVar3, mVar2, z11);
            }
        }
        if (strArrL != null) {
            return strArrL;
        }
        throw new MissingResourceException("Cannot find calendar month.", b.class.getName(), locale.toString());
    }

    @Override // net.time4j.format.u
    public String[] g(String str, Locale locale, v vVar) {
        v vVar2;
        if (str.equals("chinese") || str.equals("vietnam")) {
            return f94097a;
        }
        if (str.equals("japanese")) {
            return vVar == v.NARROW ? new String[]{Gender.MALE, "T", "S", "H"} : new String[]{"Meiji", "Taishō", "Shōwa", "Heisei"};
        }
        if (str.equals("dangi") || str.equals("juche")) {
            String[] strArrG = g("korean", locale, vVar);
            return new String[]{str.equals("dangi") ? strArrG[0] : strArrG[1]};
        }
        net.time4j.i18n.e eVarI = i(str, locale);
        if (vVar == v.SHORT) {
            vVar = v.ABBREVIATED;
        }
        v vVar3 = vVar;
        String[] strArrL = l(eVarI, str, locale.getLanguage(), a(str), k(eVarI, "ERA"), vVar3, m.FORMAT, false, 0);
        if (strArrL == null && vVar3 != (vVar2 = v.ABBREVIATED)) {
            strArrL = g(str, locale, vVar2);
        }
        if (strArrL != null) {
            return strArrL;
        }
        throw new MissingResourceException("Cannot find calendar resource for era.", b.class.getName(), locale.toString());
    }

    @Override // net.time4j.format.u
    public String[] h(String str, Locale locale, v vVar, m mVar) {
        return f94097a;
    }

    @Override // net.time4j.format.u
    public boolean j(String str) {
        return f94098b.contains(str);
    }

    public String toString() {
        return "GenericTextProviderSPI";
    }
}
