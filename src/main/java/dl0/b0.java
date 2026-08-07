package dl0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "ch", "b", "(C)C", "Ldl0/i;", "a", "(Ljava/lang/String;)Ldl0/i;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b0 {
    public static final i a(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        return new i(str);
    }

    private static final char b(char c11) {
        if ('A' > c11 || c11 >= '[') {
            return (c11 < 0 || c11 >= 128) ? Character.toLowerCase(c11) : c11;
        }
        return (char) (c11 + ' ');
    }

    public static final String c(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            char cCharAt = str.charAt(i11);
            if (b(cCharAt) != cCharAt) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i11);
        int iP0 = p013kotlin.text.t.p0(str);
        if (i11 <= iP0) {
            while (true) {
                sb2.append(b(str.charAt(i11)));
                if (i11 == iP0) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
