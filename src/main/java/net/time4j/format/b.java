package net.time4j.format;

import ch.qos.logback.core.CoreConstants;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Set<String> f94198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final f f94199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final u f94200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final u f94201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final ConcurrentMap<String, b> f94202p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<v, Map<m, s>> f94204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<v, Map<m, s>> f94205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<v, Map<m, s>> f94206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<v, Map<m, s>> f94207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<v, Map<m, s>> f94208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<v, s> f94209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, String> f94210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f94211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Locale f94212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final MissingResourceException f94213k;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f94215b;

        static {
            int[] iArr = new int[e.values().length];
            f94215b = iArr;
            try {
                iArr[e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94215b[e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94215b[e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94215b[e.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[v.values().length];
            f94214a = iArr2;
            try {
                iArr2[v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94214a[v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94214a[v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f94214a[v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: net.time4j.format.b$b, reason: collision with other inner class name */
    private static class C2010b implements u {
        private C2010b() {
        }

        @Override // net.time4j.format.u
        public String[] b(String str, Locale locale, v vVar, m mVar) {
            return new String[]{"1", "2", "3", "4", "5", "6", "7"};
        }

        @Override // net.time4j.format.u
        public boolean c(Locale locale) {
            return true;
        }

        @Override // net.time4j.format.u
        public String[] d(String str, Locale locale, v vVar, m mVar) {
            return vVar == v.NARROW ? new String[]{"1", "2", "3", "4"} : new String[]{"Q1", "Q2", "Q3", "Q4"};
        }

        @Override // net.time4j.format.u
        public String[] e(String str, Locale locale, v vVar, m mVar, boolean z11) {
            return vVar == v.WIDE ? new String[]{"01", "02", "03", WebrtcBuildVersion.webrtc_commit, "05", "06", "07", "08", "09", "10", "11", "12", "13"} : new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        }

        @Override // net.time4j.format.u
        public String[] g(String str, Locale locale, v vVar) {
            return vVar == v.NARROW ? new String[]{"B", "A"} : new String[]{BouncyCastleProvider.PROVIDER_NAME, "AD"};
        }

        @Override // net.time4j.format.u
        public String[] h(String str, Locale locale, v vVar, m mVar) {
            return vVar == v.NARROW ? new String[]{"A", "P"} : new String[]{"AM", "PM"};
        }

        @Override // net.time4j.format.u
        public boolean j(String str) {
            return true;
        }

        public String toString() {
            return "FallbackProvider";
        }

        /* synthetic */ C2010b(a aVar) {
            this();
        }
    }

    private static class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f94216a;

        c(f fVar) {
            this.f94216a = fVar;
        }

        private static String b(DateFormat dateFormat) {
            if (dateFormat instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) SimpleDateFormat.class.cast(dateFormat)).toPattern();
            }
            throw new IllegalStateException("Cannot retrieve format pattern: " + dateFormat);
        }

        private static int c(e eVar) {
            int i11 = a.f94215b[eVar.ordinal()];
            if (i11 == 1) {
                return 0;
            }
            if (i11 == 2) {
                return 1;
            }
            if (i11 == 3) {
                return 2;
            }
            if (i11 == 4) {
                return 3;
            }
            throw new UnsupportedOperationException("Unknown: " + eVar);
        }

        @Override // net.time4j.format.f
        public String a(e eVar, Locale locale) {
            String strI;
            f fVar = this.f94216a;
            if (fVar == null) {
                strI = b(DateFormat.getTimeInstance(c(eVar), locale));
            } else {
                strI = fVar instanceof dp0.c ? ((dp0.c) dp0.c.class.cast(fVar)).i(eVar, locale, true) : fVar.a(eVar, locale);
            }
            return dp0.d.a(strI);
        }

        @Override // net.time4j.format.f
        public String f(e eVar, Locale locale) {
            f fVar = this.f94216a;
            return fVar == null ? b(DateFormat.getDateInstance(c(eVar), locale)) : fVar.f(eVar, locale);
        }

        @Override // net.time4j.format.f
        public String k(e eVar, e eVar2, Locale locale) {
            f fVar = this.f94216a;
            if (fVar == null) {
                return b(DateFormat.getDateTimeInstance(c(eVar), c(eVar2), locale));
            }
            return this.f94216a.k(eVar, eVar2, locale).replace("{1}", this.f94216a.f(eVar, locale)).replace("{0}", fVar.a(eVar2, locale));
        }
    }

    private static class d implements u {
        private d() {
        }

        private static String[] a(String[] strArr, int i11) {
            String[] strArr2 = new String[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                if (strArr[i12].isEmpty()) {
                    strArr2[i12] = String.valueOf(i12 + 1);
                } else {
                    strArr2[i12] = f(strArr[i12]);
                }
            }
            return strArr2;
        }

        private static String f(String str) {
            char cCharAt = Normalizer.normalize(str, Normalizer.Form.NFD).charAt(0);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                return String.valueOf(cCharAt);
            }
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                return String.valueOf((char) (cCharAt - ' '));
            }
            if (cCharAt < 1040 || cCharAt > 1071) {
                return (cCharAt < 1072 || cCharAt > 1103) ? str : String.valueOf((char) (cCharAt - ' '));
            }
            return String.valueOf(cCharAt);
        }

        @Override // net.time4j.format.u
        public String[] b(String str, Locale locale, v vVar, m mVar) {
            String[] weekdays;
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            int i11 = a.f94214a[vVar.ordinal()];
            if (i11 == 1) {
                weekdays = dateFormatSymbols.getWeekdays();
            } else if (i11 == 2 || i11 == 3) {
                weekdays = dateFormatSymbols.getShortWeekdays();
            } else {
                if (i11 != 4) {
                    throw new UnsupportedOperationException("Unknown text width: " + vVar);
                }
                weekdays = a(b("", locale, v.SHORT, mVar), 7);
            }
            if (weekdays.length <= 7) {
                return weekdays;
            }
            String str2 = weekdays[1];
            String[] strArr = new String[7];
            System.arraycopy(weekdays, 2, strArr, 0, 6);
            strArr[6] = str2;
            return strArr;
        }

        @Override // net.time4j.format.u
        public boolean c(Locale locale) {
            String language = locale.getLanguage();
            for (Locale locale2 : DateFormatSymbols.getAvailableLocales()) {
                if (locale2.getLanguage().equals(language)) {
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.format.u
        public String[] d(String str, Locale locale, v vVar, m mVar) {
            return new String[]{"Q1", "Q2", "Q3", "Q4"};
        }

        @Override // net.time4j.format.u
        public String[] e(String str, Locale locale, v vVar, m mVar, boolean z11) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            int i11 = a.f94214a[vVar.ordinal()];
            if (i11 == 1) {
                return dateFormatSymbols.getMonths();
            }
            if (i11 == 2 || i11 == 3) {
                return dateFormatSymbols.getShortMonths();
            }
            if (i11 == 4) {
                return a(dateFormatSymbols.getShortMonths(), 12);
            }
            throw new UnsupportedOperationException(vVar.name());
        }

        @Override // net.time4j.format.u
        public String[] g(String str, Locale locale, v vVar) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            if (vVar != v.NARROW) {
                return dateFormatSymbols.getEras();
            }
            String[] eras = dateFormatSymbols.getEras();
            String[] strArr = new String[eras.length];
            int length = eras.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!eras[i11].isEmpty()) {
                    strArr[i11] = f(eras[i11]);
                } else if (i11 == 0 && eras.length == 2) {
                    strArr[i11] = "B";
                } else if (i11 == 1 && eras.length == 2) {
                    strArr[i11] = "A";
                } else {
                    strArr[i11] = String.valueOf(i11);
                }
            }
            return strArr;
        }

        @Override // net.time4j.format.u
        public String[] h(String str, Locale locale, v vVar, m mVar) {
            return vVar == v.NARROW ? new String[]{"A", "P"} : DateFormatSymbols.getInstance(locale).getAmPmStrings();
        }

        @Override // net.time4j.format.u
        public boolean j(String str) {
            return "iso8601".equals(str);
        }

        public String toString() {
            return "JDKTextProvider";
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("ar");
        hashSet.add("dv");
        hashSet.add("fa");
        hashSet.add("ha");
        hashSet.add("he");
        hashSet.add("iw");
        hashSet.add("ji");
        hashSet.add("ps");
        hashSet.add("sd");
        hashSet.add("ug");
        hashSet.add("ur");
        hashSet.add("yi");
        f94198l = Collections.unmodifiableSet(hashSet);
        Iterator it = net.time4j.base.d.c().g(f.class).iterator();
        f94199m = new c(it.hasNext() ? (f) it.next() : new net.time4j.i18n.c());
        a aVar = null;
        f94200n = new d(aVar);
        f94201o = new C2010b(aVar);
        f94202p = new ConcurrentHashMap();
    }

    private b(String str, Locale locale, u uVar) throws Throwable {
        this.f94203a = uVar.toString();
        int i11 = 0;
        Map<v, Map<m, s>> mapUnmodifiableMap = Collections.unmodifiableMap(i(str, locale, uVar, false));
        this.f94204b = mapUnmodifiableMap;
        Map<v, Map<m, s>> mapI = i(str, locale, uVar, true);
        if (mapI == null) {
            this.f94205c = mapUnmodifiableMap;
        } else {
            this.f94205c = Collections.unmodifiableMap(mapI);
        }
        EnumMap enumMap = new EnumMap(v.class);
        v[] vVarArrValues = v.values();
        int length = vVarArrValues.length;
        int i12 = 0;
        while (i12 < length) {
            v vVar = vVarArrValues[i12];
            EnumMap enumMap2 = new EnumMap(m.class);
            m[] mVarArrValues = m.values();
            int length2 = mVarArrValues.length;
            int i13 = i11;
            while (i13 < length2) {
                m mVar = mVarArrValues[i13];
                enumMap2.put(mVar, new s(uVar.d(str, locale, vVar, mVar)));
                i13++;
                vVarArrValues = vVarArrValues;
            }
            enumMap.put(vVar, enumMap2);
            i12++;
            i11 = 0;
        }
        this.f94206d = Collections.unmodifiableMap(enumMap);
        EnumMap enumMap3 = new EnumMap(v.class);
        v[] vVarArrValues2 = v.values();
        int length3 = vVarArrValues2.length;
        for (int i14 = 0; i14 < length3; i14++) {
            v vVar2 = vVarArrValues2[i14];
            EnumMap enumMap4 = new EnumMap(m.class);
            m[] mVarArrValues2 = m.values();
            int length4 = mVarArrValues2.length;
            int i15 = 0;
            while (i15 < length4) {
                m mVar2 = mVarArrValues2[i15];
                enumMap4.put(mVar2, new s(uVar.b(str, locale, vVar2, mVar2)));
                i15++;
                vVarArrValues2 = vVarArrValues2;
                length3 = length3;
            }
            enumMap3.put(vVar2, enumMap4);
        }
        this.f94207e = Collections.unmodifiableMap(enumMap3);
        EnumMap enumMap5 = new EnumMap(v.class);
        for (v vVar3 : v.values()) {
            enumMap5.put(vVar3, new s(uVar.g(str, locale, vVar3)));
        }
        this.f94209g = Collections.unmodifiableMap(enumMap5);
        EnumMap enumMap6 = new EnumMap(v.class);
        v[] vVarArrValues3 = v.values();
        int length5 = vVarArrValues3.length;
        for (int i16 = 0; i16 < length5; i16++) {
            v vVar4 = vVarArrValues3[i16];
            EnumMap enumMap7 = new EnumMap(m.class);
            m[] mVarArrValues3 = m.values();
            int length6 = mVarArrValues3.length;
            int i17 = 0;
            while (i17 < length6) {
                m mVar3 = mVarArrValues3[i17];
                enumMap7.put(mVar3, new s(uVar.h(str, locale, vVar4, mVar3)));
                i17++;
                vVarArrValues3 = vVarArrValues3;
            }
            enumMap6.put(vVar4, enumMap7);
        }
        this.f94208f = Collections.unmodifiableMap(enumMap6);
        HashMap map = new HashMap();
        try {
            net.time4j.i18n.e eVarH = net.time4j.i18n.e.h("calendar/names/" + str + "/" + str, locale);
            for (String str2 : eVarH.g()) {
                map.put(str2, eVarH.f(str2));
            }
            e = null;
        } catch (MissingResourceException e11) {
            e = e11;
        }
        this.f94210h = Collections.unmodifiableMap(map);
        this.f94211i = str;
        this.f94212j = locale;
        this.f94213k = e;
    }

    static String a(net.time4j.engine.w<?> wVar) {
        net.time4j.format.c cVar = (net.time4j.format.c) wVar.p().getAnnotation(net.time4j.format.c.class);
        return cVar == null ? "iso8601" : cVar.value();
    }

    public static b c(String str, Locale locale) {
        u uVar;
        if (str == null) {
            throw new NullPointerException("Missing calendar type.");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            sb2.append(CoreConstants.DASH_CHAR);
            sb2.append(country);
        }
        String string = sb2.toString();
        b bVar = f94202p.get(string);
        if (bVar != null) {
            return bVar;
        }
        if (locale.getLanguage().isEmpty() && str.equals("iso8601")) {
            uVar = f94201o;
        } else {
            Iterator it = net.time4j.base.d.c().g(u.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    uVar = null;
                    break;
                }
                u uVar2 = (u) it.next();
                if (uVar2.j(str) && uVar2.c(locale)) {
                    uVar = uVar2;
                    break;
                }
            }
            if (uVar == null) {
                u uVar3 = f94200n;
                if (uVar3.j(str) && uVar3.c(locale)) {
                    uVar = uVar3;
                }
                if (uVar == null) {
                    uVar = f94201o;
                }
            }
        }
        b bVar2 = new b(str, locale, uVar);
        b bVarPutIfAbsent = f94202p.putIfAbsent(string, bVar2);
        return bVarPutIfAbsent != null ? bVarPutIfAbsent : bVar2;
    }

    public static b d(Locale locale) {
        return c("iso8601", locale);
    }

    private String e(String str) {
        if (!this.f94210h.containsKey("useShortKeys") || !"true".equals(this.f94210h.get("useShortKeys"))) {
            return str;
        }
        if (str.equals("MONTH_OF_YEAR") || str.equals("DAY_OF_WEEK") || str.equals("QUARTER_OF_YEAR") || str.equals("ERA")) {
            return str.substring(0, 1);
        }
        if (str.equals("EVANGELIST")) {
            return "EV";
        }
        if (str.equals("SANSCULOTTIDES")) {
            return "S";
        }
        return str.equals("DAY_OF_DECADE") ? "D" : str;
    }

    private static String f(String str, int i11, String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            if (i11 > 0) {
                return null;
            }
            return str;
        }
        if (strArr.length < i11) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        boolean z11 = true;
        for (int i12 = 0; i12 < strArr.length - i11; i12++) {
            if (z11) {
                sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                z11 = false;
            } else {
                sb2.append('|');
            }
            sb2.append(strArr[i12]);
        }
        if (!z11) {
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return sb2.toString();
    }

    private static Map<v, Map<m, s>> i(String str, Locale locale, u uVar, boolean z11) {
        EnumMap enumMap = new EnumMap(v.class);
        boolean z12 = false;
        for (v vVar : v.values()) {
            EnumMap enumMap2 = new EnumMap(m.class);
            for (m mVar : m.values()) {
                String[] strArrE = uVar.e(str, locale, vVar, mVar, z11);
                if (z11 && !z12) {
                    z12 = !Arrays.equals(uVar.e(str, locale, vVar, mVar, false), strArrE);
                }
                enumMap2.put(mVar, new s(strArrE));
            }
            enumMap.put(vVar, enumMap2);
        }
        if (!z11 || z12) {
            return enumMap;
        }
        return null;
    }

    private s j(v vVar, m mVar, boolean z11) {
        return z11 ? this.f94205c.get(vVar).get(mVar) : this.f94204b.get(vVar).get(mVar);
    }

    public static boolean q(Locale locale) {
        return f94198l.contains(locale.getLanguage());
    }

    public static String r(e eVar, Locale locale) {
        return f94199m.f(eVar, locale);
    }

    public static String s(e eVar, e eVar2, Locale locale) {
        return f94199m.k(eVar, eVar2, locale);
    }

    public static String t(e eVar, Locale locale) {
        return f94199m.a(eVar, locale);
    }

    public static String u(e eVar, e eVar2, Locale locale) {
        return dp0.d.a(f94199m.k(eVar, eVar2, locale));
    }

    private static String v(String str, int i11, int i12) {
        return str + '_' + (i11 + i12);
    }

    public s b(v vVar) {
        return this.f94209g.get(vVar);
    }

    public s g(v vVar, m mVar) {
        return j(vVar, mVar, true);
    }

    public s h(v vVar, m mVar) {
        return this.f94208f.get(vVar).get(mVar);
    }

    public s k(v vVar, m mVar) {
        return this.f94206d.get(vVar).get(mVar);
    }

    public s l(v vVar, m mVar) {
        return j(vVar, mVar, false);
    }

    public Map<String, String> m() {
        return this.f94210h;
    }

    public <V extends Enum<V>> s n(String str, Class<V> cls, String... strArr) {
        String strV;
        if (this.f94213k != null) {
            throw new MissingResourceException(this.f94213k.getMessage(), this.f94213k.getClassName(), this.f94213k.getKey());
        }
        V[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        String[] strArr2 = new String[length];
        String strE = e(str);
        int i11 = !net.time4j.engine.i.class.isAssignableFrom(cls) ? 1 : 0;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = 0;
            while (true) {
                String strF = f(strE, i13, strArr);
                if (strF == null) {
                    strV = null;
                    break;
                }
                strV = v(strF, i12, i11);
                if (this.f94210h.containsKey(strV)) {
                    break;
                }
                i13++;
            }
            if (strV != null) {
                strArr2[i12] = this.f94210h.get(strV);
            } else if (this.f94210h.containsKey(str)) {
                strArr2[i12] = this.f94210h.get(str);
            } else {
                strArr2[i12] = enumConstants[i12].name();
            }
        }
        return new s(strArr2);
    }

    public <V extends Enum<V>> s o(net.time4j.engine.p<V> pVar, String... strArr) {
        return n(pVar.name(), pVar.getType(), strArr);
    }

    public s p(v vVar, m mVar) {
        return this.f94207e.get(vVar).get(mVar);
    }

    public String toString() {
        return this.f94203a + "(" + this.f94211i + "/" + this.f94212j + ")";
    }
}
