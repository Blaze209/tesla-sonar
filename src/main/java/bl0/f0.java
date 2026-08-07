package bl0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\u001a)\u0010\u0005\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000e\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a\u0019\u0010\u0010\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\u0007*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0016\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\"(\u0010\r\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "Lbl0/d0;", "out", DateTokenConverter.CONVERTER_KEY, "(Lbl0/d0;Ljava/lang/Appendable;)Ljava/lang/Appendable;", "", "encodedUser", "host", "Ljn0/h0;", "c", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;)V", "encodedPath", "b", "", "h", "(Ljava/util/List;)Ljava/lang/String;", "g", "(Lbl0/d0;)Ljava/lang/String;", "encodedUserAndPassword", "e", "authority", "value", "f", IntegerTokenConverter.CONVERTER_KEY, "(Lbl0/d0;Ljava/lang/String;)V", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f0 {
    private static final void b(Appendable appendable, String str, String str2) throws IOException {
        appendable.append("://");
        appendable.append(str);
        if (!p013kotlin.text.t.j1(str2, '/', false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    private static final void c(Appendable appendable, String str, String str2) throws IOException {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <A extends Appendable> A d(d0 d0Var, A a11) throws IOException {
        a11.append(d0Var.getProtocol().getName());
        String name = d0Var.getProtocol().getName();
        if (p013kotlin.jvm.internal.s.f(name, Action.FILE_ATTRIBUTE)) {
            b(a11, d0Var.getHost(), f(d0Var));
            return a11;
        }
        if (p013kotlin.jvm.internal.s.f(name, "mailto")) {
            c(a11, g(d0Var), d0Var.getHost());
            return a11;
        }
        a11.append("://");
        a11.append(e(d0Var));
        j0.d(a11, f(d0Var), d0Var.getEncodedParameters(), d0Var.getTrailingQuery());
        if (d0Var.getEncodedFragment().length() > 0) {
            a11.append('#');
            a11.append(d0Var.getEncodedFragment());
        }
        return a11;
    }

    public static final String e(d0 d0Var) {
        p013kotlin.jvm.internal.s.k(d0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g(d0Var));
        sb2.append(d0Var.getHost());
        if (d0Var.getPort() != 0 && d0Var.getPort() != d0Var.getProtocol().getDefaultPort()) {
            sb2.append(":");
            sb2.append(String.valueOf(d0Var.getPort()));
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String f(d0 d0Var) {
        p013kotlin.jvm.internal.s.k(d0Var, "<this>");
        return h(d0Var.g());
    }

    public static final String g(d0 d0Var) {
        p013kotlin.jvm.internal.s.k(d0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        j0.e(sb2, d0Var.getEncodedUser(), d0Var.getEncodedPassword());
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final String h(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) p013kotlin.collections.v.o0(list)).length() == 0 ? "/" : (String) p013kotlin.collections.v.o0(list);
        }
        return p013kotlin.collections.v.y0(list, "/", null, null, 0, null, null, 62, null);
    }

    public static final void i(d0 d0Var, String value) {
        List<String> listD;
        p013kotlin.jvm.internal.s.k(d0Var, "<this>");
        p013kotlin.jvm.internal.s.k(value, "value");
        if (p013kotlin.text.t.y0(value)) {
            listD = p013kotlin.collections.v.m();
        } else {
            listD = p013kotlin.jvm.internal.s.f(value, "/") ? g0.d() : p013kotlin.collections.v.p1(p013kotlin.text.t.e1(value, new char[]{'/'}, false, 0, 6, null));
        }
        d0Var.u(listD);
    }
}
