package gk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h1 {
    public static final q0 a(Throwable th2, String countryCode) {
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        p013kotlin.jvm.internal.s.j(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElement = (StackTraceElement) p013kotlin.collections.n.l0(stackTrace);
        e eVar = e.f69034b;
        String strValueOf = String.valueOf(stackTraceElement != null ? Integer.valueOf(stackTraceElement.getLineNumber()) : null);
        String message = th2.getMessage();
        if (message == null) {
            message = th2.toString();
        }
        return new q0(new v1(eVar, new x(new k1("Internal Error", "non fatal", strValueOf, message, stackTraceElement != null ? stackTraceElement.getMethodName() : null, p013kotlin.text.t.I0(jn0.g.b(th2), 200, (char) 0, 2, null), stackTraceElement != null ? Integer.valueOf(stackTraceElement.getLineNumber()) : null, (String) null, 128), (h0) null, (s0) null, 14)), new p(countryCode, null));
    }
}
