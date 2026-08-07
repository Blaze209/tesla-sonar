package org.bouncycastle.asn1.x509;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes9.dex */
public class X509NameTokenizer {
    private StringBuffer buf;
    private int index;
    private char separator;
    private String value;

    public X509NameTokenizer(String str) {
        this(str, CoreConstants.COMMA_CHAR);
    }

    public boolean hasMoreTokens() {
        return this.index != this.value.length();
    }

    public String nextToken() {
        if (this.index == this.value.length()) {
            return null;
        }
        int i11 = this.index + 1;
        this.buf.setLength(0);
        boolean z11 = false;
        boolean z12 = false;
        while (i11 != this.value.length()) {
            char cCharAt = this.value.charAt(i11);
            if (cCharAt != '\"') {
                if (!z11 && !z12) {
                    if (cCharAt == '\\') {
                        this.buf.append(cCharAt);
                        z11 = true;
                    } else {
                        if (cCharAt == this.separator) {
                            break;
                        }
                        this.buf.append(cCharAt);
                    }
                }
                i11++;
            } else if (!z11) {
                z12 = !z12;
            }
            this.buf.append(cCharAt);
            z11 = false;
            i11++;
        }
        this.index = i11;
        return this.buf.toString();
    }

    public X509NameTokenizer(String str, char c11) {
        this.buf = new StringBuffer();
        this.value = str;
        this.index = -1;
        this.separator = c11;
    }
}
