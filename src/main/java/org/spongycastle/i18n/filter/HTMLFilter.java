package org.spongycastle.i18n.filter;

/* JADX INFO: loaded from: classes10.dex */
public class HTMLFilter implements Filter {
    @Override // org.spongycastle.i18n.filter.Filter
    public String doFilter(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        int i11 = 0;
        while (i11 < stringBuffer.length()) {
            char cCharAt = stringBuffer.charAt(i11);
            if (cCharAt == '\"') {
                stringBuffer.replace(i11, i11 + 1, "&#34");
            } else if (cCharAt == '#') {
                stringBuffer.replace(i11, i11 + 1, "&#35");
            } else if (cCharAt == '+') {
                stringBuffer.replace(i11, i11 + 1, "&#43");
            } else if (cCharAt == '-') {
                stringBuffer.replace(i11, i11 + 1, "&#45");
            } else if (cCharAt == '>') {
                stringBuffer.replace(i11, i11 + 1, "&#62");
            } else if (cCharAt == ';') {
                stringBuffer.replace(i11, i11 + 1, "&#59");
            } else if (cCharAt != '<') {
                switch (cCharAt) {
                    case '%':
                        stringBuffer.replace(i11, i11 + 1, "&#37");
                        break;
                    case '&':
                        stringBuffer.replace(i11, i11 + 1, "&#38");
                        break;
                    case '\'':
                        stringBuffer.replace(i11, i11 + 1, "&#39");
                        break;
                    case '(':
                        stringBuffer.replace(i11, i11 + 1, "&#40");
                        break;
                    case ')':
                        stringBuffer.replace(i11, i11 + 1, "&#41");
                        break;
                    default:
                        i11 -= 3;
                        break;
                }
            } else {
                stringBuffer.replace(i11, i11 + 1, "&#60");
            }
            i11 += 4;
        }
        return stringBuffer.toString();
    }

    @Override // org.spongycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
