package p013kotlin.text;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.g0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "marginPrefix", "o", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "n", "(Ljava/lang/String;)Ljava/lang/String;", "l", "indent", IntegerTokenConverter.CONVERTER_KEY, "", "h", "(Ljava/lang/String;)I", "Lkotlin/Function1;", "e", "(Ljava/lang/String;)Lwn0/l;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class y extends u {
    private static final l<String, String> e(final String str) {
        return str.length() == 0 ? new l() { // from class: kotlin.text.w
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return y.f((String) obj);
            }
        } : new l() { // from class: kotlin.text.x
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return y.g(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String line) {
        s.k(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String str, String line) {
        s.k(line, "line");
        return str + line;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    private static final int h(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            if (!b.c(str.charAt(i11))) {
                if (i11 == -1) {
                    return str.length();
                }
                return i11;
            }
            i11++;
        }
        i11 = -1;
        if (i11 == -1) {
            return str.length();
        }
        return i11;
    }

    public static final String i(String str, final String indent) {
        s.k(str, "<this>");
        s.k(indent, "indent");
        return ho0.l.R(ho0.l.U(i0.E0(str), new l() { // from class: kotlin.text.v
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return y.k(indent, (String) obj);
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(String str, String it) {
        s.k(it, "it");
        if (i0.y0(it)) {
            return it.length() < str.length() ? str : it;
        }
        return str + it;
    }

    public static final String l(String str, String newIndent) {
        String strInvoke;
        s.k(str, "<this>");
        s.k(newIndent, "newIndent");
        List<String> listF0 = i0.F0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF0) {
            if (!i0.y0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(h((String) it.next())));
        }
        Integer num = (Integer) v.I0(arrayList2);
        int i11 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listF0.size());
        l<String, String> lVarE = e(newIndent);
        int iO = v.o(listF0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listF0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            String str2 = (String) obj2;
            if ((i11 == 0 || i11 == iO) && i0.y0(str2)) {
                str2 = null;
            } else {
                String strM1 = l0.M1(str2, iIntValue);
                if (strM1 != null && (strInvoke = lVarE.invoke(strM1)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i11 = i12;
        }
        return ((StringBuilder) g0.v0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String m(String str, String newIndent, String marginPrefix) {
        String str2;
        String strInvoke;
        s.k(str, "<this>");
        s.k(newIndent, "newIndent");
        s.k(marginPrefix, "marginPrefix");
        if (i0.y0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listF0 = i0.F0(str);
        int length = str.length() + (newIndent.length() * listF0.size());
        l<String, String> lVarE = e(newIndent);
        int iO = v.o(listF0);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listF0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i11 == 0 || i11 == iO) && i0.y0(str3)) {
                str2 = marginPrefix;
                str3 = null;
            } else {
                int length2 = str3.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i13 = -1;
                        break;
                    }
                    if (!b.c(str3.charAt(i13))) {
                        break;
                    }
                    i13++;
                }
                if (i13 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i14 = i13;
                    str2 = marginPrefix;
                    if (f0.a0(str3, str2, i14, false, 4, null)) {
                        int length3 = str2.length() + i14;
                        s.i(str3, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str3.substring(length3);
                        s.j(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = lVarE.invoke(strSubstring)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i11 = i12;
            marginPrefix = str2;
        }
        return ((StringBuilder) g0.v0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static String n(String str) {
        s.k(str, "<this>");
        return l(str, "");
    }

    public static final String o(String str, String marginPrefix) {
        s.k(str, "<this>");
        s.k(marginPrefix, "marginPrefix");
        return m(str, "", marginPrefix);
    }

    public static /* synthetic */ String p(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "|";
        }
        return o(str, str2);
    }
}
