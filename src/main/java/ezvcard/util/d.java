package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f63666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f63667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f63668c;

    private d(String str, byte[] bArr, String str2) {
        this.f63668c = str == null ? "" : str.toLowerCase();
        this.f63666a = bArr;
        this.f63667b = str2;
    }

    public static d c(String str) {
        String str2;
        int i11 = 5;
        if (str.length() < 5 || !str.substring(0, 5).equalsIgnoreCase("data:")) {
            throw xj0.b.INSTANCE.getIllegalArgumentException(18, "data:");
        }
        byte[] bArr = null;
        boolean z11 = false;
        String lowerCase = null;
        String strSubstring = null;
        int i12 = 5;
        while (true) {
            if (i11 >= str.length()) {
                str2 = null;
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt == ';') {
                String strSubstring2 = str.substring(i12, i11);
                if (lowerCase == null) {
                    lowerCase = strSubstring2.toLowerCase();
                } else if (strSubstring2.toLowerCase().startsWith("charset=")) {
                    strSubstring = strSubstring2.substring(strSubstring2.indexOf(61) + 1);
                } else if ("base64".equalsIgnoreCase(strSubstring2)) {
                    z11 = true;
                }
                i12 = i11 + 1;
            } else if (cCharAt == ',') {
                String strSubstring3 = str.substring(i12, i11);
                if (lowerCase == null) {
                    lowerCase = strSubstring3.toLowerCase();
                } else if (strSubstring3.toLowerCase().startsWith("charset=")) {
                    strSubstring = strSubstring3.substring(strSubstring3.indexOf(61) + 1);
                } else if ("base64".equalsIgnoreCase(strSubstring3)) {
                    z11 = true;
                }
                str2 = str.substring(i11 + 1);
                break;
            }
            i11++;
        }
        if (str2 == null) {
            throw xj0.b.INSTANCE.getIllegalArgumentException(20, new Object[0]);
        }
        if (z11) {
            byte[] bArrP = ck0.a.p(str2.replaceAll("\\s", ""));
            if (strSubstring != null) {
                try {
                    str2 = new String(bArrP, strSubstring);
                } catch (UnsupportedEncodingException e11) {
                    throw new IllegalArgumentException(xj0.b.INSTANCE.getExceptionMessage(43, strSubstring), e11);
                }
            } else {
                bArr = bArrP;
                str2 = null;
            }
        }
        return new d(lowerCase, bArr, str2);
    }

    public String a() {
        return this.f63668c;
    }

    public byte[] b() {
        return this.f63666a;
    }

    public String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("data:");
        sb2.append(this.f63668c);
        if (this.f63666a != null) {
            sb2.append(";base64,");
            sb2.append(ck0.a.t(this.f63666a));
        } else {
            String str2 = this.f63667b;
            if (str2 == null) {
                sb2.append(CoreConstants.COMMA_CHAR);
            } else if (str == null) {
                sb2.append(CoreConstants.COMMA_CHAR);
                sb2.append(this.f63667b);
            } else {
                try {
                    byte[] bytes = str2.getBytes(str);
                    sb2.append(";charset=");
                    sb2.append(str);
                    sb2.append(";base64,");
                    sb2.append(ck0.a.t(bytes));
                } catch (UnsupportedEncodingException e11) {
                    throw new IllegalArgumentException(xj0.b.INSTANCE.getExceptionMessage(44, str), e11);
                }
            }
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f63668c.equals(dVar.f63668c) || !Arrays.equals(this.f63666a, dVar.f63666a)) {
            return false;
        }
        String str = this.f63667b;
        if (str == null) {
            if (dVar.f63667b != null) {
                return false;
            }
        } else if (!str.equals(dVar.f63667b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = (((this.f63668c.hashCode() + 31) * 31) + Arrays.hashCode(this.f63666a)) * 31;
        String str = this.f63667b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return d(null);
    }
}
