package lk0;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f90066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f90067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f90068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f90069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f90070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f90071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Date f90072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f90073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f90074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f90075j;

    public q(String str, Boolean bool, Date date) {
        String strSubstring;
        char cCharAt;
        String strTrim = str.trim();
        this.f90070e = strTrim;
        int[] iArr = new int[3];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= strTrim.length()) {
                strSubstring = null;
                break;
            }
            char cCharAt2 = strTrim.charAt(i11);
            if (e(cCharAt2)) {
                iArr[i12] = (iArr[i12] * 10) + (cCharAt2 - '0');
            } else {
                if (i11 == 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("The version number string ");
                    stringBuffer.append(mk0.e.g(strTrim));
                    stringBuffer.append(" doesn't start with a number.");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
                if (cCharAt2 != '.') {
                    strSubstring = strTrim.substring(i11);
                    break;
                }
                int i13 = i11 + 1;
                char cCharAt3 = i13 >= strTrim.length() ? (char) 0 : strTrim.charAt(i13);
                if (cCharAt3 == '.') {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("The version number string ");
                    stringBuffer2.append(mk0.e.g(strTrim));
                    stringBuffer2.append(" contains multiple dots after a number.");
                    throw new IllegalArgumentException(stringBuffer2.toString());
                }
                if (i12 == 2 || !e(cCharAt3)) {
                    strSubstring = strTrim.substring(i11);
                    break;
                }
                i12++;
            }
            i11++;
        }
        if (strSubstring != null && ((cCharAt = strSubstring.charAt(0)) == '.' || cCharAt == '-' || cCharAt == '_')) {
            strSubstring = strSubstring.substring(1);
            if (strSubstring.length() == 0) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("The version number string ");
                stringBuffer3.append(mk0.e.g(strTrim));
                stringBuffer3.append(" has an extra info section opened with \"");
                stringBuffer3.append(cCharAt);
                stringBuffer3.append("\", but it's empty.");
                throw new IllegalArgumentException(stringBuffer3.toString());
            }
        }
        this.f90069d = strSubstring;
        this.f90066a = iArr[0];
        this.f90067b = iArr[1];
        this.f90068c = iArr[2];
        this.f90073h = a();
        this.f90071f = bool;
        this.f90072g = date;
    }

    private int a() {
        return d(this.f90066a, this.f90067b, this.f90068c);
    }

    private String b() {
        String str;
        String str2 = this.f90070e;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            try {
                if (this.f90074i == null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(this.f90066a);
                    stringBuffer.append(".");
                    stringBuffer.append(this.f90067b);
                    stringBuffer.append(".");
                    stringBuffer.append(this.f90068c);
                    this.f90074i = stringBuffer.toString();
                    if (this.f90069d != null) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append(this.f90074i);
                        stringBuffer2.append("-");
                        stringBuffer2.append(this.f90069d);
                        this.f90074i = stringBuffer2.toString();
                    }
                }
                str = this.f90074i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static int d(int i11, int i12, int i13) {
        return (i11 * 1000000) + (i12 * 1000) + i13;
    }

    private boolean e(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    public int c() {
        return this.f90073h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f90073h != qVar.f90073h || qVar.hashCode() != hashCode()) {
            return false;
        }
        Date date = this.f90072g;
        if (date == null) {
            if (qVar.f90072g != null) {
                return false;
            }
        } else if (!date.equals(qVar.f90072g)) {
            return false;
        }
        String str = this.f90069d;
        if (str == null) {
            if (qVar.f90069d != null) {
                return false;
            }
        } else if (!str.equals(qVar.f90069d)) {
            return false;
        }
        Boolean bool = this.f90071f;
        if (bool == null) {
            if (qVar.f90071f != null) {
                return false;
            }
        } else if (!bool.equals(qVar.f90071f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i11;
        int i12 = this.f90075j;
        if (i12 != 0) {
            return i12;
        }
        synchronized (this) {
            try {
                if (this.f90075j == 0) {
                    Date date = this.f90072g;
                    int iHashCode = 0;
                    int iHashCode2 = ((date == null ? 0 : date.hashCode()) + 31) * 31;
                    String str = this.f90069d;
                    int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    Boolean bool = this.f90071f;
                    if (bool != null) {
                        iHashCode = bool.hashCode();
                    }
                    int i13 = ((iHashCode3 + iHashCode) * 31) + this.f90073h;
                    if (i13 == 0) {
                        i13 = -1;
                    }
                    this.f90075j = i13;
                }
                i11 = this.f90075j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    public String toString() {
        return b();
    }

    public q(int i11, int i12, int i13) {
        this(i11, i12, i13, null, null, null);
    }

    public q(int i11, int i12, int i13, String str, Boolean bool, Date date) {
        this.f90066a = i11;
        this.f90067b = i12;
        this.f90068c = i13;
        this.f90069d = str;
        this.f90071f = bool;
        this.f90072g = date;
        this.f90073h = a();
        this.f90070e = null;
    }
}
