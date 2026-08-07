package mo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "", "b", "(C)Z", "", "a", "(C)I", "", "input", "minStringLengthAfterYear", "c", "(Ljava/lang/String;I)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final int a(char c11) {
        return c11 - '0';
    }

    public static final boolean b(char c11) {
        return '0' <= c11 && c11 < ':';
    }

    private static final String c(String str, int i11) {
        if (str.length() >= i11 + 12) {
            int i12 = 0;
            if (t.g0("+-", str.charAt(0), false, 2, null)) {
                int iU0 = t.u0(str, CoreConstants.DASH_CHAR, 1, false, 4, null);
                if (iU0 < 12) {
                    return str;
                }
                while (true) {
                    int i13 = i12 + 1;
                    if (str.charAt(i13) != '0') {
                        break;
                    }
                    i12 = i13;
                }
                return iU0 - i12 >= 12 ? str : t.U0(str, 1, iU0 - 10).toString();
            }
        }
        return str;
    }

    public static final String d(String input) {
        s.k(input, "input");
        return c(input.toString(), 6);
    }
}
