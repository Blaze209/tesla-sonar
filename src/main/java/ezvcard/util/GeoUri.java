package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class GeoUri {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean[] f63623g = new boolean[128];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f63624h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f63625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f63626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Double f63627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f63628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Double f63629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f63630f;

    static {
        for (int i11 = 48; i11 <= 57; i11++) {
            f63623g[i11] = true;
        }
        for (int i12 = 65; i12 <= 90; i12++) {
            f63623g[i12] = true;
        }
        for (int i13 = 97; i13 <= 122; i13++) {
            f63623g[i13] = true;
        }
        for (int i14 = 0; i14 < 15; i14++) {
            f63623g["!$&'()*+-.:[]_~".charAt(i14)] = true;
        }
        f63624h = Pattern.compile("(?i)%([0-9a-f]{2})");
    }

    private static void g(String str, String str2, b bVar) {
        String strH = h(str2);
        if ("crs".equalsIgnoreCase(str)) {
            bVar.f63634d = strH;
            return;
        }
        if ("u".equalsIgnoreCase(str)) {
            try {
                bVar.f63635e = Double.valueOf(strH);
                return;
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f63636f.put(str, strH);
    }

    private static String h(String str) {
        Matcher matcher = f63624h.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer(str.length());
            }
            matcher.appendReplacement(stringBuffer, Character.toString((char) Integer.parseInt(matcher.group(1), 16)));
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static String i(String str) {
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            boolean[] zArr = f63623g;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(str.length() * 2);
                    sb2.append(str.substring(0, i11));
                }
                String string = Integer.toString(cCharAt, 16);
                sb2.append(CoreConstants.PERCENT_CHAR);
                sb2.append(string);
            } else if (sb2 != null) {
                sb2.append(cCharAt);
            }
        }
        return sb2 == null ? str : sb2.toString();
    }

    private static void l(c cVar, b bVar) {
        String strD = cVar.d();
        if (bVar.f63631a == null) {
            try {
                bVar.f63631a = Double.valueOf(Double.parseDouble(strD));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException(xj0.b.INSTANCE.getExceptionMessage(22, "A"), e11);
            }
        } else if (bVar.f63632b == null) {
            try {
                bVar.f63632b = Double.valueOf(Double.parseDouble(strD));
            } catch (NumberFormatException e12) {
                throw new IllegalArgumentException(xj0.b.INSTANCE.getExceptionMessage(22, "B"), e12);
            }
        } else if (bVar.f63633c == null) {
            try {
                bVar.f63633c = Double.valueOf(Double.parseDouble(strD));
            } catch (NumberFormatException e13) {
                throw new IllegalArgumentException(xj0.b.INSTANCE.getExceptionMessage(22, "C"), e13);
            }
        }
    }

    private static void m(c cVar, String str, b bVar) {
        String strD = cVar.d();
        if (str != null) {
            g(str, strD, bVar);
        } else if (strD.length() > 0) {
            g(strD, "", bVar);
        }
    }

    public static GeoUri n(String str) {
        if (str.length() < 4 || !str.substring(0, 4).equalsIgnoreCase("geo:")) {
            throw xj0.b.INSTANCE.getIllegalArgumentException(18, "geo:");
        }
        b bVar = new b(null, null);
        c cVar = new c();
        boolean z11 = false;
        String strD = null;
        for (int i11 = 4; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',' && !z11) {
                l(cVar, bVar);
            } else if (cCharAt == ';') {
                if (z11) {
                    m(cVar, strD, bVar);
                    strD = null;
                } else {
                    l(cVar, bVar);
                    if (bVar.f63632b == null) {
                        throw xj0.b.INSTANCE.getIllegalArgumentException(21, new Object[0]);
                    }
                    z11 = true;
                }
            } else if (cCharAt == '=' && z11 && strD == null) {
                strD = cVar.d();
            } else {
                cVar.a(cCharAt);
            }
        }
        if (z11) {
            m(cVar, strD, bVar);
        } else {
            l(cVar, bVar);
            if (bVar.f63632b == null) {
                throw xj0.b.INSTANCE.getIllegalArgumentException(21, new Object[0]);
            }
        }
        return bVar.l();
    }

    private void p(String str, String str2, StringBuilder sb2) {
        sb2.append(';');
        sb2.append(str);
        sb2.append('=');
        sb2.append(i(str2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeoUri.class != obj.getClass()) {
            return false;
        }
        GeoUri geoUri = (GeoUri) obj;
        Double d11 = this.f63625a;
        if (d11 == null) {
            if (geoUri.f63625a != null) {
                return false;
            }
        } else if (!d11.equals(geoUri.f63625a)) {
            return false;
        }
        Double d12 = this.f63626b;
        if (d12 == null) {
            if (geoUri.f63626b != null) {
                return false;
            }
        } else if (!d12.equals(geoUri.f63626b)) {
            return false;
        }
        Double d13 = this.f63627c;
        if (d13 == null) {
            if (geoUri.f63627c != null) {
                return false;
            }
        } else if (!d13.equals(geoUri.f63627c)) {
            return false;
        }
        String str = this.f63628d;
        if (str == null) {
            if (geoUri.f63628d != null) {
                return false;
            }
        } else if (!str.equalsIgnoreCase(geoUri.f63628d)) {
            return false;
        }
        Double d14 = this.f63629e;
        if (d14 == null) {
            if (geoUri.f63629e != null) {
                return false;
            }
        } else if (!d14.equals(geoUri.f63629e)) {
            return false;
        }
        Map<String, String> map = this.f63630f;
        if (map == null) {
            if (geoUri.f63630f != null) {
                return false;
            }
        } else if (geoUri.f63630f == null || map.size() != geoUri.f63630f.size() || !h.b(this.f63630f).equals(h.b(geoUri.f63630f))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Double d11 = this.f63625a;
        int iHashCode = ((d11 == null ? 0 : d11.hashCode()) + 31) * 31;
        Double d12 = this.f63626b;
        int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f63627c;
        int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str = this.f63628d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.toLowerCase().hashCode())) * 31;
        Map<String, String> map = this.f63630f;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : h.b(map).hashCode())) * 31;
        Double d14 = this.f63629e;
        return iHashCode5 + (d14 != null ? d14.hashCode() : 0);
    }

    public Double j() {
        return this.f63625a;
    }

    public Double k() {
        return this.f63626b;
    }

    public String o(int i11) {
        j jVar = new j(i11);
        StringBuilder sb2 = new StringBuilder("geo:");
        sb2.append(jVar.format(this.f63625a));
        sb2.append(CoreConstants.COMMA_CHAR);
        sb2.append(jVar.format(this.f63626b));
        if (this.f63627c != null) {
            sb2.append(CoreConstants.COMMA_CHAR);
            sb2.append(this.f63627c);
        }
        String str = this.f63628d;
        if (str != null && !str.equalsIgnoreCase("wgs84")) {
            p("crs", this.f63628d, sb2);
        }
        Double d11 = this.f63629e;
        if (d11 != null) {
            p("u", jVar.format(d11), sb2);
        }
        for (Map.Entry<String, String> entry : this.f63630f.entrySet()) {
            p(entry.getKey(), entry.getValue(), sb2);
        }
        return sb2.toString();
    }

    public String toString() {
        return o(6);
    }

    private GeoUri(b bVar) {
        Double dValueOf = Double.valueOf(0.0d);
        this.f63625a = bVar.f63631a == null ? dValueOf : bVar.f63631a;
        this.f63626b = bVar.f63632b != null ? bVar.f63632b : dValueOf;
        this.f63627c = bVar.f63633c;
        this.f63628d = bVar.f63634d;
        this.f63629e = bVar.f63635e;
        this.f63630f = Collections.unmodifiableMap(bVar.f63636f);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f63631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f63632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Double f63633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f63634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Double f63635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f63636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ezvcard.util.b f63637g;

        public b(Double d11, Double d12) {
            this.f63637g = new ezvcard.util.b("a-zA-Z0-9-");
            this.f63636f = new LinkedHashMap(0);
            m(d11);
            n(d12);
        }

        public GeoUri l() {
            return new GeoUri(this);
        }

        public b m(Double d11) {
            this.f63631a = d11;
            return this;
        }

        public b n(Double d11) {
            this.f63632b = d11;
            return this;
        }

        public b(GeoUri geoUri) {
            this.f63637g = new ezvcard.util.b("a-zA-Z0-9-");
            m(geoUri.f63625a);
            n(geoUri.f63626b);
            this.f63633c = geoUri.f63627c;
            this.f63634d = geoUri.f63628d;
            this.f63635e = geoUri.f63629e;
            this.f63636f = new LinkedHashMap(geoUri.f63630f);
        }
    }
}
