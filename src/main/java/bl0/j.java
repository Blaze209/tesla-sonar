package bl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00020\u00002\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Z", "c", "e", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "Ljn0/h0;", "f", "(Ljava/lang/String;Ljava/lang/StringBuilder;)V", "", "", "a", "Ljava/util/Set;", "HeaderFieldValueSeparators", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<Character> f17622a = d1.i(Character.valueOf(CoreConstants.LEFT_PARENTHESIS_CHAR), Character.valueOf(CoreConstants.RIGHT_PARENTHESIS_CHAR), '<', '>', '@', Character.valueOf(CoreConstants.COMMA_CHAR), ';', Character.valueOf(CoreConstants.COLON_CHAR), Character.valueOf(CoreConstants.ESCAPE_CHAR), Character.valueOf(CoreConstants.DOUBLE_QUOTE_CHAR), '/', '[', ']', '?', '=', Character.valueOf(CoreConstants.CURLY_LEFT), Character.valueOf(CoreConstants.CURLY_RIGHT), ' ', '\t', '\n', '\r');

    public static final String b(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        return d(str) ? e(str) : str;
    }

    private static final boolean c(String str) {
        if (str.length() < 2 || p013kotlin.text.t.O1(str) != '\"' || p013kotlin.text.t.Q1(str) != '\"') {
            return false;
        }
        int i11 = 1;
        while (true) {
            String str2 = str;
            int iU0 = p013kotlin.text.t.u0(str2, CoreConstants.DOUBLE_QUOTE_CHAR, i11, false, 4, null);
            if (iU0 != p013kotlin.text.t.p0(str2)) {
                int i12 = 0;
                for (int i13 = iU0 - 1; str2.charAt(i13) == '\\'; i13--) {
                    i12++;
                }
                if (i12 % 2 == 0) {
                    return false;
                }
                i11 = iU0 + 1;
                if (i11 < str2.length()) {
                    str = str2;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (c(str)) {
            return false;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (f17622a.contains(Character.valueOf(str.charAt(i11)))) {
                return true;
            }
        }
        return false;
    }

    public static final String e(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        f(str, sb2);
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final void f(String str, StringBuilder sb2) {
        sb2.append("\"");
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\\') {
                sb2.append("\\\\");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append("\"");
    }
}
