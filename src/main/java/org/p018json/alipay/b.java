package org.p018json.alipay;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f99330a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f99331b;

    public static final class a {
        private a() {
        }

        public final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public String toString() {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
    }

    public b() {
        this.f99331b = new HashMap();
    }

    public static String b(Object obj) {
        if (obj == null || obj.equals(null)) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        if (obj instanceof Number) {
            return a((Number) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof b) || (obj instanceof org.p018json.alipay.a)) {
            return obj.toString();
        }
        if (obj instanceof Map) {
            return new b((Map) obj).toString();
        }
        if (obj instanceof Collection) {
            return new org.p018json.alipay.a((Collection) obj).toString();
        }
        return obj.getClass().isArray() ? new org.p018json.alipay.a(obj).toString() : d(obj.toString());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0034. Please report as an issue. */
    public static String d(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        int i11 = 0;
        char c11 = 0;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\f') {
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"') {
                    stringBuffer.append(CoreConstants.ESCAPE_CHAR);
                } else if (cCharAt != '/') {
                    if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                str2 = "\\b";
                                break;
                            case '\t':
                                str2 = "\\t";
                                break;
                            case '\n':
                                str2 = "\\n";
                                break;
                            default:
                                if (cCharAt < ' ' || ((cCharAt >= 128 && cCharAt < 160) || (cCharAt >= 8192 && cCharAt < 8448))) {
                                    String str3 = "000" + Integer.toHexString(cCharAt);
                                    str2 = "\\u" + str3.substring(str3.length() - 4);
                                }
                                break;
                        }
                        i11++;
                        c11 = cCharAt;
                    } else {
                        stringBuffer.append(CoreConstants.ESCAPE_CHAR);
                    }
                } else if (c11 == '<') {
                    stringBuffer.append(CoreConstants.ESCAPE_CHAR);
                }
                stringBuffer.append(cCharAt);
                i11++;
                c11 = cCharAt;
            } else {
                str2 = "\\r";
            }
            stringBuffer.append(str2);
            i11++;
            c11 = cCharAt;
        }
        stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        return stringBuffer.toString();
    }

    public Object a(String str) throws JSONException {
        Object objC = c(str);
        if (objC != null) {
            return objC;
        }
        throw new JSONException("JSONObject[" + d(str) + "] not found.");
    }

    public Object c(String str) {
        if (str == null) {
            return null;
        }
        return this.f99331b.get(str);
    }

    public Object e(String str) {
        return this.f99331b.remove(str);
    }

    public String toString() {
        try {
            Iterator itA = a();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (itA.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(CoreConstants.COMMA_CHAR);
                }
                Object next = itA.next();
                stringBuffer.append(d(next.toString()));
                stringBuffer.append(CoreConstants.COLON_CHAR);
                stringBuffer.append(b(this.f99331b.get(next)));
            }
            stringBuffer.append(CoreConstants.CURLY_RIGHT);
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public b(String str) {
        this(new c(str));
    }

    public static String a(Number number) throws JSONException {
        if (number == null) {
            throw new JSONException("Null pointer");
        }
        a((Object) number);
        String string = number.toString();
        if (string.indexOf(46) <= 0 || string.indexOf(101) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith(WebrtcBuildVersion.maint_version)) {
            string = string.substring(0, string.length() - 1);
        }
        return string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
    }

    public boolean b(String str) {
        return this.f99331b.containsKey(str);
    }

    public b(Map map) {
        this.f99331b = map == null ? new HashMap() : map;
    }

    public Iterator a() {
        return this.f99331b.keySet().iterator();
    }

    public b(c cVar) throws JSONException {
        this();
        if (cVar.c() != '{') {
            throw cVar.a("A JSONObject text must begin with '{'");
        }
        while (true) {
            char c11 = cVar.c();
            if (c11 == 0) {
                throw cVar.a("A JSONObject text must end with '}'");
            }
            if (c11 == '}') {
                return;
            }
            cVar.a();
            String string = cVar.d().toString();
            char c12 = cVar.c();
            if (c12 == '=') {
                if (cVar.b() != '>') {
                    cVar.a();
                }
            } else if (c12 != ':') {
                throw cVar.a("Expected a ':' after a key");
            }
            a(string, cVar.d());
            char c13 = cVar.c();
            if (c13 != ',' && c13 != ';') {
                if (c13 != '}') {
                    throw cVar.a("Expected a ',' or '}'");
                }
                return;
            } else if (cVar.c() == '}') {
                return;
            } else {
                cVar.a();
            }
        }
    }

    public b a(String str, Object obj) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        if (obj == null) {
            e(str);
            return this;
        }
        a(obj);
        this.f99331b.put(str, obj);
        return this;
    }

    public static void a(Object obj) throws JSONException {
        if (obj != null) {
            if (obj instanceof Double) {
                Double d11 = (Double) obj;
                if (d11.isInfinite() || d11.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
                return;
            }
            if (obj instanceof Float) {
                Float f11 = (Float) obj;
                if (f11.isInfinite() || f11.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }
}
