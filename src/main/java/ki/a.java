package ki;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\t\u001a\u00020\u00008\u0002X\u0083D¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "(C)Ljava/lang/String;", "Ljava/lang/String;", "getRESERVED_CHARS$annotations", "()V", "RESERVED_CHARS", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f86126a = "!#$&'\"()*+,/:;=?@[]{}% ";

    private static final String a(char c11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.PERCENT_CHAR);
        String string = Integer.toString(c11, p013kotlin.text.a.a(16));
        s.j(string, "toString(...)");
        sb2.append(string);
        String upperCase = sb2.toString().toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final String b(String str) {
        s.k(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (t.g0(f86126a, cCharAt, false, 2, null)) {
                sb2.append(a(cCharAt));
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }
}
