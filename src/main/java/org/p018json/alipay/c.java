package org.p018json.alipay;

import com.adyen.checkout.components.core.Address;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f99332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Reader f99333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char f99334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f99335d;

    public c(Reader reader) {
        this.f99333b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.f99335d = false;
        this.f99332a = 0;
    }

    public String a(char c11) throws JSONException {
        int i11;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            char cB = b();
            if (cB == 0 || cB == '\n' || cB == '\r') {
                break;
            }
            if (cB == '\\') {
                cB = b();
                if (cB == 'b') {
                    cB = '\b';
                } else if (cB == 'f') {
                    cB = '\f';
                } else if (cB == 'n') {
                    stringBuffer.append('\n');
                } else if (cB != 'r') {
                    if (cB != 'x') {
                        if (cB != 't') {
                            i11 = cB == 'u' ? 4 : 2;
                        } else {
                            cB = '\t';
                        }
                    }
                    cB = (char) Integer.parseInt(a(i11), 16);
                } else {
                    stringBuffer.append('\r');
                }
            } else if (cB == c11) {
                return stringBuffer.toString();
            }
            stringBuffer.append(cB);
        }
        throw a("Unterminated string");
    }

    public char b() throws JSONException {
        if (this.f99335d) {
            this.f99335d = false;
            char c11 = this.f99334c;
            if (c11 != 0) {
                this.f99332a++;
            }
            return c11;
        }
        try {
            int i11 = this.f99333b.read();
            if (i11 <= 0) {
                this.f99334c = (char) 0;
                return (char) 0;
            }
            this.f99332a++;
            char c12 = (char) i11;
            this.f99334c = c12;
            return c12;
        } catch (IOException e11) {
            throw new JSONException(e11);
        }
    }

    public char c() {
        char cB;
        char cB2;
        while (true) {
            char cB3 = b();
            if (cB3 == '/') {
                char cB4 = b();
                if (cB4 == '*') {
                    while (true) {
                        char cB5 = b();
                        if (cB5 == 0) {
                            throw a("Unclosed comment");
                        }
                        if (cB5 == '*') {
                            if (b() == '/') {
                                break;
                            }
                            a();
                        }
                    }
                } else {
                    if (cB4 != '/') {
                        a();
                        return '/';
                    }
                    do {
                        cB = b();
                        if (cB == '\n' || cB == '\r') {
                            break;
                        }
                    } while (cB != 0);
                }
            } else if (cB3 == '#') {
                do {
                    cB2 = b();
                    if (cB2 == '\n' || cB2 == '\r') {
                        break;
                    }
                } while (cB2 != 0);
            } else if (cB3 == 0 || cB3 > ' ') {
                return cB3;
            }
        }
    }

    public Object d() {
        char c11 = c();
        if (c11 != '\"') {
            if (c11 != '[') {
                if (c11 == '{') {
                    a();
                    return new b(this);
                }
                if (c11 != '\'') {
                    if (c11 != '(') {
                        StringBuffer stringBuffer = new StringBuffer();
                        char cB = c11;
                        while (cB >= ' ' && ",:]}/\\\"[{;=#".indexOf(cB) < 0) {
                            stringBuffer.append(cB);
                            cB = b();
                        }
                        a();
                        String strTrim = stringBuffer.toString().trim();
                        if (strTrim.equals("")) {
                            throw a("Missing value");
                        }
                        if (strTrim.equalsIgnoreCase("true")) {
                            return Boolean.TRUE;
                        }
                        if (strTrim.equalsIgnoreCase("false")) {
                            return Boolean.FALSE;
                        }
                        if (strTrim.equalsIgnoreCase(Address.ADDRESS_NULL_PLACEHOLDER)) {
                            return b.f99330a;
                        }
                        if ((c11 >= '0' && c11 <= '9') || c11 == '.' || c11 == '-' || c11 == '+') {
                            if (c11 == '0') {
                                try {
                                    return (strTrim.length() <= 2 || !(strTrim.charAt(1) == 'x' || strTrim.charAt(1) == 'X')) ? new Integer(Integer.parseInt(strTrim, 8)) : new Integer(Integer.parseInt(strTrim.substring(2), 16));
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                try {
                                    try {
                                        return new Integer(strTrim);
                                    } catch (Exception unused2) {
                                        return new Double(strTrim);
                                    }
                                } catch (Exception unused3) {
                                    return new Long(strTrim);
                                }
                            } catch (Exception unused4) {
                            }
                        }
                        return strTrim;
                    }
                }
            }
            a();
            return new a(this);
        }
        return a(c11);
    }

    public String toString() {
        return " at character " + this.f99332a;
    }

    public c(String str) {
        this(new StringReader(str));
    }

    public String a(int i11) throws JSONException {
        if (i11 == 0) {
            return "";
        }
        char[] cArr = new char[i11];
        int i12 = 0;
        if (this.f99335d) {
            this.f99335d = false;
            cArr[0] = this.f99334c;
            i12 = 1;
        }
        while (i12 < i11) {
            try {
                int i13 = this.f99333b.read(cArr, i12, i11 - i12);
                if (i13 == -1) {
                    break;
                }
                i12 += i13;
            } catch (IOException e11) {
                throw new JSONException(e11);
            }
        }
        this.f99332a += i12;
        if (i12 < i11) {
            throw a("Substring bounds error");
        }
        this.f99334c = cArr[i11 - 1];
        return new String(cArr);
    }

    public JSONException a(String str) {
        return new JSONException(str + toString());
    }

    public void a() {
        int i11;
        if (this.f99335d || (i11 = this.f99332a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.f99332a = i11 - 1;
        this.f99335d = true;
    }
}
