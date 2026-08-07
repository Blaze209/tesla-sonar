package bl0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import io.ktor.http.URLParserException;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000e\u001a+\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0014\" \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lbl0/d0;", "", "urlString", "j", "(Lbl0/d0;Ljava/lang/String;)Lbl0/d0;", "k", "", "startIndex", "endIndex", "slashCount", "Ljn0/h0;", "f", "(Lbl0/d0;Ljava/lang/String;III)V", "h", "(Lbl0/d0;Ljava/lang/String;II)V", IntegerTokenConverter.CONVERTER_KEY, "(Lbl0/d0;Ljava/lang/String;II)I", "g", "b", "c", "(Ljava/lang/String;II)I", "", "char", "a", "(Ljava/lang/String;IIC)I", "e", "", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "ROOT_PATH", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f17605a = p013kotlin.collections.v.e("");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", Action.KEY_ATTRIBUTE, "", "values", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<String, List<? extends String>, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0 f17606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0 d0Var) {
            super(2);
            this.f17606c = d0Var;
        }

        public final void a(String key, List<String> values) {
            p013kotlin.jvm.internal.s.k(key, "key");
            p013kotlin.jvm.internal.s.k(values, "values");
            this.f17606c.getEncodedParameters().d(key, values);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(String str, List<? extends String> list) {
            a(str, list);
            return jn0.h0.f84049a;
        }
    }

    private static final int a(String str, int i11, int i12, char c11) {
        int i13 = 0;
        while (true) {
            int i14 = i11 + i13;
            if (i14 >= i12 || str.charAt(i14) != c11) {
                break;
            }
            i13++;
        }
        return i13;
    }

    private static final void b(d0 d0Var, String str, int i11, int i12) {
        Integer numValueOf = Integer.valueOf(e(str, i11, i12));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : i12;
        String strSubstring = str.substring(i11, iIntValue);
        p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        d0Var.w(strSubstring);
        int i13 = iIntValue + 1;
        if (i13 >= i12) {
            d0Var.x(0);
            return;
        }
        String strSubstring2 = str.substring(i13, i12);
        p013kotlin.jvm.internal.s.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        d0Var.x(Integer.parseInt(strSubstring2));
    }

    private static final int c(String str, int i11, int i12) {
        int i13;
        int i14;
        char cCharAt = str.charAt(i11);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i13 = i11;
            i14 = i13;
        } else {
            i13 = i11;
            i14 = -1;
        }
        while (i13 < i12) {
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 == ':') {
                if (i14 == -1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("Illegal character in scheme at position " + i14);
            }
            if (cCharAt2 == '/' || cCharAt2 == '?' || cCharAt2 == '#') {
                break;
            }
            if (i14 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                i14 = i13;
            }
            i13++;
        }
        return -1;
    }

    public static final List<String> d() {
        return f17605a;
    }

    private static final int e(String str, int i11, int i12) {
        boolean z11 = false;
        while (i11 < i12) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '[') {
                z11 = true;
            } else if (cCharAt == ']') {
                z11 = false;
            } else if (cCharAt == ':' && !z11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private static final void f(d0 d0Var, String str, int i11, int i12, int i13) {
        if (i13 != 2) {
            if (i13 != 3) {
                throw new IllegalArgumentException("Invalid file url: " + str);
            }
            d0Var.w("");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('/');
            String strSubstring = str.substring(i11, i12);
            p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            f0.i(d0Var, sb2.toString());
            return;
        }
        int iU0 = p013kotlin.text.t.u0(str, '/', i11, false, 4, null);
        if (iU0 == -1 || iU0 == i12) {
            String strSubstring2 = str.substring(i11, i12);
            p013kotlin.jvm.internal.s.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            d0Var.w(strSubstring2);
        } else {
            String strSubstring3 = str.substring(i11, iU0);
            p013kotlin.jvm.internal.s.j(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            d0Var.w(strSubstring3);
            String strSubstring4 = str.substring(iU0, i12);
            p013kotlin.jvm.internal.s.j(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
            f0.i(d0Var, strSubstring4);
        }
    }

    private static final void g(d0 d0Var, String str, int i11, int i12) {
        if (i11 >= i12 || str.charAt(i11) != '#') {
            return;
        }
        String strSubstring = str.substring(i11 + 1, i12);
        p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        d0Var.r(strSubstring);
    }

    private static final void h(d0 d0Var, String str, int i11, int i12) {
        int iV0 = p013kotlin.text.t.v0(str, "@", i11, false, 4, null);
        if (iV0 == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String strSubstring = str.substring(i11, iV0);
        p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        d0Var.A(bl0.a.i(strSubstring, 0, 0, null, 7, null));
        String strSubstring2 = str.substring(iV0 + 1, i12);
        p013kotlin.jvm.internal.s.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        d0Var.w(strSubstring2);
    }

    private static final int i(d0 d0Var, String str, int i11, int i12) {
        int i13 = i11 + 1;
        if (i13 == i12) {
            d0Var.z(true);
            return i12;
        }
        Integer numValueOf = Integer.valueOf(p013kotlin.text.t.u0(str, '#', i13, false, 4, null));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i12 = numValueOf.intValue();
        }
        String strSubstring = str.substring(i13, i12);
        p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        c0.d(strSubstring, 0, 0, false, 6, null).d(new a(d0Var));
        return i12;
    }

    public static final d0 j(d0 d0Var, String urlString) {
        p013kotlin.jvm.internal.s.k(d0Var, "<this>");
        p013kotlin.jvm.internal.s.k(urlString, "urlString");
        if (p013kotlin.text.t.y0(urlString)) {
            return d0Var;
        }
        try {
            return k(d0Var, urlString);
        } catch (Throwable th2) {
            throw new URLParserException(urlString, th2);
        }
    }

    public static final d0 k(d0 d0Var, String urlString) {
        int i11;
        int iIntValue;
        p013kotlin.jvm.internal.s.k(d0Var, "<this>");
        p013kotlin.jvm.internal.s.k(urlString, "urlString");
        int length = urlString.length();
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            if (!p013kotlin.text.a.c(urlString.charAt(i12))) {
                break;
            }
            i12++;
        }
        int length2 = urlString.length() - 1;
        if (length2 < 0) {
            i11 = -1;
            break;
        }
        while (true) {
            int i13 = length2 - 1;
            if (!p013kotlin.text.a.c(urlString.charAt(length2))) {
                i11 = length2;
                break;
            }
            if (i13 < 0) {
                i11 = -1;
                break;
            }
            length2 = i13;
        }
        int i14 = i11 + 1;
        int iC = c(urlString, i12, i14);
        if (iC > 0) {
            String strSubstring = urlString.substring(i12, i12 + iC);
            p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            d0Var.y(URLProtocol.INSTANCE.a(strSubstring));
            i12 += iC + 1;
        }
        int iA = a(urlString, i12, i14, '/');
        int i15 = i12 + iA;
        if (p013kotlin.jvm.internal.s.f(d0Var.getProtocol().getName(), Action.FILE_ATTRIBUTE)) {
            f(d0Var, urlString, i15, i14, iA);
            return d0Var;
        }
        if (p013kotlin.jvm.internal.s.f(d0Var.getProtocol().getName(), "mailto")) {
            if (iA != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            h(d0Var, urlString, i15, i14);
            return d0Var;
        }
        if (iA >= 2) {
            while (true) {
                Integer numValueOf = Integer.valueOf(p013kotlin.text.t.x0(urlString, dl0.j.b("@/\\?#"), i15, false, 4, null));
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i14;
                if (iIntValue >= i14 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iE = e(urlString, i15, iIntValue);
                if (iE != -1) {
                    String strSubstring2 = urlString.substring(i15, iE);
                    p013kotlin.jvm.internal.s.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    d0Var.v(strSubstring2);
                    String strSubstring3 = urlString.substring(iE + 1, iIntValue);
                    p013kotlin.jvm.internal.s.j(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    d0Var.t(strSubstring3);
                } else {
                    String strSubstring4 = urlString.substring(i15, iIntValue);
                    p013kotlin.jvm.internal.s.j(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    d0Var.v(strSubstring4);
                }
                i15 = iIntValue + 1;
            }
            b(d0Var, urlString, i15, iIntValue);
            i15 = iIntValue;
        }
        if (i15 >= i14) {
            d0Var.u(urlString.charAt(i11) == '/' ? f17605a : p013kotlin.collections.v.m());
            return d0Var;
        }
        d0Var.u(iA == 0 ? p013kotlin.collections.v.j0(d0Var.g(), 1) : p013kotlin.collections.v.m());
        Integer numValueOf2 = Integer.valueOf(p013kotlin.text.t.x0(urlString, dl0.j.b("?#"), i15, false, 4, null));
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        int iIntValue2 = num != null ? num.intValue() : i14;
        if (iIntValue2 > i15) {
            String strSubstring5 = urlString.substring(i15, iIntValue2);
            p013kotlin.jvm.internal.s.j(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
            d0Var.u(p013kotlin.collections.v.P0((d0Var.g().size() == 1 && ((CharSequence) p013kotlin.collections.v.o0(d0Var.g())).length() == 0) ? p013kotlin.collections.v.m() : d0Var.g(), p013kotlin.collections.v.P0(iA == 1 ? f17605a : p013kotlin.collections.v.m(), p013kotlin.jvm.internal.s.f(strSubstring5, "/") ? f17605a : p013kotlin.text.t.e1(strSubstring5, new char[]{'/'}, false, 0, 6, null))));
            i15 = iIntValue2;
        }
        if (i15 < i14 && urlString.charAt(i15) == '?') {
            i15 = i(d0Var, urlString, i15, i14);
        }
        g(d0Var, urlString, i15, i14);
        return d0Var;
    }
}
