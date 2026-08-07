package org.bouncycastle.i18n.filter;

/* JADX INFO: loaded from: classes9.dex */
public class HTMLFilter implements Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i11;
        String str2;
        StringBuffer stringBuffer = new StringBuffer(str);
        int i12 = 0;
        while (i12 < stringBuffer.length()) {
            char cCharAt = stringBuffer.charAt(i12);
            if (cCharAt == '\"') {
                i11 = i12 + 1;
                str2 = "&#34";
            } else if (cCharAt == '#') {
                i11 = i12 + 1;
                str2 = "&#35";
            } else if (cCharAt == '+') {
                i11 = i12 + 1;
                str2 = "&#43";
            } else if (cCharAt == '-') {
                i11 = i12 + 1;
                str2 = "&#45";
            } else if (cCharAt == '>') {
                i11 = i12 + 1;
                str2 = "&#62";
            } else if (cCharAt == ';') {
                i11 = i12 + 1;
                str2 = "&#59";
            } else if (cCharAt != '<') {
                switch (cCharAt) {
                    case '%':
                        i11 = i12 + 1;
                        str2 = "&#37";
                        break;
                    case '&':
                        i11 = i12 + 1;
                        str2 = "&#38";
                        break;
                    case '\'':
                        i11 = i12 + 1;
                        str2 = "&#39";
                        break;
                    case '(':
                        i11 = i12 + 1;
                        str2 = "&#40";
                        break;
                    case ')':
                        i11 = i12 + 1;
                        str2 = "&#41";
                        break;
                    default:
                        i12 -= 3;
                        continue;
                        i12 += 4;
                        break;
                }
            } else {
                i11 = i12 + 1;
                str2 = "&#60";
            }
            stringBuffer.replace(i12, i11, str2);
            i12 += 4;
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
