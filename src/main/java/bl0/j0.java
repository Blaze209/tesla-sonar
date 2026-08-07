package bl0;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0017\u001a\u00020\u0016*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u001d\u001a\u00020\u0016*\u00060\u0019j\u0002`\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0015\u0010!\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"", "urlString", "Lbl0/k0;", "c", "(Ljava/lang/String;)Lbl0/k0;", "Lbl0/d0;", "b", "(Ljava/lang/String;)Lbl0/d0;", ImagesContract.URL, "a", "(Lbl0/k0;)Lbl0/d0;", "g", "(Lbl0/d0;Lbl0/d0;)Lbl0/d0;", "h", "(Lbl0/d0;Lbl0/k0;)Lbl0/d0;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "encodedPath", "Lbl0/y;", "encodedQueryParameters", "", "trailingQuery", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Appendable;Ljava/lang/String;Lbl0/y;Z)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "encodedUser", "encodedPassword", "e", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V", "f", "(Lbl0/k0;)Ljava/lang/String;", "hostWithPort", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j0 {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "", "it", "", "a", "(Lkotlin/Pair;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Pair<? extends String, ? extends String>, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f17623c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Pair<String, String> it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            String strE = it.e();
            if (it.f() == null) {
                return strE;
            }
            return strE + '=' + String.valueOf(it.f());
        }
    }

    public static final d0 a(k0 url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        return h(new d0(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    public static final d0 b(String urlString) {
        p013kotlin.jvm.internal.s.k(urlString, "urlString");
        return g0.j(new d0(null, null, 0, null, null, null, null, null, false, 511, null), urlString);
    }

    public static final k0 c(String urlString) {
        p013kotlin.jvm.internal.s.k(urlString, "urlString");
        return b(urlString).b();
    }

    public static final void d(Appendable appendable, String encodedPath, y encodedQueryParameters, boolean z11) {
        List listE;
        p013kotlin.jvm.internal.s.k(appendable, "<this>");
        p013kotlin.jvm.internal.s.k(encodedPath, "encodedPath");
        p013kotlin.jvm.internal.s.k(encodedQueryParameters, "encodedQueryParameters");
        if (!p013kotlin.text.t.y0(encodedPath) && !p013kotlin.text.t.b0(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z11) {
            appendable.append(CallerData.NA);
        }
        Set<Map.Entry<String, List<String>>> setA = encodedQueryParameters.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listE = p013kotlin.collections.v.e(jn0.x.a(str, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(jn0.x.a(str, (String) it2.next()));
                }
                listE = arrayList2;
            }
            p013kotlin.collections.v.E(arrayList, listE);
        }
        p013kotlin.collections.g0.v0(arrayList, appendable, (124 & 2) != 0 ? ", " : "&", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : a.f17623c);
    }

    public static final void e(StringBuilder sb2, String str, String str2) {
        p013kotlin.jvm.internal.s.k(sb2, "<this>");
        if (str == null) {
            return;
        }
        sb2.append(str);
        if (str2 != null) {
            sb2.append(CoreConstants.COLON_CHAR);
            sb2.append(str2);
        }
        sb2.append("@");
    }

    public static final String f(k0 k0Var) {
        p013kotlin.jvm.internal.s.k(k0Var, "<this>");
        return k0Var.getHost() + CoreConstants.COLON_CHAR + k0Var.j();
    }

    public static final d0 g(d0 d0Var, d0 url) {
        p013kotlin.jvm.internal.s.k(d0Var, "<this>");
        p013kotlin.jvm.internal.s.k(url, "url");
        d0Var.y(url.getProtocol());
        d0Var.w(url.getHost());
        d0Var.x(url.getPort());
        d0Var.u(url.g());
        d0Var.v(url.getEncodedUser());
        d0Var.t(url.getEncodedPassword());
        y yVarB = b0.b(0, 1, null);
        dl0.a0.c(yVarB, url.getEncodedParameters());
        d0Var.s(yVarB);
        d0Var.r(url.getEncodedFragment());
        d0Var.z(url.getTrailingQuery());
        return d0Var;
    }

    public static final d0 h(d0 d0Var, k0 url) {
        p013kotlin.jvm.internal.s.k(d0Var, "<this>");
        p013kotlin.jvm.internal.s.k(url, "url");
        d0Var.y(url.getProtocol());
        d0Var.w(url.getHost());
        d0Var.x(url.j());
        f0.i(d0Var, url.d());
        d0Var.v(url.f());
        d0Var.t(url.c());
        y yVarB = b0.b(0, 1, null);
        yVarB.e(c0.d(url.e(), 0, 0, false, 6, null));
        d0Var.s(yVarB);
        d0Var.r(url.b());
        d0Var.z(url.getTrailingQuery());
        return d0Var;
    }
}
