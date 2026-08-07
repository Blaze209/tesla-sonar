package rq0;

import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f108695a = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f108696b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f108697c = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f108698d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f108699e = Pattern.compile("[ \t\r\n]+");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f108700f = new C2316a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c f108701g = new b();

    /* JADX INFO: renamed from: rq0.a$a, reason: collision with other inner class name */
    static class C2316a implements c {
        C2316a() {
        }

        @Override // rq0.a.c
        public void a(String str, StringBuilder sb2) {
            if (str.charAt(0) == '\\') {
                sb2.append((CharSequence) str, 1, str.length());
            } else {
                sb2.append(rq0.b.a(str));
            }
        }
    }

    static class b implements c {
        b() {
        }

        @Override // rq0.a.c
        public void a(String str, StringBuilder sb2) {
            if (str.startsWith("%")) {
                if (str.length() == 3) {
                    sb2.append(str);
                    return;
                } else {
                    sb2.append("%25");
                    sb2.append((CharSequence) str, 1, str.length());
                    return;
                }
            }
            for (byte b11 : str.getBytes(Charset.forName("UTF-8"))) {
                sb2.append(CoreConstants.PERCENT_CHAR);
                sb2.append(a.f108698d[(b11 >> 4) & 15]);
                sb2.append(a.f108698d[b11 & 15]);
            }
        }
    }

    private interface c {
        void a(String str, StringBuilder sb2);
    }

    public static String b(String str) {
        return f108699e.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
    }

    public static String c(String str) {
        return b(str.substring(1, str.length() - 1));
    }

    private static String d(Pattern pattern, String str, c cVar) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb2.append((CharSequence) str, iEnd, matcher.start());
            cVar.a(matcher.group(), sb2);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb2.append((CharSequence) str, iEnd, str.length());
        }
        return sb2.toString();
    }

    public static String e(String str) {
        return f108695a.matcher(str).find() ? d(f108696b, str, f108700f) : str;
    }
}
