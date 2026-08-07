package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class TelUri {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean[] f63646f = new boolean[128];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f63647g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f63649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f63650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f63651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f63652e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f63653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f63654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f63655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f63656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f63657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ezvcard.util.b f63658f;

        public TelUri j() {
            return new TelUri(this);
        }

        private b() {
            this.f63658f = new ezvcard.util.b("a-zA-Z0-9-");
            this.f63657e = new TreeMap();
        }
    }

    static {
        for (int i11 = 48; i11 <= 57; i11++) {
            f63646f[i11] = true;
        }
        for (int i12 = 65; i12 <= 90; i12++) {
            f63646f[i12] = true;
        }
        for (int i13 = 97; i13 <= 122; i13++) {
            f63646f[i13] = true;
        }
        for (int i14 = 0; i14 < 16; i14++) {
            f63646f["!$&'()*+-.:[]_~/".charAt(i14)] = true;
        }
        f63647g = Pattern.compile("(?i)%([0-9a-f]{2})");
    }

    private static void a(String str, String str2, b bVar) {
        String strB = b(str2);
        if ("ext".equalsIgnoreCase(str)) {
            bVar.f63654b = strB;
            return;
        }
        if ("isub".equalsIgnoreCase(str)) {
            bVar.f63655c = strB;
        } else if ("phone-context".equalsIgnoreCase(str)) {
            bVar.f63656d = strB;
        } else {
            bVar.f63657e.put(str, strB);
        }
    }

    private static String b(String str) {
        Matcher matcher = f63647g.matcher(str);
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

    private static String c(String str) {
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            boolean[] zArr = f63646f;
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

    private static void d(c cVar, String str, b bVar) {
        String strD = cVar.d();
        if (bVar.f63653a == null) {
            bVar.f63653a = strD;
        } else if (str != null) {
            a(str, strD, bVar);
        } else if (strD.length() > 0) {
            a(strD, "", bVar);
        }
    }

    public static TelUri e(String str) {
        if (str.length() < 4 || !str.substring(0, 4).equalsIgnoreCase("tel:")) {
            throw xj0.b.INSTANCE.getIllegalArgumentException(18, "tel:");
        }
        b bVar = new b();
        c cVar = new c();
        String strD = null;
        for (int i11 = 4; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '=' && bVar.f63653a != null && strD == null) {
                strD = cVar.d();
            } else if (cCharAt == ';') {
                d(cVar, strD, bVar);
                strD = null;
            } else {
                cVar.a(cCharAt);
            }
        }
        d(cVar, strD, bVar);
        return bVar.j();
    }

    private static void f(String str, String str2, StringBuilder sb2) {
        sb2.append(';');
        sb2.append(str);
        sb2.append('=');
        sb2.append(c(str2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TelUri.class != obj.getClass()) {
            return false;
        }
        TelUri telUri = (TelUri) obj;
        String str = this.f63649b;
        if (str == null) {
            if (telUri.f63649b != null) {
                return false;
            }
        } else if (!str.equalsIgnoreCase(telUri.f63649b)) {
            return false;
        }
        String str2 = this.f63650c;
        if (str2 == null) {
            if (telUri.f63650c != null) {
                return false;
            }
        } else if (!str2.equalsIgnoreCase(telUri.f63650c)) {
            return false;
        }
        String str3 = this.f63648a;
        if (str3 == null) {
            if (telUri.f63648a != null) {
                return false;
            }
        } else if (!str3.equalsIgnoreCase(telUri.f63648a)) {
            return false;
        }
        Map<String, String> map = this.f63652e;
        if (map == null) {
            if (telUri.f63652e != null) {
                return false;
            }
        } else if (telUri.f63652e == null || map.size() != telUri.f63652e.size() || !h.b(this.f63652e).equals(h.b(telUri.f63652e))) {
            return false;
        }
        String str4 = this.f63651d;
        if (str4 == null) {
            if (telUri.f63651d != null) {
                return false;
            }
        } else if (!str4.equalsIgnoreCase(telUri.f63651d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f63649b;
        int iHashCode = ((str == null ? 0 : str.toLowerCase().hashCode()) + 31) * 31;
        String str2 = this.f63650c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.toLowerCase().hashCode())) * 31;
        String str3 = this.f63648a;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.toLowerCase().hashCode())) * 31;
        Map<String, String> map = this.f63652e;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : h.b(map).hashCode())) * 31;
        String str4 = this.f63651d;
        return iHashCode4 + (str4 != null ? str4.toLowerCase().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("tel:");
        sb2.append(this.f63648a);
        String str = this.f63649b;
        if (str != null) {
            f("ext", str, sb2);
        }
        String str2 = this.f63650c;
        if (str2 != null) {
            f("isub", str2, sb2);
        }
        String str3 = this.f63651d;
        if (str3 != null) {
            f("phone-context", str3, sb2);
        }
        for (Map.Entry<String, String> entry : this.f63652e.entrySet()) {
            f(entry.getKey(), entry.getValue(), sb2);
        }
        return sb2.toString();
    }

    private TelUri(b bVar) {
        this.f63648a = bVar.f63653a;
        this.f63649b = bVar.f63654b;
        this.f63650c = bVar.f63655c;
        this.f63651d = bVar.f63656d;
        this.f63652e = Collections.unmodifiableMap(bVar.f63657e);
    }
}
