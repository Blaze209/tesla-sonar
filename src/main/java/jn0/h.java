package jn0;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import p013kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "b", "(Ljava/lang/Throwable;)Ljava/lang/String;", "exception", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
public class h {
    public static void a(Throwable th2, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        p013kotlin.jvm.internal.s.k(exception, "exception");
        if (th2 != exception) {
            pn0.b.f103476a.a(th2, exception);
        }
    }

    public static String b(Throwable th2) {
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }
}
