package bl0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Lbl0/k0;", "", "a", "(Lbl0/k0;)Ljava/lang/String;", "authority", "b", "encodedUserAndPassword", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n0 {
    public static final String a(k0 k0Var) {
        p013kotlin.jvm.internal.s.k(k0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b(k0Var));
        if (k0Var.getSpecifiedPort() == 0 || k0Var.getSpecifiedPort() == k0Var.getProtocol().getDefaultPort()) {
            sb2.append(k0Var.getHost());
        } else {
            sb2.append(j0.f(k0Var));
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String b(k0 k0Var) {
        p013kotlin.jvm.internal.s.k(k0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        j0.e(sb2, k0Var.f(), k0Var.c());
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
