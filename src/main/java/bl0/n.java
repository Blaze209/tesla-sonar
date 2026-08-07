package bl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aE\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u00140\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a=\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\u0013j\b\u0012\u0004\u0012\u00020\u0018`\u00140\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u001f\u001a\u001b\u0010!\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "text", "", "Lbl0/g;", "b", "(Ljava/lang/String;)Ljava/util/List;", "", "parametersOnly", "c", "(Ljava/lang/String;Z)Ljava/util/List;", "T", "Lkotlin/Lazy;", "j", "(Lkotlin/Lazy;)Ljava/util/List;", "", "start", "end", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;II)Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "items", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;ILkotlin/Lazy;Z)I", "Lbl0/h;", "parameters", "e", "(Ljava/lang/String;ILkotlin/Lazy;)I", "value", "Lkotlin/Pair;", "g", "(Ljava/lang/String;I)Lkotlin/Pair;", "h", "a", "(Ljava/lang/String;I)Z", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/ArrayList;", "Lbl0/g;", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ArrayList<HeaderValue>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f17652c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList<HeaderValue> invoke() {
            return new ArrayList<>();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/ArrayList;", "Lbl0/h;", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<ArrayList<HeaderValueParam>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f17653c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList<HeaderValueParam> invoke() {
            return new ArrayList<>();
        }
    }

    private static final boolean a(String str, int i11) {
        int i12 = i11 + 1;
        while (i12 < str.length() && str.charAt(i12) == ' ') {
            i12++;
        }
        return i12 == str.length() || str.charAt(i12) == ';';
    }

    public static final List<HeaderValue> b(String str) {
        return c(str, false);
    }

    public static final List<HeaderValue> c(String str, boolean z11) {
        if (str == null) {
            return p013kotlin.collections.v.m();
        }
        Lazy lazyA = jn0.m.a(jn0.p.NONE, a.f17652c);
        int iD = 0;
        while (iD <= p013kotlin.text.t.p0(str)) {
            iD = d(str, iD, lazyA, z11);
        }
        return j(lazyA);
    }

    private static final int d(String str, int i11, Lazy<? extends ArrayList<HeaderValue>> lazy, boolean z11) {
        Lazy lazyA = jn0.m.a(jn0.p.NONE, b.f17653c);
        Integer numValueOf = z11 ? Integer.valueOf(i11) : null;
        int iE = i11;
        while (iE <= p013kotlin.text.t.p0(str)) {
            char cCharAt = str.charAt(iE);
            if (cCharAt == ',') {
                lazy.getValue().add(new HeaderValue(i(str, i11, numValueOf != null ? numValueOf.intValue() : iE), j(lazyA)));
                return iE + 1;
            }
            if (cCharAt == ';') {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(iE);
                }
                iE = e(str, iE + 1, lazyA);
            } else {
                iE = z11 ? e(str, iE, lazyA) : iE + 1;
            }
        }
        lazy.getValue().add(new HeaderValue(i(str, i11, numValueOf != null ? numValueOf.intValue() : iE), j(lazyA)));
        return iE;
    }

    private static final int e(String str, int i11, Lazy<? extends ArrayList<HeaderValueParam>> lazy) {
        int i12 = i11;
        while (i12 <= p013kotlin.text.t.p0(str)) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '=') {
                Pair<Integer, String> pairG = g(str, i12 + 1);
                int iIntValue = pairG.a().intValue();
                f(lazy, str, i11, i12, pairG.b());
                return iIntValue;
            }
            if (cCharAt == ';' || cCharAt == ',') {
                f(lazy, str, i11, i12, "");
                return i12;
            }
            i12++;
        }
        f(lazy, str, i11, i12, "");
        return i12;
    }

    private static final void f(Lazy<? extends ArrayList<HeaderValueParam>> lazy, String str, int i11, int i12, String str2) {
        String strI = i(str, i11, i12);
        if (strI.length() == 0) {
            return;
        }
        lazy.getValue().add(new HeaderValueParam(strI, str2));
    }

    private static final Pair<Integer, String> g(String str, int i11) {
        if (str.length() == i11) {
            return jn0.x.a(Integer.valueOf(i11), "");
        }
        if (str.charAt(i11) == '\"') {
            return h(str, i11 + 1);
        }
        int i12 = i11;
        while (i12 <= p013kotlin.text.t.p0(str)) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == ';' || cCharAt == ',') {
                return jn0.x.a(Integer.valueOf(i12), i(str, i11, i12));
            }
            i12++;
        }
        return jn0.x.a(Integer.valueOf(i12), i(str, i11, i12));
    }

    private static final Pair<Integer, String> h(String str, int i11) {
        StringBuilder sb2 = new StringBuilder();
        while (i11 <= p013kotlin.text.t.p0(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\"' && a(str, i11)) {
                Integer numValueOf = Integer.valueOf(i11 + 1);
                String string = sb2.toString();
                p013kotlin.jvm.internal.s.j(string, "builder.toString()");
                return jn0.x.a(numValueOf, string);
            }
            if (cCharAt != '\\' || i11 >= p013kotlin.text.t.p0(str) - 2) {
                sb2.append(cCharAt);
                i11++;
            } else {
                sb2.append(str.charAt(i11 + 1));
                i11 += 2;
            }
        }
        Integer numValueOf2 = Integer.valueOf(i11);
        String string2 = sb2.toString();
        p013kotlin.jvm.internal.s.j(string2, "builder.toString()");
        return jn0.x.a(numValueOf2, CoreConstants.DOUBLE_QUOTE_CHAR + string2);
    }

    private static final String i(String str, int i11, int i12) {
        String strSubstring = str.substring(i11, i12);
        p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return p013kotlin.text.t.F1(strSubstring).toString();
    }

    private static final <T> List<T> j(Lazy<? extends List<? extends T>> lazy) {
        return lazy.isInitialized() ? lazy.getValue() : p013kotlin.collections.v.m();
    }
}
